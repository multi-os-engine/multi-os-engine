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

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIContentView")
public interface UIContentView {
    /**
     * Returns the current configuration of the view. Setting this property applies the new configuration to the view.
     */
    @Generated
    @Selector("configuration")
    @MappedReturn(ObjCObjectMapper.class)
    UIContentConfiguration configuration();

    /**
     * Returns the current configuration of the view. Setting this property applies the new configuration to the view.
     */
    @Generated
    @Selector("setConfiguration:")
    void setConfiguration(@Mapped(ObjCObjectMapper.class) UIContentConfiguration value);
}