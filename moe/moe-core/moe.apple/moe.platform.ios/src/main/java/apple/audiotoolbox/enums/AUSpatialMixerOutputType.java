package apple.audiotoolbox.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@enum] Property values for kAudioUnitProperty_SpatialMixerOutputType
 * <p>
 * [@constant] kSpatialMixerOutputType_Headphones
 * <p>
 * Render for headphones.
 * <p>
 * [@constant] kSpatialMixerOutputType_BuiltInSpeakers
 * <p>
 * Render for built-in speakers. The spatialization is optimized for current hardware and
 * will not be suitable for playback on other hardware. On iOS devices, the rendering may
 * be specific to device orientation. Non-realtime rendering may not provide intended results
 * if the orientation changes between rendering the audio and playing it back.
 * <p>
 * [@constant] kSpatialMixerOutputType_ExternalSpeakers
 * <p>
 * Render for external speakers based on the mixer's output channel layout.
 */
@Generated
public final class AUSpatialMixerOutputType {
    @Generated
    private AUSpatialMixerOutputType() {
    }

    @Generated public static final int Headphones = 0x00000001;
    @Generated public static final int BuiltInSpeakers = 0x00000002;
    @Generated public static final int ExternalSpeakers = 0x00000003;
}
