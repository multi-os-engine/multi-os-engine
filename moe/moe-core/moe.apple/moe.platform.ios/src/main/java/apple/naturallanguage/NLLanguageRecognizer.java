package apple.naturallanguage;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * NLLanguageRecognizer is a class used to automatically identify the language of text. An instance of this class is
 * created and passed one or more pieces of text, and clients can then obtain either a single most likely language or a
 * set of language candidates with probabilities. It is also possible to constrain the identification by specifying
 * either a list of hints about known prior probabilities for languages, or a list of constraint languages into which
 * the predictions are constrained to fall, or both.
 */
@Generated
@Library("NaturalLanguage")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NLLanguageRecognizer extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NLLanguageRecognizer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NLLanguageRecognizer alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NLLanguageRecognizer allocWithZone(VoidPtr zone);

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
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * The identification obtained from an NLLanguageRecognizer object can be either a single most likely language, via
     * dominantLanguage, or a set of language candidates with probabilities, via languageHypothesesWithMaximum:. The
     * latter method returns a dictionary mapping languages to their estimated probabilities, up to a maximum number
     * given by maxHypotheses.
     */
    @Generated
    @Selector("dominantLanguage")
    public native String dominantLanguage();

    /**
     * dominantLanguageForString: is a convenience method used to get the single most likely language for a specific
     * piece of text, without having to create an NLLanguageRecognizer object.
     */
    @Generated
    @Selector("dominantLanguageForString:")
    public static native String dominantLanguageForString(String string);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * To use an NLLanguageRecognizer object, clients create it and then pass in one or more pieces of text via the
     * process method. After this, identification of the text can be obtained from the object. The object can be
     * restored to its initial state by calling reset, so that it can then be reused for a new analysis. Note that a
     * given instance of NLLanguageRecognizer should not be used from more than one thread simultaneously.
     */
    @Generated
    @Selector("init")
    public native NLLanguageRecognizer init();

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

    /**
     * Allows clients to constrain the space of identified languages. For example, setting Spanish, French and English
     * as constraints would yield identification only from these three languages.
     */
    @Generated
    @Selector("languageConstraints")
    public native NSArray<String> languageConstraints();

    /**
     * Allows clients to specify known prior probabilities for languages as hints for the language identification
     * process. This should be a dictionary mapping languages to their prior probabilities.
     */
    @Generated
    @Selector("languageHints")
    public native NSDictionary<String, ? extends NSNumber> languageHints();

    @Generated
    @Selector("languageHypothesesWithMaximum:")
    public native NSDictionary<String, ? extends NSNumber> languageHypothesesWithMaximum(@NUInt long maxHypotheses);

    @Generated
    @Owned
    @Selector("new")
    public static native NLLanguageRecognizer new_objc();

    @Generated
    @Selector("processString:")
    public native void processString(String string);

    @Generated
    @Selector("reset")
    public native void reset();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Allows clients to constrain the space of identified languages. For example, setting Spanish, French and English
     * as constraints would yield identification only from these three languages.
     */
    @Generated
    @Selector("setLanguageConstraints:")
    public native void setLanguageConstraints(NSArray<String> value);

    /**
     * Allows clients to specify known prior probabilities for languages as hints for the language identification
     * process. This should be a dictionary mapping languages to their prior probabilities.
     */
    @Generated
    @Selector("setLanguageHints:")
    public native void setLanguageHints(NSDictionary<String, ? extends NSNumber> value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
