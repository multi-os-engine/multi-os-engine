package apple.healthkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] HKPhysicalEffortEstimationType
 * 
 * Represents the estimation used to create a Physical Effort Sample.
 * 
 * [@constant] HKPhysicalEffortEstimationTypeActivityLookup Indicates the value was calculated based on external
 * standard such as a stationary bike
 * [@constant] HKPhysicalEffortEstimationTypeDeviceSensed Indicates the value was calculated based on movement signals
 * (walking, running etc.)
 * 
 * API-Since: 17.0
 */
@Generated
public final class HKPhysicalEffortEstimationType {
    @Generated
    private HKPhysicalEffortEstimationType() {
    }

    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long ActivityLookup = 0x0000000000000001L;
    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long DeviceSensed = 0x0000000000000002L;
}