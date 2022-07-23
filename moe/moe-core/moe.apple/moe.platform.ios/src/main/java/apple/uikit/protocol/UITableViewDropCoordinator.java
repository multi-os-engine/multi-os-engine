package apple.uikit.protocol;

import apple.coregraphics.struct.CGRect;
import apple.foundation.NSArray;
import apple.foundation.NSIndexPath;
import apple.uikit.UIDragItem;
import apple.uikit.UIDragPreviewTarget;
import apple.uikit.UITableViewDropPlaceholder;
import apple.uikit.UITableViewDropProposal;
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
@ObjCProtocolName("UITableViewDropCoordinator")
public interface UITableViewDropCoordinator {
    /**
     * The last hit-tested index path known during the drop session.
     * When the drop is at the end of a section, this index path will be for a row that does not yet exist (equal
     * to the number of rows in that section), where an inserted row would append to the end of the section.
     * This index path may be nil in some circumstances (e.g. when dragging over empty space where there are no cells),
     * and if it is nil, the proposal's intent will always be UITableViewDropIntentUnspecified.
     */
    @Generated
    @Selector("destinationIndexPath")
    NSIndexPath destinationIndexPath();

    /**
     * Animate the dragItem to a rect inside an existing row.
     * The rect is in the coordinate space of the cell at this index path.
     * The item will be animated with an aspect fit scale transform to fit inside the rect. Use a rect with zero size to
     * shrink the item to a single point.
     */
    @Generated
    @Selector("dropItem:intoRowAtIndexPath:rect:")
    @MappedReturn(ObjCObjectMapper.class)
    UIDragAnimating dropItemIntoRowAtIndexPathRect(UIDragItem dragItem, NSIndexPath indexPath, @ByValue CGRect rect);

    /**
     * Animate the dragItem to an automatically inserted placeholder row.
     * Once the dragItem data is available, you can exchange the temporary placeholder cell with the final cell using
     * the placeholder context
     * method -commitInsertionWithDataSourceUpdates:
     */
    @Generated
    @Selector("dropItem:toPlaceholder:")
    @MappedReturn(ObjCObjectMapper.class)
    UITableViewDropPlaceholderContext dropItemToPlaceholder(UIDragItem dragItem,
            UITableViewDropPlaceholder placeholder);

    /**
     * Animate the dragItem to a row that you inserted at this index path.
     * You must call -performBatchUpdates:completion: to update your data source and insert a new row into the table
     * view prior to calling this method.
     * If desired, use the drop delegate method -tableView:dropPreviewParametersForRowAtIndexPath: to provide preview
     * parameters.
     */
    @Generated
    @Selector("dropItem:toRowAtIndexPath:")
    @MappedReturn(ObjCObjectMapper.class)
    UIDragAnimating dropItemToRowAtIndexPath(UIDragItem dragItem, NSIndexPath indexPath);

    /**
     * Animate the dragItem to a location specified by the UIDragPreviewTarget.
     * The -[UITableViewDropItem previewSize] may be helpful to compute an appropriate transform.
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
    UITableViewDropProposal proposal();

    /**
     * The drop session.
     */
    @Generated
    @Selector("session")
    @MappedReturn(ObjCObjectMapper.class)
    UIDropSession session();
}