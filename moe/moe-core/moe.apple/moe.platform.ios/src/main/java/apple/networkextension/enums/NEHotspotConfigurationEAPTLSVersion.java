package apple.networkextension.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * @typedef NEHotspotConfigurationEAPTLSVersion
 * @abstract TLS version to use during TLS handshke.
 * @const NEHotspotConfigurationEAPTLSVersion_1_0 TLS version 1.0.
 * @const NEHotspotConfigurationEAPTLSVersion_1_1 TLS version 1.1.
 * @const NEHotspotConfigurationEAPTLSVersion_1_1 TLS version 1.2 (Default).
 */
@Generated
public final class NEHotspotConfigurationEAPTLSVersion {
    @Generated
    private NEHotspotConfigurationEAPTLSVersion() {
    }

    @Generated @NInt public static final long _0 = 0x0000000000000000L;
    @Generated @NInt public static final long _1 = 0x0000000000000001L;
    @Generated @NInt public static final long _2 = 0x0000000000000002L;
}