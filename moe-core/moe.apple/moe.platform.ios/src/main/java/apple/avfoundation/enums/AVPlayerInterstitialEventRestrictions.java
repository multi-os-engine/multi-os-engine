package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * [@enum] AVPlayerInterstitialEventRestrictions
 * 
 * These constants can be specified when creating AVPlayerInterstitialEvents in order to configure their behavior.
 * 
 * [@constant] AVPlayerInterstitialEventRestrictionNone
 * Indicates that the user may freely employ playback controls, as available, both within the primary content and in the
 * interstitial content specified for the event.
 * [@constant] AVPlayerInterstitialEventRestrictionConstrainsSeekingForwardInPrimaryContent
 * Indicates that seeking within the primary content from a date prior to the date of the event to a date subsequent to
 * the date of the event is not permitted.
 * [@constant] AVPlayerInterstitialEventRestrictionRequiresPlaybackAtPreferredRateForAdvancement
 * Indicates that advancing the currentTime within an interstitial item, either by seeking ahead or by setting the
 * playback rate to a value greater than the item's asset's preferredRate, is not permitted.
 * 
 * API-Since: 15.0
 */
@Generated
public final class AVPlayerInterstitialEventRestrictions {
    @Generated
    private AVPlayerInterstitialEventRestrictions() {
    }

    /**
     * API-Since: 15.0
     */
    @Generated @NUInt public static final long None = 0x0000000000000000L;
    /**
     * API-Since: 15.0
     */
    @Generated @NUInt public static final long ConstrainsSeekingForwardInPrimaryContent = 0x0000000000000001L;
    /**
     * API-Since: 15.0
     */
    @Generated @NUInt public static final long RequiresPlaybackAtPreferredRateForAdvancement = 0x0000000000000004L;
    /**
     * API-Since: 15.0
     */
    @Generated @NUInt public static final long DefaultPolicy = 0x0000000000000000L;
}
