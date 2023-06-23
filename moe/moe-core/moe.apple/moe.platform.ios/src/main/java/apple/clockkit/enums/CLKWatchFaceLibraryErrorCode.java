package apple.clockkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 14.0
 */
@Generated
public final class CLKWatchFaceLibraryErrorCode {
    @Generated
    private CLKWatchFaceLibraryErrorCode() {
    }

    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long NotFileURL = 0x0000000000000001L;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long InvalidFile = 0x0000000000000002L;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long PermissionDenied = 0x0000000000000003L;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long FaceNotAvailable = 0x0000000000000004L;
}
