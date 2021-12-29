package apple.avfaudio;

import apple.NSObject;
import apple.avfaudio.protocol.AVAudioSessionDelegate;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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

@Generated
@Library("AVFAudio")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAudioSession extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAudioSession(Pointer peer) {
        super(peer);
    }

    /**
     * The current hardware IO buffer duration in seconds.
     */
    @Generated
    @Selector("IOBufferDuration")
    public native double IOBufferDuration();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAudioSession alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVAudioSession allocWithZone(VoidPtr zone);

    /**
     * Whether system sounds and haptics can play while the session is actively using audio input.
     */
    @Generated
    @Selector("allowHapticsAndSystemSoundsDuringRecording")
    public native boolean allowHapticsAndSystemSoundsDuringRecording();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * Get the list of categories available on the device.  Certain categories may be unavailable on
     * particular devices.  For example, AVAudioSessionCategoryRecord will not be available on devices
     * that have no support for audio input.
     */
    @Generated
    @Selector("availableCategories")
    public native NSArray<String> availableCategories();

    /**
     * Get the set of input ports that are available for routing.
     * <p>
     * Note that this property only applies to the session's current category and mode. For
     * example, if the session's current category is AVAudioSessionCategoryPlayback, there will be
     * no available inputs.
     */
    @Generated
    @Selector("availableInputs")
    public native NSArray<? extends AVAudioSessionPortDescription> availableInputs();

    /**
     * Get the list of modes available on the device.  Certain modes may be unavailable on particular
     * devices.  For example, AVAudioSessionModeVideoRecording will not be available on devices that
     * have no support for recording video.
     */
    @Generated
    @Selector("availableModes")
    public native NSArray<String> availableModes();

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    /**
     * Get session category.
     * Examples: AVAudioSessionCategoryRecord, AVAudioSessionCategoryPlayAndRecord, etc.
     */
    @Generated
    @Selector("category")
    public native String category();

    /**
     * Get the current set of AVAudioSessionCategoryOptions.
     */
    @Generated
    @Selector("categoryOptions")
    @NUInt
    public native long categoryOptions();

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Deprecated
    @Selector("currentHardwareInputNumberOfChannels")
    @NInt
    public native long currentHardwareInputNumberOfChannels();

    @Generated
    @Deprecated
    @Selector("currentHardwareOutputNumberOfChannels")
    @NInt
    public native long currentHardwareOutputNumberOfChannels();

    /**
     * deprecated.  Use the corresponding properties without "Hardware" in their names.
     */
    @Generated
    @Deprecated
    @Selector("currentHardwareSampleRate")
    public native double currentHardwareSampleRate();

    /**
     * A description of the current route, consisting of zero or more input ports and zero or more
     * output ports
     */
    @Generated
    @Selector("currentRoute")
    public native AVAudioSessionRouteDescription currentRoute();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Deprecated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native AVAudioSessionDelegate delegate();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * AVAudioSession is a singleton. Use +sharedInstance instead of -init
     */
    @Generated
    @Selector("init")
    public native AVAudioSession init();

    /**
     * Obtain the currently selected input data source.  Will be nil if no data sources are available.
     */
    @Generated
    @Selector("inputDataSource")
    public native AVAudioSessionDataSourceDescription inputDataSource();

    /**
     * DataSource methods are for use with routes that support input or output data source
     * selection.
     * <p>
     * If the attached accessory supports data source selection, the data source properties/methods
     * provide for discovery and selection of input and/or output data sources. Note that the
     * properties and methods for data source selection below are equivalent to the properties and
     * methods on AVAudioSessionPortDescription. The methods below only apply to the currently routed
     * ports.
     * <p>
     * Key-value observable.
     */
    @Generated
    @Selector("inputDataSources")
    public native NSArray<? extends AVAudioSessionDataSourceDescription> inputDataSources();

    /**
     * value in range [0.0, 1.0]
     */
    @Generated
    @Selector("inputGain")
    public native float inputGain();

    /**
     * is input hardware available or not?
     */
    @Generated
    @Deprecated
    @Selector("inputIsAvailable")
    public native boolean inputIsAvailable();

    /**
     * The current hardware input latency in seconds.
     */
    @Generated
    @Selector("inputLatency")
    public native double inputLatency();

    /**
     * The current number of hardware input channels. Is key-value observable.
     */
    @Generated
    @Selector("inputNumberOfChannels")
    @NInt
    public native long inputNumberOfChannels();

    /**
     * Describes the orientation of the input data source (valid for the built-in mic input data source when a stereo polar pattern is selected).
     */
    @Generated
    @Selector("inputOrientation")
    @NInt
    public native long inputOrientation();

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
     * True if input hardware is available.
     */
    @Generated
    @Selector("isInputAvailable")
    public native boolean isInputAvailable();

    /**
     * True when audio input gain is available.  Some input ports may not provide the ability to set the
     * input gain, so check this value before attempting to set input gain.
     */
    @Generated
    @Selector("isInputGainSettable")
    public native boolean isInputGainSettable();

    /**
     * True when another application is playing audio.
     * <p>
     * Note: As of iOS 8.0, Apple recommends that most applications use
     * secondaryAudioShouldBeSilencedHint instead of this property. The otherAudioPlaying property
     * will be true if any other audio (including audio from an app using
     * AVAudioSessionCategoryAmbient) is playing, whereas the secondaryAudioShouldBeSilencedHint
     * property is more restrictive in its consideration of whether primary audio from another
     * application is playing.
     */
    @Generated
    @Selector("isOtherAudioPlaying")
    public native boolean isOtherAudioPlaying();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    /**
     * Returns the largest number of audio input channels available for the current route
     */
    @Generated
    @Selector("maximumInputNumberOfChannels")
    @NInt
    public native long maximumInputNumberOfChannels();

    /**
     * Returns the largest number of audio output channels available for the current route
     */
    @Generated
    @Selector("maximumOutputNumberOfChannels")
    @NInt
    public native long maximumOutputNumberOfChannels();

    /**
     * Get the session's mode.
     */
    @Generated
    @Selector("mode")
    public native String mode();

    @Generated
    @Owned
    @Selector("new")
    public static native AVAudioSession new_objc();

    /**
     * Obtain the currently selected output data source.  Will be nil if no data sources are available.
     */
    @Generated
    @Selector("outputDataSource")
    public native AVAudioSessionDataSourceDescription outputDataSource();

    /**
     * See inputDataSources for background. Key-value observable.
     */
    @Generated
    @Selector("outputDataSources")
    public native NSArray<? extends AVAudioSessionDataSourceDescription> outputDataSources();

    /**
     * The current hardware output latency in seconds.
     */
    @Generated
    @Selector("outputLatency")
    public native double outputLatency();

    /**
     * The current number of hardware output channels. Is key-value observable.
     */
    @Generated
    @Selector("outputNumberOfChannels")
    @NInt
    public native long outputNumberOfChannels();

    /**
     * The current output volume. Value in range [0.0, 1.0]. Is key-value observable.
     */
    @Generated
    @Selector("outputVolume")
    public native float outputVolume();

    /**
     * Use this method to temporarily override the output to built-in speaker.
     * <p>
     * This method is only valid for a session using PlayAndRecord category. This change remains in
     * effect only until the current route changes or you call this method again with the
     * AVAudioSessionPortOverrideNone option. Sessions using PlayAndRecord category that always want to
     * prefer the built-in speaker output over the receiver, should use
     * AVAudioSessionCategoryOptionDefaultToSpeaker instead.
     */
    @Generated
    @Selector("overrideOutputAudioPort:error:")
    public native boolean overrideOutputAudioPortError(@NUInt long portOverride,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Deprecated
    @Selector("preferredHardwareSampleRate")
    public native double preferredHardwareSampleRate();

    @Generated
    @Selector("preferredIOBufferDuration")
    public native double preferredIOBufferDuration();

    /**
     * Get the preferred input port.  Will be nil if no preference has been set.
     */
    @Generated
    @Selector("preferredInput")
    public native AVAudioSessionPortDescription preferredInput();

    @Generated
    @Selector("preferredInputNumberOfChannels")
    @NInt
    public native long preferredInputNumberOfChannels();

    @Generated
    @Selector("preferredInputOrientation")
    @NInt
    public native long preferredInputOrientation();

    @Generated
    @Selector("preferredOutputNumberOfChannels")
    @NInt
    public native long preferredOutputNumberOfChannels();

    @Generated
    @Selector("preferredSampleRate")
    public native double preferredSampleRate();

    @Generated
    @Selector("prefersNoInterruptionsFromSystemAlerts")
    public native boolean prefersNoInterruptionsFromSystemAlerts();

    /**
     * prepareRouteSelectionForPlaybackWithCompletionHandler:
     * <p>
     * A call to this method is an indication that playback is about to start. This gives the receiver an opportunity to prompt the user to pick an output destination if necessary.
     * The receiver will only prompt if the audio session has been configured with a long-form video route sharing policy.
     * <p>
     * Presenting playback UI (e.g. AVPlayerViewController) and commencing playback should be performed in the completionHandler.
     *
     * @param        completionHandler Once any potential routing is complete, the completion handler is called with the selected route type and with a BOOL indicating whether playback should begin or not.
     */
    @Generated
    @Selector("prepareRouteSelectionForPlaybackWithCompletionHandler:")
    public native void prepareRouteSelectionForPlaybackWithCompletionHandler(
            @ObjCBlock(name = "call_prepareRouteSelectionForPlaybackWithCompletionHandler") Block_prepareRouteSelectionForPlaybackWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_prepareRouteSelectionForPlaybackWithCompletionHandler {
        @Generated
        void call_prepareRouteSelectionForPlaybackWithCompletionHandler(boolean shouldStartPlayback,
                @NInt long routeSelection);
    }

    /**
     * The prompt style is a hint to sessions using AVAudioSessionModeVoicePrompt to alter the type of
     * prompts they issue in response to other audio activity on the system, such as Siri and phone
     * calls. This property is key-value observable.
     */
    @Generated
    @Selector("promptStyle")
    @NUInt
    public native long promptStyle();

    /**
     * Returns an enum indicating whether the user has granted or denied permission to record, or has
     * not been asked
     */
    @Generated
    @Selector("recordPermission")
    @NUInt
    public native long recordPermission();

    /**
     * Checks to see if calling process has permission to record audio.
     * <p>
     * The 'response' block will be called immediately if permission has already been granted or
     * denied.  Otherwise, it presents a dialog to notify the user and allow them to choose, and calls
     * the block once the UI has been dismissed.  'granted' indicates whether permission has been
     * granted. Note that the block may be called in a different thread context.
     */
    @Generated
    @Selector("requestRecordPermission:")
    public native void requestRecordPermission(
            @ObjCBlock(name = "call_requestRecordPermission") Block_requestRecordPermission response);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestRecordPermission {
        @Generated
        void call_requestRecordPermission(boolean granted);
    }

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Get the route sharing policy.
     * <p>
     * See AVAudioSessionRouteSharingPolicy for a description of the available policies.
     * See setCategory:mode:routeSharingPolicy:options:error: for additional discussion.
     */
    @Generated
    @Selector("routeSharingPolicy")
    @NUInt
    public native long routeSharingPolicy();

    /**
     * The current hardware sample rate
     */
    @Generated
    @Selector("sampleRate")
    public native double sampleRate();

    /**
     * True when another application with a non-mixable audio session is playing audio.
     * <p>
     * Applications may use this property as a hint to silence audio that is secondary to the
     * functionality of the application. For example, a game app using AVAudioSessionCategoryAmbient
     * may use this property to decide to mute its soundtrack while leaving its sound effects unmuted.
     * Note: This property is closely related to AVAudioSessionSilenceSecondaryAudioHintNotification.
     */
    @Generated
    @Selector("secondaryAudioShouldBeSilencedHint")
    public native boolean secondaryAudioShouldBeSilencedHint();

    /**
     * Set the session active or inactive.
     * <p>
     * Note that activating an audio session is a synchronous (blocking) operation.
     * Therefore, we recommend that applications not activate their session from a thread where a long
     * blocking operation will be problematic.
     * Apps may activate a AVAudioSessionCategoryPlayback session when another app is hosting a
     * call (to start a SharePlay activity for example). However, they are not permitted to capture the
     * microphone of the active call, so attempts to activate a session with category
     * AVAudioSessionCategoryRecord or AVAudioSessionCategoryPlayAndRecord will fail with error
     * AVAudioSessionErrorCodeInsufficientPriority.
     * When deactivating a session, the caller is required to
     * first stop or pause all running I/Os (e.g. audio queues, players, recorders, converters,
     * remote I/Os, etc.). Starting in iOS 8, if the session has running I/Os at the time that
     * deactivation is requested, the session will be deactivated, but the method will return NO and
     * populate the NSError with the code property set to AVAudioSessionErrorCodeIsBusy to indicate the
     * misuse of the API. Prior to iOS 8, the session would have remained active if it had running I/Os
     * at the time of the deactivation request.
     */
    @Generated
    @Selector("setActive:error:")
    public native boolean setActiveError(boolean active, @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Deprecated
    @Selector("setActive:withFlags:error:")
    public native boolean setActiveWithFlagsError(boolean active, @NInt long flags,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("setActive:withOptions:error:")
    public native boolean setActiveWithOptionsError(boolean active, @NUInt long options,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * Controls whether audio input and output are aggregated. Only valid in combination with
     * AVAudioSessionCategoryPlayAndRecord or AVAudioSessionCategoryMultiRoute.
     * <p>
     * See the AVAudioSessionIOType documentation for a more detailed explanation of why a client may
     * want to change the IO type.
     */
    @Generated
    @Selector("setAggregatedIOPreference:error:")
    public native boolean setAggregatedIOPreferenceError(@NUInt long inIOType,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * Set allowHapticsAndSystemSoundsDuringRecording to YES in order to allow system sounds and haptics to play while the session is actively using audio input.
     * Default value is NO.
     */
    @Generated
    @Selector("setAllowHapticsAndSystemSoundsDuringRecording:error:")
    public native boolean setAllowHapticsAndSystemSoundsDuringRecordingError(boolean inValue,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * Set session category.
     */
    @Generated
    @Selector("setCategory:error:")
    public native boolean setCategoryError(String category, @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * Set session category and mode with options.
     */
    @Generated
    @Selector("setCategory:mode:options:error:")
    public native boolean setCategoryModeOptionsError(String category, String mode, @NUInt long options,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * Set session category, mode, routing sharing policy, and options.
     * <p>
     * Use of the long-form route sharing policy is only valid in conjunction with a limited set of
     * category, mode, and option values.
     * <p>
     * Allowed categories: AVAudioSessionCategoryPlayback.
     * <p>
     * Allowed modes: AVAudioSessionModeDefault, AVAudioSessionModeMoviePlayback,
     * AVAudioSessionModeSpokenAudio.
     * <p>
     * Allowed options: None. Options are allowed when changing the routing policy back to Default,
     * however.
     */
    @Generated
    @Selector("setCategory:mode:routeSharingPolicy:options:error:")
    public native boolean setCategoryModeRouteSharingPolicyOptionsError(String category, String mode,
            @NUInt long policy, @NUInt long options, @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * Set session category with options.
     */
    @Generated
    @Selector("setCategory:withOptions:error:")
    public native boolean setCategoryWithOptionsError(String category, @NUInt long options,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Deprecated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) AVAudioSessionDelegate value);

    @Generated
    @Deprecated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) AVAudioSessionDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * Select a new input data source. Setting a nil value will clear the data source preference.
     */
    @Generated
    @Selector("setInputDataSource:error:")
    public native boolean setInputDataSourceError(AVAudioSessionDataSourceDescription dataSource,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * A value defined over the range [0.0, 1.0], with 0.0 corresponding to the lowest analog
     * gain setting and 1.0 corresponding to the highest analog gain setting.
     * <p>
     * Attempting to set values outside of the defined range will result in the value being "clamped"
     * to a valid input.  This is a global input gain setting that applies to the current input source
     * for the entire system. When no applications are using the input gain control, the system will
     * restore the default input gain setting for the input source.  Note that some audio accessories,
     * such as USB devices, may not have a default value.  This property is only valid if
     * inputGainSettable is true.  Note: inputGain is key-value observable.
     */
    @Generated
    @Selector("setInputGain:error:")
    public native boolean setInputGainError(float gain, @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * Set the session's mode.
     * <p>
     * Modes modify the audio category in order to introduce behavior that is tailored to the specific
     * use of audio within an application. Examples:  AVAudioSessionModeVideoRecording,
     * AVAudioSessionModeVoiceChat, AVAudioSessionModeMeasurement, etc.
     */
    @Generated
    @Selector("setMode:error:")
    public native boolean setModeError(String mode, @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * Select a new output data source. Setting a nil value will clear the data source preference.
     */
    @Generated
    @Selector("setOutputDataSource:error:")
    public native boolean setOutputDataSourceError(AVAudioSessionDataSourceDescription dataSource,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Deprecated
    @Selector("setPreferredHardwareSampleRate:error:")
    public native boolean setPreferredHardwareSampleRateError(double sampleRate,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * The preferred hardware IO buffer duration in seconds. The actual IO buffer duration may be
     * different.
     */
    @Generated
    @Selector("setPreferredIOBufferDuration:error:")
    public native boolean setPreferredIOBufferDurationError(double duration,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * Select a preferred input port for audio routing.
     * <p>
     * If the input port is already part of the current audio route, this will have no effect.
     * Otherwise, selecting an input port for routing will initiate a route change to use the preferred
     * input port. Setting a nil value will clear the preference.
     */
    @Generated
    @Selector("setPreferredInput:error:")
    public native boolean setPreferredInputError(AVAudioSessionPortDescription inPort,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * Sets the number of input channels that the app would prefer for the current route
     */
    @Generated
    @Selector("setPreferredInputNumberOfChannels:error:")
    public native boolean setPreferredInputNumberOfChannelsError(@NInt long count,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * Sets the preferred input orientation.
     * The input orientation determines which directions will be left and right
     * when a built-in mic data source with the AVAudioSessionPolarPatternStereo polar pattern is selected.
     * Typically, this orientation should match how the user is holding the device while recording, which will match
     * the application's interface orientation when a single app is on the screen.
     * The actual input orientation may be different, for example, if another app's session is in control of routing.
     * The input orientation is independent of the orientation property of an AVAudioSessionDataSourceDescription.
     */
    @Generated
    @Selector("setPreferredInputOrientation:error:")
    public native boolean setPreferredInputOrientationError(@NInt long orientation,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * Sets the number of output channels that the app would prefer for the current route
     */
    @Generated
    @Selector("setPreferredOutputNumberOfChannels:error:")
    public native boolean setPreferredOutputNumberOfChannelsError(@NInt long count,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * The preferred hardware sample rate for the session. The actual sample rate may be different.
     */
    @Generated
    @Selector("setPreferredSampleRate:error:")
    public native boolean setPreferredSampleRateError(double sampleRate,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * Set ringtone and alert interruption preference.
     * <p>
     * Inform the system when the session prefers to not be interrupted by
     * ringtones and alerts. By setting this property to YES, clients will not be interrupted
     * by incoming call notifications and other alerts. Starting in iOS 14.0, users can set a global
     * preference for incoming call display style to "Banner" or "Full Screen". With "Banner" display style,
     * if below property is set to YES then clients will not be interrupted on incoming call notification
     * and user will have opportunity to accept or decline the call. If call is declined, the session
     * will not be interrupted, but if user accepts the incoming call, the session will be interrupted.
     * With  display style set as "Full Screen", below property will have no effect and clients will be
     * interrupted by incoming calls. Apps that record audio and/or video and apps that are used for
     * music performance are candidates for using this feature.
     */
    @Generated
    @Selector("setPrefersNoInterruptionsFromSystemAlerts:error:")
    public native boolean setPrefersNoInterruptionsFromSystemAlertsError(boolean inValue,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * Set YES to inform the system if the app can supply multichannel audio content.
     * Default value is NO. This property is intended to be used by 'Now Playing' applications.
     * See https://developer.apple.com/documentation/mediaplayer/becoming_a_now_playable_app for more information
     * about what it means to be a 'Now Playing' application. Typically 'Now Playing' applications will also use
     * AVAudioSessionRouteSharingPolicyLongFormAudio or AVAudioSessionRouteSharingPolicyLongFormVideo.
     */
    @Generated
    @Selector("setSupportsMultichannelContent:error:")
    public native boolean setSupportsMultichannelContentError(boolean inValue,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Return singleton instance.
     */
    @Generated
    @Selector("sharedInstance")
    public static native AVAudioSession sharedInstance();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportsMultichannelContent")
    public native boolean supportsMultichannelContent();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
