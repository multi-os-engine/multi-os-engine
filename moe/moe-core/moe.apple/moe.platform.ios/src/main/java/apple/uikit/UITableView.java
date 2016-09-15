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

package apple.uikit;

import apple.NSObject;
import apple.coregraphics.struct.CGPoint;
import apple.coregraphics.struct.CGRect;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDate;
import apple.foundation.NSIndexPath;
import apple.foundation.NSIndexSet;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCoding;
import apple.uikit.protocol.UITableViewDataSource;
import apple.uikit.struct.UIEdgeInsets;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Variadic;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UITableView extends UIScrollView implements NSCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected UITableView(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native UITableView alloc();

    /**
     * allowsMultipleSelection</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instp/UITableView/allowsMultipleSelection">iOS Dev Center</a>
     */
    @Generated
    @Selector("allowsMultipleSelection")
    public native boolean allowsMultipleSelection();

    /**
     * allowsMultipleSelectionDuringEditing</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instp/UITableView/allowsMultipleSelectionDuringEditing">iOS Dev Center</a>
     */
    @Generated
    @Selector("allowsMultipleSelectionDuringEditing")
    public native boolean allowsMultipleSelectionDuringEditing();

    /**
     * allowsSelection</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instp/UITableView/allowsSelection">iOS Dev Center</a>
     */
    @Generated
    @Selector("allowsSelection")
    public native boolean allowsSelection();

    /**
     * allowsSelectionDuringEditing</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instp/UITableView/allowsSelectionDuringEditing">iOS Dev Center</a>
     */
    @Generated
    @Selector("allowsSelectionDuringEditing")
    public native boolean allowsSelectionDuringEditing();

    /**
     * backgroundView</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instp/UITableView/backgroundView">iOS Dev Center</a>
     */
    @Generated
    @Selector("backgroundView")
    public native UIView backgroundView();

    /**
     * beginUpdates</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instm/UITableView/beginUpdates">iOS Dev Center</a>
     */
    @Generated
    @Selector("beginUpdates")
    public native void beginUpdates();

    /**
     * cellForRowAtIndexPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instm/UITableView/cellForRowAtIndexPath:">iOS Dev Center</a>
     */
    @Generated
    @Selector("cellForRowAtIndexPath:")
    public native UITableViewCell cellForRowAtIndexPath(NSIndexPath indexPath);

    /**
     * dataSource</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instp/UITableView/dataSource">iOS Dev Center</a>
     */
    @Generated
    @Selector("dataSource")
    @MappedReturn(ObjCObjectMapper.class)
    public native UITableViewDataSource dataSource();

    /**
     * delegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instp/UITableView/delegate">iOS Dev Center</a>
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object delegate();

    /**
     * deleteRowsAtIndexPaths:withRowAnimation:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instm/UITableView/deleteRowsAtIndexPaths:withRowAnimation:">iOS Dev Center</a>
     */
    @Generated
    @Selector("deleteRowsAtIndexPaths:withRowAnimation:")
    public native void deleteRowsAtIndexPathsWithRowAnimation(NSArray<? extends NSIndexPath> indexPaths,
            @NInt long animation);

    /**
     * deleteSections:withRowAnimation:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instm/UITableView/deleteSections:withRowAnimation:">iOS Dev Center</a>
     */
    @Generated
    @Selector("deleteSections:withRowAnimation:")
    public native void deleteSectionsWithRowAnimation(NSIndexSet sections, @NInt long animation);

    /**
     * dequeueReusableCellWithIdentifier:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instm/UITableView/dequeueReusableCellWithIdentifier:">iOS Dev Center</a>
     */
    @Generated
    @Selector("dequeueReusableCellWithIdentifier:")
    public native UITableViewCell dequeueReusableCellWithIdentifier(String identifier);

    /**
     * dequeueReusableCellWithIdentifier:forIndexPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instm/UITableView/dequeueReusableCellWithIdentifier:forIndexPath:">iOS Dev Center</a>
     */
    @Generated
    @Selector("dequeueReusableCellWithIdentifier:forIndexPath:")
    public native UITableViewCell dequeueReusableCellWithIdentifierForIndexPath(String identifier,
            NSIndexPath indexPath);

    /**
     * dequeueReusableHeaderFooterViewWithIdentifier:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instm/UITableView/dequeueReusableHeaderFooterViewWithIdentifier:">iOS Dev Center</a>
     */
    @Generated
    @Selector("dequeueReusableHeaderFooterViewWithIdentifier:")
    public native UITableViewHeaderFooterView dequeueReusableHeaderFooterViewWithIdentifier(String identifier);

    /**
     * deselectRowAtIndexPath:animated:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instm/UITableView/deselectRowAtIndexPath:animated:">iOS Dev Center</a>
     */
    @Generated
    @Selector("deselectRowAtIndexPath:animated:")
    public native void deselectRowAtIndexPathAnimated(NSIndexPath indexPath, boolean animated);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    /**
     * endUpdates</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instm/UITableView/endUpdates">iOS Dev Center</a>
     */
    @Generated
    @Selector("endUpdates")
    public native void endUpdates();

    /**
     * estimatedRowHeight</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instp/UITableView/estimatedRowHeight">iOS Dev Center</a>
     */
    @Generated
    @Selector("estimatedRowHeight")
    @NFloat
    public native double estimatedRowHeight();

    /**
     * estimatedSectionFooterHeight</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instp/UITableView/estimatedSectionFooterHeight">iOS Dev Center</a>
     */
    @Generated
    @Selector("estimatedSectionFooterHeight")
    @NFloat
    public native double estimatedSectionFooterHeight();

    /**
     * estimatedSectionHeaderHeight</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instp/UITableView/estimatedSectionHeaderHeight">iOS Dev Center</a>
     */
    @Generated
    @Selector("estimatedSectionHeaderHeight")
    @NFloat
    public native double estimatedSectionHeaderHeight();

    /**
     * footerViewForSection:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instm/UITableView/footerViewForSection:">iOS Dev Center</a>
     */
    @Generated
    @Selector("footerViewForSection:")
    public native UITableViewHeaderFooterView footerViewForSection(@NInt long section);

    /**
     * headerViewForSection:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instm/UITableView/headerViewForSection:">iOS Dev Center</a>
     */
    @Generated
    @Selector("headerViewForSection:")
    public native UITableViewHeaderFooterView headerViewForSection(@NInt long section);

    /**
     * indexPathForCell:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instm/UITableView/indexPathForCell:">iOS Dev Center</a>
     */
    @Generated
    @Selector("indexPathForCell:")
    public native NSIndexPath indexPathForCell(UITableViewCell cell);

    /**
     * indexPathForRowAtPoint:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instm/UITableView/indexPathForRowAtPoint:">iOS Dev Center</a>
     */
    @Generated
    @Selector("indexPathForRowAtPoint:")
    public native NSIndexPath indexPathForRowAtPoint(@ByValue CGPoint point);

    /**
     * indexPathForSelectedRow</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instp/UITableView/indexPathForSelectedRow">iOS Dev Center</a>
     */
    @Generated
    @Selector("indexPathForSelectedRow")
    public native NSIndexPath indexPathForSelectedRow();

    /**
     * indexPathsForRowsInRect:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instm/UITableView/indexPathsForRowsInRect:">iOS Dev Center</a>
     */
    @Generated
    @Selector("indexPathsForRowsInRect:")
    public native NSArray<? extends NSIndexPath> indexPathsForRowsInRect(@ByValue CGRect rect);

    /**
     * indexPathsForSelectedRows</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instp/UITableView/indexPathsForSelectedRows">iOS Dev Center</a>
     */
    @Generated
    @Selector("indexPathsForSelectedRows")
    public native NSArray<? extends NSIndexPath> indexPathsForSelectedRows();

    /**
     * indexPathsForVisibleRows</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instp/UITableView/indexPathsForVisibleRows">iOS Dev Center</a>
     */
    @Generated
    @Selector("indexPathsForVisibleRows")
    public native NSArray<? extends NSIndexPath> indexPathsForVisibleRows();

    @Generated
    @Selector("init")
    public native UITableView init();

    @Generated
    @Selector("initWithCoder:")
    public native UITableView initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("initWithFrame:")
    public native UITableView initWithFrame(@ByValue CGRect frame);

    /**
     * initWithFrame:style:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instm/UITableView/initWithFrame:style:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithFrame:style:")
    public native UITableView initWithFrameStyle(@ByValue CGRect frame, @NInt long style);

    /**
     * insertRowsAtIndexPaths:withRowAnimation:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instm/UITableView/insertRowsAtIndexPaths:withRowAnimation:">iOS Dev Center</a>
     */
    @Generated
    @Selector("insertRowsAtIndexPaths:withRowAnimation:")
    public native void insertRowsAtIndexPathsWithRowAnimation(NSArray<? extends NSIndexPath> indexPaths,
            @NInt long animation);

    /**
     * insertSections:withRowAnimation:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instm/UITableView/insertSections:withRowAnimation:">iOS Dev Center</a>
     */
    @Generated
    @Selector("insertSections:withRowAnimation:")
    public native void insertSectionsWithRowAnimation(NSIndexSet sections, @NInt long animation);

    /**
     * editing</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instp/UITableView/editing">iOS Dev Center</a>
     */
    @Generated
    @Selector("isEditing")
    public native boolean isEditing();

    /**
     * moveRowAtIndexPath:toIndexPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instm/UITableView/moveRowAtIndexPath:toIndexPath:">iOS Dev Center</a>
     */
    @Generated
    @Selector("moveRowAtIndexPath:toIndexPath:")
    public native void moveRowAtIndexPathToIndexPath(NSIndexPath indexPath, NSIndexPath newIndexPath);

    /**
     * moveSection:toSection:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instm/UITableView/moveSection:toSection:">iOS Dev Center</a>
     */
    @Generated
    @Selector("moveSection:toSection:")
    public native void moveSectionToSection(@NInt long section, @NInt long newSection);

    /**
     * numberOfRowsInSection:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instm/UITableView/numberOfRowsInSection:">iOS Dev Center</a>
     */
    @Generated
    @Selector("numberOfRowsInSection:")
    @NInt
    public native long numberOfRowsInSection(@NInt long section);

    /**
     * numberOfSections</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instp/UITableView/numberOfSections">iOS Dev Center</a>
     */
    @Generated
    @Selector("numberOfSections")
    @NInt
    public native long numberOfSections();

    /**
     * rectForFooterInSection:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instm/UITableView/rectForFooterInSection:">iOS Dev Center</a>
     */
    @Generated
    @Selector("rectForFooterInSection:")
    @ByValue
    public native CGRect rectForFooterInSection(@NInt long section);

    /**
     * rectForHeaderInSection:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instm/UITableView/rectForHeaderInSection:">iOS Dev Center</a>
     */
    @Generated
    @Selector("rectForHeaderInSection:")
    @ByValue
    public native CGRect rectForHeaderInSection(@NInt long section);

    /**
     * rectForRowAtIndexPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instm/UITableView/rectForRowAtIndexPath:">iOS Dev Center</a>
     */
    @Generated
    @Selector("rectForRowAtIndexPath:")
    @ByValue
    public native CGRect rectForRowAtIndexPath(NSIndexPath indexPath);

    /**
     * rectForSection:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instm/UITableView/rectForSection:">iOS Dev Center</a>
     */
    @Generated
    @Selector("rectForSection:")
    @ByValue
    public native CGRect rectForSection(@NInt long section);

    /**
     * registerClass:forCellReuseIdentifier:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instm/UITableView/registerClass:forCellReuseIdentifier:">iOS Dev Center</a>
     */
    @Generated
    @Selector("registerClass:forCellReuseIdentifier:")
    public native void registerClassForCellReuseIdentifier(Class cellClass, String identifier);

    /**
     * registerClass:forHeaderFooterViewReuseIdentifier:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instm/UITableView/registerClass:forHeaderFooterViewReuseIdentifier:">iOS Dev Center</a>
     */
    @Generated
    @Selector("registerClass:forHeaderFooterViewReuseIdentifier:")
    public native void registerClassForHeaderFooterViewReuseIdentifier(Class aClass, String identifier);

    /**
     * registerNib:forCellReuseIdentifier:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instm/UITableView/registerNib:forCellReuseIdentifier:">iOS Dev Center</a>
     */
    @Generated
    @Selector("registerNib:forCellReuseIdentifier:")
    public native void registerNibForCellReuseIdentifier(UINib nib, String identifier);

    /**
     * registerNib:forHeaderFooterViewReuseIdentifier:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instm/UITableView/registerNib:forHeaderFooterViewReuseIdentifier:">iOS Dev Center</a>
     */
    @Generated
    @Selector("registerNib:forHeaderFooterViewReuseIdentifier:")
    public native void registerNibForHeaderFooterViewReuseIdentifier(UINib nib, String identifier);

    /**
     * reloadData</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instm/UITableView/reloadData">iOS Dev Center</a>
     */
    @Generated
    @Selector("reloadData")
    public native void reloadData();

    /**
     * reloadRowsAtIndexPaths:withRowAnimation:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instm/UITableView/reloadRowsAtIndexPaths:withRowAnimation:">iOS Dev Center</a>
     */
    @Generated
    @Selector("reloadRowsAtIndexPaths:withRowAnimation:")
    public native void reloadRowsAtIndexPathsWithRowAnimation(NSArray<? extends NSIndexPath> indexPaths,
            @NInt long animation);

    /**
     * reloadSectionIndexTitles</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instm/UITableView/reloadSectionIndexTitles">iOS Dev Center</a>
     */
    @Generated
    @Selector("reloadSectionIndexTitles")
    public native void reloadSectionIndexTitles();

    /**
     * reloadSections:withRowAnimation:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instm/UITableView/reloadSections:withRowAnimation:">iOS Dev Center</a>
     */
    @Generated
    @Selector("reloadSections:withRowAnimation:")
    public native void reloadSectionsWithRowAnimation(NSIndexSet sections, @NInt long animation);

    /**
     * rowHeight</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instp/UITableView/rowHeight">iOS Dev Center</a>
     */
    @Generated
    @Selector("rowHeight")
    @NFloat
    public native double rowHeight();

    /**
     * scrollToNearestSelectedRowAtScrollPosition:animated:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instm/UITableView/scrollToNearestSelectedRowAtScrollPosition:animated:">iOS Dev Center</a>
     */
    @Generated
    @Selector("scrollToNearestSelectedRowAtScrollPosition:animated:")
    public native void scrollToNearestSelectedRowAtScrollPositionAnimated(@NInt long scrollPosition, boolean animated);

    /**
     * scrollToRowAtIndexPath:atScrollPosition:animated:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instm/UITableView/scrollToRowAtIndexPath:atScrollPosition:animated:">iOS Dev Center</a>
     */
    @Generated
    @Selector("scrollToRowAtIndexPath:atScrollPosition:animated:")
    public native void scrollToRowAtIndexPathAtScrollPositionAnimated(NSIndexPath indexPath, @NInt long scrollPosition,
            boolean animated);

    /**
     * sectionFooterHeight</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instp/UITableView/sectionFooterHeight">iOS Dev Center</a>
     */
    @Generated
    @Selector("sectionFooterHeight")
    @NFloat
    public native double sectionFooterHeight();

    /**
     * sectionHeaderHeight</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instp/UITableView/sectionHeaderHeight">iOS Dev Center</a>
     */
    @Generated
    @Selector("sectionHeaderHeight")
    @NFloat
    public native double sectionHeaderHeight();

    /**
     * sectionIndexBackgroundColor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instp/UITableView/sectionIndexBackgroundColor">iOS Dev Center</a>
     */
    @Generated
    @Selector("sectionIndexBackgroundColor")
    public native UIColor sectionIndexBackgroundColor();

    /**
     * sectionIndexColor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instp/UITableView/sectionIndexColor">iOS Dev Center</a>
     */
    @Generated
    @Selector("sectionIndexColor")
    public native UIColor sectionIndexColor();

    /**
     * sectionIndexMinimumDisplayRowCount</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instp/UITableView/sectionIndexMinimumDisplayRowCount">iOS Dev Center</a>
     */
    @Generated
    @Selector("sectionIndexMinimumDisplayRowCount")
    @NInt
    public native long sectionIndexMinimumDisplayRowCount();

    /**
     * sectionIndexTrackingBackgroundColor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instp/UITableView/sectionIndexTrackingBackgroundColor">iOS Dev Center</a>
     */
    @Generated
    @Selector("sectionIndexTrackingBackgroundColor")
    public native UIColor sectionIndexTrackingBackgroundColor();

    /**
     * selectRowAtIndexPath:animated:scrollPosition:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instm/UITableView/selectRowAtIndexPath:animated:scrollPosition:">iOS Dev Center</a>
     */
    @Generated
    @Selector("selectRowAtIndexPath:animated:scrollPosition:")
    public native void selectRowAtIndexPathAnimatedScrollPosition(NSIndexPath indexPath, boolean animated,
            @NInt long scrollPosition);

    /**
     * separatorColor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instp/UITableView/separatorColor">iOS Dev Center</a>
     */
    @Generated
    @Selector("separatorColor")
    public native UIColor separatorColor();

    /**
     * separatorEffect</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instp/UITableView/separatorEffect">iOS Dev Center</a>
     */
    @Generated
    @Selector("separatorEffect")
    public native UIVisualEffect separatorEffect();

    /**
     * separatorInset</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instp/UITableView/separatorInset">iOS Dev Center</a>
     */
    @Generated
    @Selector("separatorInset")
    @ByValue
    public native UIEdgeInsets separatorInset();

    /**
     * separatorStyle</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instp/UITableView/separatorStyle">iOS Dev Center</a>
     */
    @Generated
    @Selector("separatorStyle")
    @NInt
    public native long separatorStyle();

    /**
     * allowsMultipleSelection</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instp/UITableView/allowsMultipleSelection">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAllowsMultipleSelection:")
    public native void setAllowsMultipleSelection(boolean value);

    /**
     * allowsMultipleSelectionDuringEditing</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instp/UITableView/allowsMultipleSelectionDuringEditing">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAllowsMultipleSelectionDuringEditing:")
    public native void setAllowsMultipleSelectionDuringEditing(boolean value);

    /**
     * allowsSelection</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instp/UITableView/allowsSelection">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAllowsSelection:")
    public native void setAllowsSelection(boolean value);

    /**
     * allowsSelectionDuringEditing</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instp/UITableView/allowsSelectionDuringEditing">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAllowsSelectionDuringEditing:")
    public native void setAllowsSelectionDuringEditing(boolean value);

    /**
     * backgroundView</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instp/UITableView/backgroundView">iOS Dev Center</a>
     */
    @Generated
    @Selector("setBackgroundView:")
    public native void setBackgroundView(UIView value);

    /**
     * dataSource</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instp/UITableView/dataSource">iOS Dev Center</a>
     */
    @Generated
    @Selector("setDataSource:")
    public native void setDataSource_unsafe(@Mapped(ObjCObjectMapper.class) UITableViewDataSource value);

    /**
     * dataSource</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instp/UITableView/dataSource">iOS Dev Center</a>
     */
    @Generated
    public void setDataSource(@Mapped(ObjCObjectMapper.class) UITableViewDataSource value) {
        Object __old = dataSource();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDataSource_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * delegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instp/UITableView/delegate">iOS Dev Center</a>
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) Object value);

    /**
     * delegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instp/UITableView/delegate">iOS Dev Center</a>
     */
    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) Object value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * editing</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instp/UITableView/editing">iOS Dev Center</a>
     */
    @Generated
    @Selector("setEditing:")
    public native void setEditing(boolean value);

    /**
     * setEditing:animated:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instm/UITableView/setEditing:animated:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setEditing:animated:")
    public native void setEditingAnimated(boolean editing, boolean animated);

    /**
     * estimatedRowHeight</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instp/UITableView/estimatedRowHeight">iOS Dev Center</a>
     */
    @Generated
    @Selector("setEstimatedRowHeight:")
    public native void setEstimatedRowHeight(@NFloat double value);

    /**
     * estimatedSectionFooterHeight</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instp/UITableView/estimatedSectionFooterHeight">iOS Dev Center</a>
     */
    @Generated
    @Selector("setEstimatedSectionFooterHeight:")
    public native void setEstimatedSectionFooterHeight(@NFloat double value);

    /**
     * estimatedSectionHeaderHeight</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instp/UITableView/estimatedSectionHeaderHeight">iOS Dev Center</a>
     */
    @Generated
    @Selector("setEstimatedSectionHeaderHeight:")
    public native void setEstimatedSectionHeaderHeight(@NFloat double value);

    /**
     * rowHeight</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instp/UITableView/rowHeight">iOS Dev Center</a>
     */
    @Generated
    @Selector("setRowHeight:")
    public native void setRowHeight(@NFloat double value);

    /**
     * sectionFooterHeight</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instp/UITableView/sectionFooterHeight">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSectionFooterHeight:")
    public native void setSectionFooterHeight(@NFloat double value);

    /**
     * sectionHeaderHeight</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instp/UITableView/sectionHeaderHeight">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSectionHeaderHeight:")
    public native void setSectionHeaderHeight(@NFloat double value);

    /**
     * sectionIndexBackgroundColor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instp/UITableView/sectionIndexBackgroundColor">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSectionIndexBackgroundColor:")
    public native void setSectionIndexBackgroundColor(UIColor value);

    /**
     * sectionIndexColor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instp/UITableView/sectionIndexColor">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSectionIndexColor:")
    public native void setSectionIndexColor(UIColor value);

    /**
     * sectionIndexMinimumDisplayRowCount</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instp/UITableView/sectionIndexMinimumDisplayRowCount">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSectionIndexMinimumDisplayRowCount:")
    public native void setSectionIndexMinimumDisplayRowCount(@NInt long value);

    /**
     * sectionIndexTrackingBackgroundColor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instp/UITableView/sectionIndexTrackingBackgroundColor">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSectionIndexTrackingBackgroundColor:")
    public native void setSectionIndexTrackingBackgroundColor(UIColor value);

    /**
     * separatorColor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instp/UITableView/separatorColor">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSeparatorColor:")
    public native void setSeparatorColor(UIColor value);

    /**
     * separatorEffect</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instp/UITableView/separatorEffect">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSeparatorEffect:")
    public native void setSeparatorEffect(UIVisualEffect value);

    /**
     * separatorInset</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instp/UITableView/separatorInset">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSeparatorInset:")
    public native void setSeparatorInset(@ByValue UIEdgeInsets value);

    /**
     * separatorStyle</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instp/UITableView/separatorStyle">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSeparatorStyle:")
    public native void setSeparatorStyle(@NInt long value);

    /**
     * tableFooterView</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instp/UITableView/tableFooterView">iOS Dev Center</a>
     */
    @Generated
    @Selector("setTableFooterView:")
    public native void setTableFooterView(UIView value);

    /**
     * tableHeaderView</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instp/UITableView/tableHeaderView">iOS Dev Center</a>
     */
    @Generated
    @Selector("setTableHeaderView:")
    public native void setTableHeaderView(UIView value);

    /**
     * style</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instp/UITableView/style">iOS Dev Center</a>
     */
    @Generated
    @Selector("style")
    @NInt
    public native long style();

    /**
     * tableFooterView</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instp/UITableView/tableFooterView">iOS Dev Center</a>
     */
    @Generated
    @Selector("tableFooterView")
    public native UIView tableFooterView();

    /**
     * tableHeaderView</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instp/UITableView/tableHeaderView">iOS Dev Center</a>
     */
    @Generated
    @Selector("tableHeaderView")
    public native UIView tableHeaderView();

    /**
     * visibleCells</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instp/UITableView/visibleCells">iOS Dev Center</a>
     */
    @Generated
    @Selector("visibleCells")
    public native NSArray<? extends UITableViewCell> visibleCells();

    /**
     * cellLayoutMarginsFollowReadableWidth</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instp/UITableView/cellLayoutMarginsFollowReadableWidth">iOS Dev Center</a>
     */
    @Generated
    @Selector("cellLayoutMarginsFollowReadableWidth")
    public native boolean cellLayoutMarginsFollowReadableWidth();

    /**
     * cellLayoutMarginsFollowReadableWidth</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instp/UITableView/cellLayoutMarginsFollowReadableWidth">iOS Dev Center</a>
     */
    @Generated
    @Selector("setCellLayoutMarginsFollowReadableWidth:")
    public native void setCellLayoutMarginsFollowReadableWidth(boolean value);

    /**
     * remembersLastFocusedIndexPath</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instp/UITableView/remembersLastFocusedIndexPath">iOS Dev Center</a>
     */
    @Generated
    @Selector("remembersLastFocusedIndexPath")
    public native boolean remembersLastFocusedIndexPath();

    /**
     * remembersLastFocusedIndexPath</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITableView_Class/index.html#//apple_ref/occ/instp/UITableView/remembersLastFocusedIndexPath">iOS Dev Center</a>
     */
    @Generated
    @Selector("setRemembersLastFocusedIndexPath:")
    public native void setRemembersLastFocusedIndexPath(boolean value);

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Selector("addKeyframeWithRelativeStartTime:relativeDuration:animations:")
    public static native void addKeyframeWithRelativeStartTimeRelativeDurationAnimations(double frameStartTime,
            double frameDuration,
            @ObjCBlock(name = "call_addKeyframeWithRelativeStartTimeRelativeDurationAnimations") UIView.Block_addKeyframeWithRelativeStartTimeRelativeDurationAnimations animations);

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("animateKeyframesWithDuration:delay:options:animations:completion:")
    public static native void animateKeyframesWithDurationDelayOptionsAnimationsCompletion(double duration,
            double delay, @NUInt long options,
            @ObjCBlock(name = "call_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_3") UIView.Block_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_3 animations,
            @ObjCBlock(name = "call_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_4") UIView.Block_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_4 completion);

    @Generated
    @Selector("animateWithDuration:animations:")
    public static native void animateWithDurationAnimations(double duration,
            @ObjCBlock(name = "call_animateWithDurationAnimations") UIView.Block_animateWithDurationAnimations animations);

    @Generated
    @Selector("animateWithDuration:animations:completion:")
    public static native void animateWithDurationAnimationsCompletion(double duration,
            @ObjCBlock(name = "call_animateWithDurationAnimationsCompletion_1") UIView.Block_animateWithDurationAnimationsCompletion_1 animations,
            @ObjCBlock(name = "call_animateWithDurationAnimationsCompletion_2") UIView.Block_animateWithDurationAnimationsCompletion_2 completion);

    @Generated
    @Selector("animateWithDuration:delay:options:animations:completion:")
    public static native void animateWithDurationDelayOptionsAnimationsCompletion(double duration, double delay,
            @NUInt long options,
            @ObjCBlock(name = "call_animateWithDurationDelayOptionsAnimationsCompletion_3") UIView.Block_animateWithDurationDelayOptionsAnimationsCompletion_3 animations,
            @ObjCBlock(name = "call_animateWithDurationDelayOptionsAnimationsCompletion_4") UIView.Block_animateWithDurationDelayOptionsAnimationsCompletion_4 completion);

    @Generated
    @Selector("animateWithDuration:delay:usingSpringWithDamping:initialSpringVelocity:options:animations:completion:")
    public static native void animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion(
            double duration, double delay, @NFloat double dampingRatio, @NFloat double velocity, @NUInt long options,
            @ObjCBlock(name = "call_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_5") UIView.Block_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_5 animations,
            @ObjCBlock(name = "call_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_6") UIView.Block_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_6 completion);

    @Generated
    @Selector("appearance")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object appearance();

    @Generated
    @ProtocolClassMethod("appearance")
    @MappedReturn(ObjCObjectMapper.class)
    public Object _appearance() {
        return appearance();
    }

    @Generated
    @Selector("appearanceForTraitCollection:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object appearanceForTraitCollection(UITraitCollection trait);

    @Generated
    @ProtocolClassMethod("appearanceForTraitCollection")
    @MappedReturn(ObjCObjectMapper.class)
    public Object _appearanceForTraitCollection(UITraitCollection trait) {
        return appearanceForTraitCollection(trait);
    }

    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceForTraitCollection:whenContainedIn:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object appearanceForTraitCollectionWhenContainedIn(UITraitCollection trait,
            @Mapped(ObjCObjectMapper.class) Object ContainerClass, Object... varargs);

    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedIn")
    @MappedReturn(ObjCObjectMapper.class)
    public Object _appearanceForTraitCollectionWhenContainedIn(UITraitCollection trait,
            @Mapped(ObjCObjectMapper.class) Object ContainerClass, Object... varargs) {
        return appearanceForTraitCollectionWhenContainedIn(trait, ContainerClass, varargs);
    }

    @Generated
    @Selector("appearanceForTraitCollection:whenContainedInInstancesOfClasses:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object appearanceForTraitCollectionWhenContainedInInstancesOfClasses(UITraitCollection trait,
            NSArray<?> containerTypes);

    @Generated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedInInstancesOfClasses")
    @MappedReturn(ObjCObjectMapper.class)
    public Object _appearanceForTraitCollectionWhenContainedInInstancesOfClasses(UITraitCollection trait,
            NSArray<?> containerTypes) {
        return appearanceForTraitCollectionWhenContainedInInstancesOfClasses(trait, containerTypes);
    }

    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceWhenContainedIn:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object appearanceWhenContainedIn(@Mapped(ObjCObjectMapper.class) Object ContainerClass,
            Object... varargs);

    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceWhenContainedIn")
    @MappedReturn(ObjCObjectMapper.class)
    public Object _appearanceWhenContainedIn(@Mapped(ObjCObjectMapper.class) Object ContainerClass, Object... varargs) {
        return appearanceWhenContainedIn(ContainerClass, varargs);
    }

    @Generated
    @Selector("appearanceWhenContainedInInstancesOfClasses:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object appearanceWhenContainedInInstancesOfClasses(NSArray<?> containerTypes);

    @Generated
    @ProtocolClassMethod("appearanceWhenContainedInInstancesOfClasses")
    @MappedReturn(ObjCObjectMapper.class)
    public Object _appearanceWhenContainedInInstancesOfClasses(NSArray<?> containerTypes) {
        return appearanceWhenContainedInInstancesOfClasses(containerTypes);
    }

    @Generated
    @Selector("areAnimationsEnabled")
    public static native boolean areAnimationsEnabled();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("beginAnimations:context:")
    public static native void beginAnimationsContext(String animationID, VoidPtr context);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("clearTextInputContextIdentifier:")
    public static native void clearTextInputContextIdentifier(String identifier);

    @Generated
    @Selector("commitAnimations")
    public static native void commitAnimations();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("inheritedAnimationDuration")
    public static native double inheritedAnimationDuration();

    @Generated
    @Selector("initialize")
    public static native void initialize();

    @Generated
    @Selector("instanceMethodForSelector:")
    @FunctionPtr(name = "call_instanceMethodForSelector_ret")
    public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

    @Generated
    @Selector("instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector(SEL aSelector);

    @Generated
    @Selector("instancesRespondToSelector:")
    public static native boolean instancesRespondToSelector(SEL aSelector);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Selector("layerClass")
    public static native Class layerClass();

    @Generated
    @Selector("load")
    public static native void load_objc_static();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("performSystemAnimation:onViews:options:animations:completion:")
    public static native void performSystemAnimationOnViewsOptionsAnimationsCompletion(@NUInt long animation,
            NSArray<? extends UIView> views, @NUInt long options,
            @ObjCBlock(name = "call_performSystemAnimationOnViewsOptionsAnimationsCompletion_3") UIView.Block_performSystemAnimationOnViewsOptionsAnimationsCompletion_3 parallelAnimations,
            @ObjCBlock(name = "call_performSystemAnimationOnViewsOptionsAnimationsCompletion_4") UIView.Block_performSystemAnimationOnViewsOptionsAnimationsCompletion_4 completion);

    @Generated
    @Selector("performWithoutAnimation:")
    public static native void performWithoutAnimation(
            @ObjCBlock(name = "call_performWithoutAnimation") UIView.Block_performWithoutAnimation actionsWithoutAnimation);

    @Generated
    @Selector("requiresConstraintBasedLayout")
    public static native boolean requiresConstraintBasedLayout();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setAnimationBeginsFromCurrentState:")
    public static native void setAnimationBeginsFromCurrentState(boolean fromCurrentState);

    @Generated
    @Selector("setAnimationCurve:")
    public static native void setAnimationCurve(@NInt long curve);

    @Generated
    @Selector("setAnimationDelay:")
    public static native void setAnimationDelay(double delay);

    @Generated
    @Selector("setAnimationDelegate:")
    public static native void setAnimationDelegate(@Mapped(ObjCObjectMapper.class) Object delegate);

    @Generated
    @Selector("setAnimationDidStopSelector:")
    public static native void setAnimationDidStopSelector(SEL selector);

    @Generated
    @Selector("setAnimationDuration:")
    public static native void setAnimationDuration_static(double duration);

    @Generated
    @Selector("setAnimationRepeatAutoreverses:")
    public static native void setAnimationRepeatAutoreverses(boolean repeatAutoreverses);

    @Generated
    @Selector("setAnimationRepeatCount:")
    public static native void setAnimationRepeatCount_static(float repeatCount);

    @Generated
    @Selector("setAnimationStartDate:")
    public static native void setAnimationStartDate(NSDate startDate);

    @Generated
    @Selector("setAnimationTransition:forView:cache:")
    public static native void setAnimationTransitionForViewCache(@NInt long transition, UIView view, boolean cache);

    @Generated
    @Selector("setAnimationWillStartSelector:")
    public static native void setAnimationWillStartSelector(SEL selector);

    @Generated
    @Selector("setAnimationsEnabled:")
    public static native void setAnimationsEnabled(boolean enabled);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("transitionFromView:toView:duration:options:completion:")
    public static native void transitionFromViewToViewDurationOptionsCompletion(UIView fromView, UIView toView,
            double duration, @NUInt long options,
            @ObjCBlock(name = "call_transitionFromViewToViewDurationOptionsCompletion") UIView.Block_transitionFromViewToViewDurationOptionsCompletion completion);

    @Generated
    @Selector("transitionWithView:duration:options:animations:completion:")
    public static native void transitionWithViewDurationOptionsAnimationsCompletion(UIView view, double duration,
            @NUInt long options,
            @ObjCBlock(name = "call_transitionWithViewDurationOptionsAnimationsCompletion_3") UIView.Block_transitionWithViewDurationOptionsAnimationsCompletion_3 animations,
            @ObjCBlock(name = "call_transitionWithViewDurationOptionsAnimationsCompletion_4") UIView.Block_transitionWithViewDurationOptionsAnimationsCompletion_4 completion);

    @Generated
    @Selector("userInterfaceLayoutDirectionForSemanticContentAttribute:")
    @NInt
    public static native long userInterfaceLayoutDirectionForSemanticContentAttribute(@NInt long attribute);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
