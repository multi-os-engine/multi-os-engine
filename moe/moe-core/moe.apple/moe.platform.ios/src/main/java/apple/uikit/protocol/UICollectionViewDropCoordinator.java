package apple.uikit.protocol;

import apple.coregraphics.struct.CGRect;
import apple.foundation.NSArray;
import apple.foundation.NSIndexPath;
import apple.uikit.UICollectionViewDropPlaceholder;
import apple.uikit.UICollectionViewDropProposal;
import apple.uikit.UIDragItem;
import apple.uikit.UIDragPreviewTarget;
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
@ObjCProtocolName("UICollectionViewDropCoordinator")
public interface UICollectionViewDropCoordinator {
    @Generated
    @Selector("destinationIndexPath")
    NSIndexPath destinationIndexPath();

    @Generated
    @Selector("dropItem:intoItemAtIndexPath:rect:")
    @MappedReturn(ObjCObjectMapper.class)
    Object dropItemIntoItemAtIndexPathRect(UIDragItem dragItem, NSIndexPath indexPath, @ByValue CGRect rect);

    @Generated
    @Selector("dropItem:toItemAtIndexPath:")
    @MappedReturn(ObjCObjectMapper.class)
    Object dropItemToItemAtIndexPath(UIDragItem dragItem, NSIndexPath indexPath);

    @Generated
    @Selector("dropItem:toPlaceholder:")
    @MappedReturn(ObjCObjectMapper.class)
    Object dropItemToPlaceholder(UIDragItem dragItem, UICollectionViewDropPlaceholder placeholder);

    @Generated
    @Selector("dropItem:toTarget:")
    @MappedReturn(ObjCObjectMapper.class)
    Object dropItemToTarget(UIDragItem dragItem, UIDragPreviewTarget target);

    @Generated
    @Selector("items")
    NSArray<?> items();

    @Generated
    @Selector("proposal")
    UICollectionViewDropProposal proposal();

    @Generated
    @Selector("session")
    @MappedReturn(ObjCObjectMapper.class)
    Object session();
}