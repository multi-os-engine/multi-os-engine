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
 * Cluster Color Control
 * 
 * Attributes and commands for controlling the color properties of a color-capable light.
 * 
 * API-Since: 16.1
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRBaseClusterColorControl extends MTRCluster {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRBaseClusterColorControl(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRBaseClusterColorControl alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRBaseClusterColorControl allocWithZone(VoidPtr zone);

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
     * Command ColorLoopSet
     * 
     * Command description for ColorLoopSet
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("colorLoopSetWithParams:completion:")
    public native void colorLoopSetWithParamsCompletion(@NotNull MTRColorControlClusterColorLoopSetParams params,
            @ObjCBlock(name = "call_colorLoopSetWithParamsCompletion") @NotNull Block_colorLoopSetWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_colorLoopSetWithParamsCompletion {
        @Generated
        void call_colorLoopSetWithParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use colorLoopSetWithParams:completion:
     */
    @Generated
    @Deprecated
    @Selector("colorLoopSetWithParams:completionHandler:")
    public native void colorLoopSetWithParamsCompletionHandler(@NotNull MTRColorControlClusterColorLoopSetParams params,
            @ObjCBlock(name = "call_colorLoopSetWithParamsCompletionHandler") @NotNull Block_colorLoopSetWithParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_colorLoopSetWithParamsCompletionHandler {
        @Generated
        void call_colorLoopSetWithParamsCompletionHandler(@Nullable NSError error);
    }

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Command EnhancedMoveHue
     * 
     * Command description for EnhancedMoveHue
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("enhancedMoveHueWithParams:completion:")
    public native void enhancedMoveHueWithParamsCompletion(@NotNull MTRColorControlClusterEnhancedMoveHueParams params,
            @ObjCBlock(name = "call_enhancedMoveHueWithParamsCompletion") @NotNull Block_enhancedMoveHueWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enhancedMoveHueWithParamsCompletion {
        @Generated
        void call_enhancedMoveHueWithParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use enhancedMoveHueWithParams:completion:
     */
    @Generated
    @Deprecated
    @Selector("enhancedMoveHueWithParams:completionHandler:")
    public native void enhancedMoveHueWithParamsCompletionHandler(
            @NotNull MTRColorControlClusterEnhancedMoveHueParams params,
            @ObjCBlock(name = "call_enhancedMoveHueWithParamsCompletionHandler") @NotNull Block_enhancedMoveHueWithParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enhancedMoveHueWithParamsCompletionHandler {
        @Generated
        void call_enhancedMoveHueWithParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * Command EnhancedMoveToHueAndSaturation
     * 
     * Command description for EnhancedMoveToHueAndSaturation
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("enhancedMoveToHueAndSaturationWithParams:completion:")
    public native void enhancedMoveToHueAndSaturationWithParamsCompletion(
            @NotNull MTRColorControlClusterEnhancedMoveToHueAndSaturationParams params,
            @ObjCBlock(name = "call_enhancedMoveToHueAndSaturationWithParamsCompletion") @NotNull Block_enhancedMoveToHueAndSaturationWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enhancedMoveToHueAndSaturationWithParamsCompletion {
        @Generated
        void call_enhancedMoveToHueAndSaturationWithParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use enhancedMoveToHueAndSaturationWithParams:completion:
     */
    @Generated
    @Deprecated
    @Selector("enhancedMoveToHueAndSaturationWithParams:completionHandler:")
    public native void enhancedMoveToHueAndSaturationWithParamsCompletionHandler(
            @NotNull MTRColorControlClusterEnhancedMoveToHueAndSaturationParams params,
            @ObjCBlock(name = "call_enhancedMoveToHueAndSaturationWithParamsCompletionHandler") @NotNull Block_enhancedMoveToHueAndSaturationWithParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enhancedMoveToHueAndSaturationWithParamsCompletionHandler {
        @Generated
        void call_enhancedMoveToHueAndSaturationWithParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * Command EnhancedMoveToHue
     * 
     * Command description for EnhancedMoveToHue
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("enhancedMoveToHueWithParams:completion:")
    public native void enhancedMoveToHueWithParamsCompletion(
            @NotNull MTRColorControlClusterEnhancedMoveToHueParams params,
            @ObjCBlock(name = "call_enhancedMoveToHueWithParamsCompletion") @NotNull Block_enhancedMoveToHueWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enhancedMoveToHueWithParamsCompletion {
        @Generated
        void call_enhancedMoveToHueWithParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use enhancedMoveToHueWithParams:completion:
     */
    @Generated
    @Deprecated
    @Selector("enhancedMoveToHueWithParams:completionHandler:")
    public native void enhancedMoveToHueWithParamsCompletionHandler(
            @NotNull MTRColorControlClusterEnhancedMoveToHueParams params,
            @ObjCBlock(name = "call_enhancedMoveToHueWithParamsCompletionHandler") @NotNull Block_enhancedMoveToHueWithParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enhancedMoveToHueWithParamsCompletionHandler {
        @Generated
        void call_enhancedMoveToHueWithParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * Command EnhancedStepHue
     * 
     * Command description for EnhancedStepHue
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("enhancedStepHueWithParams:completion:")
    public native void enhancedStepHueWithParamsCompletion(@NotNull MTRColorControlClusterEnhancedStepHueParams params,
            @ObjCBlock(name = "call_enhancedStepHueWithParamsCompletion") @NotNull Block_enhancedStepHueWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enhancedStepHueWithParamsCompletion {
        @Generated
        void call_enhancedStepHueWithParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use enhancedStepHueWithParams:completion:
     */
    @Generated
    @Deprecated
    @Selector("enhancedStepHueWithParams:completionHandler:")
    public native void enhancedStepHueWithParamsCompletionHandler(
            @NotNull MTRColorControlClusterEnhancedStepHueParams params,
            @ObjCBlock(name = "call_enhancedStepHueWithParamsCompletionHandler") @NotNull Block_enhancedStepHueWithParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enhancedStepHueWithParamsCompletionHandler {
        @Generated
        void call_enhancedStepHueWithParamsCompletionHandler(@Nullable NSError error);
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTRBaseClusterColorControl init();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use initWithDevice:endpointID:queue:
     */
    @Generated
    @Deprecated
    @Selector("initWithDevice:endpoint:queue:")
    public native MTRBaseClusterColorControl initWithDeviceEndpointQueue(@NotNull MTRBaseDevice device, char endpoint,
            @NotNull dispatch_queue_t queue);

    /**
     * For all instance methods (reads, writes, commands) that take a completion,
     * the completion will be called on the provided queue.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("initWithDevice:endpointID:queue:")
    public native MTRBaseClusterColorControl initWithDeviceEndpointIDQueue(@NotNull MTRBaseDevice device,
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
     * Command MoveColorTemperature
     * 
     * Command description for MoveColorTemperature
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("moveColorTemperatureWithParams:completion:")
    public native void moveColorTemperatureWithParamsCompletion(
            @NotNull MTRColorControlClusterMoveColorTemperatureParams params,
            @ObjCBlock(name = "call_moveColorTemperatureWithParamsCompletion") @NotNull Block_moveColorTemperatureWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_moveColorTemperatureWithParamsCompletion {
        @Generated
        void call_moveColorTemperatureWithParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use moveColorTemperatureWithParams:completion:
     */
    @Generated
    @Deprecated
    @Selector("moveColorTemperatureWithParams:completionHandler:")
    public native void moveColorTemperatureWithParamsCompletionHandler(
            @NotNull MTRColorControlClusterMoveColorTemperatureParams params,
            @ObjCBlock(name = "call_moveColorTemperatureWithParamsCompletionHandler") @NotNull Block_moveColorTemperatureWithParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_moveColorTemperatureWithParamsCompletionHandler {
        @Generated
        void call_moveColorTemperatureWithParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * Command MoveColor
     * 
     * Moves the color.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("moveColorWithParams:completion:")
    public native void moveColorWithParamsCompletion(@NotNull MTRColorControlClusterMoveColorParams params,
            @ObjCBlock(name = "call_moveColorWithParamsCompletion") @NotNull Block_moveColorWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_moveColorWithParamsCompletion {
        @Generated
        void call_moveColorWithParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use moveColorWithParams:completion:
     */
    @Generated
    @Deprecated
    @Selector("moveColorWithParams:completionHandler:")
    public native void moveColorWithParamsCompletionHandler(@NotNull MTRColorControlClusterMoveColorParams params,
            @ObjCBlock(name = "call_moveColorWithParamsCompletionHandler") @NotNull Block_moveColorWithParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_moveColorWithParamsCompletionHandler {
        @Generated
        void call_moveColorWithParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * Command MoveHue
     * 
     * Move hue up or down at specified rate.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("moveHueWithParams:completion:")
    public native void moveHueWithParamsCompletion(@NotNull MTRColorControlClusterMoveHueParams params,
            @ObjCBlock(name = "call_moveHueWithParamsCompletion") @NotNull Block_moveHueWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_moveHueWithParamsCompletion {
        @Generated
        void call_moveHueWithParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use moveHueWithParams:completion:
     */
    @Generated
    @Deprecated
    @Selector("moveHueWithParams:completionHandler:")
    public native void moveHueWithParamsCompletionHandler(@NotNull MTRColorControlClusterMoveHueParams params,
            @ObjCBlock(name = "call_moveHueWithParamsCompletionHandler") @NotNull Block_moveHueWithParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_moveHueWithParamsCompletionHandler {
        @Generated
        void call_moveHueWithParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * Command MoveSaturation
     * 
     * Move saturation up or down at specified rate.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("moveSaturationWithParams:completion:")
    public native void moveSaturationWithParamsCompletion(@NotNull MTRColorControlClusterMoveSaturationParams params,
            @ObjCBlock(name = "call_moveSaturationWithParamsCompletion") @NotNull Block_moveSaturationWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_moveSaturationWithParamsCompletion {
        @Generated
        void call_moveSaturationWithParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use moveSaturationWithParams:completion:
     */
    @Generated
    @Deprecated
    @Selector("moveSaturationWithParams:completionHandler:")
    public native void moveSaturationWithParamsCompletionHandler(
            @NotNull MTRColorControlClusterMoveSaturationParams params,
            @ObjCBlock(name = "call_moveSaturationWithParamsCompletionHandler") @NotNull Block_moveSaturationWithParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_moveSaturationWithParamsCompletionHandler {
        @Generated
        void call_moveSaturationWithParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * Command MoveToColorTemperature
     * 
     * Move to a specific color temperature.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("moveToColorTemperatureWithParams:completion:")
    public native void moveToColorTemperatureWithParamsCompletion(
            @NotNull MTRColorControlClusterMoveToColorTemperatureParams params,
            @ObjCBlock(name = "call_moveToColorTemperatureWithParamsCompletion") @NotNull Block_moveToColorTemperatureWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_moveToColorTemperatureWithParamsCompletion {
        @Generated
        void call_moveToColorTemperatureWithParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use moveToColorTemperatureWithParams:completion:
     */
    @Generated
    @Deprecated
    @Selector("moveToColorTemperatureWithParams:completionHandler:")
    public native void moveToColorTemperatureWithParamsCompletionHandler(
            @NotNull MTRColorControlClusterMoveToColorTemperatureParams params,
            @ObjCBlock(name = "call_moveToColorTemperatureWithParamsCompletionHandler") @NotNull Block_moveToColorTemperatureWithParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_moveToColorTemperatureWithParamsCompletionHandler {
        @Generated
        void call_moveToColorTemperatureWithParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * Command MoveToColor
     * 
     * Move to specified color.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("moveToColorWithParams:completion:")
    public native void moveToColorWithParamsCompletion(@NotNull MTRColorControlClusterMoveToColorParams params,
            @ObjCBlock(name = "call_moveToColorWithParamsCompletion") @NotNull Block_moveToColorWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_moveToColorWithParamsCompletion {
        @Generated
        void call_moveToColorWithParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use moveToColorWithParams:completion:
     */
    @Generated
    @Deprecated
    @Selector("moveToColorWithParams:completionHandler:")
    public native void moveToColorWithParamsCompletionHandler(@NotNull MTRColorControlClusterMoveToColorParams params,
            @ObjCBlock(name = "call_moveToColorWithParamsCompletionHandler") @NotNull Block_moveToColorWithParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_moveToColorWithParamsCompletionHandler {
        @Generated
        void call_moveToColorWithParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * Command MoveToHueAndSaturation
     * 
     * Move to hue and saturation.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("moveToHueAndSaturationWithParams:completion:")
    public native void moveToHueAndSaturationWithParamsCompletion(
            @NotNull MTRColorControlClusterMoveToHueAndSaturationParams params,
            @ObjCBlock(name = "call_moveToHueAndSaturationWithParamsCompletion") @NotNull Block_moveToHueAndSaturationWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_moveToHueAndSaturationWithParamsCompletion {
        @Generated
        void call_moveToHueAndSaturationWithParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use moveToHueAndSaturationWithParams:completion:
     */
    @Generated
    @Deprecated
    @Selector("moveToHueAndSaturationWithParams:completionHandler:")
    public native void moveToHueAndSaturationWithParamsCompletionHandler(
            @NotNull MTRColorControlClusterMoveToHueAndSaturationParams params,
            @ObjCBlock(name = "call_moveToHueAndSaturationWithParamsCompletionHandler") @NotNull Block_moveToHueAndSaturationWithParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_moveToHueAndSaturationWithParamsCompletionHandler {
        @Generated
        void call_moveToHueAndSaturationWithParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * Command MoveToHue
     * 
     * Move to specified hue.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("moveToHueWithParams:completion:")
    public native void moveToHueWithParamsCompletion(@NotNull MTRColorControlClusterMoveToHueParams params,
            @ObjCBlock(name = "call_moveToHueWithParamsCompletion") @NotNull Block_moveToHueWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_moveToHueWithParamsCompletion {
        @Generated
        void call_moveToHueWithParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use moveToHueWithParams:completion:
     */
    @Generated
    @Deprecated
    @Selector("moveToHueWithParams:completionHandler:")
    public native void moveToHueWithParamsCompletionHandler(@NotNull MTRColorControlClusterMoveToHueParams params,
            @ObjCBlock(name = "call_moveToHueWithParamsCompletionHandler") @NotNull Block_moveToHueWithParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_moveToHueWithParamsCompletionHandler {
        @Generated
        void call_moveToHueWithParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * Command MoveToSaturation
     * 
     * Move to specified saturation.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("moveToSaturationWithParams:completion:")
    public native void moveToSaturationWithParamsCompletion(
            @NotNull MTRColorControlClusterMoveToSaturationParams params,
            @ObjCBlock(name = "call_moveToSaturationWithParamsCompletion") @NotNull Block_moveToSaturationWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_moveToSaturationWithParamsCompletion {
        @Generated
        void call_moveToSaturationWithParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use moveToSaturationWithParams:completion:
     */
    @Generated
    @Deprecated
    @Selector("moveToSaturationWithParams:completionHandler:")
    public native void moveToSaturationWithParamsCompletionHandler(
            @NotNull MTRColorControlClusterMoveToSaturationParams params,
            @ObjCBlock(name = "call_moveToSaturationWithParamsCompletionHandler") @NotNull Block_moveToSaturationWithParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_moveToSaturationWithParamsCompletionHandler {
        @Generated
        void call_moveToSaturationWithParamsCompletionHandler(@Nullable NSError error);
    }

    @Generated
    @Owned
    @Selector("new")
    public static native MTRBaseClusterColorControl new_objc();

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
     * Deprecated-Message: Please use readAttributeColorCapabilitiesWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeColorCapabilitiesWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeColorCapabilitiesWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeColorCapabilitiesWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeColorCapabilitiesWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorCapabilitiesWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeColorCapabilitiesWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeColorCapabilitiesWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeColorCapabilitiesWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeColorCapabilitiesWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeColorCapabilitiesWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorCapabilitiesWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeColorCapabilitiesWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeColorCapabilitiesWithCompletion:")
    public native void readAttributeColorCapabilitiesWithCompletion(
            @ObjCBlock(name = "call_readAttributeColorCapabilitiesWithCompletion") @NotNull Block_readAttributeColorCapabilitiesWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorCapabilitiesWithCompletion {
        @Generated
        void call_readAttributeColorCapabilitiesWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeColorCapabilitiesWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeColorCapabilitiesWithCompletionHandler:")
    public native void readAttributeColorCapabilitiesWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeColorCapabilitiesWithCompletionHandler") @NotNull Block_readAttributeColorCapabilitiesWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorCapabilitiesWithCompletionHandler {
        @Generated
        void call_readAttributeColorCapabilitiesWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeColorLoopActiveWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeColorLoopActiveWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeColorLoopActiveWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeColorLoopActiveWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeColorLoopActiveWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorLoopActiveWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeColorLoopActiveWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeColorLoopActiveWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeColorLoopActiveWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeColorLoopActiveWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeColorLoopActiveWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorLoopActiveWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeColorLoopActiveWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeColorLoopActiveWithCompletion:")
    public native void readAttributeColorLoopActiveWithCompletion(
            @ObjCBlock(name = "call_readAttributeColorLoopActiveWithCompletion") @NotNull Block_readAttributeColorLoopActiveWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorLoopActiveWithCompletion {
        @Generated
        void call_readAttributeColorLoopActiveWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeColorLoopActiveWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeColorLoopActiveWithCompletionHandler:")
    public native void readAttributeColorLoopActiveWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeColorLoopActiveWithCompletionHandler") @NotNull Block_readAttributeColorLoopActiveWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorLoopActiveWithCompletionHandler {
        @Generated
        void call_readAttributeColorLoopActiveWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeColorLoopDirectionWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeColorLoopDirectionWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeColorLoopDirectionWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeColorLoopDirectionWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeColorLoopDirectionWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorLoopDirectionWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeColorLoopDirectionWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeColorLoopDirectionWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeColorLoopDirectionWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeColorLoopDirectionWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeColorLoopDirectionWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorLoopDirectionWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeColorLoopDirectionWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeColorLoopDirectionWithCompletion:")
    public native void readAttributeColorLoopDirectionWithCompletion(
            @ObjCBlock(name = "call_readAttributeColorLoopDirectionWithCompletion") @NotNull Block_readAttributeColorLoopDirectionWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorLoopDirectionWithCompletion {
        @Generated
        void call_readAttributeColorLoopDirectionWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeColorLoopDirectionWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeColorLoopDirectionWithCompletionHandler:")
    public native void readAttributeColorLoopDirectionWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeColorLoopDirectionWithCompletionHandler") @NotNull Block_readAttributeColorLoopDirectionWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorLoopDirectionWithCompletionHandler {
        @Generated
        void call_readAttributeColorLoopDirectionWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributeColorLoopStartEnhancedHueWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeColorLoopStartEnhancedHueWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeColorLoopStartEnhancedHueWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeColorLoopStartEnhancedHueWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeColorLoopStartEnhancedHueWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorLoopStartEnhancedHueWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeColorLoopStartEnhancedHueWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeColorLoopStartEnhancedHueWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeColorLoopStartEnhancedHueWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeColorLoopStartEnhancedHueWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeColorLoopStartEnhancedHueWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorLoopStartEnhancedHueWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeColorLoopStartEnhancedHueWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeColorLoopStartEnhancedHueWithCompletion:")
    public native void readAttributeColorLoopStartEnhancedHueWithCompletion(
            @ObjCBlock(name = "call_readAttributeColorLoopStartEnhancedHueWithCompletion") @NotNull Block_readAttributeColorLoopStartEnhancedHueWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorLoopStartEnhancedHueWithCompletion {
        @Generated
        void call_readAttributeColorLoopStartEnhancedHueWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeColorLoopStartEnhancedHueWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeColorLoopStartEnhancedHueWithCompletionHandler:")
    public native void readAttributeColorLoopStartEnhancedHueWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeColorLoopStartEnhancedHueWithCompletionHandler") @NotNull Block_readAttributeColorLoopStartEnhancedHueWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorLoopStartEnhancedHueWithCompletionHandler {
        @Generated
        void call_readAttributeColorLoopStartEnhancedHueWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributeColorLoopStoredEnhancedHueWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeColorLoopStoredEnhancedHueWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeColorLoopStoredEnhancedHueWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeColorLoopStoredEnhancedHueWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeColorLoopStoredEnhancedHueWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorLoopStoredEnhancedHueWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeColorLoopStoredEnhancedHueWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeColorLoopStoredEnhancedHueWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeColorLoopStoredEnhancedHueWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeColorLoopStoredEnhancedHueWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeColorLoopStoredEnhancedHueWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorLoopStoredEnhancedHueWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeColorLoopStoredEnhancedHueWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeColorLoopStoredEnhancedHueWithCompletion:")
    public native void readAttributeColorLoopStoredEnhancedHueWithCompletion(
            @ObjCBlock(name = "call_readAttributeColorLoopStoredEnhancedHueWithCompletion") @NotNull Block_readAttributeColorLoopStoredEnhancedHueWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorLoopStoredEnhancedHueWithCompletion {
        @Generated
        void call_readAttributeColorLoopStoredEnhancedHueWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeColorLoopStoredEnhancedHueWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeColorLoopStoredEnhancedHueWithCompletionHandler:")
    public native void readAttributeColorLoopStoredEnhancedHueWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeColorLoopStoredEnhancedHueWithCompletionHandler") @NotNull Block_readAttributeColorLoopStoredEnhancedHueWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorLoopStoredEnhancedHueWithCompletionHandler {
        @Generated
        void call_readAttributeColorLoopStoredEnhancedHueWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeColorLoopTimeWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeColorLoopTimeWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeColorLoopTimeWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeColorLoopTimeWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeColorLoopTimeWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorLoopTimeWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeColorLoopTimeWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeColorLoopTimeWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeColorLoopTimeWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeColorLoopTimeWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeColorLoopTimeWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorLoopTimeWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeColorLoopTimeWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeColorLoopTimeWithCompletion:")
    public native void readAttributeColorLoopTimeWithCompletion(
            @ObjCBlock(name = "call_readAttributeColorLoopTimeWithCompletion") @NotNull Block_readAttributeColorLoopTimeWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorLoopTimeWithCompletion {
        @Generated
        void call_readAttributeColorLoopTimeWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeColorLoopTimeWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeColorLoopTimeWithCompletionHandler:")
    public native void readAttributeColorLoopTimeWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeColorLoopTimeWithCompletionHandler") @NotNull Block_readAttributeColorLoopTimeWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorLoopTimeWithCompletionHandler {
        @Generated
        void call_readAttributeColorLoopTimeWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeColorModeWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeColorModeWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeColorModeWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeColorModeWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeColorModeWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorModeWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeColorModeWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeColorModeWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeColorModeWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeColorModeWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeColorModeWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorModeWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeColorModeWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeColorModeWithCompletion:")
    public native void readAttributeColorModeWithCompletion(
            @ObjCBlock(name = "call_readAttributeColorModeWithCompletion") @NotNull Block_readAttributeColorModeWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorModeWithCompletion {
        @Generated
        void call_readAttributeColorModeWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeColorModeWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeColorModeWithCompletionHandler:")
    public native void readAttributeColorModeWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeColorModeWithCompletionHandler") @NotNull Block_readAttributeColorModeWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorModeWithCompletionHandler {
        @Generated
        void call_readAttributeColorModeWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeColorPointBIntensityWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeColorPointBIntensityWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeColorPointBIntensityWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeColorPointBIntensityWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeColorPointBIntensityWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorPointBIntensityWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeColorPointBIntensityWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeColorPointBIntensityWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeColorPointBIntensityWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeColorPointBIntensityWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeColorPointBIntensityWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorPointBIntensityWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeColorPointBIntensityWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeColorPointBIntensityWithCompletion:")
    public native void readAttributeColorPointBIntensityWithCompletion(
            @ObjCBlock(name = "call_readAttributeColorPointBIntensityWithCompletion") @NotNull Block_readAttributeColorPointBIntensityWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorPointBIntensityWithCompletion {
        @Generated
        void call_readAttributeColorPointBIntensityWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeColorPointBIntensityWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeColorPointBIntensityWithCompletionHandler:")
    public native void readAttributeColorPointBIntensityWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeColorPointBIntensityWithCompletionHandler") @NotNull Block_readAttributeColorPointBIntensityWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorPointBIntensityWithCompletionHandler {
        @Generated
        void call_readAttributeColorPointBIntensityWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeColorPointBXWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeColorPointBXWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeColorPointBXWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeColorPointBXWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeColorPointBXWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorPointBXWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeColorPointBXWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeColorPointBXWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeColorPointBXWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeColorPointBXWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeColorPointBXWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorPointBXWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeColorPointBXWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeColorPointBXWithCompletion:")
    public native void readAttributeColorPointBXWithCompletion(
            @ObjCBlock(name = "call_readAttributeColorPointBXWithCompletion") @NotNull Block_readAttributeColorPointBXWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorPointBXWithCompletion {
        @Generated
        void call_readAttributeColorPointBXWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeColorPointBXWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeColorPointBXWithCompletionHandler:")
    public native void readAttributeColorPointBXWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeColorPointBXWithCompletionHandler") @NotNull Block_readAttributeColorPointBXWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorPointBXWithCompletionHandler {
        @Generated
        void call_readAttributeColorPointBXWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeColorPointBYWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeColorPointBYWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeColorPointBYWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeColorPointBYWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeColorPointBYWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorPointBYWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeColorPointBYWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeColorPointBYWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeColorPointBYWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeColorPointBYWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeColorPointBYWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorPointBYWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeColorPointBYWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeColorPointBYWithCompletion:")
    public native void readAttributeColorPointBYWithCompletion(
            @ObjCBlock(name = "call_readAttributeColorPointBYWithCompletion") @NotNull Block_readAttributeColorPointBYWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorPointBYWithCompletion {
        @Generated
        void call_readAttributeColorPointBYWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeColorPointBYWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeColorPointBYWithCompletionHandler:")
    public native void readAttributeColorPointBYWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeColorPointBYWithCompletionHandler") @NotNull Block_readAttributeColorPointBYWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorPointBYWithCompletionHandler {
        @Generated
        void call_readAttributeColorPointBYWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeColorPointGIntensityWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeColorPointGIntensityWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeColorPointGIntensityWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeColorPointGIntensityWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeColorPointGIntensityWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorPointGIntensityWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeColorPointGIntensityWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeColorPointGIntensityWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeColorPointGIntensityWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeColorPointGIntensityWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeColorPointGIntensityWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorPointGIntensityWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeColorPointGIntensityWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeColorPointGIntensityWithCompletion:")
    public native void readAttributeColorPointGIntensityWithCompletion(
            @ObjCBlock(name = "call_readAttributeColorPointGIntensityWithCompletion") @NotNull Block_readAttributeColorPointGIntensityWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorPointGIntensityWithCompletion {
        @Generated
        void call_readAttributeColorPointGIntensityWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeColorPointGIntensityWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeColorPointGIntensityWithCompletionHandler:")
    public native void readAttributeColorPointGIntensityWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeColorPointGIntensityWithCompletionHandler") @NotNull Block_readAttributeColorPointGIntensityWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorPointGIntensityWithCompletionHandler {
        @Generated
        void call_readAttributeColorPointGIntensityWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeColorPointGXWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeColorPointGXWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeColorPointGXWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeColorPointGXWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeColorPointGXWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorPointGXWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeColorPointGXWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeColorPointGXWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeColorPointGXWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeColorPointGXWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeColorPointGXWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorPointGXWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeColorPointGXWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeColorPointGXWithCompletion:")
    public native void readAttributeColorPointGXWithCompletion(
            @ObjCBlock(name = "call_readAttributeColorPointGXWithCompletion") @NotNull Block_readAttributeColorPointGXWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorPointGXWithCompletion {
        @Generated
        void call_readAttributeColorPointGXWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeColorPointGXWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeColorPointGXWithCompletionHandler:")
    public native void readAttributeColorPointGXWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeColorPointGXWithCompletionHandler") @NotNull Block_readAttributeColorPointGXWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorPointGXWithCompletionHandler {
        @Generated
        void call_readAttributeColorPointGXWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeColorPointGYWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeColorPointGYWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeColorPointGYWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeColorPointGYWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeColorPointGYWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorPointGYWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeColorPointGYWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeColorPointGYWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeColorPointGYWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeColorPointGYWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeColorPointGYWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorPointGYWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeColorPointGYWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeColorPointGYWithCompletion:")
    public native void readAttributeColorPointGYWithCompletion(
            @ObjCBlock(name = "call_readAttributeColorPointGYWithCompletion") @NotNull Block_readAttributeColorPointGYWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorPointGYWithCompletion {
        @Generated
        void call_readAttributeColorPointGYWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeColorPointGYWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeColorPointGYWithCompletionHandler:")
    public native void readAttributeColorPointGYWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeColorPointGYWithCompletionHandler") @NotNull Block_readAttributeColorPointGYWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorPointGYWithCompletionHandler {
        @Generated
        void call_readAttributeColorPointGYWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeColorPointRIntensityWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeColorPointRIntensityWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeColorPointRIntensityWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeColorPointRIntensityWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeColorPointRIntensityWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorPointRIntensityWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeColorPointRIntensityWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeColorPointRIntensityWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeColorPointRIntensityWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeColorPointRIntensityWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeColorPointRIntensityWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorPointRIntensityWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeColorPointRIntensityWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeColorPointRIntensityWithCompletion:")
    public native void readAttributeColorPointRIntensityWithCompletion(
            @ObjCBlock(name = "call_readAttributeColorPointRIntensityWithCompletion") @NotNull Block_readAttributeColorPointRIntensityWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorPointRIntensityWithCompletion {
        @Generated
        void call_readAttributeColorPointRIntensityWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeColorPointRIntensityWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeColorPointRIntensityWithCompletionHandler:")
    public native void readAttributeColorPointRIntensityWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeColorPointRIntensityWithCompletionHandler") @NotNull Block_readAttributeColorPointRIntensityWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorPointRIntensityWithCompletionHandler {
        @Generated
        void call_readAttributeColorPointRIntensityWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeColorPointRXWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeColorPointRXWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeColorPointRXWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeColorPointRXWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeColorPointRXWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorPointRXWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeColorPointRXWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeColorPointRXWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeColorPointRXWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeColorPointRXWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeColorPointRXWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorPointRXWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeColorPointRXWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeColorPointRXWithCompletion:")
    public native void readAttributeColorPointRXWithCompletion(
            @ObjCBlock(name = "call_readAttributeColorPointRXWithCompletion") @NotNull Block_readAttributeColorPointRXWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorPointRXWithCompletion {
        @Generated
        void call_readAttributeColorPointRXWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeColorPointRXWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeColorPointRXWithCompletionHandler:")
    public native void readAttributeColorPointRXWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeColorPointRXWithCompletionHandler") @NotNull Block_readAttributeColorPointRXWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorPointRXWithCompletionHandler {
        @Generated
        void call_readAttributeColorPointRXWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeColorPointRYWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeColorPointRYWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeColorPointRYWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeColorPointRYWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeColorPointRYWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorPointRYWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeColorPointRYWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeColorPointRYWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeColorPointRYWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeColorPointRYWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeColorPointRYWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorPointRYWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeColorPointRYWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeColorPointRYWithCompletion:")
    public native void readAttributeColorPointRYWithCompletion(
            @ObjCBlock(name = "call_readAttributeColorPointRYWithCompletion") @NotNull Block_readAttributeColorPointRYWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorPointRYWithCompletion {
        @Generated
        void call_readAttributeColorPointRYWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeColorPointRYWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeColorPointRYWithCompletionHandler:")
    public native void readAttributeColorPointRYWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeColorPointRYWithCompletionHandler") @NotNull Block_readAttributeColorPointRYWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorPointRYWithCompletionHandler {
        @Generated
        void call_readAttributeColorPointRYWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributeColorTempPhysicalMaxMiredsWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeColorTempPhysicalMaxMiredsWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeColorTempPhysicalMaxMiredsWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeColorTempPhysicalMaxMiredsWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeColorTempPhysicalMaxMiredsWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorTempPhysicalMaxMiredsWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeColorTempPhysicalMaxMiredsWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeColorTempPhysicalMaxMiredsWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeColorTempPhysicalMaxMiredsWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeColorTempPhysicalMaxMiredsWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeColorTempPhysicalMaxMiredsWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorTempPhysicalMaxMiredsWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeColorTempPhysicalMaxMiredsWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeColorTempPhysicalMaxMiredsWithCompletion:")
    public native void readAttributeColorTempPhysicalMaxMiredsWithCompletion(
            @ObjCBlock(name = "call_readAttributeColorTempPhysicalMaxMiredsWithCompletion") @NotNull Block_readAttributeColorTempPhysicalMaxMiredsWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorTempPhysicalMaxMiredsWithCompletion {
        @Generated
        void call_readAttributeColorTempPhysicalMaxMiredsWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeColorTempPhysicalMaxMiredsWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeColorTempPhysicalMaxMiredsWithCompletionHandler:")
    public native void readAttributeColorTempPhysicalMaxMiredsWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeColorTempPhysicalMaxMiredsWithCompletionHandler") @NotNull Block_readAttributeColorTempPhysicalMaxMiredsWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorTempPhysicalMaxMiredsWithCompletionHandler {
        @Generated
        void call_readAttributeColorTempPhysicalMaxMiredsWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributeColorTempPhysicalMinMiredsWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeColorTempPhysicalMinMiredsWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeColorTempPhysicalMinMiredsWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeColorTempPhysicalMinMiredsWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeColorTempPhysicalMinMiredsWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorTempPhysicalMinMiredsWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeColorTempPhysicalMinMiredsWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeColorTempPhysicalMinMiredsWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeColorTempPhysicalMinMiredsWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeColorTempPhysicalMinMiredsWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeColorTempPhysicalMinMiredsWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorTempPhysicalMinMiredsWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeColorTempPhysicalMinMiredsWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeColorTempPhysicalMinMiredsWithCompletion:")
    public native void readAttributeColorTempPhysicalMinMiredsWithCompletion(
            @ObjCBlock(name = "call_readAttributeColorTempPhysicalMinMiredsWithCompletion") @NotNull Block_readAttributeColorTempPhysicalMinMiredsWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorTempPhysicalMinMiredsWithCompletion {
        @Generated
        void call_readAttributeColorTempPhysicalMinMiredsWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeColorTempPhysicalMinMiredsWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeColorTempPhysicalMinMiredsWithCompletionHandler:")
    public native void readAttributeColorTempPhysicalMinMiredsWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeColorTempPhysicalMinMiredsWithCompletionHandler") @NotNull Block_readAttributeColorTempPhysicalMinMiredsWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorTempPhysicalMinMiredsWithCompletionHandler {
        @Generated
        void call_readAttributeColorTempPhysicalMinMiredsWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeColorTemperatureMiredsWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeColorTemperatureMiredsWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeColorTemperatureMiredsWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeColorTemperatureMiredsWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeColorTemperatureMiredsWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorTemperatureMiredsWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeColorTemperatureMiredsWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeColorTemperatureMiredsWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeColorTemperatureMiredsWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeColorTemperatureMiredsWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeColorTemperatureMiredsWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorTemperatureMiredsWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeColorTemperatureMiredsWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeColorTemperatureMiredsWithCompletion:")
    public native void readAttributeColorTemperatureMiredsWithCompletion(
            @ObjCBlock(name = "call_readAttributeColorTemperatureMiredsWithCompletion") @NotNull Block_readAttributeColorTemperatureMiredsWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorTemperatureMiredsWithCompletion {
        @Generated
        void call_readAttributeColorTemperatureMiredsWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeColorTemperatureMiredsWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeColorTemperatureMiredsWithCompletionHandler:")
    public native void readAttributeColorTemperatureMiredsWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeColorTemperatureMiredsWithCompletionHandler") @NotNull Block_readAttributeColorTemperatureMiredsWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorTemperatureMiredsWithCompletionHandler {
        @Generated
        void call_readAttributeColorTemperatureMiredsWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeCompensationTextWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeCompensationTextWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeCompensationTextWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeCompensationTextWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeCompensationTextWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCompensationTextWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeCompensationTextWithAttributeCacheEndpointQueueCompletionHandler(@Nullable String value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeCompensationTextWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeCompensationTextWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeCompensationTextWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeCompensationTextWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCompensationTextWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeCompensationTextWithClusterStateCacheEndpointQueueCompletion(@Nullable String value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeCompensationTextWithCompletion:")
    public native void readAttributeCompensationTextWithCompletion(
            @ObjCBlock(name = "call_readAttributeCompensationTextWithCompletion") @NotNull Block_readAttributeCompensationTextWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCompensationTextWithCompletion {
        @Generated
        void call_readAttributeCompensationTextWithCompletion(@Nullable String value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeCompensationTextWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeCompensationTextWithCompletionHandler:")
    public native void readAttributeCompensationTextWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeCompensationTextWithCompletionHandler") @NotNull Block_readAttributeCompensationTextWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCompensationTextWithCompletionHandler {
        @Generated
        void call_readAttributeCompensationTextWithCompletionHandler(@Nullable String value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributeCoupleColorTempToLevelMinMiredsWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeCoupleColorTempToLevelMinMiredsWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeCoupleColorTempToLevelMinMiredsWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeCoupleColorTempToLevelMinMiredsWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeCoupleColorTempToLevelMinMiredsWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCoupleColorTempToLevelMinMiredsWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeCoupleColorTempToLevelMinMiredsWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeCoupleColorTempToLevelMinMiredsWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeCoupleColorTempToLevelMinMiredsWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeCoupleColorTempToLevelMinMiredsWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeCoupleColorTempToLevelMinMiredsWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCoupleColorTempToLevelMinMiredsWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeCoupleColorTempToLevelMinMiredsWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeCoupleColorTempToLevelMinMiredsWithCompletion:")
    public native void readAttributeCoupleColorTempToLevelMinMiredsWithCompletion(
            @ObjCBlock(name = "call_readAttributeCoupleColorTempToLevelMinMiredsWithCompletion") @NotNull Block_readAttributeCoupleColorTempToLevelMinMiredsWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCoupleColorTempToLevelMinMiredsWithCompletion {
        @Generated
        void call_readAttributeCoupleColorTempToLevelMinMiredsWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeCoupleColorTempToLevelMinMiredsWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeCoupleColorTempToLevelMinMiredsWithCompletionHandler:")
    public native void readAttributeCoupleColorTempToLevelMinMiredsWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeCoupleColorTempToLevelMinMiredsWithCompletionHandler") @NotNull Block_readAttributeCoupleColorTempToLevelMinMiredsWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCoupleColorTempToLevelMinMiredsWithCompletionHandler {
        @Generated
        void call_readAttributeCoupleColorTempToLevelMinMiredsWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeCurrentHueWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeCurrentHueWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeCurrentHueWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeCurrentHueWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeCurrentHueWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCurrentHueWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeCurrentHueWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeCurrentHueWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeCurrentHueWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeCurrentHueWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeCurrentHueWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCurrentHueWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeCurrentHueWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeCurrentHueWithCompletion:")
    public native void readAttributeCurrentHueWithCompletion(
            @ObjCBlock(name = "call_readAttributeCurrentHueWithCompletion") @NotNull Block_readAttributeCurrentHueWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCurrentHueWithCompletion {
        @Generated
        void call_readAttributeCurrentHueWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeCurrentHueWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeCurrentHueWithCompletionHandler:")
    public native void readAttributeCurrentHueWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeCurrentHueWithCompletionHandler") @NotNull Block_readAttributeCurrentHueWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCurrentHueWithCompletionHandler {
        @Generated
        void call_readAttributeCurrentHueWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeCurrentSaturationWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeCurrentSaturationWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeCurrentSaturationWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeCurrentSaturationWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeCurrentSaturationWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCurrentSaturationWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeCurrentSaturationWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeCurrentSaturationWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeCurrentSaturationWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeCurrentSaturationWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeCurrentSaturationWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCurrentSaturationWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeCurrentSaturationWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeCurrentSaturationWithCompletion:")
    public native void readAttributeCurrentSaturationWithCompletion(
            @ObjCBlock(name = "call_readAttributeCurrentSaturationWithCompletion") @NotNull Block_readAttributeCurrentSaturationWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCurrentSaturationWithCompletion {
        @Generated
        void call_readAttributeCurrentSaturationWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeCurrentSaturationWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeCurrentSaturationWithCompletionHandler:")
    public native void readAttributeCurrentSaturationWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeCurrentSaturationWithCompletionHandler") @NotNull Block_readAttributeCurrentSaturationWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCurrentSaturationWithCompletionHandler {
        @Generated
        void call_readAttributeCurrentSaturationWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeCurrentXWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeCurrentXWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeCurrentXWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeCurrentXWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeCurrentXWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCurrentXWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeCurrentXWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeCurrentXWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeCurrentXWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeCurrentXWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeCurrentXWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCurrentXWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeCurrentXWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeCurrentXWithCompletion:")
    public native void readAttributeCurrentXWithCompletion(
            @ObjCBlock(name = "call_readAttributeCurrentXWithCompletion") @NotNull Block_readAttributeCurrentXWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCurrentXWithCompletion {
        @Generated
        void call_readAttributeCurrentXWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeCurrentXWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeCurrentXWithCompletionHandler:")
    public native void readAttributeCurrentXWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeCurrentXWithCompletionHandler") @NotNull Block_readAttributeCurrentXWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCurrentXWithCompletionHandler {
        @Generated
        void call_readAttributeCurrentXWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeCurrentYWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeCurrentYWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeCurrentYWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeCurrentYWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeCurrentYWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCurrentYWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeCurrentYWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeCurrentYWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeCurrentYWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeCurrentYWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeCurrentYWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCurrentYWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeCurrentYWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeCurrentYWithCompletion:")
    public native void readAttributeCurrentYWithCompletion(
            @ObjCBlock(name = "call_readAttributeCurrentYWithCompletion") @NotNull Block_readAttributeCurrentYWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCurrentYWithCompletion {
        @Generated
        void call_readAttributeCurrentYWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeCurrentYWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeCurrentYWithCompletionHandler:")
    public native void readAttributeCurrentYWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeCurrentYWithCompletionHandler") @NotNull Block_readAttributeCurrentYWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCurrentYWithCompletionHandler {
        @Generated
        void call_readAttributeCurrentYWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeDriftCompensationWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeDriftCompensationWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeDriftCompensationWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeDriftCompensationWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeDriftCompensationWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDriftCompensationWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeDriftCompensationWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeDriftCompensationWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeDriftCompensationWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeDriftCompensationWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeDriftCompensationWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDriftCompensationWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeDriftCompensationWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeDriftCompensationWithCompletion:")
    public native void readAttributeDriftCompensationWithCompletion(
            @ObjCBlock(name = "call_readAttributeDriftCompensationWithCompletion") @NotNull Block_readAttributeDriftCompensationWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDriftCompensationWithCompletion {
        @Generated
        void call_readAttributeDriftCompensationWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeDriftCompensationWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeDriftCompensationWithCompletionHandler:")
    public native void readAttributeDriftCompensationWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeDriftCompensationWithCompletionHandler") @NotNull Block_readAttributeDriftCompensationWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDriftCompensationWithCompletionHandler {
        @Generated
        void call_readAttributeDriftCompensationWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeEnhancedColorModeWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeEnhancedColorModeWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeEnhancedColorModeWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeEnhancedColorModeWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeEnhancedColorModeWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeEnhancedColorModeWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeEnhancedColorModeWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeEnhancedColorModeWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeEnhancedColorModeWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeEnhancedColorModeWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeEnhancedColorModeWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeEnhancedColorModeWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeEnhancedColorModeWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeEnhancedColorModeWithCompletion:")
    public native void readAttributeEnhancedColorModeWithCompletion(
            @ObjCBlock(name = "call_readAttributeEnhancedColorModeWithCompletion") @NotNull Block_readAttributeEnhancedColorModeWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeEnhancedColorModeWithCompletion {
        @Generated
        void call_readAttributeEnhancedColorModeWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeEnhancedColorModeWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeEnhancedColorModeWithCompletionHandler:")
    public native void readAttributeEnhancedColorModeWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeEnhancedColorModeWithCompletionHandler") @NotNull Block_readAttributeEnhancedColorModeWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeEnhancedColorModeWithCompletionHandler {
        @Generated
        void call_readAttributeEnhancedColorModeWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeEnhancedCurrentHueWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeEnhancedCurrentHueWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeEnhancedCurrentHueWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeEnhancedCurrentHueWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeEnhancedCurrentHueWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeEnhancedCurrentHueWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeEnhancedCurrentHueWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeEnhancedCurrentHueWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeEnhancedCurrentHueWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeEnhancedCurrentHueWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeEnhancedCurrentHueWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeEnhancedCurrentHueWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeEnhancedCurrentHueWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeEnhancedCurrentHueWithCompletion:")
    public native void readAttributeEnhancedCurrentHueWithCompletion(
            @ObjCBlock(name = "call_readAttributeEnhancedCurrentHueWithCompletion") @NotNull Block_readAttributeEnhancedCurrentHueWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeEnhancedCurrentHueWithCompletion {
        @Generated
        void call_readAttributeEnhancedCurrentHueWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeEnhancedCurrentHueWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeEnhancedCurrentHueWithCompletionHandler:")
    public native void readAttributeEnhancedCurrentHueWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeEnhancedCurrentHueWithCompletionHandler") @NotNull Block_readAttributeEnhancedCurrentHueWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeEnhancedCurrentHueWithCompletionHandler {
        @Generated
        void call_readAttributeEnhancedCurrentHueWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
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
     * Deprecated-Message: Please use readAttributeNumberOfPrimariesWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNumberOfPrimariesWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeNumberOfPrimariesWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNumberOfPrimariesWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeNumberOfPrimariesWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNumberOfPrimariesWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeNumberOfPrimariesWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNumberOfPrimariesWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNumberOfPrimariesWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNumberOfPrimariesWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeNumberOfPrimariesWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNumberOfPrimariesWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeNumberOfPrimariesWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNumberOfPrimariesWithCompletion:")
    public native void readAttributeNumberOfPrimariesWithCompletion(
            @ObjCBlock(name = "call_readAttributeNumberOfPrimariesWithCompletion") @NotNull Block_readAttributeNumberOfPrimariesWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNumberOfPrimariesWithCompletion {
        @Generated
        void call_readAttributeNumberOfPrimariesWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNumberOfPrimariesWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNumberOfPrimariesWithCompletionHandler:")
    public native void readAttributeNumberOfPrimariesWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeNumberOfPrimariesWithCompletionHandler") @NotNull Block_readAttributeNumberOfPrimariesWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNumberOfPrimariesWithCompletionHandler {
        @Generated
        void call_readAttributeNumberOfPrimariesWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeOptionsWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeOptionsWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeOptionsWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeOptionsWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeOptionsWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOptionsWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeOptionsWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeOptionsWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeOptionsWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeOptionsWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeOptionsWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOptionsWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeOptionsWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeOptionsWithCompletion:")
    public native void readAttributeOptionsWithCompletion(
            @ObjCBlock(name = "call_readAttributeOptionsWithCompletion") @NotNull Block_readAttributeOptionsWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOptionsWithCompletion {
        @Generated
        void call_readAttributeOptionsWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeOptionsWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeOptionsWithCompletionHandler:")
    public native void readAttributeOptionsWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeOptionsWithCompletionHandler") @NotNull Block_readAttributeOptionsWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOptionsWithCompletionHandler {
        @Generated
        void call_readAttributeOptionsWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePrimary1IntensityWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePrimary1IntensityWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributePrimary1IntensityWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePrimary1IntensityWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributePrimary1IntensityWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary1IntensityWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributePrimary1IntensityWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePrimary1IntensityWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePrimary1IntensityWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePrimary1IntensityWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributePrimary1IntensityWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary1IntensityWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributePrimary1IntensityWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePrimary1IntensityWithCompletion:")
    public native void readAttributePrimary1IntensityWithCompletion(
            @ObjCBlock(name = "call_readAttributePrimary1IntensityWithCompletion") @NotNull Block_readAttributePrimary1IntensityWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary1IntensityWithCompletion {
        @Generated
        void call_readAttributePrimary1IntensityWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePrimary1IntensityWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePrimary1IntensityWithCompletionHandler:")
    public native void readAttributePrimary1IntensityWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributePrimary1IntensityWithCompletionHandler") @NotNull Block_readAttributePrimary1IntensityWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary1IntensityWithCompletionHandler {
        @Generated
        void call_readAttributePrimary1IntensityWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePrimary1XWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePrimary1XWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributePrimary1XWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePrimary1XWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributePrimary1XWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary1XWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributePrimary1XWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePrimary1XWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePrimary1XWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePrimary1XWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributePrimary1XWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary1XWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributePrimary1XWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePrimary1XWithCompletion:")
    public native void readAttributePrimary1XWithCompletion(
            @ObjCBlock(name = "call_readAttributePrimary1XWithCompletion") @NotNull Block_readAttributePrimary1XWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary1XWithCompletion {
        @Generated
        void call_readAttributePrimary1XWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePrimary1XWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePrimary1XWithCompletionHandler:")
    public native void readAttributePrimary1XWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributePrimary1XWithCompletionHandler") @NotNull Block_readAttributePrimary1XWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary1XWithCompletionHandler {
        @Generated
        void call_readAttributePrimary1XWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePrimary1YWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePrimary1YWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributePrimary1YWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePrimary1YWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributePrimary1YWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary1YWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributePrimary1YWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePrimary1YWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePrimary1YWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePrimary1YWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributePrimary1YWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary1YWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributePrimary1YWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePrimary1YWithCompletion:")
    public native void readAttributePrimary1YWithCompletion(
            @ObjCBlock(name = "call_readAttributePrimary1YWithCompletion") @NotNull Block_readAttributePrimary1YWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary1YWithCompletion {
        @Generated
        void call_readAttributePrimary1YWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePrimary1YWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePrimary1YWithCompletionHandler:")
    public native void readAttributePrimary1YWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributePrimary1YWithCompletionHandler") @NotNull Block_readAttributePrimary1YWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary1YWithCompletionHandler {
        @Generated
        void call_readAttributePrimary1YWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePrimary2IntensityWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePrimary2IntensityWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributePrimary2IntensityWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePrimary2IntensityWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributePrimary2IntensityWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary2IntensityWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributePrimary2IntensityWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePrimary2IntensityWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePrimary2IntensityWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePrimary2IntensityWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributePrimary2IntensityWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary2IntensityWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributePrimary2IntensityWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePrimary2IntensityWithCompletion:")
    public native void readAttributePrimary2IntensityWithCompletion(
            @ObjCBlock(name = "call_readAttributePrimary2IntensityWithCompletion") @NotNull Block_readAttributePrimary2IntensityWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary2IntensityWithCompletion {
        @Generated
        void call_readAttributePrimary2IntensityWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePrimary2IntensityWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePrimary2IntensityWithCompletionHandler:")
    public native void readAttributePrimary2IntensityWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributePrimary2IntensityWithCompletionHandler") @NotNull Block_readAttributePrimary2IntensityWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary2IntensityWithCompletionHandler {
        @Generated
        void call_readAttributePrimary2IntensityWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePrimary2XWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePrimary2XWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributePrimary2XWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePrimary2XWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributePrimary2XWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary2XWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributePrimary2XWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePrimary2XWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePrimary2XWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePrimary2XWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributePrimary2XWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary2XWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributePrimary2XWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePrimary2XWithCompletion:")
    public native void readAttributePrimary2XWithCompletion(
            @ObjCBlock(name = "call_readAttributePrimary2XWithCompletion") @NotNull Block_readAttributePrimary2XWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary2XWithCompletion {
        @Generated
        void call_readAttributePrimary2XWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePrimary2XWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePrimary2XWithCompletionHandler:")
    public native void readAttributePrimary2XWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributePrimary2XWithCompletionHandler") @NotNull Block_readAttributePrimary2XWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary2XWithCompletionHandler {
        @Generated
        void call_readAttributePrimary2XWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePrimary2YWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePrimary2YWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributePrimary2YWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePrimary2YWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributePrimary2YWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary2YWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributePrimary2YWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePrimary2YWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePrimary2YWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePrimary2YWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributePrimary2YWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary2YWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributePrimary2YWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePrimary2YWithCompletion:")
    public native void readAttributePrimary2YWithCompletion(
            @ObjCBlock(name = "call_readAttributePrimary2YWithCompletion") @NotNull Block_readAttributePrimary2YWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary2YWithCompletion {
        @Generated
        void call_readAttributePrimary2YWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePrimary2YWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePrimary2YWithCompletionHandler:")
    public native void readAttributePrimary2YWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributePrimary2YWithCompletionHandler") @NotNull Block_readAttributePrimary2YWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary2YWithCompletionHandler {
        @Generated
        void call_readAttributePrimary2YWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePrimary3IntensityWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePrimary3IntensityWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributePrimary3IntensityWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePrimary3IntensityWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributePrimary3IntensityWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary3IntensityWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributePrimary3IntensityWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePrimary3IntensityWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePrimary3IntensityWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePrimary3IntensityWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributePrimary3IntensityWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary3IntensityWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributePrimary3IntensityWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePrimary3IntensityWithCompletion:")
    public native void readAttributePrimary3IntensityWithCompletion(
            @ObjCBlock(name = "call_readAttributePrimary3IntensityWithCompletion") @NotNull Block_readAttributePrimary3IntensityWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary3IntensityWithCompletion {
        @Generated
        void call_readAttributePrimary3IntensityWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePrimary3IntensityWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePrimary3IntensityWithCompletionHandler:")
    public native void readAttributePrimary3IntensityWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributePrimary3IntensityWithCompletionHandler") @NotNull Block_readAttributePrimary3IntensityWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary3IntensityWithCompletionHandler {
        @Generated
        void call_readAttributePrimary3IntensityWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePrimary3XWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePrimary3XWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributePrimary3XWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePrimary3XWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributePrimary3XWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary3XWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributePrimary3XWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePrimary3XWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePrimary3XWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePrimary3XWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributePrimary3XWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary3XWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributePrimary3XWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePrimary3XWithCompletion:")
    public native void readAttributePrimary3XWithCompletion(
            @ObjCBlock(name = "call_readAttributePrimary3XWithCompletion") @NotNull Block_readAttributePrimary3XWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary3XWithCompletion {
        @Generated
        void call_readAttributePrimary3XWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePrimary3XWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePrimary3XWithCompletionHandler:")
    public native void readAttributePrimary3XWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributePrimary3XWithCompletionHandler") @NotNull Block_readAttributePrimary3XWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary3XWithCompletionHandler {
        @Generated
        void call_readAttributePrimary3XWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePrimary3YWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePrimary3YWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributePrimary3YWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePrimary3YWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributePrimary3YWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary3YWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributePrimary3YWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePrimary3YWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePrimary3YWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePrimary3YWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributePrimary3YWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary3YWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributePrimary3YWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePrimary3YWithCompletion:")
    public native void readAttributePrimary3YWithCompletion(
            @ObjCBlock(name = "call_readAttributePrimary3YWithCompletion") @NotNull Block_readAttributePrimary3YWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary3YWithCompletion {
        @Generated
        void call_readAttributePrimary3YWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePrimary3YWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePrimary3YWithCompletionHandler:")
    public native void readAttributePrimary3YWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributePrimary3YWithCompletionHandler") @NotNull Block_readAttributePrimary3YWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary3YWithCompletionHandler {
        @Generated
        void call_readAttributePrimary3YWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePrimary4IntensityWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePrimary4IntensityWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributePrimary4IntensityWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePrimary4IntensityWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributePrimary4IntensityWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary4IntensityWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributePrimary4IntensityWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePrimary4IntensityWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePrimary4IntensityWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePrimary4IntensityWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributePrimary4IntensityWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary4IntensityWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributePrimary4IntensityWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePrimary4IntensityWithCompletion:")
    public native void readAttributePrimary4IntensityWithCompletion(
            @ObjCBlock(name = "call_readAttributePrimary4IntensityWithCompletion") @NotNull Block_readAttributePrimary4IntensityWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary4IntensityWithCompletion {
        @Generated
        void call_readAttributePrimary4IntensityWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePrimary4IntensityWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePrimary4IntensityWithCompletionHandler:")
    public native void readAttributePrimary4IntensityWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributePrimary4IntensityWithCompletionHandler") @NotNull Block_readAttributePrimary4IntensityWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary4IntensityWithCompletionHandler {
        @Generated
        void call_readAttributePrimary4IntensityWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePrimary4XWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePrimary4XWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributePrimary4XWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePrimary4XWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributePrimary4XWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary4XWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributePrimary4XWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePrimary4XWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePrimary4XWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePrimary4XWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributePrimary4XWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary4XWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributePrimary4XWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePrimary4XWithCompletion:")
    public native void readAttributePrimary4XWithCompletion(
            @ObjCBlock(name = "call_readAttributePrimary4XWithCompletion") @NotNull Block_readAttributePrimary4XWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary4XWithCompletion {
        @Generated
        void call_readAttributePrimary4XWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePrimary4XWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePrimary4XWithCompletionHandler:")
    public native void readAttributePrimary4XWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributePrimary4XWithCompletionHandler") @NotNull Block_readAttributePrimary4XWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary4XWithCompletionHandler {
        @Generated
        void call_readAttributePrimary4XWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePrimary4YWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePrimary4YWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributePrimary4YWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePrimary4YWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributePrimary4YWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary4YWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributePrimary4YWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePrimary4YWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePrimary4YWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePrimary4YWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributePrimary4YWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary4YWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributePrimary4YWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePrimary4YWithCompletion:")
    public native void readAttributePrimary4YWithCompletion(
            @ObjCBlock(name = "call_readAttributePrimary4YWithCompletion") @NotNull Block_readAttributePrimary4YWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary4YWithCompletion {
        @Generated
        void call_readAttributePrimary4YWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePrimary4YWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePrimary4YWithCompletionHandler:")
    public native void readAttributePrimary4YWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributePrimary4YWithCompletionHandler") @NotNull Block_readAttributePrimary4YWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary4YWithCompletionHandler {
        @Generated
        void call_readAttributePrimary4YWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePrimary5IntensityWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePrimary5IntensityWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributePrimary5IntensityWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePrimary5IntensityWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributePrimary5IntensityWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary5IntensityWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributePrimary5IntensityWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePrimary5IntensityWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePrimary5IntensityWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePrimary5IntensityWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributePrimary5IntensityWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary5IntensityWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributePrimary5IntensityWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePrimary5IntensityWithCompletion:")
    public native void readAttributePrimary5IntensityWithCompletion(
            @ObjCBlock(name = "call_readAttributePrimary5IntensityWithCompletion") @NotNull Block_readAttributePrimary5IntensityWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary5IntensityWithCompletion {
        @Generated
        void call_readAttributePrimary5IntensityWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePrimary5IntensityWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePrimary5IntensityWithCompletionHandler:")
    public native void readAttributePrimary5IntensityWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributePrimary5IntensityWithCompletionHandler") @NotNull Block_readAttributePrimary5IntensityWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary5IntensityWithCompletionHandler {
        @Generated
        void call_readAttributePrimary5IntensityWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePrimary5XWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePrimary5XWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributePrimary5XWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePrimary5XWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributePrimary5XWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary5XWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributePrimary5XWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePrimary5XWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePrimary5XWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePrimary5XWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributePrimary5XWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary5XWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributePrimary5XWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePrimary5XWithCompletion:")
    public native void readAttributePrimary5XWithCompletion(
            @ObjCBlock(name = "call_readAttributePrimary5XWithCompletion") @NotNull Block_readAttributePrimary5XWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary5XWithCompletion {
        @Generated
        void call_readAttributePrimary5XWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePrimary5XWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePrimary5XWithCompletionHandler:")
    public native void readAttributePrimary5XWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributePrimary5XWithCompletionHandler") @NotNull Block_readAttributePrimary5XWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary5XWithCompletionHandler {
        @Generated
        void call_readAttributePrimary5XWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePrimary5YWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePrimary5YWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributePrimary5YWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePrimary5YWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributePrimary5YWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary5YWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributePrimary5YWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePrimary5YWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePrimary5YWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePrimary5YWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributePrimary5YWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary5YWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributePrimary5YWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePrimary5YWithCompletion:")
    public native void readAttributePrimary5YWithCompletion(
            @ObjCBlock(name = "call_readAttributePrimary5YWithCompletion") @NotNull Block_readAttributePrimary5YWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary5YWithCompletion {
        @Generated
        void call_readAttributePrimary5YWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePrimary5YWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePrimary5YWithCompletionHandler:")
    public native void readAttributePrimary5YWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributePrimary5YWithCompletionHandler") @NotNull Block_readAttributePrimary5YWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary5YWithCompletionHandler {
        @Generated
        void call_readAttributePrimary5YWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePrimary6IntensityWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePrimary6IntensityWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributePrimary6IntensityWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePrimary6IntensityWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributePrimary6IntensityWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary6IntensityWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributePrimary6IntensityWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePrimary6IntensityWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePrimary6IntensityWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePrimary6IntensityWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributePrimary6IntensityWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary6IntensityWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributePrimary6IntensityWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePrimary6IntensityWithCompletion:")
    public native void readAttributePrimary6IntensityWithCompletion(
            @ObjCBlock(name = "call_readAttributePrimary6IntensityWithCompletion") @NotNull Block_readAttributePrimary6IntensityWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary6IntensityWithCompletion {
        @Generated
        void call_readAttributePrimary6IntensityWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePrimary6IntensityWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePrimary6IntensityWithCompletionHandler:")
    public native void readAttributePrimary6IntensityWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributePrimary6IntensityWithCompletionHandler") @NotNull Block_readAttributePrimary6IntensityWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary6IntensityWithCompletionHandler {
        @Generated
        void call_readAttributePrimary6IntensityWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePrimary6XWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePrimary6XWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributePrimary6XWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePrimary6XWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributePrimary6XWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary6XWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributePrimary6XWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePrimary6XWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePrimary6XWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePrimary6XWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributePrimary6XWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary6XWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributePrimary6XWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePrimary6XWithCompletion:")
    public native void readAttributePrimary6XWithCompletion(
            @ObjCBlock(name = "call_readAttributePrimary6XWithCompletion") @NotNull Block_readAttributePrimary6XWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary6XWithCompletion {
        @Generated
        void call_readAttributePrimary6XWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePrimary6XWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePrimary6XWithCompletionHandler:")
    public native void readAttributePrimary6XWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributePrimary6XWithCompletionHandler") @NotNull Block_readAttributePrimary6XWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary6XWithCompletionHandler {
        @Generated
        void call_readAttributePrimary6XWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePrimary6YWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePrimary6YWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributePrimary6YWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePrimary6YWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributePrimary6YWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary6YWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributePrimary6YWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePrimary6YWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePrimary6YWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePrimary6YWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributePrimary6YWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary6YWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributePrimary6YWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePrimary6YWithCompletion:")
    public native void readAttributePrimary6YWithCompletion(
            @ObjCBlock(name = "call_readAttributePrimary6YWithCompletion") @NotNull Block_readAttributePrimary6YWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary6YWithCompletion {
        @Generated
        void call_readAttributePrimary6YWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePrimary6YWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePrimary6YWithCompletionHandler:")
    public native void readAttributePrimary6YWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributePrimary6YWithCompletionHandler") @NotNull Block_readAttributePrimary6YWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary6YWithCompletionHandler {
        @Generated
        void call_readAttributePrimary6YWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRemainingTimeWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRemainingTimeWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeRemainingTimeWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRemainingTimeWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeRemainingTimeWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRemainingTimeWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeRemainingTimeWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRemainingTimeWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRemainingTimeWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRemainingTimeWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeRemainingTimeWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRemainingTimeWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeRemainingTimeWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRemainingTimeWithCompletion:")
    public native void readAttributeRemainingTimeWithCompletion(
            @ObjCBlock(name = "call_readAttributeRemainingTimeWithCompletion") @NotNull Block_readAttributeRemainingTimeWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRemainingTimeWithCompletion {
        @Generated
        void call_readAttributeRemainingTimeWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRemainingTimeWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRemainingTimeWithCompletionHandler:")
    public native void readAttributeRemainingTimeWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeRemainingTimeWithCompletionHandler") @NotNull Block_readAttributeRemainingTimeWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRemainingTimeWithCompletionHandler {
        @Generated
        void call_readAttributeRemainingTimeWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributeStartUpColorTemperatureMiredsWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeStartUpColorTemperatureMiredsWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeStartUpColorTemperatureMiredsWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeStartUpColorTemperatureMiredsWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeStartUpColorTemperatureMiredsWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeStartUpColorTemperatureMiredsWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeStartUpColorTemperatureMiredsWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeStartUpColorTemperatureMiredsWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeStartUpColorTemperatureMiredsWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeStartUpColorTemperatureMiredsWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeStartUpColorTemperatureMiredsWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeStartUpColorTemperatureMiredsWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeStartUpColorTemperatureMiredsWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeStartUpColorTemperatureMiredsWithCompletion:")
    public native void readAttributeStartUpColorTemperatureMiredsWithCompletion(
            @ObjCBlock(name = "call_readAttributeStartUpColorTemperatureMiredsWithCompletion") @NotNull Block_readAttributeStartUpColorTemperatureMiredsWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeStartUpColorTemperatureMiredsWithCompletion {
        @Generated
        void call_readAttributeStartUpColorTemperatureMiredsWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeStartUpColorTemperatureMiredsWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeStartUpColorTemperatureMiredsWithCompletionHandler:")
    public native void readAttributeStartUpColorTemperatureMiredsWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeStartUpColorTemperatureMiredsWithCompletionHandler") @NotNull Block_readAttributeStartUpColorTemperatureMiredsWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeStartUpColorTemperatureMiredsWithCompletionHandler {
        @Generated
        void call_readAttributeStartUpColorTemperatureMiredsWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeWhitePointXWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeWhitePointXWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeWhitePointXWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeWhitePointXWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeWhitePointXWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeWhitePointXWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeWhitePointXWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeWhitePointXWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeWhitePointXWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeWhitePointXWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeWhitePointXWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeWhitePointXWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeWhitePointXWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeWhitePointXWithCompletion:")
    public native void readAttributeWhitePointXWithCompletion(
            @ObjCBlock(name = "call_readAttributeWhitePointXWithCompletion") @NotNull Block_readAttributeWhitePointXWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeWhitePointXWithCompletion {
        @Generated
        void call_readAttributeWhitePointXWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeWhitePointXWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeWhitePointXWithCompletionHandler:")
    public native void readAttributeWhitePointXWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeWhitePointXWithCompletionHandler") @NotNull Block_readAttributeWhitePointXWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeWhitePointXWithCompletionHandler {
        @Generated
        void call_readAttributeWhitePointXWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeWhitePointYWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeWhitePointYWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeWhitePointYWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeWhitePointYWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeWhitePointYWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeWhitePointYWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeWhitePointYWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeWhitePointYWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeWhitePointYWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeWhitePointYWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeWhitePointYWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeWhitePointYWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeWhitePointYWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeWhitePointYWithCompletion:")
    public native void readAttributeWhitePointYWithCompletion(
            @ObjCBlock(name = "call_readAttributeWhitePointYWithCompletion") @NotNull Block_readAttributeWhitePointYWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeWhitePointYWithCompletion {
        @Generated
        void call_readAttributeWhitePointYWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeWhitePointYWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeWhitePointYWithCompletionHandler:")
    public native void readAttributeWhitePointYWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeWhitePointYWithCompletionHandler") @NotNull Block_readAttributeWhitePointYWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeWhitePointYWithCompletionHandler {
        @Generated
        void call_readAttributeWhitePointYWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
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
     * Command StepColorTemperature
     * 
     * Command description for StepColorTemperature
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("stepColorTemperatureWithParams:completion:")
    public native void stepColorTemperatureWithParamsCompletion(
            @NotNull MTRColorControlClusterStepColorTemperatureParams params,
            @ObjCBlock(name = "call_stepColorTemperatureWithParamsCompletion") @NotNull Block_stepColorTemperatureWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_stepColorTemperatureWithParamsCompletion {
        @Generated
        void call_stepColorTemperatureWithParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use stepColorTemperatureWithParams:completion:
     */
    @Generated
    @Deprecated
    @Selector("stepColorTemperatureWithParams:completionHandler:")
    public native void stepColorTemperatureWithParamsCompletionHandler(
            @NotNull MTRColorControlClusterStepColorTemperatureParams params,
            @ObjCBlock(name = "call_stepColorTemperatureWithParamsCompletionHandler") @NotNull Block_stepColorTemperatureWithParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_stepColorTemperatureWithParamsCompletionHandler {
        @Generated
        void call_stepColorTemperatureWithParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * Command StepColor
     * 
     * Steps the lighting to a specific color.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("stepColorWithParams:completion:")
    public native void stepColorWithParamsCompletion(@NotNull MTRColorControlClusterStepColorParams params,
            @ObjCBlock(name = "call_stepColorWithParamsCompletion") @NotNull Block_stepColorWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_stepColorWithParamsCompletion {
        @Generated
        void call_stepColorWithParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use stepColorWithParams:completion:
     */
    @Generated
    @Deprecated
    @Selector("stepColorWithParams:completionHandler:")
    public native void stepColorWithParamsCompletionHandler(@NotNull MTRColorControlClusterStepColorParams params,
            @ObjCBlock(name = "call_stepColorWithParamsCompletionHandler") @NotNull Block_stepColorWithParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_stepColorWithParamsCompletionHandler {
        @Generated
        void call_stepColorWithParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * Command StepHue
     * 
     * Step hue up or down by specified size at specified rate.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("stepHueWithParams:completion:")
    public native void stepHueWithParamsCompletion(@NotNull MTRColorControlClusterStepHueParams params,
            @ObjCBlock(name = "call_stepHueWithParamsCompletion") @NotNull Block_stepHueWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_stepHueWithParamsCompletion {
        @Generated
        void call_stepHueWithParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use stepHueWithParams:completion:
     */
    @Generated
    @Deprecated
    @Selector("stepHueWithParams:completionHandler:")
    public native void stepHueWithParamsCompletionHandler(@NotNull MTRColorControlClusterStepHueParams params,
            @ObjCBlock(name = "call_stepHueWithParamsCompletionHandler") @NotNull Block_stepHueWithParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_stepHueWithParamsCompletionHandler {
        @Generated
        void call_stepHueWithParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * Command StepSaturation
     * 
     * Step saturation up or down by specified size at specified rate.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("stepSaturationWithParams:completion:")
    public native void stepSaturationWithParamsCompletion(@NotNull MTRColorControlClusterStepSaturationParams params,
            @ObjCBlock(name = "call_stepSaturationWithParamsCompletion") @NotNull Block_stepSaturationWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_stepSaturationWithParamsCompletion {
        @Generated
        void call_stepSaturationWithParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use stepSaturationWithParams:completion:
     */
    @Generated
    @Deprecated
    @Selector("stepSaturationWithParams:completionHandler:")
    public native void stepSaturationWithParamsCompletionHandler(
            @NotNull MTRColorControlClusterStepSaturationParams params,
            @ObjCBlock(name = "call_stepSaturationWithParamsCompletionHandler") @NotNull Block_stepSaturationWithParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_stepSaturationWithParamsCompletionHandler {
        @Generated
        void call_stepSaturationWithParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * Command StopMoveStep
     * 
     * Command description for StopMoveStep
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("stopMoveStepWithParams:completion:")
    public native void stopMoveStepWithParamsCompletion(@NotNull MTRColorControlClusterStopMoveStepParams params,
            @ObjCBlock(name = "call_stopMoveStepWithParamsCompletion") @NotNull Block_stopMoveStepWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_stopMoveStepWithParamsCompletion {
        @Generated
        void call_stopMoveStepWithParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use stopMoveStepWithParams:completion:
     */
    @Generated
    @Deprecated
    @Selector("stopMoveStepWithParams:completionHandler:")
    public native void stopMoveStepWithParamsCompletionHandler(@NotNull MTRColorControlClusterStopMoveStepParams params,
            @ObjCBlock(name = "call_stopMoveStepWithParamsCompletionHandler") @NotNull Block_stopMoveStepWithParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_stopMoveStepWithParamsCompletionHandler {
        @Generated
        void call_stopMoveStepWithParamsCompletionHandler(@Nullable NSError error);
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
     * Deprecated-Message: Please use subscribeAttributeColorCapabilitiesWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeColorCapabilitiesWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeColorCapabilitiesWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeColorCapabilitiesWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeColorCapabilitiesWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeColorCapabilitiesWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeColorCapabilitiesWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeColorCapabilitiesWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeColorCapabilitiesWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeColorCapabilitiesWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeColorCapabilitiesWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeColorCapabilitiesWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeColorCapabilitiesWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeColorCapabilitiesWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeColorCapabilitiesWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeColorCapabilitiesWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeColorCapabilitiesWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeColorCapabilitiesWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeColorCapabilitiesWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeColorCapabilitiesWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeColorCapabilitiesWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeColorLoopActiveWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeColorLoopActiveWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeColorLoopActiveWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeColorLoopActiveWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeColorLoopActiveWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeColorLoopActiveWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeColorLoopActiveWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeColorLoopActiveWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeColorLoopActiveWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeColorLoopActiveWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeColorLoopActiveWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeColorLoopActiveWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeColorLoopActiveWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeColorLoopActiveWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeColorLoopActiveWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeColorLoopActiveWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeColorLoopActiveWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeColorLoopActiveWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeColorLoopActiveWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeColorLoopActiveWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeColorLoopActiveWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeColorLoopDirectionWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeColorLoopDirectionWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeColorLoopDirectionWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeColorLoopDirectionWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeColorLoopDirectionWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeColorLoopDirectionWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeColorLoopDirectionWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeColorLoopDirectionWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeColorLoopDirectionWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeColorLoopDirectionWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeColorLoopDirectionWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeColorLoopDirectionWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeColorLoopDirectionWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeColorLoopDirectionWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeColorLoopDirectionWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeColorLoopDirectionWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeColorLoopDirectionWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeColorLoopDirectionWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeColorLoopDirectionWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeColorLoopDirectionWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeColorLoopDirectionWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeColorLoopStartEnhancedHueWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeColorLoopStartEnhancedHueWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeColorLoopStartEnhancedHueWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeColorLoopStartEnhancedHueWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeColorLoopStartEnhancedHueWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeColorLoopStartEnhancedHueWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeColorLoopStartEnhancedHueWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeColorLoopStartEnhancedHueWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeColorLoopStartEnhancedHueWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeColorLoopStartEnhancedHueWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeColorLoopStartEnhancedHueWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeColorLoopStartEnhancedHueWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeColorLoopStartEnhancedHueWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeColorLoopStartEnhancedHueWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeColorLoopStartEnhancedHueWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeColorLoopStartEnhancedHueWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeColorLoopStartEnhancedHueWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeColorLoopStartEnhancedHueWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeColorLoopStartEnhancedHueWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeColorLoopStartEnhancedHueWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeColorLoopStartEnhancedHueWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeColorLoopStoredEnhancedHueWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeColorLoopStoredEnhancedHueWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeColorLoopStoredEnhancedHueWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeColorLoopStoredEnhancedHueWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeColorLoopStoredEnhancedHueWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeColorLoopStoredEnhancedHueWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeColorLoopStoredEnhancedHueWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeColorLoopStoredEnhancedHueWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeColorLoopStoredEnhancedHueWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeColorLoopStoredEnhancedHueWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeColorLoopStoredEnhancedHueWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeColorLoopStoredEnhancedHueWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeColorLoopStoredEnhancedHueWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeColorLoopStoredEnhancedHueWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeColorLoopStoredEnhancedHueWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeColorLoopStoredEnhancedHueWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeColorLoopStoredEnhancedHueWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeColorLoopStoredEnhancedHueWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeColorLoopStoredEnhancedHueWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeColorLoopStoredEnhancedHueWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeColorLoopStoredEnhancedHueWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeColorLoopTimeWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeColorLoopTimeWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeColorLoopTimeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeColorLoopTimeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeColorLoopTimeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeColorLoopTimeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeColorLoopTimeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeColorLoopTimeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeColorLoopTimeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeColorLoopTimeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeColorLoopTimeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeColorLoopTimeWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeColorLoopTimeWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeColorLoopTimeWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeColorLoopTimeWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeColorLoopTimeWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeColorLoopTimeWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeColorLoopTimeWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeColorLoopTimeWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeColorLoopTimeWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeColorLoopTimeWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeColorModeWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeColorModeWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeColorModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeColorModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeColorModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeColorModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeColorModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeColorModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeColorModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeColorModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeColorModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeColorModeWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeColorModeWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeColorModeWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeColorModeWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeColorModeWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeColorModeWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeColorModeWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeColorModeWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeColorModeWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeColorModeWithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeColorPointBIntensityWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeColorPointBIntensityWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeColorPointBIntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeColorPointBIntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeColorPointBIntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeColorPointBIntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeColorPointBIntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeColorPointBIntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeColorPointBIntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeColorPointBIntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeColorPointBIntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeColorPointBIntensityWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeColorPointBIntensityWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeColorPointBIntensityWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeColorPointBIntensityWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeColorPointBIntensityWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeColorPointBIntensityWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeColorPointBIntensityWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeColorPointBIntensityWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeColorPointBIntensityWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeColorPointBIntensityWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeColorPointBXWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeColorPointBXWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeColorPointBXWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeColorPointBXWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeColorPointBXWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeColorPointBXWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeColorPointBXWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeColorPointBXWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeColorPointBXWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeColorPointBXWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeColorPointBXWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeColorPointBXWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeColorPointBXWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeColorPointBXWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeColorPointBXWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeColorPointBXWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeColorPointBXWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeColorPointBXWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeColorPointBXWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeColorPointBXWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeColorPointBXWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeColorPointBYWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeColorPointBYWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeColorPointBYWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeColorPointBYWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeColorPointBYWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeColorPointBYWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeColorPointBYWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeColorPointBYWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeColorPointBYWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeColorPointBYWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeColorPointBYWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeColorPointBYWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeColorPointBYWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeColorPointBYWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeColorPointBYWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeColorPointBYWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeColorPointBYWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeColorPointBYWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeColorPointBYWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeColorPointBYWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeColorPointBYWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeColorPointGIntensityWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeColorPointGIntensityWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeColorPointGIntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeColorPointGIntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeColorPointGIntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeColorPointGIntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeColorPointGIntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeColorPointGIntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeColorPointGIntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeColorPointGIntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeColorPointGIntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeColorPointGIntensityWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeColorPointGIntensityWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeColorPointGIntensityWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeColorPointGIntensityWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeColorPointGIntensityWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeColorPointGIntensityWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeColorPointGIntensityWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeColorPointGIntensityWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeColorPointGIntensityWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeColorPointGIntensityWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeColorPointGXWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeColorPointGXWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeColorPointGXWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeColorPointGXWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeColorPointGXWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeColorPointGXWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeColorPointGXWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeColorPointGXWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeColorPointGXWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeColorPointGXWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeColorPointGXWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeColorPointGXWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeColorPointGXWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeColorPointGXWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeColorPointGXWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeColorPointGXWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeColorPointGXWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeColorPointGXWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeColorPointGXWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeColorPointGXWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeColorPointGXWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeColorPointGYWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeColorPointGYWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeColorPointGYWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeColorPointGYWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeColorPointGYWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeColorPointGYWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeColorPointGYWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeColorPointGYWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeColorPointGYWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeColorPointGYWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeColorPointGYWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeColorPointGYWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeColorPointGYWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeColorPointGYWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeColorPointGYWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeColorPointGYWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeColorPointGYWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeColorPointGYWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeColorPointGYWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeColorPointGYWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeColorPointGYWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeColorPointRIntensityWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeColorPointRIntensityWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeColorPointRIntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeColorPointRIntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeColorPointRIntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeColorPointRIntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeColorPointRIntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeColorPointRIntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeColorPointRIntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeColorPointRIntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeColorPointRIntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeColorPointRIntensityWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeColorPointRIntensityWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeColorPointRIntensityWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeColorPointRIntensityWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeColorPointRIntensityWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeColorPointRIntensityWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeColorPointRIntensityWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeColorPointRIntensityWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeColorPointRIntensityWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeColorPointRIntensityWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeColorPointRXWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeColorPointRXWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeColorPointRXWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeColorPointRXWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeColorPointRXWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeColorPointRXWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeColorPointRXWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeColorPointRXWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeColorPointRXWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeColorPointRXWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeColorPointRXWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeColorPointRXWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeColorPointRXWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeColorPointRXWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeColorPointRXWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeColorPointRXWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeColorPointRXWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeColorPointRXWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeColorPointRXWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeColorPointRXWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeColorPointRXWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeColorPointRYWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeColorPointRYWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeColorPointRYWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeColorPointRYWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeColorPointRYWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeColorPointRYWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeColorPointRYWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeColorPointRYWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeColorPointRYWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeColorPointRYWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeColorPointRYWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeColorPointRYWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeColorPointRYWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeColorPointRYWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeColorPointRYWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeColorPointRYWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeColorPointRYWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeColorPointRYWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeColorPointRYWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeColorPointRYWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeColorPointRYWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeColorTempPhysicalMaxMiredsWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeColorTempPhysicalMaxMiredsWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeColorTempPhysicalMaxMiredsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeColorTempPhysicalMaxMiredsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeColorTempPhysicalMaxMiredsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeColorTempPhysicalMaxMiredsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeColorTempPhysicalMaxMiredsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeColorTempPhysicalMaxMiredsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeColorTempPhysicalMaxMiredsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeColorTempPhysicalMaxMiredsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeColorTempPhysicalMaxMiredsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeColorTempPhysicalMaxMiredsWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeColorTempPhysicalMaxMiredsWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeColorTempPhysicalMaxMiredsWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeColorTempPhysicalMaxMiredsWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeColorTempPhysicalMaxMiredsWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeColorTempPhysicalMaxMiredsWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeColorTempPhysicalMaxMiredsWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeColorTempPhysicalMaxMiredsWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeColorTempPhysicalMaxMiredsWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeColorTempPhysicalMaxMiredsWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeColorTempPhysicalMinMiredsWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeColorTempPhysicalMinMiredsWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeColorTempPhysicalMinMiredsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeColorTempPhysicalMinMiredsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeColorTempPhysicalMinMiredsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeColorTempPhysicalMinMiredsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeColorTempPhysicalMinMiredsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeColorTempPhysicalMinMiredsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeColorTempPhysicalMinMiredsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeColorTempPhysicalMinMiredsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeColorTempPhysicalMinMiredsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeColorTempPhysicalMinMiredsWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeColorTempPhysicalMinMiredsWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeColorTempPhysicalMinMiredsWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeColorTempPhysicalMinMiredsWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeColorTempPhysicalMinMiredsWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeColorTempPhysicalMinMiredsWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeColorTempPhysicalMinMiredsWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeColorTempPhysicalMinMiredsWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeColorTempPhysicalMinMiredsWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeColorTempPhysicalMinMiredsWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeColorTemperatureMiredsWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeColorTemperatureMiredsWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeColorTemperatureMiredsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeColorTemperatureMiredsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeColorTemperatureMiredsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeColorTemperatureMiredsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeColorTemperatureMiredsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeColorTemperatureMiredsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeColorTemperatureMiredsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeColorTemperatureMiredsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeColorTemperatureMiredsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeColorTemperatureMiredsWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeColorTemperatureMiredsWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeColorTemperatureMiredsWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeColorTemperatureMiredsWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeColorTemperatureMiredsWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeColorTemperatureMiredsWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeColorTemperatureMiredsWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeColorTemperatureMiredsWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeColorTemperatureMiredsWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeColorTemperatureMiredsWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeCompensationTextWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeCompensationTextWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeCompensationTextWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeCompensationTextWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeCompensationTextWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeCompensationTextWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeCompensationTextWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeCompensationTextWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeCompensationTextWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeCompensationTextWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeCompensationTextWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable String value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeCompensationTextWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeCompensationTextWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeCompensationTextWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeCompensationTextWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeCompensationTextWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeCompensationTextWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeCompensationTextWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeCompensationTextWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeCompensationTextWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeCompensationTextWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable String value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * subscribeAttributeCoupleColorTempToLevelMinMiredsWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeCoupleColorTempToLevelMinMiredsWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeCoupleColorTempToLevelMinMiredsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeCoupleColorTempToLevelMinMiredsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeCoupleColorTempToLevelMinMiredsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeCoupleColorTempToLevelMinMiredsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeCoupleColorTempToLevelMinMiredsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeCoupleColorTempToLevelMinMiredsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeCoupleColorTempToLevelMinMiredsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeCoupleColorTempToLevelMinMiredsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeCoupleColorTempToLevelMinMiredsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeCoupleColorTempToLevelMinMiredsWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeCoupleColorTempToLevelMinMiredsWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeCoupleColorTempToLevelMinMiredsWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeCoupleColorTempToLevelMinMiredsWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeCoupleColorTempToLevelMinMiredsWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeCoupleColorTempToLevelMinMiredsWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeCoupleColorTempToLevelMinMiredsWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeCoupleColorTempToLevelMinMiredsWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeCoupleColorTempToLevelMinMiredsWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeCoupleColorTempToLevelMinMiredsWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeCurrentHueWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeCurrentHueWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeCurrentHueWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeCurrentHueWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeCurrentHueWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeCurrentHueWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeCurrentHueWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeCurrentHueWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeCurrentHueWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeCurrentHueWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeCurrentHueWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeCurrentHueWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeCurrentHueWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeCurrentHueWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeCurrentHueWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeCurrentHueWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeCurrentHueWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeCurrentHueWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeCurrentHueWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeCurrentHueWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeCurrentHueWithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeCurrentSaturationWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeCurrentSaturationWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeCurrentSaturationWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeCurrentSaturationWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeCurrentSaturationWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeCurrentSaturationWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeCurrentSaturationWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeCurrentSaturationWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeCurrentSaturationWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeCurrentSaturationWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeCurrentSaturationWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeCurrentSaturationWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeCurrentSaturationWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeCurrentSaturationWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeCurrentSaturationWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeCurrentSaturationWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeCurrentSaturationWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeCurrentSaturationWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeCurrentSaturationWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeCurrentSaturationWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeCurrentSaturationWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeCurrentXWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeCurrentXWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeCurrentXWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeCurrentXWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeCurrentXWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeCurrentXWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeCurrentXWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeCurrentXWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeCurrentXWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeCurrentXWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeCurrentXWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeCurrentXWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeCurrentXWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeCurrentXWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeCurrentXWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeCurrentXWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeCurrentXWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeCurrentXWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeCurrentXWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeCurrentXWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeCurrentXWithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeCurrentYWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeCurrentYWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeCurrentYWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeCurrentYWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeCurrentYWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeCurrentYWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeCurrentYWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeCurrentYWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeCurrentYWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeCurrentYWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeCurrentYWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeCurrentYWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeCurrentYWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeCurrentYWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeCurrentYWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeCurrentYWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeCurrentYWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeCurrentYWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeCurrentYWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeCurrentYWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeCurrentYWithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeDriftCompensationWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeDriftCompensationWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeDriftCompensationWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeDriftCompensationWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeDriftCompensationWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeDriftCompensationWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeDriftCompensationWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDriftCompensationWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeDriftCompensationWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDriftCompensationWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeDriftCompensationWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeDriftCompensationWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeDriftCompensationWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeDriftCompensationWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeDriftCompensationWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeDriftCompensationWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeDriftCompensationWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDriftCompensationWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeDriftCompensationWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDriftCompensationWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeDriftCompensationWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeEnhancedColorModeWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeEnhancedColorModeWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeEnhancedColorModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeEnhancedColorModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeEnhancedColorModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeEnhancedColorModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeEnhancedColorModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeEnhancedColorModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeEnhancedColorModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeEnhancedColorModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeEnhancedColorModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeEnhancedColorModeWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeEnhancedColorModeWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeEnhancedColorModeWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeEnhancedColorModeWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeEnhancedColorModeWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeEnhancedColorModeWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeEnhancedColorModeWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeEnhancedColorModeWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeEnhancedColorModeWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeEnhancedColorModeWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeEnhancedCurrentHueWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeEnhancedCurrentHueWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeEnhancedCurrentHueWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeEnhancedCurrentHueWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeEnhancedCurrentHueWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeEnhancedCurrentHueWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeEnhancedCurrentHueWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeEnhancedCurrentHueWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeEnhancedCurrentHueWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeEnhancedCurrentHueWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeEnhancedCurrentHueWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeEnhancedCurrentHueWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeEnhancedCurrentHueWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeEnhancedCurrentHueWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeEnhancedCurrentHueWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeEnhancedCurrentHueWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeEnhancedCurrentHueWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeEnhancedCurrentHueWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeEnhancedCurrentHueWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeEnhancedCurrentHueWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeEnhancedCurrentHueWithParamsSubscriptionEstablishedReportHandler_2(
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
     * Deprecated-Message: Please use subscribeAttributeNumberOfPrimariesWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeNumberOfPrimariesWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNumberOfPrimariesWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNumberOfPrimariesWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeNumberOfPrimariesWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeNumberOfPrimariesWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeNumberOfPrimariesWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNumberOfPrimariesWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeNumberOfPrimariesWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNumberOfPrimariesWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeNumberOfPrimariesWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeNumberOfPrimariesWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNumberOfPrimariesWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNumberOfPrimariesWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeNumberOfPrimariesWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeNumberOfPrimariesWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeNumberOfPrimariesWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNumberOfPrimariesWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeNumberOfPrimariesWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNumberOfPrimariesWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeNumberOfPrimariesWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeOptionsWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeOptionsWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeOptionsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeOptionsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeOptionsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeOptionsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeOptionsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeOptionsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeOptionsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeOptionsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeOptionsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeOptionsWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeOptionsWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeOptionsWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeOptionsWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeOptionsWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeOptionsWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeOptionsWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeOptionsWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeOptionsWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeOptionsWithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributePrimary1IntensityWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributePrimary1IntensityWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePrimary1IntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePrimary1IntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributePrimary1IntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributePrimary1IntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributePrimary1IntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePrimary1IntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributePrimary1IntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePrimary1IntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributePrimary1IntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributePrimary1IntensityWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePrimary1IntensityWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePrimary1IntensityWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributePrimary1IntensityWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributePrimary1IntensityWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributePrimary1IntensityWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePrimary1IntensityWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributePrimary1IntensityWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePrimary1IntensityWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributePrimary1IntensityWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributePrimary1XWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributePrimary1XWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePrimary1XWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePrimary1XWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributePrimary1XWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributePrimary1XWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributePrimary1XWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePrimary1XWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributePrimary1XWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePrimary1XWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributePrimary1XWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributePrimary1XWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePrimary1XWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePrimary1XWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributePrimary1XWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributePrimary1XWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributePrimary1XWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePrimary1XWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributePrimary1XWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePrimary1XWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributePrimary1XWithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributePrimary1YWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributePrimary1YWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePrimary1YWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePrimary1YWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributePrimary1YWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributePrimary1YWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributePrimary1YWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePrimary1YWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributePrimary1YWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePrimary1YWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributePrimary1YWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributePrimary1YWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePrimary1YWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePrimary1YWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributePrimary1YWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributePrimary1YWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributePrimary1YWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePrimary1YWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributePrimary1YWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePrimary1YWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributePrimary1YWithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributePrimary2IntensityWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributePrimary2IntensityWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePrimary2IntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePrimary2IntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributePrimary2IntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributePrimary2IntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributePrimary2IntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePrimary2IntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributePrimary2IntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePrimary2IntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributePrimary2IntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributePrimary2IntensityWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePrimary2IntensityWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePrimary2IntensityWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributePrimary2IntensityWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributePrimary2IntensityWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributePrimary2IntensityWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePrimary2IntensityWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributePrimary2IntensityWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePrimary2IntensityWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributePrimary2IntensityWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributePrimary2XWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributePrimary2XWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePrimary2XWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePrimary2XWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributePrimary2XWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributePrimary2XWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributePrimary2XWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePrimary2XWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributePrimary2XWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePrimary2XWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributePrimary2XWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributePrimary2XWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePrimary2XWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePrimary2XWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributePrimary2XWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributePrimary2XWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributePrimary2XWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePrimary2XWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributePrimary2XWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePrimary2XWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributePrimary2XWithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributePrimary2YWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributePrimary2YWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePrimary2YWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePrimary2YWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributePrimary2YWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributePrimary2YWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributePrimary2YWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePrimary2YWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributePrimary2YWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePrimary2YWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributePrimary2YWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributePrimary2YWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePrimary2YWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePrimary2YWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributePrimary2YWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributePrimary2YWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributePrimary2YWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePrimary2YWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributePrimary2YWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePrimary2YWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributePrimary2YWithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributePrimary3IntensityWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributePrimary3IntensityWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePrimary3IntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePrimary3IntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributePrimary3IntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributePrimary3IntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributePrimary3IntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePrimary3IntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributePrimary3IntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePrimary3IntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributePrimary3IntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributePrimary3IntensityWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePrimary3IntensityWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePrimary3IntensityWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributePrimary3IntensityWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributePrimary3IntensityWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributePrimary3IntensityWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePrimary3IntensityWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributePrimary3IntensityWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePrimary3IntensityWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributePrimary3IntensityWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributePrimary3XWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributePrimary3XWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePrimary3XWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePrimary3XWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributePrimary3XWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributePrimary3XWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributePrimary3XWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePrimary3XWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributePrimary3XWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePrimary3XWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributePrimary3XWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributePrimary3XWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePrimary3XWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePrimary3XWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributePrimary3XWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributePrimary3XWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributePrimary3XWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePrimary3XWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributePrimary3XWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePrimary3XWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributePrimary3XWithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributePrimary3YWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributePrimary3YWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePrimary3YWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePrimary3YWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributePrimary3YWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributePrimary3YWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributePrimary3YWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePrimary3YWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributePrimary3YWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePrimary3YWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributePrimary3YWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributePrimary3YWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePrimary3YWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePrimary3YWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributePrimary3YWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributePrimary3YWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributePrimary3YWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePrimary3YWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributePrimary3YWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePrimary3YWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributePrimary3YWithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributePrimary4IntensityWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributePrimary4IntensityWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePrimary4IntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePrimary4IntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributePrimary4IntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributePrimary4IntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributePrimary4IntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePrimary4IntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributePrimary4IntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePrimary4IntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributePrimary4IntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributePrimary4IntensityWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePrimary4IntensityWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePrimary4IntensityWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributePrimary4IntensityWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributePrimary4IntensityWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributePrimary4IntensityWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePrimary4IntensityWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributePrimary4IntensityWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePrimary4IntensityWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributePrimary4IntensityWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributePrimary4XWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributePrimary4XWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePrimary4XWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePrimary4XWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributePrimary4XWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributePrimary4XWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributePrimary4XWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePrimary4XWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributePrimary4XWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePrimary4XWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributePrimary4XWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributePrimary4XWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePrimary4XWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePrimary4XWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributePrimary4XWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributePrimary4XWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributePrimary4XWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePrimary4XWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributePrimary4XWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePrimary4XWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributePrimary4XWithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributePrimary4YWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributePrimary4YWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePrimary4YWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePrimary4YWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributePrimary4YWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributePrimary4YWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributePrimary4YWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePrimary4YWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributePrimary4YWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePrimary4YWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributePrimary4YWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributePrimary4YWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePrimary4YWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePrimary4YWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributePrimary4YWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributePrimary4YWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributePrimary4YWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePrimary4YWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributePrimary4YWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePrimary4YWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributePrimary4YWithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributePrimary5IntensityWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributePrimary5IntensityWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePrimary5IntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePrimary5IntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributePrimary5IntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributePrimary5IntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributePrimary5IntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePrimary5IntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributePrimary5IntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePrimary5IntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributePrimary5IntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributePrimary5IntensityWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePrimary5IntensityWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePrimary5IntensityWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributePrimary5IntensityWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributePrimary5IntensityWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributePrimary5IntensityWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePrimary5IntensityWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributePrimary5IntensityWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePrimary5IntensityWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributePrimary5IntensityWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributePrimary5XWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributePrimary5XWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePrimary5XWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePrimary5XWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributePrimary5XWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributePrimary5XWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributePrimary5XWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePrimary5XWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributePrimary5XWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePrimary5XWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributePrimary5XWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributePrimary5XWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePrimary5XWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePrimary5XWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributePrimary5XWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributePrimary5XWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributePrimary5XWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePrimary5XWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributePrimary5XWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePrimary5XWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributePrimary5XWithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributePrimary5YWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributePrimary5YWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePrimary5YWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePrimary5YWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributePrimary5YWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributePrimary5YWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributePrimary5YWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePrimary5YWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributePrimary5YWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePrimary5YWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributePrimary5YWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributePrimary5YWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePrimary5YWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePrimary5YWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributePrimary5YWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributePrimary5YWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributePrimary5YWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePrimary5YWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributePrimary5YWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePrimary5YWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributePrimary5YWithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributePrimary6IntensityWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributePrimary6IntensityWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePrimary6IntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePrimary6IntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributePrimary6IntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributePrimary6IntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributePrimary6IntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePrimary6IntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributePrimary6IntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePrimary6IntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributePrimary6IntensityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributePrimary6IntensityWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePrimary6IntensityWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePrimary6IntensityWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributePrimary6IntensityWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributePrimary6IntensityWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributePrimary6IntensityWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePrimary6IntensityWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributePrimary6IntensityWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePrimary6IntensityWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributePrimary6IntensityWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributePrimary6XWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributePrimary6XWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePrimary6XWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePrimary6XWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributePrimary6XWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributePrimary6XWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributePrimary6XWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePrimary6XWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributePrimary6XWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePrimary6XWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributePrimary6XWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributePrimary6XWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePrimary6XWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePrimary6XWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributePrimary6XWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributePrimary6XWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributePrimary6XWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePrimary6XWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributePrimary6XWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePrimary6XWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributePrimary6XWithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributePrimary6YWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributePrimary6YWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePrimary6YWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePrimary6YWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributePrimary6YWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributePrimary6YWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributePrimary6YWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePrimary6YWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributePrimary6YWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePrimary6YWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributePrimary6YWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributePrimary6YWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePrimary6YWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePrimary6YWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributePrimary6YWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributePrimary6YWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributePrimary6YWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePrimary6YWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributePrimary6YWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePrimary6YWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributePrimary6YWithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeRemainingTimeWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeRemainingTimeWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRemainingTimeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRemainingTimeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeRemainingTimeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeRemainingTimeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeRemainingTimeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRemainingTimeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeRemainingTimeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRemainingTimeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeRemainingTimeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeRemainingTimeWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRemainingTimeWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRemainingTimeWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeRemainingTimeWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeRemainingTimeWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeRemainingTimeWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRemainingTimeWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeRemainingTimeWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRemainingTimeWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeRemainingTimeWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeStartUpColorTemperatureMiredsWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeStartUpColorTemperatureMiredsWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeStartUpColorTemperatureMiredsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeStartUpColorTemperatureMiredsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeStartUpColorTemperatureMiredsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeStartUpColorTemperatureMiredsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeStartUpColorTemperatureMiredsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeStartUpColorTemperatureMiredsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeStartUpColorTemperatureMiredsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeStartUpColorTemperatureMiredsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeStartUpColorTemperatureMiredsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeStartUpColorTemperatureMiredsWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeStartUpColorTemperatureMiredsWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeStartUpColorTemperatureMiredsWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeStartUpColorTemperatureMiredsWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeStartUpColorTemperatureMiredsWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeStartUpColorTemperatureMiredsWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeStartUpColorTemperatureMiredsWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeStartUpColorTemperatureMiredsWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeStartUpColorTemperatureMiredsWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeStartUpColorTemperatureMiredsWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeWhitePointXWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeWhitePointXWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeWhitePointXWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeWhitePointXWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeWhitePointXWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeWhitePointXWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeWhitePointXWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeWhitePointXWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeWhitePointXWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeWhitePointXWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeWhitePointXWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeWhitePointXWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeWhitePointXWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeWhitePointXWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeWhitePointXWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeWhitePointXWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeWhitePointXWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeWhitePointXWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeWhitePointXWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeWhitePointXWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeWhitePointXWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeWhitePointYWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeWhitePointYWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeWhitePointYWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeWhitePointYWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeWhitePointYWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeWhitePointYWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeWhitePointYWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeWhitePointYWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeWhitePointYWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeWhitePointYWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeWhitePointYWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeWhitePointYWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeWhitePointYWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeWhitePointYWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeWhitePointYWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeWhitePointYWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeWhitePointYWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeWhitePointYWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeWhitePointYWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeWhitePointYWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeWhitePointYWithParamsSubscriptionEstablishedReportHandler_2(
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
    @Selector("writeAttributeColorPointBIntensityWithValue:completion:")
    public native void writeAttributeColorPointBIntensityWithValueCompletion(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeColorPointBIntensityWithValueCompletion") @NotNull Block_writeAttributeColorPointBIntensityWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeColorPointBIntensityWithValueCompletion {
        @Generated
        void call_writeAttributeColorPointBIntensityWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeColorPointBIntensityWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeColorPointBIntensityWithValue:completionHandler:")
    public native void writeAttributeColorPointBIntensityWithValueCompletionHandler(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeColorPointBIntensityWithValueCompletionHandler") @NotNull Block_writeAttributeColorPointBIntensityWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeColorPointBIntensityWithValueCompletionHandler {
        @Generated
        void call_writeAttributeColorPointBIntensityWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeColorPointBIntensityWithValue:params:completion:")
    public native void writeAttributeColorPointBIntensityWithValueParamsCompletion(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeColorPointBIntensityWithValueParamsCompletion") @NotNull Block_writeAttributeColorPointBIntensityWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeColorPointBIntensityWithValueParamsCompletion {
        @Generated
        void call_writeAttributeColorPointBIntensityWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeColorPointBIntensityWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeColorPointBIntensityWithValue:params:completionHandler:")
    public native void writeAttributeColorPointBIntensityWithValueParamsCompletionHandler(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeColorPointBIntensityWithValueParamsCompletionHandler") @NotNull Block_writeAttributeColorPointBIntensityWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeColorPointBIntensityWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeColorPointBIntensityWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeColorPointBXWithValue:completion:")
    public native void writeAttributeColorPointBXWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeColorPointBXWithValueCompletion") @NotNull Block_writeAttributeColorPointBXWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeColorPointBXWithValueCompletion {
        @Generated
        void call_writeAttributeColorPointBXWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeColorPointBXWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeColorPointBXWithValue:completionHandler:")
    public native void writeAttributeColorPointBXWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeColorPointBXWithValueCompletionHandler") @NotNull Block_writeAttributeColorPointBXWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeColorPointBXWithValueCompletionHandler {
        @Generated
        void call_writeAttributeColorPointBXWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeColorPointBXWithValue:params:completion:")
    public native void writeAttributeColorPointBXWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeColorPointBXWithValueParamsCompletion") @NotNull Block_writeAttributeColorPointBXWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeColorPointBXWithValueParamsCompletion {
        @Generated
        void call_writeAttributeColorPointBXWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeColorPointBXWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeColorPointBXWithValue:params:completionHandler:")
    public native void writeAttributeColorPointBXWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeColorPointBXWithValueParamsCompletionHandler") @NotNull Block_writeAttributeColorPointBXWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeColorPointBXWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeColorPointBXWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeColorPointBYWithValue:completion:")
    public native void writeAttributeColorPointBYWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeColorPointBYWithValueCompletion") @NotNull Block_writeAttributeColorPointBYWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeColorPointBYWithValueCompletion {
        @Generated
        void call_writeAttributeColorPointBYWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeColorPointBYWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeColorPointBYWithValue:completionHandler:")
    public native void writeAttributeColorPointBYWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeColorPointBYWithValueCompletionHandler") @NotNull Block_writeAttributeColorPointBYWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeColorPointBYWithValueCompletionHandler {
        @Generated
        void call_writeAttributeColorPointBYWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeColorPointBYWithValue:params:completion:")
    public native void writeAttributeColorPointBYWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeColorPointBYWithValueParamsCompletion") @NotNull Block_writeAttributeColorPointBYWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeColorPointBYWithValueParamsCompletion {
        @Generated
        void call_writeAttributeColorPointBYWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeColorPointBYWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeColorPointBYWithValue:params:completionHandler:")
    public native void writeAttributeColorPointBYWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeColorPointBYWithValueParamsCompletionHandler") @NotNull Block_writeAttributeColorPointBYWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeColorPointBYWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeColorPointBYWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeColorPointGIntensityWithValue:completion:")
    public native void writeAttributeColorPointGIntensityWithValueCompletion(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeColorPointGIntensityWithValueCompletion") @NotNull Block_writeAttributeColorPointGIntensityWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeColorPointGIntensityWithValueCompletion {
        @Generated
        void call_writeAttributeColorPointGIntensityWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeColorPointGIntensityWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeColorPointGIntensityWithValue:completionHandler:")
    public native void writeAttributeColorPointGIntensityWithValueCompletionHandler(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeColorPointGIntensityWithValueCompletionHandler") @NotNull Block_writeAttributeColorPointGIntensityWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeColorPointGIntensityWithValueCompletionHandler {
        @Generated
        void call_writeAttributeColorPointGIntensityWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeColorPointGIntensityWithValue:params:completion:")
    public native void writeAttributeColorPointGIntensityWithValueParamsCompletion(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeColorPointGIntensityWithValueParamsCompletion") @NotNull Block_writeAttributeColorPointGIntensityWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeColorPointGIntensityWithValueParamsCompletion {
        @Generated
        void call_writeAttributeColorPointGIntensityWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeColorPointGIntensityWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeColorPointGIntensityWithValue:params:completionHandler:")
    public native void writeAttributeColorPointGIntensityWithValueParamsCompletionHandler(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeColorPointGIntensityWithValueParamsCompletionHandler") @NotNull Block_writeAttributeColorPointGIntensityWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeColorPointGIntensityWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeColorPointGIntensityWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeColorPointGXWithValue:completion:")
    public native void writeAttributeColorPointGXWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeColorPointGXWithValueCompletion") @NotNull Block_writeAttributeColorPointGXWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeColorPointGXWithValueCompletion {
        @Generated
        void call_writeAttributeColorPointGXWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeColorPointGXWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeColorPointGXWithValue:completionHandler:")
    public native void writeAttributeColorPointGXWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeColorPointGXWithValueCompletionHandler") @NotNull Block_writeAttributeColorPointGXWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeColorPointGXWithValueCompletionHandler {
        @Generated
        void call_writeAttributeColorPointGXWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeColorPointGXWithValue:params:completion:")
    public native void writeAttributeColorPointGXWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeColorPointGXWithValueParamsCompletion") @NotNull Block_writeAttributeColorPointGXWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeColorPointGXWithValueParamsCompletion {
        @Generated
        void call_writeAttributeColorPointGXWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeColorPointGXWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeColorPointGXWithValue:params:completionHandler:")
    public native void writeAttributeColorPointGXWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeColorPointGXWithValueParamsCompletionHandler") @NotNull Block_writeAttributeColorPointGXWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeColorPointGXWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeColorPointGXWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeColorPointGYWithValue:completion:")
    public native void writeAttributeColorPointGYWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeColorPointGYWithValueCompletion") @NotNull Block_writeAttributeColorPointGYWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeColorPointGYWithValueCompletion {
        @Generated
        void call_writeAttributeColorPointGYWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeColorPointGYWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeColorPointGYWithValue:completionHandler:")
    public native void writeAttributeColorPointGYWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeColorPointGYWithValueCompletionHandler") @NotNull Block_writeAttributeColorPointGYWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeColorPointGYWithValueCompletionHandler {
        @Generated
        void call_writeAttributeColorPointGYWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeColorPointGYWithValue:params:completion:")
    public native void writeAttributeColorPointGYWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeColorPointGYWithValueParamsCompletion") @NotNull Block_writeAttributeColorPointGYWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeColorPointGYWithValueParamsCompletion {
        @Generated
        void call_writeAttributeColorPointGYWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeColorPointGYWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeColorPointGYWithValue:params:completionHandler:")
    public native void writeAttributeColorPointGYWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeColorPointGYWithValueParamsCompletionHandler") @NotNull Block_writeAttributeColorPointGYWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeColorPointGYWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeColorPointGYWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeColorPointRIntensityWithValue:completion:")
    public native void writeAttributeColorPointRIntensityWithValueCompletion(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeColorPointRIntensityWithValueCompletion") @NotNull Block_writeAttributeColorPointRIntensityWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeColorPointRIntensityWithValueCompletion {
        @Generated
        void call_writeAttributeColorPointRIntensityWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeColorPointRIntensityWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeColorPointRIntensityWithValue:completionHandler:")
    public native void writeAttributeColorPointRIntensityWithValueCompletionHandler(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeColorPointRIntensityWithValueCompletionHandler") @NotNull Block_writeAttributeColorPointRIntensityWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeColorPointRIntensityWithValueCompletionHandler {
        @Generated
        void call_writeAttributeColorPointRIntensityWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeColorPointRIntensityWithValue:params:completion:")
    public native void writeAttributeColorPointRIntensityWithValueParamsCompletion(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeColorPointRIntensityWithValueParamsCompletion") @NotNull Block_writeAttributeColorPointRIntensityWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeColorPointRIntensityWithValueParamsCompletion {
        @Generated
        void call_writeAttributeColorPointRIntensityWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeColorPointRIntensityWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeColorPointRIntensityWithValue:params:completionHandler:")
    public native void writeAttributeColorPointRIntensityWithValueParamsCompletionHandler(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeColorPointRIntensityWithValueParamsCompletionHandler") @NotNull Block_writeAttributeColorPointRIntensityWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeColorPointRIntensityWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeColorPointRIntensityWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeColorPointRXWithValue:completion:")
    public native void writeAttributeColorPointRXWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeColorPointRXWithValueCompletion") @NotNull Block_writeAttributeColorPointRXWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeColorPointRXWithValueCompletion {
        @Generated
        void call_writeAttributeColorPointRXWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeColorPointRXWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeColorPointRXWithValue:completionHandler:")
    public native void writeAttributeColorPointRXWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeColorPointRXWithValueCompletionHandler") @NotNull Block_writeAttributeColorPointRXWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeColorPointRXWithValueCompletionHandler {
        @Generated
        void call_writeAttributeColorPointRXWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeColorPointRXWithValue:params:completion:")
    public native void writeAttributeColorPointRXWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeColorPointRXWithValueParamsCompletion") @NotNull Block_writeAttributeColorPointRXWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeColorPointRXWithValueParamsCompletion {
        @Generated
        void call_writeAttributeColorPointRXWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeColorPointRXWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeColorPointRXWithValue:params:completionHandler:")
    public native void writeAttributeColorPointRXWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeColorPointRXWithValueParamsCompletionHandler") @NotNull Block_writeAttributeColorPointRXWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeColorPointRXWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeColorPointRXWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeColorPointRYWithValue:completion:")
    public native void writeAttributeColorPointRYWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeColorPointRYWithValueCompletion") @NotNull Block_writeAttributeColorPointRYWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeColorPointRYWithValueCompletion {
        @Generated
        void call_writeAttributeColorPointRYWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeColorPointRYWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeColorPointRYWithValue:completionHandler:")
    public native void writeAttributeColorPointRYWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeColorPointRYWithValueCompletionHandler") @NotNull Block_writeAttributeColorPointRYWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeColorPointRYWithValueCompletionHandler {
        @Generated
        void call_writeAttributeColorPointRYWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeColorPointRYWithValue:params:completion:")
    public native void writeAttributeColorPointRYWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeColorPointRYWithValueParamsCompletion") @NotNull Block_writeAttributeColorPointRYWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeColorPointRYWithValueParamsCompletion {
        @Generated
        void call_writeAttributeColorPointRYWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeColorPointRYWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeColorPointRYWithValue:params:completionHandler:")
    public native void writeAttributeColorPointRYWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeColorPointRYWithValueParamsCompletionHandler") @NotNull Block_writeAttributeColorPointRYWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeColorPointRYWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeColorPointRYWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeOptionsWithValue:completion:")
    public native void writeAttributeOptionsWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeOptionsWithValueCompletion") @NotNull Block_writeAttributeOptionsWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeOptionsWithValueCompletion {
        @Generated
        void call_writeAttributeOptionsWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeOptionsWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeOptionsWithValue:completionHandler:")
    public native void writeAttributeOptionsWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeOptionsWithValueCompletionHandler") @NotNull Block_writeAttributeOptionsWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeOptionsWithValueCompletionHandler {
        @Generated
        void call_writeAttributeOptionsWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeOptionsWithValue:params:completion:")
    public native void writeAttributeOptionsWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeOptionsWithValueParamsCompletion") @NotNull Block_writeAttributeOptionsWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeOptionsWithValueParamsCompletion {
        @Generated
        void call_writeAttributeOptionsWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeOptionsWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeOptionsWithValue:params:completionHandler:")
    public native void writeAttributeOptionsWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeOptionsWithValueParamsCompletionHandler") @NotNull Block_writeAttributeOptionsWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeOptionsWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeOptionsWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeStartUpColorTemperatureMiredsWithValue:completion:")
    public native void writeAttributeStartUpColorTemperatureMiredsWithValueCompletion(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeStartUpColorTemperatureMiredsWithValueCompletion") @NotNull Block_writeAttributeStartUpColorTemperatureMiredsWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeStartUpColorTemperatureMiredsWithValueCompletion {
        @Generated
        void call_writeAttributeStartUpColorTemperatureMiredsWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeStartUpColorTemperatureMiredsWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeStartUpColorTemperatureMiredsWithValue:completionHandler:")
    public native void writeAttributeStartUpColorTemperatureMiredsWithValueCompletionHandler(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeStartUpColorTemperatureMiredsWithValueCompletionHandler") @NotNull Block_writeAttributeStartUpColorTemperatureMiredsWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeStartUpColorTemperatureMiredsWithValueCompletionHandler {
        @Generated
        void call_writeAttributeStartUpColorTemperatureMiredsWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeStartUpColorTemperatureMiredsWithValue:params:completion:")
    public native void writeAttributeStartUpColorTemperatureMiredsWithValueParamsCompletion(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeStartUpColorTemperatureMiredsWithValueParamsCompletion") @NotNull Block_writeAttributeStartUpColorTemperatureMiredsWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeStartUpColorTemperatureMiredsWithValueParamsCompletion {
        @Generated
        void call_writeAttributeStartUpColorTemperatureMiredsWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeStartUpColorTemperatureMiredsWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeStartUpColorTemperatureMiredsWithValue:params:completionHandler:")
    public native void writeAttributeStartUpColorTemperatureMiredsWithValueParamsCompletionHandler(
            @Nullable NSNumber value, @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeStartUpColorTemperatureMiredsWithValueParamsCompletionHandler") @NotNull Block_writeAttributeStartUpColorTemperatureMiredsWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeStartUpColorTemperatureMiredsWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeStartUpColorTemperatureMiredsWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeWhitePointXWithValue:completion:")
    public native void writeAttributeWhitePointXWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeWhitePointXWithValueCompletion") @NotNull Block_writeAttributeWhitePointXWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeWhitePointXWithValueCompletion {
        @Generated
        void call_writeAttributeWhitePointXWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeWhitePointXWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeWhitePointXWithValue:completionHandler:")
    public native void writeAttributeWhitePointXWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeWhitePointXWithValueCompletionHandler") @NotNull Block_writeAttributeWhitePointXWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeWhitePointXWithValueCompletionHandler {
        @Generated
        void call_writeAttributeWhitePointXWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeWhitePointXWithValue:params:completion:")
    public native void writeAttributeWhitePointXWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeWhitePointXWithValueParamsCompletion") @NotNull Block_writeAttributeWhitePointXWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeWhitePointXWithValueParamsCompletion {
        @Generated
        void call_writeAttributeWhitePointXWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeWhitePointXWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeWhitePointXWithValue:params:completionHandler:")
    public native void writeAttributeWhitePointXWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeWhitePointXWithValueParamsCompletionHandler") @NotNull Block_writeAttributeWhitePointXWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeWhitePointXWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeWhitePointXWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeWhitePointYWithValue:completion:")
    public native void writeAttributeWhitePointYWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeWhitePointYWithValueCompletion") @NotNull Block_writeAttributeWhitePointYWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeWhitePointYWithValueCompletion {
        @Generated
        void call_writeAttributeWhitePointYWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeWhitePointYWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeWhitePointYWithValue:completionHandler:")
    public native void writeAttributeWhitePointYWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeWhitePointYWithValueCompletionHandler") @NotNull Block_writeAttributeWhitePointYWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeWhitePointYWithValueCompletionHandler {
        @Generated
        void call_writeAttributeWhitePointYWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeWhitePointYWithValue:params:completion:")
    public native void writeAttributeWhitePointYWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeWhitePointYWithValueParamsCompletion") @NotNull Block_writeAttributeWhitePointYWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeWhitePointYWithValueParamsCompletion {
        @Generated
        void call_writeAttributeWhitePointYWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeWhitePointYWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeWhitePointYWithValue:params:completionHandler:")
    public native void writeAttributeWhitePointYWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeWhitePointYWithValueParamsCompletionHandler") @NotNull Block_writeAttributeWhitePointYWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeWhitePointYWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeWhitePointYWithValueParamsCompletionHandler(@Nullable NSError error);
    }
}