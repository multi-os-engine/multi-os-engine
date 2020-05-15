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

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UITextDragRequest")
public interface UITextDragRequest {
    @Generated
    @Selector("dragRange")
    UITextRange dragRange();

    @Generated
    @Selector("dragSession")
    @MappedReturn(ObjCObjectMapper.class)
    UIDragSession dragSession();

    @Generated
    @Selector("existingItems")
    NSArray<? extends UIDragItem> existingItems();

    @Generated
    @Selector("isSelected")
    boolean isSelected();

    @Generated
    @Selector("suggestedItems")
    NSArray<? extends UIDragItem> suggestedItems();
}