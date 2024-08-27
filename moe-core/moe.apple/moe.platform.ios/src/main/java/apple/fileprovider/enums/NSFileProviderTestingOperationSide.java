package apple.fileprovider.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * Side affected by the operation.
 * 
 * API-Since: 16.0
 */
@Generated
public final class NSFileProviderTestingOperationSide {
    @Generated
    private NSFileProviderTestingOperationSide() {
    }

    /**
     * The operation reads or writes the disk.
     * 
     * API-Since: 16.0
     */
    @Generated @NUInt public static final long Disk = 0x0000000000000000L;
    /**
     * The operation reads or writes the file provider extension.
     * 
     * API-Since: 16.0
     */
    @Generated @NUInt public static final long FileProvider = 0x0000000000000001L;
}