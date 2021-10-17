package apple.homekit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum]      HMCharacteristicValueProgramMode
 * <p>
 * [@constant]  HMCharacteristicValueProgramModeNotScheduled                No programs scheduled.
 * [@constant]  HMCharacteristicValueProgramModeScheduled                   Program scheduled.
 * [@constant]  HMCharacteristicValueProgramModeScheduleOverriddenToManual  Schedule currently overridden to manual mode.
 */
@Generated
public final class HMCharacteristicValueProgramMode {
    @Generated
    private HMCharacteristicValueProgramMode() {
    }

    @Generated @NInt public static final long NotScheduled = 0x0000000000000000L;
    @Generated @NInt public static final long Scheduled = 0x0000000000000001L;
    @Generated @NInt public static final long ScheduleOverriddenToManual = 0x0000000000000002L;
}
