/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSBundle;
import apple.foundation.NSCoder;
import apple.foundation.NSIndexPath;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.protocol.UIContextMenuInteractionAnimating;
import apple.uikit.protocol.UIContextMenuInteractionCommitAnimating;
import apple.uikit.protocol.UISpringLoadedInteractionContext;
import apple.uikit.protocol.UITableViewDataSource;
import apple.uikit.protocol.UITableViewDelegate;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.corefoundation.struct.CGPoint;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Creates a table view with the correct dimensions and autoresizing, setting the datasource and delegate to self.
 * In -viewWillAppear:, it reloads the table's data if it's empty. Otherwise, it deselects all rows (with or without
 * animation) if clearsSelectionOnViewWillAppear is YES.
 * In -viewDidAppear:, it flashes the table's scroll indicators.
 * Implements -setEditing:animated: to toggle the editing state of the table.
 * 
 * API-Since: 2.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UITableViewController extends UIViewController implements UITableViewDelegate, UITableViewDataSource {
    static {
        NatJ.register();
    }

    @Generated
    protected UITableViewController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UITableViewController alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UITableViewController allocWithZone(VoidPtr zone);

    @Deprecated
    @Generated
    @Selector("attemptRotationToDeviceOrientation")
    public static native void attemptRotationToDeviceOrientation();

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
    @Selector("clearTextInputContextIdentifier:")
    public static native void clearTextInputContextIdentifier(@NotNull String identifier);

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
    public static native UITableViewController new_objc();

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
     * defaults to YES. If YES, any selection is cleared in viewWillAppear:
     * 
     * API-Since: 3.2
     */
    @Generated
    @Selector("clearsSelectionOnViewWillAppear")
    public native boolean clearsSelectionOnViewWillAppear();

    @Nullable
    @Generated
    @IsOptional
    @Selector("indexPathForPreferredFocusedViewInTableView:")
    public native NSIndexPath indexPathForPreferredFocusedViewInTableView(@NotNull UITableView tableView);

    @Generated
    @Selector("init")
    public native UITableViewController init();

    @Generated
    @Selector("initWithCoder:")
    public native UITableViewController initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithNibName:bundle:")
    public native UITableViewController initWithNibNameBundle(@Nullable String nibNameOrNil,
            @Nullable NSBundle nibBundleOrNil);

    @Generated
    @Selector("initWithStyle:")
    public native UITableViewController initWithStyle(@NInt long style);

    @Generated
    @IsOptional
    @Selector("numberOfSectionsInTableView:")
    @NInt
    public native long numberOfSectionsInTableView(@NotNull UITableView tableView);

    /**
     * API-Since: 6.0
     */
    @Nullable
    @Generated
    @Selector("refreshControl")
    public native UIRefreshControl refreshControl();

    @Generated
    @IsOptional
    @Selector("scrollViewDidEndDecelerating:")
    public native void scrollViewDidEndDecelerating(@NotNull UIScrollView scrollView);

    @Generated
    @IsOptional
    @Selector("scrollViewDidEndDragging:willDecelerate:")
    public native void scrollViewDidEndDraggingWillDecelerate(@NotNull UIScrollView scrollView, boolean decelerate);

    @Generated
    @IsOptional
    @Selector("scrollViewDidEndScrollingAnimation:")
    public native void scrollViewDidEndScrollingAnimation(@NotNull UIScrollView scrollView);

    @Generated
    @IsOptional
    @Selector("scrollViewDidEndZooming:withView:atScale:")
    public native void scrollViewDidEndZoomingWithViewAtScale(@NotNull UIScrollView scrollView, @Nullable UIView view,
            @NFloat double scale);

    @Generated
    @IsOptional
    @Selector("scrollViewDidScroll:")
    public native void scrollViewDidScroll(@NotNull UIScrollView scrollView);

    @Generated
    @IsOptional
    @Selector("scrollViewDidScrollToTop:")
    public native void scrollViewDidScrollToTop(@NotNull UIScrollView scrollView);

    @Generated
    @IsOptional
    @Selector("scrollViewDidZoom:")
    public native void scrollViewDidZoom(@NotNull UIScrollView scrollView);

    @Generated
    @IsOptional
    @Selector("scrollViewShouldScrollToTop:")
    public native boolean scrollViewShouldScrollToTop(@NotNull UIScrollView scrollView);

    @Generated
    @IsOptional
    @Selector("scrollViewWillBeginDecelerating:")
    public native void scrollViewWillBeginDecelerating(@NotNull UIScrollView scrollView);

    @Generated
    @IsOptional
    @Selector("scrollViewWillBeginDragging:")
    public native void scrollViewWillBeginDragging(@NotNull UIScrollView scrollView);

    @Generated
    @IsOptional
    @Selector("scrollViewWillBeginZooming:withView:")
    public native void scrollViewWillBeginZoomingWithView(@NotNull UIScrollView scrollView, @Nullable UIView view);

    @Generated
    @IsOptional
    @Selector("scrollViewWillEndDragging:withVelocity:targetContentOffset:")
    public native void scrollViewWillEndDraggingWithVelocityTargetContentOffset(@NotNull UIScrollView scrollView,
            @ByValue CGPoint velocity, @NotNull CGPoint targetContentOffset);

    @Nullable
    @Generated
    @IsOptional
    @Selector("sectionIndexTitlesForTableView:")
    public native NSArray<String> sectionIndexTitlesForTableView(@NotNull UITableView tableView);

    /**
     * defaults to YES. If YES, any selection is cleared in viewWillAppear:
     * 
     * API-Since: 3.2
     */
    @Generated
    @Selector("setClearsSelectionOnViewWillAppear:")
    public native void setClearsSelectionOnViewWillAppear(boolean value);

    /**
     * API-Since: 6.0
     */
    @Generated
    @Selector("setRefreshControl:")
    public native void setRefreshControl(@Nullable UIRefreshControl value);

    @Generated
    @Selector("setTableView:")
    public native void setTableView(UITableView value);

    @Generated
    @Selector("tableView")
    public native UITableView tableView();

    @Generated
    @IsOptional
    @Selector("tableView:accessoryButtonTappedForRowWithIndexPath:")
    public native void tableViewAccessoryButtonTappedForRowWithIndexPath(@NotNull UITableView tableView,
            @NotNull NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Deprecated
    @Selector("tableView:accessoryTypeForRowWithIndexPath:")
    @NInt
    public native long tableViewAccessoryTypeForRowWithIndexPath(@NotNull UITableView tableView,
            @NotNull NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("tableView:canEditRowAtIndexPath:")
    public native boolean tableViewCanEditRowAtIndexPath(@NotNull UITableView tableView,
            @NotNull NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("tableView:canFocusRowAtIndexPath:")
    public native boolean tableViewCanFocusRowAtIndexPath(@NotNull UITableView tableView,
            @NotNull NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("tableView:canMoveRowAtIndexPath:")
    public native boolean tableViewCanMoveRowAtIndexPath(@NotNull UITableView tableView,
            @NotNull NSIndexPath indexPath);

    @Deprecated
    @Generated
    @IsOptional
    @Selector("tableView:canPerformAction:forRowAtIndexPath:withSender:")
    public native boolean tableViewCanPerformActionForRowAtIndexPathWithSender(@NotNull UITableView tableView,
            @NotNull SEL action, @NotNull NSIndexPath indexPath,
            @Nullable @Mapped(ObjCObjectMapper.class) Object sender);

    @NotNull
    @Generated
    @Selector("tableView:cellForRowAtIndexPath:")
    public native UITableViewCell tableViewCellForRowAtIndexPath(@NotNull UITableView tableView,
            @NotNull NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("tableView:commitEditingStyle:forRowAtIndexPath:")
    public native void tableViewCommitEditingStyleForRowAtIndexPath(@NotNull UITableView tableView,
            @NInt long editingStyle, @NotNull NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("tableView:didDeselectRowAtIndexPath:")
    public native void tableViewDidDeselectRowAtIndexPath(@NotNull UITableView tableView,
            @NotNull NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("tableView:didEndDisplayingCell:forRowAtIndexPath:")
    public native void tableViewDidEndDisplayingCellForRowAtIndexPath(@NotNull UITableView tableView,
            @NotNull UITableViewCell cell, @NotNull NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("tableView:didEndDisplayingFooterView:forSection:")
    public native void tableViewDidEndDisplayingFooterViewForSection(@NotNull UITableView tableView,
            @NotNull UIView view, @NInt long section);

    @Generated
    @IsOptional
    @Selector("tableView:didEndDisplayingHeaderView:forSection:")
    public native void tableViewDidEndDisplayingHeaderViewForSection(@NotNull UITableView tableView,
            @NotNull UIView view, @NInt long section);

    @Generated
    @IsOptional
    @Selector("tableView:didEndEditingRowAtIndexPath:")
    public native void tableViewDidEndEditingRowAtIndexPath(@NotNull UITableView tableView,
            @Nullable NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("tableView:didHighlightRowAtIndexPath:")
    public native void tableViewDidHighlightRowAtIndexPath(@NotNull UITableView tableView,
            @NotNull NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("tableView:didSelectRowAtIndexPath:")
    public native void tableViewDidSelectRowAtIndexPath(@NotNull UITableView tableView, @NotNull NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("tableView:didUnhighlightRowAtIndexPath:")
    public native void tableViewDidUnhighlightRowAtIndexPath(@NotNull UITableView tableView,
            @NotNull NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("tableView:didUpdateFocusInContext:withAnimationCoordinator:")
    public native void tableViewDidUpdateFocusInContextWithAnimationCoordinator(@NotNull UITableView tableView,
            @NotNull UITableViewFocusUpdateContext context, @NotNull UIFocusAnimationCoordinator coordinator);

    @Nullable
    @Deprecated
    @Generated
    @IsOptional
    @Selector("tableView:editActionsForRowAtIndexPath:")
    public native NSArray<? extends UITableViewRowAction> tableViewEditActionsForRowAtIndexPath(
            @NotNull UITableView tableView, @NotNull NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("tableView:editingStyleForRowAtIndexPath:")
    @NInt
    public native long tableViewEditingStyleForRowAtIndexPath(@NotNull UITableView tableView,
            @NotNull NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("tableView:estimatedHeightForFooterInSection:")
    @NFloat
    public native double tableViewEstimatedHeightForFooterInSection(@NotNull UITableView tableView, @NInt long section);

    @Generated
    @IsOptional
    @Selector("tableView:estimatedHeightForHeaderInSection:")
    @NFloat
    public native double tableViewEstimatedHeightForHeaderInSection(@NotNull UITableView tableView, @NInt long section);

    @Generated
    @IsOptional
    @Selector("tableView:estimatedHeightForRowAtIndexPath:")
    @NFloat
    public native double tableViewEstimatedHeightForRowAtIndexPath(@NotNull UITableView tableView,
            @NotNull NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("tableView:heightForFooterInSection:")
    @NFloat
    public native double tableViewHeightForFooterInSection(@NotNull UITableView tableView, @NInt long section);

    @Generated
    @IsOptional
    @Selector("tableView:heightForHeaderInSection:")
    @NFloat
    public native double tableViewHeightForHeaderInSection(@NotNull UITableView tableView, @NInt long section);

    @Generated
    @IsOptional
    @Selector("tableView:heightForRowAtIndexPath:")
    @NFloat
    public native double tableViewHeightForRowAtIndexPath(@NotNull UITableView tableView,
            @NotNull NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("tableView:indentationLevelForRowAtIndexPath:")
    @NInt
    public native long tableViewIndentationLevelForRowAtIndexPath(@NotNull UITableView tableView,
            @NotNull NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("tableView:moveRowAtIndexPath:toIndexPath:")
    public native void tableViewMoveRowAtIndexPathToIndexPath(@NotNull UITableView tableView,
            @NotNull NSIndexPath sourceIndexPath, @NotNull NSIndexPath destinationIndexPath);

    @Generated
    @Selector("tableView:numberOfRowsInSection:")
    @NInt
    public native long tableViewNumberOfRowsInSection(@NotNull UITableView tableView, @NInt long section);

    @Deprecated
    @Generated
    @IsOptional
    @Selector("tableView:performAction:forRowAtIndexPath:withSender:")
    public native void tableViewPerformActionForRowAtIndexPathWithSender(@NotNull UITableView tableView,
            @NotNull SEL action, @NotNull NSIndexPath indexPath,
            @Nullable @Mapped(ObjCObjectMapper.class) Object sender);

    @Generated
    @IsOptional
    @Selector("tableView:sectionForSectionIndexTitle:atIndex:")
    @NInt
    public native long tableViewSectionForSectionIndexTitleAtIndex(@NotNull UITableView tableView,
            @NotNull String title, @NInt long index);

    @Generated
    @IsOptional
    @Selector("tableView:shouldHighlightRowAtIndexPath:")
    public native boolean tableViewShouldHighlightRowAtIndexPath(@NotNull UITableView tableView,
            @NotNull NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("tableView:shouldIndentWhileEditingRowAtIndexPath:")
    public native boolean tableViewShouldIndentWhileEditingRowAtIndexPath(@NotNull UITableView tableView,
            @NotNull NSIndexPath indexPath);

    @Deprecated
    @Generated
    @IsOptional
    @Selector("tableView:shouldShowMenuForRowAtIndexPath:")
    public native boolean tableViewShouldShowMenuForRowAtIndexPath(@NotNull UITableView tableView,
            @NotNull NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("tableView:shouldUpdateFocusInContext:")
    public native boolean tableViewShouldUpdateFocusInContext(@NotNull UITableView tableView,
            @NotNull UITableViewFocusUpdateContext context);

    @NotNull
    @Generated
    @IsOptional
    @Selector("tableView:targetIndexPathForMoveFromRowAtIndexPath:toProposedIndexPath:")
    public native NSIndexPath tableViewTargetIndexPathForMoveFromRowAtIndexPathToProposedIndexPath(
            @NotNull UITableView tableView, @NotNull NSIndexPath sourceIndexPath,
            @NotNull NSIndexPath proposedDestinationIndexPath);

    @Nullable
    @Generated
    @IsOptional
    @Selector("tableView:titleForDeleteConfirmationButtonForRowAtIndexPath:")
    public native String tableViewTitleForDeleteConfirmationButtonForRowAtIndexPath(@NotNull UITableView tableView,
            @NotNull NSIndexPath indexPath);

    @Nullable
    @Generated
    @IsOptional
    @Selector("tableView:titleForFooterInSection:")
    public native String tableViewTitleForFooterInSection(@NotNull UITableView tableView, @NInt long section);

    @Nullable
    @Generated
    @IsOptional
    @Selector("tableView:titleForHeaderInSection:")
    public native String tableViewTitleForHeaderInSection(@NotNull UITableView tableView, @NInt long section);

    @Nullable
    @Generated
    @IsOptional
    @Selector("tableView:viewForFooterInSection:")
    public native UIView tableViewViewForFooterInSection(@NotNull UITableView tableView, @NInt long section);

    @Nullable
    @Generated
    @IsOptional
    @Selector("tableView:viewForHeaderInSection:")
    public native UIView tableViewViewForHeaderInSection(@NotNull UITableView tableView, @NInt long section);

    @Generated
    @IsOptional
    @Selector("tableView:willBeginEditingRowAtIndexPath:")
    public native void tableViewWillBeginEditingRowAtIndexPath(@NotNull UITableView tableView,
            @NotNull NSIndexPath indexPath);

    @Nullable
    @Generated
    @IsOptional
    @Selector("tableView:willDeselectRowAtIndexPath:")
    public native NSIndexPath tableViewWillDeselectRowAtIndexPath(@NotNull UITableView tableView,
            @NotNull NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("tableView:willDisplayCell:forRowAtIndexPath:")
    public native void tableViewWillDisplayCellForRowAtIndexPath(@NotNull UITableView tableView,
            @NotNull UITableViewCell cell, @NotNull NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("tableView:willDisplayFooterView:forSection:")
    public native void tableViewWillDisplayFooterViewForSection(@NotNull UITableView tableView, @NotNull UIView view,
            @NInt long section);

    @Generated
    @IsOptional
    @Selector("tableView:willDisplayHeaderView:forSection:")
    public native void tableViewWillDisplayHeaderViewForSection(@NotNull UITableView tableView, @NotNull UIView view,
            @NInt long section);

    @Nullable
    @Generated
    @IsOptional
    @Selector("tableView:willSelectRowAtIndexPath:")
    public native NSIndexPath tableViewWillSelectRowAtIndexPath(@NotNull UITableView tableView,
            @NotNull NSIndexPath indexPath);

    @Nullable
    @Generated
    @IsOptional
    @Selector("viewForZoomingInScrollView:")
    public native UIView viewForZoomingInScrollView(@NotNull UIScrollView scrollView);

    @Generated
    @IsOptional
    @Selector("scrollViewDidChangeAdjustedContentInset:")
    public native void scrollViewDidChangeAdjustedContentInset(@NotNull UIScrollView scrollView);

    @Nullable
    @Generated
    @IsOptional
    @Selector("tableView:leadingSwipeActionsConfigurationForRowAtIndexPath:")
    public native UISwipeActionsConfiguration tableViewLeadingSwipeActionsConfigurationForRowAtIndexPath(
            @NotNull UITableView tableView, @NotNull NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("tableView:shouldSpringLoadRowAtIndexPath:withContext:")
    public native boolean tableViewShouldSpringLoadRowAtIndexPathWithContext(@NotNull UITableView tableView,
            @NotNull NSIndexPath indexPath,
            @NotNull @Mapped(ObjCObjectMapper.class) UISpringLoadedInteractionContext context);

    @Nullable
    @Generated
    @IsOptional
    @Selector("tableView:trailingSwipeActionsConfigurationForRowAtIndexPath:")
    public native UISwipeActionsConfiguration tableViewTrailingSwipeActionsConfigurationForRowAtIndexPath(
            @NotNull UITableView tableView, @NotNull NSIndexPath indexPath);

    @Nullable
    @Generated
    @IsOptional
    @Selector("tableView:contextMenuConfigurationForRowAtIndexPath:point:")
    public native UIContextMenuConfiguration tableViewContextMenuConfigurationForRowAtIndexPathPoint(
            @NotNull UITableView tableView, @NotNull NSIndexPath indexPath, @ByValue CGPoint point);

    @Generated
    @IsOptional
    @Selector("tableView:didBeginMultipleSelectionInteractionAtIndexPath:")
    public native void tableViewDidBeginMultipleSelectionInteractionAtIndexPath(@NotNull UITableView tableView,
            @NotNull NSIndexPath indexPath);

    @Nullable
    @Generated
    @IsOptional
    @Selector("tableView:previewForDismissingContextMenuWithConfiguration:")
    public native UITargetedPreview tableViewPreviewForDismissingContextMenuWithConfiguration(
            @NotNull UITableView tableView, @NotNull UIContextMenuConfiguration configuration);

    @Nullable
    @Generated
    @IsOptional
    @Selector("tableView:previewForHighlightingContextMenuWithConfiguration:")
    public native UITargetedPreview tableViewPreviewForHighlightingContextMenuWithConfiguration(
            @NotNull UITableView tableView, @NotNull UIContextMenuConfiguration configuration);

    @Generated
    @IsOptional
    @Selector("tableView:shouldBeginMultipleSelectionInteractionAtIndexPath:")
    public native boolean tableViewShouldBeginMultipleSelectionInteractionAtIndexPath(@NotNull UITableView tableView,
            @NotNull NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("tableView:willPerformPreviewActionForMenuWithConfiguration:animator:")
    public native void tableViewWillPerformPreviewActionForMenuWithConfigurationAnimator(@NotNull UITableView tableView,
            @NotNull UIContextMenuConfiguration configuration,
            @NotNull @Mapped(ObjCObjectMapper.class) UIContextMenuInteractionCommitAnimating animator);

    @Generated
    @IsOptional
    @Selector("tableViewDidEndMultipleSelectionInteraction:")
    public native void tableViewDidEndMultipleSelectionInteraction(@NotNull UITableView tableView);

    @Generated
    @IsOptional
    @Selector("tableView:willDisplayContextMenuWithConfiguration:animator:")
    public native void tableViewWillDisplayContextMenuWithConfigurationAnimator(@NotNull UITableView tableView,
            @NotNull UIContextMenuConfiguration configuration,
            @Nullable @Mapped(ObjCObjectMapper.class) UIContextMenuInteractionAnimating animator);

    @Generated
    @IsOptional
    @Selector("tableView:willEndContextMenuInteractionWithConfiguration:animator:")
    public native void tableViewWillEndContextMenuInteractionWithConfigurationAnimator(@NotNull UITableView tableView,
            @NotNull UIContextMenuConfiguration configuration,
            @Nullable @Mapped(ObjCObjectMapper.class) UIContextMenuInteractionAnimating animator);

    @Generated
    @IsOptional
    @Selector("tableView:selectionFollowsFocusForRowAtIndexPath:")
    public native boolean tableViewSelectionFollowsFocusForRowAtIndexPath(@NotNull UITableView tableView,
            @NotNull NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("tableView:canPerformPrimaryActionForRowAtIndexPath:")
    public native boolean tableViewCanPerformPrimaryActionForRowAtIndexPath(@NotNull UITableView tableView,
            @NotNull NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("tableView:performPrimaryActionForRowAtIndexPath:")
    public native void tableViewPerformPrimaryActionForRowAtIndexPath(@NotNull UITableView tableView,
            @NotNull NSIndexPath indexPath);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
