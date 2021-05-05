package apple.arkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Reasons for geo tracking failure states.
 */
@Generated
public final class ARGeoTrackingStateReason {
    @Generated
    private ARGeoTrackingStateReason() {
    }

    /**
     * No issues reported.
     */
    @Generated @NInt public static final long None = 0x0000000000000000L;
    /**
     * Geo tracking is not available at the location.
     */
    @Generated @NInt public static final long NotAvailableAtLocation = 0x0000000000000001L;
    /**
     * Geo tracking needs location permissions from the user.
     */
    @Generated @NInt public static final long NeedLocationPermissions = 0x0000000000000002L;
    /**
     * World tracking pose is not valid yet.
     */
    @Generated @NInt public static final long WorldTrackingUnstable = 0x0000000000000003L;
    /**
     * Waiting for a location point that meets accuracy threshold before starting geo tracking.
     */
    @Generated @NInt public static final long WaitingForLocation = 0x0000000000000004L;
    /**
     * Waiting for availability check on first location point to complete.
     */
    @Generated @NInt public static final long WaitingForAvailabilityCheck = 0x0000000000000005L;
    /**
     * Geo tracking data hasn't been downloaded yet.
     */
    @Generated @NInt public static final long GeoDataNotLoaded = 0x0000000000000006L;
    /**
     * The device is pointed at an angle too far down to use geo tracking.
     */
    @Generated @NInt public static final long DevicePointedTooLow = 0x0000000000000007L;
    /**
     * Visual localization failed, but no errors were found in the input.
     */
    @Generated @NInt public static final long VisualLocalizationFailed = 0x0000000000000008L;
}