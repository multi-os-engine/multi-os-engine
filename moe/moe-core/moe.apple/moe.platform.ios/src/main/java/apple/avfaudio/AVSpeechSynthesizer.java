package apple.avfaudio;

import apple.NSObject;
import apple.avfaudio.protocol.AVSpeechSynthesizerDelegate;
import apple.foundation.NSArray;
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
 * AVSpeechSynthesizer
 * 
 * AVSpeechSynthesizer allows speaking of speech utterances with a basic queuing mechanism.
 * 
 * Create an instance of AVSpeechSynthesizer to start generating synthesized speech by using AVSpeechUtterance objects.
 * 
 * API-Since: 7.0
 */
@Generated
@Library("AVFAudio")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVSpeechSynthesizer extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVSpeechSynthesizer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVSpeechSynthesizer alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVSpeechSynthesizer allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("continueSpeaking")
    public native boolean continueSpeaking();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native AVSpeechSynthesizerDelegate delegate();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native AVSpeechSynthesizer init();

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
    @Selector("isPaused")
    public native boolean isPaused();

    @Generated
    @Selector("isSpeaking")
    public native boolean isSpeaking();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    /**
     * Set to YES to send synthesized speech into an outgoing telephony audio stream.
     * If there's no active call, setting this property has no effect.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("mixToTelephonyUplink")
    public native boolean mixToTelephonyUplink();

    @Generated
    @Owned
    @Selector("new")
    public static native AVSpeechSynthesizer new_objc();

    /**
     * Specify the audio channels to be used for synthesized speech as described by the channel descriptions in
     * AVAudioSession's current route.
     * Speech audio will be replicated to each specified channel.
     * Default is nil, which implies system defaults.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("outputChannels")
    public native NSArray<? extends AVAudioSessionChannelDescription> outputChannels();

    @Generated
    @Selector("pauseSpeakingAtBoundary:")
    public native boolean pauseSpeakingAtBoundary(@NInt long boundary);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) AVSpeechSynthesizerDelegate value);

    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) AVSpeechSynthesizerDelegate value) {
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
     * Set to YES to send synthesized speech into an outgoing telephony audio stream.
     * If there's no active call, setting this property has no effect.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setMixToTelephonyUplink:")
    public native void setMixToTelephonyUplink(boolean value);

    /**
     * Specify the audio channels to be used for synthesized speech as described by the channel descriptions in
     * AVAudioSession's current route.
     * Speech audio will be replicated to each specified channel.
     * Default is nil, which implies system defaults.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("setOutputChannels:")
    public native void setOutputChannels(NSArray<? extends AVAudioSessionChannelDescription> value);

    /**
     * The AVSpeechSynthesizer will use the AVAudioSession sharedInstance when set to YES.
     * The AVSpeechSynthesizer will use a separate AVAudioSession for playback when set to NO. Additionally, the audio
     * session will mix and duck other audio, and its active state will be managed automatically.
     * The separate audio session will use AVAudioSessionRouteSharingPolicyDefault, which means that it may have a
     * different route from the app’s shared instance session.
     * Default is YES.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setUsesApplicationAudioSession:")
    public native void setUsesApplicationAudioSession(boolean value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * AVSpeechUtterances are queued by default.
     * Enqueing the same AVSpeechUtterance that is already enqueued or is speaking will raise an exception.
     */
    @Generated
    @Selector("speakUtterance:")
    public native void speakUtterance(AVSpeechUtterance utterance);

    /**
     * Call stopSpeakingAtBoundary: to interrupt current speech and clear the queue.
     */
    @Generated
    @Selector("stopSpeakingAtBoundary:")
    public native boolean stopSpeakingAtBoundary(@NInt long boundary);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * The AVSpeechSynthesizer will use the AVAudioSession sharedInstance when set to YES.
     * The AVSpeechSynthesizer will use a separate AVAudioSession for playback when set to NO. Additionally, the audio
     * session will mix and duck other audio, and its active state will be managed automatically.
     * The separate audio session will use AVAudioSessionRouteSharingPolicyDefault, which means that it may have a
     * different route from the app’s shared instance session.
     * Default is YES.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("usesApplicationAudioSession")
    public native boolean usesApplicationAudioSession();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Use this method to receive audio buffers that can be used to store or further process synthesized speech.
     * The dictionary provided by -[AVSpeechSynthesisVoice audioFileSettings] can be used to create an AVAudioFile.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("writeUtterance:toBufferCallback:")
    public native void writeUtteranceToBufferCallback(AVSpeechUtterance utterance,
            @ObjCBlock(name = "call_writeUtteranceToBufferCallback") Block_writeUtteranceToBufferCallback bufferCallback);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeUtteranceToBufferCallback {
        @Generated
        void call_writeUtteranceToBufferCallback(AVAudioBuffer buffer);
    }

    /**
     * Use this method to receive audio buffers and associated metadata that can be used to store or further process
     * synthesized speech.
     * The dictionary provided by -[AVSpeechSynthesisVoice audioFileSettings] can be used to create an AVAudioFile.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("writeUtterance:toBufferCallback:toMarkerCallback:")
    public native void writeUtteranceToBufferCallbackToMarkerCallback(AVSpeechUtterance utterance,
            @ObjCBlock(name = "call_writeUtteranceToBufferCallbackToMarkerCallback_1") Block_writeUtteranceToBufferCallbackToMarkerCallback_1 bufferCallback,
            @ObjCBlock(name = "call_writeUtteranceToBufferCallbackToMarkerCallback_2") Block_writeUtteranceToBufferCallbackToMarkerCallback_2 markerCallback);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeUtteranceToBufferCallbackToMarkerCallback_1 {
        @Generated
        void call_writeUtteranceToBufferCallbackToMarkerCallback_1(AVAudioBuffer buffer);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeUtteranceToBufferCallbackToMarkerCallback_2 {
        @Generated
        void call_writeUtteranceToBufferCallbackToMarkerCallback_2(NSArray<? extends AVSpeechSynthesisMarker> markers);
    }
}
