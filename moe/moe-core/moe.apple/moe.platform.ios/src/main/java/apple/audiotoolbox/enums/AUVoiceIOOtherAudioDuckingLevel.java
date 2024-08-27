package apple.audiotoolbox.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@enum] AUVoiceIOOtherAudioDuckingLevel
 * 
 * Ducking level applied to other (i.e. non-voice) audio by AUVoiceIO.
 * 
 * DuckingLevelDefault = Default ducking level to other audio for typical voice chat.
 * DuckingLevelMin = minimum ducking to other audio.
 * DuckingLevelMid = medium ducking to other audio.
 * DuckingLevelMax = maximum ducking to other audio.
 */
@Generated
public final class AUVoiceIOOtherAudioDuckingLevel {
    @Generated
    private AUVoiceIOOtherAudioDuckingLevel() {
    }

    @Generated public static final int Default = 0x00000000;
    @Generated public static final int Min = 0x0000000A;
    @Generated public static final int Mid = 0x00000014;
    @Generated public static final int Max = 0x0000001E;
}