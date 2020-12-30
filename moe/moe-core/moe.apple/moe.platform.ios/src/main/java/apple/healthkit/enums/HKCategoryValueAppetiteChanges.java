package apple.healthkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * @enum          HKCategoryValueAppetiteChanges
 * @abstract      Set of values to indicate the direction of appetite changes.
 */
@Generated
public final class HKCategoryValueAppetiteChanges {
    @Generated
    private HKCategoryValueAppetiteChanges() {
    }

    @Generated @NInt public static final long Unspecified = 0x0000000000000000L;
    @Generated @NInt public static final long NoChange = 0x0000000000000001L;
    @Generated @NInt public static final long Decreased = 0x0000000000000002L;
    @Generated @NInt public static final long Increased = 0x0000000000000003L;
}