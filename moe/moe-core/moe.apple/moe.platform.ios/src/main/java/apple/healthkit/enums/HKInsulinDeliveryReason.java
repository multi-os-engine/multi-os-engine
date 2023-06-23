package apple.healthkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] HKInsulinDeliveryReason
 * 
 * Represents a medical reason for the delivery of insulin
 * 
 * [@constant] HKInsulinDeliveryReasonBasal Delivery for the base metabolic needs of the individual, often
 * administered as a continuous rate from an insulin pump, or a periodic
 * injection of slow-acting insulin.
 * [@constant] HKInsulinDeliveryReasonBolus Delivery for the episodic needs of the individual, such as a meal or
 * glucose level correction.
 * 
 * API-Since: 11.0
 */
@Generated
public final class HKInsulinDeliveryReason {
    @Generated
    private HKInsulinDeliveryReason() {
    }

    /**
     * API-Since: 11.0
     */
    @Generated @NInt public static final long Basal = 0x0000000000000001L;
    /**
     * API-Since: 11.0
     */
    @Generated @NInt public static final long Bolus = 0x0000000000000002L;
}
