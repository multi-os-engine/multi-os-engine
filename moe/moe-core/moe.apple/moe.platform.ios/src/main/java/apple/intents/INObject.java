package apple.intents;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import apple.intents.protocol.INSpeakable;
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
 * API-Since: 12.0
 */
@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class INObject extends NSObject implements INSpeakable, NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected INObject(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native INObject alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native INObject allocWithZone(VoidPtr zone);

    @Nullable
    @Generated
    @Selector("alternativeSpeakableMatches")
    public native NSArray<? extends INSpeakableString> alternativeSpeakableMatches();

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

    @NotNull
    @Generated
    @Selector("displayString")
    public native String displayString();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Nullable
    @Generated
    @Selector("identifier")
    public native String identifier();

    @Generated
    @Selector("init")
    public native INObject init();

    @Generated
    @Selector("initWithCoder:")
    public native INObject initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithIdentifier:displayString:")
    public native INObject initWithIdentifierDisplayString(@Nullable String identifier, @NotNull String displayString);

    @Generated
    @Selector("initWithIdentifier:displayString:pronunciationHint:")
    public native INObject initWithIdentifierDisplayStringPronunciationHint(@Nullable String identifier,
            @NotNull String displayString, @Nullable String pronunciationHint);

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
    public static native INObject new_objc();

    @Nullable
    @Generated
    @Selector("pronunciationHint")
    public native String pronunciationHint();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("setAlternativeSpeakableMatches:")
    public native void setAlternativeSpeakableMatches(@Nullable NSArray<? extends INSpeakableString> value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @NotNull
    @Generated
    @Selector("spokenPhrase")
    public native String spokenPhrase();

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

    @Nullable
    @Generated
    @Selector("vocabularyIdentifier")
    public native String vocabularyIdentifier();

    /**
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("displayImage")
    public native INImage displayImage();

    /**
     * API-Since: 14.0
     */
    @Generated
    @Selector("initWithIdentifier:displayString:pronunciationHint:subtitleString:displayImage:")
    public native INObject initWithIdentifierDisplayStringPronunciationHintSubtitleStringDisplayImage(
            @Nullable String identifier, @NotNull String displayString, @Nullable String pronunciationHint,
            @Nullable String subtitleString, @Nullable INImage displayImage);

    /**
     * API-Since: 14.0
     */
    @Generated
    @Selector("initWithIdentifier:displayString:subtitleString:displayImage:")
    public native INObject initWithIdentifierDisplayStringSubtitleStringDisplayImage(@Nullable String identifier,
            @NotNull String displayString, @Nullable String subtitleString, @Nullable INImage displayImage);

    /**
     * API-Since: 14.0
     */
    @Generated
    @Selector("setDisplayImage:")
    public native void setDisplayImage(@Nullable INImage value);

    /**
     * API-Since: 14.0
     */
    @Generated
    @Selector("setSubtitleString:")
    public native void setSubtitleString(@Nullable String value);

    /**
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("subtitleString")
    public native String subtitleString();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
