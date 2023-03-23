package apple.uikit.protocol;

import apple.foundation.NSIndexPath;
import apple.uikit.UIDragItem;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import apple.corefoundation.struct.CGSize;

/**
 * API-Since: 11.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UITableViewDropItem")
public interface UITableViewDropItem {
    /**
     * Retrieve drop data from the dragItem's itemProvider.
     */
    @Generated
    @Selector("dragItem")
    UIDragItem dragItem();

    /**
     * May be useful for computing the UIDragPreviewTarget transform for UITableViewDropCoordinator dropItem:toTarget:
     * Returns CGSizeZero if the dragItem does not have a visible drop preview.
     */
    @Generated
    @Selector("previewSize")
    @ByValue
    CGSize previewSize();

    /**
     * If this drop item is also from this table view this index path will specify the location of the row it came from.
     * If the dragItem comes from some other source (e.g. another source inside or outside of the app), or if the source
     * table view is updated or reloaded after the drag begins, this index path will be nil.
     * This is useful for directly accessing the model object in your data source instead of using the item provider
     * to retrieve the data.
     */
    @Generated
    @Selector("sourceIndexPath")
    NSIndexPath sourceIndexPath();
}