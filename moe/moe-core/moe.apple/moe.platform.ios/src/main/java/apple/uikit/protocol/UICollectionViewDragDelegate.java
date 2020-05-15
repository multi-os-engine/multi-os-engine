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
    @Generated
    @IsOptional
    @Selector("collectionView:dragPreviewParametersForItemAtIndexPath:")
    default UIDragPreviewParameters collectionViewDragPreviewParametersForItemAtIndexPath(
            UICollectionView collectionView, NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("collectionView:dragSessionAllowsMoveOperation:")
    default boolean collectionViewDragSessionAllowsMoveOperation(UICollectionView collectionView,
            @Mapped(ObjCObjectMapper.class) UIDragSession session) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("collectionView:dragSessionDidEnd:")
    default void collectionViewDragSessionDidEnd(UICollectionView collectionView,
            @Mapped(ObjCObjectMapper.class) UIDragSession session) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("collectionView:dragSessionIsRestrictedToDraggingApplication:")
    default boolean collectionViewDragSessionIsRestrictedToDraggingApplication(UICollectionView collectionView,
            @Mapped(ObjCObjectMapper.class) UIDragSession session) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("collectionView:dragSessionWillBegin:")
    default void collectionViewDragSessionWillBegin(UICollectionView collectionView,
            @Mapped(ObjCObjectMapper.class) UIDragSession session) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("collectionView:itemsForAddingToDragSession:atIndexPath:point:")
    default NSArray<? extends UIDragItem> collectionViewItemsForAddingToDragSessionAtIndexPathPoint(
            UICollectionView collectionView, @Mapped(ObjCObjectMapper.class) UIDragSession session,
            NSIndexPath indexPath, @ByValue CGPoint point) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("collectionView:itemsForBeginningDragSession:atIndexPath:")
    NSArray<? extends UIDragItem> collectionViewItemsForBeginningDragSessionAtIndexPath(UICollectionView collectionView,
            @Mapped(ObjCObjectMapper.class) UIDragSession session, NSIndexPath indexPath);
}