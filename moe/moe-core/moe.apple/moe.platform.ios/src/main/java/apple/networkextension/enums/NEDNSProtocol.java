package apple.networkextension.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@typedef] NEDNSProtocol
 * 
 * DNS protocol variants
 * 
 * API-Since: 14.0
 */
@Generated
public final class NEDNSProtocol {
    @Generated
    private NEDNSProtocol() {
    }

    /**
     * [@const] NEDNSProtocolCleartext Use traditional cleartext DNS over UDP and TCP port 53
     * 
     * API-Since: 14.0
     */
    @Generated @NInt public static final long Cleartext = 0x0000000000000001L;
    /**
     * [@const] NEDNSProtocolTLS Use DNS-over-TLS
     * 
     * API-Since: 14.0
     */
    @Generated @NInt public static final long TLS = 0x0000000000000002L;
    /**
     * [@const] NEDNSProtocolHTTPS Use DNS-over-HTTPS
     * 
     * API-Since: 14.0
     */
    @Generated @NInt public static final long HTTPS = 0x0000000000000003L;
}
