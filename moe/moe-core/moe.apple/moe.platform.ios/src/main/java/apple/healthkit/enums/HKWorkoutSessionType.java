package apple.healthkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] HKWorkoutSessionType
 * 
 * This enumerated type is used to represent the type of a workout session.
 * 
 * [@constant] HKWorkoutSessionTypePrimary Represents a workout session running locally on the current device.
 * [@constant] HKWorkoutSessionTypeMirrored Represents a workout session being mirrored from a different device.
 * 
 * API-Since: 17.0
 */
@Generated
public final class HKWorkoutSessionType {
    @Generated
    private HKWorkoutSessionType() {
    }

    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long Primary = 0x0000000000000000L;
    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long Mirrored = 0x0000000000000001L;
}