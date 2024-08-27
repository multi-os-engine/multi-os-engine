package apple.pushtotalk.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 16.0
 */
@Generated
public final class PTServiceStatus {
    @Generated
    private PTServiceStatus() {
    }

    /**
     * The service is available for use and ready for use by the client.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Ready = 0x0000000000000000L;
    /**
     * The client is attempting to establish a connection to the service.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Connecting = 0x0000000000000001L;
    /**
     * The service has become unavailable and availability needs to be re-established once conditions have changed.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Unavailable = 0x0000000000000002L;
}