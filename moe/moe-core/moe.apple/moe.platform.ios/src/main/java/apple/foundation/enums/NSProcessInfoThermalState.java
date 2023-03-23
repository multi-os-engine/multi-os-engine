package apple.foundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Describes the current thermal state of the system.
 * 
 * API-Since: 11.0
 */
@Generated
public final class NSProcessInfoThermalState {
    @Generated
    private NSProcessInfoThermalState() {
    }

    /**
     * No corrective action is needed.
     * 
     * API-Since: 11.0
     */
    @Generated @NInt public static final long Nominal = 0x0000000000000000L;
    /**
     * The system has reached a state where fans may become audible (on systems which have fans). Recommendation: Defer
     * non-user-visible activity.
     * 
     * API-Since: 11.0
     */
    @Generated @NInt public static final long Fair = 0x0000000000000001L;
    /**
     * Fans are running at maximum speed (on systems which have fans), system performance may be impacted.
     * Recommendation: reduce application's usage of CPU, GPU and I/O, if possible. Switch to lower quality visual
     * effects, reduce frame rates.
     * 
     * API-Since: 11.0
     */
    @Generated @NInt public static final long Serious = 0x0000000000000002L;
    /**
     * System performance is significantly impacted and the system needs to cool down. Recommendation: reduce
     * application's usage of CPU, GPU, and I/O to the minimum level needed to respond to user actions. Consider
     * stopping use of camera and other peripherals if your application is using them.
     * 
     * API-Since: 11.0
     */
    @Generated @NInt public static final long Critical = 0x0000000000000003L;
}