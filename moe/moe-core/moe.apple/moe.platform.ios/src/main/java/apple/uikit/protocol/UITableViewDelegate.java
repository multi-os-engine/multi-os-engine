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
import apple.corefoundation.struct.CGPoint;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * _______________________________________________________________________________________________________________
 * this represents the display and behavior of the cells.
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UITableViewDelegate")
public interface UITableViewDelegate extends UIScrollViewDelegate {
    /**
     * API-Since: 9.0
     */
    @Nullable
    @Generated
    @IsOptional
    @Selector("indexPathForPreferredFocusedViewInTableView:")
    default NSIndexPath indexPathForPreferredFocusedViewInTableView(@NotNull UITableView tableView) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tableView:accessoryButtonTappedForRowWithIndexPath:")
    default void tableViewAccessoryButtonTappedForRowWithIndexPath(@NotNull UITableView tableView,
            @NotNull NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Accessories (disclosures).
     * 
     * API-Since: 2.0
     * Deprecated-Since: 3.0
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("tableView:accessoryTypeForRowWithIndexPath:")
    @NInt
    default long tableViewAccessoryTypeForRowWithIndexPath(@NotNull UITableView tableView,
            @NotNull NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Focus
     * 
     * API-Since: 9.0
     */
    @Generated
    @IsOptional
    @Selector("tableView:canFocusRowAtIndexPath:")
    default boolean tableViewCanFocusRowAtIndexPath(@NotNull UITableView tableView, @NotNull NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 5.0
     * Deprecated-Since: 13.0
     */
    @Deprecated
    @Generated
    @IsOptional
    @Selector("tableView:canPerformAction:forRowAtIndexPath:withSender:")
    default boolean tableViewCanPerformActionForRowAtIndexPathWithSender(@NotNull UITableView tableView,
            @NotNull SEL action, @NotNull NSIndexPath indexPath,
            @Nullable @Mapped(ObjCObjectMapper.class) Object sender) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 3.0
     */
    @Generated
    @IsOptional
    @Selector("tableView:didDeselectRowAtIndexPath:")
    default void tableViewDidDeselectRowAtIndexPath(@NotNull UITableView tableView, @NotNull NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 6.0
     */
    @Generated
    @IsOptional
    @Selector("tableView:didEndDisplayingCell:forRowAtIndexPath:")
    default void tableViewDidEndDisplayingCellForRowAtIndexPath(@NotNull UITableView tableView,
            @NotNull UITableViewCell cell, @NotNull NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 6.0
     */
    @Generated
    @IsOptional
    @Selector("tableView:didEndDisplayingFooterView:forSection:")
    default void tableViewDidEndDisplayingFooterViewForSection(@NotNull UITableView tableView, @NotNull UIView view,
            @NInt long section) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 6.0
     */
    @Generated
    @IsOptional
    @Selector("tableView:didEndDisplayingHeaderView:forSection:")
    default void tableViewDidEndDisplayingHeaderViewForSection(@NotNull UITableView tableView, @NotNull UIView view,
            @NInt long section) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tableView:didEndEditingRowAtIndexPath:")
    default void tableViewDidEndEditingRowAtIndexPath(@NotNull UITableView tableView, @Nullable NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 6.0
     */
    @Generated
    @IsOptional
    @Selector("tableView:didHighlightRowAtIndexPath:")
    default void tableViewDidHighlightRowAtIndexPath(@NotNull UITableView tableView, @NotNull NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called after the user changes the selection.
     */
    @Generated
    @IsOptional
    @Selector("tableView:didSelectRowAtIndexPath:")
    default void tableViewDidSelectRowAtIndexPath(@NotNull UITableView tableView, @NotNull NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 6.0
     */
    @Generated
    @IsOptional
    @Selector("tableView:didUnhighlightRowAtIndexPath:")
    default void tableViewDidUnhighlightRowAtIndexPath(@NotNull UITableView tableView, @NotNull NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 9.0
     */
    @Generated
    @IsOptional
    @Selector("tableView:didUpdateFocusInContext:withAnimationCoordinator:")
    default void tableViewDidUpdateFocusInContextWithAnimationCoordinator(@NotNull UITableView tableView,
            @NotNull UITableViewFocusUpdateContext context, @NotNull UIFocusAnimationCoordinator coordinator) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * This method supersedes -tableView:titleForDeleteConfirmationButtonForRowAtIndexPath: if return value is non-nil
     * 
     * API-Since: 8.0
     * Deprecated-Since: 13.0
     */
    @Nullable
    @Deprecated
    @Generated
    @IsOptional
    @Selector("tableView:editActionsForRowAtIndexPath:")
    default NSArray<? extends UITableViewRowAction> tableViewEditActionsForRowAtIndexPath(
            @NotNull UITableView tableView, @NotNull NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Allows customization of the editingStyle for a particular cell located at 'indexPath'. If not implemented, all
     * editable cells will have UITableViewCellEditingStyleDelete set for them when the table has editing property set
     * to YES.
     */
    @Generated
    @IsOptional
    @Selector("tableView:editingStyleForRowAtIndexPath:")
    @NInt
    default long tableViewEditingStyleForRowAtIndexPath(@NotNull UITableView tableView,
            @NotNull NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 7.0
     */
    @Generated
    @IsOptional
    @Selector("tableView:estimatedHeightForFooterInSection:")
    @NFloat
    default double tableViewEstimatedHeightForFooterInSection(@NotNull UITableView tableView, @NInt long section) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 7.0
     */
    @Generated
    @IsOptional
    @Selector("tableView:estimatedHeightForHeaderInSection:")
    @NFloat
    default double tableViewEstimatedHeightForHeaderInSection(@NotNull UITableView tableView, @NInt long section) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Use the estimatedHeight methods to quickly calculate guessed values which will allow for fast load times of the
     * table.
     * If these methods are implemented, the above -tableView:heightForXXX calls will be deferred until views are ready
     * to be displayed, so more expensive logic can be placed there.
     * 
     * API-Since: 7.0
     */
    @Generated
    @IsOptional
    @Selector("tableView:estimatedHeightForRowAtIndexPath:")
    @NFloat
    default double tableViewEstimatedHeightForRowAtIndexPath(@NotNull UITableView tableView,
            @NotNull NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tableView:heightForFooterInSection:")
    @NFloat
    default double tableViewHeightForFooterInSection(@NotNull UITableView tableView, @NInt long section) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tableView:heightForHeaderInSection:")
    @NFloat
    default double tableViewHeightForHeaderInSection(@NotNull UITableView tableView, @NInt long section) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Variable height support
     */
    @Generated
    @IsOptional
    @Selector("tableView:heightForRowAtIndexPath:")
    @NFloat
    default double tableViewHeightForRowAtIndexPath(@NotNull UITableView tableView, @NotNull NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * return 'depth' of row for hierarchies
     */
    @Generated
    @IsOptional
    @Selector("tableView:indentationLevelForRowAtIndexPath:")
    @NInt
    default long tableViewIndentationLevelForRowAtIndexPath(@NotNull UITableView tableView,
            @NotNull NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 5.0
     * Deprecated-Since: 13.0
     */
    @Deprecated
    @Generated
    @IsOptional
    @Selector("tableView:performAction:forRowAtIndexPath:withSender:")
    default void tableViewPerformActionForRowAtIndexPathWithSender(@NotNull UITableView tableView, @NotNull SEL action,
            @NotNull NSIndexPath indexPath, @Nullable @Mapped(ObjCObjectMapper.class) Object sender) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * -tableView:shouldHighlightRowAtIndexPath: is called when a touch comes down on a row.
     * Returning NO to that message halts the selection process and does not cause the currently selected row to lose
     * its selected look while the touch is down.
     * 
     * API-Since: 6.0
     */
    @Generated
    @IsOptional
    @Selector("tableView:shouldHighlightRowAtIndexPath:")
    default boolean tableViewShouldHighlightRowAtIndexPath(@NotNull UITableView tableView,
            @NotNull NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Controls whether the background is indented while editing. If not implemented, the default is YES. This is
     * unrelated to the indentation level below. This method only applies to grouped style table views.
     */
    @Generated
    @IsOptional
    @Selector("tableView:shouldIndentWhileEditingRowAtIndexPath:")
    default boolean tableViewShouldIndentWhileEditingRowAtIndexPath(@NotNull UITableView tableView,
            @NotNull NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Copy/Paste. All three methods must be implemented by the delegate.
     * 
     * API-Since: 5.0
     * Deprecated-Since: 13.0
     */
    @Deprecated
    @Generated
    @IsOptional
    @Selector("tableView:shouldShowMenuForRowAtIndexPath:")
    default boolean tableViewShouldShowMenuForRowAtIndexPath(@NotNull UITableView tableView,
            @NotNull NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 9.0
     */
    @Generated
    @IsOptional
    @Selector("tableView:shouldUpdateFocusInContext:")
    default boolean tableViewShouldUpdateFocusInContext(@NotNull UITableView tableView,
            @NotNull UITableViewFocusUpdateContext context) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Allows customization of the target row for a particular row as it is being moved/reordered
     */
    @NotNull
    @Generated
    @IsOptional
    @Selector("tableView:targetIndexPathForMoveFromRowAtIndexPath:toProposedIndexPath:")
    default NSIndexPath tableViewTargetIndexPathForMoveFromRowAtIndexPathToProposedIndexPath(
            @NotNull UITableView tableView, @NotNull NSIndexPath sourceIndexPath,
            @NotNull NSIndexPath proposedDestinationIndexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 3.0
     */
    @Nullable
    @Generated
    @IsOptional
    @Selector("tableView:titleForDeleteConfirmationButtonForRowAtIndexPath:")
    default String tableViewTitleForDeleteConfirmationButtonForRowAtIndexPath(@NotNull UITableView tableView,
            @NotNull NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * custom view for footer. will be adjusted to default or specified footer height
     */
    @Nullable
    @Generated
    @IsOptional
    @Selector("tableView:viewForFooterInSection:")
    default UIView tableViewViewForFooterInSection(@NotNull UITableView tableView, @NInt long section) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * custom view for header. will be adjusted to default or specified header height
     */
    @Nullable
    @Generated
    @IsOptional
    @Selector("tableView:viewForHeaderInSection:")
    default UIView tableViewViewForHeaderInSection(@NotNull UITableView tableView, @NInt long section) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * The willBegin/didEnd methods are called whenever the 'editing' property is automatically changed by the table
     * (allowing insert/delete/move). This is done by a swipe activating a single row
     */
    @Generated
    @IsOptional
    @Selector("tableView:willBeginEditingRowAtIndexPath:")
    default void tableViewWillBeginEditingRowAtIndexPath(@NotNull UITableView tableView,
            @NotNull NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 3.0
     */
    @Nullable
    @Generated
    @IsOptional
    @Selector("tableView:willDeselectRowAtIndexPath:")
    default NSIndexPath tableViewWillDeselectRowAtIndexPath(@NotNull UITableView tableView,
            @NotNull NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Display customization
     */
    @Generated
    @IsOptional
    @Selector("tableView:willDisplayCell:forRowAtIndexPath:")
    default void tableViewWillDisplayCellForRowAtIndexPath(@NotNull UITableView tableView,
            @NotNull UITableViewCell cell, @NotNull NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 6.0
     */
    @Generated
    @IsOptional
    @Selector("tableView:willDisplayFooterView:forSection:")
    default void tableViewWillDisplayFooterViewForSection(@NotNull UITableView tableView, @NotNull UIView view,
            @NInt long section) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 6.0
     */
    @Generated
    @IsOptional
    @Selector("tableView:willDisplayHeaderView:forSection:")
    default void tableViewWillDisplayHeaderViewForSection(@NotNull UITableView tableView, @NotNull UIView view,
            @NInt long section) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called before the user changes the selection. Return a new indexPath, or nil, to change the proposed selection.
     */
    @Nullable
    @Generated
    @IsOptional
    @Selector("tableView:willSelectRowAtIndexPath:")
    default NSIndexPath tableViewWillSelectRowAtIndexPath(@NotNull UITableView tableView,
            @NotNull NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Swipe actions
     * These methods supersede -editActionsForRowAtIndexPath: if implemented
     * return nil to get the default swipe actions
     * 
     * API-Since: 11.0
     */
    @Nullable
    @Generated
    @IsOptional
    @Selector("tableView:leadingSwipeActionsConfigurationForRowAtIndexPath:")
    default UISwipeActionsConfiguration tableViewLeadingSwipeActionsConfigurationForRowAtIndexPath(
            @NotNull UITableView tableView, @NotNull NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Allows opting-out of spring loading for an particular row.
     * If you want the interaction effect on a different subview of the spring loaded cell, modify the
     * context.targetView property. The default is the cell.
     * If this method is not implemented, the default is YES except when the row is part of a drag session.
     * 
     * API-Since: 11.0
     */
    @Generated
    @IsOptional
    @Selector("tableView:shouldSpringLoadRowAtIndexPath:withContext:")
    default boolean tableViewShouldSpringLoadRowAtIndexPathWithContext(@NotNull UITableView tableView,
            @NotNull NSIndexPath indexPath,
            @NotNull @Mapped(ObjCObjectMapper.class) UISpringLoadedInteractionContext context) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 11.0
     */
    @Nullable
    @Generated
    @IsOptional
    @Selector("tableView:trailingSwipeActionsConfigurationForRowAtIndexPath:")
    default UISwipeActionsConfiguration tableViewTrailingSwipeActionsConfigurationForRowAtIndexPath(
            @NotNull UITableView tableView, @NotNull NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the interaction begins.
     * 
     * @param tableView This UITableView.
     * @param indexPath IndexPath of the row for which a configuration is being requested.
     * @param point     Location of the interaction in the table view's coordinate space
     * 
     * @return A UIContextMenuConfiguration describing the menu to be presented. Return nil to prevent the interaction
     *         from beginning.
     *         Returning an empty configuration causes the interaction to begin then fail with a cancellation effect.
     *         You might use this
     *         to indicate to users that it's possible for a menu to be presented from this element, but that there are
     *         no actions to
     *         present at this particular time.
     * 
     *         API-Since: 13.0
     */
    @Nullable
    @Generated
    @IsOptional
    @Selector("tableView:contextMenuConfigurationForRowAtIndexPath:point:")
    default UIContextMenuConfiguration tableViewContextMenuConfigurationForRowAtIndexPathPoint(
            @NotNull UITableView tableView, @NotNull NSIndexPath indexPath, @ByValue CGPoint point) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called right after the multi-select pan gesture begins and the table view is automatically transitioned into
     * editing mode.
     * 
     * In your app, this would be a good opportunity to update the state of your UI to reflect the fact that the user is
     * now selecting
     * multiple items at once; such as updating buttons to say "Done" instead of "Select"/"Edit", for instance.
     * 
     * API-Since: 13.0
     */
    @Generated
    @IsOptional
    @Selector("tableView:didBeginMultipleSelectionInteractionAtIndexPath:")
    default void tableViewDidBeginMultipleSelectionInteractionAtIndexPath(@NotNull UITableView tableView,
            @NotNull NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the interaction is about to dismiss. Return a UITargetedPreview describing the desired dismissal
     * target.
     * The interaction will animate the presented menu to the target. Use this to customize the dismissal animation.
     * 
     * @param tableView     This UITableView.
     * @param configuration The configuration of the menu displayed by this interaction.
     * 
     *                      API-Since: 13.0
     */
    @Nullable
    @Generated
    @IsOptional
    @Selector("tableView:previewForDismissingContextMenuWithConfiguration:")
    default UITargetedPreview tableViewPreviewForDismissingContextMenuWithConfiguration(@NotNull UITableView tableView,
            @NotNull UIContextMenuConfiguration configuration) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the interaction begins. Return a UITargetedPreview to override the default preview created by the
     * table view.
     * 
     * @param tableView     This UITableView.
     * @param configuration The configuration of the menu about to be displayed by this interaction.
     * 
     *                      API-Since: 13.0
     */
    @Nullable
    @Generated
    @IsOptional
    @Selector("tableView:previewForHighlightingContextMenuWithConfiguration:")
    default UITargetedPreview tableViewPreviewForHighlightingContextMenuWithConfiguration(
            @NotNull UITableView tableView, @NotNull UIContextMenuConfiguration configuration) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Allows a two-finger pan gesture to automatically transition the table view into editing mode and start selecting
     * cells.
     * 
     * If this method returns YES, allow the user to start selecting multiple contiguous cells via a two-finger pan
     * gesture. If
     * the table view is already in editing mode, the user can also select multiple cells via a one-finger pan gesture
     * along the
     * edge of the table that contains editing controls (checkboxes).
     * 
     * In order to support this behavior, you must also set allowsMultipleSelectionDuringEditing to YES.
     * 
     * If this method is not implemented, the default is NO.
     * 
     * API-Since: 13.0
     */
    @Generated
    @IsOptional
    @Selector("tableView:shouldBeginMultipleSelectionInteractionAtIndexPath:")
    default boolean tableViewShouldBeginMultipleSelectionInteractionAtIndexPath(@NotNull UITableView tableView,
            @NotNull NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the interaction is about to "commit" in response to the user tapping the preview.
     * 
     * @param tableView     This UITableView.
     * @param configuration Configuration of the currently displayed menu.
     * @param animator      Commit animator. Add animations to this object to run them alongside the commit transition.
     * 
     *                      API-Since: 13.0
     */
    @Generated
    @IsOptional
    @Selector("tableView:willPerformPreviewActionForMenuWithConfiguration:animator:")
    default void tableViewWillPerformPreviewActionForMenuWithConfigurationAnimator(@NotNull UITableView tableView,
            @NotNull UIContextMenuConfiguration configuration,
            @NotNull @Mapped(ObjCObjectMapper.class) UIContextMenuInteractionCommitAnimating animator) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the multi-select interaction ends.
     * 
     * At this point, the table view will remain in multi-select mode, but this delegate method is called to indicate
     * that the multiple
     * selection gesture or hardware keyboard interaction has ended.
     * 
     * API-Since: 13.0
     */
    @Generated
    @IsOptional
    @Selector("tableViewDidEndMultipleSelectionInteraction:")
    default void tableViewDidEndMultipleSelectionInteraction(@NotNull UITableView tableView) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the table view is about to display a menu.
     * 
     * @param tableView     This UITableView.
     * @param configuration The configuration of the menu about to be displayed.
     * @param animator      Appearance animator. Add animations to run them alongside the appearance transition.
     * 
     *                      API-Since: 14.0
     */
    @Generated
    @IsOptional
    @Selector("tableView:willDisplayContextMenuWithConfiguration:animator:")
    default void tableViewWillDisplayContextMenuWithConfigurationAnimator(@NotNull UITableView tableView,
            @NotNull UIContextMenuConfiguration configuration,
            @Nullable @Mapped(ObjCObjectMapper.class) UIContextMenuInteractionAnimating animator) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the table view's context menu interaction is about to end.
     * 
     * @param tableView     This UITableView.
     * @param configuration Ending configuration.
     * @param animator      Disappearance animator. Add animations to run them alongside the disappearance transition.
     * 
     *                      API-Since: 14.0
     */
    @Generated
    @IsOptional
    @Selector("tableView:willEndContextMenuInteractionWithConfiguration:animator:")
    default void tableViewWillEndContextMenuInteractionWithConfigurationAnimator(@NotNull UITableView tableView,
            @NotNull UIContextMenuConfiguration configuration,
            @Nullable @Mapped(ObjCObjectMapper.class) UIContextMenuInteractionAnimating animator) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Determines if the row at the specified index path should also become selected when focus moves to it.
     * If the table view's global selectionFollowsFocus is enabled, this method will allow you to override that behavior
     * on a per-index path basis. This method is not called if selectionFollowsFocus is disabled.
     * 
     * API-Since: 15.0
     */
    @Generated
    @IsOptional
    @Selector("tableView:selectionFollowsFocusForRowAtIndexPath:")
    default boolean tableViewSelectionFollowsFocusForRowAtIndexPath(@NotNull UITableView tableView,
            @NotNull NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called to determine if a primary action can be performed for the row at the given indexPath.
     * See @c tableView:performPrimaryActionForRowAtIndexPath: for more details about primary actions.
     * 
     * @param tableView This UITableView
     * @param indexPath NSIndexPath of the row
     * 
     * @return `YES` if the primary action can be performed; otherwise `NO`. If not implemented defaults to `YES` when
     *         not editing
     *         and `NO` when editing.
     * 
     *         API-Since: 16.0
     */
    @Generated
    @IsOptional
    @Selector("tableView:canPerformPrimaryActionForRowAtIndexPath:")
    default boolean tableViewCanPerformPrimaryActionForRowAtIndexPath(@NotNull UITableView tableView,
            @NotNull NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the primary action should be performed for the row at the given indexPath.
     * 
     * Primary actions allow you to distinguish between a change of selection (which can be based on focus changes or
     * other indirect selection changes) and distinct user actions. Primary actions are performed when the user selects
     * a cell without extending
     * an existing selection. This is called after @c willSelectRow and @c didSelectRow , regardless of whether the
     * cell's selection
     * state was allowed to change.
     * 
     * As an example, use @c didSelectRowAtIndexPath for updating state in the current view controller (i.e. buttons,
     * title, etc) and
     * use the primary action for navigation or showing another split view column.
     * 
     * @param tableView This UITableView
     * @param indexPath NSIndexPath of the row to perform the action on
     * 
     *                  API-Since: 16.0
     */
    @Generated
    @IsOptional
    @Selector("tableView:performPrimaryActionForRowAtIndexPath:")
    default void tableViewPerformPrimaryActionForRowAtIndexPath(@NotNull UITableView tableView,
            @NotNull NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }
}
