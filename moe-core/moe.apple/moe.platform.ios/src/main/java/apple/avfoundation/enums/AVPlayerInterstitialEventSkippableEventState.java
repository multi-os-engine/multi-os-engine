package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * These constants describe the state for a skippable AVPlayerInterstitialEvent.
 * 
 * API-Since: 26.0
 */
@Generated
public final class AVPlayerInterstitialEventSkippableEventState {
    @Generated
    private AVPlayerInterstitialEventSkippableEventState() {
    }

    /**
     * Indicates that the interstitial event is not skippable.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long NotSkippable = 0x0000000000000000L;
    /**
     * Indicates that the interstitial event will eventually become eligible to be skipped.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long NotYetEligible = 0x0000000000000001L;
    /**
     * Indicates that the interstitial event is currently skippable.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Eligible = 0x0000000000000002L;
    /**
     * Indicates that the interstitial event is no longer eligible to be skipped.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long NoLongerEligible = 0x0000000000000003L;
}