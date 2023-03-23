package apple.healthkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] HKAuthorizationRequestStatus
 * 
 * This enumerated type is used to indicate whether it is necessary to request authorization from the user.
 * 
 * [@constant] HKAuthorizationRequestStatusUnknown The authorization request status could not be determined because
 * an error occurred.
 * [@constant] HKAuthorizationRequestStatusShouldRequest The application should request authorization from the user.
 * [@constant] HKAuthorizationRequestStatusUnnecessary Requesting authorization from the user is unnecessary.
 * 
 * API-Since: 12.0
 */
@Generated
public final class HKAuthorizationRequestStatus {
    @Generated
    private HKAuthorizationRequestStatus() {
    }

    /**
     * API-Since: 12.0
     */
    @Generated @NInt public static final long Unknown = 0x0000000000000000L;
    /**
     * API-Since: 12.0
     */
    @Generated @NInt public static final long ShouldRequest = 0x0000000000000001L;
    /**
     * API-Since: 12.0
     */
    @Generated @NInt public static final long Unnecessary = 0x0000000000000002L;
}
