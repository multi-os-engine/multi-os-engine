package apple.healthkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] HKElectrocardiogramSymptomsStatus
 * 
 * An indication of whether the user experienced symptoms when taking an ECG
 * [@constant] HKElectrocardiogramSymptomsStatusNotSet The user did not specify whether or not they experienced
 * symptoms.
 * HKElectrocardiogramSymptomsStatusNone The user did not experience any symptoms during the duration of the
 * electrocardiogram reading.
 * HKElectrocardiogramSymptomsStatusPresent The user indicated that they experienced symptoms during the duration of the
 * electrocardiogram reading.
 * 
 * If an HKElectrocardiogram indicates that there are symptoms present, you must do a separate sample query to
 * retrieve those symptoms.
 * 
 * API-Since: 14.0
 */
@Generated
public final class HKElectrocardiogramSymptomsStatus {
    @Generated
    private HKElectrocardiogramSymptomsStatus() {
    }

    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long NotSet = 0x0000000000000000L;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long None = 0x0000000000000001L;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long Present = 0x0000000000000002L;
}
