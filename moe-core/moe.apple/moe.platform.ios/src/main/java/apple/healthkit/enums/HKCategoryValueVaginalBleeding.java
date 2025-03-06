package apple.healthkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] HKCategoryValueVaginalBleeding
 * 
 * Set of values to indicate the type of bleeding.
 * 
 * API-Since: 18.0
 */
@Generated
public final class HKCategoryValueVaginalBleeding {
    @Generated
    private HKCategoryValueVaginalBleeding() {
    }

    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Unspecified = 0x0000000000000001L;
    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Light = 0x0000000000000002L;
    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Medium = 0x0000000000000003L;
    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Heavy = 0x0000000000000004L;
    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long None = 0x0000000000000005L;
}