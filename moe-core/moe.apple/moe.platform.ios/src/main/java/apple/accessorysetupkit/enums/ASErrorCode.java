package apple.accessorysetupkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Error codes used with ASErrorDomain.
 * 
 * API-Since: 18.0
 */
@Generated
public final class ASErrorCode {
    @Generated
    private ASErrorCode() {
    }

    /**
     * Success.
     * 
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Success = 0x0000000000000000L;
    /**
     * Underlying failure with an unknown cause.
     * 
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Unknown = 0x0000000000000001L;
    /**
     * Unable to activate discovery session.
     * 
     * API-Since: 18.0
     */
    @Generated @NInt public static final long ActivationFailed = 0x0000000000000064L;
    /**
     * Unable to establish connection with accessory.
     * 
     * API-Since: 18.0
     */
    @Generated @NInt public static final long ConnectionFailed = 0x0000000000000096L;
    /**
     * Discovery timed out.
     * 
     * API-Since: 18.0
     */
    @Generated @NInt public static final long DiscoveryTimeout = 0x00000000000000C8L;
    /**
     * Unable to find App Extension.
     * 
     * API-Since: 18.0
     */
    @Generated @NInt public static final long ExtensionNotFound = 0x000000000000012CL;
    /**
     * Invalidate was called before the operation completed normally.
     * 
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Invalidated = 0x0000000000000190L;
    /**
     * Invalid request.
     * 
     * API-Since: 18.0
     */
    @Generated @NInt public static final long InvalidRequest = 0x00000000000001C2L;
    /**
     * Picker already active.
     * 
     * API-Since: 18.0
     */
    @Generated @NInt public static final long PickerAlreadyActive = 0x00000000000001F4L;
    /**
     * Picker restricted due to application in background.
     * 
     * API-Since: 18.0
     */
    @Generated @NInt public static final long PickerRestricted = 0x0000000000000226L;
    /**
     * User cancelled.
     * 
     * API-Since: 18.0
     */
    @Generated @NInt public static final long UserCancelled = 0x00000000000002BCL;
    /**
     * Access restricted by user.
     * 
     * API-Since: 18.0
     */
    @Generated @NInt public static final long UserRestricted = 0x00000000000002EEL;
}