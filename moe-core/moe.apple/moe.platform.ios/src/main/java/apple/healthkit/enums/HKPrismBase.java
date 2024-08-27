package apple.healthkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] HKPrismBase
 * 
 * Represents the prism base for rectangular coordinates
 * 
 * API-Since: 16.0
 */
@Generated
public final class HKPrismBase {
    @Generated
    private HKPrismBase() {
    }

    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long None = 0x0000000000000000L;
    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Up = 0x0000000000000001L;
    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Down = 0x0000000000000002L;
    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long In = 0x0000000000000003L;
    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Out = 0x0000000000000004L;
}