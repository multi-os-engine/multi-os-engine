package apple.avfaudio.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] AVAudioVoiceProcessingSpeechActivityEvent
 * 
 * Types of speech activity events.
 * [@constant] AVAudioVoiceProcessingSpeechActivityStarted
 * Speech activity has started.
 * [@constant] AVAudioVoiceProcessingSpeechActivityEnded
 * Speech activity has ended.
 * 
 * API-Since: 17.0
 */
@Generated
public final class AVAudioVoiceProcessingSpeechActivityEvent {
    @Generated
    private AVAudioVoiceProcessingSpeechActivityEvent() {
    }

    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long Started = 0x0000000000000000L;
    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long Ended = 0x0000000000000001L;
}