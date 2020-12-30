package apple.networkextension.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * @typedef NEVPNIKEv2TLSVersion
 * @abstract TLS Versions for use in EAP-TLS
 */
@Generated
public final class NEVPNIKEv2TLSVersion {
    @Generated
    private NEVPNIKEv2TLSVersion() {
    }

    /**
     * @const NEVPNIKEv2TLSVersionDefault Use the default TLS configuration
     */
    @Generated @NInt public static final long VersionDefault = 0x0000000000000000L;
    /**
     * @const NEVPNIKEv2TLSVersion1_0 TLS 1.0
     */
    @Generated @NInt public static final long Version1_0 = 0x0000000000000001L;
    /**
     * @const NEVPNIKEv2TLSVersion1_0 TLS 1.1
     */
    @Generated @NInt public static final long Version1_1 = 0x0000000000000002L;
    /**
     * @const NEVPNIKEv2TLSVersion1_0 TLS 1.2
     */
    @Generated @NInt public static final long Version1_2 = 0x0000000000000003L;
}