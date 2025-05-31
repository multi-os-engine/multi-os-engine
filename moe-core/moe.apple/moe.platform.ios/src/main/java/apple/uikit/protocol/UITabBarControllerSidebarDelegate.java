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
import apple.foundation.NSArray;
import apple.uikit.UIAction;
import apple.uikit.UIDragItem;
import apple.uikit.UITabGroup;
import org.moe.natj.general.ann.NUInt;

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

    /**
     * Called when a new drag session is requesting items to add to the existing drag session in the sidebar from the
     * specified `tab`.
     * Return items if the specified tab can add to the drag session, or an empty array if nothing should be added.
     * 
     * API-Since: 18.4
     */
    @Generated
    @IsOptional
    @Selector("tabBarController:sidebar:itemsForAddingToDragSession:tab:")
    @NotNull
    default NSArray<? extends UIDragItem> tabBarControllerSidebarItemsForAddingToDragSessionTab(
            @NotNull UITabBarController tabBarController, @NotNull UITabBarControllerSidebar sidebar,
            @Mapped(ObjCObjectMapper.class) @NotNull UIDragSession dragSession, @NotNull UITab tab) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when a new drag session has begun in the sidebar from the specified `tab`. Return drag items if the
     * specified tab can be dragged, or an empty array if no drags should begin.
     * Note that if drag items are returned on tabs in groups that allow reordering, then tab reordering is disabled
     * when the sidebar is not in editing.
     * 
     * API-Since: 18.4
     */
    @Generated
    @IsOptional
    @Selector("tabBarController:sidebar:itemsForBeginningDragSession:tab:")
    @NotNull
    default NSArray<? extends UIDragItem> tabBarControllerSidebarItemsForBeginningDragSessionTab(
            @NotNull UITabBarController tabBarController, @NotNull UITabBarControllerSidebar sidebar,
            @Mapped(ObjCObjectMapper.class) @NotNull UIDragSession dragSession, @NotNull UITab tab) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Receive the drop from into the `sidebarAction` using the specified session. This is only called if the drop
     * operation returned
     * from `tabBarController:sidebar:sidebarAction:operationForAcceptingItemsFromDropSession` is valid for a drop.
     * 
     * API-Since: 18.4
     */
    @Generated
    @IsOptional
    @Selector("tabBarController:sidebar:sidebarAction:group:acceptItemsFromDropSession:")
    default void tabBarControllerSidebarSidebarActionGroupAcceptItemsFromDropSession(
            @NotNull UITabBarController tabBarController, @NotNull UITabBarControllerSidebar sidebar,
            @NotNull UIAction sidebarAction, @NotNull UITabGroup group,
            @Mapped(ObjCObjectMapper.class) @NotNull UIDropSession session) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Determines if items from the specified drop session can be dropped into the specified `sidebarAction`. If the
     * operation is either a `.move` or `.copy`,
     * then the drop will proceed and `tabBarController:sidebar:sidebarAction:acceptItemsFromDropSession:` is called. By
     * default, the drop will be
     * treated as a cancel operation if this is not implemented.
     * 
     * API-Since: 18.4
     */
    @Generated
    @IsOptional
    @Selector("tabBarController:sidebar:sidebarAction:group:operationForAcceptingItemsFromDropSession:")
    @NUInt
    default long tabBarControllerSidebarSidebarActionGroupOperationForAcceptingItemsFromDropSession(
            @NotNull UITabBarController tabBarController, @NotNull UITabBarControllerSidebar sidebar,
            @NotNull UIAction sidebarAction, @NotNull UITabGroup group,
            @Mapped(ObjCObjectMapper.class) @NotNull UIDropSession session) {
        throw new java.lang.UnsupportedOperationException();
    }
}