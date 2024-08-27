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
 * Cluster Scenes
 * Attributes and commands for scene configuration and manipulation.
 * 
 * API-Since: 16.1
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRClusterScenes extends MTRCluster {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRClusterScenes(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("addSceneWithParams:expectedValues:expectedValueInterval:completion:")
    public native void addSceneWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRScenesClusterAddSceneParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_addSceneWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_addSceneWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addSceneWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_addSceneWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRScenesClusterAddSceneResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use addSceneWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("addSceneWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void addSceneWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRScenesClusterAddSceneParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_addSceneWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_addSceneWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addSceneWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_addSceneWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable MTRScenesClusterAddSceneResponseParams data, @Nullable NSError error);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRClusterScenes alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRClusterScenes allocWithZone(VoidPtr zone);

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
     * API-Since: 16.4
     */
    @Generated
    @Selector("copySceneWithParams:expectedValues:expectedValueInterval:completion:")
    public native void copySceneWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRScenesClusterCopySceneParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_copySceneWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_copySceneWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_copySceneWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_copySceneWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRScenesClusterCopySceneResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use copySceneWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("copySceneWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void copySceneWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRScenesClusterCopySceneParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_copySceneWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_copySceneWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_copySceneWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_copySceneWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable MTRScenesClusterCopySceneResponseParams data, @Nullable NSError error);
    }

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
    @Selector("enhancedAddSceneWithParams:expectedValues:expectedValueInterval:completion:")
    public native void enhancedAddSceneWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRScenesClusterEnhancedAddSceneParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_enhancedAddSceneWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_enhancedAddSceneWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enhancedAddSceneWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_enhancedAddSceneWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRScenesClusterEnhancedAddSceneResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use enhancedAddSceneWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("enhancedAddSceneWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void enhancedAddSceneWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRScenesClusterEnhancedAddSceneParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_enhancedAddSceneWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_enhancedAddSceneWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enhancedAddSceneWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_enhancedAddSceneWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable MTRScenesClusterEnhancedAddSceneResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("enhancedViewSceneWithParams:expectedValues:expectedValueInterval:completion:")
    public native void enhancedViewSceneWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRScenesClusterEnhancedViewSceneParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_enhancedViewSceneWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_enhancedViewSceneWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enhancedViewSceneWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_enhancedViewSceneWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRScenesClusterEnhancedViewSceneResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use enhancedViewSceneWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("enhancedViewSceneWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void enhancedViewSceneWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRScenesClusterEnhancedViewSceneParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_enhancedViewSceneWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_enhancedViewSceneWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enhancedViewSceneWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_enhancedViewSceneWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable MTRScenesClusterEnhancedViewSceneResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("getSceneMembershipWithParams:expectedValues:expectedValueInterval:completion:")
    public native void getSceneMembershipWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRScenesClusterGetSceneMembershipParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_getSceneMembershipWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_getSceneMembershipWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getSceneMembershipWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_getSceneMembershipWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRScenesClusterGetSceneMembershipResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use getSceneMembershipWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("getSceneMembershipWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void getSceneMembershipWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRScenesClusterGetSceneMembershipParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_getSceneMembershipWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_getSceneMembershipWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getSceneMembershipWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_getSceneMembershipWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable MTRScenesClusterGetSceneMembershipResponseParams data, @Nullable NSError error);
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTRClusterScenes init();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use initWithDevice:endpoindID:queue:
     */
    @Generated
    @Deprecated
    @Selector("initWithDevice:endpoint:queue:")
    public native MTRClusterScenes initWithDeviceEndpointQueue(@NotNull MTRDevice device, char endpoint,
            @NotNull dispatch_queue_t queue);

    /**
     * For all instance methods that take a completion (i.e. command invocations),
     * the completion will be called on the provided queue.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("initWithDevice:endpointID:queue:")
    public native MTRClusterScenes initWithDeviceEndpointIDQueue(@NotNull MTRDevice device,
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
    public static native MTRClusterScenes new_objc();

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
    @Selector("readAttributeCurrentGroupWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeCurrentGroupWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeCurrentSceneWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeCurrentSceneWithParams(@Nullable MTRReadParams params);

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
    @Selector("readAttributeLastConfiguredByWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeLastConfiguredByWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeNameSupportWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeNameSupportWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeSceneCountWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeSceneCountWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeSceneValidWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeSceneValidWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("recallSceneWithParams:expectedValues:expectedValueInterval:completion:")
    public native void recallSceneWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRScenesClusterRecallSceneParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_recallSceneWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_recallSceneWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_recallSceneWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_recallSceneWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use recallSceneWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("recallSceneWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void recallSceneWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRScenesClusterRecallSceneParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_recallSceneWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_recallSceneWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_recallSceneWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_recallSceneWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("removeAllScenesWithParams:expectedValues:expectedValueInterval:completion:")
    public native void removeAllScenesWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRScenesClusterRemoveAllScenesParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_removeAllScenesWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_removeAllScenesWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeAllScenesWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_removeAllScenesWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRScenesClusterRemoveAllScenesResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use removeAllScenesWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("removeAllScenesWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void removeAllScenesWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRScenesClusterRemoveAllScenesParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_removeAllScenesWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_removeAllScenesWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeAllScenesWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_removeAllScenesWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable MTRScenesClusterRemoveAllScenesResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("removeSceneWithParams:expectedValues:expectedValueInterval:completion:")
    public native void removeSceneWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRScenesClusterRemoveSceneParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_removeSceneWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_removeSceneWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeSceneWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_removeSceneWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRScenesClusterRemoveSceneResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use removeSceneWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("removeSceneWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void removeSceneWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRScenesClusterRemoveSceneParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_removeSceneWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_removeSceneWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeSceneWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_removeSceneWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable MTRScenesClusterRemoveSceneResponseParams data, @Nullable NSError error);
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
    @Selector("storeSceneWithParams:expectedValues:expectedValueInterval:completion:")
    public native void storeSceneWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRScenesClusterStoreSceneParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_storeSceneWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_storeSceneWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_storeSceneWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_storeSceneWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRScenesClusterStoreSceneResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use storeSceneWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("storeSceneWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void storeSceneWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRScenesClusterStoreSceneParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_storeSceneWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_storeSceneWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_storeSceneWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_storeSceneWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable MTRScenesClusterStoreSceneResponseParams data, @Nullable NSError error);
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
    @Selector("viewSceneWithParams:expectedValues:expectedValueInterval:completion:")
    public native void viewSceneWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRScenesClusterViewSceneParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_viewSceneWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_viewSceneWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_viewSceneWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_viewSceneWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRScenesClusterViewSceneResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use viewSceneWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("viewSceneWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void viewSceneWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRScenesClusterViewSceneParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_viewSceneWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_viewSceneWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_viewSceneWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_viewSceneWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable MTRScenesClusterViewSceneResponseParams data, @Nullable NSError error);
    }
}