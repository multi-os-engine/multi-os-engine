package apple.fileprovider.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * API-Since: 16.0
 */
@Generated
public final class NSFileProviderModifyItemOptions {
    @Generated
    private NSFileProviderModifyItemOptions() {
    }

    /**
     * We're moving the item to a location where it may refer to an item that already exists. This may happen
     * when two directories are being merged together. When this happens some items may be merged to the
     * same directory and we end up in a situation where the merged contains may also exist.
     * 
     * This is similar to NSFileProviderCreateItemMayAlreadyExist
     * 
     * API-Since: 16.0
     */
    @Generated @NUInt public static final long NSFileProviderModifyItemMayAlreadyExist = 0x0000000000000001L;
}