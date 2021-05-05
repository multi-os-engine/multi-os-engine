package apple.healthkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum]          HKCategoryValueSeverity
 * 
 * Set of values to indicate the severity of a symptom.
 */
@Generated
public final class HKCategoryValueSeverity {
    @Generated
    private HKCategoryValueSeverity() {
    }

    @Generated @NInt public static final long Unspecified = 0x0000000000000000L;
    @Generated @NInt public static final long NotPresent = 0x0000000000000001L;
    @Generated @NInt public static final long Mild = 0x0000000000000002L;
    @Generated @NInt public static final long Moderate = 0x0000000000000003L;
    @Generated @NInt public static final long Severe = 0x0000000000000004L;
}