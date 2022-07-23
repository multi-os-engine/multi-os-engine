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

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UICollectionViewDelegate")
public interface UICollectionViewDelegate extends UIScrollViewDelegate {
    /**
     * Focus
     */
    @Generated
    @IsOptional
    @Selector("collectionView:canFocusItemAtIndexPath:")
    default boolean collectionViewCanFocusItemAtIndexPath(UICollectionView collectionView, NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

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

    @Generated
    @IsOptional
    @Selector("collectionView:didUpdateFocusInContext:withAnimationCoordinator:")
    default void collectionViewDidUpdateFocusInContextWithAnimationCoordinator(UICollectionView collectionView,
            UICollectionViewFocusUpdateContext context, UIFocusAnimationCoordinator coordinator) {
        throw new java.lang.UnsupportedOperationException();
    }

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
     * <p>
     * (when the touch begins)
     * 1. -collectionView:shouldHighlightItemAtIndexPath:
     * 2. -collectionView:didHighlightItemAtIndexPath:
     * <p>
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
     */
    @Generated
    @IsOptional
    @Selector("collectionView:shouldShowMenuForItemAtIndexPath:")
    default boolean collectionViewShouldShowMenuForItemAtIndexPath(UICollectionView collectionView,
            NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("collectionView:shouldUpdateFocusInContext:")
    default boolean collectionViewShouldUpdateFocusInContext(UICollectionView collectionView,
            UICollectionViewFocusUpdateContext context) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * customize the content offset to be applied during transition or update animations
     */
    @Generated
    @IsOptional
    @Selector("collectionView:targetContentOffsetForProposedContentOffset:")
    @ByValue
    default CGPoint collectionViewTargetContentOffsetForProposedContentOffset(UICollectionView collectionView,
            @ByValue CGPoint proposedContentOffset) {
        throw new java.lang.UnsupportedOperationException();
    }

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

    @Generated
    @IsOptional
    @Selector("collectionView:willDisplayCell:forItemAtIndexPath:")
    default void collectionViewWillDisplayCellForItemAtIndexPath(UICollectionView collectionView,
            UICollectionViewCell cell, NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("collectionView:willDisplaySupplementaryView:forElementKind:atIndexPath:")
    default void collectionViewWillDisplaySupplementaryViewForElementKindAtIndexPath(UICollectionView collectionView,
            UICollectionReusableView view, String elementKind, NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("indexPathForPreferredFocusedViewInCollectionView:")
    default NSIndexPath indexPathForPreferredFocusedViewInCollectionView(UICollectionView collectionView) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Allows opting-out of spring loading for an particular item.
     * <p>
     * If you want the interaction effect on a different subview of the spring loaded cell, modify the
     * context.targetView property.
     * The default is the cell.
     * <p>
     * If this method is not implemented, the default is YES.
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
     * @param collectionView This UICollectionView.
     * @param indexPath      IndexPath of the item for which a configuration is being requested.
     * @param point          Location in the collection view's coordinate space
     * @return A UIContextMenuConfiguration describing the menu to be presented. Return nil to prevent the interaction
     *         from beginning.
     *         Returning an empty configuration causes the interaction to begin then fail with a cancellation effect.
     *         You might use this
     *         to indicate to users that it's possible for a menu to be presented from this element, but that there are
     *         no actions to
     *         present at this particular time.
     */
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
     * <p>
     * In your app, this would be a good opportunity to update the state of your UI to reflect the fact that the user is
     * now selecting
     * multiple items at once; such as updating buttons to say "Done" instead of "Select"/"Edit", for instance.
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
     *
     * @param collectionView This UICollectionView.
     * @param configuration  The configuration of the menu displayed by this interaction.
     */
    @Generated
    @IsOptional
    @Selector("collectionView:previewForDismissingContextMenuWithConfiguration:")
    default UITargetedPreview collectionViewPreviewForDismissingContextMenuWithConfiguration(
            UICollectionView collectionView, UIContextMenuConfiguration configuration) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the interaction begins. Return a UITargetedPreview describing the desired highlight preview.
     *
     * @param collectionView This UICollectionView.
     * @param configuration  The configuration of the menu about to be displayed by this interaction.
     */
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
     * <p>
     * After a multi-select gesture is recognized, this method will be called before allowsMultipleSelection is
     * automatically
     * set to YES to allow the user to select multiple contiguous items using a two-finger pan gesture across the
     * constrained
     * scroll direction.
     * <p>
     * If the collection view has no constrained scroll direction (i.e., the collection view scrolls both horizontally
     * and vertically),
     * then this method will not be called and the multi-select gesture will be disabled.
     * <p>
     * If this method is not implemented, the default is NO.
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
     * @param collectionView This UICollectionView.
     * @param configuration  Configuration of the currently displayed menu.
     * @param animator       Commit animator. Add animations to this object to run them alongside the commit transition.
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
     * <p>
     * At this point, the collection view will remain in multi-select mode, but this delegate method is called to
     * indicate that the
     * multiple selection gesture or hardware keyboard interaction has ended.
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
     * @return `YES` if the item is editable; otherwise, `NO`. Defaults to `YES`.
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
     * @param collectionView This UICollectionView.
     * @param configuration  The configuration of the menu about to be displayed.
     * @param animator       Appearance animator. Add animations to run them alongside the appearance transition.
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
     * @param collectionView This UICollectionView.
     * @param configuration  Ending configuration.
     * @param animator       Disappearance animator. Add animations to run them alongside the disappearance transition.
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
     */
    @Generated
    @IsOptional
    @Selector("collectionView:selectionFollowsFocusForItemAtIndexPath:")
    default boolean collectionViewSelectionFollowsFocusForItemAtIndexPath(UICollectionView collectionView,
            NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("collectionView:targetIndexPathForMoveOfItemFromOriginalIndexPath:atCurrentIndexPath:toProposedIndexPath:")
    default NSIndexPath collectionViewTargetIndexPathForMoveOfItemFromOriginalIndexPathAtCurrentIndexPathToProposedIndexPath(
            UICollectionView collectionView, NSIndexPath originalIndexPath, NSIndexPath currentIndexPath,
            NSIndexPath proposedIndexPath) {
        throw new java.lang.UnsupportedOperationException();
    }
}
