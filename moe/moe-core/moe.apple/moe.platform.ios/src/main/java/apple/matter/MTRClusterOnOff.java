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
 * Cluster On/Off
 * Attributes and commands for switching devices between 'On' and 'Off' states.
 * 
 * API-Since: 16.1
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRClusterOnOff extends MTRCluster {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRClusterOnOff(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRClusterOnOff alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRClusterOnOff allocWithZone(VoidPtr zone);

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
    public native MTRClusterOnOff init();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use initWithDevice:endpoindID:queue:
     */
    @Generated
    @Deprecated
    @Selector("initWithDevice:endpoint:queue:")
    public native MTRClusterOnOff initWithDeviceEndpointQueue(@NotNull MTRDevice device, char endpoint,
            @NotNull dispatch_queue_t queue);

    /**
     * For all instance methods that take a completion (i.e. command invocations),
     * the completion will be called on the provided queue.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("initWithDevice:endpointID:queue:")
    public native MTRClusterOnOff initWithDeviceEndpointIDQueue(@NotNull MTRDevice device, @NotNull NSNumber endpointID,
            @NotNull dispatch_queue_t queue);

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
    public static native MTRClusterOnOff new_objc();

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("offWithEffectWithParams:expectedValues:expectedValueInterval:completion:")
    public native void offWithEffectWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTROnOffClusterOffWithEffectParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_offWithEffectWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_offWithEffectWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_offWithEffectWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_offWithEffectWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use offWithEffectWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("offWithEffectWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void offWithEffectWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTROnOffClusterOffWithEffectParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_offWithEffectWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_offWithEffectWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_offWithEffectWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_offWithEffectWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("offWithExpectedValues:expectedValueInterval:completion:")
    public native void offWithExpectedValuesExpectedValueIntervalCompletion(
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedValues,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_offWithExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_offWithExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_offWithExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_offWithExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use offWithExpectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("offWithExpectedValues:expectedValueInterval:completionHandler:")
    public native void offWithExpectedValuesExpectedValueIntervalCompletionHandler(
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedValues,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_offWithExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_offWithExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_offWithExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_offWithExpectedValuesExpectedValueIntervalCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("offWithParams:expectedValues:expectedValueInterval:completion:")
    public native void offWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @Nullable MTROnOffClusterOffParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_offWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_offWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_offWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_offWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use offWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("offWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void offWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @Nullable MTROnOffClusterOffParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_offWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_offWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_offWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_offWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("onWithExpectedValues:expectedValueInterval:completion:")
    public native void onWithExpectedValuesExpectedValueIntervalCompletion(
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedValues,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_onWithExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_onWithExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_onWithExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_onWithExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use onWithExpectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("onWithExpectedValues:expectedValueInterval:completionHandler:")
    public native void onWithExpectedValuesExpectedValueIntervalCompletionHandler(
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedValues,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_onWithExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_onWithExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_onWithExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_onWithExpectedValuesExpectedValueIntervalCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("onWithParams:expectedValues:expectedValueInterval:completion:")
    public native void onWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @Nullable MTROnOffClusterOnParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_onWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_onWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_onWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_onWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use onWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("onWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void onWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @Nullable MTROnOffClusterOnParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_onWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_onWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_onWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_onWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("onWithRecallGlobalSceneWithExpectedValues:expectedValueInterval:completion:")
    public native void onWithRecallGlobalSceneWithExpectedValuesExpectedValueIntervalCompletion(
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedValues,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_onWithRecallGlobalSceneWithExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_onWithRecallGlobalSceneWithExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_onWithRecallGlobalSceneWithExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_onWithRecallGlobalSceneWithExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use onWithRecallGlobalSceneWithExpectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("onWithRecallGlobalSceneWithExpectedValues:expectedValueInterval:completionHandler:")
    public native void onWithRecallGlobalSceneWithExpectedValuesExpectedValueIntervalCompletionHandler(
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedValues,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_onWithRecallGlobalSceneWithExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_onWithRecallGlobalSceneWithExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_onWithRecallGlobalSceneWithExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_onWithRecallGlobalSceneWithExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("onWithRecallGlobalSceneWithParams:expectedValues:expectedValueInterval:completion:")
    public native void onWithRecallGlobalSceneWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @Nullable MTROnOffClusterOnWithRecallGlobalSceneParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_onWithRecallGlobalSceneWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_onWithRecallGlobalSceneWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_onWithRecallGlobalSceneWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_onWithRecallGlobalSceneWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use onWithRecallGlobalSceneWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("onWithRecallGlobalSceneWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void onWithRecallGlobalSceneWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @Nullable MTROnOffClusterOnWithRecallGlobalSceneParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_onWithRecallGlobalSceneWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_onWithRecallGlobalSceneWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_onWithRecallGlobalSceneWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_onWithRecallGlobalSceneWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("onWithTimedOffWithParams:expectedValues:expectedValueInterval:completion:")
    public native void onWithTimedOffWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTROnOffClusterOnWithTimedOffParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_onWithTimedOffWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_onWithTimedOffWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_onWithTimedOffWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_onWithTimedOffWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use onWithTimedOffWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("onWithTimedOffWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void onWithTimedOffWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTROnOffClusterOnWithTimedOffParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_onWithTimedOffWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_onWithTimedOffWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_onWithTimedOffWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_onWithTimedOffWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(@Nullable NSError error);
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
    @Selector("readAttributeGlobalSceneControlWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeGlobalSceneControlWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeOffWaitTimeWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeOffWaitTimeWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeOnOffWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeOnOffWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeOnTimeWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeOnTimeWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeStartUpOnOffWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeStartUpOnOffWithParams(@Nullable MTRReadParams params);

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

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("toggleWithExpectedValues:expectedValueInterval:completion:")
    public native void toggleWithExpectedValuesExpectedValueIntervalCompletion(
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedValues,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_toggleWithExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_toggleWithExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_toggleWithExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_toggleWithExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use toggleWithExpectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("toggleWithExpectedValues:expectedValueInterval:completionHandler:")
    public native void toggleWithExpectedValuesExpectedValueIntervalCompletionHandler(
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedValues,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_toggleWithExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_toggleWithExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_toggleWithExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_toggleWithExpectedValuesExpectedValueIntervalCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("toggleWithParams:expectedValues:expectedValueInterval:completion:")
    public native void toggleWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @Nullable MTROnOffClusterToggleParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_toggleWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_toggleWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_toggleWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_toggleWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use toggleWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("toggleWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void toggleWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @Nullable MTROnOffClusterToggleParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_toggleWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_toggleWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_toggleWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_toggleWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(@Nullable NSError error);
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
     */
    @Generated
    @Selector("writeAttributeOffWaitTimeWithValue:expectedValueInterval:")
    public native void writeAttributeOffWaitTimeWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeOffWaitTimeWithValue:expectedValueInterval:params:")
    public native void writeAttributeOffWaitTimeWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeOnTimeWithValue:expectedValueInterval:")
    public native void writeAttributeOnTimeWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeOnTimeWithValue:expectedValueInterval:params:")
    public native void writeAttributeOnTimeWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeStartUpOnOffWithValue:expectedValueInterval:")
    public native void writeAttributeStartUpOnOffWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeStartUpOnOffWithValue:expectedValueInterval:params:")
    public native void writeAttributeStartUpOnOffWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);
}