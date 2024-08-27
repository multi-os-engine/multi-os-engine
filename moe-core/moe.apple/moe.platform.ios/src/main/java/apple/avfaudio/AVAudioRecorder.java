package apple.avfaudio;

import apple.NSObject;
import apple.avfaudio.protocol.AVAudioRecorderDelegate;
import apple.foundation.NSArray;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * AVAudioRecorder
 * 
 * An object that records audio data to a file.
 * 
 * API-Since: 3.0
 */
@Generated
@Library("AVFAudio")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAudioRecorder extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAudioRecorder(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAudioRecorder alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVAudioRecorder allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * averagePowerForChannel:
     * 
     * Returns average power in decibels for a given channel.
     */
    @Generated
    @Selector("averagePowerForChannel:")
    public native float averagePowerForChannel(@NUInt long channelNumber);

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
     * [@property] channelAssignments
     * 
     * Array of AVAudioSessionChannelDescription objects
     * 
     * The channels property lets you assign the output to record specific channels as described by
     * AVAudioSessionPortDescription's channels property. This property is nil valued until set. The array must have the
     * same number of channels as returned by the numberOfChannels property.
     * 
     * API-Since: 7.0
     */
    @Nullable
    @Generated
    @Selector("channelAssignments")
    public native NSArray<? extends AVAudioSessionChannelDescription> channelAssignments();

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    /**
     * [@property] currentTime
     * 
     * Get the current time of the recording.
     * 
     * This method is only vaild while recording.
     */
    @Generated
    @Selector("currentTime")
    public native double currentTime();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * [@property] delegate
     * 
     * A delegate object to the AudioRecorder that conforms to the AVAudioRecorderDelegate protocol.
     */
    @Nullable
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native AVAudioRecorderDelegate delegate();

    /**
     * deleteRecording
     * 
     * Delete the recorded file.
     * 
     * AudioRecorder must be stopped. Returns YES on success and NO on failure.
     */
    @Generated
    @Selector("deleteRecording")
    public native boolean deleteRecording();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * [@property] deviceCurrentTime
     * 
     * Get the device current time.
     * 
     * This method is always valid.
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("deviceCurrentTime")
    public native double deviceCurrentTime();

    /**
     * [@property] format
     * 
     * The audio format of the AudioRecorder.
     * 
     * This property is fully valid only when prepareToRecord has been called.
     * 
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @Selector("format")
    public native AVAudioFormat format();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native AVAudioRecorder init();

    /**
     * initWithURL:format:error:
     * 
     * Init the AudioRecorder with a specified url and format.
     * 
     * The file type to create can be set through the corresponding settings key. If not set, it will be inferred from
     * the file extension. Will overwrite a file at the specified url if a file exists.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("initWithURL:format:error:")
    public native AVAudioRecorder initWithURLFormatError(@NotNull NSURL url, @NotNull AVAudioFormat format,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * initWithURL:settings:error:
     * 
     * Init the AudioRecorder with a specified url and settings.
     * 
     * The file type to create can be set through the corresponding settings key. If not set, it will be inferred from
     * the file extension. Will overwrite a file at the specified url if a file exists.
     */
    @Generated
    @Selector("initWithURL:settings:error:")
    public native AVAudioRecorder initWithURLSettingsError(@NotNull NSURL url,
            @NotNull NSDictionary<String, ?> settings,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

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
     * [@property] meteringEnabled
     * 
     * Turns level metering on or off.
     * 
     * Default is off.
     */
    @Generated
    @Selector("isMeteringEnabled")
    public native boolean isMeteringEnabled();

    /**
     * [@property] recording
     * 
     * Returns YES if the AudioRecorder is currently recording.
     */
    @Generated
    @Selector("isRecording")
    public native boolean isRecording();

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
    public static native AVAudioRecorder new_objc();

    /**
     * pause
     * 
     * Pause recording.
     */
    @Generated
    @Selector("pause")
    public native void pause();

    /**
     * peakPowerForChannel:
     * 
     * Returns peak power in decibels for a given channel.
     */
    @Generated
    @Selector("peakPowerForChannel:")
    public native float peakPowerForChannel(@NUInt long channelNumber);

    /**
     * prepareToRecord
     * 
     * Creates the output file and gets ready to record.
     * 
     * This method is called automatically on record. Returns YES on success and NO on failure.
     */
    @Generated
    @Selector("prepareToRecord")
    public native boolean prepareToRecord();

    /**
     * record
     * 
     * Start or resume recording to file.
     * 
     * Returns YES on success and NO on failure.
     */
    @Generated
    @Selector("record")
    public native boolean record();

    /**
     * recordAtTime:
     * 
     * Start recording at specified time in the future.
     * 
     * Time is an absolute time based on and greater than deviceCurrentTime. Returns YES on success and NO on failure.
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("recordAtTime:")
    public native boolean recordAtTime(double time);

    /**
     * recordAtTime:forDuration:
     * 
     * Record for a specified duration at a specified time in the future.
     * 
     * Time is an absolute time based on and greater than deviceCurrentTime. Returns YES on success and NO on failure.
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("recordAtTime:forDuration:")
    public native boolean recordAtTimeForDuration(double time, double duration);

    /**
     * recordForDuration:
     * 
     * Record for a specified duration.
     * 
     * The recorder will stop when it has recorded this length of audio. Returns YES on success and NO on failure.
     */
    @Generated
    @Selector("recordForDuration:")
    public native boolean recordForDuration(double duration);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] channelAssignments
     * 
     * Array of AVAudioSessionChannelDescription objects
     * 
     * The channels property lets you assign the output to record specific channels as described by
     * AVAudioSessionPortDescription's channels property. This property is nil valued until set. The array must have the
     * same number of channels as returned by the numberOfChannels property.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("setChannelAssignments:")
    public native void setChannelAssignments(@Nullable NSArray<? extends AVAudioSessionChannelDescription> value);

    /**
     * [@property] delegate
     * 
     * A delegate object to the AudioRecorder that conforms to the AVAudioRecorderDelegate protocol.
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Nullable @Mapped(ObjCObjectMapper.class) AVAudioRecorderDelegate value);

    /**
     * [@property] delegate
     * 
     * A delegate object to the AudioRecorder that conforms to the AVAudioRecorderDelegate protocol.
     */
    @Generated
    public void setDelegate(@Nullable @Mapped(ObjCObjectMapper.class) AVAudioRecorderDelegate value) {
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
     * [@property] meteringEnabled
     * 
     * Turns level metering on or off.
     * 
     * Default is off.
     */
    @Generated
    @Selector("setMeteringEnabled:")
    public native void setMeteringEnabled(boolean value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * [@property] settings
     * 
     * A dictionary of settings for the AudioRecorder.
     * 
     * These settings are fully valid only when prepareToRecord has been called. For supported key-value pairs, see
     * https://developer.apple.com/documentation/avfaudio/avaudiorecorder/1388386-initwithurl?language=objc
     */
    @NotNull
    @Generated
    @Selector("settings")
    public native NSDictionary<String, ?> settings();

    /**
     * stop
     * 
     * Stop recording.
     * 
     * This method also closes the output file.
     */
    @Generated
    @Selector("stop")
    public native void stop();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * updateMeters
     * 
     * Call this method to refresh meter values.
     */
    @Generated
    @Selector("updateMeters")
    public native void updateMeters();

    /**
     * [@property] url
     * 
     * URL of the recorded file.
     */
    @NotNull
    @Generated
    @Selector("url")
    public native NSURL url();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
