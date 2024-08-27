package apple.apptrackingtransparency.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * The status values for app tracking authorization.
 * 
 * After a device receives an authorization request to approve access to app-related
 * data that can be used for tracking the user or the device, the returned value is
 * either:
 * 
 * - ``AppTrackingTransparency/ATTrackingManager/AuthorizationStatus/authorized``, or
 * - ``AppTrackingTransparency/ATTrackingManager/AuthorizationStatus/denied``.
 * 
 * Before a device receives an authorization request to approve access to app-related
 * data that can be used for tracking the user or the device, the returned value is:
 * ``AppTrackingTransparency/ATTrackingManager/AuthorizationStatus/notDetermined``.
 * 
 * If authorization to use app tracking data is restricted, the value is:
 * ``AppTrackingTransparency/ATTrackingManager/AuthorizationStatus/restricted``.
 * 
 * API-Since: 14.0
 */
@Generated
public final class ATTrackingManagerAuthorizationStatus {
    @Generated
    private ATTrackingManagerAuthorizationStatus() {
    }

    /**
     * The value that returns when the app can’t determine the user’s
     * authorization status for access to app-related data for tracking the
     * user or the device.
     * 
     * - Note: If you call `ATTrackingManager.trackingAuthorizationStatus` in
     * macOS, the result is always `ATTrackingManager.AuthorizationStatus.notDetermined`.
     * 
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long NotDetermined = 0x0000000000000000L;
    /**
     * The value that returns if authorization to access app-related data for
     * tracking the user or the device has a restricted status.
     * 
     * A restricted condition means the device does not prompt for tracking
     * authorization when
     * ``ATTrackingManager/requestTrackingAuthorizationWithCompletionHandler:``
     * is called, nor is it displayed when the
     * <doc://com.apple.documentation/documentation/bundleresources/information_property_list/NSUserTrackingUsageDescription>
     * is triggered. Also, on restricted devices, the Allow Apps To Request To
     * Track setting is disabled and cannot be changed. This setting allows
     * users to opt in or out of allowing apps to request user consent to
     * access app-related data that can be used for tracking the user or the
     * device.
     * 
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long Restricted = 0x0000000000000001L;
    /**
     * The value that returns if the user denies authorization to access
     * app-related data for tracking the user or the device.
     * 
     * The end user has denied the authorization request to access app-related
     * data that can be used for tracking the user or the device.
     * 
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long Denied = 0x0000000000000002L;
    /**
     * The value that returns if the user authorizes access to app-related data for
     * tracking the user or the device.
     * 
     * This setting allows users to opt in or out of allowing apps to request user
     * consent to access app-related data for tracking the user or the device. End
     * users can revoke permission at any time through the Allow Apps to Request to
     * Track privacy setting on the device.
     * 
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long Authorized = 0x0000000000000003L;
}
