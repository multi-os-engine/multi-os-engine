package apple.corehaptics.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * @protocol CHHapticParameterAttributes
 * @abstract
 * 	A protocol for querying mininum, maximum, and default values for a CHHapticEventParameter or CHHapticDynamicParameter.
 */
@Generated
@Library("CoreHaptics")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CHHapticParameterAttributes")
public interface CHHapticParameterAttributes {
    /**
     * @property maxValue
     * @abstract
     * 	The default value for the parameter.
     */
    @Generated
    @Selector("defaultValue")
    float defaultValue();

    /**
     * @property maxValue
     * @abstract
     * 	The maximum value for the parameter.
     */
    @Generated
    @Selector("maxValue")
    float maxValue();

    /**
     * @property minValue
     * @abstract
     * 	The minimum value for the parameter.
     */
    @Generated
    @Selector("minValue")
    float minValue();
}