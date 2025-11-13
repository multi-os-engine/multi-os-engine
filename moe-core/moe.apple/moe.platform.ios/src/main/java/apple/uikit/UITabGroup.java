package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
public class UITabGroup extends UITab {
    static {
        NatJ.register();
    }

    @Generated
    protected UITabGroup(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UITabGroup alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native UITabGroup allocWithZone(VoidPtr zone);

    /**
     * Determines if elements in `children` can be reordered from the sidebar. Default is NO.
     * Changes in the display order are notified via `tabBarController:displayOrderDidChangeForGroup:`
     * in `UITabBarControllerDelegate`.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("allowsReordering")
    public native boolean allowsReordering();

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

    /**
     * Child tabs of the tab group. Default is an empty array.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("children")
    @NotNull
    public native NSArray<? extends UITab> children();

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

    /**
     * The default child tab to select for when a selection is required and `selectedChild` is nil.
     * If this is nil, then the default selected element is the first element of `children`. Default is nil.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("defaultChildIdentifier")
    @Nullable
    public native String defaultChildIdentifier();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Returns the `children` array sorted by `displayOrderIdentifiers` if it is specified.
     * Any tab in `children` not contained in the identifiers will be appended after
     * sorted items. Identifiers that do not match tabs in `children` will be ignored.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("displayOrder")
    @NotNull
    public native NSArray<? extends UITab> displayOrder();

    /**
     * The display order of the children, represented by the identifiers. Default is empty.
     * Any tab in `children` not contained in `displayOrderIdentifiers` will be appended after
     * sorted items. Identifiers that do not match tabs in `children` will be ignored.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("displayOrderIdentifiers")
    @NotNull
    public native NSArray<String> displayOrderIdentifiers();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native UITabGroup init();

    /**
     * Creates a `UITabGroup` using the specified parameters.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("initWithTitle:image:identifier:children:viewControllerProvider:")
    public native UITabGroup initWithTitleImageIdentifierChildrenViewControllerProvider(@NotNull String title,
            @Nullable UIImage image, @NotNull String identifier, @NotNull NSArray<? extends UITab> children,
            @ObjCBlock(name = "call_initWithTitleImageIdentifierChildrenViewControllerProvider") @Nullable Block_initWithTitleImageIdentifierChildrenViewControllerProvider viewControllerProvider);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithTitleImageIdentifierChildrenViewControllerProvider {
        @Generated
        @NotNull
        UIViewController call_initWithTitleImageIdentifierChildrenViewControllerProvider(@NotNull UITab arg0);
    }

    @Generated
    @Selector("initWithTitle:image:identifier:viewControllerProvider:")
    public native UITabGroup initWithTitleImageIdentifierViewControllerProvider(@NotNull String title,
            @Nullable UIImage image, @NotNull String identifier,
            @ObjCBlock(name = "call_initWithTitleImageIdentifierViewControllerProvider") @Nullable UITab.Block_initWithTitleImageIdentifierViewControllerProvider viewControllerProvider);

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
     * A navigation controller used to automatically manage the view controller hierarchy of the group.
     * Set a `UINavigationController` to allow the tab group to manage the hierarchy automatically.
     * The navigation stack of the managing navigation controller will be managed by the tab group based on
     * the selected tab of the group. When multiple navigation controllers are set on nested groups, the root-most
     * controller is used. Default is nil.
     * 
     * By default, the navigation stack is represented by the view controller of each tab of the selected tree, if a
     * view controller is provided for that level. If no view controller is provided for that level, then it will be
     * ignored.
     * 
     * To customize the displayed view controllers per tab level of selection, implement the delegate method
     * `tabBarController:displayedViewControllersForTab:proposedViewControllers:`
     * on `UITabBarControllerDelegate`, which will propose a set of view controllers per level.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("managingNavigationController")
    @Nullable
    public native UINavigationController managingNavigationController();

    @Generated
    @Owned
    @Selector("new")
    public static native UITabGroup new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The currently selected tab. The tab must be part of `children`.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("selectedChild")
    @Nullable
    public native UITab selectedChild();

    /**
     * Determines if elements in `children` can be reordered from the sidebar. Default is NO.
     * Changes in the display order are notified via `tabBarController:displayOrderDidChangeForGroup:`
     * in `UITabBarControllerDelegate`.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setAllowsReordering:")
    public native void setAllowsReordering(boolean value);

    /**
     * Child tabs of the tab group. Default is an empty array.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setChildren:")
    public native void setChildren(@NotNull NSArray<? extends UITab> value);

    /**
     * The default child tab to select for when a selection is required and `selectedChild` is nil.
     * If this is nil, then the default selected element is the first element of `children`. Default is nil.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setDefaultChildIdentifier:")
    public native void setDefaultChildIdentifier(@Nullable String value);

    /**
     * The display order of the children, represented by the identifiers. Default is empty.
     * Any tab in `children` not contained in `displayOrderIdentifiers` will be appended after
     * sorted items. Identifiers that do not match tabs in `children` will be ignored.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setDisplayOrderIdentifiers:")
    public native void setDisplayOrderIdentifiers(@NotNull NSArray<String> value);

    /**
     * A navigation controller used to automatically manage the view controller hierarchy of the group.
     * Set a `UINavigationController` to allow the tab group to manage the hierarchy automatically.
     * The navigation stack of the managing navigation controller will be managed by the tab group based on
     * the selected tab of the group. When multiple navigation controllers are set on nested groups, the root-most
     * controller is used. Default is nil.
     * 
     * By default, the navigation stack is represented by the view controller of each tab of the selected tree, if a
     * view controller is provided for that level. If no view controller is provided for that level, then it will be
     * ignored.
     * 
     * To customize the displayed view controllers per tab level of selection, implement the delegate method
     * `tabBarController:displayedViewControllersForTab:proposedViewControllers:`
     * on `UITabBarControllerDelegate`, which will propose a set of view controllers per level.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setManagingNavigationController:")
    public native void setManagingNavigationController(@Nullable UINavigationController value);

    /**
     * The currently selected tab. The tab must be part of `children`.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setSelectedChild:")
    public native void setSelectedChild(@Nullable UITab value);

    /**
     * Actions to display in the sidebar, after all tabs. Default is nil.
     */
    @Generated
    @Selector("setSidebarActions:")
    public native void setSidebarActions(@NotNull NSArray<? extends UIAction> value);

    /**
     * The preferred appearance of the group and its children in the sidebar. Default is `automatic`
     */
    @Generated
    @Selector("setSidebarAppearance:")
    public native void setSidebarAppearance(@NUInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Actions to display in the sidebar, after all tabs. Default is nil.
     */
    @Generated
    @Selector("sidebarActions")
    @NotNull
    public native NSArray<? extends UIAction> sidebarActions();

    /**
     * The preferred appearance of the group and its children in the sidebar. Default is `automatic`
     */
    @Generated
    @Selector("sidebarAppearance")
    @NUInt
    public native long sidebarAppearance();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Returns the `tab` matching the specified `identifier` in the group's children and its descendants.
     * Returns nil if no tab is found matching the `identifier`.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("tabForIdentifier:")
    @Nullable
    public native UITab tabForIdentifier(@NotNull String identifier);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Determines if the tab group itself can be selected as a destination in the sidebar.
     * 
     * By default, tab groups are not destinations when displayed in the sidebar, and cannot be selected directly
     * by users. When enabled, the tab group becomes a selectable item in the sidebar, and will no longer perform
     * automatic selection for a default child if no child is currently selected. The default value is NO.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("isSidebarDestination")
    public native boolean isSidebarDestination();

    /**
     * Determines if the tab group itself can be selected as a destination in the sidebar.
     * 
     * By default, tab groups are not destinations when displayed in the sidebar, and cannot be selected directly
     * by users. When enabled, the tab group becomes a selectable item in the sidebar, and will no longer perform
     * automatic selection for a default child if no child is currently selected. The default value is NO.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setIsSidebarDestination:")
    public native void setIsSidebarDestination(boolean value);
}