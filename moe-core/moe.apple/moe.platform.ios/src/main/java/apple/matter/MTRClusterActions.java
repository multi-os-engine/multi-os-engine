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
 * Cluster Actions
 * This cluster provides a standardized way for a Node (typically a Bridge, but could be any Node) to expose action
 * information.
 * 
 * API-Since: 16.1
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRClusterActions extends MTRCluster {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRClusterActions(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRClusterActions alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRClusterActions allocWithZone(VoidPtr zone);

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
    @Selector("disableActionWithDurationWithParams:expectedValues:expectedValueInterval:completion:")
    public native void disableActionWithDurationWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRActionsClusterDisableActionWithDurationParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_disableActionWithDurationWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_disableActionWithDurationWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_disableActionWithDurationWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_disableActionWithDurationWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * disableActionWithDurationWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("disableActionWithDurationWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void disableActionWithDurationWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRActionsClusterDisableActionWithDurationParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_disableActionWithDurationWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_disableActionWithDurationWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_disableActionWithDurationWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_disableActionWithDurationWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("disableActionWithParams:expectedValues:expectedValueInterval:completion:")
    public native void disableActionWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRActionsClusterDisableActionParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_disableActionWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_disableActionWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_disableActionWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_disableActionWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use disableActionWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("disableActionWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void disableActionWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRActionsClusterDisableActionParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_disableActionWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_disableActionWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_disableActionWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_disableActionWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("enableActionWithDurationWithParams:expectedValues:expectedValueInterval:completion:")
    public native void enableActionWithDurationWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRActionsClusterEnableActionWithDurationParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_enableActionWithDurationWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_enableActionWithDurationWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enableActionWithDurationWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_enableActionWithDurationWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * enableActionWithDurationWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("enableActionWithDurationWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void enableActionWithDurationWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRActionsClusterEnableActionWithDurationParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_enableActionWithDurationWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_enableActionWithDurationWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enableActionWithDurationWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_enableActionWithDurationWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("enableActionWithParams:expectedValues:expectedValueInterval:completion:")
    public native void enableActionWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRActionsClusterEnableActionParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_enableActionWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_enableActionWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enableActionWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_enableActionWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use enableActionWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("enableActionWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void enableActionWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRActionsClusterEnableActionParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_enableActionWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_enableActionWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enableActionWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_enableActionWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(@Nullable NSError error);
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTRClusterActions init();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use initWithDevice:endpoindID:queue:
     */
    @Generated
    @Deprecated
    @Selector("initWithDevice:endpoint:queue:")
    public native MTRClusterActions initWithDeviceEndpointQueue(@NotNull MTRDevice device, char endpoint,
            @NotNull dispatch_queue_t queue);

    /**
     * For all instance methods that take a completion (i.e. command invocations),
     * the completion will be called on the provided queue.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("initWithDevice:endpointID:queue:")
    public native MTRClusterActions initWithDeviceEndpointIDQueue(@NotNull MTRDevice device,
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

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("instantActionWithParams:expectedValues:expectedValueInterval:completion:")
    public native void instantActionWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRActionsClusterInstantActionParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_instantActionWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_instantActionWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_instantActionWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_instantActionWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use instantActionWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("instantActionWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void instantActionWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRActionsClusterInstantActionParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_instantActionWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_instantActionWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_instantActionWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_instantActionWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("instantActionWithTransitionWithParams:expectedValues:expectedValueInterval:completion:")
    public native void instantActionWithTransitionWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRActionsClusterInstantActionWithTransitionParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_instantActionWithTransitionWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_instantActionWithTransitionWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_instantActionWithTransitionWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_instantActionWithTransitionWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * instantActionWithTransitionWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("instantActionWithTransitionWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void instantActionWithTransitionWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRActionsClusterInstantActionWithTransitionParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_instantActionWithTransitionWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_instantActionWithTransitionWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_instantActionWithTransitionWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_instantActionWithTransitionWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable NSError error);
    }

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
    public static native MTRClusterActions new_objc();

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("pauseActionWithDurationWithParams:expectedValues:expectedValueInterval:completion:")
    public native void pauseActionWithDurationWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRActionsClusterPauseActionWithDurationParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_pauseActionWithDurationWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_pauseActionWithDurationWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_pauseActionWithDurationWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_pauseActionWithDurationWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use pauseActionWithDurationWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("pauseActionWithDurationWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void pauseActionWithDurationWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRActionsClusterPauseActionWithDurationParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_pauseActionWithDurationWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_pauseActionWithDurationWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_pauseActionWithDurationWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_pauseActionWithDurationWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("pauseActionWithParams:expectedValues:expectedValueInterval:completion:")
    public native void pauseActionWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRActionsClusterPauseActionParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_pauseActionWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_pauseActionWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_pauseActionWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_pauseActionWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use pauseActionWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("pauseActionWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void pauseActionWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRActionsClusterPauseActionParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_pauseActionWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_pauseActionWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_pauseActionWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_pauseActionWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(@Nullable NSError error);
    }

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
    @Selector("readAttributeActionListWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeActionListWithParams(@Nullable MTRReadParams params);

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
    @Selector("readAttributeEndpointListsWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeEndpointListsWithParams(@Nullable MTRReadParams params);

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
    @Selector("readAttributeSetupURLWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeSetupURLWithParams(@Nullable MTRReadParams params);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("resumeActionWithParams:expectedValues:expectedValueInterval:completion:")
    public native void resumeActionWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRActionsClusterResumeActionParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_resumeActionWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_resumeActionWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resumeActionWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_resumeActionWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use resumeActionWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("resumeActionWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void resumeActionWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRActionsClusterResumeActionParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_resumeActionWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_resumeActionWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resumeActionWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_resumeActionWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(@Nullable NSError error);
    }

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("startActionWithDurationWithParams:expectedValues:expectedValueInterval:completion:")
    public native void startActionWithDurationWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRActionsClusterStartActionWithDurationParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_startActionWithDurationWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_startActionWithDurationWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_startActionWithDurationWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_startActionWithDurationWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use startActionWithDurationWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("startActionWithDurationWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void startActionWithDurationWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRActionsClusterStartActionWithDurationParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_startActionWithDurationWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_startActionWithDurationWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_startActionWithDurationWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_startActionWithDurationWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("startActionWithParams:expectedValues:expectedValueInterval:completion:")
    public native void startActionWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRActionsClusterStartActionParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_startActionWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_startActionWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_startActionWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_startActionWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use startActionWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("startActionWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void startActionWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRActionsClusterStartActionParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_startActionWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_startActionWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_startActionWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_startActionWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("stopActionWithParams:expectedValues:expectedValueInterval:completion:")
    public native void stopActionWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRActionsClusterStopActionParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_stopActionWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_stopActionWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_stopActionWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_stopActionWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use stopActionWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("stopActionWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void stopActionWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRActionsClusterStopActionParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_stopActionWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_stopActionWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_stopActionWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_stopActionWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(@Nullable NSError error);
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