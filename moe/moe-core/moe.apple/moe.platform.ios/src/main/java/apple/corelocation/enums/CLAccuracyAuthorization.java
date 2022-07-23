package apple.corelocation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class CLAccuracyAuthorization {
    @Generated
    private CLAccuracyAuthorization() {
    }

    /**
     * This application has the user's permission to receive accurate location information.
     */
    @Generated @NInt public static final long FullAccuracy = 0x0000000000000000L;
    /**
     * Location estimates will have a horizontalAccuracy on the order of about 5km. To achieve the
     * reduction in accuracy, CoreLocation will snap location estimates to a nearby point which represents
     * the region the device is in. Furthermore, CoreLocation will reduce the rate at which location
     * estimates are produced. Applications should be prepared to receive locations that are up to 20
     * minutes old.
     */
    @Generated @NInt public static final long ReducedAccuracy = 0x0000000000000001L;
}