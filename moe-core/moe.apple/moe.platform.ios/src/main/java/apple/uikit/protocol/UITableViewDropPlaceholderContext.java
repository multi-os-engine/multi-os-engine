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
import org.jetbrains.annotations.NotNull;

/**
 * API-Since: 11.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UITableViewDropPlaceholderContext")
public interface UITableViewDropPlaceholderContext extends UIDragAnimating {
    /**
     * Exchange the placeholder for the final cell.
     * You are only responsible for updating your data source inside the block using the provided insertionIndexPath.
     * If the placeholder is no longer available (e.g. -reloadData has been called) the dataSourceUpdates block
     * will not be executed and this will return NO.
     */
    @Generated
    @Selector("commitInsertionWithDataSourceUpdates:")
    boolean commitInsertionWithDataSourceUpdates(
            @NotNull @ObjCBlock(name = "call_commitInsertionWithDataSourceUpdates") Block_commitInsertionWithDataSourceUpdates dataSourceUpdates);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_commitInsertionWithDataSourceUpdates {
        @Generated
        void call_commitInsertionWithDataSourceUpdates(@NotNull NSIndexPath insertionIndexPath);
    }

    /**
     * If the placeholder is no longer needed or you wish to manually insert a cell for the drop data, you can
     * remove the placeholder via this method.
     * If the placeholder is no longer available (e.g. -reloadData has been called) this will return NO.
     */
    @Generated
    @Selector("deletePlaceholder")
    boolean deletePlaceholder();

    /**
     * The drag item this placeholder was created for.
     */
    @NotNull
    @Generated
    @Selector("dragItem")
    UIDragItem dragItem();
}