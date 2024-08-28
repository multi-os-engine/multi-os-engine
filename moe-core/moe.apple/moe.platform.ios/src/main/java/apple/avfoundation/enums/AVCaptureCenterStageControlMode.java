package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] AVCaptureCenterStageControlMode
 * 
 * Constants indicating the current Center Stage control mode.
 * 
 * [@constant] AVCaptureCenterStageControlModeUser
 * Indicates that the application is unaware of the Center Stage feature. Its enablement is entirely under user control
 * in Control Center.
 * [@constant] AVCaptureCenterStageControlModeApp
 * Indicates that the application controls the Center Stage feature, disallowing input from the user in Control Center.
 * [@constant] AVCaptureCenterStageControlModeCooperative
 * Indicates that both the user and application cooperatively share control of the Center Stage feature.
 * 
 * API-Since: 14.5
 */
@Generated
public final class AVCaptureCenterStageControlMode {
    @Generated
    private AVCaptureCenterStageControlMode() {
    }

    /**
     * API-Since: 14.5
     */
    @Generated @NInt public static final long User = 0x0000000000000000L;
    /**
     * API-Since: 14.5
     */
    @Generated @NInt public static final long App = 0x0000000000000001L;
    /**
     * API-Since: 14.5
     */
    @Generated @NInt public static final long Cooperative = 0x0000000000000002L;
}
