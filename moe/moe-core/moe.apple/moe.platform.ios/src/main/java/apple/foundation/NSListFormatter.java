package apple.foundation;

import apple.NSObject;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * NSListFormatter provides locale-correct formatting of a list of items using the appropriate separator and
 * conjunction. Note that the list formatter is unaware of the context where the joined string will be used, e.g., in
 * the beginning of the sentence or used as a standalone string in the UI, so it will not provide any sort of
 * capitalization customization on the given items, but merely join them as-is. The string joined this way may not be
 * grammatically correct when placed in a sentence, and it should only be used in a standalone manner.
 * 
 * API-Since: 13.0
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSListFormatter extends NSFormatter {
    static {
        NatJ.register();
    }

    @Generated
    protected NSListFormatter(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSListFormatter alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSListFormatter allocWithZone(VoidPtr zone);

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
    public native NSListFormatter init();

    @Generated
    @Selector("initWithCoder:")
    public native NSListFormatter initWithCoder(@NotNull NSCoder coder);

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
     * Specifies how each object should be formatted. If not set, the object is formatted using its instance method in
     * the following order: -descriptionWithLocale:, -localizedDescription, and -description.
     */
    @Nullable
    @Generated
    @Selector("itemFormatter")
    public native NSFormatter itemFormatter();

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * Specifies the locale to format the items. Defaults to autoupdatingCurrentLocale. Also resets to
     * autoupdatingCurrentLocale on assignment of nil.
     */
    @Generated
    @Selector("locale")
    public native NSLocale locale();

    /**
     * Convenience method to return a string constructed from an array of strings using the list format specific to the
     * current locale. It is recommended to join only disjointed strings that are ready to display in a bullet-point
     * list. Sentences, phrases with punctuations, and appositions may not work well when joined together.
     */
    @NotNull
    @Generated
    @Selector("localizedStringByJoiningStrings:")
    public static native String localizedStringByJoiningStrings(@NotNull NSArray<String> strings);

    @Generated
    @Owned
    @Selector("new")
    public static native NSListFormatter new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Specifies how each object should be formatted. If not set, the object is formatted using its instance method in
     * the following order: -descriptionWithLocale:, -localizedDescription, and -description.
     */
    @Generated
    @Selector("setItemFormatter:")
    public native void setItemFormatter(@Nullable NSFormatter value);

    /**
     * Specifies the locale to format the items. Defaults to autoupdatingCurrentLocale. Also resets to
     * autoupdatingCurrentLocale on assignment of nil.
     */
    @Generated
    @Selector("setLocale:")
    public native void setLocale(NSLocale value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Inherited from NSFormatter. `obj` must be an instance of NSArray. Returns nil if `obj` is nil, not an instance of
     * NSArray, or if the list formatter cannot generate a string representation for all objects in the array.
     */
    @Nullable
    @Generated
    @Selector("stringForObjectValue:")
    public native String stringForObjectValue(@Nullable @Mapped(ObjCObjectMapper.class) Object obj);

    /**
     * Convenience method for -stringForObjectValue:. Returns a string constructed from an array in the locale-aware
     * format. Each item is formatted using the itemFormatter. If the itemFormatter does not apply to a particular item,
     * the method will fall back to the item's -descriptionWithLocale: or -localizedDescription if implemented, or
     * -description if not.
     * 
     * Returns nil if `items` is nil or if the list formatter cannot generate a string representation for all items in
     * the array.
     */
    @Nullable
    @Generated
    @Selector("stringFromItems:")
    public native String stringFromItems(@NotNull NSArray<?> items);

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
