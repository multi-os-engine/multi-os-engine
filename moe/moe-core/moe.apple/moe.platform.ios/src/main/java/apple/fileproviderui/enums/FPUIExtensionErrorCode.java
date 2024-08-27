package apple.fileproviderui.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * The error codes for errors raised by the File Provider UI extension.
 * 
 * API-Since: 11.0
 */
@Generated
public final class FPUIExtensionErrorCode {
    @Generated
    private FPUIExtensionErrorCode() {
    }

    /**
     * An error indicating that the action was canceled by the user.
     * 
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long UserCancelled = 0x0000000000000000L;
    /**
     * An error indicating that the action has failed.
     * 
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long Failed = 0x0000000000000001L;
}