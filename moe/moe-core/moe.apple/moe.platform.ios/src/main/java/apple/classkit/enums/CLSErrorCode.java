package apple.classkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum]      CLSErrorCode
 * <p>
 * [@constant]  CLSErrorCodeNone                         No error.
 * [@constant]  CLSErrorCodeClassKitUnavailable       	 ClassKit is not available on this device.
 * [@constant]  CLSErrorCodeInvalidArgument              An invalid argument was provided to the API.
 * [@constant]  CLSErrorCodeInvalidModification          Attempted to modify a readonly object.
 * [@constant]  CLSErrorCodeAuthorizationDenied          The application is not authorized to perform the requested operation.
 * [@constant]  CLSErrorCodeDatabaseInaccessible         Protected ClassKit is inaccessible because the device is locked.
 * [@constant]  CLSErrorCodeLimits                       Limits exceeded.
 * [@constant]  CLSErrorCodeInvalidCreate                Attempted to save new object that already exists in the data store.
 * [@constant]  CLSErrorCodeInvalidUpdate                Failed to save updated object in the data store.
 * [@constant]  CLSErrorCodePartialFailure               Returned if an operation resulted in a mix of successes and failures.
 * [@constant]  CLSErrorCodeInvalidAccountCredentials    Returned if an operation failed because the user MAID account credentials are invalid.
 */
@Generated
public final class CLSErrorCode {
    @Generated
    private CLSErrorCode() {
    }

    @Generated @NInt public static final long None = 0x0000000000000000L;
    @Generated @NInt public static final long ClassKitUnavailable = 0x0000000000000001L;
    @Generated @NInt public static final long InvalidArgument = 0x0000000000000002L;
    @Generated @NInt public static final long InvalidModification = 0x0000000000000003L;
    @Generated @NInt public static final long AuthorizationDenied = 0x0000000000000004L;
    @Generated @NInt public static final long DatabaseInaccessible = 0x0000000000000005L;
    @Generated @NInt public static final long Limits = 0x0000000000000006L;
    @Generated @NInt public static final long InvalidCreate = 0x0000000000000007L;
    @Generated @NInt public static final long InvalidUpdate = 0x0000000000000008L;
    @Generated @NInt public static final long PartialFailure = 0x0000000000000009L;
    @Generated @NInt public static final long InvalidAccountCredentials = 0x000000000000000AL;
}
