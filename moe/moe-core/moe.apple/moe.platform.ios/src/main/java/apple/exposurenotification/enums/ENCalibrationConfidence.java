package apple.exposurenotification.enums;

import org.moe.natj.general.ann.Generated;

/**
 * ===========================================================================================================================
 * 
 * Confidence in calibration data.
 * 
 * API-Since: 12.5
 */
@Generated
public final class ENCalibrationConfidence {
    @Generated
    private ENCalibrationConfidence() {
    }

    /**
     * No calibration data.
     * 
     * API-Since: 12.5
     */
    @Generated public static final byte Lowest = 0;
    /**
     * Using average calibration over phones of this manufacturer or Android beacons from EN API version < 1.5.
     * 
     * API-Since: 12.5
     */
    @Generated public static final byte Low = 1;
    /**
     * Using single-antenna orientation for a similar phone model or iPhone beacons from EN API version < 1.5.
     * 
     * API-Since: 12.5
     */
    @Generated public static final byte Medium = 2;
    /**
     * Determined using significant calibration data for this model.
     * 
     * API-Since: 12.5
     */
    @Generated public static final byte High = 3;
}
