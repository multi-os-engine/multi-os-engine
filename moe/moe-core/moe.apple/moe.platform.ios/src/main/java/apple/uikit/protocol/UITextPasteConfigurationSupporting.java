package apple.uikit.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * API-Since: 11.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UITextPasteConfigurationSupporting")
public interface UITextPasteConfigurationSupporting extends UIPasteConfigurationSupporting {
    @Generated
    @Selector("pasteDelegate")
    @MappedReturn(ObjCObjectMapper.class)
    UITextPasteDelegate pasteDelegate();

    @Generated
    @Selector("setPasteDelegate:")
    void setPasteDelegate_unsafe(@Mapped(ObjCObjectMapper.class) UITextPasteDelegate value);
}