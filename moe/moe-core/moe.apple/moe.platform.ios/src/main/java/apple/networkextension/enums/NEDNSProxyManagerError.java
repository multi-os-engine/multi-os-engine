package apple.networkextension.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@typedef] NEDNSProxyError
 * 
 * DNS proxy error codes
 * 
 * API-Since: 11.0
 */
@Generated
public final class NEDNSProxyManagerError {
    @Generated
    private NEDNSProxyManagerError() {
    }

    /**
     * [@const] NEDNSProxyManagerErrorConfigurationInvalid The DNS proxy configuration is invalid
     * 
     * API-Since: 11.0
     */
    @Generated @NInt public static final long Invalid = 0x0000000000000001L;
    /**
     * [@const] NEDNSProxyManagerErrorConfigurationDisabled The DNS proxy configuration is not enabled.
     * 
     * API-Since: 11.0
     */
    @Generated @NInt public static final long Disabled = 0x0000000000000002L;
    /**
     * [@const] NEDNSProxyManagerErrorConfigurationStale The DNS proxy configuration needs to be loaded.
     * 
     * API-Since: 11.0
     */
    @Generated @NInt public static final long Stale = 0x0000000000000003L;
    /**
     * [@const] NEDNSProxyManagerErrorConfigurationCannotBeRemoved The DNS proxy configuration cannot be removed.
     * 
     * API-Since: 11.0
     */
    @Generated @NInt public static final long CannotBeRemoved = 0x0000000000000004L;
}
