package apple.nearbyinteraction.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class NINearbyObjectVerticalDirectionEstimate {
    @Generated
    private NINearbyObjectVerticalDirectionEstimate() {
    }

    @Generated @NInt public static final long Unknown = 0x0000000000000000L;
    /**
     * Represents the nearby object is approximately equal
     */
    @Generated @NInt public static final long Same = 0x0000000000000001L;
    /**
     * Represents the nearby object is above the current device
     */
    @Generated @NInt public static final long Above = 0x0000000000000002L;
    /**
     * Represents the nearby object is below the current device
     */
    @Generated @NInt public static final long Below = 0x0000000000000003L;
    /**
     * Represents the nearby object is above or below the current device - i.e. not the same level
     */
    @Generated @NInt public static final long AboveOrBelow = 0x0000000000000004L;
}