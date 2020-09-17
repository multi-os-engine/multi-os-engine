package apple.uikit.protocol;

import apple.foundation.protocol.NSCopying;
import apple.uikit.UIView;
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
@ObjCProtocolName("UIContentConfiguration")
public interface UIContentConfiguration extends NSCopying {
    @Generated
    @Selector("makeContentView")
    UIView makeContentView();

    @Generated
    @Selector("updatedConfigurationForState:")
    @MappedReturn(ObjCObjectMapper.class)
    Object updatedConfigurationForState(@Mapped(ObjCObjectMapper.class) UIConfigurationState state);
}