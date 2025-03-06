package apple.uikit;

import apple.NSObject;
import apple.corefoundation.struct.CGRect;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.protocol.UIAccessibilityIdentification;
import apple.uikit.protocol.UIPopoverPresentationControllerSourceItem;
import apple.uikit.protocol.UISpringLoadedInteractionSupporting;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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

/**
 * API-Since: 18.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UITab extends NSObject implements UIPopoverPresentationControllerSourceItem,
        UISpringLoadedInteractionSupporting, UIAccessibilityIdentification {
    static {
        NatJ.register();
    }

    @Generated
    protected UITab(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Selector("accessibilityIdentifier")
    @Nullable
    public native String accessibilityIdentifier();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UITab alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native UITab allocWithZone(VoidPtr zone);

    /**
     * Determines if the tab's visibility can be changed by the user while editing. Default is NO.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("allowsHiding")
    public native boolean allowsHiding();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * The badge value of the tab. Default is nil.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("badgeValue")
    @Nullable
    public native String badgeValue();

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
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("frameInView:")
    @ByValue
    public native CGRect frameInView(@NotNull UIView referenceView);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * The identifier associated with the tab, must be unique across the tab bar controller.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("identifier")
    @NotNull
    public native String identifier();

    /**
     * The image of the tab. Default is nil.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("image")
    @Nullable
    public native UIImage image();

    @Generated
    @Selector("init")
    public native UITab init();

    /**
     * Creates a tab with the specified identifier, title, image, and view controller provider.
     * The view controller provider is called when a view controller is requested and is currently nil.
     * For root level tabs on `UITabBarController`, the resolved view controller must be non-nil.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("initWithTitle:image:identifier:viewControllerProvider:")
    public native UITab initWithTitleImageIdentifierViewControllerProvider(@NotNull String title,
            @Nullable UIImage image, @NotNull String identifier,
            @ObjCBlock(name = "call_initWithTitleImageIdentifierViewControllerProvider") @Nullable Block_initWithTitleImageIdentifierViewControllerProvider viewControllerProvider);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithTitleImageIdentifierViewControllerProvider {
        @Generated
        @NotNull
        UIViewController call_initWithTitleImageIdentifierViewControllerProvider(@NotNull UITab arg0);
    }

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
     * Determines if the tab is currently hidden. Default is NO.
     * Hidden tabs cannot be accessed from the sidebar.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("isHidden")
    public native boolean isHidden();

    /**
     * The default hidden state. When the user resets their customization, `UITab.hidden` will be set to the value
     * of this property. Default is NO.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("isHiddenByDefault")
    public native boolean isHiddenByDefault();

    @Generated
    @Selector("isSpringLoaded")
    public native boolean isSpringLoaded();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * The managing tab group for the tab. This returns the rootmost `UITabGroup` in the tab's parent hierarchy with an
     * active `managingNavigationController`. This can be different to `parent` if the tab is nested in multiple
     * levels of tab groups. If the tab does not belong to a hierarchy with a managing navigation controller, then this
     * will return nil. Default is nil.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("managingTabGroup")
    @Nullable
    public native UITabGroup managingTabGroup();

    @Generated
    @Owned
    @Selector("new")
    public static native UITab new_objc();

    /**
     * The parent group of the tab. This is only non-nil if the tab is part of a parent group, and returns nil
     * otherwise.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("parent")
    @Nullable
    public native UITabGroup parent();

    /**
     * The preferred placement for the tab in the contexts that allow for different tab placements.
     * Default is `UITabPlacementAutomatic` which resolves its placement based on context.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("preferredPlacement")
    @NInt
    public native long preferredPlacement();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setAccessibilityIdentifier:")
    public native void setAccessibilityIdentifier(@Nullable String value);

    /**
     * Determines if the tab's visibility can be changed by the user while editing. Default is NO.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setAllowsHiding:")
    public native void setAllowsHiding(boolean value);

    /**
     * The badge value of the tab. Default is nil.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setBadgeValue:")
    public native void setBadgeValue(@Nullable String value);

    /**
     * Determines if the tab is currently hidden. Default is NO.
     * Hidden tabs cannot be accessed from the sidebar.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setHidden:")
    public native void setHidden(boolean value);

    /**
     * The default hidden state. When the user resets their customization, `UITab.hidden` will be set to the value
     * of this property. Default is NO.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setHiddenByDefault:")
    public native void setHiddenByDefault(boolean value);

    /**
     * The image of the tab. Default is nil.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setImage:")
    public native void setImage(@Nullable UIImage value);

    /**
     * The preferred placement for the tab in the contexts that allow for different tab placements.
     * Default is `UITabPlacementAutomatic` which resolves its placement based on context.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setPreferredPlacement:")
    public native void setPreferredPlacement(@NInt long value);

    @Generated
    @Selector("setSpringLoaded:")
    public native void setSpringLoaded(boolean value);

    /**
     * The subtitle of the tab. This is displayed only in certain contexts, like the sidebar. Default is nil.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setSubtitle:")
    public native void setSubtitle(@Nullable String value);

    /**
     * The title of the tab.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setTitle:")
    public native void setTitle(@NotNull String value);

    /**
     * A custom object associated with the tab. Default is nil.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setUserInfo:")
    public native void setUserInfo(@Mapped(ObjCObjectMapper.class) @Nullable Object value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * The subtitle of the tab. This is displayed only in certain contexts, like the sidebar. Default is nil.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("subtitle")
    @Nullable
    public native String subtitle();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * The tab bar controller managing the tab. This is non-nil when the tab
     * or any of its ancestors is added to a UITabBarController; and is nil
     * otherwise.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("tabBarController")
    @Nullable
    public native UITabBarController tabBarController();

    /**
     * The title of the tab.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("title")
    @NotNull
    public native String title();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    /**
     * A custom object associated with the tab. Default is nil.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("userInfo")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    public native Object userInfo();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * The view controller owned by the tab. The view controller provider is used to resolve the view controller
     * if it is currently nil. For root level tabs, the view controller for the tab must be non-nil.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("viewController")
    @Nullable
    public native UIViewController viewController();
}