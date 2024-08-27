package apple.safetykit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * This enumeration defines possible emergency responses to a crash event
 * [@sa] SACrashDetectionEventResponse
 * 
 * API-Since: 16.0
 */
@Generated
public final class SACrashDetectionEventResponse {
    @Generated
    private SACrashDetectionEventResponse() {
    }

    /**
     * < Emergency SOS response for the crash event was attempted
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Attempted = 0x0000000000000000L;
    /**
     * < Emergency SOS response for crash events is disabled
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Disabled = 0x0000000000000001L;
}