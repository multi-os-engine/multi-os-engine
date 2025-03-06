package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 4.2
 */
@Generated
public final class UIPrintErrorCode {
    @Generated
    private UIPrintErrorCode() {
    }

    /**
     * cannot print at this time
     * 
     * API-Since: 4.2
     */
    @Generated @NInt public static final long PrintingNotAvailableError = 0x0000000000000001L;
    /**
     * empty list of files or images
     * 
     * API-Since: 4.2
     */
    @Generated @NInt public static final long PrintNoContentError = 0x0000000000000002L;
    /**
     * unrecognized image format
     * 
     * API-Since: 4.2
     */
    @Generated @NInt public static final long PrintUnknownImageFormatError = 0x0000000000000003L;
    /**
     * internal error with print job
     * 
     * API-Since: 4.2
     */
    @Generated @NInt public static final long PrintJobFailedError = 0x0000000000000004L;
}