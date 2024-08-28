package apple.matter.enums;

import org.moe.natj.general.ann.Generated;

/**
 * API-Since: 16.5
 */
@Generated
public final class MTRPumpConfigurationAndControlPumpStatusBitmap {
    @Generated
    private MTRPumpConfigurationAndControlPumpStatusBitmap() {
    }

    /**
     * API-Since: 16.5
     */
    @Generated public static final char DeviceFault = 0x0001;
    /**
     * API-Since: 16.5
     */
    @Generated public static final char Supplyfault = 0x0002;
    /**
     * API-Since: 16.5
     */
    @Generated public static final char SpeedLow = 0x0004;
    /**
     * API-Since: 16.5
     */
    @Generated public static final char SpeedHigh = 0x0008;
    /**
     * API-Since: 16.5
     */
    @Generated public static final char LocalOverride = 0x0010;
    /**
     * API-Since: 16.5
     */
    @Generated public static final char Running = 0x0020;
    /**
     * API-Since: 16.5
     */
    @Generated public static final char RemotePressure = 0x0040;
    /**
     * API-Since: 16.5
     */
    @Generated public static final char RemoteFlow = 0x0080;
    /**
     * API-Since: 16.5
     */
    @Generated public static final char RemoteTemperature = 0x0100;
}