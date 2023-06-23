package apple.exposurenotification.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Error codes used with ENErrorDomain.
 * 
 * API-Since: 12.5
 */
@Generated
public final class ENErrorCode {
    @Generated
    private ENErrorCode() {
    }

    /**
     * API-Since: 12.5
     */
    @Generated @NInt public static final long Unknown = 0x0000000000000001L;
    /**
     * Underlying failure with an unknown cause.
     * 
     * API-Since: 12.5
     */
    @Generated @NInt public static final long BadParameter = 0x0000000000000002L;
    /**
     * Missing or incorrect parameter.
     * 
     * API-Since: 12.5
     */
    @Generated @NInt public static final long NotEntitled = 0x0000000000000003L;
    /**
     * Calling process doesn't have the correct entitlement.
     * 
     * API-Since: 12.5
     */
    @Generated @NInt public static final long NotAuthorized = 0x0000000000000004L;
    /**
     * User denied this process access to Exposure Notification functionality.
     * 
     * API-Since: 12.5
     */
    @Generated @NInt public static final long Unsupported = 0x0000000000000005L;
    /**
     * Operation is not supported.
     * 
     * API-Since: 12.5
     */
    @Generated @NInt public static final long Invalidated = 0x0000000000000006L;
    /**
     * Invalidate was called before the operation completed normally.
     * 
     * API-Since: 12.5
     */
    @Generated @NInt public static final long BluetoothOff = 0x0000000000000007L;
    /**
     * Bluetooth was turned off the by user.
     * 
     * API-Since: 12.5
     */
    @Generated @NInt public static final long InsufficientStorage = 0x0000000000000008L;
    /**
     * Insufficient storage space to enable Exposure Notification.
     * 
     * API-Since: 12.5
     */
    @Generated @NInt public static final long NotEnabled = 0x0000000000000009L;
    /**
     * Exposure Notification has not been enabled.
     * 
     * API-Since: 12.5
     */
    @Generated @NInt public static final long APIMisuse = 0x000000000000000AL;
    /**
     * The API was used incorrectly.
     * 
     * API-Since: 12.5
     */
    @Generated @NInt public static final long Internal = 0x000000000000000BL;
    /**
     * Internal error. This indicates a bug in this framework.
     * 
     * API-Since: 12.5
     */
    @Generated @NInt public static final long InsufficientMemory = 0x000000000000000CL;
    /**
     * Not enough memory to perform an operation.
     * 
     * API-Since: 12.5
     */
    @Generated @NInt public static final long RateLimited = 0x000000000000000DL;
    /**
     * API called too frequently. See API for acceptable frequency.
     * 
     * API-Since: 12.5
     */
    @Generated @NInt public static final long Restricted = 0x000000000000000EL;
    /**
     * Exposure Notification is disabled due to system policies.
     * 
     * API-Since: 12.5
     */
    @Generated @NInt public static final long BadFormat = 0x000000000000000FL;
    /**
     * File or data format problem.
     * 
     * API-Since: 12.5
     */
    @Generated @NInt public static final long DataInaccessible = 0x0000000000000010L;
    /**
     * The device must be unlocked before data is accessible.
     * 
     * API-Since: 12.5
     */
    @Generated @NInt public static final long TravelStatusNotAvailable = 0x0000000000000011L;
}
