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
import apple.uikit.UIFocusAnimationCoordinator;
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
     * collectionView:canPerformAction:forItemAtIndexPath:withSender:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionViewDelegate_protocol/index.html#//apple_ref/occ/intfm/UICollectionViewDelegate/collectionView:canPerformAction:forItemAtIndexPath:withSender:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("collectionView:canPerformAction:forItemAtIndexPath:withSender:")
    default boolean collectionViewCanPerformActionForItemAtIndexPathWithSender(UICollectionView collectionView,
            SEL action, NSIndexPath indexPath, @Mapped(ObjCObjectMapper.class) Object sender) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * collectionView:didDeselectItemAtIndexPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionViewDelegate_protocol/index.html#//apple_ref/occ/intfm/UICollectionViewDelegate/collectionView:didDeselectItemAtIndexPath:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("collectionView:didDeselectItemAtIndexPath:")
    default void collectionViewDidDeselectItemAtIndexPath(UICollectionView collectionView, NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * collectionView:didEndDisplayingCell:forItemAtIndexPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionViewDelegate_protocol/index.html#//apple_ref/occ/intfm/UICollectionViewDelegate/collectionView:didEndDisplayingCell:forItemAtIndexPath:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("collectionView:didEndDisplayingCell:forItemAtIndexPath:")
    default void collectionViewDidEndDisplayingCellForItemAtIndexPath(UICollectionView collectionView,
            UICollectionViewCell cell, NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * collectionView:didEndDisplayingSupplementaryView:forElementOfKind:atIndexPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionViewDelegate_protocol/index.html#//apple_ref/occ/intfm/UICollectionViewDelegate/collectionView:didEndDisplayingSupplementaryView:forElementOfKind:atIndexPath:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("collectionView:didEndDisplayingSupplementaryView:forElementOfKind:atIndexPath:")
    default void collectionViewDidEndDisplayingSupplementaryViewForElementOfKindAtIndexPath(
            UICollectionView collectionView, UICollectionReusableView view, String elementKind, NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * collectionView:didHighlightItemAtIndexPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionViewDelegate_protocol/index.html#//apple_ref/occ/intfm/UICollectionViewDelegate/collectionView:didHighlightItemAtIndexPath:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("collectionView:didHighlightItemAtIndexPath:")
    default void collectionViewDidHighlightItemAtIndexPath(UICollectionView collectionView, NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * collectionView:didSelectItemAtIndexPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionViewDelegate_protocol/index.html#//apple_ref/occ/intfm/UICollectionViewDelegate/collectionView:didSelectItemAtIndexPath:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("collectionView:didSelectItemAtIndexPath:")
    default void collectionViewDidSelectItemAtIndexPath(UICollectionView collectionView, NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * collectionView:didUnhighlightItemAtIndexPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionViewDelegate_protocol/index.html#//apple_ref/occ/intfm/UICollectionViewDelegate/collectionView:didUnhighlightItemAtIndexPath:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("collectionView:didUnhighlightItemAtIndexPath:")
    default void collectionViewDidUnhighlightItemAtIndexPath(UICollectionView collectionView, NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * collectionView:performAction:forItemAtIndexPath:withSender:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionViewDelegate_protocol/index.html#//apple_ref/occ/intfm/UICollectionViewDelegate/collectionView:performAction:forItemAtIndexPath:withSender:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("collectionView:performAction:forItemAtIndexPath:withSender:")
    default void collectionViewPerformActionForItemAtIndexPathWithSender(UICollectionView collectionView, SEL action,
            NSIndexPath indexPath, @Mapped(ObjCObjectMapper.class) Object sender) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * collectionView:shouldDeselectItemAtIndexPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionViewDelegate_protocol/index.html#//apple_ref/occ/intfm/UICollectionViewDelegate/collectionView:shouldDeselectItemAtIndexPath:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("collectionView:shouldDeselectItemAtIndexPath:")
    default boolean collectionViewShouldDeselectItemAtIndexPath(UICollectionView collectionView,
            NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * collectionView:shouldHighlightItemAtIndexPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionViewDelegate_protocol/index.html#//apple_ref/occ/intfm/UICollectionViewDelegate/collectionView:shouldHighlightItemAtIndexPath:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("collectionView:shouldHighlightItemAtIndexPath:")
    default boolean collectionViewShouldHighlightItemAtIndexPath(UICollectionView collectionView,
            NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * collectionView:shouldSelectItemAtIndexPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionViewDelegate_protocol/index.html#//apple_ref/occ/intfm/UICollectionViewDelegate/collectionView:shouldSelectItemAtIndexPath:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("collectionView:shouldSelectItemAtIndexPath:")
    default boolean collectionViewShouldSelectItemAtIndexPath(UICollectionView collectionView, NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * collectionView:shouldShowMenuForItemAtIndexPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionViewDelegate_protocol/index.html#//apple_ref/occ/intfm/UICollectionViewDelegate/collectionView:shouldShowMenuForItemAtIndexPath:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("collectionView:shouldShowMenuForItemAtIndexPath:")
    default boolean collectionViewShouldShowMenuForItemAtIndexPath(UICollectionView collectionView,
            NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * collectionView:transitionLayoutForOldLayout:newLayout:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionViewDelegate_protocol/index.html#//apple_ref/occ/intfm/UICollectionViewDelegate/collectionView:transitionLayoutForOldLayout:newLayout:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("collectionView:transitionLayoutForOldLayout:newLayout:")
    default UICollectionViewTransitionLayout collectionViewTransitionLayoutForOldLayoutNewLayout(
            UICollectionView collectionView, UICollectionViewLayout fromLayout, UICollectionViewLayout toLayout) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * collectionView:willDisplayCell:forItemAtIndexPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionViewDelegate_protocol/index.html#//apple_ref/occ/intfm/UICollectionViewDelegate/collectionView:willDisplayCell:forItemAtIndexPath:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("collectionView:willDisplayCell:forItemAtIndexPath:")
    default void collectionViewWillDisplayCellForItemAtIndexPath(UICollectionView collectionView,
            UICollectionViewCell cell, NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * collectionView:willDisplaySupplementaryView:forElementKind:atIndexPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionViewDelegate_protocol/index.html#//apple_ref/occ/intfm/UICollectionViewDelegate/collectionView:willDisplaySupplementaryView:forElementKind:atIndexPath:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("collectionView:willDisplaySupplementaryView:forElementKind:atIndexPath:")
    default void collectionViewWillDisplaySupplementaryViewForElementKindAtIndexPath(UICollectionView collectionView,
            UICollectionReusableView view, String elementKind, NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * collectionView:targetContentOffsetForProposedContentOffset:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionViewDelegate_protocol/index.html#//apple_ref/occ/intfm/UICollectionViewDelegate/collectionView:targetContentOffsetForProposedContentOffset:">iOS Dev Center</a>
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
     * collectionView:targetIndexPathForMoveFromItemAtIndexPath:toProposedIndexPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionViewDelegate_protocol/index.html#//apple_ref/occ/intfm/UICollectionViewDelegate/collectionView:targetIndexPathForMoveFromItemAtIndexPath:toProposedIndexPath:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("collectionView:targetIndexPathForMoveFromItemAtIndexPath:toProposedIndexPath:")
    default NSIndexPath collectionViewTargetIndexPathForMoveFromItemAtIndexPathToProposedIndexPath(
            UICollectionView collectionView, NSIndexPath originalIndexPath, NSIndexPath proposedIndexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * collectionView:canFocusItemAtIndexPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionViewDelegate_protocol/index.html#//apple_ref/occ/intfm/UICollectionViewDelegate/collectionView:canFocusItemAtIndexPath:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("collectionView:canFocusItemAtIndexPath:")
    default boolean collectionViewCanFocusItemAtIndexPath(UICollectionView collectionView, NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * collectionView:didUpdateFocusInContext:withAnimationCoordinator:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionViewDelegate_protocol/index.html#//apple_ref/occ/intfm/UICollectionViewDelegate/collectionView:didUpdateFocusInContext:withAnimationCoordinator:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("collectionView:didUpdateFocusInContext:withAnimationCoordinator:")
    default void collectionViewDidUpdateFocusInContextWithAnimationCoordinator(UICollectionView collectionView,
            UICollectionViewFocusUpdateContext context, UIFocusAnimationCoordinator coordinator) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * collectionView:shouldUpdateFocusInContext:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionViewDelegate_protocol/index.html#//apple_ref/occ/intfm/UICollectionViewDelegate/collectionView:shouldUpdateFocusInContext:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("collectionView:shouldUpdateFocusInContext:")
    default boolean collectionViewShouldUpdateFocusInContext(UICollectionView collectionView,
            UICollectionViewFocusUpdateContext context) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * indexPathForPreferredFocusedViewInCollectionView:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionViewDelegate_protocol/index.html#//apple_ref/occ/intfm/UICollectionViewDelegate/indexPathForPreferredFocusedViewInCollectionView:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("indexPathForPreferredFocusedViewInCollectionView:")
    default NSIndexPath indexPathForPreferredFocusedViewInCollectionView(UICollectionView collectionView) {
        throw new java.lang.UnsupportedOperationException();
    }
}
