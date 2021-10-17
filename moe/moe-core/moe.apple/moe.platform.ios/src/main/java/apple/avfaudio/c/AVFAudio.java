package apple.avfaudio.c;

import apple.avfaudio.struct.AVAudio3DAngularOrientation;
import apple.avfaudio.struct.AVAudio3DPoint;
import apple.avfaudio.struct.AVAudio3DVectorOrientation;
import apple.avfaudio.struct.AVBeatRange;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.c.ann.Inline;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("AVFAudio")
@Runtime(CRuntime.class)
public final class AVFAudio {
    static {
        NatJ.register();
    }

    @Generated
    private AVFAudio() {
    }

    /**
     * Creates and returns an AVAudio3DPoint object
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native AVAudio3DPoint AVAudioMake3DPoint(float x, float y, float z);

    /**
     * Creates and returns an AVAudio3DVector object
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native AVAudio3DPoint AVAudioMake3DVector(float x, float y, float z);

    /**
     * Creates and returns an AVAudio3DVectorOrientation object
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native AVAudio3DVectorOrientation AVAudioMake3DVectorOrientation(@ByValue AVAudio3DPoint forward,
            @ByValue AVAudio3DPoint up);

    /**
     * Creates and returns an AVAudio3DAngularOrientation object
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native AVAudio3DAngularOrientation AVAudioMake3DAngularOrientation(float yaw, float pitch,
            float roll);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native AVBeatRange AVMakeBeatRange(double startBeat, double lengthInBeats);

    /**
     * [@constant] AVAudioEngineConfigurationChangeNotification
     * <p>
     * A notification generated on engine configuration changes when rendering to/from an audio
     * device.
     * <p>
     * Register for this notification on your engine instances, as follows:
     * <p>
     * ```
     * [[NSNotificationCenter defaultCenter] addObserver: myObject
     * selector:    @selector(handleInterruption:)
     * name:        AVAudioEngineConfigurationChangeNotification
     * object:      engine];
     * ```
     * <p>
     * When the engine's I/O unit observes a change to the audio input or output hardware's
     * channel count or sample rate, the engine stops itself (see `AVAudioEngine(stop)`), and
     * issues this notification.
     * The nodes remain attached and connected with previously set formats. However, the app
     * must reestablish connections if the connection formats need to change (e.g. in an
     * input node chain, connections must follow the hardware sample rate, while in an output only
     * chain, the output node supports rate conversion).
     * <p>
     * Note that the engine must not be deallocated from within the client's notification handler
     * because the callback happens on an internal dispatch queue and can deadlock while trying to
     * synchronously teardown the engine.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioEngineConfigurationChangeNotification();

    /**
     * value is an integer (format ID) from CoreAudioTypes.h
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVFormatIDKey();

    /**
     * value is floating point in Hertz
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVSampleRateKey();

    /**
     * value is an integer
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVNumberOfChannelsKey();

    /**
     * value is an integer, one of: 8, 16, 24, 32
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVLinearPCMBitDepthKey();

    /**
     * value is a BOOL
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVLinearPCMIsBigEndianKey();

    /**
     * value is a BOOL
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVLinearPCMIsFloatKey();

    /**
     * value is a BOOL
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVLinearPCMIsNonInterleaved();

    /**
     * value is an integer (audio file type) from AudioFile.h
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioFileTypeKey();

    /**
     * value is an integer from enum AVAudioQuality
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVEncoderAudioQualityKey();

    /**
     * value is an integer from enum AVAudioQuality. only relevant for AVAudioBitRateStrategy_Variable
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVEncoderAudioQualityForVBRKey();

    /**
     * value is an integer.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVEncoderBitRateKey();

    /**
     * value is an integer
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVEncoderBitRatePerChannelKey();

    /**
     * value is an AVAudioBitRateStrategy constant. see below.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVEncoderBitRateStrategyKey();

    /**
     * value is an integer from 8 to 32
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVEncoderBitDepthHintKey();

    /**
     * value is an AVSampleRateConverterAlgorithm constant. see below.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVSampleRateConverterAlgorithmKey();

    /**
     * value is an integer from enum AVAudioQuality
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVSampleRateConverterAudioQualityKey();

    /**
     * value is an NSData containing an AudioChannelLayout
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVChannelLayoutKey();

    /**
     * values for AVEncoderBitRateStrategyKey
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioBitRateStrategy_Constant();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioBitRateStrategy_LongTermAverage();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioBitRateStrategy_VariableConstrained();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioBitRateStrategy_Variable();

    /**
     * values for AVSampleRateConverterAlgorithmKey
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVSampleRateConverterAlgorithm_Normal();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVSampleRateConverterAlgorithm_Mastering();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVSampleRateConverterAlgorithm_MinimumPhase();

    /**
     * input port types
     * Line level input on a dock connector
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionPortLineIn();

    /**
     * Built-in microphone on an iOS device
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionPortBuiltInMic();

    /**
     * Microphone on a wired headset.  Headset refers to an accessory that has headphone outputs paired with a
     * microphone.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionPortHeadsetMic();

    /**
     * Line level output on a dock connector
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionPortLineOut();

    /**
     * Headphone or headset output
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionPortHeadphones();

    /**
     * Output on a Bluetooth A2DP device
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionPortBluetoothA2DP();

    /**
     * The speaker you hold to your ear when on a phone call
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionPortBuiltInReceiver();

    /**
     * Built-in speaker on an iOS device
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionPortBuiltInSpeaker();

    /**
     * Output via High-Definition Multimedia Interface
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionPortHDMI();

    /**
     * Output on a remote Air Play device
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionPortAirPlay();

    /**
     * Output on a Bluetooth Low Energy device
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionPortBluetoothLE();

    /**
     * Input or output on a Bluetooth Hands-Free Profile device
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionPortBluetoothHFP();

    /**
     * Input or output on a Universal Serial Bus device
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionPortUSBAudio();

    /**
     * Input or output via Car Audio
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionPortCarAudio();

    /**
     * Input or output that does not correspond to real audio hardware
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionPortVirtual();

    /**
     * Input or output connected via the PCI (Peripheral Component Interconnect) bus
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionPortPCI();

    /**
     * Input or output connected via FireWire
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionPortFireWire();

    /**
     * Input or output connected via DisplayPort
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionPortDisplayPort();

    /**
     * Input or output connected via AVB (Audio Video Bridging)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionPortAVB();

    /**
     * Input or output connected via Thunderbolt
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionPortThunderbolt();

    /**
     * Use this category for background sounds such as rain, car engine noise, etc.
     * Mixes with other music.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionCategoryAmbient();

    /**
     * Use this category for background sounds.  Other music will stop playing.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionCategorySoloAmbient();

    /**
     * Use this category for music tracks.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionCategoryPlayback();

    /**
     * Use this category when recording audio.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionCategoryRecord();

    /**
     * Use this category when recording and playing back audio.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionCategoryPlayAndRecord();

    /**
     * Use this category when using a hardware codec or signal processor while
     * not playing or recording audio.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionCategoryAudioProcessing();

    /**
     * Use this category to customize the usage of available audio accessories and built-in audio hardware.
     * For example, this category provides an application with the ability to use an available USB output
     * and headphone output simultaneously for separate, distinct streams of audio data. Use of
     * this category by an application requires a more detailed knowledge of, and interaction with,
     * the capabilities of the available audio routes.  May be used for input, output, or both.
     * Note that not all output types and output combinations are eligible for multi-route.  Input is limited
     * to the last-in input port. Eligible inputs consist of the following:
     * AVAudioSessionPortUSBAudio, AVAudioSessionPortHeadsetMic, and AVAudioSessionPortBuiltInMic.
     * Eligible outputs consist of the following:
     * AVAudioSessionPortUSBAudio, AVAudioSessionPortLineOut, AVAudioSessionPortHeadphones, AVAudioSessionPortHDMI,
     * and AVAudioSessionPortBuiltInSpeaker.
     * Note that AVAudioSessionPortBuiltInSpeaker is only allowed to be used when there are no other eligible
     * outputs connected.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionCategoryMultiRoute();

    /**
     * The default mode
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionModeDefault();

    /**
     * Only valid with AVAudioSessionCategoryPlayAndRecord.  Appropriate for Voice over IP
     * (VoIP) applications.  Reduces the number of allowable audio routes to be only those
     * that are appropriate for VoIP applications and may engage appropriate system-supplied
     * signal processing.  Has the side effect of setting AVAudioSessionCategoryOptionAllowBluetooth
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionModeVoiceChat();

    /**
     * Set by Game Kit on behalf of an application that uses a GKVoiceChat object; valid
     * only with the AVAudioSessionCategoryPlayAndRecord category.
     * Do not set this mode directly. If you need similar behavior and are not using
     * a GKVoiceChat object, use AVAudioSessionModeVoiceChat instead.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionModeGameChat();

    /**
     * Only valid with AVAudioSessionCategoryPlayAndRecord or AVAudioSessionCategoryRecord.
     * Modifies the audio routing options and may engage appropriate system-supplied signal processing.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionModeVideoRecording();

    /**
     * Appropriate for applications that wish to minimize the effect of system-supplied signal
     * processing for input and/or output audio signals.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionModeMeasurement();

    /**
     * Engages appropriate output signal processing for movie playback scenarios.  Currently
     * only applied during playback over built-in speaker.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionModeMoviePlayback();

    /**
     * Only valid with kAudioSessionCategory_PlayAndRecord. Reduces the number of allowable audio
     * routes to be only those that are appropriate for video chat applications. May engage appropriate
     * system-supplied signal processing.  Has the side effect of setting
     * AVAudioSessionCategoryOptionAllowBluetooth and AVAudioSessionCategoryOptionDefaultToSpeaker.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionModeVideoChat();

    /**
     * Appropriate for applications which play spoken audio and wish to be paused (via audio session interruption) rather than ducked
     * if another app (such as a navigation app) plays a spoken audio prompt.  Examples of apps that would use this are podcast players and
     * audio books.  For more information, see the related category option AVAudioSessionCategoryOptionInterruptSpokenAudioAndMixWithOthers.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionModeSpokenAudio();

    /**
     * Appropriate for applications which play audio using text to speech. Setting this mode allows for different routing behaviors when
     * connected to certain audio devices such as CarPlay. An example of an app that would use this mode is a turn by turn navigation app that
     * plays short prompts to the user. Typically, these same types of applications would also configure their session to use
     * AVAudioSessionCategoryOptionDuckOthers and AVAudioSessionCategoryOptionInterruptSpokenAudioAndMixWithOthers
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionModeVoicePrompt();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionLocationUpper();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionLocationLower();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionOrientationTop();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionOrientationBottom();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionOrientationFront();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionOrientationBack();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionOrientationLeft();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionOrientationRight();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionPolarPatternOmnidirectional();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionPolarPatternCardioid();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionPolarPatternSubcardioid();

    /**
     * If you select a data source with AVAudioSessionPolarPatternStereo, then you must call setPreferredInputOrientation:error: on your Audio Session so that left and right are presented from the correct directions.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionPolarPatternStereo();

    /**
     * Notification sent to registered listeners when the system has interrupted the audio
     * session and when the interruption has ended.
     * <p>
     * Check the notification's userInfo dictionary for the interruption type, which is either
     * Begin or End. In the case of an end interruption notification, check the userInfo dictionary
     * for AVAudioSessionInterruptionOptions that indicate whether audio playback should resume.
     * In the case of a begin interruption notification, the reason for the interruption can be found
     * within the info dictionary under the key AVAudioSessionInterruptionReasonKey.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionInterruptionNotification();

    /**
     * Notification sent to registered listeners when an audio route change has occurred.
     * <p>
     * Check the notification's userInfo dictionary for the route change reason and for a description
     * of the previous audio route.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionRouteChangeNotification();

    /**
     * Notification sent to registered listeners if the media server is killed.
     * <p>
     * In the event that the server is killed, take appropriate steps to handle requests that come in
     * before the server resets.  See Technical Q&A QA1749.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionMediaServicesWereLostNotification();

    /**
     * Notification sent to registered listeners when the media server restarts.
     * <p>
     * In the event that the server restarts, take appropriate steps to re-initialize any audio objects
     * used by your application.  See Technical Q&A QA1749.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionMediaServicesWereResetNotification();

    /**
     * Notification sent to registered listeners when they are in the foreground with an active
     * audio session and primary audio from other applications starts and stops.
     * <p>
     * Check the notification's userInfo dictionary for the notification type, which is either Begin or
     * End. Foreground applications may use this notification as a hint to enable or disable audio that
     * is secondary to the functionality of the application. For more information, see the related
     * property secondaryAudioShouldBeSilencedHint.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionSilenceSecondaryAudioHintNotification();

    /**
     * Notification sent to registered listeners when spatial playback capabilities are changed due to a
     * change in user preference.
     * <p>
     * Check the notification's userInfo dictionary for AVAudioSessionSpatialAudioEnabledKey to check if spatial
     * audio is enabled.
     * <p>
     * Observers of this notification should also observe AVAudioSessionRouteChangeNotification since a route change
     * may also result in a change in the ability for the system to play spatial audio. Use
     * AVAudioSessionPortDescription's isSpatialAudioEnabled property to check if the current route supports
     * spatialized playback.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionSpatialPlaybackCapabilitiesChangedNotification();

    /**
     * keys for AVAudioSessionSpatialPlaybackCapabilitiesChangedNotification
     * value is an NSNumber whose boolean value indicates if spatial audio enabled.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionSpatialAudioEnabledKey();

    /**
     * keys for AVAudioSessionInterruptionNotification
     * Value is an NSNumber representing an AVAudioSessionInterruptionType
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionInterruptionTypeKey();

    /**
     * Only present for end interruption events.  Value is of type AVAudioSessionInterruptionOptions.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionInterruptionOptionKey();

    /**
     * Only present in begin interruption events. Value is of type AVAudioSessionInterruptionReason.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionInterruptionReasonKey();

    /**
     * Only present in begin interruption events, where the interruption is a direct result of the
     * application being suspended by the operating sytem. Value is a boolean NSNumber, where a true
     * value indicates that the interruption is the result of the application being suspended, rather
     * than being interrupted by another audio session.
     * <p>
     * Starting in iOS 10, the system will deactivate the audio session of most apps in response to the
     * app process being suspended. When the app starts running again, it will receive the notification
     * that its session has been deactivated by the system. Note that the notification is necessarily
     * delayed in time, due to the fact that the application was suspended at the time the session was
     * deactivated by the system and the notification can only be delivered once the app is running
     * again.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionInterruptionWasSuspendedKey();

    /**
     * keys for AVAudioSessionRouteChangeNotification
     * value is an NSNumber representing an AVAudioSessionRouteChangeReason
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionRouteChangeReasonKey();

    /**
     * value is AVAudioSessionRouteDescription *
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionRouteChangePreviousRouteKey();

    /**
     * keys for AVAudioSessionSilenceSecondaryAudioHintNotification
     * value is an NSNumber representing an AVAudioSessionSilenceSecondaryAudioHintType
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionSilenceSecondaryAudioHintTypeKey();

    /**
     * Standard Audio Unit Types
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioUnitTypeOutput();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioUnitTypeMusicDevice();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioUnitTypeMusicEffect();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioUnitTypeFormatConverter();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioUnitTypeEffect();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioUnitTypeMixer();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioUnitTypePanner();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioUnitTypeGenerator();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioUnitTypeOfflineEffect();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioUnitTypeMIDIProcessor();

    /**
     * Standard Audio Unit Manufacturers
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioUnitManufacturerNameApple();

    /**
     * The notification object is an AVAudioUnitComponent object
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioUnitComponentTagsDidChangeNotification();

    /**
     * [@constant] AVAudioUnitComponentManagerRegistrationsChangedNotification
     * <p>
     * A notification generated when AVAudioUnitComponentManager updates its list of components.
     * <p>
     * Register for this notification on the shared AVAudioUnitComponentManager instance,
     * as follows:
     * <p>
     * ```
     * [[NSNotificationCenter defaultCenter] addObserver: myObject
     * selector:    @selector(registrationsChanged:)
     * name:        AVAudioUnitComponentManagerRegistrationsChangedNotification
     * object:      [AVAudioUnitComponentManager sharedAudioUnitComponentManager]];
     * ```
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioUnitComponentManagerRegistrationsChangedNotification();

    @Generated
    @CVariable()
    public static native float AVSpeechUtteranceMinimumSpeechRate();

    @Generated
    @CVariable()
    public static native float AVSpeechUtteranceMaximumSpeechRate();

    @Generated
    @CVariable()
    public static native float AVSpeechUtteranceDefaultSpeechRate();

    /**
     * Use the Alex identifier with voiceWithIdentifier:. If the voice is present on the system,
     * an AVSpeechSynthesisVoice will be returned. Alex is en-US only.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVSpeechSynthesisVoiceIdentifierAlex();

    /**
     * NSString, containing International Phonetic Alphabet (IPA) symbols. Controls pronunciation of a certain word or phrase, e.g. a proper name.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVSpeechSynthesisIPANotationAttribute();
}
