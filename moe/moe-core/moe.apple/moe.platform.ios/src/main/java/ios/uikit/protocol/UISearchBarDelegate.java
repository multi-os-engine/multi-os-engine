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


import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

import ios.foundation.struct.NSRange;
import ios.uikit.UISearchBar;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UISearchBarDelegate")
public interface UISearchBarDelegate extends UIBarPositioningDelegate {
	/**
	 * searchBar:selectedScopeButtonIndexDidChange:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISearchBarDelegate_Protocol/index.html#//apple_ref/occ/intfm/UISearchBarDelegate/searchBar:selectedScopeButtonIndexDidChange:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("searchBar:selectedScopeButtonIndexDidChange:")
	default void searchBarSelectedScopeButtonIndexDidChange(
			UISearchBar searchBar, @NInt long selectedScope) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * searchBar:shouldChangeTextInRange:replacementText:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISearchBarDelegate_Protocol/index.html#//apple_ref/occ/intfm/UISearchBarDelegate/searchBar:shouldChangeTextInRange:replacementText:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("searchBar:shouldChangeTextInRange:replacementText:")
	default boolean searchBarShouldChangeTextInRangeReplacementText(
			UISearchBar searchBar, @ByValue NSRange range, String text) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * searchBar:textDidChange:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISearchBarDelegate_Protocol/index.html#//apple_ref/occ/intfm/UISearchBarDelegate/searchBar:textDidChange:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("searchBar:textDidChange:")
	default void searchBarTextDidChange(UISearchBar searchBar,
			String searchText) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * searchBarBookmarkButtonClicked:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISearchBarDelegate_Protocol/index.html#//apple_ref/occ/intfm/UISearchBarDelegate/searchBarBookmarkButtonClicked:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("searchBarBookmarkButtonClicked:")
	default void searchBarBookmarkButtonClicked(UISearchBar searchBar) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * searchBarCancelButtonClicked:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISearchBarDelegate_Protocol/index.html#//apple_ref/occ/intfm/UISearchBarDelegate/searchBarCancelButtonClicked:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("searchBarCancelButtonClicked:")
	default void searchBarCancelButtonClicked(UISearchBar searchBar) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * searchBarResultsListButtonClicked:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISearchBarDelegate_Protocol/index.html#//apple_ref/occ/intfm/UISearchBarDelegate/searchBarResultsListButtonClicked:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("searchBarResultsListButtonClicked:")
	default void searchBarResultsListButtonClicked(UISearchBar searchBar) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * searchBarSearchButtonClicked:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISearchBarDelegate_Protocol/index.html#//apple_ref/occ/intfm/UISearchBarDelegate/searchBarSearchButtonClicked:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("searchBarSearchButtonClicked:")
	default void searchBarSearchButtonClicked(UISearchBar searchBar) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * searchBarShouldBeginEditing:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISearchBarDelegate_Protocol/index.html#//apple_ref/occ/intfm/UISearchBarDelegate/searchBarShouldBeginEditing:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("searchBarShouldBeginEditing:")
	default boolean searchBarShouldBeginEditing(UISearchBar searchBar) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * searchBarShouldEndEditing:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISearchBarDelegate_Protocol/index.html#//apple_ref/occ/intfm/UISearchBarDelegate/searchBarShouldEndEditing:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("searchBarShouldEndEditing:")
	default boolean searchBarShouldEndEditing(UISearchBar searchBar) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * searchBarTextDidBeginEditing:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISearchBarDelegate_Protocol/index.html#//apple_ref/occ/intfm/UISearchBarDelegate/searchBarTextDidBeginEditing:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("searchBarTextDidBeginEditing:")
	default void searchBarTextDidBeginEditing(UISearchBar searchBar) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * searchBarTextDidEndEditing:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISearchBarDelegate_Protocol/index.html#//apple_ref/occ/intfm/UISearchBarDelegate/searchBarTextDidEndEditing:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("searchBarTextDidEndEditing:")
	default void searchBarTextDidEndEditing(UISearchBar searchBar) {
		throw new java.lang.UnsupportedOperationException();
	}
}
