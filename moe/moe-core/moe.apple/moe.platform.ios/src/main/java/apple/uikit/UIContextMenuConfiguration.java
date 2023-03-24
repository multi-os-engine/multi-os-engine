package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
import org.moe.natj.objc.ann.ObjCBlock;
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
public class UIContextMenuConfiguration extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected UIContextMenuConfiguration(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIContextMenuConfiguration alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UIContextMenuConfiguration allocWithZone(VoidPtr zone);

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

    /**
     * Returns a UIContextMenuConfiguration.
     * 
     * @param identifier      Optional unique identifier. If omitted, an NSUUID will be generated. May be used to
     *                        identify this configuration throughout the interaction's lifecycle.
     * @param previewProvider Optional preview view controller provider block, called when the menu is about to be
     *                        presented.
     * @param actionProvider  Optional action provider block, called when the menu is about to be presented.
     */
    @Generated
    @Selector("configurationWithIdentifier:previewProvider:actionProvider:")
    public static native UIContextMenuConfiguration configurationWithIdentifierPreviewProviderActionProvider(
            @Nullable @Mapped(ObjCObjectMapper.class) Object identifier,
            @Nullable @ObjCBlock(name = "call_configurationWithIdentifierPreviewProviderActionProvider_1") Block_configurationWithIdentifierPreviewProviderActionProvider_1 previewProvider,
            @Nullable @ObjCBlock(name = "call_configurationWithIdentifierPreviewProviderActionProvider_2") Block_configurationWithIdentifierPreviewProviderActionProvider_2 actionProvider);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_configurationWithIdentifierPreviewProviderActionProvider_1 {
        @Nullable
        @Generated
        UIViewController call_configurationWithIdentifierPreviewProviderActionProvider_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_configurationWithIdentifierPreviewProviderActionProvider_2 {
        @Nullable
        @Generated
        UIMenu call_configurationWithIdentifierPreviewProviderActionProvider_2(
                @NotNull NSArray<? extends UIMenuElement> suggestedActions);
    }

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

    /**
     * This configuration's identifier. When representing multiple items in your app, this identifier
     * corresponds to the primary item (i.e. the one with which the user interacted when invoking the menu).
     */
    @NotNull
    @Generated
    @Selector("identifier")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object identifier();

    @Generated
    @Selector("init")
    public native UIContextMenuConfiguration init();

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
    public static native UIContextMenuConfiguration new_objc();

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
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Number of items on which this menu acts. Used to badge a multi-item menu's preview stack.
     * When unset, this value is determined automatically by the system. Values lower than 2 hide the badge.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("badgeCount")
    @NInt
    public native long badgeCount();

    /**
     * Preferred menu element ordering strategy for this menu.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("preferredMenuElementOrder")
    @NInt
    public native long preferredMenuElementOrder();

    /**
     * When this menu acts on multiple items, you may include the identifiers of secondary items to display a multi-item
     * menu.
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("secondaryItemIdentifiers")
    public native NSSet<?> secondaryItemIdentifiers();

    /**
     * Number of items on which this menu acts. Used to badge a multi-item menu's preview stack.
     * When unset, this value is determined automatically by the system. Values lower than 2 hide the badge.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setBadgeCount:")
    public native void setBadgeCount(@NInt long value);

    /**
     * Preferred menu element ordering strategy for this menu.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setPreferredMenuElementOrder:")
    public native void setPreferredMenuElementOrder(@NInt long value);

    /**
     * When this menu acts on multiple items, you may include the identifiers of secondary items to display a multi-item
     * menu.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setSecondaryItemIdentifiers:")
    public native void setSecondaryItemIdentifiers(@NotNull NSSet<?> value);
}
