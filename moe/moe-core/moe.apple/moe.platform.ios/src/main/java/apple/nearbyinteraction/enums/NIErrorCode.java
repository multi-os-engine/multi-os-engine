package apple.nearbyinteraction.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Error codes for nearby interaction session failures.
 */
@Generated
public final class NIErrorCode {
    @Generated
    private NIErrorCode() {
    }

    /**
     * The platform does not support this operation
     */
    @Generated @NInt public static final long UnsupportedPlatform = 0xFFFFFFFFFFFFE8FFL;
    /**
     * Configuration is unsupported
     */
    @Generated @NInt public static final long InvalidConfiguration = 0xFFFFFFFFFFFFE900L;
    /**
     * The session has failed and cannot be restarted
     */
    @Generated @NInt public static final long SessionFailed = 0xFFFFFFFFFFFFE901L;
    /**
     * The session has been active for over the allowed period
     */
    @Generated @NInt public static final long ResourceUsageTimeout = 0xFFFFFFFFFFFFE902L;
    /**
     * The maximum number of active sessions was exceeded
     */
    @Generated @NInt public static final long ActiveSessionsLimitExceeded = 0xFFFFFFFFFFFFE903L;
    /**
     * The user did not authorize the session
     */
    @Generated @NInt public static final long UserDidNotAllow = 0xFFFFFFFFFFFFE904L;
    /**
     * ARSession Configuration provided is not compatible or the platform does not support camera assistance.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long InvalidARConfiguration = 0xFFFFFFFFFFFFE905L;
    /**
     * A Nearby Accessory session has been associated with a peer device (such as a Bluetooth peer) that is not
     * available
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long AccessoryPeerDeviceUnavailable = 0xFFFFFFFFFFFFE906L;
}
