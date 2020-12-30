package apple.photosui.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * A mode that determines which representation an item provider should provide if multiple representations of the same asset are available for the requested type identifier or class.
 */
@Generated
public final class PHPickerConfigurationAssetRepresentationMode {
    @Generated
    private PHPickerConfigurationAssetRepresentationMode() {
    }

    /**
     * Uses the best representation determined by the system. This may change in future releases.
     */
    @Generated @NInt public static final long Automatic = 0x0000000000000000L;
    /**
     * Uses the current representation to avoid transcoding if possible.
     */
    @Generated @NInt public static final long Current = 0x0000000000000001L;
    /**
     * Uses the most compatible representation if possible.
     */
    @Generated @NInt public static final long Compatible = 0x0000000000000002L;
}