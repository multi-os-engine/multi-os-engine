package apple.avfaudio;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSAttributedString;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * AVSpeechUtterance
 * 
 * AVSpeechUtterance is the atom of speaking a string or pausing the synthesizer.
 * 
 * To start speaking, specify the AVSpeechSynthesisVoice and the string to be spoken, then optionally change the rate,
 * pitch or volume if desired.
 * 
 * API-Since: 7.0
 */
@Generated
@Library("AVFAudio")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVSpeechUtterance extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected AVSpeechUtterance(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVSpeechUtterance alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVSpeechUtterance allocWithZone(VoidPtr zone);

    /**
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @Selector("attributedSpeechString")
    public native NSAttributedString attributedSpeechString();

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

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native AVSpeechUtterance init();

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("initWithAttributedString:")
    public native AVSpeechUtterance initWithAttributedString(@NotNull NSAttributedString string);

    @Generated
    @Selector("initWithCoder:")
    public native AVSpeechUtterance initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithString:")
    public native AVSpeechUtterance initWithString(@NotNull String string);

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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native AVSpeechUtterance new_objc();

    /**
     * [0.5 - 2] Default = 1
     */
    @Generated
    @Selector("pitchMultiplier")
    public native float pitchMultiplier();

    /**
     * Default is 0.0
     */
    @Generated
    @Selector("postUtteranceDelay")
    public native double postUtteranceDelay();

    /**
     * Default is 0.0
     */
    @Generated
    @Selector("preUtteranceDelay")
    public native double preUtteranceDelay();

    /**
     * If an assistive technology is on, like VoiceOver, the user's selected voice, rate and other settings will be used
     * for this speech utterance instead of the default values.
     * If no assistive technologies are on, then the values of the properties on AVSpeechUtterance will be used.
     * Note that querying the properties will not refect the user's settings.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("prefersAssistiveTechnologySettings")
    public native boolean prefersAssistiveTechnologySettings();

    /**
     * Values are pinned between AVSpeechUtteranceMinimumSpeechRate and AVSpeechUtteranceMaximumSpeechRate.
     */
    @Generated
    @Selector("rate")
    public native float rate();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [0.5 - 2] Default = 1
     */
    @Generated
    @Selector("setPitchMultiplier:")
    public native void setPitchMultiplier(float value);

    /**
     * Default is 0.0
     */
    @Generated
    @Selector("setPostUtteranceDelay:")
    public native void setPostUtteranceDelay(double value);

    /**
     * Default is 0.0
     */
    @Generated
    @Selector("setPreUtteranceDelay:")
    public native void setPreUtteranceDelay(double value);

    /**
     * If an assistive technology is on, like VoiceOver, the user's selected voice, rate and other settings will be used
     * for this speech utterance instead of the default values.
     * If no assistive technologies are on, then the values of the properties on AVSpeechUtterance will be used.
     * Note that querying the properties will not refect the user's settings.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setPrefersAssistiveTechnologySettings:")
    public native void setPrefersAssistiveTechnologySettings(boolean value);

    /**
     * Values are pinned between AVSpeechUtteranceMinimumSpeechRate and AVSpeechUtteranceMaximumSpeechRate.
     */
    @Generated
    @Selector("setRate:")
    public native void setRate(float value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * If no voice is specified, the system's default will be used.
     */
    @Generated
    @Selector("setVoice:")
    public native void setVoice(@Nullable AVSpeechSynthesisVoice value);

    /**
     * [0-1] Default = 1
     */
    @Generated
    @Selector("setVolume:")
    public native void setVolume(float value);

    @NotNull
    @Generated
    @Selector("speechString")
    public native String speechString();

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("speechUtteranceWithAttributedString:")
    public static native AVSpeechUtterance speechUtteranceWithAttributedString(@NotNull NSAttributedString string);

    @Generated
    @Selector("speechUtteranceWithString:")
    public static native AVSpeechUtterance speechUtteranceWithString(@NotNull String string);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * If no voice is specified, the system's default will be used.
     */
    @Nullable
    @Generated
    @Selector("voice")
    public native AVSpeechSynthesisVoice voice();

    /**
     * [0-1] Default = 1
     */
    @Generated
    @Selector("volume")
    public native float volume();

    /**
     * A speech utterance that expects markup written using the Speech Synthesis Markup Language (SSML) standard.
     * 
     * Uses SSML markup to add attributes. If using SSML to request voices that fall under certain attributes, a single
     * utterance may be split into multiple parts, each sent to the appropriate synthesizer. If no voice matches the
     * properties,
     * the voice in the @c voice property of the utterance will be used. If no @c voice is specified, the system's
     * default
     * will be used. @c AVSpeechUtterance properties that affect the prosidy of a voice such as @c rate,
     * [@c] pitchMultiplier, @c pitchMultiplier will not apply to an utterance that uses an SSML representation.
     * 
     * Returns nil if invalid SSML is passed in.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("initWithSSMLRepresentation:")
    public native AVSpeechUtterance initWithSSMLRepresentation(@NotNull String string);

    /**
     * A speech utterance that expects markup written using the Speech Synthesis Markup Language (SSML) standard.
     * Returns nil if invalid SSML is passed in.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("speechUtteranceWithSSMLRepresentation:")
    public static native AVSpeechUtterance speechUtteranceWithSSMLRepresentation(@NotNull String string);
}
