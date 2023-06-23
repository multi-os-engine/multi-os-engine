package apple.uikit.protocol;

import apple.foundation.NSArray;
import apple.uikit.UIDragItem;
import apple.uikit.UITextRange;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;

/**
 * API-Since: 11.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UITextDragRequest")
public interface UITextDragRequest {
    /**
     * The text range being dragged.
     */
    @NotNull
    @Generated
    @Selector("dragRange")
    UITextRange dragRange();

    /**
     * The current drag session.
     */
    @NotNull
    @Generated
    @Selector("dragSession")
    @MappedReturn(ObjCObjectMapper.class)
    UIDragSession dragSession();

    /**
     * The existing items in the session.
     * Will be filled when we request new items.
     */
    @NotNull
    @Generated
    @Selector("existingItems")
    NSArray<? extends UIDragItem> existingItems();

    /**
     * Indicates whether the drag context contains a selection.
     * Use this to disable dragging from an attachment or links
     * without them being selected. (In those cases, `selected` will be false.)
     * For regular dragged text, this will always be true.
     */
    @Generated
    @Selector("isSelected")
    boolean isSelected();

    /**
     * The suggested items that the text control would return,
     * if the responsible delegate method were not implemented.
     * This is populated lazily, so only use it when you need it.
     */
    @NotNull
    @Generated
    @Selector("suggestedItems")
    NSArray<? extends UIDragItem> suggestedItems();
}