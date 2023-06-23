package apple.healthkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] HKCategoryValueProgesteroneTestResult
 * 
 * Set of values that may be used for HKCategorySamples with the HKCategoryTypeIdentifierProgesteroneTestResult type.
 * 
 * This category value tracks the result of a home ovulation confirmation test that use surges in hormone levels to
 * confirm if ovulation has occurred.
 * 
 * API-Since: 15.0
 */
@Generated
public final class HKCategoryValueProgesteroneTestResult {
    @Generated
    private HKCategoryValueProgesteroneTestResult() {
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
