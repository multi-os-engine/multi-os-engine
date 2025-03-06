package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.uikit.protocol.UIContentConfiguration;
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
 * API-Since: 18.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UITabSidebarItem extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected UITabSidebarItem(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * Cell accessories to use when displaying this item. Some accessories may not be shown if it conflicts with system
     * default accessories.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("accessories")
    @NotNull
    public native NSArray<? extends UICellAccessory> accessories();

    /**
     * The action that the receiver represents. Only one of `tab` or `action` will be valid for an item.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("action")
    @Nullable
    public native UIAction action();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UITabSidebarItem alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native UITabSidebarItem allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * The background configuration to use when displaying this item.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("backgroundConfiguration")
    @NotNull
    public native UIBackgroundConfiguration backgroundConfiguration();

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
     * The current configuration state of the sidebar item.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("configurationState")
    @NotNull
    public native UICellConfigurationState configurationState();

    /**
     * The content coinfiguration to use when displaying this item.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("contentConfiguration")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    public native UIContentConfiguration contentConfiguration();

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
     * Returns the default background configuration for this item and the configuration state.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("defaultBackgroundConfiguration")
    @NotNull
    public native UIBackgroundConfiguration defaultBackgroundConfiguration();

    /**
     * Returns the default content configuration for this item and the configuration state.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("defaultContentConfiguration")
    @NotNull
    public native UIListContentConfiguration defaultContentConfiguration();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native UITabSidebarItem init();

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
     * Creates a sidebar item from the specified request. The sidebar item will be preconfigured with the appropriate
     * defaults for its content.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("itemFromRequest:")
    public static native UITabSidebarItem itemFromRequest(@NotNull UITabSidebarItemRequest request);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native UITabSidebarItem new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Cell accessories to use when displaying this item. Some accessories may not be shown if it conflicts with system
     * default accessories.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setAccessories:")
    public native void setAccessories(@NotNull NSArray<? extends UICellAccessory> value);

    /**
     * The background configuration to use when displaying this item.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setBackgroundConfiguration:")
    public native void setBackgroundConfiguration(@NotNull UIBackgroundConfiguration value);

    /**
     * The content coinfiguration to use when displaying this item.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setContentConfiguration:")
    public native void setContentConfiguration(@Mapped(ObjCObjectMapper.class) @NotNull UIContentConfiguration value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * The tab that the receiver represents. Only one of `tab` or `action` will be valid for an item.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("tab")
    @Nullable
    public native UITab tab();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}