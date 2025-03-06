package apple.pencilkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.UIColor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NFloat;
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
 * A user interface for a custom tool item in PKToolPicker.
 * 
 * API-Since: 18.0
 */
@Generated
@Library("PencilKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PKToolPickerCustomItem extends PKToolPickerItem {
    static {
        NatJ.register();
    }

    @Generated
    protected PKToolPickerCustomItem(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PKToolPickerCustomItem alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native PKToolPickerCustomItem allocWithZone(VoidPtr zone);

    /**
     * Present color selection UI to the user.
     * Defaults to the value set in `configuration`.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("allowsColorSelection")
    public native boolean allowsColorSelection();

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

    /**
     * The current color of the custom tool item.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("color")
    @NotNull
    public native UIColor color();

    /**
     * The configuration of the custom tool item.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("configuration")
    @NotNull
    public native PKToolPickerCustomItemConfiguration configuration();

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
    public native PKToolPickerCustomItem init();

    /**
     * Create a new custom tool picker item.
     * 
     * @param configuration The configuration for the custom item.
     * 
     *                      API-Since: 18.0
     */
    @Generated
    @Selector("initWithConfiguration:")
    public native PKToolPickerCustomItem initWithConfiguration(
            @NotNull PKToolPickerCustomItemConfiguration configuration);

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

    @Generated
    @Owned
    @Selector("new")
    public static native PKToolPickerCustomItem new_objc();

    /**
     * Causes a new image for this tool item to be requested from `configuration`'s `imageProvider` block.
     * Call this method when the image for the tool item would be different from the one previously provided.
     * It is not necessary to call this method when attributes provided by PencilKit, like `color` or `width`, are
     * changed;
     * the block will be called automatically when those are mutated.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("reloadImage")
    public native void reloadImage();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Present color selection UI to the user.
     * Defaults to the value set in `configuration`.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setAllowsColorSelection:")
    public native void setAllowsColorSelection(boolean value);

    /**
     * The current color of the custom tool item.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setColor:")
    public native void setColor(@NotNull UIColor value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * The current width of the custom tool item.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setWidth:")
    public native void setWidth(@NFloat double value);

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
     * The current width of the custom tool item.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("width")
    @NFloat
    public native double width();
}