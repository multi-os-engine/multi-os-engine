package apple.sensorkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * [@typedef] SRSpeechMetricsSessionFlags
 * 
 * Flags indicating more information about how audio processing was done
 * on the audio stream
 * 
 * [@const] SRSpeechMetricsSessionFlagsDefault
 * 
 * Audio stream went through the system voice processor
 * 
 * [@const] SRSpeechMetricsSessionFlagsBypassVoiceProcessing
 * 
 * Audio stream bypassed the system voice processor.
 * 
 * 
 * API-Since: 17.0
 */
@Generated
public final class SRSpeechMetricsSessionFlags {
    @Generated
    private SRSpeechMetricsSessionFlags() {
    }

    /**
     * API-Since: 17.0
     */
    @Generated @NUInt public static final long Default = 0x0000000000000000L;
    /**
     * API-Since: 17.0
     */
    @Generated @NUInt public static final long BypassVoiceProcessing = 0x0000000000000001L;
}