package apple.healthkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] HKAppleSleepingBreathingDisturbancesClassification
 * 
 * This enumerated type is used to represent a classification of the user's breathing disturbances
 * [@constant] HKAppleSleepingBreathingDisturbancesClassificationNotElevated BD level is not elevated
 * [@constant] HKAppleSleepingBreathingDisturbancesClassificationElevated BD level is elevated
 * 
 * API-Since: 18.0
 */
@Generated
public final class HKAppleSleepingBreathingDisturbancesClassification {
    @Generated
    private HKAppleSleepingBreathingDisturbancesClassification() {
    }

    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long NotElevated = 0x0000000000000000L;
    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Elevated = 0x0000000000000001L;
}