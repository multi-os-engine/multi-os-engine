package apple.phase.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] PHASEAssetType
 * 
 * Asset types.
 * 
 * Determines how assets are loaded into memory and prepared for playback.
 * 'Preparing' an asset for playback may include decompression and/or format conversion,
 * depending on the type of the underlying asset data.
 * [@constant] PHASEAssetTypeResident
 * If the asset is on disk, it is loaded into memory and prepared for playback.
 * If the asset is in memory, it is prepared for playback.
 * [@constant] PHASEAssetTypeStreamed
 * If the asset is on disk, it is streamed from disk into memory and prepared during playback.
 * If the asset is in memory, it is streamed from memory and prepared during playback.
 */
@Generated
public final class PHASEAssetType {
    @Generated
    private PHASEAssetType() {
    }

    @Generated @NInt public static final long Resident = 0x0000000000000000L;
    @Generated @NInt public static final long Streamed = 0x0000000000000001L;
}
