package apple.avfoundation;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
 * For content that has been authored with the express intent of offering an alternative selection interface for
 * AVMediaSelectionOptions, AVCustomMediaSelectionScheme provides a collection of custom settings for controlling the
 * presentation of the media.
 * 
 * Each selectable setting is associated with a media characteristic that one or more of the AVMediaSelectionOptions in
 * the AVMediaSelectionGroup possesses. By selecting a setting in a user interface based on an
 * AVCustomMediaSelectionScheme, users are essentially indicating a preference for the media characteristic of the
 * selected setting. Selection of a specific AVMediaSelectionOption in the AVMediaSelectionGroup is then derived from
 * the user's indicated preferences. Subclasses of this type that are used from Swift must fulfill the requirements of a
 * Sendable type.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVCustomMediaSelectionScheme extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected AVCustomMediaSelectionScheme(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVCustomMediaSelectionScheme alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native AVCustomMediaSelectionScheme allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * Provides available language choices.
     * 
     * Each string in the array is intended to be interpreted as a BCP 47 language tag.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("availableLanguages")
    @NotNull
    public native NSArray<String> availableLanguages();

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
    public native AVCustomMediaSelectionScheme init();

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
     * Provides an array of media presentation settings that can be effective at the same time as the specified language
     * and settings for other selectors of the receiver.
     * 
     * If the content is authored to provide a collection of AVMediaSelectionOptions that include one or more with all
     * of the combinations of media characteristics of the specified AVMediaPresentationSettings together with all of
     * the settings of the specified AVMediaPresentationSelector, this method will return all of the settings for that
     * selector. However, if one or more of the available combinations are not possessed by any of the
     * AVMediaSelectionOptions, it will return fewer.
     * 
     * - Parameter selector: The AVMediaPresentationSelector for which complementary settings are requested.
     * - Parameter language: A BCP 47 language tag chosen among the availableLanguages of the receiver. If no language
     * setting pertains, can be nil.
     * - Parameter settings: A collection of AVMediaPresentationSettings provided by selectors of the receiver other
     * than the specified selector. Because no two AVMediaPresentationSettings of the same AVMediaPresentationSelector
     * are complementary, an empty array will be returned if you specify more than one setting for any selector.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("mediaPresentationSettingsForSelector:complementaryToLanguage:settings:")
    @NotNull
    public native NSArray<? extends AVMediaPresentationSetting> mediaPresentationSettingsForSelectorComplementaryToLanguageSettings(
            @NotNull AVMediaPresentationSelector selector, @Nullable String language,
            @NotNull NSArray<? extends AVMediaPresentationSetting> settings);

    @Generated
    @Owned
    @Selector("new")
    public static native AVCustomMediaSelectionScheme new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Provides custom settings.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("selectors")
    @NotNull
    public native NSArray<? extends AVMediaPresentationSelector> selectors();

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Indicates whether an alternative selection interface should provide a menu of language choices.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("shouldOfferLanguageSelection")
    public native boolean shouldOfferLanguageSelection();

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
}