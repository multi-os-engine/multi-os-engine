package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * [@enum] AVVariantPreferences
 * 
 * These constants can be used in any combination as the value of variantPreferences.
 * 
 * [@constant] AVVariantPreferenceNone
 * Indicates that only the basic behaviors of the player for choosing among variants should be applied, including
 * considerations of available bandwidth, compatibility of the indicated codec or codecs, the dimensions of visual
 * output, and the number of available audio output channels.
 * [@constant] AVVariantPreferenceScalabilityToLosslessAudio
 * Directs the item to permit the use of variants with lossless audio encodings, if sufficient bandwidth is available
 * for their use.
 * 
 * API-Since: 14.5
 */
@Generated
public final class AVVariantPreferences {
    @Generated
    private AVVariantPreferences() {
    }

    /**
     * API-Since: 14.5
     */
    @Generated @NUInt public static final long None = 0x0000000000000000L;
    /**
     * API-Since: 14.5
     */
    @Generated @NUInt public static final long ScalabilityToLosslessAudio = 0x0000000000000001L;
}
