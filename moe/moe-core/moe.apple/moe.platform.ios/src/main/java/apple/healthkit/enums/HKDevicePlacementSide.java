package apple.healthkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum]          HKDevicePlacementSide
 * <p>
 * The detected placement of the device during the bout of walking
 * [@constant]      HKDevicePlacementSideUnknown                     Unable to determine the placement of the device
 * [@constant]      HKDevicePlacementSideLeft                        Device predominantly worn on left side
 * [@constant]      HKDevicePlacementSideRight                       Device predominantly worn on right side
 * [@constant]      HKDevicePlacementSideCentral                     Device predominantly worn on the middle of the body
 */
@Generated
public final class HKDevicePlacementSide {
    @Generated
    private HKDevicePlacementSide() {
    }

    @Generated @NInt public static final long Unknown = 0x0000000000000000L;
    @Generated @NInt public static final long Left = 0x0000000000000001L;
    @Generated @NInt public static final long Right = 0x0000000000000002L;
    @Generated @NInt public static final long Central = 0x0000000000000003L;
}
