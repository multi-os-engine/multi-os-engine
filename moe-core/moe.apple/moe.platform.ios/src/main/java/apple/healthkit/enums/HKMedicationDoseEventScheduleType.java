package apple.healthkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * The kind of schedule the system associates with a logged medication dose event.
 * 
 * Each value tells you whether the person logged the dose ad-hoc or
 * in response to a scheduled medication reminder.
 * 
 * API-Since: 26.0
 */
@Generated
public final class HKMedicationDoseEventScheduleType {
    @Generated
    private HKMedicationDoseEventScheduleType() {
    }

    /**
     * The person logged this dose event ad-hoc, outside of any scheduled reminder.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long AsNeeded = 0x0000000000000001L;
    /**
     * The person logged this dose event in response to a scheduled medication reminder.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Schedule = 0x0000000000000002L;
}