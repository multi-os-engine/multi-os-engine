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
    /**
     * If NO is returned no further delegate methods will be called for this drop session.
     * If not implemented, a default value of YES is assumed.
     */
    @Generated
    @IsOptional
    @Selector("collectionView:canHandleDropSession:")
    default boolean collectionViewCanHandleDropSession(UICollectionView collectionView,
            @Mapped(ObjCObjectMapper.class) UIDropSession session) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Allows customization of the preview used for the item being dropped.
     * If not implemented or if nil is returned, the entire cell will be used for the preview.
     * <p>
     * This will be called as needed when animating drops via -[UICollectionViewDropCoordinator
     * dropItem:toItemAtIndexPath:]
     * (to customize placeholder drops, please see UICollectionViewDropPlaceholder.previewParametersProvider)
     */
    @Generated
    @IsOptional
    @Selector("collectionView:dropPreviewParametersForItemAtIndexPath:")
    default UIDragPreviewParameters collectionViewDropPreviewParametersForItemAtIndexPath(
            UICollectionView collectionView, NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the drop session completed, regardless of outcome. Useful for performing any cleanup.
     */
    @Generated
    @IsOptional
    @Selector("collectionView:dropSessionDidEnd:")
    default void collectionViewDropSessionDidEnd(UICollectionView collectionView,
            @Mapped(ObjCObjectMapper.class) UIDropSession session) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the drop session begins tracking in the collection view's coordinate space.
     */
    @Generated
    @IsOptional
    @Selector("collectionView:dropSessionDidEnter:")
    default void collectionViewDropSessionDidEnter(UICollectionView collectionView,
            @Mapped(ObjCObjectMapper.class) UIDropSession session) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the drop session is no longer being tracked inside the collection view's coordinate space.
     */
    @Generated
    @IsOptional
    @Selector("collectionView:dropSessionDidExit:")
    default void collectionViewDropSessionDidExit(UICollectionView collectionView,
            @Mapped(ObjCObjectMapper.class) UIDropSession session) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called frequently while the drop session being tracked inside the collection view's coordinate space.
     * When the drop is at the end of a section, the destination index path passed will be for a item that does not yet
     * exist (equal
     * to the number of items in that section), where an inserted item would append to the end of the section.
     * The destination index path may be nil in some circumstances (e.g. when dragging over empty space where there are
     * no cells).
     * Note that in some cases your proposal may not be allowed and the system will enforce a different proposal.
     * You may perform your own hit testing via -[UIDropSession locationInView]
     */
    @Generated
    @IsOptional
    @Selector("collectionView:dropSessionDidUpdate:withDestinationIndexPath:")
    default UICollectionViewDropProposal collectionViewDropSessionDidUpdateWithDestinationIndexPath(
            UICollectionView collectionView, @Mapped(ObjCObjectMapper.class) UIDropSession session,
            NSIndexPath destinationIndexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the user initiates the drop.
     * Use the dropCoordinator to specify how you wish to animate the dropSession's items into their final position as
     * well as update the collection view's data source with data retrieved from the dropped items.
     * If the supplied method does nothing, default drop animations will be supplied and the collection view will
     * revert back to its initial pre-drop session state.
     */
    @Generated
    @Selector("collectionView:performDropWithCoordinator:")
    void collectionViewPerformDropWithCoordinator(UICollectionView collectionView,
            @Mapped(ObjCObjectMapper.class) UICollectionViewDropCoordinator coordinator);
}
