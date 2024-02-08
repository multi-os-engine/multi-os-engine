package apple.healthkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] HKCategoryValueEnvironmentalAudioExposureEvent
 * 
 * Specifies the kind of environmental audio exposure event associated with the sample.
 * 
 * [@constant] HKCategoryValueEnvironmentalAudioExposureEventMomentaryLimit This constant defines environmental
 * events associated with the user being
 * exposed to a loud environment during a
 * short timespan.
 * 
 * API-Since: 14.0
 */
@Generated
public final class HKCategoryValueEnvironmentalAudioExposureEvent {
    @Generated
    private HKCategoryValueEnvironmentalAudioExposureEvent() {
    }

    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long HKCategoryValueEnvironmentalAudioExposureEventMomentaryLimit = 0x0000000000000001L;
}
