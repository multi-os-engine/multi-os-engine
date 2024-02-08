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
 * Cluster Media Playback
 * This cluster provides an interface for controlling Media Playback (PLAY, PAUSE, etc) on a media device such as a TV
 * or Speaker.
 * 
 * API-Since: 16.1
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRClusterMediaPlayback extends MTRCluster {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRClusterMediaPlayback(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRClusterMediaPlayback alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRClusterMediaPlayback allocWithZone(VoidPtr zone);

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
    @Selector("fastForwardWithExpectedValues:expectedValueInterval:completion:")
    public native void fastForwardWithExpectedValuesExpectedValueIntervalCompletion(
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedValues,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_fastForwardWithExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_fastForwardWithExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fastForwardWithExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_fastForwardWithExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRMediaPlaybackClusterPlaybackResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use fastForwardWithExpectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("fastForwardWithExpectedValues:expectedValueInterval:completionHandler:")
    public native void fastForwardWithExpectedValuesExpectedValueIntervalCompletionHandler(
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedValues,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_fastForwardWithExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_fastForwardWithExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fastForwardWithExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_fastForwardWithExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable MTRMediaPlaybackClusterPlaybackResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("fastForwardWithParams:expectedValues:expectedValueInterval:completion:")
    public native void fastForwardWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @Nullable MTRMediaPlaybackClusterFastForwardParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_fastForwardWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_fastForwardWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fastForwardWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_fastForwardWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRMediaPlaybackClusterPlaybackResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use fastForwardWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("fastForwardWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void fastForwardWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @Nullable MTRMediaPlaybackClusterFastForwardParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_fastForwardWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_fastForwardWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fastForwardWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_fastForwardWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable MTRMediaPlaybackClusterPlaybackResponseParams data, @Nullable NSError error);
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTRClusterMediaPlayback init();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use initWithDevice:endpoindID:queue:
     */
    @Generated
    @Deprecated
    @Selector("initWithDevice:endpoint:queue:")
    public native MTRClusterMediaPlayback initWithDeviceEndpointQueue(@NotNull MTRDevice device, char endpoint,
            @NotNull dispatch_queue_t queue);

    /**
     * For all instance methods that take a completion (i.e. command invocations),
     * the completion will be called on the provided queue.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("initWithDevice:endpointID:queue:")
    public native MTRClusterMediaPlayback initWithDeviceEndpointIDQueue(@NotNull MTRDevice device,
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
    public static native MTRClusterMediaPlayback new_objc();

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("nextWithExpectedValues:expectedValueInterval:completion:")
    public native void nextWithExpectedValuesExpectedValueIntervalCompletion(
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedValues,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_nextWithExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_nextWithExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_nextWithExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_nextWithExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRMediaPlaybackClusterPlaybackResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use nextWithExpectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("nextWithExpectedValues:expectedValueInterval:completionHandler:")
    public native void nextWithExpectedValuesExpectedValueIntervalCompletionHandler(
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedValues,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_nextWithExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_nextWithExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_nextWithExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_nextWithExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable MTRMediaPlaybackClusterPlaybackResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("nextWithParams:expectedValues:expectedValueInterval:completion:")
    public native void nextWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @Nullable MTRMediaPlaybackClusterNextParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_nextWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_nextWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_nextWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_nextWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRMediaPlaybackClusterPlaybackResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use nextWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("nextWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void nextWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @Nullable MTRMediaPlaybackClusterNextParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_nextWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_nextWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_nextWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_nextWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable MTRMediaPlaybackClusterPlaybackResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("pauseWithExpectedValues:expectedValueInterval:completion:")
    public native void pauseWithExpectedValuesExpectedValueIntervalCompletion(
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedValues,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_pauseWithExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_pauseWithExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_pauseWithExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_pauseWithExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRMediaPlaybackClusterPlaybackResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use pauseWithExpectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("pauseWithExpectedValues:expectedValueInterval:completionHandler:")
    public native void pauseWithExpectedValuesExpectedValueIntervalCompletionHandler(
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedValues,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_pauseWithExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_pauseWithExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_pauseWithExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_pauseWithExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable MTRMediaPlaybackClusterPlaybackResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("pauseWithParams:expectedValues:expectedValueInterval:completion:")
    public native void pauseWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @Nullable MTRMediaPlaybackClusterPauseParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_pauseWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_pauseWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_pauseWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_pauseWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRMediaPlaybackClusterPlaybackResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use pauseWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("pauseWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void pauseWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @Nullable MTRMediaPlaybackClusterPauseParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_pauseWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_pauseWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_pauseWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_pauseWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable MTRMediaPlaybackClusterPlaybackResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("playWithExpectedValues:expectedValueInterval:completion:")
    public native void playWithExpectedValuesExpectedValueIntervalCompletion(
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedValues,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_playWithExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_playWithExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_playWithExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_playWithExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRMediaPlaybackClusterPlaybackResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use playWithExpectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("playWithExpectedValues:expectedValueInterval:completionHandler:")
    public native void playWithExpectedValuesExpectedValueIntervalCompletionHandler(
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedValues,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_playWithExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_playWithExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_playWithExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_playWithExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable MTRMediaPlaybackClusterPlaybackResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("playWithParams:expectedValues:expectedValueInterval:completion:")
    public native void playWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @Nullable MTRMediaPlaybackClusterPlayParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_playWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_playWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_playWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_playWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRMediaPlaybackClusterPlaybackResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use playWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("playWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void playWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @Nullable MTRMediaPlaybackClusterPlayParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_playWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_playWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_playWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_playWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable MTRMediaPlaybackClusterPlaybackResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("previousWithExpectedValues:expectedValueInterval:completion:")
    public native void previousWithExpectedValuesExpectedValueIntervalCompletion(
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedValues,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_previousWithExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_previousWithExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_previousWithExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_previousWithExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRMediaPlaybackClusterPlaybackResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use previousWithExpectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("previousWithExpectedValues:expectedValueInterval:completionHandler:")
    public native void previousWithExpectedValuesExpectedValueIntervalCompletionHandler(
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedValues,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_previousWithExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_previousWithExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_previousWithExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_previousWithExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable MTRMediaPlaybackClusterPlaybackResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("previousWithParams:expectedValues:expectedValueInterval:completion:")
    public native void previousWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @Nullable MTRMediaPlaybackClusterPreviousParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_previousWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_previousWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_previousWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_previousWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRMediaPlaybackClusterPlaybackResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use previousWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("previousWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void previousWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @Nullable MTRMediaPlaybackClusterPreviousParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_previousWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_previousWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_previousWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_previousWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable MTRMediaPlaybackClusterPlaybackResponseParams data, @Nullable NSError error);
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
    @Selector("readAttributeCurrentStateWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeCurrentStateWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeDurationWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeDurationWithParams(@Nullable MTRReadParams params);

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
    @Selector("readAttributePlaybackSpeedWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributePlaybackSpeedWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeSampledPositionWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeSampledPositionWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeSeekRangeEndWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeSeekRangeEndWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeSeekRangeStartWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeSeekRangeStartWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeStartTimeWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeStartTimeWithParams(@Nullable MTRReadParams params);

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
    @Selector("rewindWithExpectedValues:expectedValueInterval:completion:")
    public native void rewindWithExpectedValuesExpectedValueIntervalCompletion(
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedValues,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_rewindWithExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_rewindWithExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_rewindWithExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_rewindWithExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRMediaPlaybackClusterPlaybackResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use rewindWithExpectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("rewindWithExpectedValues:expectedValueInterval:completionHandler:")
    public native void rewindWithExpectedValuesExpectedValueIntervalCompletionHandler(
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedValues,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_rewindWithExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_rewindWithExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_rewindWithExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_rewindWithExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable MTRMediaPlaybackClusterPlaybackResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("rewindWithParams:expectedValues:expectedValueInterval:completion:")
    public native void rewindWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @Nullable MTRMediaPlaybackClusterRewindParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_rewindWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_rewindWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_rewindWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_rewindWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRMediaPlaybackClusterPlaybackResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use rewindWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("rewindWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void rewindWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @Nullable MTRMediaPlaybackClusterRewindParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_rewindWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_rewindWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_rewindWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_rewindWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable MTRMediaPlaybackClusterPlaybackResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("seekWithParams:expectedValues:expectedValueInterval:completion:")
    public native void seekWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRMediaPlaybackClusterSeekParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_seekWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_seekWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_seekWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_seekWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRMediaPlaybackClusterPlaybackResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use seekWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("seekWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void seekWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRMediaPlaybackClusterSeekParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_seekWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_seekWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_seekWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_seekWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable MTRMediaPlaybackClusterPlaybackResponseParams data, @Nullable NSError error);
    }

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("skipBackwardWithParams:expectedValues:expectedValueInterval:completion:")
    public native void skipBackwardWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRMediaPlaybackClusterSkipBackwardParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_skipBackwardWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_skipBackwardWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_skipBackwardWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_skipBackwardWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRMediaPlaybackClusterPlaybackResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use skipBackwardWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("skipBackwardWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void skipBackwardWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRMediaPlaybackClusterSkipBackwardParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_skipBackwardWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_skipBackwardWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_skipBackwardWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_skipBackwardWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable MTRMediaPlaybackClusterPlaybackResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("skipForwardWithParams:expectedValues:expectedValueInterval:completion:")
    public native void skipForwardWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRMediaPlaybackClusterSkipForwardParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_skipForwardWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_skipForwardWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_skipForwardWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_skipForwardWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRMediaPlaybackClusterPlaybackResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use skipForwardWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("skipForwardWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void skipForwardWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRMediaPlaybackClusterSkipForwardParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_skipForwardWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_skipForwardWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_skipForwardWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_skipForwardWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable MTRMediaPlaybackClusterPlaybackResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("startOverWithExpectedValues:expectedValueInterval:completion:")
    public native void startOverWithExpectedValuesExpectedValueIntervalCompletion(
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedValues,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_startOverWithExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_startOverWithExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_startOverWithExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_startOverWithExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRMediaPlaybackClusterPlaybackResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use startOverWithExpectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("startOverWithExpectedValues:expectedValueInterval:completionHandler:")
    public native void startOverWithExpectedValuesExpectedValueIntervalCompletionHandler(
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedValues,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_startOverWithExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_startOverWithExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_startOverWithExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_startOverWithExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable MTRMediaPlaybackClusterPlaybackResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("startOverWithParams:expectedValues:expectedValueInterval:completion:")
    public native void startOverWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @Nullable MTRMediaPlaybackClusterStartOverParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_startOverWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_startOverWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_startOverWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_startOverWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRMediaPlaybackClusterPlaybackResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use startOverWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("startOverWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void startOverWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @Nullable MTRMediaPlaybackClusterStartOverParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_startOverWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_startOverWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_startOverWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_startOverWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable MTRMediaPlaybackClusterPlaybackResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use stopWithExpectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("stopPlaybackWithExpectedValues:expectedValueInterval:completionHandler:")
    public native void stopPlaybackWithExpectedValuesExpectedValueIntervalCompletionHandler(
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedValues,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_stopPlaybackWithExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_stopPlaybackWithExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_stopPlaybackWithExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_stopPlaybackWithExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable MTRMediaPlaybackClusterPlaybackResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use stopWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("stopPlaybackWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void stopPlaybackWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @Nullable MTRMediaPlaybackClusterStopPlaybackParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_stopPlaybackWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_stopPlaybackWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_stopPlaybackWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_stopPlaybackWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable MTRMediaPlaybackClusterPlaybackResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("stopWithExpectedValues:expectedValueInterval:completion:")
    public native void stopWithExpectedValuesExpectedValueIntervalCompletion(
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedValues,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_stopWithExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_stopWithExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_stopWithExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_stopWithExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRMediaPlaybackClusterPlaybackResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("stopWithParams:expectedValues:expectedValueInterval:completion:")
    public native void stopWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @Nullable MTRMediaPlaybackClusterStopParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_stopWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_stopWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_stopWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_stopWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRMediaPlaybackClusterPlaybackResponseParams data, @Nullable NSError error);
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