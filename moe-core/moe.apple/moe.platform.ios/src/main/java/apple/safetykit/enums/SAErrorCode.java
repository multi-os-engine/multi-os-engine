package apple.safetykit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] SAErrorCode
 * 
 * [@constant] SAErrorNotAuthorized The application is not authorized to perform the requested operation.
 * [@constant] SAErrorNotAllowed The API is restricted on this device at the current time.
 * [@constant] SAErrorInvalidArgument An invalid argument was provided to the API.
 * [@constant] SAErrorOperationFailed The requested operation failed, retrying may succeed.
 * 
 * API-Since: 16.0
 */
@Generated
public final class SAErrorCode {
    @Generated
    private SAErrorCode() {
    }

    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long NotAuthorized = 0x0000000000000001L;
    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long NotAllowed = 0x0000000000000002L;
    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long InvalidArgument = 0x0000000000000003L;
    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long OperationFailed = 0x0000000000000004L;
}