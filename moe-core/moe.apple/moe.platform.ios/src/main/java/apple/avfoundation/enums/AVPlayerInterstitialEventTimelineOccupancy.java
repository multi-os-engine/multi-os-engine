package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] AVPlayerInterstitialEventTimelineOccupancy
 * 
 * These constants specify how an event occupies time on AVPlayerItemIntegratedTimeline.
 * 
 * [@constant] AVPlayerInterstitialEventTimelineOccupancySinglePoint
 * Indicates this interstitial event occupies a single point on AVPlayerItemIntegratedTimeline.
 * [@constant] AVPlayerInterstitialEventTimelineOccupancyFill
 * Indicates this interstitial event fills AVPlayerItemIntegratedTimeline with the duration of this event.
 * 
 * API-Since: 18.0
 */
@Generated
public final class AVPlayerInterstitialEventTimelineOccupancy {
    @Generated
    private AVPlayerInterstitialEventTimelineOccupancy() {
    }

    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long SinglePoint = 0x0000000000000000L;
    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Fill = 0x0000000000000001L;
}