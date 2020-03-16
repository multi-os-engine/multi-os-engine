package apple.corehaptics.protocol;

import apple.foundation.NSError;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("CoreHaptics")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CHHapticDeviceCapability")
public interface CHHapticDeviceCapability {
    @Generated
    @Selector("attributesForDynamicParameter:error:")
    @MappedReturn(ObjCObjectMapper.class)
    Object attributesForDynamicParameterError(String inParameter,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("attributesForEventParameter:eventType:error:")
    @MappedReturn(ObjCObjectMapper.class)
    Object attributesForEventParameterEventTypeError(String inParameter, String type,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("supportsAudio")
    boolean supportsAudio();

    @Generated
    @Selector("supportsHaptics")
    boolean supportsHaptics();
}