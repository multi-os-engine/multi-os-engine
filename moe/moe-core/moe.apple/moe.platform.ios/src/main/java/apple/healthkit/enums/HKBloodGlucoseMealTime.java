package apple.healthkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] HKBloodGlucoseMealTime
 * 
 * Indicates how your blood glucose reading relates to a meal.
 * 
 * [@constant] HKBloodGlucoseMealTimePreprandial A glucose value measured at the time just before a meal.
 * [@constant] HKBloodGlucoseMealTimePostprandial A glucose value measured after a meal.
 * 
 * API-Since: 11.0
 */
@Generated
public final class HKBloodGlucoseMealTime {
    @Generated
    private HKBloodGlucoseMealTime() {
    }

    /**
     * API-Since: 11.0
     */
    @Generated @NInt public static final long Preprandial = 0x0000000000000001L;
    /**
     * API-Since: 11.0
     */
    @Generated @NInt public static final long Postprandial = 0x0000000000000002L;
}
