package apple.photosui.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * A mode that determines which representation \c PHPickerViewController should provide for an asset given a type
 * identifier, if multiple representations are available.
 * 
 * API-Since: 14.0
 */
@Generated
public final class PHPickerConfigurationAssetRepresentationMode {
    @Generated
    private PHPickerConfigurationAssetRepresentationMode() {
    }

    /**
     * Uses the best representation determined by the system. This may change in future releases.
     * 
     * API-Since: 14.0
     */
    @Generated @NInt public static final long Automatic = 0x0000000000000000L;
    /**
     * Uses the current representation to avoid transcoding if possible.
     * 
     * API-Since: 14.0
     */
    @Generated @NInt public static final long Current = 0x0000000000000001L;
    /**
     * Uses the most compatible representation if possible, even if transcoding is required.
     * 
     * API-Since: 14.0
     */
    @Generated @NInt public static final long Compatible = 0x0000000000000002L;
}