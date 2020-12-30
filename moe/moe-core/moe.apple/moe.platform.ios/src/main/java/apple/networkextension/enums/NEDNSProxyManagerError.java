package apple.networkextension.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * @typedef NEDNSProxyError
 * @abstract DNS proxy error codes
 */
@Generated
public final class NEDNSProxyManagerError {
    @Generated
    private NEDNSProxyManagerError() {
    }

    /**
     * @const NEDNSProxyManagerErrorConfigurationInvalid The DNS proxy configuration is invalid
     */
    @Generated @NInt public static final long Invalid = 0x0000000000000001L;
    /**
     * @const NEDNSProxyManagerErrorConfigurationDisabled The DNS proxy configuration is not enabled.
     */
    @Generated @NInt public static final long Disabled = 0x0000000000000002L;
    /**
     * @const NEDNSProxyManagerErrorConfigurationStale The DNS proxy configuration needs to be loaded.
     */
    @Generated @NInt public static final long Stale = 0x0000000000000003L;
    /**
     * @const NEDNSProxyManagerErrorConfigurationCannotBeRemoved The DNS proxy configuration cannot be removed.
     */
    @Generated @NInt public static final long CannotBeRemoved = 0x0000000000000004L;
}