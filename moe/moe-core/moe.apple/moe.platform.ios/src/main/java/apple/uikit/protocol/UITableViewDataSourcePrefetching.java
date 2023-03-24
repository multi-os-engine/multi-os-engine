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
import apple.uikit.UITableView;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;

/**
 * _______________________________________________________________________________________________________________
 * this protocol can provide information about cells before they are displayed on screen.
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UITableViewDataSourcePrefetching")
public interface UITableViewDataSourcePrefetching {
    /**
     * indexPaths that previously were considered as candidates for pre-fetching, but were not actually used; may be a
     * subset of the previous call to -tableView:prefetchRowsAtIndexPaths:
     */
    @Generated
    @IsOptional
    @Selector("tableView:cancelPrefetchingForRowsAtIndexPaths:")
    default void tableViewCancelPrefetchingForRowsAtIndexPaths(@NotNull UITableView tableView,
            @NotNull NSArray<? extends NSIndexPath> indexPaths) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * indexPaths are ordered ascending by geometric distance from the table view
     */
    @Generated
    @Selector("tableView:prefetchRowsAtIndexPaths:")
    void tableViewPrefetchRowsAtIndexPaths(@NotNull UITableView tableView,
            @NotNull NSArray<? extends NSIndexPath> indexPaths);
}
