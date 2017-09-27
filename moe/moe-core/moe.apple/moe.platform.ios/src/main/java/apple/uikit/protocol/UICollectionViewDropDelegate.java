package apple.uikit.protocol;

import apple.foundation.NSIndexPath;
import apple.uikit.UICollectionView;
import apple.uikit.UICollectionViewDropProposal;
import apple.uikit.UIDragPreviewParameters;
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
@ObjCProtocolName("UICollectionViewDropDelegate")
public interface UICollectionViewDropDelegate {
    @Generated
    @IsOptional
    @Selector("collectionView:canHandleDropSession:")
    default boolean collectionViewCanHandleDropSession(UICollectionView collectionView,
            @Mapped(ObjCObjectMapper.class) Object session) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("collectionView:dropPreviewParametersForItemAtIndexPath:")
    default UIDragPreviewParameters collectionViewDropPreviewParametersForItemAtIndexPath(
            UICollectionView collectionView, NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("collectionView:dropSessionDidEnd:")
    default void collectionViewDropSessionDidEnd(UICollectionView collectionView,
            @Mapped(ObjCObjectMapper.class) Object session) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("collectionView:dropSessionDidEnter:")
    default void collectionViewDropSessionDidEnter(UICollectionView collectionView,
            @Mapped(ObjCObjectMapper.class) Object session) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("collectionView:dropSessionDidExit:")
    default void collectionViewDropSessionDidExit(UICollectionView collectionView,
            @Mapped(ObjCObjectMapper.class) Object session) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("collectionView:dropSessionDidUpdate:withDestinationIndexPath:")
    default UICollectionViewDropProposal collectionViewDropSessionDidUpdateWithDestinationIndexPath(
            UICollectionView collectionView, @Mapped(ObjCObjectMapper.class) Object session,
            NSIndexPath destinationIndexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("collectionView:performDropWithCoordinator:")
    void collectionViewPerformDropWithCoordinator(UICollectionView collectionView,
            @Mapped(ObjCObjectMapper.class) Object coordinator);
}