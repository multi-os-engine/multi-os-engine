package apple.uikit.protocol;

import apple.coregraphics.struct.CGRect;
import apple.foundation.NSArray;
import apple.foundation.NSIndexPath;
import apple.uikit.UICollectionViewDropPlaceholder;
import apple.uikit.UICollectionViewDropProposal;
import apple.uikit.UIDragItem;
import apple.uikit.UIDragPreviewTarget;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UICollectionViewDropCoordinator")
public interface UICollectionViewDropCoordinator {
    /**
     * The last hit-tested index path known during the drop session.
     * If this is nil, the proposal's intent will be .unspecified
     */
    @Generated
    @Selector("destinationIndexPath")
    NSIndexPath destinationIndexPath();

    /**
     * Animate the dragItem to a rect inside an existing item.
     * The rect is in the coordinate space of the cell at this index path.
     * The item will be animated with an aspect fit scale transform to fit inside the rect. Use a rect with zero size to shrink the item to a single point.
     */
    @Generated
    @Selector("dropItem:intoItemAtIndexPath:rect:")
    @MappedReturn(ObjCObjectMapper.class)
    UIDragAnimating dropItemIntoItemAtIndexPathRect(UIDragItem dragItem, NSIndexPath indexPath, @ByValue CGRect rect);

    /**
     * Animate the dragItem to a newly inserted item at the specified index path.
     * You must call -performBatchUpdates:completion: to update your data source and insert a new item into the collection view prior to calling this method.
     * 
     * To tweak the appearance of the preview being dropping (e.g. supply a clipping path), see -collectionView:dropPreviewParametersForItemAtIndexPath:
     */
    @Generated
    @Selector("dropItem:toItemAtIndexPath:")
    @MappedReturn(ObjCObjectMapper.class)
    UIDragAnimating dropItemToItemAtIndexPath(UIDragItem dragItem, NSIndexPath indexPath);

    /**
     * Animate the dragItem to an automatically inserted placeholder item.
     * 
     * A placeholder cell will be created for the reuse identifier and inserted at the specified indexPath without requiring a dataSource update.
     * 
     * The cellUpdateHandler will be called whenever the placeholder cell becomes visible; -collectionView:cellForItemAtIndexPath: will not be called
     * for the placeholder.
     * 
     * Once the dragItem data is available, you can exchange the temporary placeholder cell with the final cell using
     * the placeholder context method -commitInsertionWithDataSourceUpdates:
     * 
     * UICollectionViewDropPlaceholderContext also conforms to UIDragAnimating to allow adding alongside animations and completion handlers.
     */
    @Generated
    @Selector("dropItem:toPlaceholder:")
    @MappedReturn(ObjCObjectMapper.class)
    UICollectionViewDropPlaceholderContext dropItemToPlaceholder(UIDragItem dragItem,
            UICollectionViewDropPlaceholder placeholder);

    /**
     * Animate the dragItem to a location specified by the UIDragPreviewTarget.
     */
    @Generated
    @Selector("dropItem:toTarget:")
    @MappedReturn(ObjCObjectMapper.class)
    UIDragAnimating dropItemToTarget(UIDragItem dragItem, UIDragPreviewTarget target);

    /**
     * Ordered list of items available for this drop.
     */
    @Generated
    @Selector("items")
    NSArray<?> items();

    /**
     * The current drop proposal at the time of the drop.
     */
    @Generated
    @Selector("proposal")
    UICollectionViewDropProposal proposal();

    @Generated
    @Selector("session")
    @MappedReturn(ObjCObjectMapper.class)
    UIDropSession session();
}