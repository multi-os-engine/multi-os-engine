package apple.avfaudio.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] AVAudioVoiceProcessingOtherAudioDuckingLevel
 * 
 * Ducking level applied to other (i.e. non-voice) audio by AVAudio voice processing AU.
 * 
 * DuckingLevelDefault = Default ducking level to other audio for typical voice chat.
 * DuckingLevelMin = minimum ducking to other audio.
 * DuckingLevelMid = medium ducking to other audio.
 * DuckingLevelMax = maximum ducking to other audio.
 * 
 * API-Since: 17.0
 */
@Generated
public final class AVAudioVoiceProcessingOtherAudioDuckingLevel {
    @Generated
    private AVAudioVoiceProcessingOtherAudioDuckingLevel() {
    }

    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long Default = 0x0000000000000000L;
    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long Min = 0x000000000000000AL;
    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long Mid = 0x0000000000000014L;
    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long Max = 0x000000000000001EL;
}