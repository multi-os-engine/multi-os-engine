package apple.uikit.protocol;

import apple.foundation.NSArray;
import apple.foundation.NSIndexPath;
import apple.uikit.UIDragItem;
import apple.uikit.UIDragPreviewParameters;
import apple.uikit.UITableView;
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
import apple.corefoundation.struct.CGPoint;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * _______________________________________________________________________________________________________________
 * Drag & Drop
 * 
 * API-Since: 11.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UITableViewDragDelegate")
public interface UITableViewDragDelegate {
    /**
     * Allows customization of the preview used for the row when it is lifted or if the drag cancels.
     * If not implemented or if nil is returned, the entire cell will be used for the preview.
     */
    @Nullable
    @Generated
    @IsOptional
    @Selector("tableView:dragPreviewParametersForRowAtIndexPath:")
    default UIDragPreviewParameters tableViewDragPreviewParametersForRowAtIndexPath(@NotNull UITableView tableView,
            @NotNull NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Controls whether move operations are allowed for the drag session.
     * If not implemented, defaults to YES.
     */
    @Generated
    @IsOptional
    @Selector("tableView:dragSessionAllowsMoveOperation:")
    default boolean tableViewDragSessionAllowsMoveOperation(@NotNull UITableView tableView,
            @NotNull @Mapped(ObjCObjectMapper.class) UIDragSession session) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called to signal the end of the drag session.
     */
    @Generated
    @IsOptional
    @Selector("tableView:dragSessionDidEnd:")
    default void tableViewDragSessionDidEnd(@NotNull UITableView tableView,
            @NotNull @Mapped(ObjCObjectMapper.class) UIDragSession session) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Controls whether the drag session is restricted to the source application.
     * If not implemented, defaults to NO.
     */
    @Generated
    @IsOptional
    @Selector("tableView:dragSessionIsRestrictedToDraggingApplication:")
    default boolean tableViewDragSessionIsRestrictedToDraggingApplication(@NotNull UITableView tableView,
            @NotNull @Mapped(ObjCObjectMapper.class) UIDragSession session) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called after the lift animation has completed to signal the start of a drag session.
     * This call will always be balanced with a corresponding call to -tableView:dragSessionDidEnd:
     */
    @Generated
    @IsOptional
    @Selector("tableView:dragSessionWillBegin:")
    default void tableViewDragSessionWillBegin(@NotNull UITableView tableView,
            @NotNull @Mapped(ObjCObjectMapper.class) UIDragSession session) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called to request items to add to an existing drag session in response to the add item gesture.
     * You can use the provided point (in the table view's coordinate space) to do additional hit testing if desired.
     * If not implemented, or if an empty array is returned, no items will be added to the drag and the gesture
     * will be handled normally.
     */
    @NotNull
    @Generated
    @IsOptional
    @Selector("tableView:itemsForAddingToDragSession:atIndexPath:point:")
    default NSArray<? extends UIDragItem> tableViewItemsForAddingToDragSessionAtIndexPathPoint(
            @NotNull UITableView tableView, @NotNull @Mapped(ObjCObjectMapper.class) UIDragSession session,
            @NotNull NSIndexPath indexPath, @ByValue CGPoint point) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Provide items to begin a drag associated with a given index path.
     * You can use -[session locationInView:] to do additional hit testing if desired.
     * If an empty array is returned a drag session will not begin.
     */
    @NotNull
    @Generated
    @Selector("tableView:itemsForBeginningDragSession:atIndexPath:")
    NSArray<? extends UIDragItem> tableViewItemsForBeginningDragSessionAtIndexPath(@NotNull UITableView tableView,
            @NotNull @Mapped(ObjCObjectMapper.class) UIDragSession session, @NotNull NSIndexPath indexPath);
}