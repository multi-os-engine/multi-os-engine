package apple.uikit.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;

/**
 * API-Since: 17.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UICGFloatTraitDefinition")
public interface UICGFloatTraitDefinition extends UITraitDefinition {
    /**
     * The default value for this trait in a trait collection when no value has been set.
     */
    @Generated
    @Selector("defaultValue")
    @ProtocolClassMethod("defaultValue")
    @NFloat
    double _defaultValue();
}