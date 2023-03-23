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
     * API-Since: 3.0
     * Deprecated-Since: 8.0
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
     * called when the table is created destroyed, shown or hidden. configure as necessary.
     * 
     * API-Since: 3.0
     * Deprecated-Since: 8.0
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
     * API-Since: 3.0
     * Deprecated-Since: 8.0
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
     * API-Since: 3.0
     * Deprecated-Since: 8.0
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
     * return YES to reload table. called when search string/option changes. convenience methods on top UISearchBar
     * delegate methods
     * 
     * API-Since: 3.0
     * Deprecated-Since: 8.0
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
     * API-Since: 3.0
     * Deprecated-Since: 8.0
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
     * called when table is shown/hidden
     * 
     * API-Since: 3.0
     * Deprecated-Since: 8.0
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
     * API-Since: 3.0
     * Deprecated-Since: 8.0
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
     * API-Since: 3.0
     * Deprecated-Since: 8.0
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("searchDisplayControllerDidBeginSearch:")
    default void searchDisplayControllerDidBeginSearch(UISearchDisplayController controller) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 3.0
     * Deprecated-Since: 8.0
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("searchDisplayControllerDidEndSearch:")
    default void searchDisplayControllerDidEndSearch(UISearchDisplayController controller) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * when we start/end showing the search UI
     * 
     * API-Since: 3.0
     * Deprecated-Since: 8.0
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("searchDisplayControllerWillBeginSearch:")
    default void searchDisplayControllerWillBeginSearch(UISearchDisplayController controller) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 3.0
     * Deprecated-Since: 8.0
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("searchDisplayControllerWillEndSearch:")
    default void searchDisplayControllerWillEndSearch(UISearchDisplayController controller) {
        throw new java.lang.UnsupportedOperationException();
    }
}
