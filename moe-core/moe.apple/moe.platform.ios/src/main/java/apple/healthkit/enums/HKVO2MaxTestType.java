package apple.healthkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] HKVO2MaxTestType
 * 
 * Represents the test used to create a VO2 Max Sample.
 * 
 * [@constant] HKVO2MaxTestTypeMaxExercise The user was exerted to their physical limit to evaluate and measure actual
 * VO2Max.
 * [@constant] HKVO2MaxTestTypePredictionSubMaxExercise A specific test protocol was used to calculate and correlate a
 * predicted VO2Max.
 * [@constant] HKVO2MaxTestTypePredictionNonExercise A non-exercise equation was used based on user metrics to calculate
 * a predicted VO2Max.
 * 
 * API-Since: 11.0
 */
@Generated
public final class HKVO2MaxTestType {
    @Generated
    private HKVO2MaxTestType() {
    }

    /**
     * API-Since: 11.0
     */
    @Generated @NInt public static final long MaxExercise = 0x0000000000000001L;
    /**
     * API-Since: 11.0
     */
    @Generated @NInt public static final long PredictionSubMaxExercise = 0x0000000000000002L;
    /**
     * API-Since: 11.0
     */
    @Generated @NInt public static final long PredictionNonExercise = 0x0000000000000003L;
}
