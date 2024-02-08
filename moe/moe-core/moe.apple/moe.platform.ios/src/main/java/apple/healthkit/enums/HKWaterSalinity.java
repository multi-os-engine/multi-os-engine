package apple.healthkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] HKWaterSalinity
 * 
 * Represents the water salinity for an underwater depth or water temperature sample.
 * 
 * This value indicates the water salinity
 * 
 * API-Since: 17.0
 */
@Generated
public final class HKWaterSalinity {
    @Generated
    private HKWaterSalinity() {
    }

    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long FreshWater = 0x0000000000000001L;
    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long SaltWater = 0x0000000000000002L;
}