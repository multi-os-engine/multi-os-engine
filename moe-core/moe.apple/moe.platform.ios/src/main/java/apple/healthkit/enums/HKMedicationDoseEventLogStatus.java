package apple.healthkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * The statuses the system assigns to a logged medication dose event.
 * 
 * API-Since: 26.0
 */
@Generated
public final class HKMedicationDoseEventLogStatus {
    @Generated
    private HKMedicationDoseEventLogStatus() {
    }

    /**
     * The person doesn't interact with a scheduled medication reminder.
     * 
     * The system generates this to represent an untouched reminder slot.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long NotInteracted = 0x0000000000000001L;
    /**
     * The system assigns this status when it fails to deliver a scheduled medication notification.
     * 
     * The system can generate this status because of a person's notification
     * restrictions or issues with notification delivery.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long NotificationNotSent = 0x0000000000000002L;
    /**
     * The person snoozes a scheduled medication notification.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Snoozed = 0x0000000000000003L;
    /**
     * The person logs that they took the medication dose.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Taken = 0x0000000000000004L;
    /**
     * The person logs that they skipped the medication dose.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Skipped = 0x0000000000000005L;
    /**
     * The person undoes a previously logged medication status.
     * 
     * The system clears the prior status.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long NotLogged = 0x0000000000000006L;
}