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

package ios.uikit.protocol;


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

import ios.foundation.NSArray;
import ios.foundation.NSIndexPath;
import ios.uikit.UITableView;
import ios.uikit.UITableViewCell;
import ios.uikit.UITableViewRowAction;
import ios.uikit.UIView;
import ios.uikit.UIFocusAnimationCoordinator;
import ios.uikit.UITableViewFocusUpdateContext;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UITableViewDelegate")
public interface UITableViewDelegate extends UIScrollViewDelegate {
	/**
	 * tableView:accessoryButtonTappedForRowWithIndexPath:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/UITableViewDelegate/tableView:accessoryButtonTappedForRowWithIndexPath:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("tableView:accessoryButtonTappedForRowWithIndexPath:")
	default void tableViewAccessoryButtonTappedForRowWithIndexPath(
			UITableView tableView, NSIndexPath indexPath) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * tableView:accessoryTypeForRowWithIndexPath:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/UITableViewDelegate/tableView:accessoryTypeForRowWithIndexPath:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Deprecated
	@Selector("tableView:accessoryTypeForRowWithIndexPath:")
	@NInt
	default long tableViewAccessoryTypeForRowWithIndexPath(
			UITableView tableView, NSIndexPath indexPath) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * tableView:canPerformAction:forRowAtIndexPath:withSender:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/UITableViewDelegate/tableView:canPerformAction:forRowAtIndexPath:withSender:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("tableView:canPerformAction:forRowAtIndexPath:withSender:")
	default boolean tableViewCanPerformActionForRowAtIndexPathWithSender(
			UITableView tableView, SEL action, NSIndexPath indexPath,
			@Mapped(ObjCObjectMapper.class) Object sender) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * tableView:didDeselectRowAtIndexPath:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/UITableViewDelegate/tableView:didDeselectRowAtIndexPath:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("tableView:didDeselectRowAtIndexPath:")
	default void tableViewDidDeselectRowAtIndexPath(
			UITableView tableView, NSIndexPath indexPath) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * tableView:didEndDisplayingCell:forRowAtIndexPath:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/UITableViewDelegate/tableView:didEndDisplayingCell:forRowAtIndexPath:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("tableView:didEndDisplayingCell:forRowAtIndexPath:")
	default void tableViewDidEndDisplayingCellForRowAtIndexPath(
			UITableView tableView, UITableViewCell cell, NSIndexPath indexPath) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * tableView:didEndDisplayingFooterView:forSection:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/UITableViewDelegate/tableView:didEndDisplayingFooterView:forSection:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("tableView:didEndDisplayingFooterView:forSection:")
	default void tableViewDidEndDisplayingFooterViewForSection(
			UITableView tableView, UIView view, @NInt long section) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * tableView:didEndDisplayingHeaderView:forSection:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/UITableViewDelegate/tableView:didEndDisplayingHeaderView:forSection:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("tableView:didEndDisplayingHeaderView:forSection:")
	default void tableViewDidEndDisplayingHeaderViewForSection(
			UITableView tableView, UIView view, @NInt long section) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * tableView:didEndEditingRowAtIndexPath:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/UITableViewDelegate/tableView:didEndEditingRowAtIndexPath:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("tableView:didEndEditingRowAtIndexPath:")
	default void tableViewDidEndEditingRowAtIndexPath(
			UITableView tableView, NSIndexPath indexPath) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * tableView:didHighlightRowAtIndexPath:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/UITableViewDelegate/tableView:didHighlightRowAtIndexPath:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("tableView:didHighlightRowAtIndexPath:")
	default void tableViewDidHighlightRowAtIndexPath(
			UITableView tableView, NSIndexPath indexPath) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * tableView:didSelectRowAtIndexPath:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/UITableViewDelegate/tableView:didSelectRowAtIndexPath:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("tableView:didSelectRowAtIndexPath:")
	default void tableViewDidSelectRowAtIndexPath(UITableView tableView,
			NSIndexPath indexPath) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * tableView:didUnhighlightRowAtIndexPath:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/UITableViewDelegate/tableView:didUnhighlightRowAtIndexPath:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("tableView:didUnhighlightRowAtIndexPath:")
	default void tableViewDidUnhighlightRowAtIndexPath(
			UITableView tableView, NSIndexPath indexPath) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * tableView:editActionsForRowAtIndexPath:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/UITableViewDelegate/tableView:editActionsForRowAtIndexPath:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("tableView:editActionsForRowAtIndexPath:")
	default NSArray<? extends UITableViewRowAction> tableViewEditActionsForRowAtIndexPath(
			UITableView tableView, NSIndexPath indexPath) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * tableView:editingStyleForRowAtIndexPath:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/UITableViewDelegate/tableView:editingStyleForRowAtIndexPath:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("tableView:editingStyleForRowAtIndexPath:")
	@NInt
	default long tableViewEditingStyleForRowAtIndexPath(
			UITableView tableView, NSIndexPath indexPath) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * tableView:estimatedHeightForFooterInSection:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/UITableViewDelegate/tableView:estimatedHeightForFooterInSection:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("tableView:estimatedHeightForFooterInSection:")
	@NFloat
	default double tableViewEstimatedHeightForFooterInSection(
			UITableView tableView, @NInt long section) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * tableView:estimatedHeightForHeaderInSection:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/UITableViewDelegate/tableView:estimatedHeightForHeaderInSection:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("tableView:estimatedHeightForHeaderInSection:")
	@NFloat
	default double tableViewEstimatedHeightForHeaderInSection(
			UITableView tableView, @NInt long section) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * tableView:estimatedHeightForRowAtIndexPath:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/UITableViewDelegate/tableView:estimatedHeightForRowAtIndexPath:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("tableView:estimatedHeightForRowAtIndexPath:")
	@NFloat
	default double tableViewEstimatedHeightForRowAtIndexPath(
			UITableView tableView, NSIndexPath indexPath) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * tableView:heightForFooterInSection:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/UITableViewDelegate/tableView:heightForFooterInSection:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("tableView:heightForFooterInSection:")
	@NFloat
	default double tableViewHeightForFooterInSection(
			UITableView tableView, @NInt long section) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * tableView:heightForHeaderInSection:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/UITableViewDelegate/tableView:heightForHeaderInSection:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("tableView:heightForHeaderInSection:")
	@NFloat
	default double tableViewHeightForHeaderInSection(
			UITableView tableView, @NInt long section) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * tableView:heightForRowAtIndexPath:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/UITableViewDelegate/tableView:heightForRowAtIndexPath:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("tableView:heightForRowAtIndexPath:")
	@NFloat
	default double tableViewHeightForRowAtIndexPath(
			UITableView tableView, NSIndexPath indexPath) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * tableView:indentationLevelForRowAtIndexPath:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/UITableViewDelegate/tableView:indentationLevelForRowAtIndexPath:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("tableView:indentationLevelForRowAtIndexPath:")
	@NInt
	default long tableViewIndentationLevelForRowAtIndexPath(
			UITableView tableView, NSIndexPath indexPath) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * tableView:performAction:forRowAtIndexPath:withSender:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/UITableViewDelegate/tableView:performAction:forRowAtIndexPath:withSender:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("tableView:performAction:forRowAtIndexPath:withSender:")
	default void tableViewPerformActionForRowAtIndexPathWithSender(
			UITableView tableView, SEL action, NSIndexPath indexPath,
			@Mapped(ObjCObjectMapper.class) Object sender) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * tableView:shouldHighlightRowAtIndexPath:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/UITableViewDelegate/tableView:shouldHighlightRowAtIndexPath:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("tableView:shouldHighlightRowAtIndexPath:")
	default boolean tableViewShouldHighlightRowAtIndexPath(
			UITableView tableView, NSIndexPath indexPath) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * tableView:shouldIndentWhileEditingRowAtIndexPath:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/UITableViewDelegate/tableView:shouldIndentWhileEditingRowAtIndexPath:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("tableView:shouldIndentWhileEditingRowAtIndexPath:")
	default boolean tableViewShouldIndentWhileEditingRowAtIndexPath(
			UITableView tableView, NSIndexPath indexPath) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * tableView:shouldShowMenuForRowAtIndexPath:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/UITableViewDelegate/tableView:shouldShowMenuForRowAtIndexPath:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("tableView:shouldShowMenuForRowAtIndexPath:")
	default boolean tableViewShouldShowMenuForRowAtIndexPath(
			UITableView tableView, NSIndexPath indexPath) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * tableView:targetIndexPathForMoveFromRowAtIndexPath:toProposedIndexPath:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/UITableViewDelegate/tableView:targetIndexPathForMoveFromRowAtIndexPath:toProposedIndexPath:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("tableView:targetIndexPathForMoveFromRowAtIndexPath:toProposedIndexPath:")
	default NSIndexPath tableViewTargetIndexPathForMoveFromRowAtIndexPathToProposedIndexPath(
			UITableView tableView, NSIndexPath sourceIndexPath,
			NSIndexPath proposedDestinationIndexPath) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * tableView:titleForDeleteConfirmationButtonForRowAtIndexPath:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/UITableViewDelegate/tableView:titleForDeleteConfirmationButtonForRowAtIndexPath:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("tableView:titleForDeleteConfirmationButtonForRowAtIndexPath:")
	default String tableViewTitleForDeleteConfirmationButtonForRowAtIndexPath(
			UITableView tableView, NSIndexPath indexPath) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * tableView:viewForFooterInSection:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/UITableViewDelegate/tableView:viewForFooterInSection:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("tableView:viewForFooterInSection:")
	default UIView tableViewViewForFooterInSection(
			UITableView tableView, @NInt long section) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * tableView:viewForHeaderInSection:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/UITableViewDelegate/tableView:viewForHeaderInSection:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("tableView:viewForHeaderInSection:")
	default UIView tableViewViewForHeaderInSection(
			UITableView tableView, @NInt long section) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * tableView:willBeginEditingRowAtIndexPath:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/UITableViewDelegate/tableView:willBeginEditingRowAtIndexPath:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("tableView:willBeginEditingRowAtIndexPath:")
	default void tableViewWillBeginEditingRowAtIndexPath(
			UITableView tableView, NSIndexPath indexPath) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * tableView:willDeselectRowAtIndexPath:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/UITableViewDelegate/tableView:willDeselectRowAtIndexPath:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("tableView:willDeselectRowAtIndexPath:")
	default NSIndexPath tableViewWillDeselectRowAtIndexPath(
			UITableView tableView, NSIndexPath indexPath) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * tableView:willDisplayCell:forRowAtIndexPath:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/UITableViewDelegate/tableView:willDisplayCell:forRowAtIndexPath:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("tableView:willDisplayCell:forRowAtIndexPath:")
	default void tableViewWillDisplayCellForRowAtIndexPath(
			UITableView tableView, UITableViewCell cell, NSIndexPath indexPath) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * tableView:willDisplayFooterView:forSection:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/UITableViewDelegate/tableView:willDisplayFooterView:forSection:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("tableView:willDisplayFooterView:forSection:")
	default void tableViewWillDisplayFooterViewForSection(
			UITableView tableView, UIView view, @NInt long section) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * tableView:willDisplayHeaderView:forSection:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/UITableViewDelegate/tableView:willDisplayHeaderView:forSection:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("tableView:willDisplayHeaderView:forSection:")
	default void tableViewWillDisplayHeaderViewForSection(
			UITableView tableView, UIView view, @NInt long section) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * tableView:willSelectRowAtIndexPath:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/UITableViewDelegate/tableView:willSelectRowAtIndexPath:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("tableView:willSelectRowAtIndexPath:")
	default NSIndexPath tableViewWillSelectRowAtIndexPath(
			UITableView tableView, NSIndexPath indexPath) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * indexPathForPreferredFocusedViewInTableView:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/UITableViewDelegate/indexPathForPreferredFocusedViewInTableView:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("indexPathForPreferredFocusedViewInTableView:")
	default NSIndexPath indexPathForPreferredFocusedViewInTableView(
			UITableView tableView) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * tableView:canFocusRowAtIndexPath:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/UITableViewDelegate/tableView:canFocusRowAtIndexPath:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("tableView:canFocusRowAtIndexPath:")
	default boolean tableViewCanFocusRowAtIndexPath(
			UITableView tableView, NSIndexPath indexPath) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * tableView:didUpdateFocusInContext:withAnimationCoordinator:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/UITableViewDelegate/tableView:didUpdateFocusInContext:withAnimationCoordinator:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("tableView:didUpdateFocusInContext:withAnimationCoordinator:")
	default void tableViewDidUpdateFocusInContextWithAnimationCoordinator(
			UITableView tableView, UITableViewFocusUpdateContext context,
			UIFocusAnimationCoordinator coordinator) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * tableView:shouldUpdateFocusInContext:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/UITableViewDelegate/tableView:shouldUpdateFocusInContext:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("tableView:shouldUpdateFocusInContext:")
	default boolean tableViewShouldUpdateFocusInContext(
			UITableView tableView, UITableViewFocusUpdateContext context) {
		throw new java.lang.UnsupportedOperationException();
	}
}
