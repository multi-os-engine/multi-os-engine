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

/**
 * _______________________________________________________________________________________________________________
 *  this protocol represents the data model object. as such, it supplies no information about appearance (including the cells)
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UITableViewDataSource")
public interface UITableViewDataSource {
    /**
     * Default is 1 if not implemented
     */
    @Generated
    @IsOptional
    @Selector("numberOfSectionsInTableView:")
    @NInt
    default long numberOfSectionsInTableView(UITableView tableView) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * return list of section titles to display in section index view (e.g. "ABCD...Z#")
     */
    @Generated
    @IsOptional
    @Selector("sectionIndexTitlesForTableView:")
    default NSArray<String> sectionIndexTitlesForTableView(UITableView tableView) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Individual rows can opt out of having the -editing property set for them. If not implemented, all rows are assumed to be editable.
     */
    @Generated
    @IsOptional
    @Selector("tableView:canEditRowAtIndexPath:")
    default boolean tableViewCanEditRowAtIndexPath(UITableView tableView, NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Allows the reorder accessory view to optionally be shown for a particular row. By default, the reorder control will be shown only if the datasource implements -tableView:moveRowAtIndexPath:toIndexPath:
     */
    @Generated
    @IsOptional
    @Selector("tableView:canMoveRowAtIndexPath:")
    default boolean tableViewCanMoveRowAtIndexPath(UITableView tableView, NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Row display. Implementers should *always* try to reuse cells by setting each cell's reuseIdentifier and querying for available reusable cells with dequeueReusableCellWithIdentifier:
     * Cell gets various attributes set automatically based on table (separators) and data source (accessory views, editing controls)
     */
    @Generated
    @Selector("tableView:cellForRowAtIndexPath:")
    UITableViewCell tableViewCellForRowAtIndexPath(UITableView tableView, NSIndexPath indexPath);

    /**
     * After a row has the minus or plus button invoked (based on the UITableViewCellEditingStyle for the cell), the dataSource must commit the change
     * Not called for edit actions using UITableViewRowAction - the action's handler will be invoked instead
     */
    @Generated
    @IsOptional
    @Selector("tableView:commitEditingStyle:forRowAtIndexPath:")
    default void tableViewCommitEditingStyleForRowAtIndexPath(UITableView tableView, @NInt long editingStyle,
            NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Data manipulation - reorder / moving support
     */
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

    /**
     * tell table which section corresponds to section title/index (e.g. "B",1))
     */
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

    /**
     * fixed font style. use custom view (UILabel) if you want something different
     */
    @Generated
    @IsOptional
    @Selector("tableView:titleForHeaderInSection:")
    default String tableViewTitleForHeaderInSection(UITableView tableView, @NInt long section) {
        throw new java.lang.UnsupportedOperationException();
    }
}
