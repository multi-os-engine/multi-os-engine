package apple.nearbyinteraction.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * The measurement types of DL-TDOA measurement updates that Nearby Interaction supports.
 */
@Generated
public final class NIDLTDOAMeasurementType {
    @Generated
    private NIDLTDOAMeasurementType() {
    }

    @Generated @NInt public static final long Poll = 0x0000000000000000L;
    @Generated @NInt public static final long Response = 0x0000000000000001L;
    @Generated @NInt public static final long Final = 0x0000000000000002L;
}