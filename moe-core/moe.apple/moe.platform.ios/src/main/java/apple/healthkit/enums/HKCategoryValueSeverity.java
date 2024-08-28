package apple.healthkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] HKCategoryValueSeverity
 * 
 * Set of values to indicate the severity of a symptom.
 * 
 * API-Since: 13.6
 */
@Generated
public final class HKCategoryValueSeverity {
    @Generated
    private HKCategoryValueSeverity() {
    }

    /**
     * API-Since: 13.6
     */
    @Generated @NInt public static final long Unspecified = 0x0000000000000000L;
    /**
     * API-Since: 13.6
     */
    @Generated @NInt public static final long NotPresent = 0x0000000000000001L;
    /**
     * API-Since: 13.6
     */
    @Generated @NInt public static final long Mild = 0x0000000000000002L;
    /**
     * API-Since: 13.6
     */
    @Generated @NInt public static final long Moderate = 0x0000000000000003L;
    /**
     * API-Since: 13.6
     */
    @Generated @NInt public static final long Severe = 0x0000000000000004L;
}
