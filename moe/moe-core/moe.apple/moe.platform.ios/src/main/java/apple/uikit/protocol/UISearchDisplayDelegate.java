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

import apple.uikit.UISearchDisplayController;
import apple.uikit.UITableView;
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
@ObjCProtocolName("UISearchDisplayDelegate")
public interface UISearchDisplayDelegate {
    /**
     * searchDisplayController:didHideSearchResultsTableView:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISearchDisplayDelegate_Protocol/index.html#//apple_ref/occ/intfm/UISearchDisplayDelegate/searchDisplayController:didHideSearchResultsTableView:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("searchDisplayController:didHideSearchResultsTableView:")
    default void searchDisplayControllerDidHideSearchResultsTableView(UISearchDisplayController controller,
            UITableView tableView) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * searchDisplayController:didLoadSearchResultsTableView:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISearchDisplayDelegate_Protocol/index.html#//apple_ref/occ/intfm/UISearchDisplayDelegate/searchDisplayController:didLoadSearchResultsTableView:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("searchDisplayController:didLoadSearchResultsTableView:")
    default void searchDisplayControllerDidLoadSearchResultsTableView(UISearchDisplayController controller,
            UITableView tableView) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * searchDisplayController:didShowSearchResultsTableView:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISearchDisplayDelegate_Protocol/index.html#//apple_ref/occ/intfm/UISearchDisplayDelegate/searchDisplayController:didShowSearchResultsTableView:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("searchDisplayController:didShowSearchResultsTableView:")
    default void searchDisplayControllerDidShowSearchResultsTableView(UISearchDisplayController controller,
            UITableView tableView) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * searchDisplayController:shouldReloadTableForSearchScope:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISearchDisplayDelegate_Protocol/index.html#//apple_ref/occ/intfm/UISearchDisplayDelegate/searchDisplayController:shouldReloadTableForSearchScope:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("searchDisplayController:shouldReloadTableForSearchScope:")
    default boolean searchDisplayControllerShouldReloadTableForSearchScope(UISearchDisplayController controller,
            @NInt long searchOption) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * searchDisplayController:shouldReloadTableForSearchString:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISearchDisplayDelegate_Protocol/index.html#//apple_ref/occ/intfm/UISearchDisplayDelegate/searchDisplayController:shouldReloadTableForSearchString:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("searchDisplayController:shouldReloadTableForSearchString:")
    default boolean searchDisplayControllerShouldReloadTableForSearchString(UISearchDisplayController controller,
            String searchString) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * searchDisplayController:willHideSearchResultsTableView:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISearchDisplayDelegate_Protocol/index.html#//apple_ref/occ/intfm/UISearchDisplayDelegate/searchDisplayController:willHideSearchResultsTableView:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("searchDisplayController:willHideSearchResultsTableView:")
    default void searchDisplayControllerWillHideSearchResultsTableView(UISearchDisplayController controller,
            UITableView tableView) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * searchDisplayController:willShowSearchResultsTableView:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISearchDisplayDelegate_Protocol/index.html#//apple_ref/occ/intfm/UISearchDisplayDelegate/searchDisplayController:willShowSearchResultsTableView:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("searchDisplayController:willShowSearchResultsTableView:")
    default void searchDisplayControllerWillShowSearchResultsTableView(UISearchDisplayController controller,
            UITableView tableView) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * searchDisplayController:willUnloadSearchResultsTableView:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISearchDisplayDelegate_Protocol/index.html#//apple_ref/occ/intfm/UISearchDisplayDelegate/searchDisplayController:willUnloadSearchResultsTableView:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("searchDisplayController:willUnloadSearchResultsTableView:")
    default void searchDisplayControllerWillUnloadSearchResultsTableView(UISearchDisplayController controller,
            UITableView tableView) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * searchDisplayControllerDidBeginSearch:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISearchDisplayDelegate_Protocol/index.html#//apple_ref/occ/intfm/UISearchDisplayDelegate/searchDisplayControllerDidBeginSearch:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("searchDisplayControllerDidBeginSearch:")
    default void searchDisplayControllerDidBeginSearch(UISearchDisplayController controller) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * searchDisplayControllerDidEndSearch:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISearchDisplayDelegate_Protocol/index.html#//apple_ref/occ/intfm/UISearchDisplayDelegate/searchDisplayControllerDidEndSearch:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("searchDisplayControllerDidEndSearch:")
    default void searchDisplayControllerDidEndSearch(UISearchDisplayController controller) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * searchDisplayControllerWillBeginSearch:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISearchDisplayDelegate_Protocol/index.html#//apple_ref/occ/intfm/UISearchDisplayDelegate/searchDisplayControllerWillBeginSearch:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("searchDisplayControllerWillBeginSearch:")
    default void searchDisplayControllerWillBeginSearch(UISearchDisplayController controller) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * searchDisplayControllerWillEndSearch:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISearchDisplayDelegate_Protocol/index.html#//apple_ref/occ/intfm/UISearchDisplayDelegate/searchDisplayControllerWillEndSearch:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("searchDisplayControllerWillEndSearch:")
    default void searchDisplayControllerWillEndSearch(UISearchDisplayController controller) {
        throw new java.lang.UnsupportedOperationException();
    }
}
