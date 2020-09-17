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

package apple.uikit.protocol;

import apple.coregraphics.struct.CGPoint;
import apple.foundation.NSArray;
import apple.foundation.NSIndexPath;
import apple.uikit.UIContextMenuConfiguration;
import apple.uikit.UIFocusAnimationCoordinator;
import apple.uikit.UISwipeActionsConfiguration;
import apple.uikit.UITableView;
import apple.uikit.UITableViewCell;
import apple.uikit.UITableViewFocusUpdateContext;
import apple.uikit.UITableViewRowAction;
import apple.uikit.UITargetedPreview;
import apple.uikit.UIView;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UITableViewDelegate")
public interface UITableViewDelegate extends UIScrollViewDelegate {
    @Generated
    @IsOptional
    @Selector("indexPathForPreferredFocusedViewInTableView:")
    default NSIndexPath indexPathForPreferredFocusedViewInTableView(UITableView tableView) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tableView:accessoryButtonTappedForRowWithIndexPath:")
    default void tableViewAccessoryButtonTappedForRowWithIndexPath(UITableView tableView, NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Deprecated
    @Selector("tableView:accessoryTypeForRowWithIndexPath:")
    @NInt
    default long tableViewAccessoryTypeForRowWithIndexPath(UITableView tableView, NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tableView:canFocusRowAtIndexPath:")
    default boolean tableViewCanFocusRowAtIndexPath(UITableView tableView, NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tableView:canPerformAction:forRowAtIndexPath:withSender:")
    default boolean tableViewCanPerformActionForRowAtIndexPathWithSender(UITableView tableView, SEL action,
            NSIndexPath indexPath, @Mapped(ObjCObjectMapper.class) Object sender) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tableView:didDeselectRowAtIndexPath:")
    default void tableViewDidDeselectRowAtIndexPath(UITableView tableView, NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tableView:didEndDisplayingCell:forRowAtIndexPath:")
    default void tableViewDidEndDisplayingCellForRowAtIndexPath(UITableView tableView, UITableViewCell cell,
            NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tableView:didEndDisplayingFooterView:forSection:")
    default void tableViewDidEndDisplayingFooterViewForSection(UITableView tableView, UIView view, @NInt long section) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tableView:didEndDisplayingHeaderView:forSection:")
    default void tableViewDidEndDisplayingHeaderViewForSection(UITableView tableView, UIView view, @NInt long section) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tableView:didEndEditingRowAtIndexPath:")
    default void tableViewDidEndEditingRowAtIndexPath(UITableView tableView, NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tableView:didHighlightRowAtIndexPath:")
    default void tableViewDidHighlightRowAtIndexPath(UITableView tableView, NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tableView:didSelectRowAtIndexPath:")
    default void tableViewDidSelectRowAtIndexPath(UITableView tableView, NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tableView:didUnhighlightRowAtIndexPath:")
    default void tableViewDidUnhighlightRowAtIndexPath(UITableView tableView, NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tableView:didUpdateFocusInContext:withAnimationCoordinator:")
    default void tableViewDidUpdateFocusInContextWithAnimationCoordinator(UITableView tableView,
            UITableViewFocusUpdateContext context, UIFocusAnimationCoordinator coordinator) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tableView:editActionsForRowAtIndexPath:")
    default NSArray<? extends UITableViewRowAction> tableViewEditActionsForRowAtIndexPath(UITableView tableView,
            NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tableView:editingStyleForRowAtIndexPath:")
    @NInt
    default long tableViewEditingStyleForRowAtIndexPath(UITableView tableView, NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tableView:estimatedHeightForFooterInSection:")
    @NFloat
    default double tableViewEstimatedHeightForFooterInSection(UITableView tableView, @NInt long section) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tableView:estimatedHeightForHeaderInSection:")
    @NFloat
    default double tableViewEstimatedHeightForHeaderInSection(UITableView tableView, @NInt long section) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tableView:estimatedHeightForRowAtIndexPath:")
    @NFloat
    default double tableViewEstimatedHeightForRowAtIndexPath(UITableView tableView, NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tableView:heightForFooterInSection:")
    @NFloat
    default double tableViewHeightForFooterInSection(UITableView tableView, @NInt long section) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tableView:heightForHeaderInSection:")
    @NFloat
    default double tableViewHeightForHeaderInSection(UITableView tableView, @NInt long section) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tableView:heightForRowAtIndexPath:")
    @NFloat
    default double tableViewHeightForRowAtIndexPath(UITableView tableView, NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tableView:indentationLevelForRowAtIndexPath:")
    @NInt
    default long tableViewIndentationLevelForRowAtIndexPath(UITableView tableView, NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tableView:performAction:forRowAtIndexPath:withSender:")
    default void tableViewPerformActionForRowAtIndexPathWithSender(UITableView tableView, SEL action,
            NSIndexPath indexPath, @Mapped(ObjCObjectMapper.class) Object sender) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tableView:shouldHighlightRowAtIndexPath:")
    default boolean tableViewShouldHighlightRowAtIndexPath(UITableView tableView, NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tableView:shouldIndentWhileEditingRowAtIndexPath:")
    default boolean tableViewShouldIndentWhileEditingRowAtIndexPath(UITableView tableView, NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tableView:shouldShowMenuForRowAtIndexPath:")
    default boolean tableViewShouldShowMenuForRowAtIndexPath(UITableView tableView, NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tableView:shouldUpdateFocusInContext:")
    default boolean tableViewShouldUpdateFocusInContext(UITableView tableView, UITableViewFocusUpdateContext context) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tableView:targetIndexPathForMoveFromRowAtIndexPath:toProposedIndexPath:")
    default NSIndexPath tableViewTargetIndexPathForMoveFromRowAtIndexPathToProposedIndexPath(UITableView tableView,
            NSIndexPath sourceIndexPath, NSIndexPath proposedDestinationIndexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tableView:titleForDeleteConfirmationButtonForRowAtIndexPath:")
    default String tableViewTitleForDeleteConfirmationButtonForRowAtIndexPath(UITableView tableView,
            NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tableView:viewForFooterInSection:")
    default UIView tableViewViewForFooterInSection(UITableView tableView, @NInt long section) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tableView:viewForHeaderInSection:")
    default UIView tableViewViewForHeaderInSection(UITableView tableView, @NInt long section) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tableView:willBeginEditingRowAtIndexPath:")
    default void tableViewWillBeginEditingRowAtIndexPath(UITableView tableView, NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tableView:willDeselectRowAtIndexPath:")
    default NSIndexPath tableViewWillDeselectRowAtIndexPath(UITableView tableView, NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tableView:willDisplayCell:forRowAtIndexPath:")
    default void tableViewWillDisplayCellForRowAtIndexPath(UITableView tableView, UITableViewCell cell,
            NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tableView:willDisplayFooterView:forSection:")
    default void tableViewWillDisplayFooterViewForSection(UITableView tableView, UIView view, @NInt long section) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tableView:willDisplayHeaderView:forSection:")
    default void tableViewWillDisplayHeaderViewForSection(UITableView tableView, UIView view, @NInt long section) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tableView:willSelectRowAtIndexPath:")
    default NSIndexPath tableViewWillSelectRowAtIndexPath(UITableView tableView, NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tableView:leadingSwipeActionsConfigurationForRowAtIndexPath:")
    default UISwipeActionsConfiguration tableViewLeadingSwipeActionsConfigurationForRowAtIndexPath(
            UITableView tableView, NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tableView:shouldSpringLoadRowAtIndexPath:withContext:")
    default boolean tableViewShouldSpringLoadRowAtIndexPathWithContext(UITableView tableView, NSIndexPath indexPath,
            @Mapped(ObjCObjectMapper.class) UISpringLoadedInteractionContext context) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tableView:trailingSwipeActionsConfigurationForRowAtIndexPath:")
    default UISwipeActionsConfiguration tableViewTrailingSwipeActionsConfigurationForRowAtIndexPath(
            UITableView tableView, NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tableView:contextMenuConfigurationForRowAtIndexPath:point:")
    default UIContextMenuConfiguration tableViewContextMenuConfigurationForRowAtIndexPathPoint(UITableView tableView,
            NSIndexPath indexPath, @ByValue CGPoint point) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tableView:didBeginMultipleSelectionInteractionAtIndexPath:")
    default void tableViewDidBeginMultipleSelectionInteractionAtIndexPath(UITableView tableView,
            NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tableView:previewForDismissingContextMenuWithConfiguration:")
    default UITargetedPreview tableViewPreviewForDismissingContextMenuWithConfiguration(UITableView tableView,
            UIContextMenuConfiguration configuration) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tableView:previewForHighlightingContextMenuWithConfiguration:")
    default UITargetedPreview tableViewPreviewForHighlightingContextMenuWithConfiguration(UITableView tableView,
            UIContextMenuConfiguration configuration) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tableView:shouldBeginMultipleSelectionInteractionAtIndexPath:")
    default boolean tableViewShouldBeginMultipleSelectionInteractionAtIndexPath(UITableView tableView,
            NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tableView:willPerformPreviewActionForMenuWithConfiguration:animator:")
    default void tableViewWillPerformPreviewActionForMenuWithConfigurationAnimator(UITableView tableView,
            UIContextMenuConfiguration configuration,
            @Mapped(ObjCObjectMapper.class) UIContextMenuInteractionCommitAnimating animator) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tableViewDidEndMultipleSelectionInteraction:")
    default void tableViewDidEndMultipleSelectionInteraction(UITableView tableView) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tableView:willDisplayContextMenuWithConfiguration:animator:")
    default void tableViewWillDisplayContextMenuWithConfigurationAnimator(UITableView tableView,
            UIContextMenuConfiguration configuration,
            @Mapped(ObjCObjectMapper.class) UIContextMenuInteractionAnimating animator) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tableView:willEndContextMenuInteractionWithConfiguration:animator:")
    default void tableViewWillEndContextMenuInteractionWithConfigurationAnimator(UITableView tableView,
            UIContextMenuConfiguration configuration,
            @Mapped(ObjCObjectMapper.class) UIContextMenuInteractionAnimating animator) {
        throw new java.lang.UnsupportedOperationException();
    }
}
