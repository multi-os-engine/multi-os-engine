package apple.passkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 17.0
 */
@Generated
public final class PKApplePayLaterAvailability {
    @Generated
    private PKApplePayLaterAvailability() {
    }

    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long Available = 0x0000000000000000L;
    /**
     * Default state where Apple Pay Later is available
     * 
     * API-Since: 17.0
     */
    @Generated @NInt public static final long UnavailableItemIneligible = 0x0000000000000001L;
    /**
     * One or more ineligible items are in the basket, such as items with long fulfillment or prohibited MCCs
     * 
     * API-Since: 17.0
     */
    @Generated @NInt public static final long UnavailableRecurringTransaction = 0x0000000000000002L;
}