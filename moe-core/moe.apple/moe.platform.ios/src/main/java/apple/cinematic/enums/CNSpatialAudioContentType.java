package apple.cinematic.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] CNSpatialAudioContentType
 * 
 * Enum used to generate settings dictionary for export using AssetReader and AssetWriter with Spatial Audio effects
 * burned in
 * 
 * API-Since: 26.0
 */
@Generated
public final class CNSpatialAudioContentType {
    @Generated
    private CNSpatialAudioContentType() {
    }

    /**
     * Export settings to generate an asset with stereo audio and effect burned in
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Stereo = 0x0000000000000000L;
    /**
     * Export settings to generate an asset with spatial audio and effect burned in
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Spatial = 0x0000000000000001L;
}