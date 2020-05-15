package apple.uikit.protocol;

import apple.uikit.UIDragInteraction;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UITextDraggable")
public interface UITextDraggable extends UITextInput {
    @Generated
    @Selector("isTextDragActive")
    boolean isTextDragActive();

    @Generated
    @Selector("setTextDragDelegate:")
    void setTextDragDelegate(@Mapped(ObjCObjectMapper.class) UITextDragDelegate value);

    @Generated
    @Selector("setTextDragOptions:")
    void setTextDragOptions(@NInt long value);

    @Generated
    @Selector("textDragDelegate")
    @MappedReturn(ObjCObjectMapper.class)
    UITextDragDelegate textDragDelegate();

    @Generated
    @Selector("textDragInteraction")
    UIDragInteraction textDragInteraction();

    @Generated
    @Selector("textDragOptions")
    @NInt
    long textDragOptions();
}