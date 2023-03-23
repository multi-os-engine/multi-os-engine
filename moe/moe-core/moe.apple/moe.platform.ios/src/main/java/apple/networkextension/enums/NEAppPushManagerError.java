package apple.networkextension.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@typedef] NEAppPushManagerError
 * 
 * App Push Manager error codes
 * 
 * API-Since: 14.0
 */
@Generated
public final class NEAppPushManagerError {
    @Generated
    private NEAppPushManagerError() {
    }

    /**
     * [@const] NEAppPushManagerErrorConfigurationInvalid The app push configuration is invalid
     * 
     * API-Since: 14.0
     */
    @Generated @NInt public static final long ConfigurationInvalid = 0x0000000000000001L;
    /**
     * [@const] NEAppPushManagerErrorConfigurationNotLoaded The app push configuration is not loaded
     * 
     * API-Since: 14.0
     */
    @Generated @NInt public static final long ConfigurationNotLoaded = 0x0000000000000002L;
    /**
     * [@const] NEAppPushManagerErrorInternalError Internal error in API task handling
     * 
     * API-Since: 14.0
     */
    @Generated @NInt public static final long InternalError = 0x0000000000000003L;
    /**
     * [@const] NEAppPushManagerErrorInactiveSession This operation is invalid on inactive session
     * 
     * API-Since: 14.0
     */
    @Generated @NInt public static final long InactiveSession = 0x0000000000000004L;
}
