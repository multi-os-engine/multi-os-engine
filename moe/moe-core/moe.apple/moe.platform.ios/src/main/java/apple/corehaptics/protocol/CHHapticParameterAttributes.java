package apple.corehaptics.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("CoreHaptics")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CHHapticParameterAttributes")
public interface CHHapticParameterAttributes {
    @Generated
    @Selector("defaultValue")
    float defaultValue();

    @Generated
    @Selector("maxValue")
    float maxValue();

    @Generated
    @Selector("minValue")
    float minValue();
}