package apple.matter;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
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
 * Cluster Group Key Management
 * The Group Key Management Cluster is the mechanism by which group keys are managed.
 * 
 * API-Since: 16.1
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRClusterGroupKeyManagement extends MTRCluster {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRClusterGroupKeyManagement(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRClusterGroupKeyManagement alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRClusterGroupKeyManagement allocWithZone(VoidPtr zone);

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
    public native MTRClusterGroupKeyManagement init();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use initWithDevice:endpoindID:queue:
     */
    @Generated
    @Deprecated
    @Selector("initWithDevice:endpoint:queue:")
    public native MTRClusterGroupKeyManagement initWithDeviceEndpointQueue(@NotNull MTRDevice device, char endpoint,
            @NotNull dispatch_queue_t queue);

    /**
     * For all instance methods that take a completion (i.e. command invocations),
     * the completion will be called on the provided queue.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("initWithDevice:endpointID:queue:")
    public native MTRClusterGroupKeyManagement initWithDeviceEndpointIDQueue(@NotNull MTRDevice device,
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

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("keySetReadAllIndicesWithExpectedValues:expectedValueInterval:completion:")
    public native void keySetReadAllIndicesWithExpectedValuesExpectedValueIntervalCompletion(
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedValues,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_keySetReadAllIndicesWithExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_keySetReadAllIndicesWithExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_keySetReadAllIndicesWithExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_keySetReadAllIndicesWithExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRGroupKeyManagementClusterKeySetReadAllIndicesResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("keySetReadAllIndicesWithParams:expectedValues:expectedValueInterval:completion:")
    public native void keySetReadAllIndicesWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @Nullable MTRGroupKeyManagementClusterKeySetReadAllIndicesParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_keySetReadAllIndicesWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_keySetReadAllIndicesWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_keySetReadAllIndicesWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_keySetReadAllIndicesWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRGroupKeyManagementClusterKeySetReadAllIndicesResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use keySetReadAllIndicesWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("keySetReadAllIndicesWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void keySetReadAllIndicesWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @Nullable MTRGroupKeyManagementClusterKeySetReadAllIndicesParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_keySetReadAllIndicesWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_keySetReadAllIndicesWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_keySetReadAllIndicesWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_keySetReadAllIndicesWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable MTRGroupKeyManagementClusterKeySetReadAllIndicesResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("keySetReadWithParams:expectedValues:expectedValueInterval:completion:")
    public native void keySetReadWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRGroupKeyManagementClusterKeySetReadParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_keySetReadWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_keySetReadWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_keySetReadWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_keySetReadWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRGroupKeyManagementClusterKeySetReadResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use keySetReadWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("keySetReadWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void keySetReadWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRGroupKeyManagementClusterKeySetReadParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_keySetReadWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_keySetReadWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_keySetReadWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_keySetReadWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable MTRGroupKeyManagementClusterKeySetReadResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("keySetRemoveWithParams:expectedValues:expectedValueInterval:completion:")
    public native void keySetRemoveWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRGroupKeyManagementClusterKeySetRemoveParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_keySetRemoveWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_keySetRemoveWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_keySetRemoveWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_keySetRemoveWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use keySetRemoveWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("keySetRemoveWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void keySetRemoveWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRGroupKeyManagementClusterKeySetRemoveParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_keySetRemoveWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_keySetRemoveWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_keySetRemoveWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_keySetRemoveWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("keySetWriteWithParams:expectedValues:expectedValueInterval:completion:")
    public native void keySetWriteWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRGroupKeyManagementClusterKeySetWriteParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_keySetWriteWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_keySetWriteWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_keySetWriteWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_keySetWriteWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use keySetWriteWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("keySetWriteWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void keySetWriteWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRGroupKeyManagementClusterKeySetWriteParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_keySetWriteWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_keySetWriteWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_keySetWriteWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_keySetWriteWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(@Nullable NSError error);
    }

    @Generated
    @Owned
    @Selector("new")
    public static native MTRClusterGroupKeyManagement new_objc();

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeAcceptedCommandListWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeAcceptedCommandListWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeAttributeListWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeAttributeListWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeClusterRevisionWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeClusterRevisionWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeFeatureMapWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeFeatureMapWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeGeneratedCommandListWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeGeneratedCommandListWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeGroupKeyMapWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeGroupKeyMapWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeGroupTableWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeGroupTableWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeMaxGroupKeysPerFabricWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeMaxGroupKeysPerFabricWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeMaxGroupsPerFabricWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeMaxGroupsPerFabricWithParams(@Nullable MTRReadParams params);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

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
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeGroupKeyMapWithValue:expectedValueInterval:")
    public native void writeAttributeGroupKeyMapWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeGroupKeyMapWithValue:expectedValueInterval:params:")
    public native void writeAttributeGroupKeyMapWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);
}