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

import apple.foundation.NSIndexPath;
import apple.uikit.UICollectionReusableView;
import apple.uikit.UICollectionView;
import apple.uikit.UICollectionViewCell;
import apple.uikit.UICollectionViewFocusUpdateContext;
import apple.uikit.UICollectionViewLayout;
import apple.uikit.UICollectionViewTransitionLayout;
import apple.uikit.UIContextMenuConfiguration;
import apple.uikit.UIFocusAnimationCoordinator;
import apple.uikit.UITargetedPreview;
import apple.uikit.UIWindowSceneActivationConfiguration;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.foundation.NSArray;
import apple.corefoundation.struct.CGPoint;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UICollectionViewDelegate")
public interface UICollectionViewDelegate extends UIScrollViewDelegate {
    /**
     * Focus
     * 
     * API-Since: 9.0
     */
    @Generated
    @IsOptional
    @Selector("collectionView:canFocusItemAtIndexPath:")
    default boolean collectionViewCanFocusItemAtIndexPath(UICollectionView collectionView, NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 6.0
     * Deprecated-Since: 13.0
     */
    @Deprecated
    @Generated
    @IsOptional
    @Selector("collectionView:canPerformAction:forItemAtIndexPath:withSender:")
    default boolean collectionViewCanPerformActionForItemAtIndexPathWithSender(UICollectionView collectionView,
            SEL action, NSIndexPath indexPath, @Mapped(ObjCObjectMapper.class) Object sender) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("collectionView:didDeselectItemAtIndexPath:")
    default void collectionViewDidDeselectItemAtIndexPath(UICollectionView collectionView, NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("collectionView:didEndDisplayingCell:forItemAtIndexPath:")
    default void collectionViewDidEndDisplayingCellForItemAtIndexPath(UICollectionView collectionView,
            UICollectionViewCell cell, NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("collectionView:didEndDisplayingSupplementaryView:forElementOfKind:atIndexPath:")
    default void collectionViewDidEndDisplayingSupplementaryViewForElementOfKindAtIndexPath(
            UICollectionView collectionView, UICollectionReusableView view, String elementKind, NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("collectionView:didHighlightItemAtIndexPath:")
    default void collectionViewDidHighlightItemAtIndexPath(UICollectionView collectionView, NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("collectionView:didSelectItemAtIndexPath:")
    default void collectionViewDidSelectItemAtIndexPath(UICollectionView collectionView, NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("collectionView:didUnhighlightItemAtIndexPath:")
    default void collectionViewDidUnhighlightItemAtIndexPath(UICollectionView collectionView, NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 9.0
     */
    @Generated
    @IsOptional
    @Selector("collectionView:didUpdateFocusInContext:withAnimationCoordinator:")
    default void collectionViewDidUpdateFocusInContextWithAnimationCoordinator(UICollectionView collectionView,
            UICollectionViewFocusUpdateContext context, UIFocusAnimationCoordinator coordinator) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 6.0
     * Deprecated-Since: 13.0
     */
    @Deprecated
    @Generated
    @IsOptional
    @Selector("collectionView:performAction:forItemAtIndexPath:withSender:")
    default void collectionViewPerformActionForItemAtIndexPathWithSender(UICollectionView collectionView, SEL action,
            NSIndexPath indexPath, @Mapped(ObjCObjectMapper.class) Object sender) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * called when the user taps on an already-selected item in multi-select mode
     */
    @Generated
    @IsOptional
    @Selector("collectionView:shouldDeselectItemAtIndexPath:")
    default boolean collectionViewShouldDeselectItemAtIndexPath(UICollectionView collectionView,
            NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Methods for notification of selection/deselection and highlight/unhighlight events.
     * The sequence of calls leading to selection from a user touch is:
     * 
     * (when the touch begins)
     * 1. -collectionView:shouldHighlightItemAtIndexPath:
     * 2. -collectionView:didHighlightItemAtIndexPath:
     * 
     * (when the touch lifts)
     * 3. -collectionView:shouldSelectItemAtIndexPath: or -collectionView:shouldDeselectItemAtIndexPath:
     * 4. -collectionView:didSelectItemAtIndexPath: or -collectionView:didDeselectItemAtIndexPath:
     * 5. -collectionView:didUnhighlightItemAtIndexPath:
     */
    @Generated
    @IsOptional
    @Selector("collectionView:shouldHighlightItemAtIndexPath:")
    default boolean collectionViewShouldHighlightItemAtIndexPath(UICollectionView collectionView,
            NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("collectionView:shouldSelectItemAtIndexPath:")
    default boolean collectionViewShouldSelectItemAtIndexPath(UICollectionView collectionView, NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * These methods provide support for copy/paste actions on cells.
     * All three should be implemented if any are.
     * 
     * API-Since: 6.0
     * Deprecated-Since: 13.0
     */
    @Deprecated
    @Generated
    @IsOptional
    @Selector("collectionView:shouldShowMenuForItemAtIndexPath:")
    default boolean collectionViewShouldShowMenuForItemAtIndexPath(UICollectionView collectionView,
            NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 9.0
     */
    @Generated
    @IsOptional
    @Selector("collectionView:shouldUpdateFocusInContext:")
    default boolean collectionViewShouldUpdateFocusInContext(UICollectionView collectionView,
            UICollectionViewFocusUpdateContext context) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * customize the content offset to be applied during transition or update animations
     * 
     * API-Since: 9.0
     */
    @Generated
    @IsOptional
    @Selector("collectionView:targetContentOffsetForProposedContentOffset:")
    @ByValue
    default CGPoint collectionViewTargetContentOffsetForProposedContentOffset(UICollectionView collectionView,
            @ByValue CGPoint proposedContentOffset) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 9.0
     * Deprecated-Since: 15.0
     */
    @Deprecated
    @Generated
    @IsOptional
    @Selector("collectionView:targetIndexPathForMoveFromItemAtIndexPath:toProposedIndexPath:")
    default NSIndexPath collectionViewTargetIndexPathForMoveFromItemAtIndexPathToProposedIndexPath(
            UICollectionView collectionView, NSIndexPath currentIndexPath, NSIndexPath proposedIndexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * support for custom transition layout
     */
    @Generated
    @IsOptional
    @Selector("collectionView:transitionLayoutForOldLayout:newLayout:")
    default UICollectionViewTransitionLayout collectionViewTransitionLayoutForOldLayoutNewLayout(
            UICollectionView collectionView, UICollectionViewLayout fromLayout, UICollectionViewLayout toLayout) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 8.0
     */
    @Generated
    @IsOptional
    @Selector("collectionView:willDisplayCell:forItemAtIndexPath:")
    default void collectionViewWillDisplayCellForItemAtIndexPath(UICollectionView collectionView,
            UICollectionViewCell cell, NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 8.0
     */
    @Generated
    @IsOptional
    @Selector("collectionView:willDisplaySupplementaryView:forElementKind:atIndexPath:")
    default void collectionViewWillDisplaySupplementaryViewForElementKindAtIndexPath(UICollectionView collectionView,
            UICollectionReusableView view, String elementKind, NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 9.0
     */
    @Generated
    @IsOptional
    @Selector("indexPathForPreferredFocusedViewInCollectionView:")
    default NSIndexPath indexPathForPreferredFocusedViewInCollectionView(UICollectionView collectionView) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Allows opting-out of spring loading for an particular item.
     * 
     * If you want the interaction effect on a different subview of the spring loaded cell, modify the
     * context.targetView property.
     * The default is the cell.
     * 
     * If this method is not implemented, the default is YES.
     * 
     * API-Since: 11.0
     */
    @Generated
    @IsOptional
    @Selector("collectionView:shouldSpringLoadItemAtIndexPath:withContext:")
    default boolean collectionViewShouldSpringLoadItemAtIndexPathWithContext(UICollectionView collectionView,
            NSIndexPath indexPath, @Mapped(ObjCObjectMapper.class) UISpringLoadedInteractionContext context) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the interaction begins.
     * 
     * @param collectionView The @c UICollectionView.
     * @param indexPath      IndexPath of the item for which a configuration is being requested.
     * @param point          Touch location in the collection view's coordinate space
     * 
     * @return A UIContextMenuConfiguration describing the menu to be presented. Return nil to prevent the interaction
     *         from beginning.
     *         Returning an empty configuration causes the interaction to begin then fail with a cancellation effect.
     *         You might use this
     *         to indicate to users that it's possible for a menu to be presented from this element, but that there are
     *         no actions to
     *         present at this particular time. If the non-deprecated replacement for the configuration, highlight
     *         preview, or dismissal preview methods is implemented this method is not called.
     * 
     *         API-Since: 13.0
     *         Deprecated-Since: 16.0
     */
    @Deprecated
    @Generated
    @IsOptional
    @Selector("collectionView:contextMenuConfigurationForItemAtIndexPath:point:")
    default UIContextMenuConfiguration collectionViewContextMenuConfigurationForItemAtIndexPathPoint(
            UICollectionView collectionView, NSIndexPath indexPath, @ByValue CGPoint point) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called right after allowsMultipleSelection is set to YES if
     * -collectionView:shouldBeginMultipleSelectionInteractionAtIndexPath:
     * returned YES.
     * 
     * In your app, this would be a good opportunity to update the state of your UI to reflect the fact that the user is
     * now selecting
     * multiple items at once; such as updating buttons to say "Done" instead of "Select"/"Edit", for instance.
     * 
     * API-Since: 13.0
     */
    @Generated
    @IsOptional
    @Selector("collectionView:didBeginMultipleSelectionInteractionAtIndexPath:")
    default void collectionViewDidBeginMultipleSelectionInteractionAtIndexPath(UICollectionView collectionView,
            NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the interaction is about to dismiss. Return a UITargetedPreview describing the desired dismissal
     * target.
     * The interaction will animate the presented menu to the target. Use this to customize the dismissal animation.
     * If the non-deprecated replacement for the configuration, highlight preview, or dismissal preview methods is
     * implemented this method is not called.
     * 
     * @param collectionView The @c UICollectionView.
     * @param configuration  The configuration of the menu displayed by this interaction.
     * 
     *                       API-Since: 13.0
     *                       Deprecated-Since: 16.0
     */
    @Deprecated
    @Generated
    @IsOptional
    @Selector("collectionView:previewForDismissingContextMenuWithConfiguration:")
    default UITargetedPreview collectionViewPreviewForDismissingContextMenuWithConfiguration(
            UICollectionView collectionView, UIContextMenuConfiguration configuration) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the interaction begins. Return a UITargetedPreview describing the desired highlight preview.
     * If the non-deprecated replacement for the configuration, highlight preview, or dismissal preview methods is
     * implemented this method is not called.
     * 
     * @param collectionView The @c UICollectionView.
     * @param configuration  The configuration of the menu about to be displayed by this interaction.
     * 
     *                       API-Since: 13.0
     *                       Deprecated-Since: 16.0
     */
    @Deprecated
    @Generated
    @IsOptional
    @Selector("collectionView:previewForHighlightingContextMenuWithConfiguration:")
    default UITargetedPreview collectionViewPreviewForHighlightingContextMenuWithConfiguration(
            UICollectionView collectionView, UIContextMenuConfiguration configuration) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Allows a two-finger pan gesture to automatically enable allowsMultipleSelection and start selecting multiple
     * cells.
     * 
     * After a multi-select gesture is recognized, this method will be called before allowsMultipleSelection is
     * automatically
     * set to YES to allow the user to select multiple contiguous items using a two-finger pan gesture across the
     * constrained
     * scroll direction.
     * 
     * If the collection view has no constrained scroll direction (i.e., the collection view scrolls both horizontally
     * and vertically),
     * then this method will not be called and the multi-select gesture will be disabled.
     * 
     * If this method is not implemented, the default is NO.
     * 
     * API-Since: 13.0
     */
    @Generated
    @IsOptional
    @Selector("collectionView:shouldBeginMultipleSelectionInteractionAtIndexPath:")
    default boolean collectionViewShouldBeginMultipleSelectionInteractionAtIndexPath(UICollectionView collectionView,
            NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the interaction is about to "commit" in response to the user tapping the preview.
     * 
     * @param collectionView The @c UICollectionView.
     * @param configuration  Configuration of the currently displayed menu.
     * @param animator       Commit animator. Add animations to this object to run them alongside the commit transition.
     * 
     *                       API-Since: 13.0
     */
    @Generated
    @IsOptional
    @Selector("collectionView:willPerformPreviewActionForMenuWithConfiguration:animator:")
    default void collectionViewWillPerformPreviewActionForMenuWithConfigurationAnimator(UICollectionView collectionView,
            UIContextMenuConfiguration configuration,
            @Mapped(ObjCObjectMapper.class) UIContextMenuInteractionCommitAnimating animator) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the multi-select interaction ends.
     * 
     * At this point, the collection view will remain in multi-select mode, but this delegate method is called to
     * indicate that the
     * multiple selection gesture or hardware keyboard interaction has ended.
     * 
     * API-Since: 13.0
     */
    @Generated
    @IsOptional
    @Selector("collectionViewDidEndMultipleSelectionInteraction:")
    default void collectionViewDidEndMultipleSelectionInteraction(UICollectionView collectionView) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Editing
     * Asks the delegate to verify that the given item is editable.
     * 
     * @param collectionView The collection view object requesting this information.
     * @param indexPath      An index path locating an item in `collectionView`.
     * 
     * @return `YES` if the item is editable; otherwise, `NO`. Defaults to `YES`.
     * 
     *         API-Since: 14.0
     */
    @Generated
    @IsOptional
    @Selector("collectionView:canEditItemAtIndexPath:")
    default boolean collectionViewCanEditItemAtIndexPath(UICollectionView collectionView, NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the collection view is about to display a menu.
     * 
     * @param collectionView The @c UICollectionView.
     * @param configuration  The configuration of the menu about to be displayed.
     * @param animator       Appearance animator. Add animations to run them alongside the appearance transition.
     * 
     *                       API-Since: 13.2
     */
    @Generated
    @IsOptional
    @Selector("collectionView:willDisplayContextMenuWithConfiguration:animator:")
    default void collectionViewWillDisplayContextMenuWithConfigurationAnimator(UICollectionView collectionView,
            UIContextMenuConfiguration configuration,
            @Mapped(ObjCObjectMapper.class) UIContextMenuInteractionAnimating animator) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the collection view's context menu interaction is about to end.
     * 
     * @param collectionView The @c UICollectionView.
     * @param configuration  Ending configuration.
     * @param animator       Disappearance animator. Add animations to run them alongside the disappearance transition.
     * 
     *                       API-Since: 13.2
     */
    @Generated
    @IsOptional
    @Selector("collectionView:willEndContextMenuInteractionWithConfiguration:animator:")
    default void collectionViewWillEndContextMenuInteractionWithConfigurationAnimator(UICollectionView collectionView,
            UIContextMenuConfiguration configuration,
            @Mapped(ObjCObjectMapper.class) UIContextMenuInteractionAnimating animator) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Return a valid @c UIWindowSceneActivationConfiguration to allow for the cell to be expanded into a new scene.
     * Return nil to prevent the interaction from starting.
     * 
     * @param collectionView The collection view
     * @param indexPath      The index path of the cell being interacted with
     * @param point          The centroid of the interaction in the collection view's coordinate space.
     * 
     *                       API-Since: 15.0
     */
    @Generated
    @IsOptional
    @Selector("collectionView:sceneActivationConfigurationForItemAtIndexPath:point:")
    default UIWindowSceneActivationConfiguration collectionViewSceneActivationConfigurationForItemAtIndexPathPoint(
            UICollectionView collectionView, NSIndexPath indexPath, @ByValue CGPoint point) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Determines if the item at the specified index path should also become selected when focus moves to it.
     * If the collection view's global selectionFollowsFocus is enabled, this method will allow you to override that
     * behavior on a per-index path basis. This method is not called if selectionFollowsFocus is disabled.
     * 
     * API-Since: 15.0
     */
    @Generated
    @IsOptional
    @Selector("collectionView:selectionFollowsFocusForItemAtIndexPath:")
    default boolean collectionViewSelectionFollowsFocusForItemAtIndexPath(UICollectionView collectionView,
            NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 15.0
     */
    @Generated
    @IsOptional
    @Selector("collectionView:targetIndexPathForMoveOfItemFromOriginalIndexPath:atCurrentIndexPath:toProposedIndexPath:")
    default NSIndexPath collectionViewTargetIndexPathForMoveOfItemFromOriginalIndexPathAtCurrentIndexPathToProposedIndexPath(
            UICollectionView collectionView, NSIndexPath originalIndexPath, NSIndexPath currentIndexPath,
            NSIndexPath proposedIndexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called to determine if a primary action can be performed for the item at the given indexPath.
     * See @c collectionView:performPrimaryActionForItemAtIndexPath: for more details about primary actions.
     * 
     * @param collectionView This UICollectionView
     * @param indexPath      NSIndexPath of the item
     * 
     * @return `YES` if the primary action can be performed; otherwise `NO`. If not implemented, defaults to `YES` when
     *         not editing
     *         and `NO` when editing.
     * 
     *         API-Since: 16.0
     */
    @Generated
    @IsOptional
    @Selector("collectionView:canPerformPrimaryActionForItemAtIndexPath:")
    default boolean collectionViewCanPerformPrimaryActionForItemAtIndexPath(UICollectionView collectionView,
            NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when a context menu presented from this collection view is dismissed. Return a @c UITargetedPreview
     * corresponding to the item at the given indexPath.
     * 
     * @param collectionView The @c UICollectionView.
     * @param configuration  Configuration of the menu being dismissed.
     * @param indexPath      Index path of the item to which the menu is being dismissed.
     * 
     *                       API-Since: 16.0
     */
    @Generated
    @IsOptional
    @Selector("collectionView:contextMenuConfiguration:dismissalPreviewForItemAtIndexPath:")
    default UITargetedPreview collectionViewContextMenuConfigurationDismissalPreviewForItemAtIndexPath(
            UICollectionView collectionView, UIContextMenuConfiguration configuration, NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when a context menu interaction begins in this collection view to request a preview for the interaction's
     * initial highlight effect.
     * Return a @c UITargetedPreview corresponding to the item at the given indexPath.
     * 
     * @param collectionView The @c UICollectionView.
     * @param configuration  Configuration of the menu that will be presented if the interaction proceeds.
     * @param indexPath      Index path of the item at which the interaction is occurring.
     * 
     *                       API-Since: 16.0
     */
    @Generated
    @IsOptional
    @Selector("collectionView:contextMenuConfiguration:highlightPreviewForItemAtIndexPath:")
    default UITargetedPreview collectionViewContextMenuConfigurationHighlightPreviewForItemAtIndexPath(
            UICollectionView collectionView, UIContextMenuConfiguration configuration, NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when a context menu is invoked from this collection view.
     * 
     * The @c indexPaths array may contain 0-many items:
     * - An empty array indicates that the menu was invoked in the space between cells (or any location that does not
     * map to an item index path).
     * - An array with multiple index paths indicates that the menu was invoked on an item within a multiple selection.
     * 
     * API-Since: 16.0
     * 
     * @param collectionView The @c UICollectionView.
     * @param indexPaths     An array of index paths on which the menu acts.
     * @param point          Touch location in the collection view's coordinate space.
     * 
     * @return A @c UIContextMenuConfiguration describing the menu to be presented. Return nil to prevent the
     *         interaction from beginning.
     *         Returning an empty configuration causes the interaction to begin then fail with a cancellation effect.
     *         You might use this
     *         to indicate to users that it's possible for a menu to be presented from this element, but that there are
     *         no actions to
     *         present at this particular time.
     */
    @Generated
    @IsOptional
    @Selector("collectionView:contextMenuConfigurationForItemsAtIndexPaths:point:")
    default UIContextMenuConfiguration collectionViewContextMenuConfigurationForItemsAtIndexPathsPoint(
            UICollectionView collectionView, NSArray<? extends NSIndexPath> indexPaths, @ByValue CGPoint point) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the primary action should be performed for the item at the given indexPath.
     * 
     * Primary actions allow you to distinguish between a change of selection (which can be based on focus changes or
     * other indirect selection changes) and distinct user actions. Primary actions are performed when the user selects
     * a cell without extending
     * an existing selection. This is called after @c shouldSelectItem and @c didSelectItem , regardless of whether the
     * cell's selection
     * state was allowed to change.
     * 
     * As an example, use @c didSelectItemAtIndexPath for updating state in the current view controller (i.e. buttons,
     * title, etc) and
     * use the primary action for navigation or showing another split view column.
     * 
     * @param collectionView This UICollectionView
     * @param indexPath      NSIndexPath of the item to perform the action on
     * 
     *                       API-Since: 16.0
     */
    @Generated
    @IsOptional
    @Selector("collectionView:performPrimaryActionForItemAtIndexPath:")
    default void collectionViewPerformPrimaryActionForItemAtIndexPath(UICollectionView collectionView,
            NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }
}
