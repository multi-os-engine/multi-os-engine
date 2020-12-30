package apple.security.enums;

import org.moe.natj.general.ann.Generated;

/**
 * @enum tls_ciphersuite_t enumeration
 * @abstract Enumerations for the set of supported TLS and DTLS ciphersuites.
 * 
 * See https://www.iana.org/assignments/tls-parameters/tls-parameters.xhtml#tls-parameters-4
 * for ciphersuite codepoint allocations and reference RFCs.
 * 
 * @constant tls_ciphersuite_RSA_WITH_3DES_EDE_CBC_SHA
 * @constant tls_ciphersuite_RSA_WITH_AES_128_CBC_SHA
 * @constant tls_ciphersuite_RSA_WITH_AES_256_CBC_SHA
 * @constant tls_ciphersuite_RSA_WITH_AES_128_GCM_SHA256
 * @constant tls_ciphersuite_RSA_WITH_AES_256_GCM_SHA384
 * @constant tls_ciphersuite_RSA_WITH_AES_128_CBC_SHA256
 * @constant tls_ciphersuite_RSA_WITH_AES_256_CBC_SHA256
 * @constant tls_ciphersuite_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA
 * @constant tls_ciphersuite_ECDHE_ECDSA_WITH_AES_128_CBC_SHA
 * @constant tls_ciphersuite_ECDHE_ECDSA_WITH_AES_256_CBC_SHA
 * @constant tls_ciphersuite_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA
 * @constant tls_ciphersuite_ECDHE_RSA_WITH_AES_128_CBC_SHA
 * @constant tls_ciphersuite_ECDHE_RSA_WITH_AES_256_CBC_SHA
 * @constant tls_ciphersuite_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256
 * @constant tls_ciphersuite_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384
 * @constant tls_ciphersuite_ECDHE_RSA_WITH_AES_128_CBC_SHA256
 * @constant tls_ciphersuite_ECDHE_RSA_WITH_AES_256_CBC_SHA384
 * @constant tls_ciphersuite_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256
 * @constant tls_ciphersuite_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384
 * @constant tls_ciphersuite_ECDHE_RSA_WITH_AES_128_GCM_SHA256
 * @constant tls_ciphersuite_ECDHE_RSA_WITH_AES_256_GCM_SHA384
 * @constant tls_ciphersuite_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256
 * @constant tls_ciphersuite_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256
 * @constant tls_ciphersuite_AES_128_GCM_SHA256
 * @constant tls_ciphersuite_AES_256_GCM_SHA384
 * @constant tls_ciphersuite_CHACHA20_POLY1305_SHA256
 */
@Generated
public final class tls_ciphersuite_t {
    @Generated
    private tls_ciphersuite_t() {
    }

    @Generated public static final char RSA_WITH_3DES_EDE_CBC_SHA = 0x000A;
    @Generated public static final char RSA_WITH_AES_128_CBC_SHA = 0x002F;
    @Generated public static final char RSA_WITH_AES_256_CBC_SHA = 0x0035;
    @Generated public static final char RSA_WITH_AES_128_GCM_SHA256 = 0x009C;
    @Generated public static final char RSA_WITH_AES_256_GCM_SHA384 = 0x009D;
    @Generated public static final char RSA_WITH_AES_128_CBC_SHA256 = 0x003C;
    @Generated public static final char RSA_WITH_AES_256_CBC_SHA256 = 0x003D;
    @Generated public static final char ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA = 0xC008;
    @Generated public static final char ECDHE_ECDSA_WITH_AES_128_CBC_SHA = 0xC009;
    @Generated public static final char ECDHE_ECDSA_WITH_AES_256_CBC_SHA = 0xC00A;
    @Generated public static final char ECDHE_RSA_WITH_3DES_EDE_CBC_SHA = 0xC012;
    @Generated public static final char ECDHE_RSA_WITH_AES_128_CBC_SHA = 0xC013;
    @Generated public static final char ECDHE_RSA_WITH_AES_256_CBC_SHA = 0xC014;
    @Generated public static final char ECDHE_ECDSA_WITH_AES_128_CBC_SHA256 = 0xC023;
    @Generated public static final char ECDHE_ECDSA_WITH_AES_256_CBC_SHA384 = 0xC024;
    @Generated public static final char ECDHE_RSA_WITH_AES_128_CBC_SHA256 = 0xC027;
    @Generated public static final char ECDHE_RSA_WITH_AES_256_CBC_SHA384 = 0xC028;
    @Generated public static final char ECDHE_ECDSA_WITH_AES_128_GCM_SHA256 = 0xC02B;
    @Generated public static final char ECDHE_ECDSA_WITH_AES_256_GCM_SHA384 = 0xC02C;
    @Generated public static final char ECDHE_RSA_WITH_AES_128_GCM_SHA256 = 0xC02F;
    @Generated public static final char ECDHE_RSA_WITH_AES_256_GCM_SHA384 = 0xC030;
    @Generated public static final char ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256 = 0xCCA8;
    @Generated public static final char ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256 = 0xCCA9;
    @Generated public static final char AES_128_GCM_SHA256 = 0x1301;
    @Generated public static final char AES_256_GCM_SHA384 = 0x1302;
    @Generated public static final char CHACHA20_POLY1305_SHA256 = 0x1303;
}