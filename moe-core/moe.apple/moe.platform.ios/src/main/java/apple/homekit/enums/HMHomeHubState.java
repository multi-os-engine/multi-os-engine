package apple.homekit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * [@enum] HMHomeHubState
 * 
 * [@constant] HMHomeHubStateNotAvailable No home hub is present.
 * [@constant] HMHomeHubStateConnected Home hub is connected.
 * [@constant] HMHomeHubStateDisconnected No home hub is connected.
 * 
 * API-Since: 11.0
 */
@Generated
public final class HMHomeHubState {
    @Generated
    private HMHomeHubState() {
    }

    /**
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long NotAvailable = 0x0000000000000000L;
    /**
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long Connected = 0x0000000000000001L;
    /**
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long Disconnected = 0x0000000000000002L;
}
