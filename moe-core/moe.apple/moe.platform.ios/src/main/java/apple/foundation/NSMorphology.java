package apple.foundation;

import apple.NSObject;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
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
 * API-Since: 15.0
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSMorphology extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected NSMorphology(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSMorphology alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSMorphology allocWithZone(VoidPtr zone);

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

    /**
     * API-Since: 15.0
     * Deprecated-Since: 17.0
     * Deprecated-Message: Use NSTermOfAddress instead
     */
    @Deprecated
    @Nullable
    @Generated
    @Selector("customPronounForLanguage:")
    public native NSMorphologyCustomPronoun customPronounForLanguage(@NotNull String language);

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
    @Selector("grammaticalGender")
    @NInt
    public native long grammaticalGender();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native NSMorphology init();

    @Generated
    @Selector("initWithCoder:")
    public native NSMorphology initWithCoder(@NotNull NSCoder coder);

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

    /**
     * Equivalent to the above.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("isUnspecified")
    public native boolean isUnspecified();

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native NSMorphology new_objc();

    @Generated
    @Selector("number")
    @NInt
    public native long number();

    @Generated
    @Selector("partOfSpeech")
    @NInt
    public native long partOfSpeech();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * API-Since: 15.0
     * Deprecated-Since: 17.0
     * Deprecated-Message: Use NSTermOfAddress instead
     */
    @Deprecated
    @Generated
    @Selector("setCustomPronoun:forLanguage:error:")
    public native boolean setCustomPronounForLanguageError(@Nullable NSMorphologyCustomPronoun features,
            @NotNull String language, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("setGrammaticalGender:")
    public native void setGrammaticalGender(@NInt long value);

    @Generated
    @Selector("setNumber:")
    public native void setNumber(@NInt long value);

    @Generated
    @Selector("setPartOfSpeech:")
    public native void setPartOfSpeech(@NInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

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

    /**
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("userMorphology")
    public static native NSMorphology userMorphology();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("definiteness")
    @NInt
    public native long definiteness();

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("determination")
    @NInt
    public native long determination();

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("grammaticalCase")
    @NInt
    public native long grammaticalCase();

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("grammaticalPerson")
    @NInt
    public native long grammaticalPerson();

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("pronounType")
    @NInt
    public native long pronounType();

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("setDefiniteness:")
    public native void setDefiniteness(@NInt long value);

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("setDetermination:")
    public native void setDetermination(@NInt long value);

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("setGrammaticalCase:")
    public native void setGrammaticalCase(@NInt long value);

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("setGrammaticalPerson:")
    public native void setGrammaticalPerson(@NInt long value);

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("setPronounType:")
    public native void setPronounType(@NInt long value);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
