package apple.corehaptics;

import apple.NSObject;
import apple.avfaudio.AVAudioSession;
import apple.corehaptics.protocol.CHHapticAdvancedPatternPlayer;
import apple.corehaptics.protocol.CHHapticDeviceCapability;
import apple.corehaptics.protocol.CHHapticPatternPlayer;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * CHHapticEngine
 * 
 * Represents the connection with the haptic server.
 * 
 * API-Since: 13.0
 */
@Generated
@Library("CoreHaptics")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CHHapticEngine extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected CHHapticEngine(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CHHapticEngine alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CHHapticEngine allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    /**
     * capabilitiesForHardware
     * 
     * Get the protocol that describes haptic and audio capabilities on this device.
     * 
     * Detailed description on the capability protocol is in CHHapticDeviceCapability.h.
     */
    @NotNull
    @Generated
    @Selector("capabilitiesForHardware")
    @MappedReturn(ObjCObjectMapper.class)
    public static native CHHapticDeviceCapability capabilitiesForHardware();

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    /**
     * createAdvancedPlayerWithPattern:error
     * 
     * Factory method for creating a CHHapticAdvancedPatternPlayer from a CHHapticPattern.
     * 
     * @param pattern
     *                The pattern to be played.
     */
    @Nullable
    @Generated
    @Selector("createAdvancedPlayerWithPattern:error:")
    @MappedReturn(ObjCObjectMapper.class)
    public native CHHapticAdvancedPatternPlayer createAdvancedPlayerWithPatternError(@NotNull CHHapticPattern pattern,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * createPlayerWithPattern:error
     * 
     * Factory method for creating a CHHapticPatternPlayer from a CHHapticPattern.
     * 
     * @param pattern
     *                The pattern to be played.
     */
    @Nullable
    @Generated
    @Selector("createPlayerWithPattern:error:")
    @MappedReturn(ObjCObjectMapper.class)
    public native CHHapticPatternPlayer createPlayerWithPatternError(@NotNull CHHapticPattern pattern,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * [@property] currentTime
     * The absolute time from which all current and future event times may be calculated.
     * The units are seconds.
     */
    @Generated
    @Selector("currentTime")
    public native double currentTime();

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
    public native CHHapticEngine init();

    /**
     * initAndReturnError:
     * 
     * Create an instance of the CHHapticEngine.
     * 
     * More than one instance may exist within a process. Each will function independently of the others.
     * CHHapticEngines created using this method will be associated with the device's internal haptics hardware system,
     * if one exists. For systems without internal haptics, this method will fail with the error
     * `CHHapticErrorCodeNotSupported`.
     * To access engine instances associated with external game controllers, see the GameController framework
     * documentation
     * for the `hapticEngines` property on the GCController class.
     */
    @Generated
    @Selector("initAndReturnError:")
    public native CHHapticEngine initAndReturnError(@Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * initWithAudioSession:error
     * 
     * Create an instance of an CHHapticEngine and associate it with an audio session. If 'audioSession' is nil,
     * the engine will create its own.
     * 
     * More than one instance may exist within a process. Each will function independently of the others, but all
     * CHHapticEngines which share an audio session will have identical audio behavior with regard to interruptions,
     * etc.
     * CHHapticEngines created using this method will be associated with the device's internal haptics hardware system,
     * if one exists. For systems without internal haptics, this method will fail with the error
     * `CHHapticErrorCodeNotSupported`.
     * To access engine instances associated with external game controllers, see the GameController framework
     * documentation
     * for the `hapticEngines` property on the GCController class.
     */
    @Generated
    @Selector("initWithAudioSession:error:")
    public native CHHapticEngine initWithAudioSessionError(@Nullable AVAudioSession audioSession,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

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
     * [@property] autoShutdownEnabled
     * 
     * When auto shutdown is enabled, the haptic engine can start and stop the hardware dynamically,
     * to conserve power.
     * 
     * To conserve power, it is advised that the client stop the haptic engine when not in use.
     * But when auto shutdown is enabled, the haptic engine will stop the hardware if it was running
     * idle for a certain duration, and restart it later when required.
     * Note that, because this operation is dynamic, it may affect the start times of the pattern players
     * (e.g. `CHHapticPatternplayer`), if the engine has to resume from its shutdown state.
     * 
     * This feature is disabled by default, but the client can enable it if needed.
     */
    @Generated
    @Selector("isAutoShutdownEnabled")
    public native boolean isAutoShutdownEnabled();

    /**
     * [@property] isMutedForAudio
     * When set to YES, the CHHapticEngine mutes audio playback from its players.
     * 
     * Default is NO.
     */
    @Generated
    @Selector("isMutedForAudio")
    public native boolean isMutedForAudio();

    /**
     * [@property] isMutedForHaptics
     * When set to YES, the CHHapticEngine mutes haptic playback from its players.
     * 
     * Default is NO.
     */
    @Generated
    @Selector("isMutedForHaptics")
    public native boolean isMutedForHaptics();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native CHHapticEngine new_objc();

    /**
     * notifyWhenPlayersFinished:
     * 
     * Tell the engine to asynchronously call the passed-in handler when all active pattern players associated
     * with this engine have stopped.
     * 
     * If additional players are started after this call is made, they will delay the callback.
     * If no players are active or the engine is stopped, the callback will happen immediately.
     * 
     * @param finishedHandler
     *                        The block that will be called asynchronously. The return value of this block determines
     *                        the action the
     *                        engine will take when the block finishes (see `CHHapticEngineFinishedHandler`).
     */
    @Generated
    @Selector("notifyWhenPlayersFinished:")
    public native void notifyWhenPlayersFinished(
            @NotNull @ObjCBlock(name = "call_notifyWhenPlayersFinished") Block_notifyWhenPlayersFinished finishedHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_notifyWhenPlayersFinished {
        @Generated
        @NInt
        long call_notifyWhenPlayersFinished(@Nullable NSError error);
    }

    /**
     * playPatternFromData:error
     * 
     * Simple one-shot call to play a pattern specified by NSData.
     * 
     * The engine should be started prior to calling this method if low latency is desired. If this is not done,
     * this method will start it, which can cause a significant delay.
     * 
     * @param data
     *                 The NSData containing a haptic/audio pattern dictionary.
     * @param outError
     *                 If the operation fails, this will be set to a valid NSError describing the error.
     */
    @Generated
    @Selector("playPatternFromData:error:")
    public native boolean playPatternFromDataError(@NotNull NSData data,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * playPatternFromURL:error
     * 
     * Simple one-shot call to play a pattern specified by a URL.
     * 
     * The engine should be started prior to calling this method if low latency is desired. If this is not done,
     * this method will start it, which can cause a significant delay.
     * 
     * @param fileURL
     *                 The URL of the file containing a haptic/audio pattern dictionary.
     * @param outError
     *                 If the operation fails, this will be set to a valid NSError describing the error.
     */
    @Generated
    @Selector("playPatternFromURL:error:")
    public native boolean playPatternFromURLError(@NotNull NSURL fileURL,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * [@property] playsHapticsOnly
     * If set to YES, the CHHapticEngine will ignore all events of type CHHapticEventTypeAudio and play only haptic
     * events.
     * 
     * This behavior change will only take effect after the engine is stopped and restarted.
     * The default is NO.
     */
    @Generated
    @Selector("playsHapticsOnly")
    public native boolean playsHapticsOnly();

    /**
     * registerAudioResource:options:error
     * 
     * Register an external audio file for use as a custom waveform.
     * 
     * @param resourceURL
     *                    A URL referencing the location of the audio file to be registered.
     * @param options
     *                    A dictionary containing CHHapticAudioResourceKey/value pairs describing how this resource
     *                    should be played.
     * @param outError
     *                    If register operation fails, this will be set to a valid NSError describing the error.
     */
    @Generated
    @Selector("registerAudioResource:options:error:")
    @NUInt
    public native long registerAudioResourceOptionsError(@NotNull NSURL resourceURL,
            @NotNull NSDictionary<?, ?> options, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * [@property] resetHandler
     * 
     * This block will called asynchronously if the haptic engine has to reset itself after a server failure.
     * 
     * In response to this handler being called, the client must release all haptic pattern players
     * and recreate them. All CHHapticPattern objects and CHHapticEngine properties will have been preserved.
     * In general, callbacks arrive on a non-main thread and it is the client's responsibility to handle
     * it in a thread-safe manner.
     */
    @NotNull
    @Generated
    @Selector("resetHandler")
    @ObjCBlock(name = "call_resetHandler_ret")
    public native Block_resetHandler_ret resetHandler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resetHandler_ret {
        @Generated
        void call_resetHandler_ret();
    }

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] autoShutdownEnabled
     * 
     * When auto shutdown is enabled, the haptic engine can start and stop the hardware dynamically,
     * to conserve power.
     * 
     * To conserve power, it is advised that the client stop the haptic engine when not in use.
     * But when auto shutdown is enabled, the haptic engine will stop the hardware if it was running
     * idle for a certain duration, and restart it later when required.
     * Note that, because this operation is dynamic, it may affect the start times of the pattern players
     * (e.g. `CHHapticPatternplayer`), if the engine has to resume from its shutdown state.
     * 
     * This feature is disabled by default, but the client can enable it if needed.
     */
    @Generated
    @Selector("setAutoShutdownEnabled:")
    public native void setAutoShutdownEnabled(boolean value);

    /**
     * [@property] isMutedForAudio
     * When set to YES, the CHHapticEngine mutes audio playback from its players.
     * 
     * Default is NO.
     */
    @Generated
    @Selector("setIsMutedForAudio:")
    public native void setIsMutedForAudio(boolean value);

    /**
     * [@property] isMutedForHaptics
     * When set to YES, the CHHapticEngine mutes haptic playback from its players.
     * 
     * Default is NO.
     */
    @Generated
    @Selector("setIsMutedForHaptics:")
    public native void setIsMutedForHaptics(boolean value);

    /**
     * [@property] playsHapticsOnly
     * If set to YES, the CHHapticEngine will ignore all events of type CHHapticEventTypeAudio and play only haptic
     * events.
     * 
     * This behavior change will only take effect after the engine is stopped and restarted.
     * The default is NO.
     */
    @Generated
    @Selector("setPlaysHapticsOnly:")
    public native void setPlaysHapticsOnly(boolean value);

    /**
     * [@property] resetHandler
     * 
     * This block will called asynchronously if the haptic engine has to reset itself after a server failure.
     * 
     * In response to this handler being called, the client must release all haptic pattern players
     * and recreate them. All CHHapticPattern objects and CHHapticEngine properties will have been preserved.
     * In general, callbacks arrive on a non-main thread and it is the client's responsibility to handle
     * it in a thread-safe manner.
     */
    @Generated
    @Selector("setResetHandler:")
    public native void setResetHandler(@NotNull @ObjCBlock(name = "call_setResetHandler") Block_setResetHandler value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setResetHandler {
        @Generated
        void call_setResetHandler();
    }

    /**
     * [@property] stoppedHandler
     * 
     * The engine will call this block when it has stopped due to external causes (such as
     * an audio session interruption or the app going into the background). It will NOT be called
     * if the client calls stopWithCompletionHandler:.
     * 
     * In general, callbacks arrive on a non-main thread and it is the client's responsibility to handle
     * it in a thread-safe manner.
     */
    @Generated
    @Selector("setStoppedHandler:")
    public native void setStoppedHandler(
            @NotNull @ObjCBlock(name = "call_setStoppedHandler") Block_setStoppedHandler value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setStoppedHandler {
        @Generated
        void call_setStoppedHandler(@NInt long stoppedReason);
    }

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * startAndReturnError:
     * 
     * Start the engine and block until the engine has started.
     * 
     * This method will return NO upon failure, and outError will be set to a valid NSError describing the error.
     */
    @Generated
    @Selector("startAndReturnError:")
    public native boolean startAndReturnError(@Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * startWithCompletionHandler:
     * 
     * Asynchronously start the engine. The handler will be called when the operation completes.
     * 
     * The handler is guaranteed to be called on either success or failure.
     */
    @Generated
    @Selector("startWithCompletionHandler:")
    public native void startWithCompletionHandler(
            @Nullable @ObjCBlock(name = "call_startWithCompletionHandler") Block_startWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_startWithCompletionHandler {
        @Generated
        void call_startWithCompletionHandler(@Nullable NSError error);
    }

    /**
     * stopWithCompletionHandler:
     * 
     * Asynchronously stop the engine. The handler will be called when the operation completes.
     * 
     * The handler is guaranteed to be called on either success or failure.
     */
    @Generated
    @Selector("stopWithCompletionHandler:")
    public native void stopWithCompletionHandler(
            @Nullable @ObjCBlock(name = "call_stopWithCompletionHandler") Block_stopWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_stopWithCompletionHandler {
        @Generated
        void call_stopWithCompletionHandler(@Nullable NSError error);
    }

    /**
     * [@property] stoppedHandler
     * 
     * The engine will call this block when it has stopped due to external causes (such as
     * an audio session interruption or the app going into the background). It will NOT be called
     * if the client calls stopWithCompletionHandler:.
     * 
     * In general, callbacks arrive on a non-main thread and it is the client's responsibility to handle
     * it in a thread-safe manner.
     */
    @NotNull
    @Generated
    @Selector("stoppedHandler")
    @ObjCBlock(name = "call_stoppedHandler_ret")
    public native Block_stoppedHandler_ret stoppedHandler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_stoppedHandler_ret {
        @Generated
        void call_stoppedHandler_ret(@NInt long stoppedReason);
    }

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * unregisterAudioResource:error
     * 
     * Unregister and remove a previously-registered audio resource.
     * 
     * @param resourceID
     *                   The resource ID that was returned when the resource was registered.
     * @param outError
     *                   If the unregister operation fails, this will be set to a valid NSError describing the error.
     */
    @Generated
    @Selector("unregisterAudioResource:error:")
    public native boolean unregisterAudioResourceError(@NUInt long resourceID,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * [@property] playsAudioOnly
     * If set to YES, the CHHapticEngine will ignore all events of type CHHapticEventTypeHaptic and play only audio
     * events.
     * 
     * This behavior change will only take effect after the engine is stopped and restarted.
     * The default is NO.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("playsAudioOnly")
    public native boolean playsAudioOnly();

    /**
     * [@property] playsAudioOnly
     * If set to YES, the CHHapticEngine will ignore all events of type CHHapticEventTypeHaptic and play only audio
     * events.
     * 
     * This behavior change will only take effect after the engine is stopped and restarted.
     * The default is NO.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setPlaysAudioOnly:")
    public native void setPlaysAudioOnly(boolean value);
}
