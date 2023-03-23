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
@ObjCProtocolName("UICollectionViewDropItem")
public interface UICollectionViewDropItem {
    @Generated
    @Selector("dragItem")
    UIDragItem dragItem();

    /**
     * May be useful for computing the UIDragPreviewTarget transform for UICollectionViewDropCoordinator
     * dropItem:toTarget:
     * Returns CGSizeZero if the dragItem does not have a visible drop preview.
     */
    @Generated
    @Selector("previewSize")
    @ByValue
    CGSize previewSize();

    /**
     * If this drop item is also from this collection view this indexPath will specify the location of the item.
     * If the dragItem comes from some other source (e.g. another source inside or outside of the app), it will be nil.
     * This is useful for directly accessing the model objects in the data source instead of using the item provider
     * to retrieve the data.
     */
    @Generated
    @Selector("sourceIndexPath")
    NSIndexPath sourceIndexPath();
}