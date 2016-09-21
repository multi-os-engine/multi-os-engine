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
import apple.uikit.UITableViewCell;
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
@ObjCProtocolName("UITableViewDataSource")
public interface UITableViewDataSource {
    @Generated
    @IsOptional
    @Selector("numberOfSectionsInTableView:")
    @NInt
    default long numberOfSectionsInTableView(UITableView tableView) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("sectionIndexTitlesForTableView:")
    default NSArray<String> sectionIndexTitlesForTableView(UITableView tableView) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tableView:canEditRowAtIndexPath:")
    default boolean tableViewCanEditRowAtIndexPath(UITableView tableView, NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tableView:canMoveRowAtIndexPath:")
    default boolean tableViewCanMoveRowAtIndexPath(UITableView tableView, NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("tableView:cellForRowAtIndexPath:")
    UITableViewCell tableViewCellForRowAtIndexPath(UITableView tableView, NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("tableView:commitEditingStyle:forRowAtIndexPath:")
    default void tableViewCommitEditingStyleForRowAtIndexPath(UITableView tableView, @NInt long editingStyle,
            NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tableView:moveRowAtIndexPath:toIndexPath:")
    default void tableViewMoveRowAtIndexPathToIndexPath(UITableView tableView, NSIndexPath sourceIndexPath,
            NSIndexPath destinationIndexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("tableView:numberOfRowsInSection:")
    @NInt
    long tableViewNumberOfRowsInSection(UITableView tableView, @NInt long section);

    @Generated
    @IsOptional
    @Selector("tableView:sectionForSectionIndexTitle:atIndex:")
    @NInt
    default long tableViewSectionForSectionIndexTitleAtIndex(UITableView tableView, String title, @NInt long index) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tableView:titleForFooterInSection:")
    default String tableViewTitleForFooterInSection(UITableView tableView, @NInt long section) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tableView:titleForHeaderInSection:")
    default String tableViewTitleForHeaderInSection(UITableView tableView, @NInt long section) {
        throw new java.lang.UnsupportedOperationException();
    }
}
