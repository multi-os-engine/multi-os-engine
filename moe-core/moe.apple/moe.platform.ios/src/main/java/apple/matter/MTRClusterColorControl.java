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
 * Cluster Color Control
 * Attributes and commands for controlling the color properties of a color-capable light.
 * 
 * API-Since: 16.1
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRClusterColorControl extends MTRCluster {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRClusterColorControl(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRClusterColorControl alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRClusterColorControl allocWithZone(VoidPtr zone);

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
    @Selector("colorLoopSetWithParams:expectedValues:expectedValueInterval:completion:")
    public native void colorLoopSetWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRColorControlClusterColorLoopSetParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_colorLoopSetWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_colorLoopSetWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_colorLoopSetWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_colorLoopSetWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use colorLoopSetWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("colorLoopSetWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void colorLoopSetWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRColorControlClusterColorLoopSetParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_colorLoopSetWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_colorLoopSetWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_colorLoopSetWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_colorLoopSetWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(@Nullable NSError error);
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
    @Selector("enhancedMoveHueWithParams:expectedValues:expectedValueInterval:completion:")
    public native void enhancedMoveHueWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRColorControlClusterEnhancedMoveHueParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_enhancedMoveHueWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_enhancedMoveHueWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enhancedMoveHueWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_enhancedMoveHueWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use enhancedMoveHueWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("enhancedMoveHueWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void enhancedMoveHueWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRColorControlClusterEnhancedMoveHueParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_enhancedMoveHueWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_enhancedMoveHueWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enhancedMoveHueWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_enhancedMoveHueWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("enhancedMoveToHueAndSaturationWithParams:expectedValues:expectedValueInterval:completion:")
    public native void enhancedMoveToHueAndSaturationWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRColorControlClusterEnhancedMoveToHueAndSaturationParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_enhancedMoveToHueAndSaturationWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_enhancedMoveToHueAndSaturationWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enhancedMoveToHueAndSaturationWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_enhancedMoveToHueAndSaturationWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * enhancedMoveToHueAndSaturationWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("enhancedMoveToHueAndSaturationWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void enhancedMoveToHueAndSaturationWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRColorControlClusterEnhancedMoveToHueAndSaturationParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_enhancedMoveToHueAndSaturationWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_enhancedMoveToHueAndSaturationWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enhancedMoveToHueAndSaturationWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_enhancedMoveToHueAndSaturationWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("enhancedMoveToHueWithParams:expectedValues:expectedValueInterval:completion:")
    public native void enhancedMoveToHueWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRColorControlClusterEnhancedMoveToHueParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_enhancedMoveToHueWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_enhancedMoveToHueWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enhancedMoveToHueWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_enhancedMoveToHueWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use enhancedMoveToHueWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("enhancedMoveToHueWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void enhancedMoveToHueWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRColorControlClusterEnhancedMoveToHueParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_enhancedMoveToHueWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_enhancedMoveToHueWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enhancedMoveToHueWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_enhancedMoveToHueWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("enhancedStepHueWithParams:expectedValues:expectedValueInterval:completion:")
    public native void enhancedStepHueWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRColorControlClusterEnhancedStepHueParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_enhancedStepHueWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_enhancedStepHueWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enhancedStepHueWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_enhancedStepHueWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use enhancedStepHueWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("enhancedStepHueWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void enhancedStepHueWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRColorControlClusterEnhancedStepHueParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_enhancedStepHueWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_enhancedStepHueWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enhancedStepHueWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_enhancedStepHueWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable NSError error);
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTRClusterColorControl init();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use initWithDevice:endpoindID:queue:
     */
    @Generated
    @Deprecated
    @Selector("initWithDevice:endpoint:queue:")
    public native MTRClusterColorControl initWithDeviceEndpointQueue(@NotNull MTRDevice device, char endpoint,
            @NotNull dispatch_queue_t queue);

    /**
     * For all instance methods that take a completion (i.e. command invocations),
     * the completion will be called on the provided queue.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("initWithDevice:endpointID:queue:")
    public native MTRClusterColorControl initWithDeviceEndpointIDQueue(@NotNull MTRDevice device,
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
    @Selector("moveColorTemperatureWithParams:expectedValues:expectedValueInterval:completion:")
    public native void moveColorTemperatureWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRColorControlClusterMoveColorTemperatureParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_moveColorTemperatureWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_moveColorTemperatureWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_moveColorTemperatureWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_moveColorTemperatureWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use moveColorTemperatureWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("moveColorTemperatureWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void moveColorTemperatureWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRColorControlClusterMoveColorTemperatureParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_moveColorTemperatureWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_moveColorTemperatureWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_moveColorTemperatureWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_moveColorTemperatureWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("moveColorWithParams:expectedValues:expectedValueInterval:completion:")
    public native void moveColorWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRColorControlClusterMoveColorParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_moveColorWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_moveColorWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_moveColorWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_moveColorWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use moveColorWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("moveColorWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void moveColorWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRColorControlClusterMoveColorParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_moveColorWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_moveColorWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_moveColorWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_moveColorWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("moveHueWithParams:expectedValues:expectedValueInterval:completion:")
    public native void moveHueWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRColorControlClusterMoveHueParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_moveHueWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_moveHueWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_moveHueWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_moveHueWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use moveHueWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("moveHueWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void moveHueWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRColorControlClusterMoveHueParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_moveHueWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_moveHueWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_moveHueWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_moveHueWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("moveSaturationWithParams:expectedValues:expectedValueInterval:completion:")
    public native void moveSaturationWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRColorControlClusterMoveSaturationParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_moveSaturationWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_moveSaturationWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_moveSaturationWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_moveSaturationWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use moveSaturationWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("moveSaturationWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void moveSaturationWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRColorControlClusterMoveSaturationParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_moveSaturationWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_moveSaturationWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_moveSaturationWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_moveSaturationWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("moveToColorTemperatureWithParams:expectedValues:expectedValueInterval:completion:")
    public native void moveToColorTemperatureWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRColorControlClusterMoveToColorTemperatureParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_moveToColorTemperatureWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_moveToColorTemperatureWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_moveToColorTemperatureWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_moveToColorTemperatureWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use moveToColorTemperatureWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("moveToColorTemperatureWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void moveToColorTemperatureWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRColorControlClusterMoveToColorTemperatureParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_moveToColorTemperatureWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_moveToColorTemperatureWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_moveToColorTemperatureWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_moveToColorTemperatureWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("moveToColorWithParams:expectedValues:expectedValueInterval:completion:")
    public native void moveToColorWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRColorControlClusterMoveToColorParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_moveToColorWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_moveToColorWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_moveToColorWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_moveToColorWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use moveToColorWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("moveToColorWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void moveToColorWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRColorControlClusterMoveToColorParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_moveToColorWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_moveToColorWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_moveToColorWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_moveToColorWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("moveToHueAndSaturationWithParams:expectedValues:expectedValueInterval:completion:")
    public native void moveToHueAndSaturationWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRColorControlClusterMoveToHueAndSaturationParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_moveToHueAndSaturationWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_moveToHueAndSaturationWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_moveToHueAndSaturationWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_moveToHueAndSaturationWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use moveToHueAndSaturationWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("moveToHueAndSaturationWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void moveToHueAndSaturationWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRColorControlClusterMoveToHueAndSaturationParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_moveToHueAndSaturationWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_moveToHueAndSaturationWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_moveToHueAndSaturationWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_moveToHueAndSaturationWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("moveToHueWithParams:expectedValues:expectedValueInterval:completion:")
    public native void moveToHueWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRColorControlClusterMoveToHueParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_moveToHueWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_moveToHueWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_moveToHueWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_moveToHueWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use moveToHueWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("moveToHueWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void moveToHueWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRColorControlClusterMoveToHueParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_moveToHueWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_moveToHueWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_moveToHueWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_moveToHueWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("moveToSaturationWithParams:expectedValues:expectedValueInterval:completion:")
    public native void moveToSaturationWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRColorControlClusterMoveToSaturationParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_moveToSaturationWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_moveToSaturationWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_moveToSaturationWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_moveToSaturationWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use moveToSaturationWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("moveToSaturationWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void moveToSaturationWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRColorControlClusterMoveToSaturationParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_moveToSaturationWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_moveToSaturationWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_moveToSaturationWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_moveToSaturationWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable NSError error);
    }

    @Generated
    @Owned
    @Selector("new")
    public static native MTRClusterColorControl new_objc();

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
    @Selector("readAttributeColorCapabilitiesWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeColorCapabilitiesWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeColorLoopActiveWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeColorLoopActiveWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeColorLoopDirectionWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeColorLoopDirectionWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeColorLoopStartEnhancedHueWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeColorLoopStartEnhancedHueWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeColorLoopStoredEnhancedHueWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeColorLoopStoredEnhancedHueWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeColorLoopTimeWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeColorLoopTimeWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeColorModeWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeColorModeWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeColorPointBIntensityWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeColorPointBIntensityWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeColorPointBXWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeColorPointBXWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeColorPointBYWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeColorPointBYWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeColorPointGIntensityWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeColorPointGIntensityWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeColorPointGXWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeColorPointGXWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeColorPointGYWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeColorPointGYWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeColorPointRIntensityWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeColorPointRIntensityWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeColorPointRXWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeColorPointRXWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeColorPointRYWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeColorPointRYWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeColorTempPhysicalMaxMiredsWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeColorTempPhysicalMaxMiredsWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeColorTempPhysicalMinMiredsWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeColorTempPhysicalMinMiredsWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeColorTemperatureMiredsWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeColorTemperatureMiredsWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeCompensationTextWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeCompensationTextWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeCoupleColorTempToLevelMinMiredsWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeCoupleColorTempToLevelMinMiredsWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeCurrentHueWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeCurrentHueWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeCurrentSaturationWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeCurrentSaturationWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeCurrentXWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeCurrentXWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeCurrentYWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeCurrentYWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeDriftCompensationWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeDriftCompensationWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeEnhancedColorModeWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeEnhancedColorModeWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeEnhancedCurrentHueWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeEnhancedCurrentHueWithParams(@Nullable MTRReadParams params);

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
    @Selector("readAttributeNumberOfPrimariesWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeNumberOfPrimariesWithParams(@Nullable MTRReadParams params);

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
    @Selector("readAttributePrimary1IntensityWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributePrimary1IntensityWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributePrimary1XWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributePrimary1XWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributePrimary1YWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributePrimary1YWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributePrimary2IntensityWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributePrimary2IntensityWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributePrimary2XWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributePrimary2XWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributePrimary2YWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributePrimary2YWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributePrimary3IntensityWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributePrimary3IntensityWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributePrimary3XWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributePrimary3XWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributePrimary3YWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributePrimary3YWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributePrimary4IntensityWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributePrimary4IntensityWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributePrimary4XWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributePrimary4XWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributePrimary4YWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributePrimary4YWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributePrimary5IntensityWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributePrimary5IntensityWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributePrimary5XWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributePrimary5XWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributePrimary5YWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributePrimary5YWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributePrimary6IntensityWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributePrimary6IntensityWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributePrimary6XWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributePrimary6XWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributePrimary6YWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributePrimary6YWithParams(@Nullable MTRReadParams params);

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
    @Selector("readAttributeStartUpColorTemperatureMiredsWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeStartUpColorTemperatureMiredsWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeWhitePointXWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeWhitePointXWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeWhitePointYWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeWhitePointYWithParams(@Nullable MTRReadParams params);

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
    @Selector("stepColorTemperatureWithParams:expectedValues:expectedValueInterval:completion:")
    public native void stepColorTemperatureWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRColorControlClusterStepColorTemperatureParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_stepColorTemperatureWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_stepColorTemperatureWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_stepColorTemperatureWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_stepColorTemperatureWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use stepColorTemperatureWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("stepColorTemperatureWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void stepColorTemperatureWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRColorControlClusterStepColorTemperatureParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_stepColorTemperatureWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_stepColorTemperatureWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_stepColorTemperatureWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_stepColorTemperatureWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("stepColorWithParams:expectedValues:expectedValueInterval:completion:")
    public native void stepColorWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRColorControlClusterStepColorParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_stepColorWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_stepColorWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_stepColorWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_stepColorWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use stepColorWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("stepColorWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void stepColorWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRColorControlClusterStepColorParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_stepColorWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_stepColorWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_stepColorWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_stepColorWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("stepHueWithParams:expectedValues:expectedValueInterval:completion:")
    public native void stepHueWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRColorControlClusterStepHueParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_stepHueWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_stepHueWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_stepHueWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_stepHueWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use stepHueWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("stepHueWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void stepHueWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRColorControlClusterStepHueParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_stepHueWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_stepHueWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_stepHueWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_stepHueWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("stepSaturationWithParams:expectedValues:expectedValueInterval:completion:")
    public native void stepSaturationWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRColorControlClusterStepSaturationParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_stepSaturationWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_stepSaturationWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_stepSaturationWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_stepSaturationWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use stepSaturationWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("stepSaturationWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void stepSaturationWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRColorControlClusterStepSaturationParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_stepSaturationWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_stepSaturationWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_stepSaturationWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_stepSaturationWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("stopMoveStepWithParams:expectedValues:expectedValueInterval:completion:")
    public native void stopMoveStepWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRColorControlClusterStopMoveStepParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_stopMoveStepWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_stopMoveStepWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_stopMoveStepWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_stopMoveStepWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use stopMoveStepWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("stopMoveStepWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void stopMoveStepWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRColorControlClusterStopMoveStepParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_stopMoveStepWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_stopMoveStepWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_stopMoveStepWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_stopMoveStepWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(@Nullable NSError error);
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
    @Selector("writeAttributeColorPointBIntensityWithValue:expectedValueInterval:")
    public native void writeAttributeColorPointBIntensityWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeColorPointBIntensityWithValue:expectedValueInterval:params:")
    public native void writeAttributeColorPointBIntensityWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeColorPointBXWithValue:expectedValueInterval:")
    public native void writeAttributeColorPointBXWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeColorPointBXWithValue:expectedValueInterval:params:")
    public native void writeAttributeColorPointBXWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeColorPointBYWithValue:expectedValueInterval:")
    public native void writeAttributeColorPointBYWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeColorPointBYWithValue:expectedValueInterval:params:")
    public native void writeAttributeColorPointBYWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeColorPointGIntensityWithValue:expectedValueInterval:")
    public native void writeAttributeColorPointGIntensityWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeColorPointGIntensityWithValue:expectedValueInterval:params:")
    public native void writeAttributeColorPointGIntensityWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeColorPointGXWithValue:expectedValueInterval:")
    public native void writeAttributeColorPointGXWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeColorPointGXWithValue:expectedValueInterval:params:")
    public native void writeAttributeColorPointGXWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeColorPointGYWithValue:expectedValueInterval:")
    public native void writeAttributeColorPointGYWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeColorPointGYWithValue:expectedValueInterval:params:")
    public native void writeAttributeColorPointGYWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeColorPointRIntensityWithValue:expectedValueInterval:")
    public native void writeAttributeColorPointRIntensityWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeColorPointRIntensityWithValue:expectedValueInterval:params:")
    public native void writeAttributeColorPointRIntensityWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeColorPointRXWithValue:expectedValueInterval:")
    public native void writeAttributeColorPointRXWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeColorPointRXWithValue:expectedValueInterval:params:")
    public native void writeAttributeColorPointRXWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeColorPointRYWithValue:expectedValueInterval:")
    public native void writeAttributeColorPointRYWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeColorPointRYWithValue:expectedValueInterval:params:")
    public native void writeAttributeColorPointRYWithValueExpectedValueIntervalParams(
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
    @Selector("writeAttributeStartUpColorTemperatureMiredsWithValue:expectedValueInterval:")
    public native void writeAttributeStartUpColorTemperatureMiredsWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeStartUpColorTemperatureMiredsWithValue:expectedValueInterval:params:")
    public native void writeAttributeStartUpColorTemperatureMiredsWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeWhitePointXWithValue:expectedValueInterval:")
    public native void writeAttributeWhitePointXWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeWhitePointXWithValue:expectedValueInterval:params:")
    public native void writeAttributeWhitePointXWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeWhitePointYWithValue:expectedValueInterval:")
    public native void writeAttributeWhitePointYWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeWhitePointYWithValue:expectedValueInterval:params:")
    public native void writeAttributeWhitePointYWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);
}