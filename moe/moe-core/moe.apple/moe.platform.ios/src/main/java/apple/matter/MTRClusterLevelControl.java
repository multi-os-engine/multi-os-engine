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
 * Cluster Level Control
 * Attributes and commands for controlling devices that can be set to a level between fully 'On' and fully 'Off.'
 * 
 * API-Since: 16.1
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRClusterLevelControl extends MTRCluster {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRClusterLevelControl(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRClusterLevelControl alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRClusterLevelControl allocWithZone(VoidPtr zone);

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
    public native MTRClusterLevelControl init();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use initWithDevice:endpoindID:queue:
     */
    @Generated
    @Deprecated
    @Selector("initWithDevice:endpoint:queue:")
    public native MTRClusterLevelControl initWithDeviceEndpointQueue(@NotNull MTRDevice device, char endpoint,
            @NotNull dispatch_queue_t queue);

    /**
     * For all instance methods that take a completion (i.e. command invocations),
     * the completion will be called on the provided queue.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("initWithDevice:endpointID:queue:")
    public native MTRClusterLevelControl initWithDeviceEndpointIDQueue(@NotNull MTRDevice device,
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
     * API-Since: 16.4
     */
    @Generated
    @Selector("moveToClosestFrequencyWithParams:expectedValues:expectedValueInterval:completion:")
    public native void moveToClosestFrequencyWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRLevelControlClusterMoveToClosestFrequencyParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_moveToClosestFrequencyWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_moveToClosestFrequencyWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_moveToClosestFrequencyWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_moveToClosestFrequencyWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use moveToClosestFrequencyWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("moveToClosestFrequencyWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void moveToClosestFrequencyWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRLevelControlClusterMoveToClosestFrequencyParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_moveToClosestFrequencyWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_moveToClosestFrequencyWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_moveToClosestFrequencyWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_moveToClosestFrequencyWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("moveToLevelWithOnOffWithParams:expectedValues:expectedValueInterval:completion:")
    public native void moveToLevelWithOnOffWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRLevelControlClusterMoveToLevelWithOnOffParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_moveToLevelWithOnOffWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_moveToLevelWithOnOffWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_moveToLevelWithOnOffWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_moveToLevelWithOnOffWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use moveToLevelWithOnOffWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("moveToLevelWithOnOffWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void moveToLevelWithOnOffWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRLevelControlClusterMoveToLevelWithOnOffParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_moveToLevelWithOnOffWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_moveToLevelWithOnOffWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_moveToLevelWithOnOffWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_moveToLevelWithOnOffWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("moveToLevelWithParams:expectedValues:expectedValueInterval:completion:")
    public native void moveToLevelWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRLevelControlClusterMoveToLevelParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_moveToLevelWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_moveToLevelWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_moveToLevelWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_moveToLevelWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use moveToLevelWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("moveToLevelWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void moveToLevelWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRLevelControlClusterMoveToLevelParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_moveToLevelWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_moveToLevelWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_moveToLevelWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_moveToLevelWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("moveWithOnOffWithParams:expectedValues:expectedValueInterval:completion:")
    public native void moveWithOnOffWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRLevelControlClusterMoveWithOnOffParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_moveWithOnOffWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_moveWithOnOffWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_moveWithOnOffWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_moveWithOnOffWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use moveWithOnOffWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("moveWithOnOffWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void moveWithOnOffWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRLevelControlClusterMoveWithOnOffParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_moveWithOnOffWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_moveWithOnOffWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_moveWithOnOffWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_moveWithOnOffWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("moveWithParams:expectedValues:expectedValueInterval:completion:")
    public native void moveWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRLevelControlClusterMoveParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_moveWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_moveWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_moveWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_moveWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use moveWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("moveWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void moveWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRLevelControlClusterMoveParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_moveWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_moveWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_moveWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_moveWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(@Nullable NSError error);
    }

    @Generated
    @Owned
    @Selector("new")
    public static native MTRClusterLevelControl new_objc();

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
    @Selector("readAttributeCurrentFrequencyWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeCurrentFrequencyWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeCurrentLevelWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeCurrentLevelWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeDefaultMoveRateWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeDefaultMoveRateWithParams(@Nullable MTRReadParams params);

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
    @Selector("readAttributeMaxFrequencyWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeMaxFrequencyWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeMaxLevelWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeMaxLevelWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeMinFrequencyWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeMinFrequencyWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeMinLevelWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeMinLevelWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeOffTransitionTimeWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeOffTransitionTimeWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeOnLevelWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeOnLevelWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeOnOffTransitionTimeWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeOnOffTransitionTimeWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeOnTransitionTimeWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeOnTransitionTimeWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeOptionsWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeOptionsWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeRemainingTimeWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeRemainingTimeWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeStartUpCurrentLevelWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeStartUpCurrentLevelWithParams(@Nullable MTRReadParams params);

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
    @Selector("stepWithOnOffWithParams:expectedValues:expectedValueInterval:completion:")
    public native void stepWithOnOffWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRLevelControlClusterStepWithOnOffParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_stepWithOnOffWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_stepWithOnOffWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_stepWithOnOffWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_stepWithOnOffWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use stepWithOnOffWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("stepWithOnOffWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void stepWithOnOffWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRLevelControlClusterStepWithOnOffParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_stepWithOnOffWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_stepWithOnOffWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_stepWithOnOffWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_stepWithOnOffWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("stepWithParams:expectedValues:expectedValueInterval:completion:")
    public native void stepWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRLevelControlClusterStepParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_stepWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_stepWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_stepWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_stepWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use stepWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("stepWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void stepWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRLevelControlClusterStepParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_stepWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_stepWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_stepWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_stepWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("stopWithOnOffWithParams:expectedValues:expectedValueInterval:completion:")
    public native void stopWithOnOffWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRLevelControlClusterStopWithOnOffParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_stopWithOnOffWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_stopWithOnOffWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_stopWithOnOffWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_stopWithOnOffWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use stopWithOnOffWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("stopWithOnOffWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void stopWithOnOffWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRLevelControlClusterStopWithOnOffParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_stopWithOnOffWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_stopWithOnOffWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_stopWithOnOffWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_stopWithOnOffWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("stopWithParams:expectedValues:expectedValueInterval:completion:")
    public native void stopWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRLevelControlClusterStopParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_stopWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_stopWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_stopWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_stopWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use stopWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("stopWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void stopWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRLevelControlClusterStopParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_stopWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_stopWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_stopWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_stopWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(@Nullable NSError error);
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
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeDefaultMoveRateWithValue:expectedValueInterval:")
    public native void writeAttributeDefaultMoveRateWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeDefaultMoveRateWithValue:expectedValueInterval:params:")
    public native void writeAttributeDefaultMoveRateWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeOffTransitionTimeWithValue:expectedValueInterval:")
    public native void writeAttributeOffTransitionTimeWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeOffTransitionTimeWithValue:expectedValueInterval:params:")
    public native void writeAttributeOffTransitionTimeWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeOnLevelWithValue:expectedValueInterval:")
    public native void writeAttributeOnLevelWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeOnLevelWithValue:expectedValueInterval:params:")
    public native void writeAttributeOnLevelWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeOnOffTransitionTimeWithValue:expectedValueInterval:")
    public native void writeAttributeOnOffTransitionTimeWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeOnOffTransitionTimeWithValue:expectedValueInterval:params:")
    public native void writeAttributeOnOffTransitionTimeWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeOnTransitionTimeWithValue:expectedValueInterval:")
    public native void writeAttributeOnTransitionTimeWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeOnTransitionTimeWithValue:expectedValueInterval:params:")
    public native void writeAttributeOnTransitionTimeWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeOptionsWithValue:expectedValueInterval:")
    public native void writeAttributeOptionsWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeOptionsWithValue:expectedValueInterval:params:")
    public native void writeAttributeOptionsWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeStartUpCurrentLevelWithValue:expectedValueInterval:")
    public native void writeAttributeStartUpCurrentLevelWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeStartUpCurrentLevelWithValue:expectedValueInterval:params:")
    public native void writeAttributeStartUpCurrentLevelWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);
}