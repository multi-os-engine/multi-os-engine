package apple.avfaudio.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] AVAudioEnvironmentOutputType
 * 
 * Types of output for AVAudio3DMixingRenderingAlgorithmAuto
 * 
 * The output type determines the rendering method for any input bus using
 * AVAudio3DMixingRenderingAlgorithmAuto.
 * 
 * AVAudioEnvironmentOutputTypeAuto
 * Automatically detect playback route and pick the correct output type when possible.
 * Wired output defaults to AVAudioEnvironmentOutputTypeHeadphones and Manual Rendering
 * with a two-channel output layout defaults to AVAudioEnvironmentOutputTypeExternalSpeakers.
 * 
 * AVAudioEnvironmentOutputTypeHeadphones
 * Render for headphones.
 * 
 * AVAudioEnvironmentOutputTypeBuiltInSpeakers
 * Render for built-in speakers on the current hardware. The output will not be suitable
 * for playback on other hardware. On iOS devices, the rendering may be specific to
 * device orientation. Manual Rendering modes may not provide the intended rendering if
 * the orientation changes between rendering the audio and playing it back.
 * 
 * AVAudioEnvironmentOutputTypeExternalSpeakers
 * Render for external speakers based on the environment node's output channel layout.
 * 
 * API-Since: 13.0
 */
@Generated
public final class AVAudioEnvironmentOutputType {
    @Generated
    private AVAudioEnvironmentOutputType() {
    }

    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long Auto = 0x0000000000000000L;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long Headphones = 0x0000000000000001L;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long BuiltInSpeakers = 0x0000000000000002L;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long ExternalSpeakers = 0x0000000000000003L;
}
