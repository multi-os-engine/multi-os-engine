package apple.arkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * A value describing geo tracking accuracy.
 */
@Generated
public final class ARGeoTrackingAccuracy {
    @Generated
    private ARGeoTrackingAccuracy() {
    }

    /**
     * Geo tracking has not localized yet. Accuracy is indeterminate.
     */
    @Generated @NInt public static final long Undetermined = 0x0000000000000000L;
    /**
     * Localized with low accuracy.
     */
    @Generated @NInt public static final long Low = 0x0000000000000001L;
    /**
     * Localized with medium accuracy.
     */
    @Generated @NInt public static final long Medium = 0x0000000000000002L;
    /**
     * Localized with high accuracy.
     */
    @Generated @NInt public static final long High = 0x0000000000000003L;
}