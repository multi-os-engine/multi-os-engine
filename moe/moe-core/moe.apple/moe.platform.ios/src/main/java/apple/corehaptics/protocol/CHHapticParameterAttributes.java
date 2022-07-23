package apple.corehaptics.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * [@protocol] CHHapticParameterAttributes
 * <p>
 * A protocol for querying mininum, maximum, and default values for a CHHapticEventParameter or
 * CHHapticDynamicParameter.
 */
@Generated
@Library("CoreHaptics")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CHHapticParameterAttributes")
public interface CHHapticParameterAttributes {
    /**
     * [@property] maxValue
     * <p>
     * The default value for the parameter.
     */
    @Generated
    @Selector("defaultValue")
    float defaultValue();

    /**
     * [@property] maxValue
     * <p>
     * The maximum value for the parameter.
     */
    @Generated
    @Selector("maxValue")
    float maxValue();

    /**
     * [@property] minValue
     * <p>
     * The minimum value for the parameter.
     */
    @Generated
    @Selector("minValue")
    float minValue();
}
