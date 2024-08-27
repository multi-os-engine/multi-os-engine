package apple.uikit.protocol;

import apple.protocol.NSObject;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * API-Since: 17.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIObjectTraitDefinition")
public interface UIObjectTraitDefinition extends UITraitDefinition {
    /**
     * The default value for this trait in a trait collection when no value has been set.
     */
    @Generated
    @Selector("defaultValue")
    @ProtocolClassMethod("defaultValue")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    NSObject _defaultValue();
}