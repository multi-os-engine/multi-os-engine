package apple.nearbyinteraction.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * The coordinate types of DL-TDOA measurement updates that Nearby Interaction supports.
 */
@Generated
public final class NIDLTDOACoordinatesType {
    @Generated
    private NIDLTDOACoordinatesType() {
    }

    @Generated @NInt public static final long Geodetic = 0x0000000000000000L;
    @Generated @NInt public static final long Relative = 0x0000000000000001L;
}