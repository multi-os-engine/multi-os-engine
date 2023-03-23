package apple.corelocation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * CLLocationPushServiceError
 * 
 * Discussion:
 * Error returned as code to NSError from -[CLLocationManager startMonitoringLocationPushesWithCompletion:].
 * 
 * API-Since: 15.0
 */
@Generated
public final class CLLocationPushServiceError {
    @Generated
    private CLLocationPushServiceError() {
    }

    /**
     * API-Since: 15.0
     */
    @Generated @NInt public static final long Unknown = 0x0000000000000000L;
    /**
     * App is lacking a Location Push Service Extension
     * 
     * API-Since: 15.0
     */
    @Generated @NInt public static final long MissingPushExtension = 0x0000000000000001L;
    /**
     * App is lacking APNS environment
     * 
     * API-Since: 15.0
     */
    @Generated @NInt public static final long MissingPushServerEnvironment = 0x0000000000000002L;
    /**
     * App is lacking the com.apple.developer.location.push entitlement
     * 
     * API-Since: 15.0
     */
    @Generated @NInt public static final long MissingEntitlement = 0x0000000000000003L;
}
