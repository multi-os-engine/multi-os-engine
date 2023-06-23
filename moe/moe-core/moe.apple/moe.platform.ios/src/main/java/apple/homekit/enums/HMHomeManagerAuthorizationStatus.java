package apple.homekit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * The home data authorization status of the client process.
 * 
 * [@constant] HMHomeManagerAuthorizationStatusDetermined Indicates the user has not yet made a choice regarding the
 * access of the application.
 * [@constant] HMHomeManagerAuthorizationStatusRestricted Access to home data is currently restricted by the system.
 * [@constant] HMHomeManagerAuthorizationStatusAuthorized The application is authorized to access home data.
 * 
 * API-Since: 13.0
 */
@Generated
public final class HMHomeManagerAuthorizationStatus {
    @Generated
    private HMHomeManagerAuthorizationStatus() {
    }

    /**
     * API-Since: 13.0
     */
    @Generated @NUInt public static final long Determined = 0x0000000000000001L;
    /**
     * API-Since: 13.0
     */
    @Generated @NUInt public static final long Restricted = 0x0000000000000002L;
    /**
     * API-Since: 13.0
     */
    @Generated @NUInt public static final long Authorized = 0x0000000000000004L;
}
