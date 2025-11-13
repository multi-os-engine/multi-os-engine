package apple.audiotoolbox.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Configure the distribution of audio channels in 3D space.
 * 
 * The Objective-C version of the ``SpatialAudioExperiences.SoundStageSize`` Swift type.
 */
@Generated
public final class CASoundStageSize {
    @Generated
    private CASoundStageSize() {
    }

    /**
     * A system-defined sound stage size.
     */
    @Generated @NInt public static final long Automatic = 0x0000000000000000L;
    /**
     * Places all of an audio stream's channels near the layout's front.
     */
    @Generated @NInt public static final long Small = 0x0000000000000001L;
    /**
     * Pulls an audio stream's channels closer to the channel layout's front.
     */
    @Generated @NInt public static final long Medium = 0x0000000000000002L;
    /**
     * Spreads an audio stream's channels around the user according to the
     * coordinates described in its channel layout.
     */
    @Generated @NInt public static final long Large = 0x0000000000000003L;
}