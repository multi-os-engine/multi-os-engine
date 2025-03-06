package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] AVCaptureMultichannelAudioMode
 * 
 * Constants indicating the modes of multichannel audio.
 * 
 * [@constant] AVCaptureMultichannelAudioModeNone
 * Indicates that no multichannel audio should be used.
 * [@constant] AVCaptureMultichannelAudioModeStereo
 * Indicates that the audio should be recorded using stereo.
 * [@constant] AVCaptureMultichannelAudioModeFirstOrderAmbisonics
 * Indicates that the audio should be recorded using first-order ambisonics. When recording a QuickTime movie file, a
 * stereo audio track will be recorded alongside the FOA track for backward playback compatibility.
 * 
 * API-Since: 18.0
 */
@Generated
public final class AVCaptureMultichannelAudioMode {
    @Generated
    private AVCaptureMultichannelAudioMode() {
    }

    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long None = 0x0000000000000000L;
    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Stereo = 0x0000000000000001L;
    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long FirstOrderAmbisonics = 0x0000000000000002L;
}