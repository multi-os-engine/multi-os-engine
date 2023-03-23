package apple.homekit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] HMCharacteristicValueProgramMode
 * 
 * [@constant] HMCharacteristicValueProgramModeNotScheduled No programs scheduled.
 * [@constant] HMCharacteristicValueProgramModeScheduled Program scheduled.
 * [@constant] HMCharacteristicValueProgramModeScheduleOverriddenToManual Schedule currently overridden to manual mode.
 * 
 * API-Since: 11.2
 */
@Generated
public final class HMCharacteristicValueProgramMode {
    @Generated
    private HMCharacteristicValueProgramMode() {
    }

    /**
     * API-Since: 11.2
     */
    @Generated @NInt public static final long NotScheduled = 0x0000000000000000L;
    /**
     * API-Since: 11.2
     */
    @Generated @NInt public static final long Scheduled = 0x0000000000000001L;
    /**
     * API-Since: 11.2
     */
    @Generated @NInt public static final long ScheduleOverriddenToManual = 0x0000000000000002L;
}
