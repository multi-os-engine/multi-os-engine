package apple.networkextension.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@typedef] NEHotspotConfigurationEAPTLSVersion
 * 
 * TLS version to use during TLS handshke.
 * [@const] NEHotspotConfigurationEAPTLSVersion_1_0 TLS version 1.0.
 * [@const] NEHotspotConfigurationEAPTLSVersion_1_1 TLS version 1.1.
 * [@const] NEHotspotConfigurationEAPTLSVersion_1_1 TLS version 1.2 (Default).
 * 
 * API-Since: 11.0
 */
@Generated
public final class NEHotspotConfigurationEAPTLSVersion {
    @Generated
    private NEHotspotConfigurationEAPTLSVersion() {
    }

    /**
     * API-Since: 11.0
     */
    @Generated @NInt public static final long _0 = 0x0000000000000000L;
    /**
     * API-Since: 11.0
     */
    @Generated @NInt public static final long _1 = 0x0000000000000001L;
    /**
     * API-Since: 11.0
     */
    @Generated @NInt public static final long _2 = 0x0000000000000002L;
}
