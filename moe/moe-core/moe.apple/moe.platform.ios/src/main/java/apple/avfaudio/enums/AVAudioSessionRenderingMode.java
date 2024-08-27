package apple.avfaudio.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] AVAudioSessionRenderingMode
 * [@var] AVAudioSessionRenderingModeNotApplicable
 * [@var] AVAudioSessionRenderingModeMonoStereo
 * [@var] AVAudioSessionRenderingModeSurround
 * [@var] AVAudioSessionRenderingModeSpatialAudio
 * [@var] AVAudioSessionRenderingModeDolbyAudio
 * [@var] AVAudioSessionRenderingModeDolbyAtmos
 */
@Generated
public final class AVAudioSessionRenderingMode {
    @Generated
    private AVAudioSessionRenderingMode() {
    }

    /**
     * Default Mode when no asset is loaded or playing
     */
    @Generated @NInt public static final long NotApplicable = 0x0000000000000000L;
    /**
     * Default mode for non multi-channel cases
     */
    @Generated @NInt public static final long MonoStereo = 0x0000000000000001L;
    /**
     * Default mode for multi-channel cases that do not fall into the modes below
     */
    @Generated @NInt public static final long Surround = 0x0000000000000002L;
    /**
     * Fallback mode if provided content is Dolby variant but hardware capabilities don't support it
     */
    @Generated @NInt public static final long SpatialAudio = 0x0000000000000003L;
    /**
     * Dolby Audio mode
     */
    @Generated @NInt public static final long DolbyAudio = 0x0000000000000004L;
    /**
     * Dolby Atmos mode
     */
    @Generated @NInt public static final long DolbyAtmos = 0x0000000000000005L;
}