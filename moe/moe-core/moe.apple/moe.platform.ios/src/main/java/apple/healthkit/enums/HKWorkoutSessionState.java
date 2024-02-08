package apple.healthkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] HKWorkoutSessionState
 * 
 * This enumerated type is used to represent the state of a workout session.
 * 
 * API-Since: 17.0
 */
@Generated
public final class HKWorkoutSessionState {
    @Generated
    private HKWorkoutSessionState() {
    }

    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long NotStarted = 0x0000000000000001L;
    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long Running = 0x0000000000000002L;
    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long Ended = 0x0000000000000003L;
    @Generated @NInt public static final long Paused = 0x0000000000000004L;
    @Generated @NInt public static final long Prepared = 0x0000000000000005L;
    @Generated @NInt public static final long Stopped = 0x0000000000000006L;
}