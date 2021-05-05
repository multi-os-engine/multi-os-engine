package apple.gamecontroller.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * This is the battery status and it's represented by one of the following values:
 * GCControllerBatteryStateUnknown means that the current state of battery is unknown or cannot be determined
 * GCControllerBatteryStateDischarging means that controller is on battery and discharging at this moment
 * GCControllerBatteryStateCharging means that controller is plugged in, but it's battery level is less than 100%
 * GCControllerBatteryStateFull means that controller is plugged in and it's battery level is 100%
 */
@Generated
public final class GCDeviceBatteryState {
    @Generated
    private GCDeviceBatteryState() {
    }

    @Generated @NInt public static final long Unknown = 0xFFFFFFFFFFFFFFFFL;
    @Generated @NInt public static final long Discharging = 0x0000000000000000L;
    @Generated @NInt public static final long Charging = 0x0000000000000001L;
    @Generated @NInt public static final long Full = 0x0000000000000002L;
}