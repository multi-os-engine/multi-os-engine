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

/**
 * @c CPListTemplateItem describes common properties of list items that can be displayed
 * in a @c CPListTemplate.
 */
@Generated
@Library("CarPlay")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CPListTemplateItem")
public interface CPListTemplateItem {
    /**
     * Any custom user info related to this item.
     */
    @Generated
    @Selector("setUserInfo:")
    void setUserInfo(@Mapped(ObjCObjectMapper.class) Object value);

    /**
     * The primary text shown in a cell displaying this list item.
     */
    @Generated
    @Selector("text")
    String text();

    /**
     * Any custom user info related to this item.
     */
    @Generated
    @Selector("userInfo")
    @MappedReturn(ObjCObjectMapper.class)
    Object userInfo();
}