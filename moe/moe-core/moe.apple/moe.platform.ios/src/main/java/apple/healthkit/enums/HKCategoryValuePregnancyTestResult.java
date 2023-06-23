package apple.healthkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] HKCategoryValuePregnancyTestResult
 * 
 * Set of values that may be used for HKCategorySamples with the HKCategoryTypeIdentifierPregnancyTestResult type.
 * 
 * This category value tracks the result of a home pregnancy test that checks for presence of the human chorionic
 * gonadotrophin (hCG) hormone in urine to confirm pregnancy.
 * 
 * API-Since: 15.0
 */
@Generated
public final class HKCategoryValuePregnancyTestResult {
    @Generated
    private HKCategoryValuePregnancyTestResult() {
    }

    /**
     * API-Since: 15.0
     */
    @Generated @NInt public static final long Negative = 0x0000000000000001L;
    /**
     * API-Since: 15.0
     */
    @Generated @NInt public static final long Positive = 0x0000000000000002L;
    /**
     * API-Since: 15.0
     */
    @Generated @NInt public static final long Indeterminate = 0x0000000000000003L;
}
