package apple.uikit.protocol;

import apple.coregraphics.struct.CGPoint;
import apple.foundation.NSArray;
import apple.foundation.NSIndexPath;
import apple.uikit.UICollectionView;
import apple.uikit.UIDragItem;
import apple.uikit.UIDragPreviewParameters;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UICollectionViewDragDelegate")
public interface UICollectionViewDragDelegate {
    /**
     * Allows customization of the preview used for the item being lifted from or cancelling back to the collection view.
     * If not implemented or if nil is returned, the entire cell will be used for the preview.
     */
    @Generated
    @IsOptional
    @Selector("collectionView:dragPreviewParametersForItemAtIndexPath:")
    default UIDragPreviewParameters collectionViewDragPreviewParametersForItemAtIndexPath(
            UICollectionView collectionView, NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Controls whether move operations (see UICollectionViewDropProposal.operation) are allowed for the drag session.
     * If not implemented this will default to YES.
     */
    @Generated
    @IsOptional
    @Selector("collectionView:dragSessionAllowsMoveOperation:")
    default boolean collectionViewDragSessionAllowsMoveOperation(UICollectionView collectionView,
            @Mapped(ObjCObjectMapper.class) UIDragSession session) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called to signal the end of the drag session.
     */
    @Generated
    @IsOptional
    @Selector("collectionView:dragSessionDidEnd:")
    default void collectionViewDragSessionDidEnd(UICollectionView collectionView,
            @Mapped(ObjCObjectMapper.class) UIDragSession session) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Controls whether the drag session is restricted to the source application.
     * If YES the current drag session will not be permitted to drop into another application.
     * If not implemented this will default to NO.
     */
    @Generated
    @IsOptional
    @Selector("collectionView:dragSessionIsRestrictedToDraggingApplication:")
    default boolean collectionViewDragSessionIsRestrictedToDraggingApplication(UICollectionView collectionView,
            @Mapped(ObjCObjectMapper.class) UIDragSession session) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called after the lift animation has completed to signal the start of a drag session.
     * This call will always be balanced with a corresponding call to -collectionView:dragSessionDidEnd:
     */
    @Generated
    @IsOptional
    @Selector("collectionView:dragSessionWillBegin:")
    default void collectionViewDragSessionWillBegin(UICollectionView collectionView,
            @Mapped(ObjCObjectMapper.class) UIDragSession session) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called to request items to add to an existing drag session in response to the add item gesture.
     * You can use the provided point (in the collection view's coordinate space) to do additional hit testing if desired.
     * If not implemented, or if an empty array is returned, no items will be added to the drag and the gesture
     * will be handled normally.
     */
    @Generated
    @IsOptional
    @Selector("collectionView:itemsForAddingToDragSession:atIndexPath:point:")
    default NSArray<? extends UIDragItem> collectionViewItemsForAddingToDragSessionAtIndexPathPoint(
            UICollectionView collectionView, @Mapped(ObjCObjectMapper.class) UIDragSession session,
            NSIndexPath indexPath, @ByValue CGPoint point) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Provide items to begin a drag associated with a given indexPath.
     * If an empty array is returned a drag session will not begin.
     */
    @Generated
    @Selector("collectionView:itemsForBeginningDragSession:atIndexPath:")
    NSArray<? extends UIDragItem> collectionViewItemsForBeginningDragSessionAtIndexPath(UICollectionView collectionView,
            @Mapped(ObjCObjectMapper.class) UIDragSession session, NSIndexPath indexPath);
}