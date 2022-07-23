package apple.healthkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] HKCategoryValueContraceptive
 * <p>
 * Set of values to indicate the type of contraceptive.
 */
@Generated
public final class HKCategoryValueContraceptive {
    @Generated
    private HKCategoryValueContraceptive() {
    }

    @Generated @NInt public static final long Unspecified = 0x0000000000000001L;
    @Generated @NInt public static final long Implant = 0x0000000000000002L;
    @Generated @NInt public static final long Injection = 0x0000000000000003L;
    @Generated @NInt public static final long IntrauterineDevice = 0x0000000000000004L;
    @Generated @NInt public static final long IntravaginalRing = 0x0000000000000005L;
    @Generated @NInt public static final long Oral = 0x0000000000000006L;
    @Generated @NInt public static final long Patch = 0x0000000000000007L;
}
