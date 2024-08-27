package apple.healthkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] HKHeartRateRecoveryTestType
 * 
 * Represents the test used to determine a Heart Rate Recovery value
 * 
 * [@constant] HKHeartRateRecoveryTestTypeMaxExercise The user was exerted to their physical limit to evaluate actual
 * Heart Rate Recovery.
 * [@constant] HKHeartRateRecoveryTestTypePredictionSubMaxExercise A specific test protocol was used to calculate and
 * correlate a predicted Heart Rate Recovery.
 * [@constant] HKHeartRateRecoveryTestTypePredictionNonExercise A non-exercise equation was used based on user metrics
 * to calculate a predicted Heart Rate Recovery.
 * 
 * API-Since: 16.0
 */
@Generated
public final class HKHeartRateRecoveryTestType {
    @Generated
    private HKHeartRateRecoveryTestType() {
    }

    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long MaxExercise = 0x0000000000000001L;
    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long PredictionSubMaxExercise = 0x0000000000000002L;
    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long PredictionNonExercise = 0x0000000000000003L;
}