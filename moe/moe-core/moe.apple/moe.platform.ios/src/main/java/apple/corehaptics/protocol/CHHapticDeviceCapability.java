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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * [@protocol] CHHapticDeviceCapability
 * 
 * A protocol which defines properties describing haptics and audio capabilities for a particular device.
 * These properties include limitations and ranges of parameters.
 * 
 * API-Since: 13.0
 */
@Generated
@Library("CoreHaptics")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CHHapticDeviceCapability")
public interface CHHapticDeviceCapability {
    /**
     * attributesForEventParameter:
     * 
     * Return information about the given CHHapticDynamicParameter.
     * 
     * These values may vary across different device types.
     * 
     * @param inParameter
     *                    A CHHapticDynamicParameter to be queried.
     * @param outError
     *                    If the operation fails, this will be set to a valid NSError describing the error.
     */
    @Nullable
    @Generated
    @Selector("attributesForDynamicParameter:error:")
    @MappedReturn(ObjCObjectMapper.class)
    CHHapticParameterAttributes attributesForDynamicParameterError(@NotNull String inParameter,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * attributesForEventParameter:
     * 
     * Return information about the given CHHapticEventParameter as it applies to the specified event type.
     * 
     * These values may vary across different device types.
     * 
     * @param inParameter
     *                    A CHHapticEventParameter to be queried.
     * @param type
     *                    A CHHapticEventType to be queried.
     * @param outError
     *                    If the operation fails, this will be set to a valid NSError describing the error.
     */
    @Nullable
    @Generated
    @Selector("attributesForEventParameter:eventType:error:")
    @MappedReturn(ObjCObjectMapper.class)
    CHHapticParameterAttributes attributesForEventParameterEventTypeError(@NotNull String inParameter,
            @NotNull String type, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * [@property] supportsAudio
     * 
     * Returns YES if the hardware supports audio event playback.
     */
    @Generated
    @Selector("supportsAudio")
    boolean supportsAudio();

    /**
     * [@property] supportsHaptics
     * 
     * Returns YES if the hardware supports haptic event playback.
     */
    @Generated
    @Selector("supportsHaptics")
    boolean supportsHaptics();
}
