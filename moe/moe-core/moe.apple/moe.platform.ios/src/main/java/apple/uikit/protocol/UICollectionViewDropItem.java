package apple.uikit.protocol;

import apple.coregraphics.struct.CGSize;
import apple.foundation.NSIndexPath;
import apple.uikit.UIDragItem;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UICollectionViewDropItem")
public interface UICollectionViewDropItem {
    @Generated
    @Selector("dragItem")
    UIDragItem dragItem();

    @Generated
    @Selector("previewSize")
    @ByValue
    CGSize previewSize();

    @Generated
    @Selector("sourceIndexPath")
    NSIndexPath sourceIndexPath();
}