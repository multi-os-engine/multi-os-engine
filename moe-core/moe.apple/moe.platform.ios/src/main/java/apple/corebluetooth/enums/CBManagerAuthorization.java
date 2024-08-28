package apple.corebluetooth.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] CBManagerAuthorization
 * 
 * Represents the current authorization state of a CBManager.
 * 
 * [@constant] CBManagerAuthorizationStatusNotDetermined User has not yet made a choice with regards to this
 * application.
 * [@constant] CBManagerAuthorizationStatusRestricted This application is not authorized to use bluetooth. The user
 * cannot change this application’s status,
 * possibly due to active restrictions such as parental controls being in place.
 * [@constant] CBManagerAuthorizationStatusDenied User has explicitly denied this application from using bluetooth.
 * [@constant] CBManagerAuthorizationStatusAuthorizedAlways User has authorized this application to use bluetooth
 * always.
 * 
 * 
 * API-Since: 13.0
 */
@Generated
public final class CBManagerAuthorization {
    @Generated
    private CBManagerAuthorization() {
    }

    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long NotDetermined = 0x0000000000000000L;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long Restricted = 0x0000000000000001L;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long Denied = 0x0000000000000002L;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long AllowedAlways = 0x0000000000000003L;
}
