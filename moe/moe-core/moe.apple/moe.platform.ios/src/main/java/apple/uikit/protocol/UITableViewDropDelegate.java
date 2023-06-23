package apple.uikit.protocol;

import apple.foundation.NSIndexPath;
import apple.uikit.UIDragPreviewParameters;
import apple.uikit.UITableView;
import apple.uikit.UITableViewDropProposal;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 11.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UITableViewDropDelegate")
public interface UITableViewDropDelegate {
    /**
     * If NO is returned no further delegate methods will be called for this drop session.
     * If not implemented, a default value of YES is assumed.
     */
    @Generated
    @IsOptional
    @Selector("tableView:canHandleDropSession:")
    default boolean tableViewCanHandleDropSession(@NotNull UITableView tableView,
            @NotNull @Mapped(ObjCObjectMapper.class) UIDropSession session) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Allows customization of the preview used when dropping to a newly inserted row.
     * If not implemented or if nil is returned, the entire cell will be used for the preview.
     */
    @Nullable
    @Generated
    @IsOptional
    @Selector("tableView:dropPreviewParametersForRowAtIndexPath:")
    default UIDragPreviewParameters tableViewDropPreviewParametersForRowAtIndexPath(@NotNull UITableView tableView,
            @NotNull NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the drop session completed, regardless of outcome. Useful for performing any cleanup.
     */
    @Generated
    @IsOptional
    @Selector("tableView:dropSessionDidEnd:")
    default void tableViewDropSessionDidEnd(@NotNull UITableView tableView,
            @NotNull @Mapped(ObjCObjectMapper.class) UIDropSession session) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the drop session begins tracking in the table view's coordinate space.
     */
    @Generated
    @IsOptional
    @Selector("tableView:dropSessionDidEnter:")
    default void tableViewDropSessionDidEnter(@NotNull UITableView tableView,
            @NotNull @Mapped(ObjCObjectMapper.class) UIDropSession session) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the drop session is no longer being tracked inside the table view's coordinate space.
     */
    @Generated
    @IsOptional
    @Selector("tableView:dropSessionDidExit:")
    default void tableViewDropSessionDidExit(@NotNull UITableView tableView,
            @NotNull @Mapped(ObjCObjectMapper.class) UIDropSession session) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called frequently while the drop session being tracked inside the table view's coordinate space.
     * When the drop is at the end of a section, the destination index path passed will be for a row that does not yet
     * exist (equal
     * to the number of rows in that section), where an inserted row would append to the end of the section.
     * The destination index path may be nil in some circumstances (e.g. when dragging over empty space where there are
     * no cells).
     * Note that in some cases your proposal may not be allowed and the system will enforce a different proposal.
     * You may perform your own hit testing via -[session locationInView:]
     */
    @NotNull
    @Generated
    @IsOptional
    @Selector("tableView:dropSessionDidUpdate:withDestinationIndexPath:")
    default UITableViewDropProposal tableViewDropSessionDidUpdateWithDestinationIndexPath(
            @NotNull UITableView tableView, @NotNull @Mapped(ObjCObjectMapper.class) UIDropSession session,
            @Nullable NSIndexPath destinationIndexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the user initiates the drop.
     * Use the drop coordinator to access the items in the drop and the final destination index path and proposal for
     * the drop,
     * as well as specify how you wish to animate each item to its final position.
     * If your implementation of this method does nothing, default drop animations will be supplied and the table view
     * will
     * revert back to its initial state before the drop session entered.
     */
    @Generated
    @Selector("tableView:performDropWithCoordinator:")
    void tableViewPerformDropWithCoordinator(@NotNull UITableView tableView,
            @NotNull @Mapped(ObjCObjectMapper.class) UITableViewDropCoordinator coordinator);
}