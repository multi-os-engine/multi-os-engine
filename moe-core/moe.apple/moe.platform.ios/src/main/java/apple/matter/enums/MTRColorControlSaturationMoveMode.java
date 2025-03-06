package apple.matter.enums;

import org.moe.natj.general.ann.Generated;

/**
 * ColorControl used to have HueMoveMode/SaturationMoveMode and HueStepMode/SaturationStepMode that had
 * identical values. Those got replaced with MoveModeEnum and StepModeEnum respectively. We codegen
 * HueMoveMode and HueStepMode as aliases of MoveModeEnum and StepModeEnum, but we need manual shims for
 * SaturationMoveMode and SaturationStepMode.
 * 
 * API-Since: 16.1
 * Deprecated-Since: 18.2
 * Deprecated-Message: Please use MTRColorControlMoveMode
 */
@Deprecated
@Generated
public final class MTRColorControlSaturationMoveMode {
    @Generated
    private MTRColorControlSaturationMoveMode() {
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 18.2
     * Deprecated-Message: Please use MTRColorControlMoveModeStop
     */
    @Deprecated @Generated public static final byte Stop = 0;
    /**
     * API-Since: 16.1
     * Deprecated-Since: 18.2
     * Deprecated-Message: Please use MTRColorControlMoveModeUp
     */
    @Deprecated @Generated public static final byte Up = 1;
    /**
     * API-Since: 16.1
     * Deprecated-Since: 18.2
     * Deprecated-Message: Please use MTRColorControlMoveModeDown
     */
    @Deprecated @Generated public static final byte Down = 3;
}