package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * [@enum]			AVVariantPreferences
 * <p>
 * These constants can be used in any combination as the value of variantPreferences.
 * <p>
 * [@constant]		AVVariantPreferenceNone
 * Indicates that only the basic behaviors of the player for choosing among variants should be applied, including considerations of available bandwidth, compatibility of the indicated codec or codecs, the dimensions of visual output, and the number of available audio output channels.
 * [@constant]		AVVariantPreferenceScalabilityToLosslessAudio
 * Directs the item to permit the use of variants with lossless audio encodings, if sufficient bandwidth is available for their use.
 */
@Generated
public final class AVVariantPreferences {
    @Generated
    private AVVariantPreferences() {
    }

    @Generated @NUInt public static final long None = 0x0000000000000000L;
    @Generated @NUInt public static final long ScalabilityToLosslessAudio = 0x0000000000000001L;
}
