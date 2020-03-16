package apple.corehaptics.protocol;

import apple.corehaptics.CHHapticDynamicParameter;
import apple.corehaptics.CHHapticParameterCurve;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("CoreHaptics")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CHHapticPatternPlayer")
public interface CHHapticPatternPlayer {
    @Generated
    @Selector("cancelAndReturnError:")
    boolean cancelAndReturnError(@ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("isMuted")
    boolean isMuted();

    @Generated
    @Selector("scheduleParameterCurve:atTime:error:")
    boolean scheduleParameterCurveAtTimeError(CHHapticParameterCurve parameterCurve, double time,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("sendParameters:atTime:error:")
    boolean sendParametersAtTimeError(NSArray<? extends CHHapticDynamicParameter> parameters, double time,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("setIsMuted:")
    void setIsMuted(boolean value);

    @Generated
    @Selector("startAtTime:error:")
    boolean startAtTimeError(double time, @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("stopAtTime:error:")
    boolean stopAtTimeError(double time, @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);
}