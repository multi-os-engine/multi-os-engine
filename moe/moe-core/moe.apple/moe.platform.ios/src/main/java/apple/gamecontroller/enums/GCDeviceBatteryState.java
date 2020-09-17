package apple.gamecontroller.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

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