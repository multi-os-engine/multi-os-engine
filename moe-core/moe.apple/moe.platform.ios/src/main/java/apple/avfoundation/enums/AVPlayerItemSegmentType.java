package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] AVPlayerItemSegmentType
 * 
 * These constants specify the type of segment
 * 
 * [@constant] AVPlayerItemSegmentTypePrimary
 * Indicates segment represent playback of a primary item.
 * [@constant] AVPlayerItemSegmentTypeInterstitial
 * Indicates segment represents playback of an interstitial event.
 * 
 * API-Since: 18.0
 */
@Generated
public final class AVPlayerItemSegmentType {
    @Generated
    private AVPlayerItemSegmentType() {
    }

    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Primary = 0x0000000000000000L;
    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Interstitial = 0x0000000000000001L;
}