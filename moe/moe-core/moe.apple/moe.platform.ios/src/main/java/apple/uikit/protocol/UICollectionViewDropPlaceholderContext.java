package apple.uikit.protocol;

import apple.foundation.NSIndexPath;
import apple.uikit.UIDragItem;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UICollectionViewDropPlaceholderContext")
public interface UICollectionViewDropPlaceholderContext extends UIDragAnimating {
    @Generated
    @Selector("commitInsertionWithDataSourceUpdates:")
    boolean commitInsertionWithDataSourceUpdates(
            @ObjCBlock(name = "call_commitInsertionWithDataSourceUpdates") Block_commitInsertionWithDataSourceUpdates dataSourceUpdates);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_commitInsertionWithDataSourceUpdates {
        @Generated
        void call_commitInsertionWithDataSourceUpdates(NSIndexPath arg0);
    }

    @Generated
    @Selector("deletePlaceholder")
    boolean deletePlaceholder();

    @Generated
    @Selector("dragItem")
    UIDragItem dragItem();

    @Generated
    @Selector("setNeedsCellUpdate")
    void setNeedsCellUpdate();
}