package apple.uikit.protocol;

import apple.uikit.UIDropInteraction;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UITextDroppable")
public interface UITextDroppable extends UITextInput, UITextPasteConfigurationSupporting {
    @Generated
    @Selector("isTextDropActive")
    boolean isTextDropActive();

    @Generated
    @Selector("setTextDropDelegate:")
    void setTextDropDelegate(@Mapped(ObjCObjectMapper.class) Object value);

    @Generated
    @Selector("textDropDelegate")
    @MappedReturn(ObjCObjectMapper.class)
    Object textDropDelegate();

    @Generated
    @Selector("textDropInteraction")
    UIDropInteraction textDropInteraction();
}