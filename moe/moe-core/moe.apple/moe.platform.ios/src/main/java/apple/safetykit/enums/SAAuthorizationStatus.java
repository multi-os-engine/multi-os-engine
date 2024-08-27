package apple.safetykit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * SAAuthorizationStatus
 * 
 * Discussion:
 * Represents the current motion authorization state.
 * 
 * SAAuthorizationStatusNotDetermined when the user has not been prompted yet.
 * SAAuthorizationStatusDenied when access is denied by the user.
 * SAAuthorizationStatusAuthorized when access is authorized by the user.
 */
@Generated
public final class SAAuthorizationStatus {
    @Generated
    private SAAuthorizationStatus() {
    }

    @Generated @NInt public static final long NotDetermined = 0x0000000000000000L;
    @Generated @NInt public static final long Denied = 0x0000000000000001L;
    @Generated @NInt public static final long Authorized = 0x0000000000000002L;
}