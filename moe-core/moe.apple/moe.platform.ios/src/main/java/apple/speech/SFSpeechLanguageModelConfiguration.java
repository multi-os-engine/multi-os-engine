package apple.speech;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.foundation.protocol.NSCopying;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.foundation.NSCoder;
import apple.foundation.NSNumber;
import apple.foundation.protocol.NSSecureCoding;
import org.moe.natj.objc.ann.ProtocolClassMethod;

/**
 * An object describing the location of a custom language model and specialized vocabulary.
 * 
 * Pass this object to ``SFSpeechLanguageModel/prepareCustomLanguageModelForUrl:configuration:completion:`` to indicate
 * where that method should create the custom language model file, and to
 * ``SFSpeechRecognitionRequest/customizedLanguageModel`` or
 * ``DictationTranscriber/ContentHint/customizedLanguage(modelConfiguration:)`` to indicate where the system should find
 * that model to use.
 * 
 * API-Since: 17.0
 */
@Generated
@Library("Speech")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SFSpeechLanguageModelConfiguration extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected SFSpeechLanguageModelConfiguration(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SFSpeechLanguageModelConfiguration alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native SFSpeechLanguageModelConfiguration allocWithZone(VoidPtr zone);

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
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    public native Object copyWithZone(@Nullable VoidPtr zone);

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
    public native SFSpeechLanguageModelConfiguration init();

    /**
     * Creates a configuration with the location of a language model file.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("initWithLanguageModel:")
    public native SFSpeechLanguageModelConfiguration initWithLanguageModel(@NotNull NSURL languageModel);

    /**
     * Creates a configuration with the locations of language model and vocabulary files.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("initWithLanguageModel:vocabulary:")
    public native SFSpeechLanguageModelConfiguration initWithLanguageModelVocabulary(@NotNull NSURL languageModel,
            @Nullable NSURL vocabulary);

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
     * The location of a compiled language model file.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("languageModel")
    @NotNull
    public native NSURL languageModel();

    @Generated
    @Owned
    @Selector("new")
    public static native SFSpeechLanguageModelConfiguration new_objc();

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
     * The location of a compiled vocabulary file.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("vocabulary")
    @Nullable
    public native NSURL vocabulary();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithCoder:")
    public native SFSpeechLanguageModelConfiguration initWithCoder(@NotNull NSCoder coder);

    /**
     * Creates a configuration with the locations of language model and vocabulary files, and custom weight.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("initWithLanguageModel:vocabulary:weight:")
    public native SFSpeechLanguageModelConfiguration initWithLanguageModelVocabularyWeight(@NotNull NSURL languageModel,
            @Nullable NSURL vocabulary, @Nullable NSNumber weight);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * The relative weight of the language model customization. Value must be between 0.0 and 1.0 inclusive.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("weight")
    @Nullable
    public native NSNumber weight();
}