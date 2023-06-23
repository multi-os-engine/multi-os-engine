package apple.pushtotalk.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 16.0
 */
@Generated
public final class PTInstantiationError {
    @Generated
    private PTInstantiationError() {
    }

    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Unknown = 0x0000000000000000L;
    /**
     * The PushToTalk API is not available on the simulator or macOS devices
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long InvalidPlatform = 0x0000000000000001L;
    /**
     * App is lacking the push-to-talk UIBackgroundMode
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long MissingBackgroundMode = 0x0000000000000002L;
    /**
     * App is lacking apns-environment entitlement (Push Notifications Capability)
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long MissingPushServerEnvironment = 0x0000000000000003L;
    /**
     * App is lacking the com.apple.developer.push-to-talk entitlement
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long MissingEntitlement = 0x0000000000000004L;
    /**
     * There is already an in-flight instantiation request
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long InstantiationAlreadyInProgress = 0x0000000000000005L;
}