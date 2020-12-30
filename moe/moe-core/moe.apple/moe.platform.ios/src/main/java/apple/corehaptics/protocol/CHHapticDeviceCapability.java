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

/**
 * @protocol CHHapticDeviceCapability
 * @abstract
 * 	A protocol which defines properties describing haptics and audio capabilities for a particular device.
 * 	These properties include limitations and ranges of parameters.
 */
@Generated
@Library("CoreHaptics")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CHHapticDeviceCapability")
public interface CHHapticDeviceCapability {
    /**
     * @method attributesForEventParameter:
     * @abstract
     * 	Return information about the given CHHapticDynamicParameter.
     * @param inParameter
     * 	A CHHapticDynamicParameter to be queried.
     * @param outError
     * 	If the operation fails, this will be set to a valid NSError describing the error.
     * @discussion
     * 	These values may vary across different device types.
     */
    @Generated
    @Selector("attributesForDynamicParameter:error:")
    @MappedReturn(ObjCObjectMapper.class)
    CHHapticParameterAttributes attributesForDynamicParameterError(String inParameter,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * @method attributesForEventParameter:
     * @abstract
     * 	Return information about the given CHHapticEventParameter as it applies to the specified event type.
     * @param inParameter
     * 	A CHHapticEventParameter to be queried.
     * @param type
     * 	A CHHapticEventType to be queried.
     * @param outError
     * 	If the operation fails, this will be set to a valid NSError describing the error.
     * @discussion
     * 	These values may vary across different device types.
     */
    @Generated
    @Selector("attributesForEventParameter:eventType:error:")
    @MappedReturn(ObjCObjectMapper.class)
    CHHapticParameterAttributes attributesForEventParameterEventTypeError(String inParameter, String type,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * @property supportsAudio
     * @abstract
     * 	Returns YES if the hardware supports audio event playback.
     */
    @Generated
    @Selector("supportsAudio")
    boolean supportsAudio();

    /**
     * @property supportsHaptics
     * @abstract
     * 	Returns YES if the hardware supports haptic event playback.
     */
    @Generated
    @Selector("supportsHaptics")
    boolean supportsHaptics();
}