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
    @Generated
    @Selector("destinationIndexPath")
    NSIndexPath destinationIndexPath();

    @Generated
    @Selector("dropItem:intoRowAtIndexPath:rect:")
    @MappedReturn(ObjCObjectMapper.class)
    UIDragAnimating dropItemIntoRowAtIndexPathRect(UIDragItem dragItem, NSIndexPath indexPath, @ByValue CGRect rect);

    @Generated
    @Selector("dropItem:toPlaceholder:")
    @MappedReturn(ObjCObjectMapper.class)
    UITableViewDropPlaceholderContext dropItemToPlaceholder(UIDragItem dragItem,
            UITableViewDropPlaceholder placeholder);

    @Generated
    @Selector("dropItem:toRowAtIndexPath:")
    @MappedReturn(ObjCObjectMapper.class)
    UIDragAnimating dropItemToRowAtIndexPath(UIDragItem dragItem, NSIndexPath indexPath);

    @Generated
    @Selector("dropItem:toTarget:")
    @MappedReturn(ObjCObjectMapper.class)
    UIDragAnimating dropItemToTarget(UIDragItem dragItem, UIDragPreviewTarget target);

    @Generated
    @Selector("items")
    NSArray<?> items();

    @Generated
    @Selector("proposal")
    UITableViewDropProposal proposal();

    @Generated
    @Selector("session")
    @MappedReturn(ObjCObjectMapper.class)
    UIDropSession session();
}