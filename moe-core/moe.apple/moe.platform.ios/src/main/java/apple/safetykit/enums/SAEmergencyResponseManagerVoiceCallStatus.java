package apple.safetykit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * This enumeration defines the status of requested voice call
 * [@sa] SAEmergencyResponseManagerVoiceCallStatus
 * 
 * API-Since: 16.0
 */
@Generated
public final class SAEmergencyResponseManagerVoiceCallStatus {
    @Generated
    private SAEmergencyResponseManagerVoiceCallStatus() {
    }

    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Dialing = 0x0000000000000000L;
    /**
     * < the system is dialing the voice call
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Active = 0x0000000000000001L;
    /**
     * < the system dialed voice call is disconnected after being active
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Disconnected = 0x0000000000000002L;
    /**
     * < the system dialed voice call failed to connect
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Failed = 0x0000000000000003L;
}