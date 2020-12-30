package apple.healthkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum]          HKCategoryValuePresence
 * 
 * Set of values to indicate whether a data type is present or not.
 */
@Generated
public final class HKCategoryValuePresence {
    @Generated
    private HKCategoryValuePresence() {
    }

    @Generated @NInt public static final long Present = 0x0000000000000000L;
    @Generated @NInt public static final long NotPresent = 0x0000000000000001L;
}