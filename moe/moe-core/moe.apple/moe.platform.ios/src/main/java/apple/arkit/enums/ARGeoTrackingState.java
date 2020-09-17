package apple.arkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class ARGeoTrackingState {
    @Generated
    private ARGeoTrackingState() {
    }

    @Generated @NInt public static final long NotAvailable = 0x0000000000000000L;
    @Generated @NInt public static final long Initializing = 0x0000000000000001L;
    @Generated @NInt public static final long Localizing = 0x0000000000000002L;
    @Generated @NInt public static final long Localized = 0x0000000000000003L;
}