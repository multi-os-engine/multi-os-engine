package apple.healthkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] HKCyclingFunctionalThresholdPowerTestType
 * 
 * Represents the test used to determine a Cycling Functional Threshold Power value.
 * 
 * [@constant] HKCyclingFunctionalThresholdPowerTestTypeMaxExercise60Minute The user was exerted to their physical limit
 * for a sustained period of 60 minutes.
 * [@constant] HKCyclingFunctionalThresholdPowerTestTypeMaxExercise20Minute The user was exerted to their physical limit
 * for a sustained period of 20 minutes.
 * [@constant] HKCyclingFunctionalThresholdPowerTestTypeRampTest Test with gradual intensity increase until exhaustion.
 * [@constant] HKCyclingFunctionalThresholdPowerTestTypePredictionExercise An equation was used based on data from the
 * user’s cycling workouts to calculate a predicted Cycling Functional Threshold Power.
 * 
 * API-Since: 17.0
 */
@Generated
public final class HKCyclingFunctionalThresholdPowerTestType {
    @Generated
    private HKCyclingFunctionalThresholdPowerTestType() {
    }

    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long MaxExercise60Minute = 0x0000000000000001L;
    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long MaxExercise20Minute = 0x0000000000000002L;
    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long RampTest = 0x0000000000000003L;
    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long PredictionExercise = 0x0000000000000004L;
}