package apple.devicediscoveryextension.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * ---------------------------------------------------------------------------------------------------------------------------
 * Category of the device.
 */
@Generated
public final class DDDeviceCategory {
    @Generated
    private DDDeviceCategory() {
    }

    @Generated @NInt public static final long HiFiSpeaker = 0x0000000000000000L;
    /**
     * Hi-Fi speaker.
     */
    @Generated @NInt public static final long HiFiSpeakerMultiple = 0x0000000000000001L;
    /**
     * Multiple Hi-Fi speakers.
     */
    @Generated @NInt public static final long TVWithMediaBox = 0x0000000000000002L;
    /**
     * TV with MediaBox.
     */
    @Generated @NInt public static final long TV = 0x0000000000000003L;
    /**
     * TV.
     */
    @Generated @NInt public static final long LaptopComputer = 0x0000000000000004L;
    /**
     * Laptop computer.
     */
    @Generated @NInt public static final long DesktopComputer = 0x0000000000000005L;
}