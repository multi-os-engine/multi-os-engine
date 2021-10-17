package apple.exposurenotification.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * ===========================================================================================================================
 * <p>
 * Indicates the status of authorization for the app.
 */
@Generated
public final class ENAuthorizationStatus {
    @Generated
    private ENAuthorizationStatus() {
    }

    /**
     * Authorization status has not yet been determined.
     * This status means the user has not been prompted yet. Using the API in this state may prompt the user.
     */
    @Generated @NInt public static final long Unknown = 0x0000000000000000L;
    /**
     * This app is not authorized to use Exposure Notification. The user cannot change this app's authorization status.
     * This status may be due to active restrictions, such as parental controls being in place.
     */
    @Generated @NInt public static final long Restricted = 0x0000000000000001L;
    /**
     * The user denied authorization for this app.
     */
    @Generated @NInt public static final long NotAuthorized = 0x0000000000000002L;
    /**
     * The user has authorized this app to use Exposure Notification.
     */
    @Generated @NInt public static final long Authorized = 0x0000000000000003L;
}
