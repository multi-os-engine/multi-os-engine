package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSPredicate;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 13.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIFontPickerViewControllerConfiguration extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected UIFontPickerViewControllerConfiguration(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIFontPickerViewControllerConfiguration alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UIFontPickerViewControllerConfiguration allocWithZone(VoidPtr zone);

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

    /**
     * Indicates if all fonts should be shown in the system font instead of themselves.
     */
    @Generated
    @Selector("displayUsingSystemFont")
    public native boolean displayUsingSystemFont();

    /**
     * Generate a filter predicate to filter to fonts that support one of the specified language identifiers (conforming
     * to UTS #35).
     */
    @Nullable
    @Generated
    @Selector("filterPredicateForFilteredLanguages:")
    public static native NSPredicate filterPredicateForFilteredLanguages(@NotNull NSArray<String> filteredLanguages);

    /**
     * Filter fonts based on languages supported using a predicate. The predicate is evaluated against an array of
     * string language identifiers (conforming to UTS #35) supported by the font.
     */
    @Nullable
    @Generated
    @Selector("filteredLanguagesPredicate")
    public native NSPredicate filteredLanguagesPredicate();

    /**
     * Filter to fonts with just the specified traits.
     */
    @Generated
    @Selector("filteredTraits")
    public native int filteredTraits();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * Indicates if individual faces can be selected instead of just families.
     */
    @Generated
    @Selector("includeFaces")
    public native boolean includeFaces();

    @Generated
    @Selector("init")
    public native UIFontPickerViewControllerConfiguration init();

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
    public static native UIFontPickerViewControllerConfiguration new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Indicates if all fonts should be shown in the system font instead of themselves.
     */
    @Generated
    @Selector("setDisplayUsingSystemFont:")
    public native void setDisplayUsingSystemFont(boolean value);

    /**
     * Filter fonts based on languages supported using a predicate. The predicate is evaluated against an array of
     * string language identifiers (conforming to UTS #35) supported by the font.
     */
    @Generated
    @Selector("setFilteredLanguagesPredicate:")
    public native void setFilteredLanguagesPredicate(@Nullable NSPredicate value);

    /**
     * Filter to fonts with just the specified traits.
     */
    @Generated
    @Selector("setFilteredTraits:")
    public native void setFilteredTraits(int value);

    /**
     * Indicates if individual faces can be selected instead of just families.
     */
    @Generated
    @Selector("setIncludeFaces:")
    public native void setIncludeFaces(boolean value);

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

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
