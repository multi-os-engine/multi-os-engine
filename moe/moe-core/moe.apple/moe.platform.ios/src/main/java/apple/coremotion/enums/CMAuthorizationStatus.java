package apple.coremotion.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * CMAuthorizationStatus
 * 
 * Discussion:
 * Represents the current motion authorization state.
 * 
 * CMAuthorizationStatusNotDetermined when the user has not been prompted yet.
 * CMAuthorizationStatusRestricted when access is denied due to system-wide restrictions.
 * CMAuthorizationStatusDenied when access is denied by the user.
 * CMAuthorizationStatusAuthorized when access is authorized by the user.
 * 
 * 
 * API-Since: 11.0
 */
@Generated
public final class CMAuthorizationStatus {
    @Generated
    private CMAuthorizationStatus() {
    }

    /**
     * API-Since: 11.0
     */
    @Generated @NInt public static final long NotDetermined = 0x0000000000000000L;
    /**
     * API-Since: 11.0
     */
    @Generated @NInt public static final long Restricted = 0x0000000000000001L;
    /**
     * API-Since: 11.0
     */
    @Generated @NInt public static final long Denied = 0x0000000000000002L;
    /**
     * API-Since: 11.0
     */
    @Generated @NInt public static final long Authorized = 0x0000000000000003L;
}
