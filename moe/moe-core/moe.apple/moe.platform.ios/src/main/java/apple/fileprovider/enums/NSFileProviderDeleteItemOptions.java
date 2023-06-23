package apple.fileprovider.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * Options passed on item deletion.
 * 
 * API-Since: 16.0
 */
@Generated
public final class NSFileProviderDeleteItemOptions {
    @Generated
    private NSFileProviderDeleteItemOptions() {
    }

    /**
     * The deletion of the item is recursive.
     * 
     * API-Since: 16.0
     */
    @Generated @NUInt public static final long NSFileProviderDeleteItemRecursive = 0x0000000000000001L;
}