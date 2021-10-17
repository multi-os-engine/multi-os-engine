package apple.healthkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum]          HKCategoryValueProgesteroneTestResult
 * <p>
 * Set of values that may be used for HKCategorySamples with the HKCategoryTypeIdentifierProgesteroneTestResult type.
 * <p>
 * This category value tracks the result of a home ovulation confirmation test that use surges in hormone levels to
 * confirm if ovulation has occurred.
 */
@Generated
public final class HKCategoryValueProgesteroneTestResult {
    @Generated
    private HKCategoryValueProgesteroneTestResult() {
    }

    @Generated @NInt public static final long Negative = 0x0000000000000001L;
    @Generated @NInt public static final long Positive = 0x0000000000000002L;
    @Generated @NInt public static final long Indeterminate = 0x0000000000000003L;
}
