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

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UITableViewDropDelegate")
public interface UITableViewDropDelegate {
    @Generated
    @IsOptional
    @Selector("tableView:canHandleDropSession:")
    default boolean tableViewCanHandleDropSession(UITableView tableView,
            @Mapped(ObjCObjectMapper.class) UIDropSession session) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tableView:dropPreviewParametersForRowAtIndexPath:")
    default UIDragPreviewParameters tableViewDropPreviewParametersForRowAtIndexPath(UITableView tableView,
            NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tableView:dropSessionDidEnd:")
    default void tableViewDropSessionDidEnd(UITableView tableView,
            @Mapped(ObjCObjectMapper.class) UIDropSession session) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tableView:dropSessionDidEnter:")
    default void tableViewDropSessionDidEnter(UITableView tableView,
            @Mapped(ObjCObjectMapper.class) UIDropSession session) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tableView:dropSessionDidExit:")
    default void tableViewDropSessionDidExit(UITableView tableView,
            @Mapped(ObjCObjectMapper.class) UIDropSession session) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tableView:dropSessionDidUpdate:withDestinationIndexPath:")
    default UITableViewDropProposal tableViewDropSessionDidUpdateWithDestinationIndexPath(UITableView tableView,
            @Mapped(ObjCObjectMapper.class) UIDropSession session, NSIndexPath destinationIndexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("tableView:performDropWithCoordinator:")
    void tableViewPerformDropWithCoordinator(UITableView tableView,
            @Mapped(ObjCObjectMapper.class) UITableViewDropCoordinator coordinator);
}