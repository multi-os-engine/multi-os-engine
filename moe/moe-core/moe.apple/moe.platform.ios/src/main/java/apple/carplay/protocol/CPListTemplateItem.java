package apple.carplay.protocol;

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
@Library("CarPlay")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CPListTemplateItem")
public interface CPListTemplateItem {
    @Generated
    @Selector("setUserInfo:")
    void setUserInfo(@Mapped(ObjCObjectMapper.class) Object value);

    @Generated
    @Selector("text")
    String text();

    @Generated
    @Selector("userInfo")
    @MappedReturn(ObjCObjectMapper.class)
    Object userInfo();
}