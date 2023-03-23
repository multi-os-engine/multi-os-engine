package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * [@typedef] AVAssetTrackGroupOutputHandling
 * 
 * A bitfield type that specifies output handling policies for alternate tracks in a track group.
 * 
 * [@constant] AVAssetTrackGroupOutputHandlingNone
 * 
 * No specific processing directives are applied to alternate tracks. The output is produced without regard to alternate
 * track group assignments in the original asset.
 * [@constant] AVAssetTrackGroupOutputHandlingPreserveAlternateTracks
 * 
 * Preserve alternate tracks via pass-through.
 * 
 * API-Since: 16.0
 */
@Generated
public final class AVAssetTrackGroupOutputHandling {
    @Generated
    private AVAssetTrackGroupOutputHandling() {
    }

    /**
     * API-Since: 16.0
     */
    @Generated @NUInt public static final long None = 0x0000000000000000L;
    /**
     * API-Since: 16.0
     */
    @Generated @NUInt public static final long PreserveAlternateTracks = 0x0000000000000001L;
    /**
     * API-Since: 16.0
     */
    @Generated @NUInt public static final long DefaultPolicy = 0x0000000000000000L;
}