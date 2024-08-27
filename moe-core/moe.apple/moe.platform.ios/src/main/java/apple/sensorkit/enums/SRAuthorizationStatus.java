package apple.sensorkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 14.0
 */
@Generated
public final class SRAuthorizationStatus {
    @Generated
    private SRAuthorizationStatus() {
    }

    /**
     * User has not yet made a choice regarding this application
     * 
     * API-Since: 14.0
     */
    @Generated @NInt public static final long NotDetermined = 0x0000000000000000L;
    /**
     * User has granted authorization to this application
     * 
     * API-Since: 14.0
     */
    @Generated @NInt public static final long Authorized = 0x0000000000000001L;
    /**
     * User has denied authorization to this application or
     * data collection is disabled in Settings.
     * 
     * API-Since: 14.0
     */
    @Generated @NInt public static final long Denied = 0x0000000000000002L;
}
