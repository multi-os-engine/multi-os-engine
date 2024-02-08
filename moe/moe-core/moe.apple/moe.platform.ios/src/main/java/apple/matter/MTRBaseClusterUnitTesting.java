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
 * Cluster Unit Testing
 * 
 * The Test Cluster is meant to validate the generated code
 * 
 * API-Since: 16.4
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRBaseClusterUnitTesting extends MTRCluster {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRBaseClusterUnitTesting(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRBaseClusterUnitTesting alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRBaseClusterUnitTesting allocWithZone(VoidPtr zone);

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
    public native MTRBaseClusterUnitTesting init();

    /**
     * For all instance methods (reads, writes, commands) that take a completion,
     * the completion will be called on the provided queue.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("initWithDevice:endpointID:queue:")
    public native MTRBaseClusterUnitTesting initWithDeviceEndpointIDQueue(@NotNull MTRBaseDevice device,
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
    public static native MTRBaseClusterUnitTesting new_objc();

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
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeBitmap16WithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeBitmap16WithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeBitmap16WithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeBitmap16WithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeBitmap16WithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeBitmap16WithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeBitmap16WithCompletion:")
    public native void readAttributeBitmap16WithCompletion(
            @ObjCBlock(name = "call_readAttributeBitmap16WithCompletion") @NotNull Block_readAttributeBitmap16WithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeBitmap16WithCompletion {
        @Generated
        void call_readAttributeBitmap16WithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeBitmap32WithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeBitmap32WithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeBitmap32WithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeBitmap32WithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeBitmap32WithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeBitmap32WithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeBitmap32WithCompletion:")
    public native void readAttributeBitmap32WithCompletion(
            @ObjCBlock(name = "call_readAttributeBitmap32WithCompletion") @NotNull Block_readAttributeBitmap32WithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeBitmap32WithCompletion {
        @Generated
        void call_readAttributeBitmap32WithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeBitmap64WithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeBitmap64WithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeBitmap64WithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeBitmap64WithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeBitmap64WithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeBitmap64WithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeBitmap64WithCompletion:")
    public native void readAttributeBitmap64WithCompletion(
            @ObjCBlock(name = "call_readAttributeBitmap64WithCompletion") @NotNull Block_readAttributeBitmap64WithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeBitmap64WithCompletion {
        @Generated
        void call_readAttributeBitmap64WithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeBitmap8WithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeBitmap8WithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeBitmap8WithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeBitmap8WithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeBitmap8WithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeBitmap8WithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeBitmap8WithCompletion:")
    public native void readAttributeBitmap8WithCompletion(
            @ObjCBlock(name = "call_readAttributeBitmap8WithCompletion") @NotNull Block_readAttributeBitmap8WithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeBitmap8WithCompletion {
        @Generated
        void call_readAttributeBitmap8WithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeBooleanWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeBooleanWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeBooleanWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeBooleanWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeBooleanWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeBooleanWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeBooleanWithCompletion:")
    public native void readAttributeBooleanWithCompletion(
            @ObjCBlock(name = "call_readAttributeBooleanWithCompletion") @NotNull Block_readAttributeBooleanWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeBooleanWithCompletion {
        @Generated
        void call_readAttributeBooleanWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeCharStringWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeCharStringWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeCharStringWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeCharStringWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCharStringWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeCharStringWithClusterStateCacheEndpointQueueCompletion(@Nullable String value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeCharStringWithCompletion:")
    public native void readAttributeCharStringWithCompletion(
            @ObjCBlock(name = "call_readAttributeCharStringWithCompletion") @NotNull Block_readAttributeCharStringWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCharStringWithCompletion {
        @Generated
        void call_readAttributeCharStringWithCompletion(@Nullable String value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeClusterErrorBooleanWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeClusterErrorBooleanWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeClusterErrorBooleanWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeClusterErrorBooleanWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeClusterErrorBooleanWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeClusterErrorBooleanWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeClusterErrorBooleanWithCompletion:")
    public native void readAttributeClusterErrorBooleanWithCompletion(
            @ObjCBlock(name = "call_readAttributeClusterErrorBooleanWithCompletion") @NotNull Block_readAttributeClusterErrorBooleanWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeClusterErrorBooleanWithCompletion {
        @Generated
        void call_readAttributeClusterErrorBooleanWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
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
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeEnum16WithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeEnum16WithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeEnum16WithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeEnum16WithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeEnum16WithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeEnum16WithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeEnum16WithCompletion:")
    public native void readAttributeEnum16WithCompletion(
            @ObjCBlock(name = "call_readAttributeEnum16WithCompletion") @NotNull Block_readAttributeEnum16WithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeEnum16WithCompletion {
        @Generated
        void call_readAttributeEnum16WithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeEnum8WithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeEnum8WithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeEnum8WithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeEnum8WithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeEnum8WithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeEnum8WithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeEnum8WithCompletion:")
    public native void readAttributeEnum8WithCompletion(
            @ObjCBlock(name = "call_readAttributeEnum8WithCompletion") @NotNull Block_readAttributeEnum8WithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeEnum8WithCompletion {
        @Generated
        void call_readAttributeEnum8WithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeEnumAttrWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeEnumAttrWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeEnumAttrWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeEnumAttrWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeEnumAttrWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeEnumAttrWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeEnumAttrWithCompletion:")
    public native void readAttributeEnumAttrWithCompletion(
            @ObjCBlock(name = "call_readAttributeEnumAttrWithCompletion") @NotNull Block_readAttributeEnumAttrWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeEnumAttrWithCompletion {
        @Generated
        void call_readAttributeEnumAttrWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeEpochSWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeEpochSWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeEpochSWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeEpochSWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeEpochSWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeEpochSWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeEpochSWithCompletion:")
    public native void readAttributeEpochSWithCompletion(
            @ObjCBlock(name = "call_readAttributeEpochSWithCompletion") @NotNull Block_readAttributeEpochSWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeEpochSWithCompletion {
        @Generated
        void call_readAttributeEpochSWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeEpochUsWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeEpochUsWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeEpochUsWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeEpochUsWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeEpochUsWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeEpochUsWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeEpochUsWithCompletion:")
    public native void readAttributeEpochUsWithCompletion(
            @ObjCBlock(name = "call_readAttributeEpochUsWithCompletion") @NotNull Block_readAttributeEpochUsWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeEpochUsWithCompletion {
        @Generated
        void call_readAttributeEpochUsWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
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
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeFloatDoubleWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeFloatDoubleWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeFloatDoubleWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeFloatDoubleWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeFloatDoubleWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeFloatDoubleWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeFloatDoubleWithCompletion:")
    public native void readAttributeFloatDoubleWithCompletion(
            @ObjCBlock(name = "call_readAttributeFloatDoubleWithCompletion") @NotNull Block_readAttributeFloatDoubleWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeFloatDoubleWithCompletion {
        @Generated
        void call_readAttributeFloatDoubleWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeFloatSingleWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeFloatSingleWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeFloatSingleWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeFloatSingleWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeFloatSingleWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeFloatSingleWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeFloatSingleWithCompletion:")
    public native void readAttributeFloatSingleWithCompletion(
            @ObjCBlock(name = "call_readAttributeFloatSingleWithCompletion") @NotNull Block_readAttributeFloatSingleWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeFloatSingleWithCompletion {
        @Generated
        void call_readAttributeFloatSingleWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeGeneralErrorBooleanWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeGeneralErrorBooleanWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeGeneralErrorBooleanWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeGeneralErrorBooleanWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeGeneralErrorBooleanWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeGeneralErrorBooleanWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeGeneralErrorBooleanWithCompletion:")
    public native void readAttributeGeneralErrorBooleanWithCompletion(
            @ObjCBlock(name = "call_readAttributeGeneralErrorBooleanWithCompletion") @NotNull Block_readAttributeGeneralErrorBooleanWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeGeneralErrorBooleanWithCompletion {
        @Generated
        void call_readAttributeGeneralErrorBooleanWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
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
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeInt16sWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeInt16sWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeInt16sWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeInt16sWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInt16sWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeInt16sWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeInt16sWithCompletion:")
    public native void readAttributeInt16sWithCompletion(
            @ObjCBlock(name = "call_readAttributeInt16sWithCompletion") @NotNull Block_readAttributeInt16sWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInt16sWithCompletion {
        @Generated
        void call_readAttributeInt16sWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeInt16uWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeInt16uWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeInt16uWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeInt16uWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInt16uWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeInt16uWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeInt16uWithCompletion:")
    public native void readAttributeInt16uWithCompletion(
            @ObjCBlock(name = "call_readAttributeInt16uWithCompletion") @NotNull Block_readAttributeInt16uWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInt16uWithCompletion {
        @Generated
        void call_readAttributeInt16uWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeInt24sWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeInt24sWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeInt24sWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeInt24sWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInt24sWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeInt24sWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeInt24sWithCompletion:")
    public native void readAttributeInt24sWithCompletion(
            @ObjCBlock(name = "call_readAttributeInt24sWithCompletion") @NotNull Block_readAttributeInt24sWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInt24sWithCompletion {
        @Generated
        void call_readAttributeInt24sWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeInt24uWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeInt24uWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeInt24uWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeInt24uWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInt24uWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeInt24uWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeInt24uWithCompletion:")
    public native void readAttributeInt24uWithCompletion(
            @ObjCBlock(name = "call_readAttributeInt24uWithCompletion") @NotNull Block_readAttributeInt24uWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInt24uWithCompletion {
        @Generated
        void call_readAttributeInt24uWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeInt32sWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeInt32sWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeInt32sWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeInt32sWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInt32sWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeInt32sWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeInt32sWithCompletion:")
    public native void readAttributeInt32sWithCompletion(
            @ObjCBlock(name = "call_readAttributeInt32sWithCompletion") @NotNull Block_readAttributeInt32sWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInt32sWithCompletion {
        @Generated
        void call_readAttributeInt32sWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeInt32uWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeInt32uWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeInt32uWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeInt32uWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInt32uWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeInt32uWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeInt32uWithCompletion:")
    public native void readAttributeInt32uWithCompletion(
            @ObjCBlock(name = "call_readAttributeInt32uWithCompletion") @NotNull Block_readAttributeInt32uWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInt32uWithCompletion {
        @Generated
        void call_readAttributeInt32uWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeInt40sWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeInt40sWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeInt40sWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeInt40sWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInt40sWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeInt40sWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeInt40sWithCompletion:")
    public native void readAttributeInt40sWithCompletion(
            @ObjCBlock(name = "call_readAttributeInt40sWithCompletion") @NotNull Block_readAttributeInt40sWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInt40sWithCompletion {
        @Generated
        void call_readAttributeInt40sWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeInt40uWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeInt40uWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeInt40uWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeInt40uWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInt40uWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeInt40uWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeInt40uWithCompletion:")
    public native void readAttributeInt40uWithCompletion(
            @ObjCBlock(name = "call_readAttributeInt40uWithCompletion") @NotNull Block_readAttributeInt40uWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInt40uWithCompletion {
        @Generated
        void call_readAttributeInt40uWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeInt48sWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeInt48sWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeInt48sWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeInt48sWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInt48sWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeInt48sWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeInt48sWithCompletion:")
    public native void readAttributeInt48sWithCompletion(
            @ObjCBlock(name = "call_readAttributeInt48sWithCompletion") @NotNull Block_readAttributeInt48sWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInt48sWithCompletion {
        @Generated
        void call_readAttributeInt48sWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeInt48uWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeInt48uWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeInt48uWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeInt48uWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInt48uWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeInt48uWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeInt48uWithCompletion:")
    public native void readAttributeInt48uWithCompletion(
            @ObjCBlock(name = "call_readAttributeInt48uWithCompletion") @NotNull Block_readAttributeInt48uWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInt48uWithCompletion {
        @Generated
        void call_readAttributeInt48uWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeInt56sWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeInt56sWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeInt56sWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeInt56sWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInt56sWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeInt56sWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeInt56sWithCompletion:")
    public native void readAttributeInt56sWithCompletion(
            @ObjCBlock(name = "call_readAttributeInt56sWithCompletion") @NotNull Block_readAttributeInt56sWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInt56sWithCompletion {
        @Generated
        void call_readAttributeInt56sWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeInt56uWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeInt56uWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeInt56uWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeInt56uWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInt56uWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeInt56uWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeInt56uWithCompletion:")
    public native void readAttributeInt56uWithCompletion(
            @ObjCBlock(name = "call_readAttributeInt56uWithCompletion") @NotNull Block_readAttributeInt56uWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInt56uWithCompletion {
        @Generated
        void call_readAttributeInt56uWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeInt64sWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeInt64sWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeInt64sWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeInt64sWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInt64sWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeInt64sWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeInt64sWithCompletion:")
    public native void readAttributeInt64sWithCompletion(
            @ObjCBlock(name = "call_readAttributeInt64sWithCompletion") @NotNull Block_readAttributeInt64sWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInt64sWithCompletion {
        @Generated
        void call_readAttributeInt64sWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeInt64uWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeInt64uWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeInt64uWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeInt64uWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInt64uWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeInt64uWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeInt64uWithCompletion:")
    public native void readAttributeInt64uWithCompletion(
            @ObjCBlock(name = "call_readAttributeInt64uWithCompletion") @NotNull Block_readAttributeInt64uWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInt64uWithCompletion {
        @Generated
        void call_readAttributeInt64uWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeInt8sWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeInt8sWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeInt8sWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeInt8sWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInt8sWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeInt8sWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeInt8sWithCompletion:")
    public native void readAttributeInt8sWithCompletion(
            @ObjCBlock(name = "call_readAttributeInt8sWithCompletion") @NotNull Block_readAttributeInt8sWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInt8sWithCompletion {
        @Generated
        void call_readAttributeInt8sWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeInt8uWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeInt8uWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeInt8uWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeInt8uWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInt8uWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeInt8uWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeInt8uWithCompletion:")
    public native void readAttributeInt8uWithCompletion(
            @ObjCBlock(name = "call_readAttributeInt8uWithCompletion") @NotNull Block_readAttributeInt8uWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInt8uWithCompletion {
        @Generated
        void call_readAttributeInt8uWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeListFabricScopedWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeListFabricScopedWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeListFabricScopedWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeListFabricScopedWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeListFabricScopedWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeListFabricScopedWithClusterStateCacheEndpointQueueCompletion(@Nullable NSArray<?> value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeListFabricScopedWithParams:completion:")
    public native void readAttributeListFabricScopedWithParamsCompletion(@Nullable MTRReadParams params,
            @ObjCBlock(name = "call_readAttributeListFabricScopedWithParamsCompletion") @NotNull Block_readAttributeListFabricScopedWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeListFabricScopedWithParamsCompletion {
        @Generated
        void call_readAttributeListFabricScopedWithParamsCompletion(@Nullable NSArray<?> value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeListInt8uWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeListInt8uWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeListInt8uWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeListInt8uWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeListInt8uWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeListInt8uWithClusterStateCacheEndpointQueueCompletion(@Nullable NSArray<?> value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeListInt8uWithCompletion:")
    public native void readAttributeListInt8uWithCompletion(
            @ObjCBlock(name = "call_readAttributeListInt8uWithCompletion") @NotNull Block_readAttributeListInt8uWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeListInt8uWithCompletion {
        @Generated
        void call_readAttributeListInt8uWithCompletion(@Nullable NSArray<?> value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeListLongOctetStringWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeListLongOctetStringWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeListLongOctetStringWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeListLongOctetStringWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeListLongOctetStringWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeListLongOctetStringWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSArray<?> value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeListLongOctetStringWithCompletion:")
    public native void readAttributeListLongOctetStringWithCompletion(
            @ObjCBlock(name = "call_readAttributeListLongOctetStringWithCompletion") @NotNull Block_readAttributeListLongOctetStringWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeListLongOctetStringWithCompletion {
        @Generated
        void call_readAttributeListLongOctetStringWithCompletion(@Nullable NSArray<?> value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeListNullablesAndOptionalsStructWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeListNullablesAndOptionalsStructWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeListNullablesAndOptionalsStructWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeListNullablesAndOptionalsStructWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeListNullablesAndOptionalsStructWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeListNullablesAndOptionalsStructWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSArray<?> value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeListNullablesAndOptionalsStructWithCompletion:")
    public native void readAttributeListNullablesAndOptionalsStructWithCompletion(
            @ObjCBlock(name = "call_readAttributeListNullablesAndOptionalsStructWithCompletion") @NotNull Block_readAttributeListNullablesAndOptionalsStructWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeListNullablesAndOptionalsStructWithCompletion {
        @Generated
        void call_readAttributeListNullablesAndOptionalsStructWithCompletion(@Nullable NSArray<?> value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeListOctetStringWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeListOctetStringWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeListOctetStringWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeListOctetStringWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeListOctetStringWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeListOctetStringWithClusterStateCacheEndpointQueueCompletion(@Nullable NSArray<?> value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeListOctetStringWithCompletion:")
    public native void readAttributeListOctetStringWithCompletion(
            @ObjCBlock(name = "call_readAttributeListOctetStringWithCompletion") @NotNull Block_readAttributeListOctetStringWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeListOctetStringWithCompletion {
        @Generated
        void call_readAttributeListOctetStringWithCompletion(@Nullable NSArray<?> value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeListStructOctetStringWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeListStructOctetStringWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeListStructOctetStringWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeListStructOctetStringWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeListStructOctetStringWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeListStructOctetStringWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSArray<?> value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeListStructOctetStringWithCompletion:")
    public native void readAttributeListStructOctetStringWithCompletion(
            @ObjCBlock(name = "call_readAttributeListStructOctetStringWithCompletion") @NotNull Block_readAttributeListStructOctetStringWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeListStructOctetStringWithCompletion {
        @Generated
        void call_readAttributeListStructOctetStringWithCompletion(@Nullable NSArray<?> value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeLongCharStringWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeLongCharStringWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeLongCharStringWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeLongCharStringWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLongCharStringWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeLongCharStringWithClusterStateCacheEndpointQueueCompletion(@Nullable String value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeLongCharStringWithCompletion:")
    public native void readAttributeLongCharStringWithCompletion(
            @ObjCBlock(name = "call_readAttributeLongCharStringWithCompletion") @NotNull Block_readAttributeLongCharStringWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLongCharStringWithCompletion {
        @Generated
        void call_readAttributeLongCharStringWithCompletion(@Nullable String value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeLongOctetStringWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeLongOctetStringWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeLongOctetStringWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeLongOctetStringWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLongOctetStringWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeLongOctetStringWithClusterStateCacheEndpointQueueCompletion(@Nullable NSData value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeLongOctetStringWithCompletion:")
    public native void readAttributeLongOctetStringWithCompletion(
            @ObjCBlock(name = "call_readAttributeLongOctetStringWithCompletion") @NotNull Block_readAttributeLongOctetStringWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLongOctetStringWithCompletion {
        @Generated
        void call_readAttributeLongOctetStringWithCompletion(@Nullable NSData value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableBitmap16WithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableBitmap16WithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableBitmap16WithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeNullableBitmap16WithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableBitmap16WithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeNullableBitmap16WithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableBitmap16WithCompletion:")
    public native void readAttributeNullableBitmap16WithCompletion(
            @ObjCBlock(name = "call_readAttributeNullableBitmap16WithCompletion") @NotNull Block_readAttributeNullableBitmap16WithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableBitmap16WithCompletion {
        @Generated
        void call_readAttributeNullableBitmap16WithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableBitmap32WithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableBitmap32WithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableBitmap32WithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeNullableBitmap32WithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableBitmap32WithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeNullableBitmap32WithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableBitmap32WithCompletion:")
    public native void readAttributeNullableBitmap32WithCompletion(
            @ObjCBlock(name = "call_readAttributeNullableBitmap32WithCompletion") @NotNull Block_readAttributeNullableBitmap32WithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableBitmap32WithCompletion {
        @Generated
        void call_readAttributeNullableBitmap32WithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableBitmap64WithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableBitmap64WithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableBitmap64WithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeNullableBitmap64WithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableBitmap64WithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeNullableBitmap64WithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableBitmap64WithCompletion:")
    public native void readAttributeNullableBitmap64WithCompletion(
            @ObjCBlock(name = "call_readAttributeNullableBitmap64WithCompletion") @NotNull Block_readAttributeNullableBitmap64WithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableBitmap64WithCompletion {
        @Generated
        void call_readAttributeNullableBitmap64WithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableBitmap8WithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableBitmap8WithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableBitmap8WithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeNullableBitmap8WithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableBitmap8WithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeNullableBitmap8WithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableBitmap8WithCompletion:")
    public native void readAttributeNullableBitmap8WithCompletion(
            @ObjCBlock(name = "call_readAttributeNullableBitmap8WithCompletion") @NotNull Block_readAttributeNullableBitmap8WithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableBitmap8WithCompletion {
        @Generated
        void call_readAttributeNullableBitmap8WithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableBooleanWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableBooleanWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableBooleanWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeNullableBooleanWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableBooleanWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeNullableBooleanWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableBooleanWithCompletion:")
    public native void readAttributeNullableBooleanWithCompletion(
            @ObjCBlock(name = "call_readAttributeNullableBooleanWithCompletion") @NotNull Block_readAttributeNullableBooleanWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableBooleanWithCompletion {
        @Generated
        void call_readAttributeNullableBooleanWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableCharStringWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableCharStringWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableCharStringWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeNullableCharStringWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableCharStringWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeNullableCharStringWithClusterStateCacheEndpointQueueCompletion(@Nullable String value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableCharStringWithCompletion:")
    public native void readAttributeNullableCharStringWithCompletion(
            @ObjCBlock(name = "call_readAttributeNullableCharStringWithCompletion") @NotNull Block_readAttributeNullableCharStringWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableCharStringWithCompletion {
        @Generated
        void call_readAttributeNullableCharStringWithCompletion(@Nullable String value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableEnum16WithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableEnum16WithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableEnum16WithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeNullableEnum16WithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableEnum16WithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeNullableEnum16WithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableEnum16WithCompletion:")
    public native void readAttributeNullableEnum16WithCompletion(
            @ObjCBlock(name = "call_readAttributeNullableEnum16WithCompletion") @NotNull Block_readAttributeNullableEnum16WithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableEnum16WithCompletion {
        @Generated
        void call_readAttributeNullableEnum16WithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableEnum8WithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableEnum8WithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableEnum8WithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeNullableEnum8WithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableEnum8WithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeNullableEnum8WithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableEnum8WithCompletion:")
    public native void readAttributeNullableEnum8WithCompletion(
            @ObjCBlock(name = "call_readAttributeNullableEnum8WithCompletion") @NotNull Block_readAttributeNullableEnum8WithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableEnum8WithCompletion {
        @Generated
        void call_readAttributeNullableEnum8WithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableEnumAttrWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableEnumAttrWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableEnumAttrWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeNullableEnumAttrWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableEnumAttrWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeNullableEnumAttrWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableEnumAttrWithCompletion:")
    public native void readAttributeNullableEnumAttrWithCompletion(
            @ObjCBlock(name = "call_readAttributeNullableEnumAttrWithCompletion") @NotNull Block_readAttributeNullableEnumAttrWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableEnumAttrWithCompletion {
        @Generated
        void call_readAttributeNullableEnumAttrWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableFloatDoubleWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableFloatDoubleWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableFloatDoubleWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeNullableFloatDoubleWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableFloatDoubleWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeNullableFloatDoubleWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableFloatDoubleWithCompletion:")
    public native void readAttributeNullableFloatDoubleWithCompletion(
            @ObjCBlock(name = "call_readAttributeNullableFloatDoubleWithCompletion") @NotNull Block_readAttributeNullableFloatDoubleWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableFloatDoubleWithCompletion {
        @Generated
        void call_readAttributeNullableFloatDoubleWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableFloatSingleWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableFloatSingleWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableFloatSingleWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeNullableFloatSingleWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableFloatSingleWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeNullableFloatSingleWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableFloatSingleWithCompletion:")
    public native void readAttributeNullableFloatSingleWithCompletion(
            @ObjCBlock(name = "call_readAttributeNullableFloatSingleWithCompletion") @NotNull Block_readAttributeNullableFloatSingleWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableFloatSingleWithCompletion {
        @Generated
        void call_readAttributeNullableFloatSingleWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableInt16sWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableInt16sWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableInt16sWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeNullableInt16sWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableInt16sWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeNullableInt16sWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableInt16sWithCompletion:")
    public native void readAttributeNullableInt16sWithCompletion(
            @ObjCBlock(name = "call_readAttributeNullableInt16sWithCompletion") @NotNull Block_readAttributeNullableInt16sWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableInt16sWithCompletion {
        @Generated
        void call_readAttributeNullableInt16sWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableInt16uWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableInt16uWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableInt16uWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeNullableInt16uWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableInt16uWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeNullableInt16uWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableInt16uWithCompletion:")
    public native void readAttributeNullableInt16uWithCompletion(
            @ObjCBlock(name = "call_readAttributeNullableInt16uWithCompletion") @NotNull Block_readAttributeNullableInt16uWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableInt16uWithCompletion {
        @Generated
        void call_readAttributeNullableInt16uWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableInt24sWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableInt24sWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableInt24sWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeNullableInt24sWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableInt24sWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeNullableInt24sWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableInt24sWithCompletion:")
    public native void readAttributeNullableInt24sWithCompletion(
            @ObjCBlock(name = "call_readAttributeNullableInt24sWithCompletion") @NotNull Block_readAttributeNullableInt24sWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableInt24sWithCompletion {
        @Generated
        void call_readAttributeNullableInt24sWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableInt24uWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableInt24uWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableInt24uWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeNullableInt24uWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableInt24uWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeNullableInt24uWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableInt24uWithCompletion:")
    public native void readAttributeNullableInt24uWithCompletion(
            @ObjCBlock(name = "call_readAttributeNullableInt24uWithCompletion") @NotNull Block_readAttributeNullableInt24uWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableInt24uWithCompletion {
        @Generated
        void call_readAttributeNullableInt24uWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableInt32sWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableInt32sWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableInt32sWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeNullableInt32sWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableInt32sWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeNullableInt32sWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableInt32sWithCompletion:")
    public native void readAttributeNullableInt32sWithCompletion(
            @ObjCBlock(name = "call_readAttributeNullableInt32sWithCompletion") @NotNull Block_readAttributeNullableInt32sWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableInt32sWithCompletion {
        @Generated
        void call_readAttributeNullableInt32sWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableInt32uWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableInt32uWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableInt32uWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeNullableInt32uWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableInt32uWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeNullableInt32uWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableInt32uWithCompletion:")
    public native void readAttributeNullableInt32uWithCompletion(
            @ObjCBlock(name = "call_readAttributeNullableInt32uWithCompletion") @NotNull Block_readAttributeNullableInt32uWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableInt32uWithCompletion {
        @Generated
        void call_readAttributeNullableInt32uWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableInt40sWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableInt40sWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableInt40sWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeNullableInt40sWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableInt40sWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeNullableInt40sWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableInt40sWithCompletion:")
    public native void readAttributeNullableInt40sWithCompletion(
            @ObjCBlock(name = "call_readAttributeNullableInt40sWithCompletion") @NotNull Block_readAttributeNullableInt40sWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableInt40sWithCompletion {
        @Generated
        void call_readAttributeNullableInt40sWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableInt40uWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableInt40uWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableInt40uWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeNullableInt40uWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableInt40uWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeNullableInt40uWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableInt40uWithCompletion:")
    public native void readAttributeNullableInt40uWithCompletion(
            @ObjCBlock(name = "call_readAttributeNullableInt40uWithCompletion") @NotNull Block_readAttributeNullableInt40uWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableInt40uWithCompletion {
        @Generated
        void call_readAttributeNullableInt40uWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableInt48sWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableInt48sWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableInt48sWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeNullableInt48sWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableInt48sWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeNullableInt48sWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableInt48sWithCompletion:")
    public native void readAttributeNullableInt48sWithCompletion(
            @ObjCBlock(name = "call_readAttributeNullableInt48sWithCompletion") @NotNull Block_readAttributeNullableInt48sWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableInt48sWithCompletion {
        @Generated
        void call_readAttributeNullableInt48sWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableInt48uWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableInt48uWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableInt48uWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeNullableInt48uWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableInt48uWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeNullableInt48uWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableInt48uWithCompletion:")
    public native void readAttributeNullableInt48uWithCompletion(
            @ObjCBlock(name = "call_readAttributeNullableInt48uWithCompletion") @NotNull Block_readAttributeNullableInt48uWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableInt48uWithCompletion {
        @Generated
        void call_readAttributeNullableInt48uWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableInt56sWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableInt56sWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableInt56sWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeNullableInt56sWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableInt56sWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeNullableInt56sWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableInt56sWithCompletion:")
    public native void readAttributeNullableInt56sWithCompletion(
            @ObjCBlock(name = "call_readAttributeNullableInt56sWithCompletion") @NotNull Block_readAttributeNullableInt56sWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableInt56sWithCompletion {
        @Generated
        void call_readAttributeNullableInt56sWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableInt56uWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableInt56uWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableInt56uWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeNullableInt56uWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableInt56uWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeNullableInt56uWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableInt56uWithCompletion:")
    public native void readAttributeNullableInt56uWithCompletion(
            @ObjCBlock(name = "call_readAttributeNullableInt56uWithCompletion") @NotNull Block_readAttributeNullableInt56uWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableInt56uWithCompletion {
        @Generated
        void call_readAttributeNullableInt56uWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableInt64sWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableInt64sWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableInt64sWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeNullableInt64sWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableInt64sWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeNullableInt64sWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableInt64sWithCompletion:")
    public native void readAttributeNullableInt64sWithCompletion(
            @ObjCBlock(name = "call_readAttributeNullableInt64sWithCompletion") @NotNull Block_readAttributeNullableInt64sWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableInt64sWithCompletion {
        @Generated
        void call_readAttributeNullableInt64sWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableInt64uWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableInt64uWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableInt64uWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeNullableInt64uWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableInt64uWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeNullableInt64uWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableInt64uWithCompletion:")
    public native void readAttributeNullableInt64uWithCompletion(
            @ObjCBlock(name = "call_readAttributeNullableInt64uWithCompletion") @NotNull Block_readAttributeNullableInt64uWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableInt64uWithCompletion {
        @Generated
        void call_readAttributeNullableInt64uWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableInt8sWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableInt8sWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableInt8sWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeNullableInt8sWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableInt8sWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeNullableInt8sWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableInt8sWithCompletion:")
    public native void readAttributeNullableInt8sWithCompletion(
            @ObjCBlock(name = "call_readAttributeNullableInt8sWithCompletion") @NotNull Block_readAttributeNullableInt8sWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableInt8sWithCompletion {
        @Generated
        void call_readAttributeNullableInt8sWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableInt8uWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableInt8uWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableInt8uWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeNullableInt8uWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableInt8uWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeNullableInt8uWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableInt8uWithCompletion:")
    public native void readAttributeNullableInt8uWithCompletion(
            @ObjCBlock(name = "call_readAttributeNullableInt8uWithCompletion") @NotNull Block_readAttributeNullableInt8uWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableInt8uWithCompletion {
        @Generated
        void call_readAttributeNullableInt8uWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableOctetStringWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableOctetStringWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableOctetStringWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeNullableOctetStringWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableOctetStringWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeNullableOctetStringWithClusterStateCacheEndpointQueueCompletion(@Nullable NSData value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableOctetStringWithCompletion:")
    public native void readAttributeNullableOctetStringWithCompletion(
            @ObjCBlock(name = "call_readAttributeNullableOctetStringWithCompletion") @NotNull Block_readAttributeNullableOctetStringWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableOctetStringWithCompletion {
        @Generated
        void call_readAttributeNullableOctetStringWithCompletion(@Nullable NSData value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableRangeRestrictedInt16sWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableRangeRestrictedInt16sWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableRangeRestrictedInt16sWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeNullableRangeRestrictedInt16sWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableRangeRestrictedInt16sWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeNullableRangeRestrictedInt16sWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableRangeRestrictedInt16sWithCompletion:")
    public native void readAttributeNullableRangeRestrictedInt16sWithCompletion(
            @ObjCBlock(name = "call_readAttributeNullableRangeRestrictedInt16sWithCompletion") @NotNull Block_readAttributeNullableRangeRestrictedInt16sWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableRangeRestrictedInt16sWithCompletion {
        @Generated
        void call_readAttributeNullableRangeRestrictedInt16sWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableRangeRestrictedInt16uWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableRangeRestrictedInt16uWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableRangeRestrictedInt16uWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeNullableRangeRestrictedInt16uWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableRangeRestrictedInt16uWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeNullableRangeRestrictedInt16uWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableRangeRestrictedInt16uWithCompletion:")
    public native void readAttributeNullableRangeRestrictedInt16uWithCompletion(
            @ObjCBlock(name = "call_readAttributeNullableRangeRestrictedInt16uWithCompletion") @NotNull Block_readAttributeNullableRangeRestrictedInt16uWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableRangeRestrictedInt16uWithCompletion {
        @Generated
        void call_readAttributeNullableRangeRestrictedInt16uWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableRangeRestrictedInt8sWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableRangeRestrictedInt8sWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableRangeRestrictedInt8sWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeNullableRangeRestrictedInt8sWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableRangeRestrictedInt8sWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeNullableRangeRestrictedInt8sWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableRangeRestrictedInt8sWithCompletion:")
    public native void readAttributeNullableRangeRestrictedInt8sWithCompletion(
            @ObjCBlock(name = "call_readAttributeNullableRangeRestrictedInt8sWithCompletion") @NotNull Block_readAttributeNullableRangeRestrictedInt8sWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableRangeRestrictedInt8sWithCompletion {
        @Generated
        void call_readAttributeNullableRangeRestrictedInt8sWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableRangeRestrictedInt8uWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableRangeRestrictedInt8uWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableRangeRestrictedInt8uWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeNullableRangeRestrictedInt8uWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableRangeRestrictedInt8uWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeNullableRangeRestrictedInt8uWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableRangeRestrictedInt8uWithCompletion:")
    public native void readAttributeNullableRangeRestrictedInt8uWithCompletion(
            @ObjCBlock(name = "call_readAttributeNullableRangeRestrictedInt8uWithCompletion") @NotNull Block_readAttributeNullableRangeRestrictedInt8uWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableRangeRestrictedInt8uWithCompletion {
        @Generated
        void call_readAttributeNullableRangeRestrictedInt8uWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableStructWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableStructWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableStructWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeNullableStructWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableStructWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeNullableStructWithClusterStateCacheEndpointQueueCompletion(
                @Nullable MTRUnitTestingClusterSimpleStruct value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNullableStructWithCompletion:")
    public native void readAttributeNullableStructWithCompletion(
            @ObjCBlock(name = "call_readAttributeNullableStructWithCompletion") @NotNull Block_readAttributeNullableStructWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableStructWithCompletion {
        @Generated
        void call_readAttributeNullableStructWithCompletion(@Nullable MTRUnitTestingClusterSimpleStruct value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeOctetStringWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeOctetStringWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeOctetStringWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeOctetStringWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOctetStringWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeOctetStringWithClusterStateCacheEndpointQueueCompletion(@Nullable NSData value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeOctetStringWithCompletion:")
    public native void readAttributeOctetStringWithCompletion(
            @ObjCBlock(name = "call_readAttributeOctetStringWithCompletion") @NotNull Block_readAttributeOctetStringWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOctetStringWithCompletion {
        @Generated
        void call_readAttributeOctetStringWithCompletion(@Nullable NSData value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRangeRestrictedInt16sWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRangeRestrictedInt16sWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRangeRestrictedInt16sWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeRangeRestrictedInt16sWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRangeRestrictedInt16sWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeRangeRestrictedInt16sWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRangeRestrictedInt16sWithCompletion:")
    public native void readAttributeRangeRestrictedInt16sWithCompletion(
            @ObjCBlock(name = "call_readAttributeRangeRestrictedInt16sWithCompletion") @NotNull Block_readAttributeRangeRestrictedInt16sWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRangeRestrictedInt16sWithCompletion {
        @Generated
        void call_readAttributeRangeRestrictedInt16sWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRangeRestrictedInt16uWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRangeRestrictedInt16uWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRangeRestrictedInt16uWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeRangeRestrictedInt16uWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRangeRestrictedInt16uWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeRangeRestrictedInt16uWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRangeRestrictedInt16uWithCompletion:")
    public native void readAttributeRangeRestrictedInt16uWithCompletion(
            @ObjCBlock(name = "call_readAttributeRangeRestrictedInt16uWithCompletion") @NotNull Block_readAttributeRangeRestrictedInt16uWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRangeRestrictedInt16uWithCompletion {
        @Generated
        void call_readAttributeRangeRestrictedInt16uWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRangeRestrictedInt8sWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRangeRestrictedInt8sWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRangeRestrictedInt8sWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeRangeRestrictedInt8sWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRangeRestrictedInt8sWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeRangeRestrictedInt8sWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRangeRestrictedInt8sWithCompletion:")
    public native void readAttributeRangeRestrictedInt8sWithCompletion(
            @ObjCBlock(name = "call_readAttributeRangeRestrictedInt8sWithCompletion") @NotNull Block_readAttributeRangeRestrictedInt8sWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRangeRestrictedInt8sWithCompletion {
        @Generated
        void call_readAttributeRangeRestrictedInt8sWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRangeRestrictedInt8uWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRangeRestrictedInt8uWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRangeRestrictedInt8uWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeRangeRestrictedInt8uWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRangeRestrictedInt8uWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeRangeRestrictedInt8uWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRangeRestrictedInt8uWithCompletion:")
    public native void readAttributeRangeRestrictedInt8uWithCompletion(
            @ObjCBlock(name = "call_readAttributeRangeRestrictedInt8uWithCompletion") @NotNull Block_readAttributeRangeRestrictedInt8uWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRangeRestrictedInt8uWithCompletion {
        @Generated
        void call_readAttributeRangeRestrictedInt8uWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeStructAttrWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeStructAttrWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeStructAttrWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeStructAttrWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeStructAttrWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeStructAttrWithClusterStateCacheEndpointQueueCompletion(
                @Nullable MTRUnitTestingClusterSimpleStruct value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeStructAttrWithCompletion:")
    public native void readAttributeStructAttrWithCompletion(
            @ObjCBlock(name = "call_readAttributeStructAttrWithCompletion") @NotNull Block_readAttributeStructAttrWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeStructAttrWithCompletion {
        @Generated
        void call_readAttributeStructAttrWithCompletion(@Nullable MTRUnitTestingClusterSimpleStruct value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeTimedWriteBooleanWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeTimedWriteBooleanWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeTimedWriteBooleanWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeTimedWriteBooleanWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTimedWriteBooleanWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeTimedWriteBooleanWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeTimedWriteBooleanWithCompletion:")
    public native void readAttributeTimedWriteBooleanWithCompletion(
            @ObjCBlock(name = "call_readAttributeTimedWriteBooleanWithCompletion") @NotNull Block_readAttributeTimedWriteBooleanWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTimedWriteBooleanWithCompletion {
        @Generated
        void call_readAttributeTimedWriteBooleanWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeUnsupportedWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeUnsupportedWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeUnsupportedWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeUnsupportedWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeUnsupportedWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeUnsupportedWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeUnsupportedWithCompletion:")
    public native void readAttributeUnsupportedWithCompletion(
            @ObjCBlock(name = "call_readAttributeUnsupportedWithCompletion") @NotNull Block_readAttributeUnsupportedWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeUnsupportedWithCompletion {
        @Generated
        void call_readAttributeUnsupportedWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeVendorIdWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeVendorIdWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeVendorIdWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeVendorIdWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeVendorIdWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeVendorIdWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeVendorIdWithCompletion:")
    public native void readAttributeVendorIdWithCompletion(
            @ObjCBlock(name = "call_readAttributeVendorIdWithCompletion") @NotNull Block_readAttributeVendorIdWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeVendorIdWithCompletion {
        @Generated
        void call_readAttributeVendorIdWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeWriteOnlyInt8uWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeWriteOnlyInt8uWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeWriteOnlyInt8uWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeWriteOnlyInt8uWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeWriteOnlyInt8uWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeWriteOnlyInt8uWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeWriteOnlyInt8uWithCompletion:")
    public native void readAttributeWriteOnlyInt8uWithCompletion(
            @ObjCBlock(name = "call_readAttributeWriteOnlyInt8uWithCompletion") @NotNull Block_readAttributeWriteOnlyInt8uWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeWriteOnlyInt8uWithCompletion {
        @Generated
        void call_readAttributeWriteOnlyInt8uWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
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
     * * Command SimpleStructEchoRequest
     * *
     * * Command that takes an argument which is a struct. The response echoes
     * the struct back.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("simpleStructEchoRequestWithParams:completion:")
    public native void simpleStructEchoRequestWithParamsCompletion(
            @NotNull MTRUnitTestingClusterSimpleStructEchoRequestParams params,
            @ObjCBlock(name = "call_simpleStructEchoRequestWithParamsCompletion") @NotNull Block_simpleStructEchoRequestWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_simpleStructEchoRequestWithParamsCompletion {
        @Generated
        void call_simpleStructEchoRequestWithParamsCompletion(
                @Nullable MTRUnitTestingClusterSimpleStructResponseParams data, @Nullable NSError error);
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
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeBitmap16WithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeBitmap16WithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeBitmap16WithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeBitmap16WithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeBitmap16WithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeBitmap16WithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeBitmap16WithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeBitmap16WithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeBitmap16WithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeBitmap16WithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeBitmap32WithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeBitmap32WithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeBitmap32WithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeBitmap32WithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeBitmap32WithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeBitmap32WithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeBitmap32WithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeBitmap32WithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeBitmap32WithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeBitmap32WithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeBitmap64WithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeBitmap64WithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeBitmap64WithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeBitmap64WithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeBitmap64WithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeBitmap64WithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeBitmap64WithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeBitmap64WithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeBitmap64WithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeBitmap64WithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeBitmap8WithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeBitmap8WithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeBitmap8WithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeBitmap8WithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeBitmap8WithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeBitmap8WithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeBitmap8WithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeBitmap8WithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeBitmap8WithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeBitmap8WithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeBooleanWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeBooleanWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeBooleanWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeBooleanWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeBooleanWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeBooleanWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeBooleanWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeBooleanWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeBooleanWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeBooleanWithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeCharStringWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeCharStringWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeCharStringWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeCharStringWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeCharStringWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeCharStringWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeCharStringWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeCharStringWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeCharStringWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeCharStringWithParamsSubscriptionEstablishedReportHandler_2(@Nullable String value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeClusterErrorBooleanWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeClusterErrorBooleanWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeClusterErrorBooleanWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeClusterErrorBooleanWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeClusterErrorBooleanWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeClusterErrorBooleanWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeClusterErrorBooleanWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeClusterErrorBooleanWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeClusterErrorBooleanWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeClusterErrorBooleanWithParamsSubscriptionEstablishedReportHandler_2(
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
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeEnum16WithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeEnum16WithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeEnum16WithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeEnum16WithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeEnum16WithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeEnum16WithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeEnum16WithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeEnum16WithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeEnum16WithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeEnum16WithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeEnum8WithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeEnum8WithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeEnum8WithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeEnum8WithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeEnum8WithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeEnum8WithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeEnum8WithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeEnum8WithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeEnum8WithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeEnum8WithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeEnumAttrWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeEnumAttrWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeEnumAttrWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeEnumAttrWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeEnumAttrWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeEnumAttrWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeEnumAttrWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeEnumAttrWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeEnumAttrWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeEnumAttrWithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeEpochSWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeEpochSWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeEpochSWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeEpochSWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeEpochSWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeEpochSWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeEpochSWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeEpochSWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeEpochSWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeEpochSWithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeEpochUsWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeEpochUsWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeEpochUsWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeEpochUsWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeEpochUsWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeEpochUsWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeEpochUsWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeEpochUsWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeEpochUsWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeEpochUsWithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
                @Nullable NSError error);
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
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeFloatDoubleWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeFloatDoubleWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeFloatDoubleWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeFloatDoubleWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeFloatDoubleWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeFloatDoubleWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeFloatDoubleWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeFloatDoubleWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeFloatDoubleWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeFloatDoubleWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeFloatSingleWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeFloatSingleWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeFloatSingleWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeFloatSingleWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeFloatSingleWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeFloatSingleWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeFloatSingleWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeFloatSingleWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeFloatSingleWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeFloatSingleWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeGeneralErrorBooleanWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeGeneralErrorBooleanWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeGeneralErrorBooleanWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeGeneralErrorBooleanWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeGeneralErrorBooleanWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeGeneralErrorBooleanWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeGeneralErrorBooleanWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeGeneralErrorBooleanWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeGeneralErrorBooleanWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeGeneralErrorBooleanWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
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
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeInt16sWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInt16sWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeInt16sWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeInt16sWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeInt16sWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeInt16sWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInt16sWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeInt16sWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInt16sWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeInt16sWithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeInt16uWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInt16uWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeInt16uWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeInt16uWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeInt16uWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeInt16uWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInt16uWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeInt16uWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInt16uWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeInt16uWithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeInt24sWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInt24sWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeInt24sWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeInt24sWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeInt24sWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeInt24sWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInt24sWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeInt24sWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInt24sWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeInt24sWithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeInt24uWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInt24uWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeInt24uWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeInt24uWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeInt24uWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeInt24uWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInt24uWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeInt24uWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInt24uWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeInt24uWithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeInt32sWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInt32sWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeInt32sWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeInt32sWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeInt32sWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeInt32sWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInt32sWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeInt32sWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInt32sWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeInt32sWithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeInt32uWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInt32uWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeInt32uWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeInt32uWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeInt32uWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeInt32uWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInt32uWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeInt32uWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInt32uWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeInt32uWithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeInt40sWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInt40sWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeInt40sWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeInt40sWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeInt40sWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeInt40sWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInt40sWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeInt40sWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInt40sWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeInt40sWithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeInt40uWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInt40uWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeInt40uWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeInt40uWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeInt40uWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeInt40uWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInt40uWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeInt40uWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInt40uWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeInt40uWithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeInt48sWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInt48sWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeInt48sWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeInt48sWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeInt48sWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeInt48sWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInt48sWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeInt48sWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInt48sWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeInt48sWithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeInt48uWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInt48uWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeInt48uWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeInt48uWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeInt48uWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeInt48uWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInt48uWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeInt48uWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInt48uWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeInt48uWithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeInt56sWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInt56sWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeInt56sWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeInt56sWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeInt56sWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeInt56sWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInt56sWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeInt56sWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInt56sWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeInt56sWithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeInt56uWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInt56uWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeInt56uWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeInt56uWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeInt56uWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeInt56uWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInt56uWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeInt56uWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInt56uWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeInt56uWithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeInt64sWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInt64sWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeInt64sWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeInt64sWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeInt64sWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeInt64sWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInt64sWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeInt64sWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInt64sWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeInt64sWithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeInt64uWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInt64uWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeInt64uWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeInt64uWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeInt64uWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeInt64uWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInt64uWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeInt64uWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInt64uWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeInt64uWithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeInt8sWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInt8sWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeInt8sWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeInt8sWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeInt8sWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeInt8sWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInt8sWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeInt8sWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInt8sWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeInt8sWithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeInt8uWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInt8uWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeInt8uWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeInt8uWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeInt8uWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeInt8uWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInt8uWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeInt8uWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInt8uWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeInt8uWithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeListFabricScopedWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeListFabricScopedWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeListFabricScopedWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeListFabricScopedWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeListFabricScopedWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeListFabricScopedWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeListFabricScopedWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeListFabricScopedWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeListFabricScopedWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeListFabricScopedWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSArray<?> value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeListInt8uWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeListInt8uWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeListInt8uWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeListInt8uWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeListInt8uWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeListInt8uWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeListInt8uWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeListInt8uWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeListInt8uWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeListInt8uWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSArray<?> value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeListLongOctetStringWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeListLongOctetStringWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeListLongOctetStringWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeListLongOctetStringWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeListLongOctetStringWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeListLongOctetStringWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeListLongOctetStringWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeListLongOctetStringWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeListLongOctetStringWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeListLongOctetStringWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSArray<?> value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeListNullablesAndOptionalsStructWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeListNullablesAndOptionalsStructWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeListNullablesAndOptionalsStructWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeListNullablesAndOptionalsStructWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeListNullablesAndOptionalsStructWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeListNullablesAndOptionalsStructWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeListNullablesAndOptionalsStructWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeListNullablesAndOptionalsStructWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeListNullablesAndOptionalsStructWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeListNullablesAndOptionalsStructWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSArray<?> value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeListOctetStringWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeListOctetStringWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeListOctetStringWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeListOctetStringWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeListOctetStringWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeListOctetStringWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeListOctetStringWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeListOctetStringWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeListOctetStringWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeListOctetStringWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSArray<?> value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeListStructOctetStringWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeListStructOctetStringWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeListStructOctetStringWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeListStructOctetStringWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeListStructOctetStringWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeListStructOctetStringWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeListStructOctetStringWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeListStructOctetStringWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeListStructOctetStringWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeListStructOctetStringWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSArray<?> value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeLongCharStringWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeLongCharStringWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeLongCharStringWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeLongCharStringWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeLongCharStringWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeLongCharStringWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLongCharStringWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeLongCharStringWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLongCharStringWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeLongCharStringWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable String value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeLongOctetStringWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeLongOctetStringWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeLongOctetStringWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeLongOctetStringWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeLongOctetStringWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeLongOctetStringWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLongOctetStringWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeLongOctetStringWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLongOctetStringWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeLongOctetStringWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSData value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeNullableBitmap16WithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableBitmap16WithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNullableBitmap16WithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeNullableBitmap16WithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeNullableBitmap16WithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeNullableBitmap16WithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableBitmap16WithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeNullableBitmap16WithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableBitmap16WithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeNullableBitmap16WithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeNullableBitmap32WithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableBitmap32WithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNullableBitmap32WithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeNullableBitmap32WithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeNullableBitmap32WithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeNullableBitmap32WithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableBitmap32WithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeNullableBitmap32WithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableBitmap32WithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeNullableBitmap32WithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeNullableBitmap64WithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableBitmap64WithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNullableBitmap64WithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeNullableBitmap64WithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeNullableBitmap64WithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeNullableBitmap64WithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableBitmap64WithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeNullableBitmap64WithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableBitmap64WithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeNullableBitmap64WithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeNullableBitmap8WithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableBitmap8WithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNullableBitmap8WithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeNullableBitmap8WithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeNullableBitmap8WithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeNullableBitmap8WithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableBitmap8WithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeNullableBitmap8WithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableBitmap8WithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeNullableBitmap8WithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeNullableBooleanWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableBooleanWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNullableBooleanWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeNullableBooleanWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeNullableBooleanWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeNullableBooleanWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableBooleanWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeNullableBooleanWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableBooleanWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeNullableBooleanWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeNullableCharStringWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableCharStringWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNullableCharStringWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeNullableCharStringWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeNullableCharStringWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeNullableCharStringWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableCharStringWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeNullableCharStringWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableCharStringWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeNullableCharStringWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable String value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeNullableEnum16WithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableEnum16WithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNullableEnum16WithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeNullableEnum16WithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeNullableEnum16WithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeNullableEnum16WithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableEnum16WithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeNullableEnum16WithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableEnum16WithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeNullableEnum16WithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeNullableEnum8WithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableEnum8WithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNullableEnum8WithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeNullableEnum8WithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeNullableEnum8WithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeNullableEnum8WithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableEnum8WithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeNullableEnum8WithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableEnum8WithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeNullableEnum8WithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeNullableEnumAttrWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableEnumAttrWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNullableEnumAttrWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeNullableEnumAttrWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeNullableEnumAttrWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeNullableEnumAttrWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableEnumAttrWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeNullableEnumAttrWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableEnumAttrWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeNullableEnumAttrWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeNullableFloatDoubleWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableFloatDoubleWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNullableFloatDoubleWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeNullableFloatDoubleWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeNullableFloatDoubleWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeNullableFloatDoubleWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableFloatDoubleWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeNullableFloatDoubleWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableFloatDoubleWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeNullableFloatDoubleWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeNullableFloatSingleWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableFloatSingleWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNullableFloatSingleWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeNullableFloatSingleWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeNullableFloatSingleWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeNullableFloatSingleWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableFloatSingleWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeNullableFloatSingleWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableFloatSingleWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeNullableFloatSingleWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeNullableInt16sWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableInt16sWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNullableInt16sWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeNullableInt16sWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeNullableInt16sWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeNullableInt16sWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableInt16sWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeNullableInt16sWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableInt16sWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeNullableInt16sWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeNullableInt16uWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableInt16uWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNullableInt16uWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeNullableInt16uWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeNullableInt16uWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeNullableInt16uWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableInt16uWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeNullableInt16uWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableInt16uWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeNullableInt16uWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeNullableInt24sWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableInt24sWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNullableInt24sWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeNullableInt24sWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeNullableInt24sWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeNullableInt24sWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableInt24sWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeNullableInt24sWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableInt24sWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeNullableInt24sWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeNullableInt24uWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableInt24uWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNullableInt24uWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeNullableInt24uWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeNullableInt24uWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeNullableInt24uWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableInt24uWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeNullableInt24uWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableInt24uWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeNullableInt24uWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeNullableInt32sWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableInt32sWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNullableInt32sWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeNullableInt32sWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeNullableInt32sWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeNullableInt32sWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableInt32sWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeNullableInt32sWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableInt32sWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeNullableInt32sWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeNullableInt32uWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableInt32uWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNullableInt32uWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeNullableInt32uWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeNullableInt32uWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeNullableInt32uWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableInt32uWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeNullableInt32uWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableInt32uWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeNullableInt32uWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeNullableInt40sWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableInt40sWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNullableInt40sWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeNullableInt40sWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeNullableInt40sWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeNullableInt40sWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableInt40sWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeNullableInt40sWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableInt40sWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeNullableInt40sWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeNullableInt40uWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableInt40uWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNullableInt40uWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeNullableInt40uWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeNullableInt40uWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeNullableInt40uWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableInt40uWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeNullableInt40uWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableInt40uWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeNullableInt40uWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeNullableInt48sWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableInt48sWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNullableInt48sWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeNullableInt48sWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeNullableInt48sWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeNullableInt48sWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableInt48sWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeNullableInt48sWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableInt48sWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeNullableInt48sWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeNullableInt48uWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableInt48uWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNullableInt48uWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeNullableInt48uWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeNullableInt48uWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeNullableInt48uWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableInt48uWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeNullableInt48uWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableInt48uWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeNullableInt48uWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeNullableInt56sWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableInt56sWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNullableInt56sWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeNullableInt56sWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeNullableInt56sWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeNullableInt56sWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableInt56sWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeNullableInt56sWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableInt56sWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeNullableInt56sWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeNullableInt56uWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableInt56uWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNullableInt56uWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeNullableInt56uWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeNullableInt56uWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeNullableInt56uWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableInt56uWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeNullableInt56uWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableInt56uWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeNullableInt56uWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeNullableInt64sWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableInt64sWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNullableInt64sWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeNullableInt64sWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeNullableInt64sWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeNullableInt64sWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableInt64sWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeNullableInt64sWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableInt64sWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeNullableInt64sWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeNullableInt64uWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableInt64uWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNullableInt64uWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeNullableInt64uWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeNullableInt64uWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeNullableInt64uWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableInt64uWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeNullableInt64uWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableInt64uWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeNullableInt64uWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeNullableInt8sWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableInt8sWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNullableInt8sWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeNullableInt8sWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeNullableInt8sWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeNullableInt8sWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableInt8sWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeNullableInt8sWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableInt8sWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeNullableInt8sWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeNullableInt8uWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableInt8uWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNullableInt8uWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeNullableInt8uWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeNullableInt8uWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeNullableInt8uWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableInt8uWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeNullableInt8uWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableInt8uWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeNullableInt8uWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeNullableOctetStringWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableOctetStringWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNullableOctetStringWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeNullableOctetStringWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeNullableOctetStringWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeNullableOctetStringWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableOctetStringWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeNullableOctetStringWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableOctetStringWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeNullableOctetStringWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSData value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeNullableRangeRestrictedInt16sWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableRangeRestrictedInt16sWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNullableRangeRestrictedInt16sWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeNullableRangeRestrictedInt16sWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeNullableRangeRestrictedInt16sWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeNullableRangeRestrictedInt16sWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableRangeRestrictedInt16sWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeNullableRangeRestrictedInt16sWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableRangeRestrictedInt16sWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeNullableRangeRestrictedInt16sWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeNullableRangeRestrictedInt16uWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableRangeRestrictedInt16uWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNullableRangeRestrictedInt16uWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeNullableRangeRestrictedInt16uWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeNullableRangeRestrictedInt16uWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeNullableRangeRestrictedInt16uWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableRangeRestrictedInt16uWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeNullableRangeRestrictedInt16uWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableRangeRestrictedInt16uWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeNullableRangeRestrictedInt16uWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeNullableRangeRestrictedInt8sWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableRangeRestrictedInt8sWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNullableRangeRestrictedInt8sWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeNullableRangeRestrictedInt8sWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeNullableRangeRestrictedInt8sWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeNullableRangeRestrictedInt8sWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableRangeRestrictedInt8sWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeNullableRangeRestrictedInt8sWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableRangeRestrictedInt8sWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeNullableRangeRestrictedInt8sWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeNullableRangeRestrictedInt8uWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableRangeRestrictedInt8uWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNullableRangeRestrictedInt8uWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeNullableRangeRestrictedInt8uWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeNullableRangeRestrictedInt8uWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeNullableRangeRestrictedInt8uWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableRangeRestrictedInt8uWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeNullableRangeRestrictedInt8uWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableRangeRestrictedInt8uWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeNullableRangeRestrictedInt8uWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeNullableStructWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableStructWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNullableStructWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeNullableStructWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeNullableStructWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeNullableStructWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableStructWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeNullableStructWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableStructWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeNullableStructWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable MTRUnitTestingClusterSimpleStruct value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeOctetStringWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeOctetStringWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeOctetStringWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeOctetStringWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeOctetStringWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeOctetStringWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeOctetStringWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeOctetStringWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeOctetStringWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeOctetStringWithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSData value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeRangeRestrictedInt16sWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRangeRestrictedInt16sWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRangeRestrictedInt16sWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeRangeRestrictedInt16sWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeRangeRestrictedInt16sWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeRangeRestrictedInt16sWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRangeRestrictedInt16sWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeRangeRestrictedInt16sWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRangeRestrictedInt16sWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeRangeRestrictedInt16sWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeRangeRestrictedInt16uWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRangeRestrictedInt16uWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRangeRestrictedInt16uWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeRangeRestrictedInt16uWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeRangeRestrictedInt16uWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeRangeRestrictedInt16uWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRangeRestrictedInt16uWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeRangeRestrictedInt16uWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRangeRestrictedInt16uWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeRangeRestrictedInt16uWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeRangeRestrictedInt8sWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRangeRestrictedInt8sWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRangeRestrictedInt8sWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeRangeRestrictedInt8sWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeRangeRestrictedInt8sWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeRangeRestrictedInt8sWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRangeRestrictedInt8sWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeRangeRestrictedInt8sWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRangeRestrictedInt8sWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeRangeRestrictedInt8sWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeRangeRestrictedInt8uWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRangeRestrictedInt8uWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRangeRestrictedInt8uWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeRangeRestrictedInt8uWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeRangeRestrictedInt8uWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeRangeRestrictedInt8uWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRangeRestrictedInt8uWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeRangeRestrictedInt8uWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRangeRestrictedInt8uWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeRangeRestrictedInt8uWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeStructAttrWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeStructAttrWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeStructAttrWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeStructAttrWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeStructAttrWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeStructAttrWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeStructAttrWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeStructAttrWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeStructAttrWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeStructAttrWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable MTRUnitTestingClusterSimpleStruct value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeTimedWriteBooleanWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTimedWriteBooleanWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeTimedWriteBooleanWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeTimedWriteBooleanWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeTimedWriteBooleanWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeTimedWriteBooleanWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTimedWriteBooleanWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeTimedWriteBooleanWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTimedWriteBooleanWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeTimedWriteBooleanWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeUnsupportedWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeUnsupportedWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeUnsupportedWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeUnsupportedWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeUnsupportedWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeUnsupportedWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeUnsupportedWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeUnsupportedWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeUnsupportedWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeUnsupportedWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeVendorIdWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeVendorIdWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeVendorIdWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeVendorIdWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeVendorIdWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeVendorIdWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeVendorIdWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeVendorIdWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeVendorIdWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeVendorIdWithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeWriteOnlyInt8uWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeWriteOnlyInt8uWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeWriteOnlyInt8uWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeWriteOnlyInt8uWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeWriteOnlyInt8uWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeWriteOnlyInt8uWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeWriteOnlyInt8uWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeWriteOnlyInt8uWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeWriteOnlyInt8uWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeWriteOnlyInt8uWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Command TestAddArguments
     * 
     * Command that takes two arguments and returns their sum.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("testAddArgumentsWithParams:completion:")
    public native void testAddArgumentsWithParamsCompletion(@NotNull MTRUnitTestingClusterTestAddArgumentsParams params,
            @ObjCBlock(name = "call_testAddArgumentsWithParamsCompletion") @NotNull Block_testAddArgumentsWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testAddArgumentsWithParamsCompletion {
        @Generated
        void call_testAddArgumentsWithParamsCompletion(
                @Nullable MTRUnitTestingClusterTestAddArgumentsResponseParams data, @Nullable NSError error);
    }

    /**
     * * Command TestComplexNullableOptionalRequest
     * *
     * * Command that takes various arguments which can be nullable and/or optional. The
     * response returns information about which things were received and what
     * their state was.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("testComplexNullableOptionalRequestWithParams:completion:")
    public native void testComplexNullableOptionalRequestWithParamsCompletion(
            @NotNull MTRUnitTestingClusterTestComplexNullableOptionalRequestParams params,
            @ObjCBlock(name = "call_testComplexNullableOptionalRequestWithParamsCompletion") @NotNull Block_testComplexNullableOptionalRequestWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testComplexNullableOptionalRequestWithParamsCompletion {
        @Generated
        void call_testComplexNullableOptionalRequestWithParamsCompletion(
                @Nullable MTRUnitTestingClusterTestComplexNullableOptionalResponseParams data, @Nullable NSError error);
    }

    /**
     * Command TestEmitTestEventRequest
     * 
     * Command that takes identical arguments to the fields of the TestEvent and logs the TestEvent to the buffer.
     * Command returns an event ID as the response.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("testEmitTestEventRequestWithParams:completion:")
    public native void testEmitTestEventRequestWithParamsCompletion(
            @NotNull MTRUnitTestingClusterTestEmitTestEventRequestParams params,
            @ObjCBlock(name = "call_testEmitTestEventRequestWithParamsCompletion") @NotNull Block_testEmitTestEventRequestWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testEmitTestEventRequestWithParamsCompletion {
        @Generated
        void call_testEmitTestEventRequestWithParamsCompletion(
                @Nullable MTRUnitTestingClusterTestEmitTestEventResponseParams data, @Nullable NSError error);
    }

    /**
     * Command TestEmitTestFabricScopedEventRequest
     * 
     * Command that takes identical arguments to the fields of the TestFabricScopedEvent and logs the
     * TestFabricScopedEvent to the buffer. Command returns an event ID as the response.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("testEmitTestFabricScopedEventRequestWithParams:completion:")
    public native void testEmitTestFabricScopedEventRequestWithParamsCompletion(
            @NotNull MTRUnitTestingClusterTestEmitTestFabricScopedEventRequestParams params,
            @ObjCBlock(name = "call_testEmitTestFabricScopedEventRequestWithParamsCompletion") @NotNull Block_testEmitTestFabricScopedEventRequestWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testEmitTestFabricScopedEventRequestWithParamsCompletion {
        @Generated
        void call_testEmitTestFabricScopedEventRequestWithParamsCompletion(
                @Nullable MTRUnitTestingClusterTestEmitTestFabricScopedEventResponseParams data,
                @Nullable NSError error);
    }

    /**
     * * Command TestEnumsRequest
     * *
     * * Command that sends a vendor id and an enum. The server is expected to
     * echo them back.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("testEnumsRequestWithParams:completion:")
    public native void testEnumsRequestWithParamsCompletion(@NotNull MTRUnitTestingClusterTestEnumsRequestParams params,
            @ObjCBlock(name = "call_testEnumsRequestWithParamsCompletion") @NotNull Block_testEnumsRequestWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testEnumsRequestWithParamsCompletion {
        @Generated
        void call_testEnumsRequestWithParamsCompletion(@Nullable MTRUnitTestingClusterTestEnumsResponseParams data,
                @Nullable NSError error);
    }

    /**
     * * Command TestListInt8UArgumentRequest
     * *
     * * Command that takes an argument which is a list of INT8U. The response
     * returns false if the list contains a 0 in it, true otherwise (including
     * if the list is empty).
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("testListInt8UArgumentRequestWithParams:completion:")
    public native void testListInt8UArgumentRequestWithParamsCompletion(
            @NotNull MTRUnitTestingClusterTestListInt8UArgumentRequestParams params,
            @ObjCBlock(name = "call_testListInt8UArgumentRequestWithParamsCompletion") @NotNull Block_testListInt8UArgumentRequestWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testListInt8UArgumentRequestWithParamsCompletion {
        @Generated
        void call_testListInt8UArgumentRequestWithParamsCompletion(
                @Nullable MTRUnitTestingClusterBooleanResponseParams data, @Nullable NSError error);
    }

    /**
     * * Command TestListInt8UReverseRequest
     * *
     * * Command that takes an argument which is a list of INT8U and expects a
     * response that reverses the list.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("testListInt8UReverseRequestWithParams:completion:")
    public native void testListInt8UReverseRequestWithParamsCompletion(
            @NotNull MTRUnitTestingClusterTestListInt8UReverseRequestParams params,
            @ObjCBlock(name = "call_testListInt8UReverseRequestWithParamsCompletion") @NotNull Block_testListInt8UReverseRequestWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testListInt8UReverseRequestWithParamsCompletion {
        @Generated
        void call_testListInt8UReverseRequestWithParamsCompletion(
                @Nullable MTRUnitTestingClusterTestListInt8UReverseResponseParams data, @Nullable NSError error);
    }

    /**
     * * Command TestListNestedStructListArgumentRequest
     * *
     * * Command that takes an argument which is a list of Nested Struct List.
     * The response returns false if there is some struct in arg1 (either
     * directly in as the 'c' field of an entry 'd' list of an entry) whose 'b'
     * field is false, and true otherwise (including if the list is empty).
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("testListNestedStructListArgumentRequestWithParams:completion:")
    public native void testListNestedStructListArgumentRequestWithParamsCompletion(
            @NotNull MTRUnitTestingClusterTestListNestedStructListArgumentRequestParams params,
            @ObjCBlock(name = "call_testListNestedStructListArgumentRequestWithParamsCompletion") @NotNull Block_testListNestedStructListArgumentRequestWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testListNestedStructListArgumentRequestWithParamsCompletion {
        @Generated
        void call_testListNestedStructListArgumentRequestWithParamsCompletion(
                @Nullable MTRUnitTestingClusterBooleanResponseParams data, @Nullable NSError error);
    }

    /**
     * * Command TestListStructArgumentRequest
     * *
     * * Command that takes an argument which is a list of structs. The response
     * returns false if there is some struct in the list whose 'b' field is
     * false, and true otherwise (including if the list is empty).
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("testListStructArgumentRequestWithParams:completion:")
    public native void testListStructArgumentRequestWithParamsCompletion(
            @NotNull MTRUnitTestingClusterTestListStructArgumentRequestParams params,
            @ObjCBlock(name = "call_testListStructArgumentRequestWithParamsCompletion") @NotNull Block_testListStructArgumentRequestWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testListStructArgumentRequestWithParamsCompletion {
        @Generated
        void call_testListStructArgumentRequestWithParamsCompletion(
                @Nullable MTRUnitTestingClusterBooleanResponseParams data, @Nullable NSError error);
    }

    /**
     * * Command TestNestedStructArgumentRequest
     * *
     * * Command that takes an argument which is nested struct. The response
     * echoes the 'b' field of ar1.c.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("testNestedStructArgumentRequestWithParams:completion:")
    public native void testNestedStructArgumentRequestWithParamsCompletion(
            @NotNull MTRUnitTestingClusterTestNestedStructArgumentRequestParams params,
            @ObjCBlock(name = "call_testNestedStructArgumentRequestWithParamsCompletion") @NotNull Block_testNestedStructArgumentRequestWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testNestedStructArgumentRequestWithParamsCompletion {
        @Generated
        void call_testNestedStructArgumentRequestWithParamsCompletion(
                @Nullable MTRUnitTestingClusterBooleanResponseParams data, @Nullable NSError error);
    }

    /**
     * * Command TestNestedStructListArgumentRequest
     * *
     * * Command that takes an argument which is a Nested Struct List. The
     * response returns false if there is some struct in arg1 (either directly
     * in arg1.c or in the arg1.d list) whose 'b' field is false, and true
     * otherwise.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("testNestedStructListArgumentRequestWithParams:completion:")
    public native void testNestedStructListArgumentRequestWithParamsCompletion(
            @NotNull MTRUnitTestingClusterTestNestedStructListArgumentRequestParams params,
            @ObjCBlock(name = "call_testNestedStructListArgumentRequestWithParamsCompletion") @NotNull Block_testNestedStructListArgumentRequestWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testNestedStructListArgumentRequestWithParamsCompletion {
        @Generated
        void call_testNestedStructListArgumentRequestWithParamsCompletion(
                @Nullable MTRUnitTestingClusterBooleanResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("testNotHandledWithCompletion:")
    public native void testNotHandledWithCompletion(
            @ObjCBlock(name = "call_testNotHandledWithCompletion") @NotNull Block_testNotHandledWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testNotHandledWithCompletion {
        @Generated
        void call_testNotHandledWithCompletion(@Nullable NSError error);
    }

    /**
     * Command TestNotHandled
     * 
     * Simple command without any parameters and without a specific response not handled by the server
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("testNotHandledWithParams:completion:")
    public native void testNotHandledWithParamsCompletion(@Nullable MTRUnitTestingClusterTestNotHandledParams params,
            @ObjCBlock(name = "call_testNotHandledWithParamsCompletion") @NotNull Block_testNotHandledWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testNotHandledWithParamsCompletion {
        @Generated
        void call_testNotHandledWithParamsCompletion(@Nullable NSError error);
    }

    /**
     * * Command TestNullableOptionalRequest
     * *
     * * Command that takes an argument which is nullable and optional. The
     * response returns a boolean indicating whether the argument was present,
     * if that's true a boolean indicating whether the argument was null, and
     * if that' false the argument it received.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("testNullableOptionalRequestWithParams:completion:")
    public native void testNullableOptionalRequestWithParamsCompletion(
            @Nullable MTRUnitTestingClusterTestNullableOptionalRequestParams params,
            @ObjCBlock(name = "call_testNullableOptionalRequestWithParamsCompletion") @NotNull Block_testNullableOptionalRequestWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testNullableOptionalRequestWithParamsCompletion {
        @Generated
        void call_testNullableOptionalRequestWithParamsCompletion(
                @Nullable MTRUnitTestingClusterTestNullableOptionalResponseParams data, @Nullable NSError error);
    }

    /**
     * Command TestSimpleArgumentRequest
     * 
     * Command that takes an argument which is bool
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("testSimpleArgumentRequestWithParams:completion:")
    public native void testSimpleArgumentRequestWithParamsCompletion(
            @NotNull MTRUnitTestingClusterTestSimpleArgumentRequestParams params,
            @ObjCBlock(name = "call_testSimpleArgumentRequestWithParamsCompletion") @NotNull Block_testSimpleArgumentRequestWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testSimpleArgumentRequestWithParamsCompletion {
        @Generated
        void call_testSimpleArgumentRequestWithParamsCompletion(
                @Nullable MTRUnitTestingClusterTestSimpleArgumentResponseParams data, @Nullable NSError error);
    }

    /**
     * Command TestSimpleOptionalArgumentRequest
     * 
     * Command that takes an optional argument which is bool. It responds with a success value if the optional is set to
     * any value.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("testSimpleOptionalArgumentRequestWithParams:completion:")
    public native void testSimpleOptionalArgumentRequestWithParamsCompletion(
            @Nullable MTRUnitTestingClusterTestSimpleOptionalArgumentRequestParams params,
            @ObjCBlock(name = "call_testSimpleOptionalArgumentRequestWithParamsCompletion") @NotNull Block_testSimpleOptionalArgumentRequestWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testSimpleOptionalArgumentRequestWithParamsCompletion {
        @Generated
        void call_testSimpleOptionalArgumentRequestWithParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("testSpecificWithCompletion:")
    public native void testSpecificWithCompletion(
            @ObjCBlock(name = "call_testSpecificWithCompletion") @NotNull Block_testSpecificWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testSpecificWithCompletion {
        @Generated
        void call_testSpecificWithCompletion(@Nullable MTRUnitTestingClusterTestSpecificResponseParams data,
                @Nullable NSError error);
    }

    /**
     * Command TestSpecific
     * 
     * Simple command without any parameters and with a specific response
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("testSpecificWithParams:completion:")
    public native void testSpecificWithParamsCompletion(@Nullable MTRUnitTestingClusterTestSpecificParams params,
            @ObjCBlock(name = "call_testSpecificWithParamsCompletion") @NotNull Block_testSpecificWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testSpecificWithParamsCompletion {
        @Generated
        void call_testSpecificWithParamsCompletion(@Nullable MTRUnitTestingClusterTestSpecificResponseParams data,
                @Nullable NSError error);
    }

    /**
     * * Command TestStructArgumentRequest
     * *
     * * Command that takes an argument which is struct. The response echoes the
     * 'b' field of the single arg.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("testStructArgumentRequestWithParams:completion:")
    public native void testStructArgumentRequestWithParamsCompletion(
            @NotNull MTRUnitTestingClusterTestStructArgumentRequestParams params,
            @ObjCBlock(name = "call_testStructArgumentRequestWithParamsCompletion") @NotNull Block_testStructArgumentRequestWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testStructArgumentRequestWithParamsCompletion {
        @Generated
        void call_testStructArgumentRequestWithParamsCompletion(
                @Nullable MTRUnitTestingClusterBooleanResponseParams data, @Nullable NSError error);
    }

    /**
     * Command TestStructArrayArgumentRequest
     * 
     * Command that takes various arguments that are arrays, including an array of structs which have a list member.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("testStructArrayArgumentRequestWithParams:completion:")
    public native void testStructArrayArgumentRequestWithParamsCompletion(
            @NotNull MTRUnitTestingClusterTestStructArrayArgumentRequestParams params,
            @ObjCBlock(name = "call_testStructArrayArgumentRequestWithParamsCompletion") @NotNull Block_testStructArrayArgumentRequestWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testStructArrayArgumentRequestWithParamsCompletion {
        @Generated
        void call_testStructArrayArgumentRequestWithParamsCompletion(
                @Nullable MTRUnitTestingClusterTestStructArrayArgumentResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("testUnknownCommandWithCompletion:")
    public native void testUnknownCommandWithCompletion(
            @ObjCBlock(name = "call_testUnknownCommandWithCompletion") @NotNull Block_testUnknownCommandWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testUnknownCommandWithCompletion {
        @Generated
        void call_testUnknownCommandWithCompletion(@Nullable NSError error);
    }

    /**
     * Command TestUnknownCommand
     * 
     * Simple command that should not be added to the server.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("testUnknownCommandWithParams:completion:")
    public native void testUnknownCommandWithParamsCompletion(
            @Nullable MTRUnitTestingClusterTestUnknownCommandParams params,
            @ObjCBlock(name = "call_testUnknownCommandWithParamsCompletion") @NotNull Block_testUnknownCommandWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testUnknownCommandWithParamsCompletion {
        @Generated
        void call_testUnknownCommandWithParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("testWithCompletion:")
    public native void testWithCompletion(
            @ObjCBlock(name = "call_testWithCompletion") @NotNull Block_testWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testWithCompletion {
        @Generated
        void call_testWithCompletion(@Nullable NSError error);
    }

    /**
     * Command Test
     * 
     * Simple command without any parameters and without a specific response
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("testWithParams:completion:")
    public native void testWithParamsCompletion(@Nullable MTRUnitTestingClusterTestParams params,
            @ObjCBlock(name = "call_testWithParamsCompletion") @NotNull Block_testWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testWithParamsCompletion {
        @Generated
        void call_testWithParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("timedInvokeRequestWithCompletion:")
    public native void timedInvokeRequestWithCompletion(
            @ObjCBlock(name = "call_timedInvokeRequestWithCompletion") @NotNull Block_timedInvokeRequestWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_timedInvokeRequestWithCompletion {
        @Generated
        void call_timedInvokeRequestWithCompletion(@Nullable NSError error);
    }

    /**
     * * Command TimedInvokeRequest
     * *
     * * Command that just responds with a success status if the timed invoke
     * conditions are met.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("timedInvokeRequestWithParams:completion:")
    public native void timedInvokeRequestWithParamsCompletion(
            @Nullable MTRUnitTestingClusterTimedInvokeRequestParams params,
            @ObjCBlock(name = "call_timedInvokeRequestWithParamsCompletion") @NotNull Block_timedInvokeRequestWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_timedInvokeRequestWithParamsCompletion {
        @Generated
        void call_timedInvokeRequestWithParamsCompletion(@Nullable NSError error);
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
    @Selector("writeAttributeBitmap16WithValue:completion:")
    public native void writeAttributeBitmap16WithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeBitmap16WithValueCompletion") @NotNull Block_writeAttributeBitmap16WithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeBitmap16WithValueCompletion {
        @Generated
        void call_writeAttributeBitmap16WithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeBitmap16WithValue:params:completion:")
    public native void writeAttributeBitmap16WithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeBitmap16WithValueParamsCompletion") @NotNull Block_writeAttributeBitmap16WithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeBitmap16WithValueParamsCompletion {
        @Generated
        void call_writeAttributeBitmap16WithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeBitmap32WithValue:completion:")
    public native void writeAttributeBitmap32WithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeBitmap32WithValueCompletion") @NotNull Block_writeAttributeBitmap32WithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeBitmap32WithValueCompletion {
        @Generated
        void call_writeAttributeBitmap32WithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeBitmap32WithValue:params:completion:")
    public native void writeAttributeBitmap32WithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeBitmap32WithValueParamsCompletion") @NotNull Block_writeAttributeBitmap32WithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeBitmap32WithValueParamsCompletion {
        @Generated
        void call_writeAttributeBitmap32WithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeBitmap64WithValue:completion:")
    public native void writeAttributeBitmap64WithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeBitmap64WithValueCompletion") @NotNull Block_writeAttributeBitmap64WithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeBitmap64WithValueCompletion {
        @Generated
        void call_writeAttributeBitmap64WithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeBitmap64WithValue:params:completion:")
    public native void writeAttributeBitmap64WithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeBitmap64WithValueParamsCompletion") @NotNull Block_writeAttributeBitmap64WithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeBitmap64WithValueParamsCompletion {
        @Generated
        void call_writeAttributeBitmap64WithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeBitmap8WithValue:completion:")
    public native void writeAttributeBitmap8WithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeBitmap8WithValueCompletion") @NotNull Block_writeAttributeBitmap8WithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeBitmap8WithValueCompletion {
        @Generated
        void call_writeAttributeBitmap8WithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeBitmap8WithValue:params:completion:")
    public native void writeAttributeBitmap8WithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeBitmap8WithValueParamsCompletion") @NotNull Block_writeAttributeBitmap8WithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeBitmap8WithValueParamsCompletion {
        @Generated
        void call_writeAttributeBitmap8WithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeBooleanWithValue:completion:")
    public native void writeAttributeBooleanWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeBooleanWithValueCompletion") @NotNull Block_writeAttributeBooleanWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeBooleanWithValueCompletion {
        @Generated
        void call_writeAttributeBooleanWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeBooleanWithValue:params:completion:")
    public native void writeAttributeBooleanWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeBooleanWithValueParamsCompletion") @NotNull Block_writeAttributeBooleanWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeBooleanWithValueParamsCompletion {
        @Generated
        void call_writeAttributeBooleanWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeCharStringWithValue:completion:")
    public native void writeAttributeCharStringWithValueCompletion(@NotNull String value,
            @ObjCBlock(name = "call_writeAttributeCharStringWithValueCompletion") @NotNull Block_writeAttributeCharStringWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeCharStringWithValueCompletion {
        @Generated
        void call_writeAttributeCharStringWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeCharStringWithValue:params:completion:")
    public native void writeAttributeCharStringWithValueParamsCompletion(@NotNull String value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeCharStringWithValueParamsCompletion") @NotNull Block_writeAttributeCharStringWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeCharStringWithValueParamsCompletion {
        @Generated
        void call_writeAttributeCharStringWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeClusterErrorBooleanWithValue:completion:")
    public native void writeAttributeClusterErrorBooleanWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeClusterErrorBooleanWithValueCompletion") @NotNull Block_writeAttributeClusterErrorBooleanWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeClusterErrorBooleanWithValueCompletion {
        @Generated
        void call_writeAttributeClusterErrorBooleanWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeClusterErrorBooleanWithValue:params:completion:")
    public native void writeAttributeClusterErrorBooleanWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeClusterErrorBooleanWithValueParamsCompletion") @NotNull Block_writeAttributeClusterErrorBooleanWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeClusterErrorBooleanWithValueParamsCompletion {
        @Generated
        void call_writeAttributeClusterErrorBooleanWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeEnum16WithValue:completion:")
    public native void writeAttributeEnum16WithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeEnum16WithValueCompletion") @NotNull Block_writeAttributeEnum16WithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeEnum16WithValueCompletion {
        @Generated
        void call_writeAttributeEnum16WithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeEnum16WithValue:params:completion:")
    public native void writeAttributeEnum16WithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeEnum16WithValueParamsCompletion") @NotNull Block_writeAttributeEnum16WithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeEnum16WithValueParamsCompletion {
        @Generated
        void call_writeAttributeEnum16WithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeEnum8WithValue:completion:")
    public native void writeAttributeEnum8WithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeEnum8WithValueCompletion") @NotNull Block_writeAttributeEnum8WithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeEnum8WithValueCompletion {
        @Generated
        void call_writeAttributeEnum8WithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeEnum8WithValue:params:completion:")
    public native void writeAttributeEnum8WithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeEnum8WithValueParamsCompletion") @NotNull Block_writeAttributeEnum8WithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeEnum8WithValueParamsCompletion {
        @Generated
        void call_writeAttributeEnum8WithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeEnumAttrWithValue:completion:")
    public native void writeAttributeEnumAttrWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeEnumAttrWithValueCompletion") @NotNull Block_writeAttributeEnumAttrWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeEnumAttrWithValueCompletion {
        @Generated
        void call_writeAttributeEnumAttrWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeEnumAttrWithValue:params:completion:")
    public native void writeAttributeEnumAttrWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeEnumAttrWithValueParamsCompletion") @NotNull Block_writeAttributeEnumAttrWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeEnumAttrWithValueParamsCompletion {
        @Generated
        void call_writeAttributeEnumAttrWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeEpochSWithValue:completion:")
    public native void writeAttributeEpochSWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeEpochSWithValueCompletion") @NotNull Block_writeAttributeEpochSWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeEpochSWithValueCompletion {
        @Generated
        void call_writeAttributeEpochSWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeEpochSWithValue:params:completion:")
    public native void writeAttributeEpochSWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeEpochSWithValueParamsCompletion") @NotNull Block_writeAttributeEpochSWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeEpochSWithValueParamsCompletion {
        @Generated
        void call_writeAttributeEpochSWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeEpochUsWithValue:completion:")
    public native void writeAttributeEpochUsWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeEpochUsWithValueCompletion") @NotNull Block_writeAttributeEpochUsWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeEpochUsWithValueCompletion {
        @Generated
        void call_writeAttributeEpochUsWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeEpochUsWithValue:params:completion:")
    public native void writeAttributeEpochUsWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeEpochUsWithValueParamsCompletion") @NotNull Block_writeAttributeEpochUsWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeEpochUsWithValueParamsCompletion {
        @Generated
        void call_writeAttributeEpochUsWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeFloatDoubleWithValue:completion:")
    public native void writeAttributeFloatDoubleWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeFloatDoubleWithValueCompletion") @NotNull Block_writeAttributeFloatDoubleWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeFloatDoubleWithValueCompletion {
        @Generated
        void call_writeAttributeFloatDoubleWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeFloatDoubleWithValue:params:completion:")
    public native void writeAttributeFloatDoubleWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeFloatDoubleWithValueParamsCompletion") @NotNull Block_writeAttributeFloatDoubleWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeFloatDoubleWithValueParamsCompletion {
        @Generated
        void call_writeAttributeFloatDoubleWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeFloatSingleWithValue:completion:")
    public native void writeAttributeFloatSingleWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeFloatSingleWithValueCompletion") @NotNull Block_writeAttributeFloatSingleWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeFloatSingleWithValueCompletion {
        @Generated
        void call_writeAttributeFloatSingleWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeFloatSingleWithValue:params:completion:")
    public native void writeAttributeFloatSingleWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeFloatSingleWithValueParamsCompletion") @NotNull Block_writeAttributeFloatSingleWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeFloatSingleWithValueParamsCompletion {
        @Generated
        void call_writeAttributeFloatSingleWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeGeneralErrorBooleanWithValue:completion:")
    public native void writeAttributeGeneralErrorBooleanWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeGeneralErrorBooleanWithValueCompletion") @NotNull Block_writeAttributeGeneralErrorBooleanWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeGeneralErrorBooleanWithValueCompletion {
        @Generated
        void call_writeAttributeGeneralErrorBooleanWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeGeneralErrorBooleanWithValue:params:completion:")
    public native void writeAttributeGeneralErrorBooleanWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeGeneralErrorBooleanWithValueParamsCompletion") @NotNull Block_writeAttributeGeneralErrorBooleanWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeGeneralErrorBooleanWithValueParamsCompletion {
        @Generated
        void call_writeAttributeGeneralErrorBooleanWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeInt16sWithValue:completion:")
    public native void writeAttributeInt16sWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeInt16sWithValueCompletion") @NotNull Block_writeAttributeInt16sWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeInt16sWithValueCompletion {
        @Generated
        void call_writeAttributeInt16sWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeInt16sWithValue:params:completion:")
    public native void writeAttributeInt16sWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeInt16sWithValueParamsCompletion") @NotNull Block_writeAttributeInt16sWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeInt16sWithValueParamsCompletion {
        @Generated
        void call_writeAttributeInt16sWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeInt16uWithValue:completion:")
    public native void writeAttributeInt16uWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeInt16uWithValueCompletion") @NotNull Block_writeAttributeInt16uWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeInt16uWithValueCompletion {
        @Generated
        void call_writeAttributeInt16uWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeInt16uWithValue:params:completion:")
    public native void writeAttributeInt16uWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeInt16uWithValueParamsCompletion") @NotNull Block_writeAttributeInt16uWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeInt16uWithValueParamsCompletion {
        @Generated
        void call_writeAttributeInt16uWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeInt24sWithValue:completion:")
    public native void writeAttributeInt24sWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeInt24sWithValueCompletion") @NotNull Block_writeAttributeInt24sWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeInt24sWithValueCompletion {
        @Generated
        void call_writeAttributeInt24sWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeInt24sWithValue:params:completion:")
    public native void writeAttributeInt24sWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeInt24sWithValueParamsCompletion") @NotNull Block_writeAttributeInt24sWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeInt24sWithValueParamsCompletion {
        @Generated
        void call_writeAttributeInt24sWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeInt24uWithValue:completion:")
    public native void writeAttributeInt24uWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeInt24uWithValueCompletion") @NotNull Block_writeAttributeInt24uWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeInt24uWithValueCompletion {
        @Generated
        void call_writeAttributeInt24uWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeInt24uWithValue:params:completion:")
    public native void writeAttributeInt24uWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeInt24uWithValueParamsCompletion") @NotNull Block_writeAttributeInt24uWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeInt24uWithValueParamsCompletion {
        @Generated
        void call_writeAttributeInt24uWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeInt32sWithValue:completion:")
    public native void writeAttributeInt32sWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeInt32sWithValueCompletion") @NotNull Block_writeAttributeInt32sWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeInt32sWithValueCompletion {
        @Generated
        void call_writeAttributeInt32sWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeInt32sWithValue:params:completion:")
    public native void writeAttributeInt32sWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeInt32sWithValueParamsCompletion") @NotNull Block_writeAttributeInt32sWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeInt32sWithValueParamsCompletion {
        @Generated
        void call_writeAttributeInt32sWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeInt32uWithValue:completion:")
    public native void writeAttributeInt32uWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeInt32uWithValueCompletion") @NotNull Block_writeAttributeInt32uWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeInt32uWithValueCompletion {
        @Generated
        void call_writeAttributeInt32uWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeInt32uWithValue:params:completion:")
    public native void writeAttributeInt32uWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeInt32uWithValueParamsCompletion") @NotNull Block_writeAttributeInt32uWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeInt32uWithValueParamsCompletion {
        @Generated
        void call_writeAttributeInt32uWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeInt40sWithValue:completion:")
    public native void writeAttributeInt40sWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeInt40sWithValueCompletion") @NotNull Block_writeAttributeInt40sWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeInt40sWithValueCompletion {
        @Generated
        void call_writeAttributeInt40sWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeInt40sWithValue:params:completion:")
    public native void writeAttributeInt40sWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeInt40sWithValueParamsCompletion") @NotNull Block_writeAttributeInt40sWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeInt40sWithValueParamsCompletion {
        @Generated
        void call_writeAttributeInt40sWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeInt40uWithValue:completion:")
    public native void writeAttributeInt40uWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeInt40uWithValueCompletion") @NotNull Block_writeAttributeInt40uWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeInt40uWithValueCompletion {
        @Generated
        void call_writeAttributeInt40uWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeInt40uWithValue:params:completion:")
    public native void writeAttributeInt40uWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeInt40uWithValueParamsCompletion") @NotNull Block_writeAttributeInt40uWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeInt40uWithValueParamsCompletion {
        @Generated
        void call_writeAttributeInt40uWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeInt48sWithValue:completion:")
    public native void writeAttributeInt48sWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeInt48sWithValueCompletion") @NotNull Block_writeAttributeInt48sWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeInt48sWithValueCompletion {
        @Generated
        void call_writeAttributeInt48sWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeInt48sWithValue:params:completion:")
    public native void writeAttributeInt48sWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeInt48sWithValueParamsCompletion") @NotNull Block_writeAttributeInt48sWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeInt48sWithValueParamsCompletion {
        @Generated
        void call_writeAttributeInt48sWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeInt48uWithValue:completion:")
    public native void writeAttributeInt48uWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeInt48uWithValueCompletion") @NotNull Block_writeAttributeInt48uWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeInt48uWithValueCompletion {
        @Generated
        void call_writeAttributeInt48uWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeInt48uWithValue:params:completion:")
    public native void writeAttributeInt48uWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeInt48uWithValueParamsCompletion") @NotNull Block_writeAttributeInt48uWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeInt48uWithValueParamsCompletion {
        @Generated
        void call_writeAttributeInt48uWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeInt56sWithValue:completion:")
    public native void writeAttributeInt56sWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeInt56sWithValueCompletion") @NotNull Block_writeAttributeInt56sWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeInt56sWithValueCompletion {
        @Generated
        void call_writeAttributeInt56sWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeInt56sWithValue:params:completion:")
    public native void writeAttributeInt56sWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeInt56sWithValueParamsCompletion") @NotNull Block_writeAttributeInt56sWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeInt56sWithValueParamsCompletion {
        @Generated
        void call_writeAttributeInt56sWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeInt56uWithValue:completion:")
    public native void writeAttributeInt56uWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeInt56uWithValueCompletion") @NotNull Block_writeAttributeInt56uWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeInt56uWithValueCompletion {
        @Generated
        void call_writeAttributeInt56uWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeInt56uWithValue:params:completion:")
    public native void writeAttributeInt56uWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeInt56uWithValueParamsCompletion") @NotNull Block_writeAttributeInt56uWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeInt56uWithValueParamsCompletion {
        @Generated
        void call_writeAttributeInt56uWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeInt64sWithValue:completion:")
    public native void writeAttributeInt64sWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeInt64sWithValueCompletion") @NotNull Block_writeAttributeInt64sWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeInt64sWithValueCompletion {
        @Generated
        void call_writeAttributeInt64sWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeInt64sWithValue:params:completion:")
    public native void writeAttributeInt64sWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeInt64sWithValueParamsCompletion") @NotNull Block_writeAttributeInt64sWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeInt64sWithValueParamsCompletion {
        @Generated
        void call_writeAttributeInt64sWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeInt64uWithValue:completion:")
    public native void writeAttributeInt64uWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeInt64uWithValueCompletion") @NotNull Block_writeAttributeInt64uWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeInt64uWithValueCompletion {
        @Generated
        void call_writeAttributeInt64uWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeInt64uWithValue:params:completion:")
    public native void writeAttributeInt64uWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeInt64uWithValueParamsCompletion") @NotNull Block_writeAttributeInt64uWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeInt64uWithValueParamsCompletion {
        @Generated
        void call_writeAttributeInt64uWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeInt8sWithValue:completion:")
    public native void writeAttributeInt8sWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeInt8sWithValueCompletion") @NotNull Block_writeAttributeInt8sWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeInt8sWithValueCompletion {
        @Generated
        void call_writeAttributeInt8sWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeInt8sWithValue:params:completion:")
    public native void writeAttributeInt8sWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeInt8sWithValueParamsCompletion") @NotNull Block_writeAttributeInt8sWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeInt8sWithValueParamsCompletion {
        @Generated
        void call_writeAttributeInt8sWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeInt8uWithValue:completion:")
    public native void writeAttributeInt8uWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeInt8uWithValueCompletion") @NotNull Block_writeAttributeInt8uWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeInt8uWithValueCompletion {
        @Generated
        void call_writeAttributeInt8uWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeInt8uWithValue:params:completion:")
    public native void writeAttributeInt8uWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeInt8uWithValueParamsCompletion") @NotNull Block_writeAttributeInt8uWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeInt8uWithValueParamsCompletion {
        @Generated
        void call_writeAttributeInt8uWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeListFabricScopedWithValue:completion:")
    public native void writeAttributeListFabricScopedWithValueCompletion(@NotNull NSArray<?> value,
            @ObjCBlock(name = "call_writeAttributeListFabricScopedWithValueCompletion") @NotNull Block_writeAttributeListFabricScopedWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeListFabricScopedWithValueCompletion {
        @Generated
        void call_writeAttributeListFabricScopedWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeListFabricScopedWithValue:params:completion:")
    public native void writeAttributeListFabricScopedWithValueParamsCompletion(@NotNull NSArray<?> value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeListFabricScopedWithValueParamsCompletion") @NotNull Block_writeAttributeListFabricScopedWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeListFabricScopedWithValueParamsCompletion {
        @Generated
        void call_writeAttributeListFabricScopedWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeListInt8uWithValue:completion:")
    public native void writeAttributeListInt8uWithValueCompletion(@NotNull NSArray<?> value,
            @ObjCBlock(name = "call_writeAttributeListInt8uWithValueCompletion") @NotNull Block_writeAttributeListInt8uWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeListInt8uWithValueCompletion {
        @Generated
        void call_writeAttributeListInt8uWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeListInt8uWithValue:params:completion:")
    public native void writeAttributeListInt8uWithValueParamsCompletion(@NotNull NSArray<?> value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeListInt8uWithValueParamsCompletion") @NotNull Block_writeAttributeListInt8uWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeListInt8uWithValueParamsCompletion {
        @Generated
        void call_writeAttributeListInt8uWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeListLongOctetStringWithValue:completion:")
    public native void writeAttributeListLongOctetStringWithValueCompletion(@NotNull NSArray<?> value,
            @ObjCBlock(name = "call_writeAttributeListLongOctetStringWithValueCompletion") @NotNull Block_writeAttributeListLongOctetStringWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeListLongOctetStringWithValueCompletion {
        @Generated
        void call_writeAttributeListLongOctetStringWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeListLongOctetStringWithValue:params:completion:")
    public native void writeAttributeListLongOctetStringWithValueParamsCompletion(@NotNull NSArray<?> value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeListLongOctetStringWithValueParamsCompletion") @NotNull Block_writeAttributeListLongOctetStringWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeListLongOctetStringWithValueParamsCompletion {
        @Generated
        void call_writeAttributeListLongOctetStringWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeListNullablesAndOptionalsStructWithValue:completion:")
    public native void writeAttributeListNullablesAndOptionalsStructWithValueCompletion(@NotNull NSArray<?> value,
            @ObjCBlock(name = "call_writeAttributeListNullablesAndOptionalsStructWithValueCompletion") @NotNull Block_writeAttributeListNullablesAndOptionalsStructWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeListNullablesAndOptionalsStructWithValueCompletion {
        @Generated
        void call_writeAttributeListNullablesAndOptionalsStructWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeListNullablesAndOptionalsStructWithValue:params:completion:")
    public native void writeAttributeListNullablesAndOptionalsStructWithValueParamsCompletion(@NotNull NSArray<?> value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeListNullablesAndOptionalsStructWithValueParamsCompletion") @NotNull Block_writeAttributeListNullablesAndOptionalsStructWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeListNullablesAndOptionalsStructWithValueParamsCompletion {
        @Generated
        void call_writeAttributeListNullablesAndOptionalsStructWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeListOctetStringWithValue:completion:")
    public native void writeAttributeListOctetStringWithValueCompletion(@NotNull NSArray<?> value,
            @ObjCBlock(name = "call_writeAttributeListOctetStringWithValueCompletion") @NotNull Block_writeAttributeListOctetStringWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeListOctetStringWithValueCompletion {
        @Generated
        void call_writeAttributeListOctetStringWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeListOctetStringWithValue:params:completion:")
    public native void writeAttributeListOctetStringWithValueParamsCompletion(@NotNull NSArray<?> value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeListOctetStringWithValueParamsCompletion") @NotNull Block_writeAttributeListOctetStringWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeListOctetStringWithValueParamsCompletion {
        @Generated
        void call_writeAttributeListOctetStringWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeListStructOctetStringWithValue:completion:")
    public native void writeAttributeListStructOctetStringWithValueCompletion(@NotNull NSArray<?> value,
            @ObjCBlock(name = "call_writeAttributeListStructOctetStringWithValueCompletion") @NotNull Block_writeAttributeListStructOctetStringWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeListStructOctetStringWithValueCompletion {
        @Generated
        void call_writeAttributeListStructOctetStringWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeListStructOctetStringWithValue:params:completion:")
    public native void writeAttributeListStructOctetStringWithValueParamsCompletion(@NotNull NSArray<?> value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeListStructOctetStringWithValueParamsCompletion") @NotNull Block_writeAttributeListStructOctetStringWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeListStructOctetStringWithValueParamsCompletion {
        @Generated
        void call_writeAttributeListStructOctetStringWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeLongCharStringWithValue:completion:")
    public native void writeAttributeLongCharStringWithValueCompletion(@NotNull String value,
            @ObjCBlock(name = "call_writeAttributeLongCharStringWithValueCompletion") @NotNull Block_writeAttributeLongCharStringWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeLongCharStringWithValueCompletion {
        @Generated
        void call_writeAttributeLongCharStringWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeLongCharStringWithValue:params:completion:")
    public native void writeAttributeLongCharStringWithValueParamsCompletion(@NotNull String value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeLongCharStringWithValueParamsCompletion") @NotNull Block_writeAttributeLongCharStringWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeLongCharStringWithValueParamsCompletion {
        @Generated
        void call_writeAttributeLongCharStringWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeLongOctetStringWithValue:completion:")
    public native void writeAttributeLongOctetStringWithValueCompletion(@NotNull NSData value,
            @ObjCBlock(name = "call_writeAttributeLongOctetStringWithValueCompletion") @NotNull Block_writeAttributeLongOctetStringWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeLongOctetStringWithValueCompletion {
        @Generated
        void call_writeAttributeLongOctetStringWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeLongOctetStringWithValue:params:completion:")
    public native void writeAttributeLongOctetStringWithValueParamsCompletion(@NotNull NSData value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeLongOctetStringWithValueParamsCompletion") @NotNull Block_writeAttributeLongOctetStringWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeLongOctetStringWithValueParamsCompletion {
        @Generated
        void call_writeAttributeLongOctetStringWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableBitmap16WithValue:completion:")
    public native void writeAttributeNullableBitmap16WithValueCompletion(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeNullableBitmap16WithValueCompletion") @NotNull Block_writeAttributeNullableBitmap16WithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableBitmap16WithValueCompletion {
        @Generated
        void call_writeAttributeNullableBitmap16WithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableBitmap16WithValue:params:completion:")
    public native void writeAttributeNullableBitmap16WithValueParamsCompletion(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeNullableBitmap16WithValueParamsCompletion") @NotNull Block_writeAttributeNullableBitmap16WithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableBitmap16WithValueParamsCompletion {
        @Generated
        void call_writeAttributeNullableBitmap16WithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableBitmap32WithValue:completion:")
    public native void writeAttributeNullableBitmap32WithValueCompletion(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeNullableBitmap32WithValueCompletion") @NotNull Block_writeAttributeNullableBitmap32WithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableBitmap32WithValueCompletion {
        @Generated
        void call_writeAttributeNullableBitmap32WithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableBitmap32WithValue:params:completion:")
    public native void writeAttributeNullableBitmap32WithValueParamsCompletion(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeNullableBitmap32WithValueParamsCompletion") @NotNull Block_writeAttributeNullableBitmap32WithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableBitmap32WithValueParamsCompletion {
        @Generated
        void call_writeAttributeNullableBitmap32WithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableBitmap64WithValue:completion:")
    public native void writeAttributeNullableBitmap64WithValueCompletion(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeNullableBitmap64WithValueCompletion") @NotNull Block_writeAttributeNullableBitmap64WithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableBitmap64WithValueCompletion {
        @Generated
        void call_writeAttributeNullableBitmap64WithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableBitmap64WithValue:params:completion:")
    public native void writeAttributeNullableBitmap64WithValueParamsCompletion(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeNullableBitmap64WithValueParamsCompletion") @NotNull Block_writeAttributeNullableBitmap64WithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableBitmap64WithValueParamsCompletion {
        @Generated
        void call_writeAttributeNullableBitmap64WithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableBitmap8WithValue:completion:")
    public native void writeAttributeNullableBitmap8WithValueCompletion(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeNullableBitmap8WithValueCompletion") @NotNull Block_writeAttributeNullableBitmap8WithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableBitmap8WithValueCompletion {
        @Generated
        void call_writeAttributeNullableBitmap8WithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableBitmap8WithValue:params:completion:")
    public native void writeAttributeNullableBitmap8WithValueParamsCompletion(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeNullableBitmap8WithValueParamsCompletion") @NotNull Block_writeAttributeNullableBitmap8WithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableBitmap8WithValueParamsCompletion {
        @Generated
        void call_writeAttributeNullableBitmap8WithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableBooleanWithValue:completion:")
    public native void writeAttributeNullableBooleanWithValueCompletion(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeNullableBooleanWithValueCompletion") @NotNull Block_writeAttributeNullableBooleanWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableBooleanWithValueCompletion {
        @Generated
        void call_writeAttributeNullableBooleanWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableBooleanWithValue:params:completion:")
    public native void writeAttributeNullableBooleanWithValueParamsCompletion(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeNullableBooleanWithValueParamsCompletion") @NotNull Block_writeAttributeNullableBooleanWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableBooleanWithValueParamsCompletion {
        @Generated
        void call_writeAttributeNullableBooleanWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableCharStringWithValue:completion:")
    public native void writeAttributeNullableCharStringWithValueCompletion(@Nullable String value,
            @ObjCBlock(name = "call_writeAttributeNullableCharStringWithValueCompletion") @NotNull Block_writeAttributeNullableCharStringWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableCharStringWithValueCompletion {
        @Generated
        void call_writeAttributeNullableCharStringWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableCharStringWithValue:params:completion:")
    public native void writeAttributeNullableCharStringWithValueParamsCompletion(@Nullable String value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeNullableCharStringWithValueParamsCompletion") @NotNull Block_writeAttributeNullableCharStringWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableCharStringWithValueParamsCompletion {
        @Generated
        void call_writeAttributeNullableCharStringWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableEnum16WithValue:completion:")
    public native void writeAttributeNullableEnum16WithValueCompletion(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeNullableEnum16WithValueCompletion") @NotNull Block_writeAttributeNullableEnum16WithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableEnum16WithValueCompletion {
        @Generated
        void call_writeAttributeNullableEnum16WithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableEnum16WithValue:params:completion:")
    public native void writeAttributeNullableEnum16WithValueParamsCompletion(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeNullableEnum16WithValueParamsCompletion") @NotNull Block_writeAttributeNullableEnum16WithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableEnum16WithValueParamsCompletion {
        @Generated
        void call_writeAttributeNullableEnum16WithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableEnum8WithValue:completion:")
    public native void writeAttributeNullableEnum8WithValueCompletion(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeNullableEnum8WithValueCompletion") @NotNull Block_writeAttributeNullableEnum8WithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableEnum8WithValueCompletion {
        @Generated
        void call_writeAttributeNullableEnum8WithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableEnum8WithValue:params:completion:")
    public native void writeAttributeNullableEnum8WithValueParamsCompletion(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeNullableEnum8WithValueParamsCompletion") @NotNull Block_writeAttributeNullableEnum8WithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableEnum8WithValueParamsCompletion {
        @Generated
        void call_writeAttributeNullableEnum8WithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableEnumAttrWithValue:completion:")
    public native void writeAttributeNullableEnumAttrWithValueCompletion(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeNullableEnumAttrWithValueCompletion") @NotNull Block_writeAttributeNullableEnumAttrWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableEnumAttrWithValueCompletion {
        @Generated
        void call_writeAttributeNullableEnumAttrWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableEnumAttrWithValue:params:completion:")
    public native void writeAttributeNullableEnumAttrWithValueParamsCompletion(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeNullableEnumAttrWithValueParamsCompletion") @NotNull Block_writeAttributeNullableEnumAttrWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableEnumAttrWithValueParamsCompletion {
        @Generated
        void call_writeAttributeNullableEnumAttrWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableFloatDoubleWithValue:completion:")
    public native void writeAttributeNullableFloatDoubleWithValueCompletion(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeNullableFloatDoubleWithValueCompletion") @NotNull Block_writeAttributeNullableFloatDoubleWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableFloatDoubleWithValueCompletion {
        @Generated
        void call_writeAttributeNullableFloatDoubleWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableFloatDoubleWithValue:params:completion:")
    public native void writeAttributeNullableFloatDoubleWithValueParamsCompletion(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeNullableFloatDoubleWithValueParamsCompletion") @NotNull Block_writeAttributeNullableFloatDoubleWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableFloatDoubleWithValueParamsCompletion {
        @Generated
        void call_writeAttributeNullableFloatDoubleWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableFloatSingleWithValue:completion:")
    public native void writeAttributeNullableFloatSingleWithValueCompletion(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeNullableFloatSingleWithValueCompletion") @NotNull Block_writeAttributeNullableFloatSingleWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableFloatSingleWithValueCompletion {
        @Generated
        void call_writeAttributeNullableFloatSingleWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableFloatSingleWithValue:params:completion:")
    public native void writeAttributeNullableFloatSingleWithValueParamsCompletion(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeNullableFloatSingleWithValueParamsCompletion") @NotNull Block_writeAttributeNullableFloatSingleWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableFloatSingleWithValueParamsCompletion {
        @Generated
        void call_writeAttributeNullableFloatSingleWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableInt16sWithValue:completion:")
    public native void writeAttributeNullableInt16sWithValueCompletion(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeNullableInt16sWithValueCompletion") @NotNull Block_writeAttributeNullableInt16sWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableInt16sWithValueCompletion {
        @Generated
        void call_writeAttributeNullableInt16sWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableInt16sWithValue:params:completion:")
    public native void writeAttributeNullableInt16sWithValueParamsCompletion(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeNullableInt16sWithValueParamsCompletion") @NotNull Block_writeAttributeNullableInt16sWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableInt16sWithValueParamsCompletion {
        @Generated
        void call_writeAttributeNullableInt16sWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableInt16uWithValue:completion:")
    public native void writeAttributeNullableInt16uWithValueCompletion(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeNullableInt16uWithValueCompletion") @NotNull Block_writeAttributeNullableInt16uWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableInt16uWithValueCompletion {
        @Generated
        void call_writeAttributeNullableInt16uWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableInt16uWithValue:params:completion:")
    public native void writeAttributeNullableInt16uWithValueParamsCompletion(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeNullableInt16uWithValueParamsCompletion") @NotNull Block_writeAttributeNullableInt16uWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableInt16uWithValueParamsCompletion {
        @Generated
        void call_writeAttributeNullableInt16uWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableInt24sWithValue:completion:")
    public native void writeAttributeNullableInt24sWithValueCompletion(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeNullableInt24sWithValueCompletion") @NotNull Block_writeAttributeNullableInt24sWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableInt24sWithValueCompletion {
        @Generated
        void call_writeAttributeNullableInt24sWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableInt24sWithValue:params:completion:")
    public native void writeAttributeNullableInt24sWithValueParamsCompletion(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeNullableInt24sWithValueParamsCompletion") @NotNull Block_writeAttributeNullableInt24sWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableInt24sWithValueParamsCompletion {
        @Generated
        void call_writeAttributeNullableInt24sWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableInt24uWithValue:completion:")
    public native void writeAttributeNullableInt24uWithValueCompletion(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeNullableInt24uWithValueCompletion") @NotNull Block_writeAttributeNullableInt24uWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableInt24uWithValueCompletion {
        @Generated
        void call_writeAttributeNullableInt24uWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableInt24uWithValue:params:completion:")
    public native void writeAttributeNullableInt24uWithValueParamsCompletion(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeNullableInt24uWithValueParamsCompletion") @NotNull Block_writeAttributeNullableInt24uWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableInt24uWithValueParamsCompletion {
        @Generated
        void call_writeAttributeNullableInt24uWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableInt32sWithValue:completion:")
    public native void writeAttributeNullableInt32sWithValueCompletion(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeNullableInt32sWithValueCompletion") @NotNull Block_writeAttributeNullableInt32sWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableInt32sWithValueCompletion {
        @Generated
        void call_writeAttributeNullableInt32sWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableInt32sWithValue:params:completion:")
    public native void writeAttributeNullableInt32sWithValueParamsCompletion(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeNullableInt32sWithValueParamsCompletion") @NotNull Block_writeAttributeNullableInt32sWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableInt32sWithValueParamsCompletion {
        @Generated
        void call_writeAttributeNullableInt32sWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableInt32uWithValue:completion:")
    public native void writeAttributeNullableInt32uWithValueCompletion(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeNullableInt32uWithValueCompletion") @NotNull Block_writeAttributeNullableInt32uWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableInt32uWithValueCompletion {
        @Generated
        void call_writeAttributeNullableInt32uWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableInt32uWithValue:params:completion:")
    public native void writeAttributeNullableInt32uWithValueParamsCompletion(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeNullableInt32uWithValueParamsCompletion") @NotNull Block_writeAttributeNullableInt32uWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableInt32uWithValueParamsCompletion {
        @Generated
        void call_writeAttributeNullableInt32uWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableInt40sWithValue:completion:")
    public native void writeAttributeNullableInt40sWithValueCompletion(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeNullableInt40sWithValueCompletion") @NotNull Block_writeAttributeNullableInt40sWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableInt40sWithValueCompletion {
        @Generated
        void call_writeAttributeNullableInt40sWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableInt40sWithValue:params:completion:")
    public native void writeAttributeNullableInt40sWithValueParamsCompletion(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeNullableInt40sWithValueParamsCompletion") @NotNull Block_writeAttributeNullableInt40sWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableInt40sWithValueParamsCompletion {
        @Generated
        void call_writeAttributeNullableInt40sWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableInt40uWithValue:completion:")
    public native void writeAttributeNullableInt40uWithValueCompletion(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeNullableInt40uWithValueCompletion") @NotNull Block_writeAttributeNullableInt40uWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableInt40uWithValueCompletion {
        @Generated
        void call_writeAttributeNullableInt40uWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableInt40uWithValue:params:completion:")
    public native void writeAttributeNullableInt40uWithValueParamsCompletion(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeNullableInt40uWithValueParamsCompletion") @NotNull Block_writeAttributeNullableInt40uWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableInt40uWithValueParamsCompletion {
        @Generated
        void call_writeAttributeNullableInt40uWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableInt48sWithValue:completion:")
    public native void writeAttributeNullableInt48sWithValueCompletion(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeNullableInt48sWithValueCompletion") @NotNull Block_writeAttributeNullableInt48sWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableInt48sWithValueCompletion {
        @Generated
        void call_writeAttributeNullableInt48sWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableInt48sWithValue:params:completion:")
    public native void writeAttributeNullableInt48sWithValueParamsCompletion(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeNullableInt48sWithValueParamsCompletion") @NotNull Block_writeAttributeNullableInt48sWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableInt48sWithValueParamsCompletion {
        @Generated
        void call_writeAttributeNullableInt48sWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableInt48uWithValue:completion:")
    public native void writeAttributeNullableInt48uWithValueCompletion(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeNullableInt48uWithValueCompletion") @NotNull Block_writeAttributeNullableInt48uWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableInt48uWithValueCompletion {
        @Generated
        void call_writeAttributeNullableInt48uWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableInt48uWithValue:params:completion:")
    public native void writeAttributeNullableInt48uWithValueParamsCompletion(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeNullableInt48uWithValueParamsCompletion") @NotNull Block_writeAttributeNullableInt48uWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableInt48uWithValueParamsCompletion {
        @Generated
        void call_writeAttributeNullableInt48uWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableInt56sWithValue:completion:")
    public native void writeAttributeNullableInt56sWithValueCompletion(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeNullableInt56sWithValueCompletion") @NotNull Block_writeAttributeNullableInt56sWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableInt56sWithValueCompletion {
        @Generated
        void call_writeAttributeNullableInt56sWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableInt56sWithValue:params:completion:")
    public native void writeAttributeNullableInt56sWithValueParamsCompletion(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeNullableInt56sWithValueParamsCompletion") @NotNull Block_writeAttributeNullableInt56sWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableInt56sWithValueParamsCompletion {
        @Generated
        void call_writeAttributeNullableInt56sWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableInt56uWithValue:completion:")
    public native void writeAttributeNullableInt56uWithValueCompletion(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeNullableInt56uWithValueCompletion") @NotNull Block_writeAttributeNullableInt56uWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableInt56uWithValueCompletion {
        @Generated
        void call_writeAttributeNullableInt56uWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableInt56uWithValue:params:completion:")
    public native void writeAttributeNullableInt56uWithValueParamsCompletion(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeNullableInt56uWithValueParamsCompletion") @NotNull Block_writeAttributeNullableInt56uWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableInt56uWithValueParamsCompletion {
        @Generated
        void call_writeAttributeNullableInt56uWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableInt64sWithValue:completion:")
    public native void writeAttributeNullableInt64sWithValueCompletion(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeNullableInt64sWithValueCompletion") @NotNull Block_writeAttributeNullableInt64sWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableInt64sWithValueCompletion {
        @Generated
        void call_writeAttributeNullableInt64sWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableInt64sWithValue:params:completion:")
    public native void writeAttributeNullableInt64sWithValueParamsCompletion(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeNullableInt64sWithValueParamsCompletion") @NotNull Block_writeAttributeNullableInt64sWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableInt64sWithValueParamsCompletion {
        @Generated
        void call_writeAttributeNullableInt64sWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableInt64uWithValue:completion:")
    public native void writeAttributeNullableInt64uWithValueCompletion(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeNullableInt64uWithValueCompletion") @NotNull Block_writeAttributeNullableInt64uWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableInt64uWithValueCompletion {
        @Generated
        void call_writeAttributeNullableInt64uWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableInt64uWithValue:params:completion:")
    public native void writeAttributeNullableInt64uWithValueParamsCompletion(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeNullableInt64uWithValueParamsCompletion") @NotNull Block_writeAttributeNullableInt64uWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableInt64uWithValueParamsCompletion {
        @Generated
        void call_writeAttributeNullableInt64uWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableInt8sWithValue:completion:")
    public native void writeAttributeNullableInt8sWithValueCompletion(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeNullableInt8sWithValueCompletion") @NotNull Block_writeAttributeNullableInt8sWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableInt8sWithValueCompletion {
        @Generated
        void call_writeAttributeNullableInt8sWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableInt8sWithValue:params:completion:")
    public native void writeAttributeNullableInt8sWithValueParamsCompletion(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeNullableInt8sWithValueParamsCompletion") @NotNull Block_writeAttributeNullableInt8sWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableInt8sWithValueParamsCompletion {
        @Generated
        void call_writeAttributeNullableInt8sWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableInt8uWithValue:completion:")
    public native void writeAttributeNullableInt8uWithValueCompletion(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeNullableInt8uWithValueCompletion") @NotNull Block_writeAttributeNullableInt8uWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableInt8uWithValueCompletion {
        @Generated
        void call_writeAttributeNullableInt8uWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableInt8uWithValue:params:completion:")
    public native void writeAttributeNullableInt8uWithValueParamsCompletion(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeNullableInt8uWithValueParamsCompletion") @NotNull Block_writeAttributeNullableInt8uWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableInt8uWithValueParamsCompletion {
        @Generated
        void call_writeAttributeNullableInt8uWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableOctetStringWithValue:completion:")
    public native void writeAttributeNullableOctetStringWithValueCompletion(@Nullable NSData value,
            @ObjCBlock(name = "call_writeAttributeNullableOctetStringWithValueCompletion") @NotNull Block_writeAttributeNullableOctetStringWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableOctetStringWithValueCompletion {
        @Generated
        void call_writeAttributeNullableOctetStringWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableOctetStringWithValue:params:completion:")
    public native void writeAttributeNullableOctetStringWithValueParamsCompletion(@Nullable NSData value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeNullableOctetStringWithValueParamsCompletion") @NotNull Block_writeAttributeNullableOctetStringWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableOctetStringWithValueParamsCompletion {
        @Generated
        void call_writeAttributeNullableOctetStringWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableRangeRestrictedInt16sWithValue:completion:")
    public native void writeAttributeNullableRangeRestrictedInt16sWithValueCompletion(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeNullableRangeRestrictedInt16sWithValueCompletion") @NotNull Block_writeAttributeNullableRangeRestrictedInt16sWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableRangeRestrictedInt16sWithValueCompletion {
        @Generated
        void call_writeAttributeNullableRangeRestrictedInt16sWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableRangeRestrictedInt16sWithValue:params:completion:")
    public native void writeAttributeNullableRangeRestrictedInt16sWithValueParamsCompletion(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeNullableRangeRestrictedInt16sWithValueParamsCompletion") @NotNull Block_writeAttributeNullableRangeRestrictedInt16sWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableRangeRestrictedInt16sWithValueParamsCompletion {
        @Generated
        void call_writeAttributeNullableRangeRestrictedInt16sWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableRangeRestrictedInt16uWithValue:completion:")
    public native void writeAttributeNullableRangeRestrictedInt16uWithValueCompletion(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeNullableRangeRestrictedInt16uWithValueCompletion") @NotNull Block_writeAttributeNullableRangeRestrictedInt16uWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableRangeRestrictedInt16uWithValueCompletion {
        @Generated
        void call_writeAttributeNullableRangeRestrictedInt16uWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableRangeRestrictedInt16uWithValue:params:completion:")
    public native void writeAttributeNullableRangeRestrictedInt16uWithValueParamsCompletion(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeNullableRangeRestrictedInt16uWithValueParamsCompletion") @NotNull Block_writeAttributeNullableRangeRestrictedInt16uWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableRangeRestrictedInt16uWithValueParamsCompletion {
        @Generated
        void call_writeAttributeNullableRangeRestrictedInt16uWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableRangeRestrictedInt8sWithValue:completion:")
    public native void writeAttributeNullableRangeRestrictedInt8sWithValueCompletion(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeNullableRangeRestrictedInt8sWithValueCompletion") @NotNull Block_writeAttributeNullableRangeRestrictedInt8sWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableRangeRestrictedInt8sWithValueCompletion {
        @Generated
        void call_writeAttributeNullableRangeRestrictedInt8sWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableRangeRestrictedInt8sWithValue:params:completion:")
    public native void writeAttributeNullableRangeRestrictedInt8sWithValueParamsCompletion(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeNullableRangeRestrictedInt8sWithValueParamsCompletion") @NotNull Block_writeAttributeNullableRangeRestrictedInt8sWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableRangeRestrictedInt8sWithValueParamsCompletion {
        @Generated
        void call_writeAttributeNullableRangeRestrictedInt8sWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableRangeRestrictedInt8uWithValue:completion:")
    public native void writeAttributeNullableRangeRestrictedInt8uWithValueCompletion(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeNullableRangeRestrictedInt8uWithValueCompletion") @NotNull Block_writeAttributeNullableRangeRestrictedInt8uWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableRangeRestrictedInt8uWithValueCompletion {
        @Generated
        void call_writeAttributeNullableRangeRestrictedInt8uWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableRangeRestrictedInt8uWithValue:params:completion:")
    public native void writeAttributeNullableRangeRestrictedInt8uWithValueParamsCompletion(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeNullableRangeRestrictedInt8uWithValueParamsCompletion") @NotNull Block_writeAttributeNullableRangeRestrictedInt8uWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableRangeRestrictedInt8uWithValueParamsCompletion {
        @Generated
        void call_writeAttributeNullableRangeRestrictedInt8uWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableStructWithValue:completion:")
    public native void writeAttributeNullableStructWithValueCompletion(
            @Nullable MTRUnitTestingClusterSimpleStruct value,
            @ObjCBlock(name = "call_writeAttributeNullableStructWithValueCompletion") @NotNull Block_writeAttributeNullableStructWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableStructWithValueCompletion {
        @Generated
        void call_writeAttributeNullableStructWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNullableStructWithValue:params:completion:")
    public native void writeAttributeNullableStructWithValueParamsCompletion(
            @Nullable MTRUnitTestingClusterSimpleStruct value, @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeNullableStructWithValueParamsCompletion") @NotNull Block_writeAttributeNullableStructWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableStructWithValueParamsCompletion {
        @Generated
        void call_writeAttributeNullableStructWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeOctetStringWithValue:completion:")
    public native void writeAttributeOctetStringWithValueCompletion(@NotNull NSData value,
            @ObjCBlock(name = "call_writeAttributeOctetStringWithValueCompletion") @NotNull Block_writeAttributeOctetStringWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeOctetStringWithValueCompletion {
        @Generated
        void call_writeAttributeOctetStringWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeOctetStringWithValue:params:completion:")
    public native void writeAttributeOctetStringWithValueParamsCompletion(@NotNull NSData value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeOctetStringWithValueParamsCompletion") @NotNull Block_writeAttributeOctetStringWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeOctetStringWithValueParamsCompletion {
        @Generated
        void call_writeAttributeOctetStringWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeRangeRestrictedInt16sWithValue:completion:")
    public native void writeAttributeRangeRestrictedInt16sWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeRangeRestrictedInt16sWithValueCompletion") @NotNull Block_writeAttributeRangeRestrictedInt16sWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeRangeRestrictedInt16sWithValueCompletion {
        @Generated
        void call_writeAttributeRangeRestrictedInt16sWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeRangeRestrictedInt16sWithValue:params:completion:")
    public native void writeAttributeRangeRestrictedInt16sWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeRangeRestrictedInt16sWithValueParamsCompletion") @NotNull Block_writeAttributeRangeRestrictedInt16sWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeRangeRestrictedInt16sWithValueParamsCompletion {
        @Generated
        void call_writeAttributeRangeRestrictedInt16sWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeRangeRestrictedInt16uWithValue:completion:")
    public native void writeAttributeRangeRestrictedInt16uWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeRangeRestrictedInt16uWithValueCompletion") @NotNull Block_writeAttributeRangeRestrictedInt16uWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeRangeRestrictedInt16uWithValueCompletion {
        @Generated
        void call_writeAttributeRangeRestrictedInt16uWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeRangeRestrictedInt16uWithValue:params:completion:")
    public native void writeAttributeRangeRestrictedInt16uWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeRangeRestrictedInt16uWithValueParamsCompletion") @NotNull Block_writeAttributeRangeRestrictedInt16uWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeRangeRestrictedInt16uWithValueParamsCompletion {
        @Generated
        void call_writeAttributeRangeRestrictedInt16uWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeRangeRestrictedInt8sWithValue:completion:")
    public native void writeAttributeRangeRestrictedInt8sWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeRangeRestrictedInt8sWithValueCompletion") @NotNull Block_writeAttributeRangeRestrictedInt8sWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeRangeRestrictedInt8sWithValueCompletion {
        @Generated
        void call_writeAttributeRangeRestrictedInt8sWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeRangeRestrictedInt8sWithValue:params:completion:")
    public native void writeAttributeRangeRestrictedInt8sWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeRangeRestrictedInt8sWithValueParamsCompletion") @NotNull Block_writeAttributeRangeRestrictedInt8sWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeRangeRestrictedInt8sWithValueParamsCompletion {
        @Generated
        void call_writeAttributeRangeRestrictedInt8sWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeRangeRestrictedInt8uWithValue:completion:")
    public native void writeAttributeRangeRestrictedInt8uWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeRangeRestrictedInt8uWithValueCompletion") @NotNull Block_writeAttributeRangeRestrictedInt8uWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeRangeRestrictedInt8uWithValueCompletion {
        @Generated
        void call_writeAttributeRangeRestrictedInt8uWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeRangeRestrictedInt8uWithValue:params:completion:")
    public native void writeAttributeRangeRestrictedInt8uWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeRangeRestrictedInt8uWithValueParamsCompletion") @NotNull Block_writeAttributeRangeRestrictedInt8uWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeRangeRestrictedInt8uWithValueParamsCompletion {
        @Generated
        void call_writeAttributeRangeRestrictedInt8uWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeStructAttrWithValue:completion:")
    public native void writeAttributeStructAttrWithValueCompletion(@NotNull MTRUnitTestingClusterSimpleStruct value,
            @ObjCBlock(name = "call_writeAttributeStructAttrWithValueCompletion") @NotNull Block_writeAttributeStructAttrWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeStructAttrWithValueCompletion {
        @Generated
        void call_writeAttributeStructAttrWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeStructAttrWithValue:params:completion:")
    public native void writeAttributeStructAttrWithValueParamsCompletion(
            @NotNull MTRUnitTestingClusterSimpleStruct value, @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeStructAttrWithValueParamsCompletion") @NotNull Block_writeAttributeStructAttrWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeStructAttrWithValueParamsCompletion {
        @Generated
        void call_writeAttributeStructAttrWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeTimedWriteBooleanWithValue:completion:")
    public native void writeAttributeTimedWriteBooleanWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeTimedWriteBooleanWithValueCompletion") @NotNull Block_writeAttributeTimedWriteBooleanWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeTimedWriteBooleanWithValueCompletion {
        @Generated
        void call_writeAttributeTimedWriteBooleanWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeTimedWriteBooleanWithValue:params:completion:")
    public native void writeAttributeTimedWriteBooleanWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeTimedWriteBooleanWithValueParamsCompletion") @NotNull Block_writeAttributeTimedWriteBooleanWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeTimedWriteBooleanWithValueParamsCompletion {
        @Generated
        void call_writeAttributeTimedWriteBooleanWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeUnsupportedWithValue:completion:")
    public native void writeAttributeUnsupportedWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeUnsupportedWithValueCompletion") @NotNull Block_writeAttributeUnsupportedWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeUnsupportedWithValueCompletion {
        @Generated
        void call_writeAttributeUnsupportedWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeUnsupportedWithValue:params:completion:")
    public native void writeAttributeUnsupportedWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeUnsupportedWithValueParamsCompletion") @NotNull Block_writeAttributeUnsupportedWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeUnsupportedWithValueParamsCompletion {
        @Generated
        void call_writeAttributeUnsupportedWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeVendorIdWithValue:completion:")
    public native void writeAttributeVendorIdWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeVendorIdWithValueCompletion") @NotNull Block_writeAttributeVendorIdWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeVendorIdWithValueCompletion {
        @Generated
        void call_writeAttributeVendorIdWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeVendorIdWithValue:params:completion:")
    public native void writeAttributeVendorIdWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeVendorIdWithValueParamsCompletion") @NotNull Block_writeAttributeVendorIdWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeVendorIdWithValueParamsCompletion {
        @Generated
        void call_writeAttributeVendorIdWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeWriteOnlyInt8uWithValue:completion:")
    public native void writeAttributeWriteOnlyInt8uWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeWriteOnlyInt8uWithValueCompletion") @NotNull Block_writeAttributeWriteOnlyInt8uWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeWriteOnlyInt8uWithValueCompletion {
        @Generated
        void call_writeAttributeWriteOnlyInt8uWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeWriteOnlyInt8uWithValue:params:completion:")
    public native void writeAttributeWriteOnlyInt8uWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeWriteOnlyInt8uWithValueParamsCompletion") @NotNull Block_writeAttributeWriteOnlyInt8uWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeWriteOnlyInt8uWithValueParamsCompletion {
        @Generated
        void call_writeAttributeWriteOnlyInt8uWithValueParamsCompletion(@Nullable NSError error);
    }
}