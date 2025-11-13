package apple.accessibility;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSLocale;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCoding;
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

/**
 * A rule for translating print text to Braille, and back-translating Braille to print text.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("Accessibility")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AXBrailleTable extends NSObject implements NSCopying, NSCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected AXBrailleTable(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AXBrailleTable alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native AXBrailleTable allocWithZone(VoidPtr zone);

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

    /**
     * The default table that provides translations for the given locale's language. Returns nil if there is none.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("defaultTableForLocale:")
    @Nullable
    public static native AXBrailleTable defaultTableForLocale(@NotNull NSLocale locale);

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

    /**
     * A unique string that identifies this table.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("identifier")
    @NotNull
    public native String identifier();

    @Generated
    @Selector("init")
    public native AXBrailleTable init();

    @Generated
    @Selector("initWithCoder:")
    public native AXBrailleTable initWithCoder(@NotNull NSCoder coder);

    /**
     * Returns nil if there is no table with the given identifier.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("initWithIdentifier:")
    public native AXBrailleTable initWithIdentifier(@NotNull String identifier);

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
     * Returns true if this table makes use of eight dots as opposed to six dots.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("isEightDot")
    public native boolean isEightDot();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * The 3-character code from ISO 639-2 for the language this Braille table pertains to.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("language")
    @NotNull
    public native String language();

    /**
     * All tables that are not specific to any language.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("languageAgnosticTables")
    @NotNull
    public static native NSSet<? extends AXBrailleTable> languageAgnosticTables();

    /**
     * All locales this table supports.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("locales")
    @NotNull
    public native NSSet<? extends NSLocale> locales();

    /**
     * The localized name of this table for user display.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("localizedName")
    @NotNull
    public native String localizedName();

    /**
     * The localized name of the provider of this table for user display.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("localizedProviderName")
    @NotNull
    public native String localizedProviderName();

    @Generated
    @Owned
    @Selector("new")
    public static native AXBrailleTable new_objc();

    /**
     * The identifier of the provider of this table.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("providerIdentifier")
    @NotNull
    public native String providerIdentifier();

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

    /**
     * All locales supported by existing tables.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("supportedLocales")
    @NotNull
    public static native NSSet<? extends NSLocale> supportedLocales();

    /**
     * All tables that provide translations for the given locale's language.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("tablesForLocale:")
    @NotNull
    public static native NSSet<? extends AXBrailleTable> tablesForLocale(@NotNull NSLocale locale);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}