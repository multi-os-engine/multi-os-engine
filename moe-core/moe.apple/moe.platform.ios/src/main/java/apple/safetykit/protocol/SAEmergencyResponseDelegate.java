package apple.safetykit.protocol;

import apple.safetykit.SAEmergencyResponseManager;
import org.jetbrains.annotations.NotNull;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * SAEmergencyResponseDelegate
 * 
 * SAEmergencyResponseManager notifies its delegate about status of the requested emergency response action
 * 
 * [@sa] SAEmergencyResponseManager
 * 
 * API-Since: 16.0
 */
@Generated
@Library("SafetyKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("SAEmergencyResponseDelegate")
public interface SAEmergencyResponseDelegate {
    /**
     * Voice call can be requested when running in the foreground or background within a limited time window of a
     * detected emergency event,
     * Use this delegate to monitor the status of the requested voice call.
     */
    @Generated
    @IsOptional
    @Selector("emergencyResponseManager:didUpdateVoiceCallStatus:")
    default void emergencyResponseManagerDidUpdateVoiceCallStatus(
            @NotNull SAEmergencyResponseManager emergencyResponseManager, @NInt long voiceCallStatus) {
        throw new java.lang.UnsupportedOperationException();
    }
}