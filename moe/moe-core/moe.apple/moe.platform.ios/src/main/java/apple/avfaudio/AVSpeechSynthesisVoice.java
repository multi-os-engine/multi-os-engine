package apple.avfaudio;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSSecureCoding;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * AVSpeechSynthesisVoice
 * <p>
 * AVSpeechSynthesisVoice encapsulates the attributes of the voice used to synthesize speech on the system.
 * <p>
 * Retrieve a voice by specifying the language code your text should be spoken in, or by using voiceWithIdentifier
 * for a known voice identifier.
 */
@Generated
@Library("AVFAudio")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVSpeechSynthesisVoice extends NSObject implements NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected AVSpeechSynthesisVoice(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVSpeechSynthesisVoice alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVSpeechSynthesisVoice allocWithZone(VoidPtr zone);

    /**
     * This is a dictionary of properties that can be used to create an AVAudioFile using -[AVAudioFile initForWriting:settings:commonFormat:interleaved:error:]
     * The data provided by AVSpeechSynthesizerBufferCallback will be in this specified format when using this voice.
     * The AVAudioCommonFormat and interleaved properties can be determined by properties within the settings dictionary.
     */
    @Generated
    @Selector("audioFileSettings")
    public native NSDictionary<String, ?> audioFileSettings();

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
    @Selector("currentLanguageCode")
    public static native String currentLanguageCode();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("gender")
    @NInt
    public native long gender();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("identifier")
    public native String identifier();

    @Generated
    @Selector("init")
    public native AVSpeechSynthesisVoice init();

    @Generated
    @Selector("initWithCoder:")
    public native AVSpeechSynthesisVoice initWithCoder(NSCoder coder);

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
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Selector("language")
    public native String language();

    @Generated
    @Selector("name")
    public native String name();

    @Generated
    @Owned
    @Selector("new")
    public static native AVSpeechSynthesisVoice new_objc();

    @Generated
    @Selector("quality")
    @NInt
    public native long quality();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("speechVoices")
    public static native NSArray<? extends AVSpeechSynthesisVoice> speechVoices();

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
     * voiceWithIdentifier:
     * <p>
     * Retrieve a voice by its identifier.
     * <p>
     * Passing in an invalid identifier will return nil.
     * Returns nil if the identifier is valid, but the voice is not available on device (i.e. not yet downloaded by the user).
     *
     * @param            identifier A unique identifier for a voice.
     */
    @Generated
    @Selector("voiceWithIdentifier:")
    public static native AVSpeechSynthesisVoice voiceWithIdentifier(String identifier);

    /**
     * voiceWithLanguage:
     * <p>
     * Use a BCP-47 language tag to specify the desired language and region.
     * <p>
     * The default is the system's region and language.
     * Passing in nil will return the default voice.
     * Passing in an invalid languageCode will return nil.
     * Will return enhanced quality voice if available, default quality otherwise.
     * Examples: en-US (U.S. English), fr-CA (French Canadian)
     *
     * @param            languageCode Specifies the BCP-47 language tag that represents the voice.
     */
    @Generated
    @Selector("voiceWithLanguage:")
    public static native AVSpeechSynthesisVoice voiceWithLanguage(String languageCode);
}
