package apple.uikit.protocol;

import apple.foundation.NSAttributedString;
import apple.foundation.NSDictionary;
import apple.foundation.NSItemProvider;
import apple.uikit.NSTextAttachment;
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
@ObjCProtocolName("UITextPasteItem")
public interface UITextPasteItem {
    @Generated
    @Selector("defaultAttributes")
    NSDictionary<String, ?> defaultAttributes();

    @Generated
    @Selector("itemProvider")
    NSItemProvider itemProvider();

    @Generated
    @Selector("localObject")
    @MappedReturn(ObjCObjectMapper.class)
    Object localObject();

    @Generated
    @Selector("setAttachmentResult:")
    void setAttachmentResult(NSTextAttachment textAttachment);

    @Generated
    @Selector("setAttributedStringResult:")
    void setAttributedStringResult(NSAttributedString string);

    @Generated
    @Selector("setDefaultResult")
    void setDefaultResult();

    @Generated
    @Selector("setNoResult")
    void setNoResult();

    @Generated
    @Selector("setStringResult:")
    void setStringResult(String string);
}