package apple.exposurenotification.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Error codes used with ENErrorDomain.
 */
@Generated
public final class ENErrorCode {
    @Generated
    private ENErrorCode() {
    }

    @Generated @NInt public static final long Unknown = 0x0000000000000001L;
    /**
     * Underlying failure with an unknown cause.
     */
    @Generated @NInt public static final long BadParameter = 0x0000000000000002L;
    /**
     * Missing or incorrect parameter.
     */
    @Generated @NInt public static final long NotEntitled = 0x0000000000000003L;
    /**
     * Calling process doesn't have the correct entitlement.
     */
    @Generated @NInt public static final long NotAuthorized = 0x0000000000000004L;
    /**
     * User denied this process access to Exposure Notification functionality.
     */
    @Generated @NInt public static final long Unsupported = 0x0000000000000005L;
    /**
     * Operation is not supported.
     */
    @Generated @NInt public static final long Invalidated = 0x0000000000000006L;
    /**
     * Invalidate was called before the operation completed normally.
     */
    @Generated @NInt public static final long BluetoothOff = 0x0000000000000007L;
    /**
     * Bluetooth was turned off the by user.
     */
    @Generated @NInt public static final long InsufficientStorage = 0x0000000000000008L;
    /**
     * Insufficient storage space to enable Exposure Notification.
     */
    @Generated @NInt public static final long NotEnabled = 0x0000000000000009L;
    /**
     * Exposure Notification has not been enabled.
     */
    @Generated @NInt public static final long APIMisuse = 0x000000000000000AL;
    /**
     * The API was used incorrectly.
     */
    @Generated @NInt public static final long Internal = 0x000000000000000BL;
    /**
     * Internal error. This indicates a bug in this framework.
     */
    @Generated @NInt public static final long InsufficientMemory = 0x000000000000000CL;
    /**
     * Not enough memory to perform an operation.
     */
    @Generated @NInt public static final long RateLimited = 0x000000000000000DL;
    /**
     * API called too frequently. See API for acceptable frequency.
     */
    @Generated @NInt public static final long Restricted = 0x000000000000000EL;
    /**
     * Exposure Notification is disabled due to system policies.
     */
    @Generated @NInt public static final long BadFormat = 0x000000000000000FL;
    /**
     * File or data format problem.
     */
    @Generated @NInt public static final long DataInaccessible = 0x0000000000000010L;
    /**
     * The device must be unlocked before data is accessible.
     */
    @Generated @NInt public static final long TravelStatusNotAvailable = 0x0000000000000011L;
}
