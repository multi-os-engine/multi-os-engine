package apple.devicediscoveryextension.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Error codes used with DDErrorDomain.
 * DeviceDiscoveryExtension error code range: 350000-350999.
 * 
 * API-Since: 16.0
 */
@Generated
public final class DDErrorCode {
    @Generated
    private DDErrorCode() {
    }

    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Success = 0x0000000000000000L;
    /**
     * Success.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Unknown = 0x0000000000055730L;
    /**
     * Underlying failure with an unknown cause.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long BadParameter = 0x0000000000055731L;
    /**
     * Bad parameter.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Unsupported = 0x0000000000055732L;
    /**
     * Unsupported value, operation, etc.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Timeout = 0x0000000000055733L;
    /**
     * Session or operation timed out.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Internal = 0x0000000000055734L;
    /**
     * Internal problem.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long MissingEntitlement = 0x0000000000055735L;
    /**
     * Missing entitlement.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Permission = 0x0000000000055736L;
    /**
     * Next error code to be allocated
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Next = 0x0000000000055737L;
}