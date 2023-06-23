package apple.healthkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] HKCategoryValueLowCardioFitnessEvent
 * 
 * Specifies the type of cardio fitness event.
 * 
 * [@constant] HKCategoryValueLowCardioFitnessEventLowFitness This constant defines an event where a VO2Max measurement
 * was recorded that falls into the "Low" fitness classification
 * 
 * API-Since: 14.3
 */
@Generated
public final class HKCategoryValueLowCardioFitnessEvent {
    @Generated
    private HKCategoryValueLowCardioFitnessEvent() {
    }

    /**
     * API-Since: 14.3
     */
    @Generated @NInt public static final long HKCategoryValueLowCardioFitnessEventLowFitness = 0x0000000000000001L;
}
