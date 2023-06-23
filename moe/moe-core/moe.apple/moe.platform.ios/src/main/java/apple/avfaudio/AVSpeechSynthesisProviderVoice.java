package apple.avfaudio;

import apple.NSObject;
import apple.foundation.NSArray;
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
 * The representation of a provided voice that is available for speech synthesis.
 * 
 * [@c] AVSpeechSynthesisProviderVoice is distinct from @c AVSpeechSynthesisVoice, in that it is a voice provided to the
 * system by an @c AVSpeechSynthesisProviderAudioUnit.
 * 
 * An @c AVSpeechSynthesisProviderVoice will surface as an @c AVSpeechSynthesisVoice when using @c
 * AVSpeechSynthesisVoice.speechVoices(). The quality will always be listed as @c .enhanced
 * 
 * API-Since: 16.0
 */
@Generated
@Library("AVFAudio")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVSpeechSynthesisProviderVoice extends NSObject implements NSSecureCoding, NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected AVSpeechSynthesisProviderVoice(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * The age of the voice in years (optional)
     * 
     * This is an optional property that indicates the age of this voice, to be treated as a personality trait. Defaults
     * to 0.
     */
    @Generated
    @Selector("age")
    @NInt
    public native long age();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVSpeechSynthesisProviderVoice alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native AVSpeechSynthesisProviderVoice allocWithZone(VoidPtr zone);

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

    /**
     * The gender of the voice (optional)
     */
    @Generated
    @Selector("gender")
    @NInt
    public native long gender();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * A unique identifier for the voice
     * 
     * The recommended format is reverse domain notation.
     * Behavior is undefined if identifiers are not unique for all voices within a given extension.
     */
    @NotNull
    @Generated
    @Selector("identifier")
    public native String identifier();

    @Generated
    @Selector("init")
    public native AVSpeechSynthesisProviderVoice init();

    @Generated
    @Selector("initWithCoder:")
    public native AVSpeechSynthesisProviderVoice initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithName:identifier:primaryLanguages:supportedLanguages:")
    public native AVSpeechSynthesisProviderVoice initWithNameIdentifierPrimaryLanguagesSupportedLanguages(
            @NotNull String name, @NotNull String identifier, @NotNull NSArray<String> primaryLanguages,
            @NotNull NSArray<String> supportedLanguages);

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

    /**
     * The localized name of the voice
     */
    @NotNull
    @Generated
    @Selector("name")
    public native String name();

    @Generated
    @Owned
    @Selector("new")
    public static native AVSpeechSynthesisProviderVoice new_objc();

    /**
     * A set of BCP 47 codes identifying the languages this synthesizer is primarily used for.
     * 
     * These languages are what a user would expect a synthesizer to fully support and be primarily used for.
     */
    @NotNull
    @Generated
    @Selector("primaryLanguages")
    public native NSArray<String> primaryLanguages();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The age of the voice in years (optional)
     * 
     * This is an optional property that indicates the age of this voice, to be treated as a personality trait. Defaults
     * to 0.
     */
    @Generated
    @Selector("setAge:")
    public native void setAge(@NInt long value);

    /**
     * The gender of the voice (optional)
     */
    @Generated
    @Selector("setGender:")
    public native void setGender(@NInt long value);

    /**
     * The voice version (optional)
     * 
     * This is an optional property for bookkeeping. This value does not affect system behavior.
     */
    @Generated
    @Selector("setVersion:")
    public native void setVersion(@NotNull String value);

    /**
     * The size of the voice (optional)
     * 
     * This reported size of the voice package on disk, in bytes. Defaults to 0.
     */
    @Generated
    @Selector("setVoiceSize:")
    public native void setVoiceSize(long value);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * A superset of BCP 47 codes identifying the voice’s supported languages.
     * 
     * These languages are what a user would expect a voice to be able to speak such that if the voice is given a
     * multi-lingual phrase, it would be able to speak the entire phrase without a need to to switch voices. For
     * example, a zh-CN voice could have @c ["zh-CN"] as its @c primaryLanguages, but in @c supportedLanguages have @c
     * ["zh-CN","en-US"] indicating if it received "你好 means Hello", it would be able to speak the entire phrase.
     */
    @NotNull
    @Generated
    @Selector("supportedLanguages")
    public native NSArray<String> supportedLanguages();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * A call that indicates that a new voice or set of voices is available, or no longer available, for system use.
     * 
     * Call this method to indicate to the system that there has been change in the availability of the voices your
     * application is providing to the system.
     */
    @Generated
    @Selector("updateSpeechVoices")
    public static native void updateSpeechVoices();

    /**
     * The voice version (optional)
     * 
     * This is an optional property for bookkeeping. This value does not affect system behavior.
     */
    @NotNull
    @Generated
    @Selector("version")
    public native String version();

    /**
     * The size of the voice (optional)
     * 
     * This reported size of the voice package on disk, in bytes. Defaults to 0.
     */
    @Generated
    @Selector("voiceSize")
    public native long voiceSize();
}