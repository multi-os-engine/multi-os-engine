package apple.uikit.protocol;

import apple.uikit.UIContextMenuConfiguration;
import apple.uikit.UISwipeActionsConfiguration;
import apple.uikit.UITab;
import apple.uikit.UITabBarController;
import apple.uikit.UITabBarControllerSidebar;
import apple.uikit.UITabSidebarItem;
import apple.uikit.UITabSidebarItemRequest;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * API-Since: 18.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UITabBarControllerSidebarDelegate")
public interface UITabBarControllerSidebarDelegate {
    /**
     * Called when the sidebar is about to display a context menu for the specified `tab`.
     * Return either a concrete `UIContextMenuConfiguration` or nil if the tab does not show context menus.
     * 
     * API-Since: 18.0
     */
    @Generated
    @IsOptional
    @Selector("tabBarController:sidebar:contextMenuConfigurationForTab:")
    @Nullable
    default UIContextMenuConfiguration tabBarControllerSidebarContextMenuConfigurationForTab(
            @NotNull UITabBarController tabBarController, @NotNull UITabBarControllerSidebar sidebar,
            @NotNull UITab tab) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Notifies the delegate when the sidebar has finished displaying the row representing the specified `tab`
     * 
     * API-Since: 18.0
     */
    @Generated
    @IsOptional
    @Selector("tabBarController:sidebar:didEndDisplayingTab:")
    default void tabBarControllerSidebarDidEndDisplayingTab(@NotNull UITabBarController tabBarController,
            @NotNull UITabBarControllerSidebar sidebar, @NotNull UITab tab) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Return a `UITabSidebarItem` for the specified item request. When created, the item will be preconfigured
     * to the appropriate defaults for its given content. If this method is not implemented, a default sidebar
     * item will be provided for the request.
     * 
     * API-Since: 18.0
     */
    @Generated
    @IsOptional
    @Selector("tabBarController:sidebar:itemForRequest:")
    @NotNull
    default UITabSidebarItem tabBarControllerSidebarItemForRequest(@NotNull UITabBarController tabBarController,
            @NotNull UITabBarControllerSidebar sidebar, @NotNull UITabSidebarItemRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the sidebar is about to show leading swipe actions for the specified `tab`.
     * Return either a concrete `UISwipeActionsConfiguration` or nil if the tab does not show swipe actions.
     */
    @Generated
    @IsOptional
    @Selector("tabBarController:sidebar:leadingSwipeActionsConfigurationForTab:")
    @Nullable
    default UISwipeActionsConfiguration tabBarControllerSidebarLeadingSwipeActionsConfigurationForTab(
            @NotNull UITabBarController tabBarController, @NotNull UITabBarControllerSidebar sidebar,
            @NotNull UITab tab) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the sidebar is about to show trailing swipe actions for a particular tab.
     * Return either a UISwipeActionsConfiguration object or nil if this tab does not show swipe actions.
     */
    @Generated
    @IsOptional
    @Selector("tabBarController:sidebar:trailingSwipeActionsConfigurationForTab:")
    @Nullable
    default UISwipeActionsConfiguration tabBarControllerSidebarTrailingSwipeActionsConfigurationForTab(
            @NotNull UITabBarController tabBarController, @NotNull UITabBarControllerSidebar sidebar,
            @NotNull UITab tab) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called whenever the sidebar item's `configurationState` changes or the item is reconfigured.
     * The passed in item will accure all modifications until the delegate requests for a new sidebar
     * item from the delegate method `tabBarController:sidebar:itemForRequest:`
     * 
     * API-Since: 18.0
     */
    @Generated
    @IsOptional
    @Selector("tabBarController:sidebar:updateItem:")
    default void tabBarControllerSidebarUpdateItem(@NotNull UITabBarController tabBarController,
            @NotNull UITabBarControllerSidebar sidebar, @NotNull UITabSidebarItem item) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Notifies the delegate when the sidebar is about to display the row representing the specified `tab`
     * 
     * API-Since: 18.0
     */
    @Generated
    @IsOptional
    @Selector("tabBarController:sidebar:willBeginDisplayingTab:")
    default void tabBarControllerSidebarWillBeginDisplayingTab(@NotNull UITabBarController tabBarController,
            @NotNull UITabBarControllerSidebar sidebar, @NotNull UITab tab) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Notifies the delegate when the visibility of the sidebar is about to change when `sidebar.isHidden` changes.
     * Add animations to the animator to run alongside the visibility update. Alongside animations and completions will
     * run immediately
     * if the sidebar visibility is changed without animation.
     * 
     * API-Since: 18.0
     */
    @Generated
    @IsOptional
    @Selector("tabBarController:sidebarVisibilityWillChange:animator:")
    default void tabBarControllerSidebarVisibilityWillChangeAnimator(@NotNull UITabBarController tabBarController,
            @NotNull UITabBarControllerSidebar sidebar,
            @Mapped(ObjCObjectMapper.class) @NotNull UITabBarControllerSidebarAnimating animator) {
        throw new java.lang.UnsupportedOperationException();
    }
}