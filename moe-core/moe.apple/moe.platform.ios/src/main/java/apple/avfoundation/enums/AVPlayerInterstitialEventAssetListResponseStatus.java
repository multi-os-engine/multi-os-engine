package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * These constants describe the status of the asset list response for an AVPlayerInterstitialEvent.
 * 
 * API-Since: 16.4
 */
@Generated
public final class AVPlayerInterstitialEventAssetListResponseStatus {
    @Generated
    private AVPlayerInterstitialEventAssetListResponseStatus() {
    }

    /**
     * Indicates that the asset list response is now available and non-nil, meaning the asset list read was successful.
     * 
     * API-Since: 16.4
     */
    @Generated @NInt public static final long Available = 0x0000000000000000L;
    /**
     * Indicates that asset list response has been cleared and reverted to its original state of nil.
     * 
     * API-Since: 16.4
     */
    @Generated @NInt public static final long Cleared = 0x0000000000000001L;
    /**
     * Indicates that the asset list response is unavailable, meaning the asset list read failed.
     * 
     * API-Since: 16.4
     */
    @Generated @NInt public static final long Unavailable = 0x0000000000000002L;
}