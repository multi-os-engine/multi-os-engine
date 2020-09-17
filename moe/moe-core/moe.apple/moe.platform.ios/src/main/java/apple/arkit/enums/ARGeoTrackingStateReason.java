package apple.arkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class ARGeoTrackingStateReason {
    @Generated
    private ARGeoTrackingStateReason() {
    }

    @Generated @NInt public static final long None = 0x0000000000000000L;
    @Generated @NInt public static final long NotAvailableAtLocation = 0x0000000000000001L;
    @Generated @NInt public static final long NeedLocationPermissions = 0x0000000000000002L;
    @Generated @NInt public static final long WorldTrackingUnstable = 0x0000000000000003L;
    @Generated @NInt public static final long WaitingForLocation = 0x0000000000000004L;
    @Generated @NInt public static final long WaitingForAvailabilityCheck = 0x0000000000000005L;
    @Generated @NInt public static final long GeoDataNotLoaded = 0x0000000000000006L;
    @Generated @NInt public static final long DevicePointedTooLow = 0x0000000000000007L;
    @Generated @NInt public static final long VisualLocalizationFailed = 0x0000000000000008L;
}