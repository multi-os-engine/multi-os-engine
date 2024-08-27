package apple.healthkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] HKCategoryValueAppleWalkingSteadinessEvent
 * 
 * Set of values that may be used for HKCategorySamples with the
 * HKCategoryTypeIdentifierAppleWalkingSteadinessEvent type.
 * 
 * [@constant] HKCategoryValueAppleWalkingSteadinessEventInitialLow This constant defines Apple Walking
 * Steadiness events associated with the user's
 * walking steadiness being low.
 * [@constant] HKCategoryValueAppleWalkingSteadinessEventInitialVeryLow This constant defines Apple Walking
 * Steadiness events associated with the user's
 * walking steadiness being very low.
 * [@constant] HKCategoryValueAppleWalkingSteadinessEventRepeatLow This constant defines Apple Walking
 * Steadiness events associated with the user's
 * walking steadiness remaining low over a
 * significant time period.
 * [@constant] HKCategoryValueAppleWalkingSteadinessEventRepeatVeryLow This constant defines Apple Walking
 * Steadiness events associated with the user's
 * walking steadiness remaining very low over a
 * significant time period.
 * 
 * API-Since: 15.0
 */
@Generated
public final class HKCategoryValueAppleWalkingSteadinessEvent {
    @Generated
    private HKCategoryValueAppleWalkingSteadinessEvent() {
    }

    /**
     * API-Since: 15.0
     */
    @Generated @NInt public static final long InitialLow = 0x0000000000000001L;
    /**
     * API-Since: 15.0
     */
    @Generated @NInt public static final long InitialVeryLow = 0x0000000000000002L;
    /**
     * API-Since: 15.0
     */
    @Generated @NInt public static final long RepeatLow = 0x0000000000000003L;
    /**
     * API-Since: 15.0
     */
    @Generated @NInt public static final long RepeatVeryLow = 0x0000000000000004L;
}
