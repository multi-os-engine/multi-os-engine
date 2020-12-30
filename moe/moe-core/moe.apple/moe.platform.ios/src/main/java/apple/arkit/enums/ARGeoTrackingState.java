package apple.arkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * A value describing geo tracking state.
 */
@Generated
public final class ARGeoTrackingState {
    @Generated
    private ARGeoTrackingState() {
    }

    /**
     * Geo tracking is not available.
     */
    @Generated @NInt public static final long NotAvailable = 0x0000000000000000L;
    /**
     * Geo tracking is being initialized.
     */
    @Generated @NInt public static final long Initializing = 0x0000000000000001L;
    /**
     * Geo tracking is attempting to localize against a Map.
     */
    @Generated @NInt public static final long Localizing = 0x0000000000000002L;
    /**
     * Geo tracking is localized.
     */
    @Generated @NInt public static final long Localized = 0x0000000000000003L;
}