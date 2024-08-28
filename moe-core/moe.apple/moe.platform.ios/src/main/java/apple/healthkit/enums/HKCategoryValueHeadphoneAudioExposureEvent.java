package apple.healthkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] HKCategoryValueHeadphoneAudioExposureEvent
 * 
 * Specifies the kind of headphone audio exposure event associated with the sample.
 * 
 * [@constant] HKCategoryValueHeadphoneAudioExposureEventSevenDayLimit This constant defines headphone events
 * associated with the user being exposed to
 * significant audio levels throught a
 * seven-day period.
 * 
 * API-Since: 14.2
 */
@Generated
public final class HKCategoryValueHeadphoneAudioExposureEvent {
    @Generated
    private HKCategoryValueHeadphoneAudioExposureEvent() {
    }

    /**
     * API-Since: 14.2
     */
    @Generated @NInt public static final long HKCategoryValueHeadphoneAudioExposureEventSevenDayLimit = 0x0000000000000001L;
}
