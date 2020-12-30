package apple.security.enums;

import org.moe.natj.general.ann.Generated;

/**
 * @enum tls_protocol_version_t enumeration
 * @abstract Enumerations for the set of supported TLS and DTLS protocol versions.
 * 
 * @constant tls_protocol_version_TLSv10 TLS 1.0 [https://tools.ietf.org/html/rfc4346]
 * @constant tls_protocol_version_TLSv11 TLS 1.1 [https://tools.ietf.org/html/rfc2246]
 * @constant tls_protocol_version_TLSv12 TLS 1.2 [https://tools.ietf.org/html/rfc5246]
 * @constant tls_protocol_version_TLSv13 TLS 1.3 [https://tools.ietf.org/html/rfc8446]
 * @constant tls_protocol_version_DTLSv10 DTLS 1.0 [https://tools.ietf.org/html/rfc4347]
 * @constant tls_protocol_version_DTLSv12 DTLS 1.2 [https://tools.ietf.org/html/rfc6347]
 */
@Generated
public final class tls_protocol_version_t {
    @Generated
    private tls_protocol_version_t() {
    }

    @Generated public static final char TLSv10 = 0x0301;
    @Generated public static final char TLSv11 = 0x0302;
    @Generated public static final char TLSv12 = 0x0303;
    @Generated public static final char TLSv13 = 0x0304;
    @Generated public static final char DTLSv10 = 0xFEFF;
    @Generated public static final char DTLSv12 = 0xFEFD;
}