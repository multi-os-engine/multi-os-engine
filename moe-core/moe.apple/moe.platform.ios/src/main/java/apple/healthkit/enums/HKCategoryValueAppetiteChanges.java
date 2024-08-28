package apple.healthkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] HKCategoryValueAppetiteChanges
 * 
 * Set of values to indicate the direction of appetite changes.
 * 
 * API-Since: 13.6
 */
@Generated
public final class HKCategoryValueAppetiteChanges {
    @Generated
    private HKCategoryValueAppetiteChanges() {
    }

    /**
     * API-Since: 13.6
     */
    @Generated @NInt public static final long Unspecified = 0x0000000000000000L;
    /**
     * API-Since: 13.6
     */
    @Generated @NInt public static final long NoChange = 0x0000000000000001L;
    /**
     * API-Since: 13.6
     */
    @Generated @NInt public static final long Decreased = 0x0000000000000002L;
    /**
     * API-Since: 13.6
     */
    @Generated @NInt public static final long Increased = 0x0000000000000003L;
}
