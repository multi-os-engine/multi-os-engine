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

import apple.foundation.struct.NSRange;
import apple.uikit.UISearchBar;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UISearchBarDelegate")
public interface UISearchBarDelegate extends UIBarPositioningDelegate {
    /**
     * API-Since: 3.0
     */
    @Generated
    @IsOptional
    @Selector("searchBar:selectedScopeButtonIndexDidChange:")
    default void searchBarSelectedScopeButtonIndexDidChange(UISearchBar searchBar, @NInt long selectedScope) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * called before text changes
     * 
     * API-Since: 3.0
     */
    @Generated
    @IsOptional
    @Selector("searchBar:shouldChangeTextInRange:replacementText:")
    default boolean searchBarShouldChangeTextInRangeReplacementText(UISearchBar searchBar, @ByValue NSRange range,
            String text) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * called when text changes (including clear)
     */
    @Generated
    @IsOptional
    @Selector("searchBar:textDidChange:")
    default void searchBarTextDidChange(UISearchBar searchBar, String searchText) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * called when bookmark button pressed
     */
    @Generated
    @IsOptional
    @Selector("searchBarBookmarkButtonClicked:")
    default void searchBarBookmarkButtonClicked(UISearchBar searchBar) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * called when cancel button pressed
     */
    @Generated
    @IsOptional
    @Selector("searchBarCancelButtonClicked:")
    default void searchBarCancelButtonClicked(UISearchBar searchBar) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * called when search results button pressed
     * 
     * API-Since: 3.2
     */
    @Generated
    @IsOptional
    @Selector("searchBarResultsListButtonClicked:")
    default void searchBarResultsListButtonClicked(UISearchBar searchBar) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * called when keyboard search button pressed
     */
    @Generated
    @IsOptional
    @Selector("searchBarSearchButtonClicked:")
    default void searchBarSearchButtonClicked(UISearchBar searchBar) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * return NO to not become first responder
     */
    @Generated
    @IsOptional
    @Selector("searchBarShouldBeginEditing:")
    default boolean searchBarShouldBeginEditing(UISearchBar searchBar) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * return NO to not resign first responder
     */
    @Generated
    @IsOptional
    @Selector("searchBarShouldEndEditing:")
    default boolean searchBarShouldEndEditing(UISearchBar searchBar) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * called when text starts editing
     */
    @Generated
    @IsOptional
    @Selector("searchBarTextDidBeginEditing:")
    default void searchBarTextDidBeginEditing(UISearchBar searchBar) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * called when text ends editing
     */
    @Generated
    @IsOptional
    @Selector("searchBarTextDidEndEditing:")
    default void searchBarTextDidEndEditing(UISearchBar searchBar) {
        throw new java.lang.UnsupportedOperationException();
    }
}
