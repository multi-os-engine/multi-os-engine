package apple.uikit.protocol;

import apple.coregraphics.struct.CGPoint;
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

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UITableViewDragDelegate")
public interface UITableViewDragDelegate {
    @Generated
    @IsOptional
    @Selector("tableView:dragPreviewParametersForRowAtIndexPath:")
    default UIDragPreviewParameters tableViewDragPreviewParametersForRowAtIndexPath(UITableView tableView,
            NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tableView:dragSessionAllowsMoveOperation:")
    default boolean tableViewDragSessionAllowsMoveOperation(UITableView tableView,
            @Mapped(ObjCObjectMapper.class) UIDragSession session) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tableView:dragSessionDidEnd:")
    default void tableViewDragSessionDidEnd(UITableView tableView,
            @Mapped(ObjCObjectMapper.class) UIDragSession session) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tableView:dragSessionIsRestrictedToDraggingApplication:")
    default boolean tableViewDragSessionIsRestrictedToDraggingApplication(UITableView tableView,
            @Mapped(ObjCObjectMapper.class) UIDragSession session) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tableView:dragSessionWillBegin:")
    default void tableViewDragSessionWillBegin(UITableView tableView,
            @Mapped(ObjCObjectMapper.class) UIDragSession session) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tableView:itemsForAddingToDragSession:atIndexPath:point:")
    default NSArray<? extends UIDragItem> tableViewItemsForAddingToDragSessionAtIndexPathPoint(UITableView tableView,
            @Mapped(ObjCObjectMapper.class) UIDragSession session, NSIndexPath indexPath, @ByValue CGPoint point) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("tableView:itemsForBeginningDragSession:atIndexPath:")
    NSArray<? extends UIDragItem> tableViewItemsForBeginningDragSessionAtIndexPath(UITableView tableView,
            @Mapped(ObjCObjectMapper.class) UIDragSession session, NSIndexPath indexPath);
}