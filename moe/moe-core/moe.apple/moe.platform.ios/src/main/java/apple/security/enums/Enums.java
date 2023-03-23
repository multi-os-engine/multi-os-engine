/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package apple.security.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class Enums {
    /**
     * No error.
     */
    @Generated public static final int errSecSuccess = 0x00000000;
    /**
     * Function or operation not implemented.
     */
    @Generated public static final int errSecUnimplemented = 0xFFFFFFFC;
    /**
     * I/O error.
     */
    @Generated public static final int errSecIO = 0xFFFFFFDC;
    /**
     * File already open with write permission.
     */
    @Generated public static final int errSecOpWr = 0xFFFFFFCF;
    /**
     * One or more parameters passed to a function were not valid.
     */
    @Generated public static final int errSecParam = 0xFFFFFFCE;
    /**
     * Failed to allocate memory.
     */
    @Generated public static final int errSecAllocate = 0xFFFFFF94;
    /**
     * User canceled the operation.
     */
    @Generated public static final int errSecUserCanceled = 0xFFFFFF80;
    /**
     * Bad parameter or invalid state for operation.
     */
    @Generated public static final int errSecBadReq = 0xFFFFFC73;
    @Generated public static final int errSecInternalComponent = 0xFFFFF7EA;
    /**
     * No keychain is available. You may need to restart your computer.
     */
    @Generated public static final int errSecNotAvailable = 0xFFFF9D35;
    /**
     * The specified item already exists in the keychain.
     */
    @Generated public static final int errSecDuplicateItem = 0xFFFF9D2D;
    /**
     * The specified item could not be found in the keychain.
     */
    @Generated public static final int errSecItemNotFound = 0xFFFF9D2C;
    /**
     * User interaction is not allowed.
     */
    @Generated public static final int errSecInteractionNotAllowed = 0xFFFF9D24;
    /**
     * Unable to decode the provided data.
     */
    @Generated public static final int errSecDecode = 0xFFFF995D;
    /**
     * The user name or passphrase you entered is not correct.
     */
    @Generated public static final int errSecAuthFailed = 0xFFFF9D33;
    /**
     * A cryptographic verification failure has occurred.
     */
    @Generated public static final int errSecVerifyFailed = 0xFFFEF720;
    @Generated @NUInt public static final long kSecRevocationOCSPMethod = 0x0000000000000001L;
    @Generated @NUInt public static final long kSecRevocationCRLMethod = 0x0000000000000002L;
    @Generated @NUInt public static final long kSecRevocationPreferCRL = 0x0000000000000004L;
    @Generated @NUInt public static final long kSecRevocationRequirePositiveResponse = 0x0000000000000008L;
    @Generated @NUInt public static final long kSecRevocationNetworkAccessDisabled = 0x0000000000000010L;
    @Generated @NUInt public static final long kSecRevocationUseAnyAvailableMethod = 0x0000000000000003L;
    /**
     * SSL protocol error
     */
    @Generated public static final int errSSLProtocol = 0xFFFFD9B8;
    /**
     * Cipher Suite negotiation failure
     */
    @Generated public static final int errSSLNegotiation = 0xFFFFD9B7;
    /**
     * Fatal alert
     */
    @Generated public static final int errSSLFatalAlert = 0xFFFFD9B6;
    /**
     * I/O would block (not fatal)
     */
    @Generated public static final int errSSLWouldBlock = 0xFFFFD9B5;
    /**
     * attempt to restore an unknown session
     */
    @Generated public static final int errSSLSessionNotFound = 0xFFFFD9B4;
    /**
     * connection closed gracefully
     */
    @Generated public static final int errSSLClosedGraceful = 0xFFFFD9B3;
    /**
     * connection closed via error
     */
    @Generated public static final int errSSLClosedAbort = 0xFFFFD9B2;
    /**
     * invalid certificate chain
     */
    @Generated public static final int errSSLXCertChainInvalid = 0xFFFFD9B1;
    /**
     * bad certificate format
     */
    @Generated public static final int errSSLBadCert = 0xFFFFD9B0;
    /**
     * underlying cryptographic error
     */
    @Generated public static final int errSSLCrypto = 0xFFFFD9AF;
    /**
     * Internal error
     */
    @Generated public static final int errSSLInternal = 0xFFFFD9AE;
    /**
     * module attach failure
     */
    @Generated public static final int errSSLModuleAttach = 0xFFFFD9AD;
    /**
     * valid cert chain, untrusted root
     */
    @Generated public static final int errSSLUnknownRootCert = 0xFFFFD9AC;
    /**
     * cert chain not verified by root
     */
    @Generated public static final int errSSLNoRootCert = 0xFFFFD9AB;
    /**
     * chain had an expired cert
     */
    @Generated public static final int errSSLCertExpired = 0xFFFFD9AA;
    /**
     * chain had a cert not yet valid
     */
    @Generated public static final int errSSLCertNotYetValid = 0xFFFFD9A9;
    /**
     * server closed session with no notification
     */
    @Generated public static final int errSSLClosedNoNotify = 0xFFFFD9A8;
    /**
     * insufficient buffer provided
     */
    @Generated public static final int errSSLBufferOverflow = 0xFFFFD9A7;
    /**
     * bad SSLCipherSuite
     */
    @Generated public static final int errSSLBadCipherSuite = 0xFFFFD9A6;
    /**
     * unexpected message received
     */
    @Generated public static final int errSSLPeerUnexpectedMsg = 0xFFFFD9A5;
    /**
     * bad MAC
     */
    @Generated public static final int errSSLPeerBadRecordMac = 0xFFFFD9A4;
    /**
     * decryption failed
     */
    @Generated public static final int errSSLPeerDecryptionFail = 0xFFFFD9A3;
    /**
     * record overflow
     */
    @Generated public static final int errSSLPeerRecordOverflow = 0xFFFFD9A2;
    /**
     * decompression failure
     */
    @Generated public static final int errSSLPeerDecompressFail = 0xFFFFD9A1;
    /**
     * handshake failure
     */
    @Generated public static final int errSSLPeerHandshakeFail = 0xFFFFD9A0;
    /**
     * misc. bad certificate
     */
    @Generated public static final int errSSLPeerBadCert = 0xFFFFD99F;
    /**
     * bad unsupported cert format
     */
    @Generated public static final int errSSLPeerUnsupportedCert = 0xFFFFD99E;
    /**
     * certificate revoked
     */
    @Generated public static final int errSSLPeerCertRevoked = 0xFFFFD99D;
    /**
     * certificate expired
     */
    @Generated public static final int errSSLPeerCertExpired = 0xFFFFD99C;
    /**
     * unknown certificate
     */
    @Generated public static final int errSSLPeerCertUnknown = 0xFFFFD99B;
    /**
     * illegal parameter
     */
    @Generated public static final int errSSLIllegalParam = 0xFFFFD99A;
    /**
     * unknown Cert Authority
     */
    @Generated public static final int errSSLPeerUnknownCA = 0xFFFFD999;
    /**
     * access denied
     */
    @Generated public static final int errSSLPeerAccessDenied = 0xFFFFD998;
    /**
     * decoding error
     */
    @Generated public static final int errSSLPeerDecodeError = 0xFFFFD997;
    /**
     * decryption error
     */
    @Generated public static final int errSSLPeerDecryptError = 0xFFFFD996;
    /**
     * export restriction
     */
    @Generated public static final int errSSLPeerExportRestriction = 0xFFFFD995;
    /**
     * bad protocol version
     */
    @Generated public static final int errSSLPeerProtocolVersion = 0xFFFFD994;
    /**
     * insufficient security
     */
    @Generated public static final int errSSLPeerInsufficientSecurity = 0xFFFFD993;
    /**
     * internal error
     */
    @Generated public static final int errSSLPeerInternalError = 0xFFFFD992;
    /**
     * user canceled
     */
    @Generated public static final int errSSLPeerUserCancelled = 0xFFFFD991;
    /**
     * no renegotiation allowed
     */
    @Generated public static final int errSSLPeerNoRenegotiation = 0xFFFFD990;
    /**
     * peer cert is valid, or was ignored if verification disabled
     */
    @Generated public static final int errSSLPeerAuthCompleted = 0xFFFFD98F;
    /**
     * server has requested a client cert
     */
    @Generated public static final int errSSLClientCertRequested = 0xFFFFD98E;
    /**
     * peer host name mismatch
     */
    @Generated public static final int errSSLHostNameMismatch = 0xFFFFD98D;
    /**
     * peer dropped connection before responding
     */
    @Generated public static final int errSSLConnectionRefused = 0xFFFFD98C;
    /**
     * decryption failure
     */
    @Generated public static final int errSSLDecryptionFail = 0xFFFFD98B;
    /**
     * bad MAC
     */
    @Generated public static final int errSSLBadRecordMac = 0xFFFFD98A;
    /**
     * record overflow
     */
    @Generated public static final int errSSLRecordOverflow = 0xFFFFD989;
    /**
     * configuration error
     */
    @Generated public static final int errSSLBadConfiguration = 0xFFFFD988;
    /**
     * unexpected (skipped) record in DTLS
     */
    @Generated public static final int errSSLUnexpectedRecord = 0xFFFFD987;
    /**
     * weak ephemeral dh key
     */
    @Generated public static final int errSSLWeakPeerEphemeralDHKey = 0xFFFFD986;
    /**
     * SNI
     */
    @Generated public static final int errSSLClientHelloReceived = 0xFFFFD985;
    @Generated public static final char SSL_NULL_WITH_NULL_NULL = 0x0000;
    @Generated public static final char SSL_RSA_WITH_NULL_MD5 = 0x0001;
    @Generated public static final char SSL_RSA_WITH_NULL_SHA = 0x0002;
    @Generated public static final char SSL_RSA_EXPORT_WITH_RC4_40_MD5 = 0x0003;
    @Generated public static final char SSL_RSA_WITH_RC4_128_MD5 = 0x0004;
    @Generated public static final char SSL_RSA_WITH_RC4_128_SHA = 0x0005;
    @Generated public static final char SSL_RSA_EXPORT_WITH_RC2_CBC_40_MD5 = 0x0006;
    @Generated public static final char SSL_RSA_WITH_IDEA_CBC_SHA = 0x0007;
    @Generated public static final char SSL_RSA_EXPORT_WITH_DES40_CBC_SHA = 0x0008;
    @Generated public static final char SSL_RSA_WITH_DES_CBC_SHA = 0x0009;
    @Generated public static final char SSL_RSA_WITH_3DES_EDE_CBC_SHA = 0x000A;
    @Generated public static final char SSL_DH_DSS_EXPORT_WITH_DES40_CBC_SHA = 0x000B;
    @Generated public static final char SSL_DH_DSS_WITH_DES_CBC_SHA = 0x000C;
    @Generated public static final char SSL_DH_DSS_WITH_3DES_EDE_CBC_SHA = 0x000D;
    @Generated public static final char SSL_DH_RSA_EXPORT_WITH_DES40_CBC_SHA = 0x000E;
    @Generated public static final char SSL_DH_RSA_WITH_DES_CBC_SHA = 0x000F;
    @Generated public static final char SSL_DH_RSA_WITH_3DES_EDE_CBC_SHA = 0x0010;
    @Generated public static final char SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA = 0x0011;
    @Generated public static final char SSL_DHE_DSS_WITH_DES_CBC_SHA = 0x0012;
    @Generated public static final char SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA = 0x0013;
    @Generated public static final char SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA = 0x0014;
    @Generated public static final char SSL_DHE_RSA_WITH_DES_CBC_SHA = 0x0015;
    @Generated public static final char SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA = 0x0016;
    @Generated public static final char SSL_DH_anon_EXPORT_WITH_RC4_40_MD5 = 0x0017;
    @Generated public static final char SSL_DH_anon_WITH_RC4_128_MD5 = 0x0018;
    @Generated public static final char SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA = 0x0019;
    @Generated public static final char SSL_DH_anon_WITH_DES_CBC_SHA = 0x001A;
    @Generated public static final char SSL_DH_anon_WITH_3DES_EDE_CBC_SHA = 0x001B;
    @Generated public static final char SSL_FORTEZZA_DMS_WITH_NULL_SHA = 0x001C;
    @Generated public static final char SSL_FORTEZZA_DMS_WITH_FORTEZZA_CBC_SHA = 0x001D;
    /**
     * TLS addenda using AES, per RFC 3268
     */
    @Generated public static final char TLS_RSA_WITH_AES_128_CBC_SHA = 0x002F;
    /**
     * TLS addenda using AES, per RFC 3268
     */
    @Generated public static final char TLS_DH_DSS_WITH_AES_128_CBC_SHA = 0x0030;
    /**
     * TLS addenda using AES, per RFC 3268
     */
    @Generated public static final char TLS_DH_RSA_WITH_AES_128_CBC_SHA = 0x0031;
    /**
     * TLS addenda using AES, per RFC 3268
     */
    @Generated public static final char TLS_DHE_DSS_WITH_AES_128_CBC_SHA = 0x0032;
    /**
     * TLS addenda using AES, per RFC 3268
     */
    @Generated public static final char TLS_DHE_RSA_WITH_AES_128_CBC_SHA = 0x0033;
    /**
     * TLS addenda using AES, per RFC 3268
     */
    @Generated public static final char TLS_DH_anon_WITH_AES_128_CBC_SHA = 0x0034;
    /**
     * TLS addenda using AES, per RFC 3268
     */
    @Generated public static final char TLS_RSA_WITH_AES_256_CBC_SHA = 0x0035;
    /**
     * TLS addenda using AES, per RFC 3268
     */
    @Generated public static final char TLS_DH_DSS_WITH_AES_256_CBC_SHA = 0x0036;
    /**
     * TLS addenda using AES, per RFC 3268
     */
    @Generated public static final char TLS_DH_RSA_WITH_AES_256_CBC_SHA = 0x0037;
    /**
     * TLS addenda using AES, per RFC 3268
     */
    @Generated public static final char TLS_DHE_DSS_WITH_AES_256_CBC_SHA = 0x0038;
    /**
     * TLS addenda using AES, per RFC 3268
     */
    @Generated public static final char TLS_DHE_RSA_WITH_AES_256_CBC_SHA = 0x0039;
    /**
     * TLS addenda using AES, per RFC 3268
     */
    @Generated public static final char TLS_DH_anon_WITH_AES_256_CBC_SHA = 0x003A;
    /**
     * ECDSA addenda, RFC 4492
     */
    @Generated public static final char TLS_ECDH_ECDSA_WITH_NULL_SHA = 0xC001;
    /**
     * ECDSA addenda, RFC 4492
     */
    @Generated public static final char TLS_ECDH_ECDSA_WITH_RC4_128_SHA = 0xC002;
    /**
     * ECDSA addenda, RFC 4492
     */
    @Generated public static final char TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA = 0xC003;
    /**
     * ECDSA addenda, RFC 4492
     */
    @Generated public static final char TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA = 0xC004;
    /**
     * ECDSA addenda, RFC 4492
     */
    @Generated public static final char TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA = 0xC005;
    /**
     * ECDSA addenda, RFC 4492
     */
    @Generated public static final char TLS_ECDHE_ECDSA_WITH_NULL_SHA = 0xC006;
    /**
     * ECDSA addenda, RFC 4492
     */
    @Generated public static final char TLS_ECDHE_ECDSA_WITH_RC4_128_SHA = 0xC007;
    /**
     * ECDSA addenda, RFC 4492
     */
    @Generated public static final char TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA = 0xC008;
    /**
     * ECDSA addenda, RFC 4492
     */
    @Generated public static final char TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA = 0xC009;
    /**
     * ECDSA addenda, RFC 4492
     */
    @Generated public static final char TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA = 0xC00A;
    /**
     * ECDSA addenda, RFC 4492
     */
    @Generated public static final char TLS_ECDH_RSA_WITH_NULL_SHA = 0xC00B;
    /**
     * ECDSA addenda, RFC 4492
     */
    @Generated public static final char TLS_ECDH_RSA_WITH_RC4_128_SHA = 0xC00C;
    /**
     * ECDSA addenda, RFC 4492
     */
    @Generated public static final char TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA = 0xC00D;
    /**
     * ECDSA addenda, RFC 4492
     */
    @Generated public static final char TLS_ECDH_RSA_WITH_AES_128_CBC_SHA = 0xC00E;
    /**
     * ECDSA addenda, RFC 4492
     */
    @Generated public static final char TLS_ECDH_RSA_WITH_AES_256_CBC_SHA = 0xC00F;
    /**
     * ECDSA addenda, RFC 4492
     */
    @Generated public static final char TLS_ECDHE_RSA_WITH_NULL_SHA = 0xC010;
    /**
     * ECDSA addenda, RFC 4492
     */
    @Generated public static final char TLS_ECDHE_RSA_WITH_RC4_128_SHA = 0xC011;
    /**
     * ECDSA addenda, RFC 4492
     */
    @Generated public static final char TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA = 0xC012;
    /**
     * ECDSA addenda, RFC 4492
     */
    @Generated public static final char TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA = 0xC013;
    /**
     * ECDSA addenda, RFC 4492
     */
    @Generated public static final char TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA = 0xC014;
    /**
     * ECDSA addenda, RFC 4492
     */
    @Generated public static final char TLS_ECDH_anon_WITH_NULL_SHA = 0xC015;
    /**
     * ECDSA addenda, RFC 4492
     */
    @Generated public static final char TLS_ECDH_anon_WITH_RC4_128_SHA = 0xC016;
    /**
     * ECDSA addenda, RFC 4492
     */
    @Generated public static final char TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA = 0xC017;
    /**
     * ECDSA addenda, RFC 4492
     */
    @Generated public static final char TLS_ECDH_anon_WITH_AES_128_CBC_SHA = 0xC018;
    /**
     * ECDSA addenda, RFC 4492
     */
    @Generated public static final char TLS_ECDH_anon_WITH_AES_256_CBC_SHA = 0xC019;
    /**
     * Initial state.
     */
    @Generated public static final char TLS_NULL_WITH_NULL_NULL = 0x0000;
    /**
     * Server provided RSA certificate for key exchange.
     */
    @Generated public static final char TLS_RSA_WITH_NULL_MD5 = 0x0001;
    /**
     * Server provided RSA certificate for key exchange.
     */
    @Generated public static final char TLS_RSA_WITH_NULL_SHA = 0x0002;
    /**
     * Server provided RSA certificate for key exchange.
     */
    @Generated public static final char TLS_RSA_WITH_RC4_128_MD5 = 0x0004;
    /**
     * Server provided RSA certificate for key exchange.
     */
    @Generated public static final char TLS_RSA_WITH_RC4_128_SHA = 0x0005;
    /**
     * Server provided RSA certificate for key exchange.
     */
    @Generated public static final char TLS_RSA_WITH_3DES_EDE_CBC_SHA = 0x000A;
    /**
     * Server provided RSA certificate for key exchange.
     */
    @Generated public static final char TLS_RSA_WITH_NULL_SHA256 = 0x003B;
    /**
     * Server provided RSA certificate for key exchange.
     */
    @Generated public static final char TLS_RSA_WITH_AES_128_CBC_SHA256 = 0x003C;
    /**
     * Server provided RSA certificate for key exchange.
     */
    @Generated public static final char TLS_RSA_WITH_AES_256_CBC_SHA256 = 0x003D;
    /**
     * Server-authenticated (and optionally client-authenticated) Diffie-Hellman.
     */
    @Generated public static final char TLS_DH_DSS_WITH_3DES_EDE_CBC_SHA = 0x000D;
    /**
     * Server-authenticated (and optionally client-authenticated) Diffie-Hellman.
     */
    @Generated public static final char TLS_DH_RSA_WITH_3DES_EDE_CBC_SHA = 0x0010;
    /**
     * Server-authenticated (and optionally client-authenticated) Diffie-Hellman.
     */
    @Generated public static final char TLS_DHE_DSS_WITH_3DES_EDE_CBC_SHA = 0x0013;
    /**
     * Server-authenticated (and optionally client-authenticated) Diffie-Hellman.
     */
    @Generated public static final char TLS_DHE_RSA_WITH_3DES_EDE_CBC_SHA = 0x0016;
    /**
     * Server-authenticated (and optionally client-authenticated) Diffie-Hellman.
     */
    @Generated public static final char TLS_DH_DSS_WITH_AES_128_CBC_SHA256 = 0x003E;
    /**
     * Server-authenticated (and optionally client-authenticated) Diffie-Hellman.
     */
    @Generated public static final char TLS_DH_RSA_WITH_AES_128_CBC_SHA256 = 0x003F;
    /**
     * Server-authenticated (and optionally client-authenticated) Diffie-Hellman.
     */
    @Generated public static final char TLS_DHE_DSS_WITH_AES_128_CBC_SHA256 = 0x0040;
    /**
     * Server-authenticated (and optionally client-authenticated) Diffie-Hellman.
     */
    @Generated public static final char TLS_DHE_RSA_WITH_AES_128_CBC_SHA256 = 0x0067;
    /**
     * Server-authenticated (and optionally client-authenticated) Diffie-Hellman.
     */
    @Generated public static final char TLS_DH_DSS_WITH_AES_256_CBC_SHA256 = 0x0068;
    /**
     * Server-authenticated (and optionally client-authenticated) Diffie-Hellman.
     */
    @Generated public static final char TLS_DH_RSA_WITH_AES_256_CBC_SHA256 = 0x0069;
    /**
     * Server-authenticated (and optionally client-authenticated) Diffie-Hellman.
     */
    @Generated public static final char TLS_DHE_DSS_WITH_AES_256_CBC_SHA256 = 0x006A;
    /**
     * Server-authenticated (and optionally client-authenticated) Diffie-Hellman.
     */
    @Generated public static final char TLS_DHE_RSA_WITH_AES_256_CBC_SHA256 = 0x006B;
    /**
     * Completely anonymous Diffie-Hellman
     */
    @Generated public static final char TLS_DH_anon_WITH_RC4_128_MD5 = 0x0018;
    /**
     * Completely anonymous Diffie-Hellman
     */
    @Generated public static final char TLS_DH_anon_WITH_3DES_EDE_CBC_SHA = 0x001B;
    /**
     * Completely anonymous Diffie-Hellman
     */
    @Generated public static final char TLS_DH_anon_WITH_AES_128_CBC_SHA256 = 0x006C;
    /**
     * Completely anonymous Diffie-Hellman
     */
    @Generated public static final char TLS_DH_anon_WITH_AES_256_CBC_SHA256 = 0x006D;
    /**
     * Addendum from RFC 4279, TLS PSK
     */
    @Generated public static final char TLS_PSK_WITH_RC4_128_SHA = 0x008A;
    /**
     * Addendum from RFC 4279, TLS PSK
     */
    @Generated public static final char TLS_PSK_WITH_3DES_EDE_CBC_SHA = 0x008B;
    /**
     * Addendum from RFC 4279, TLS PSK
     */
    @Generated public static final char TLS_PSK_WITH_AES_128_CBC_SHA = 0x008C;
    /**
     * Addendum from RFC 4279, TLS PSK
     */
    @Generated public static final char TLS_PSK_WITH_AES_256_CBC_SHA = 0x008D;
    /**
     * Addendum from RFC 4279, TLS PSK
     */
    @Generated public static final char TLS_DHE_PSK_WITH_RC4_128_SHA = 0x008E;
    /**
     * Addendum from RFC 4279, TLS PSK
     */
    @Generated public static final char TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA = 0x008F;
    /**
     * Addendum from RFC 4279, TLS PSK
     */
    @Generated public static final char TLS_DHE_PSK_WITH_AES_128_CBC_SHA = 0x0090;
    /**
     * Addendum from RFC 4279, TLS PSK
     */
    @Generated public static final char TLS_DHE_PSK_WITH_AES_256_CBC_SHA = 0x0091;
    /**
     * Addendum from RFC 4279, TLS PSK
     */
    @Generated public static final char TLS_RSA_PSK_WITH_RC4_128_SHA = 0x0092;
    /**
     * Addendum from RFC 4279, TLS PSK
     */
    @Generated public static final char TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA = 0x0093;
    /**
     * Addendum from RFC 4279, TLS PSK
     */
    @Generated public static final char TLS_RSA_PSK_WITH_AES_128_CBC_SHA = 0x0094;
    /**
     * Addendum from RFC 4279, TLS PSK
     */
    @Generated public static final char TLS_RSA_PSK_WITH_AES_256_CBC_SHA = 0x0095;
    /**
     * RFC 4785 - Pre-Shared Key (PSK) Ciphersuites with NULL Encryption
     */
    @Generated public static final char TLS_PSK_WITH_NULL_SHA = 0x002C;
    /**
     * RFC 4785 - Pre-Shared Key (PSK) Ciphersuites with NULL Encryption
     */
    @Generated public static final char TLS_DHE_PSK_WITH_NULL_SHA = 0x002D;
    /**
     * RFC 4785 - Pre-Shared Key (PSK) Ciphersuites with NULL Encryption
     */
    @Generated public static final char TLS_RSA_PSK_WITH_NULL_SHA = 0x002E;
    /**
     * Addenda from rfc 5288 AES Galois Counter Mode (GCM) Cipher Suites for TLS.
     */
    @Generated public static final char TLS_RSA_WITH_AES_128_GCM_SHA256 = 0x009C;
    /**
     * Addenda from rfc 5288 AES Galois Counter Mode (GCM) Cipher Suites for TLS.
     */
    @Generated public static final char TLS_RSA_WITH_AES_256_GCM_SHA384 = 0x009D;
    /**
     * Addenda from rfc 5288 AES Galois Counter Mode (GCM) Cipher Suites for TLS.
     */
    @Generated public static final char TLS_DHE_RSA_WITH_AES_128_GCM_SHA256 = 0x009E;
    /**
     * Addenda from rfc 5288 AES Galois Counter Mode (GCM) Cipher Suites for TLS.
     */
    @Generated public static final char TLS_DHE_RSA_WITH_AES_256_GCM_SHA384 = 0x009F;
    /**
     * Addenda from rfc 5288 AES Galois Counter Mode (GCM) Cipher Suites for TLS.
     */
    @Generated public static final char TLS_DH_RSA_WITH_AES_128_GCM_SHA256 = 0x00A0;
    /**
     * Addenda from rfc 5288 AES Galois Counter Mode (GCM) Cipher Suites for TLS.
     */
    @Generated public static final char TLS_DH_RSA_WITH_AES_256_GCM_SHA384 = 0x00A1;
    /**
     * Addenda from rfc 5288 AES Galois Counter Mode (GCM) Cipher Suites for TLS.
     */
    @Generated public static final char TLS_DHE_DSS_WITH_AES_128_GCM_SHA256 = 0x00A2;
    /**
     * Addenda from rfc 5288 AES Galois Counter Mode (GCM) Cipher Suites for TLS.
     */
    @Generated public static final char TLS_DHE_DSS_WITH_AES_256_GCM_SHA384 = 0x00A3;
    /**
     * Addenda from rfc 5288 AES Galois Counter Mode (GCM) Cipher Suites for TLS.
     */
    @Generated public static final char TLS_DH_DSS_WITH_AES_128_GCM_SHA256 = 0x00A4;
    /**
     * Addenda from rfc 5288 AES Galois Counter Mode (GCM) Cipher Suites for TLS.
     */
    @Generated public static final char TLS_DH_DSS_WITH_AES_256_GCM_SHA384 = 0x00A5;
    /**
     * Addenda from rfc 5288 AES Galois Counter Mode (GCM) Cipher Suites for TLS.
     */
    @Generated public static final char TLS_DH_anon_WITH_AES_128_GCM_SHA256 = 0x00A6;
    /**
     * Addenda from rfc 5288 AES Galois Counter Mode (GCM) Cipher Suites for TLS.
     */
    @Generated public static final char TLS_DH_anon_WITH_AES_256_GCM_SHA384 = 0x00A7;
    /**
     * RFC 5487 - PSK with SHA-256/384 and AES GCM
     */
    @Generated public static final char TLS_PSK_WITH_AES_128_GCM_SHA256 = 0x00A8;
    /**
     * RFC 5487 - PSK with SHA-256/384 and AES GCM
     */
    @Generated public static final char TLS_PSK_WITH_AES_256_GCM_SHA384 = 0x00A9;
    /**
     * RFC 5487 - PSK with SHA-256/384 and AES GCM
     */
    @Generated public static final char TLS_DHE_PSK_WITH_AES_128_GCM_SHA256 = 0x00AA;
    /**
     * RFC 5487 - PSK with SHA-256/384 and AES GCM
     */
    @Generated public static final char TLS_DHE_PSK_WITH_AES_256_GCM_SHA384 = 0x00AB;
    /**
     * RFC 5487 - PSK with SHA-256/384 and AES GCM
     */
    @Generated public static final char TLS_RSA_PSK_WITH_AES_128_GCM_SHA256 = 0x00AC;
    /**
     * RFC 5487 - PSK with SHA-256/384 and AES GCM
     */
    @Generated public static final char TLS_RSA_PSK_WITH_AES_256_GCM_SHA384 = 0x00AD;
    /**
     * RFC 5487 - PSK with SHA-256/384 and AES GCM
     */
    @Generated public static final char TLS_PSK_WITH_AES_128_CBC_SHA256 = 0x00AE;
    /**
     * RFC 5487 - PSK with SHA-256/384 and AES GCM
     */
    @Generated public static final char TLS_PSK_WITH_AES_256_CBC_SHA384 = 0x00AF;
    /**
     * RFC 5487 - PSK with SHA-256/384 and AES GCM
     */
    @Generated public static final char TLS_PSK_WITH_NULL_SHA256 = 0x00B0;
    /**
     * RFC 5487 - PSK with SHA-256/384 and AES GCM
     */
    @Generated public static final char TLS_PSK_WITH_NULL_SHA384 = 0x00B1;
    /**
     * RFC 5487 - PSK with SHA-256/384 and AES GCM
     */
    @Generated public static final char TLS_DHE_PSK_WITH_AES_128_CBC_SHA256 = 0x00B2;
    /**
     * RFC 5487 - PSK with SHA-256/384 and AES GCM
     */
    @Generated public static final char TLS_DHE_PSK_WITH_AES_256_CBC_SHA384 = 0x00B3;
    /**
     * RFC 5487 - PSK with SHA-256/384 and AES GCM
     */
    @Generated public static final char TLS_DHE_PSK_WITH_NULL_SHA256 = 0x00B4;
    /**
     * RFC 5487 - PSK with SHA-256/384 and AES GCM
     */
    @Generated public static final char TLS_DHE_PSK_WITH_NULL_SHA384 = 0x00B5;
    /**
     * RFC 5487 - PSK with SHA-256/384 and AES GCM
     */
    @Generated public static final char TLS_RSA_PSK_WITH_AES_128_CBC_SHA256 = 0x00B6;
    /**
     * RFC 5487 - PSK with SHA-256/384 and AES GCM
     */
    @Generated public static final char TLS_RSA_PSK_WITH_AES_256_CBC_SHA384 = 0x00B7;
    /**
     * RFC 5487 - PSK with SHA-256/384 and AES GCM
     */
    @Generated public static final char TLS_RSA_PSK_WITH_NULL_SHA256 = 0x00B8;
    /**
     * RFC 5487 - PSK with SHA-256/384 and AES GCM
     */
    @Generated public static final char TLS_RSA_PSK_WITH_NULL_SHA384 = 0x00B9;
    /**
     * Addenda from rfc 5289 Elliptic Curve Cipher Suites with
     * HMAC SHA-256/384.
     */
    @Generated public static final char TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256 = 0xC023;
    /**
     * Addenda from rfc 5289 Elliptic Curve Cipher Suites with
     * HMAC SHA-256/384.
     */
    @Generated public static final char TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384 = 0xC024;
    /**
     * Addenda from rfc 5289 Elliptic Curve Cipher Suites with
     * HMAC SHA-256/384.
     */
    @Generated public static final char TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256 = 0xC025;
    /**
     * Addenda from rfc 5289 Elliptic Curve Cipher Suites with
     * HMAC SHA-256/384.
     */
    @Generated public static final char TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384 = 0xC026;
    /**
     * Addenda from rfc 5289 Elliptic Curve Cipher Suites with
     * HMAC SHA-256/384.
     */
    @Generated public static final char TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256 = 0xC027;
    /**
     * Addenda from rfc 5289 Elliptic Curve Cipher Suites with
     * HMAC SHA-256/384.
     */
    @Generated public static final char TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384 = 0xC028;
    /**
     * Addenda from rfc 5289 Elliptic Curve Cipher Suites with
     * HMAC SHA-256/384.
     */
    @Generated public static final char TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256 = 0xC029;
    /**
     * Addenda from rfc 5289 Elliptic Curve Cipher Suites with
     * HMAC SHA-256/384.
     */
    @Generated public static final char TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384 = 0xC02A;
    /**
     * Addenda from rfc 5289 Elliptic Curve Cipher Suites with
     * SHA-256/384 and AES Galois Counter Mode (GCM)
     */
    @Generated public static final char TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256 = 0xC02B;
    /**
     * Addenda from rfc 5289 Elliptic Curve Cipher Suites with
     * SHA-256/384 and AES Galois Counter Mode (GCM)
     */
    @Generated public static final char TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384 = 0xC02C;
    /**
     * Addenda from rfc 5289 Elliptic Curve Cipher Suites with
     * SHA-256/384 and AES Galois Counter Mode (GCM)
     */
    @Generated public static final char TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256 = 0xC02D;
    /**
     * Addenda from rfc 5289 Elliptic Curve Cipher Suites with
     * SHA-256/384 and AES Galois Counter Mode (GCM)
     */
    @Generated public static final char TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384 = 0xC02E;
    /**
     * Addenda from rfc 5289 Elliptic Curve Cipher Suites with
     * SHA-256/384 and AES Galois Counter Mode (GCM)
     */
    @Generated public static final char TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256 = 0xC02F;
    /**
     * Addenda from rfc 5289 Elliptic Curve Cipher Suites with
     * SHA-256/384 and AES Galois Counter Mode (GCM)
     */
    @Generated public static final char TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384 = 0xC030;
    /**
     * Addenda from rfc 5289 Elliptic Curve Cipher Suites with
     * SHA-256/384 and AES Galois Counter Mode (GCM)
     */
    @Generated public static final char TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256 = 0xC031;
    /**
     * Addenda from rfc 5289 Elliptic Curve Cipher Suites with
     * SHA-256/384 and AES Galois Counter Mode (GCM)
     */
    @Generated public static final char TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384 = 0xC032;
    /**
     * RFC 5746 - Secure Renegotiation
     */
    @Generated public static final char TLS_EMPTY_RENEGOTIATION_INFO_SCSV = 0x00FF;
    /**
     * Tags for SSL 2 cipher kinds which are not specified
     * for SSL 3.
     */
    @Generated public static final char SSL_RSA_WITH_RC2_CBC_MD5 = 0xFF80;
    /**
     * Tags for SSL 2 cipher kinds which are not specified
     * for SSL 3.
     */
    @Generated public static final char SSL_RSA_WITH_IDEA_CBC_MD5 = 0xFF81;
    /**
     * Tags for SSL 2 cipher kinds which are not specified
     * for SSL 3.
     */
    @Generated public static final char SSL_RSA_WITH_DES_CBC_MD5 = 0xFF82;
    /**
     * Tags for SSL 2 cipher kinds which are not specified
     * for SSL 3.
     */
    @Generated public static final char SSL_RSA_WITH_3DES_EDE_CBC_MD5 = 0xFF83;
    /**
     * Tags for SSL 2 cipher kinds which are not specified
     * for SSL 3.
     */
    @Generated public static final char SSL_NO_SUCH_CIPHERSUITE = 0xFFFF;

    @Generated
    private Enums() {
    }

    @Generated public static final int errSecDskFull = 0xFFFFFFDE;
    /**
     * Write permissions error.
     */
    @Generated public static final int errSecWrPerm = 0xFFFFFFC3;
    @Generated public static final int errSecCoreFoundationUnknown = 0xFFFFECA0;
    /**
     * A required entitlement isn't present.
     */
    @Generated public static final int errSecMissingEntitlement = 0xFFFF7B1E;
    /**
     * This keychain cannot be modified.
     */
    @Generated public static final int errSecReadOnly = 0xFFFF9D34;
    /**
     * The specified keychain could not be found.
     */
    @Generated public static final int errSecNoSuchKeychain = 0xFFFF9D32;
    /**
     * The specified keychain is not a valid keychain file.
     */
    @Generated public static final int errSecInvalidKeychain = 0xFFFF9D31;
    /**
     * A keychain with the same name already exists.
     */
    @Generated public static final int errSecDuplicateKeychain = 0xFFFF9D30;
    /**
     * The specified callback function is already installed.
     */
    @Generated public static final int errSecDuplicateCallback = 0xFFFF9D2F;
    /**
     * The specified callback function is not valid.
     */
    @Generated public static final int errSecInvalidCallback = 0xFFFF9D2E;
    /**
     * There is not enough memory available to use the specified item.
     */
    @Generated public static final int errSecBufferTooSmall = 0xFFFF9D2B;
    /**
     * This item contains information which is too large or in a format that cannot be displayed.
     */
    @Generated public static final int errSecDataTooLarge = 0xFFFF9D2A;
    /**
     * The specified attribute does not exist.
     */
    @Generated public static final int errSecNoSuchAttr = 0xFFFF9D29;
    /**
     * The specified item is no longer valid. It may have been deleted from the keychain.
     */
    @Generated public static final int errSecInvalidItemRef = 0xFFFF9D28;
    /**
     * Unable to search the current keychain.
     */
    @Generated public static final int errSecInvalidSearchRef = 0xFFFF9D27;
    /**
     * The specified item does not appear to be a valid keychain item.
     */
    @Generated public static final int errSecNoSuchClass = 0xFFFF9D26;
    /**
     * A default keychain could not be found.
     */
    @Generated public static final int errSecNoDefaultKeychain = 0xFFFF9D25;
    /**
     * The specified attribute could not be modified.
     */
    @Generated public static final int errSecReadOnlyAttr = 0xFFFF9D23;
    /**
     * This keychain was created by a different version of the system software and cannot be opened.
     */
    @Generated public static final int errSecWrongSecVersion = 0xFFFF9D22;
    /**
     * This item specifies a key size which is too large or too small.
     */
    @Generated public static final int errSecKeySizeNotAllowed = 0xFFFF9D21;
    /**
     * A required component (data storage module) could not be loaded. You may need to restart your computer.
     */
    @Generated public static final int errSecNoStorageModule = 0xFFFF9D20;
    /**
     * A required component (certificate module) could not be loaded. You may need to restart your computer.
     */
    @Generated public static final int errSecNoCertificateModule = 0xFFFF9D1F;
    /**
     * A required component (policy module) could not be loaded. You may need to restart your computer.
     */
    @Generated public static final int errSecNoPolicyModule = 0xFFFF9D1E;
    /**
     * User interaction is required, but is currently not allowed.
     */
    @Generated public static final int errSecInteractionRequired = 0xFFFF9D1D;
    /**
     * The contents of this item cannot be retrieved.
     */
    @Generated public static final int errSecDataNotAvailable = 0xFFFF9D1C;
    /**
     * The contents of this item cannot be modified.
     */
    @Generated public static final int errSecDataNotModifiable = 0xFFFF9D1B;
    /**
     * One or more certificates required to validate this certificate cannot be found.
     */
    @Generated public static final int errSecCreateChainFailed = 0xFFFF9D1A;
    /**
     * The specified preferences domain is not valid.
     */
    @Generated public static final int errSecInvalidPrefsDomain = 0xFFFF9D19;
    /**
     * In dark wake, no UI possible
     */
    @Generated public static final int errSecInDarkWake = 0xFFFF9D18;
    /**
     * The specified access control list is not in standard (simple) form.
     */
    @Generated public static final int errSecACLNotSimple = 0xFFFF9D68;
    /**
     * The specified policy cannot be found.
     */
    @Generated public static final int errSecPolicyNotFound = 0xFFFF9D67;
    /**
     * The specified trust setting is invalid.
     */
    @Generated public static final int errSecInvalidTrustSetting = 0xFFFF9D66;
    /**
     * The specified item has no access control.
     */
    @Generated public static final int errSecNoAccessForItem = 0xFFFF9D65;
    /**
     * Invalid attempt to change the owner of this item.
     */
    @Generated public static final int errSecInvalidOwnerEdit = 0xFFFF9D64;
    /**
     * No trust results are available.
     */
    @Generated public static final int errSecTrustNotAvailable = 0xFFFF9D63;
    /**
     * Import/Export format unsupported.
     */
    @Generated public static final int errSecUnsupportedFormat = 0xFFFF9D58;
    /**
     * Unknown format in import.
     */
    @Generated public static final int errSecUnknownFormat = 0xFFFF9D57;
    /**
     * Key material must be wrapped for export.
     */
    @Generated public static final int errSecKeyIsSensitive = 0xFFFF9D56;
    /**
     * An attempt was made to import multiple private keys.
     */
    @Generated public static final int errSecMultiplePrivKeys = 0xFFFF9D55;
    /**
     * Passphrase is required for import/export.
     */
    @Generated public static final int errSecPassphraseRequired = 0xFFFF9D54;
    /**
     * The password reference was invalid.
     */
    @Generated public static final int errSecInvalidPasswordRef = 0xFFFF9D53;
    /**
     * The Trust Settings Record was corrupted.
     */
    @Generated public static final int errSecInvalidTrustSettings = 0xFFFF9D52;
    /**
     * No Trust Settings were found.
     */
    @Generated public static final int errSecNoTrustSettings = 0xFFFF9D51;
    /**
     * MAC verification failed during PKCS12 import (wrong password?)
     */
    @Generated public static final int errSecPkcs12VerifyFailure = 0xFFFF9D50;
    /**
     * A certificate was not signed by its proposed parent.
     */
    @Generated public static final int errSecNotSigner = 0xFFFF9965;
    /**
     * The required service is not available.
     */
    @Generated public static final int errSecServiceNotAvailable = 0xFFFEF7FF;
    /**
     * The client ID is not correct.
     */
    @Generated public static final int errSecInsufficientClientID = 0xFFFEF7FE;
    /**
     * A device reset has occurred.
     */
    @Generated public static final int errSecDeviceReset = 0xFFFEF7FD;
    /**
     * A device failure has occurred.
     */
    @Generated public static final int errSecDeviceFailed = 0xFFFEF7FC;
    /**
     * Adding an application ACL subject failed.
     */
    @Generated public static final int errSecAppleAddAppACLSubject = 0xFFFEF7FB;
    /**
     * The public key is incomplete.
     */
    @Generated public static final int errSecApplePublicKeyIncomplete = 0xFFFEF7FA;
    /**
     * A signature mismatch has occurred.
     */
    @Generated public static final int errSecAppleSignatureMismatch = 0xFFFEF7F9;
    /**
     * The specified key has an invalid start date.
     */
    @Generated public static final int errSecAppleInvalidKeyStartDate = 0xFFFEF7F8;
    /**
     * The specified key has an invalid end date.
     */
    @Generated public static final int errSecAppleInvalidKeyEndDate = 0xFFFEF7F7;
    /**
     * A conversion error has occurred.
     */
    @Generated public static final int errSecConversionError = 0xFFFEF7F6;
    /**
     * A SSLv2 rollback error has occurred.
     */
    @Generated public static final int errSecAppleSSLv2Rollback = 0xFFFEF7F5;
    /**
     * The disk is full.
     */
    @Generated public static final int errSecDiskFull = 0xFFFFFFDE;
    /**
     * The quota was exceeded.
     */
    @Generated public static final int errSecQuotaExceeded = 0xFFFEF7F4;
    /**
     * The file is too big.
     */
    @Generated public static final int errSecFileTooBig = 0xFFFEF7F3;
    /**
     * The specified database has an invalid blob.
     */
    @Generated public static final int errSecInvalidDatabaseBlob = 0xFFFEF7F2;
    /**
     * The specified database has an invalid key blob.
     */
    @Generated public static final int errSecInvalidKeyBlob = 0xFFFEF7F1;
    /**
     * The specified database has an incompatible blob.
     */
    @Generated public static final int errSecIncompatibleDatabaseBlob = 0xFFFEF7F0;
    /**
     * The specified database has an incompatible key blob.
     */
    @Generated public static final int errSecIncompatibleKeyBlob = 0xFFFEF7EF;
    /**
     * A host name mismatch has occurred.
     */
    @Generated public static final int errSecHostNameMismatch = 0xFFFEF7EE;
    /**
     * There is an unknown critical extension flag.
     */
    @Generated public static final int errSecUnknownCriticalExtensionFlag = 0xFFFEF7ED;
    /**
     * No basic constraints were found.
     */
    @Generated public static final int errSecNoBasicConstraints = 0xFFFEF7EC;
    /**
     * No basic CA constraints were found.
     */
    @Generated public static final int errSecNoBasicConstraintsCA = 0xFFFEF7EB;
    /**
     * The authority key ID is not valid.
     */
    @Generated public static final int errSecInvalidAuthorityKeyID = 0xFFFEF7EA;
    /**
     * The subject key ID is not valid.
     */
    @Generated public static final int errSecInvalidSubjectKeyID = 0xFFFEF7E9;
    /**
     * The key usage is not valid for the specified policy.
     */
    @Generated public static final int errSecInvalidKeyUsageForPolicy = 0xFFFEF7E8;
    /**
     * The extended key usage is not valid.
     */
    @Generated public static final int errSecInvalidExtendedKeyUsage = 0xFFFEF7E7;
    /**
     * The ID linkage is not valid.
     */
    @Generated public static final int errSecInvalidIDLinkage = 0xFFFEF7E6;
    /**
     * The path length constraint was exceeded.
     */
    @Generated public static final int errSecPathLengthConstraintExceeded = 0xFFFEF7E5;
    /**
     * The root or anchor certificate is not valid.
     */
    @Generated public static final int errSecInvalidRoot = 0xFFFEF7E4;
    /**
     * The CRL has expired.
     */
    @Generated public static final int errSecCRLExpired = 0xFFFEF7E3;
    /**
     * The CRL is not yet valid.
     */
    @Generated public static final int errSecCRLNotValidYet = 0xFFFEF7E2;
    /**
     * The CRL was not found.
     */
    @Generated public static final int errSecCRLNotFound = 0xFFFEF7E1;
    /**
     * The CRL server is down.
     */
    @Generated public static final int errSecCRLServerDown = 0xFFFEF7E0;
    /**
     * The CRL has a bad Uniform Resource Identifier.
     */
    @Generated public static final int errSecCRLBadURI = 0xFFFEF7DF;
    /**
     * An unknown certificate extension was encountered.
     */
    @Generated public static final int errSecUnknownCertExtension = 0xFFFEF7DE;
    /**
     * An unknown CRL extension was encountered.
     */
    @Generated public static final int errSecUnknownCRLExtension = 0xFFFEF7DD;
    /**
     * The CRL is not trusted.
     */
    @Generated public static final int errSecCRLNotTrusted = 0xFFFEF7DC;
    /**
     * The CRL policy failed.
     */
    @Generated public static final int errSecCRLPolicyFailed = 0xFFFEF7DB;
    /**
     * The issuing distribution point was not valid.
     */
    @Generated public static final int errSecIDPFailure = 0xFFFEF7DA;
    /**
     * An email address mismatch was encountered.
     */
    @Generated public static final int errSecSMIMEEmailAddressesNotFound = 0xFFFEF7D9;
    /**
     * The appropriate extended key usage for SMIME was not found.
     */
    @Generated public static final int errSecSMIMEBadExtendedKeyUsage = 0xFFFEF7D8;
    /**
     * The key usage is not compatible with SMIME.
     */
    @Generated public static final int errSecSMIMEBadKeyUsage = 0xFFFEF7D7;
    /**
     * The key usage extension is not marked as critical.
     */
    @Generated public static final int errSecSMIMEKeyUsageNotCritical = 0xFFFEF7D6;
    /**
     * No email address was found in the certificate.
     */
    @Generated public static final int errSecSMIMENoEmailAddress = 0xFFFEF7D5;
    /**
     * The subject alternative name extension is not marked as critical.
     */
    @Generated public static final int errSecSMIMESubjAltNameNotCritical = 0xFFFEF7D4;
    /**
     * The appropriate extended key usage for SSL was not found.
     */
    @Generated public static final int errSecSSLBadExtendedKeyUsage = 0xFFFEF7D3;
    /**
     * The OCSP response was incorrect or could not be parsed.
     */
    @Generated public static final int errSecOCSPBadResponse = 0xFFFEF7D2;
    /**
     * The OCSP request was incorrect or could not be parsed.
     */
    @Generated public static final int errSecOCSPBadRequest = 0xFFFEF7D1;
    /**
     * OCSP service is unavailable.
     */
    @Generated public static final int errSecOCSPUnavailable = 0xFFFEF7D0;
    /**
     * The OCSP server did not recognize this certificate.
     */
    @Generated public static final int errSecOCSPStatusUnrecognized = 0xFFFEF7CF;
    /**
     * An end-of-data was detected.
     */
    @Generated public static final int errSecEndOfData = 0xFFFEF7CE;
    /**
     * An incomplete certificate revocation check occurred.
     */
    @Generated public static final int errSecIncompleteCertRevocationCheck = 0xFFFEF7CD;
    /**
     * A network failure occurred.
     */
    @Generated public static final int errSecNetworkFailure = 0xFFFEF7CC;
    /**
     * The OCSP response was not trusted to a root or anchor certificate.
     */
    @Generated public static final int errSecOCSPNotTrustedToAnchor = 0xFFFEF7CB;
    /**
     * The record was modified.
     */
    @Generated public static final int errSecRecordModified = 0xFFFEF7CA;
    /**
     * The OCSP response had an invalid signature.
     */
    @Generated public static final int errSecOCSPSignatureError = 0xFFFEF7C9;
    /**
     * The OCSP response had no signer.
     */
    @Generated public static final int errSecOCSPNoSigner = 0xFFFEF7C8;
    /**
     * The OCSP responder was given a malformed request.
     */
    @Generated public static final int errSecOCSPResponderMalformedReq = 0xFFFEF7C7;
    /**
     * The OCSP responder encountered an internal error.
     */
    @Generated public static final int errSecOCSPResponderInternalError = 0xFFFEF7C6;
    /**
     * The OCSP responder is busy, try again later.
     */
    @Generated public static final int errSecOCSPResponderTryLater = 0xFFFEF7C5;
    /**
     * The OCSP responder requires a signature.
     */
    @Generated public static final int errSecOCSPResponderSignatureRequired = 0xFFFEF7C4;
    /**
     * The OCSP responder rejected this request as unauthorized.
     */
    @Generated public static final int errSecOCSPResponderUnauthorized = 0xFFFEF7C3;
    /**
     * The OCSP response nonce did not match the request.
     */
    @Generated public static final int errSecOCSPResponseNonceMismatch = 0xFFFEF7C2;
    /**
     * Code signing encountered an incorrect certificate chain length.
     */
    @Generated public static final int errSecCodeSigningBadCertChainLength = 0xFFFEF7C1;
    /**
     * Code signing found no basic constraints.
     */
    @Generated public static final int errSecCodeSigningNoBasicConstraints = 0xFFFEF7C0;
    /**
     * Code signing encountered an incorrect path length constraint.
     */
    @Generated public static final int errSecCodeSigningBadPathLengthConstraint = 0xFFFEF7BF;
    /**
     * Code signing found no extended key usage.
     */
    @Generated public static final int errSecCodeSigningNoExtendedKeyUsage = 0xFFFEF7BE;
    /**
     * Code signing indicated use of a development-only certificate.
     */
    @Generated public static final int errSecCodeSigningDevelopment = 0xFFFEF7BD;
    /**
     * Resource signing has encountered an incorrect certificate chain length.
     */
    @Generated public static final int errSecResourceSignBadCertChainLength = 0xFFFEF7BC;
    /**
     * Resource signing has encountered an error in the extended key usage.
     */
    @Generated public static final int errSecResourceSignBadExtKeyUsage = 0xFFFEF7BB;
    /**
     * The trust setting for this policy was set to Deny.
     */
    @Generated public static final int errSecTrustSettingDeny = 0xFFFEF7BA;
    /**
     * An invalid certificate subject name was encountered.
     */
    @Generated public static final int errSecInvalidSubjectName = 0xFFFEF7B9;
    /**
     * An unknown qualified certificate statement was encountered.
     */
    @Generated public static final int errSecUnknownQualifiedCertStatement = 0xFFFEF7B8;
    @Generated public static final int errSecMobileMeRequestQueued = 0xFFFEF7B7;
    @Generated public static final int errSecMobileMeRequestRedirected = 0xFFFEF7B6;
    @Generated public static final int errSecMobileMeServerError = 0xFFFEF7B5;
    @Generated public static final int errSecMobileMeServerNotAvailable = 0xFFFEF7B4;
    @Generated public static final int errSecMobileMeServerAlreadyExists = 0xFFFEF7B3;
    @Generated public static final int errSecMobileMeServerServiceErr = 0xFFFEF7B2;
    @Generated public static final int errSecMobileMeRequestAlreadyPending = 0xFFFEF7B1;
    @Generated public static final int errSecMobileMeNoRequestPending = 0xFFFEF7B0;
    @Generated public static final int errSecMobileMeCSRVerifyFailure = 0xFFFEF7AF;
    @Generated public static final int errSecMobileMeFailedConsistencyCheck = 0xFFFEF7AE;
    /**
     * A function was called without initializing CSSM.
     */
    @Generated public static final int errSecNotInitialized = 0xFFFEF7AD;
    /**
     * The CSSM handle does not match with the service type.
     */
    @Generated public static final int errSecInvalidHandleUsage = 0xFFFEF7AC;
    /**
     * A reference to the calling module was not found in the list of authorized callers.
     */
    @Generated public static final int errSecPVCReferentNotFound = 0xFFFEF7AB;
    /**
     * A function address was not within the verified module.
     */
    @Generated public static final int errSecFunctionIntegrityFail = 0xFFFEF7AA;
    /**
     * An internal error has occurred.
     */
    @Generated public static final int errSecInternalError = 0xFFFEF7A9;
    /**
     * A memory error has occurred.
     */
    @Generated public static final int errSecMemoryError = 0xFFFEF7A8;
    /**
     * Invalid data was encountered.
     */
    @Generated public static final int errSecInvalidData = 0xFFFEF7A7;
    /**
     * A Module Directory Service error has occurred.
     */
    @Generated public static final int errSecMDSError = 0xFFFEF7A6;
    /**
     * An invalid pointer was encountered.
     */
    @Generated public static final int errSecInvalidPointer = 0xFFFEF7A5;
    /**
     * Self-check has failed.
     */
    @Generated public static final int errSecSelfCheckFailed = 0xFFFEF7A4;
    /**
     * A function has failed.
     */
    @Generated public static final int errSecFunctionFailed = 0xFFFEF7A3;
    /**
     * A module manifest verification failure has occurred.
     */
    @Generated public static final int errSecModuleManifestVerifyFailed = 0xFFFEF7A2;
    /**
     * An invalid GUID was encountered.
     */
    @Generated public static final int errSecInvalidGUID = 0xFFFEF7A1;
    /**
     * An invalid handle was encountered.
     */
    @Generated public static final int errSecInvalidHandle = 0xFFFEF7A0;
    /**
     * An invalid DB list was encountered.
     */
    @Generated public static final int errSecInvalidDBList = 0xFFFEF79F;
    /**
     * An invalid passthrough ID was encountered.
     */
    @Generated public static final int errSecInvalidPassthroughID = 0xFFFEF79E;
    /**
     * An invalid network address was encountered.
     */
    @Generated public static final int errSecInvalidNetworkAddress = 0xFFFEF79D;
    /**
     * The certificate revocation list is already signed.
     */
    @Generated public static final int errSecCRLAlreadySigned = 0xFFFEF79C;
    /**
     * An invalid number of fields were encountered.
     */
    @Generated public static final int errSecInvalidNumberOfFields = 0xFFFEF79B;
    /**
     * A verification failure occurred.
     */
    @Generated public static final int errSecVerificationFailure = 0xFFFEF79A;
    /**
     * An unknown tag was encountered.
     */
    @Generated public static final int errSecUnknownTag = 0xFFFEF799;
    /**
     * An invalid signature was encountered.
     */
    @Generated public static final int errSecInvalidSignature = 0xFFFEF798;
    /**
     * An invalid name was encountered.
     */
    @Generated public static final int errSecInvalidName = 0xFFFEF797;
    /**
     * An invalid certificate reference was encountered.
     */
    @Generated public static final int errSecInvalidCertificateRef = 0xFFFEF796;
    /**
     * An invalid certificate group was encountered.
     */
    @Generated public static final int errSecInvalidCertificateGroup = 0xFFFEF795;
    /**
     * The specified tag was not found.
     */
    @Generated public static final int errSecTagNotFound = 0xFFFEF794;
    /**
     * The specified query was not valid.
     */
    @Generated public static final int errSecInvalidQuery = 0xFFFEF793;
    /**
     * An invalid value was detected.
     */
    @Generated public static final int errSecInvalidValue = 0xFFFEF792;
    /**
     * A callback has failed.
     */
    @Generated public static final int errSecCallbackFailed = 0xFFFEF791;
    /**
     * An ACL delete operation has failed.
     */
    @Generated public static final int errSecACLDeleteFailed = 0xFFFEF790;
    /**
     * An ACL replace operation has failed.
     */
    @Generated public static final int errSecACLReplaceFailed = 0xFFFEF78F;
    /**
     * An ACL add operation has failed.
     */
    @Generated public static final int errSecACLAddFailed = 0xFFFEF78E;
    /**
     * An ACL change operation has failed.
     */
    @Generated public static final int errSecACLChangeFailed = 0xFFFEF78D;
    /**
     * Invalid access credentials were encountered.
     */
    @Generated public static final int errSecInvalidAccessCredentials = 0xFFFEF78C;
    /**
     * An invalid record was encountered.
     */
    @Generated public static final int errSecInvalidRecord = 0xFFFEF78B;
    /**
     * An invalid ACL was encountered.
     */
    @Generated public static final int errSecInvalidACL = 0xFFFEF78A;
    /**
     * An invalid sample value was encountered.
     */
    @Generated public static final int errSecInvalidSampleValue = 0xFFFEF789;
    /**
     * An incompatible version was encountered.
     */
    @Generated public static final int errSecIncompatibleVersion = 0xFFFEF788;
    /**
     * The privilege was not granted.
     */
    @Generated public static final int errSecPrivilegeNotGranted = 0xFFFEF787;
    /**
     * An invalid scope was encountered.
     */
    @Generated public static final int errSecInvalidScope = 0xFFFEF786;
    /**
     * The PVC is already configured.
     */
    @Generated public static final int errSecPVCAlreadyConfigured = 0xFFFEF785;
    /**
     * An invalid PVC was encountered.
     */
    @Generated public static final int errSecInvalidPVC = 0xFFFEF784;
    /**
     * The EMM load has failed.
     */
    @Generated public static final int errSecEMMLoadFailed = 0xFFFEF783;
    /**
     * The EMM unload has failed.
     */
    @Generated public static final int errSecEMMUnloadFailed = 0xFFFEF782;
    /**
     * The add-in load operation has failed.
     */
    @Generated public static final int errSecAddinLoadFailed = 0xFFFEF781;
    /**
     * An invalid key was encountered.
     */
    @Generated public static final int errSecInvalidKeyRef = 0xFFFEF780;
    /**
     * An invalid key hierarchy was encountered.
     */
    @Generated public static final int errSecInvalidKeyHierarchy = 0xFFFEF77F;
    /**
     * The add-in unload operation has failed.
     */
    @Generated public static final int errSecAddinUnloadFailed = 0xFFFEF77E;
    /**
     * A library reference was not found.
     */
    @Generated public static final int errSecLibraryReferenceNotFound = 0xFFFEF77D;
    /**
     * An invalid add-in function table was encountered.
     */
    @Generated public static final int errSecInvalidAddinFunctionTable = 0xFFFEF77C;
    /**
     * An invalid service mask was encountered.
     */
    @Generated public static final int errSecInvalidServiceMask = 0xFFFEF77B;
    /**
     * A module was not loaded.
     */
    @Generated public static final int errSecModuleNotLoaded = 0xFFFEF77A;
    /**
     * An invalid subservice ID was encountered.
     */
    @Generated public static final int errSecInvalidSubServiceID = 0xFFFEF779;
    /**
     * An attribute was not in the context.
     */
    @Generated public static final int errSecAttributeNotInContext = 0xFFFEF778;
    /**
     * A module failed to initialize.
     */
    @Generated public static final int errSecModuleManagerInitializeFailed = 0xFFFEF777;
    /**
     * A module was not found.
     */
    @Generated public static final int errSecModuleManagerNotFound = 0xFFFEF776;
    /**
     * An event notification callback was not found.
     */
    @Generated public static final int errSecEventNotificationCallbackNotFound = 0xFFFEF775;
    /**
     * An input length error was encountered.
     */
    @Generated public static final int errSecInputLengthError = 0xFFFEF774;
    /**
     * An output length error was encountered.
     */
    @Generated public static final int errSecOutputLengthError = 0xFFFEF773;
    /**
     * The privilege is not supported.
     */
    @Generated public static final int errSecPrivilegeNotSupported = 0xFFFEF772;
    /**
     * A device error was encountered.
     */
    @Generated public static final int errSecDeviceError = 0xFFFEF771;
    /**
     * The CSP handle was busy.
     */
    @Generated public static final int errSecAttachHandleBusy = 0xFFFEF770;
    /**
     * You are not logged in.
     */
    @Generated public static final int errSecNotLoggedIn = 0xFFFEF76F;
    /**
     * An algorithm mismatch was encountered.
     */
    @Generated public static final int errSecAlgorithmMismatch = 0xFFFEF76E;
    /**
     * The key usage is incorrect.
     */
    @Generated public static final int errSecKeyUsageIncorrect = 0xFFFEF76D;
    /**
     * The key blob type is incorrect.
     */
    @Generated public static final int errSecKeyBlobTypeIncorrect = 0xFFFEF76C;
    /**
     * The key header is inconsistent.
     */
    @Generated public static final int errSecKeyHeaderInconsistent = 0xFFFEF76B;
    /**
     * The key header format is not supported.
     */
    @Generated public static final int errSecUnsupportedKeyFormat = 0xFFFEF76A;
    /**
     * The key size is not supported.
     */
    @Generated public static final int errSecUnsupportedKeySize = 0xFFFEF769;
    /**
     * The key usage mask is not valid.
     */
    @Generated public static final int errSecInvalidKeyUsageMask = 0xFFFEF768;
    /**
     * The key usage mask is not supported.
     */
    @Generated public static final int errSecUnsupportedKeyUsageMask = 0xFFFEF767;
    /**
     * The key attribute mask is not valid.
     */
    @Generated public static final int errSecInvalidKeyAttributeMask = 0xFFFEF766;
    /**
     * The key attribute mask is not supported.
     */
    @Generated public static final int errSecUnsupportedKeyAttributeMask = 0xFFFEF765;
    /**
     * The key label is not valid.
     */
    @Generated public static final int errSecInvalidKeyLabel = 0xFFFEF764;
    /**
     * The key label is not supported.
     */
    @Generated public static final int errSecUnsupportedKeyLabel = 0xFFFEF763;
    /**
     * The key format is not valid.
     */
    @Generated public static final int errSecInvalidKeyFormat = 0xFFFEF762;
    /**
     * The vector of buffers is not supported.
     */
    @Generated public static final int errSecUnsupportedVectorOfBuffers = 0xFFFEF761;
    /**
     * The input vector is not valid.
     */
    @Generated public static final int errSecInvalidInputVector = 0xFFFEF760;
    /**
     * The output vector is not valid.
     */
    @Generated public static final int errSecInvalidOutputVector = 0xFFFEF75F;
    /**
     * An invalid context was encountered.
     */
    @Generated public static final int errSecInvalidContext = 0xFFFEF75E;
    /**
     * An invalid algorithm was encountered.
     */
    @Generated public static final int errSecInvalidAlgorithm = 0xFFFEF75D;
    /**
     * A key attribute was not valid.
     */
    @Generated public static final int errSecInvalidAttributeKey = 0xFFFEF75C;
    /**
     * A key attribute was missing.
     */
    @Generated public static final int errSecMissingAttributeKey = 0xFFFEF75B;
    /**
     * An init vector attribute was not valid.
     */
    @Generated public static final int errSecInvalidAttributeInitVector = 0xFFFEF75A;
    /**
     * An init vector attribute was missing.
     */
    @Generated public static final int errSecMissingAttributeInitVector = 0xFFFEF759;
    /**
     * A salt attribute was not valid.
     */
    @Generated public static final int errSecInvalidAttributeSalt = 0xFFFEF758;
    /**
     * A salt attribute was missing.
     */
    @Generated public static final int errSecMissingAttributeSalt = 0xFFFEF757;
    /**
     * A padding attribute was not valid.
     */
    @Generated public static final int errSecInvalidAttributePadding = 0xFFFEF756;
    /**
     * A padding attribute was missing.
     */
    @Generated public static final int errSecMissingAttributePadding = 0xFFFEF755;
    /**
     * A random number attribute was not valid.
     */
    @Generated public static final int errSecInvalidAttributeRandom = 0xFFFEF754;
    /**
     * A random number attribute was missing.
     */
    @Generated public static final int errSecMissingAttributeRandom = 0xFFFEF753;
    /**
     * A seed attribute was not valid.
     */
    @Generated public static final int errSecInvalidAttributeSeed = 0xFFFEF752;
    /**
     * A seed attribute was missing.
     */
    @Generated public static final int errSecMissingAttributeSeed = 0xFFFEF751;
    /**
     * A passphrase attribute was not valid.
     */
    @Generated public static final int errSecInvalidAttributePassphrase = 0xFFFEF750;
    /**
     * A passphrase attribute was missing.
     */
    @Generated public static final int errSecMissingAttributePassphrase = 0xFFFEF74F;
    /**
     * A key length attribute was not valid.
     */
    @Generated public static final int errSecInvalidAttributeKeyLength = 0xFFFEF74E;
    /**
     * A key length attribute was missing.
     */
    @Generated public static final int errSecMissingAttributeKeyLength = 0xFFFEF74D;
    /**
     * A block size attribute was not valid.
     */
    @Generated public static final int errSecInvalidAttributeBlockSize = 0xFFFEF74C;
    /**
     * A block size attribute was missing.
     */
    @Generated public static final int errSecMissingAttributeBlockSize = 0xFFFEF74B;
    /**
     * An output size attribute was not valid.
     */
    @Generated public static final int errSecInvalidAttributeOutputSize = 0xFFFEF74A;
    /**
     * An output size attribute was missing.
     */
    @Generated public static final int errSecMissingAttributeOutputSize = 0xFFFEF749;
    /**
     * The number of rounds attribute was not valid.
     */
    @Generated public static final int errSecInvalidAttributeRounds = 0xFFFEF748;
    /**
     * The number of rounds attribute was missing.
     */
    @Generated public static final int errSecMissingAttributeRounds = 0xFFFEF747;
    /**
     * An algorithm parameters attribute was not valid.
     */
    @Generated public static final int errSecInvalidAlgorithmParms = 0xFFFEF746;
    /**
     * An algorithm parameters attribute was missing.
     */
    @Generated public static final int errSecMissingAlgorithmParms = 0xFFFEF745;
    /**
     * A label attribute was not valid.
     */
    @Generated public static final int errSecInvalidAttributeLabel = 0xFFFEF744;
    /**
     * A label attribute was missing.
     */
    @Generated public static final int errSecMissingAttributeLabel = 0xFFFEF743;
    /**
     * A key type attribute was not valid.
     */
    @Generated public static final int errSecInvalidAttributeKeyType = 0xFFFEF742;
    /**
     * A key type attribute was missing.
     */
    @Generated public static final int errSecMissingAttributeKeyType = 0xFFFEF741;
    /**
     * A mode attribute was not valid.
     */
    @Generated public static final int errSecInvalidAttributeMode = 0xFFFEF740;
    /**
     * A mode attribute was missing.
     */
    @Generated public static final int errSecMissingAttributeMode = 0xFFFEF73F;
    /**
     * An effective bits attribute was not valid.
     */
    @Generated public static final int errSecInvalidAttributeEffectiveBits = 0xFFFEF73E;
    /**
     * An effective bits attribute was missing.
     */
    @Generated public static final int errSecMissingAttributeEffectiveBits = 0xFFFEF73D;
    /**
     * A start date attribute was not valid.
     */
    @Generated public static final int errSecInvalidAttributeStartDate = 0xFFFEF73C;
    /**
     * A start date attribute was missing.
     */
    @Generated public static final int errSecMissingAttributeStartDate = 0xFFFEF73B;
    /**
     * An end date attribute was not valid.
     */
    @Generated public static final int errSecInvalidAttributeEndDate = 0xFFFEF73A;
    /**
     * An end date attribute was missing.
     */
    @Generated public static final int errSecMissingAttributeEndDate = 0xFFFEF739;
    /**
     * A version attribute was not valid.
     */
    @Generated public static final int errSecInvalidAttributeVersion = 0xFFFEF738;
    /**
     * A version attribute was missing.
     */
    @Generated public static final int errSecMissingAttributeVersion = 0xFFFEF737;
    /**
     * A prime attribute was not valid.
     */
    @Generated public static final int errSecInvalidAttributePrime = 0xFFFEF736;
    /**
     * A prime attribute was missing.
     */
    @Generated public static final int errSecMissingAttributePrime = 0xFFFEF735;
    /**
     * A base attribute was not valid.
     */
    @Generated public static final int errSecInvalidAttributeBase = 0xFFFEF734;
    /**
     * A base attribute was missing.
     */
    @Generated public static final int errSecMissingAttributeBase = 0xFFFEF733;
    /**
     * A subprime attribute was not valid.
     */
    @Generated public static final int errSecInvalidAttributeSubprime = 0xFFFEF732;
    /**
     * A subprime attribute was missing.
     */
    @Generated public static final int errSecMissingAttributeSubprime = 0xFFFEF731;
    /**
     * An iteration count attribute was not valid.
     */
    @Generated public static final int errSecInvalidAttributeIterationCount = 0xFFFEF730;
    /**
     * An iteration count attribute was missing.
     */
    @Generated public static final int errSecMissingAttributeIterationCount = 0xFFFEF72F;
    /**
     * A database handle attribute was not valid.
     */
    @Generated public static final int errSecInvalidAttributeDLDBHandle = 0xFFFEF72E;
    /**
     * A database handle attribute was missing.
     */
    @Generated public static final int errSecMissingAttributeDLDBHandle = 0xFFFEF72D;
    /**
     * An access credentials attribute was not valid.
     */
    @Generated public static final int errSecInvalidAttributeAccessCredentials = 0xFFFEF72C;
    /**
     * An access credentials attribute was missing.
     */
    @Generated public static final int errSecMissingAttributeAccessCredentials = 0xFFFEF72B;
    /**
     * A public key format attribute was not valid.
     */
    @Generated public static final int errSecInvalidAttributePublicKeyFormat = 0xFFFEF72A;
    /**
     * A public key format attribute was missing.
     */
    @Generated public static final int errSecMissingAttributePublicKeyFormat = 0xFFFEF729;
    /**
     * A private key format attribute was not valid.
     */
    @Generated public static final int errSecInvalidAttributePrivateKeyFormat = 0xFFFEF728;
    /**
     * A private key format attribute was missing.
     */
    @Generated public static final int errSecMissingAttributePrivateKeyFormat = 0xFFFEF727;
    /**
     * A symmetric key format attribute was not valid.
     */
    @Generated public static final int errSecInvalidAttributeSymmetricKeyFormat = 0xFFFEF726;
    /**
     * A symmetric key format attribute was missing.
     */
    @Generated public static final int errSecMissingAttributeSymmetricKeyFormat = 0xFFFEF725;
    /**
     * A wrapped key format attribute was not valid.
     */
    @Generated public static final int errSecInvalidAttributeWrappedKeyFormat = 0xFFFEF724;
    /**
     * A wrapped key format attribute was missing.
     */
    @Generated public static final int errSecMissingAttributeWrappedKeyFormat = 0xFFFEF723;
    /**
     * A staged operation is in progress.
     */
    @Generated public static final int errSecStagedOperationInProgress = 0xFFFEF722;
    /**
     * A staged operation was not started.
     */
    @Generated public static final int errSecStagedOperationNotStarted = 0xFFFEF721;
    /**
     * The query size is unknown.
     */
    @Generated public static final int errSecQuerySizeUnknown = 0xFFFEF71F;
    /**
     * A block size mismatch occurred.
     */
    @Generated public static final int errSecBlockSizeMismatch = 0xFFFEF71E;
    /**
     * The public key was inconsistent.
     */
    @Generated public static final int errSecPublicKeyInconsistent = 0xFFFEF71D;
    /**
     * A device verification failure has occurred.
     */
    @Generated public static final int errSecDeviceVerifyFailed = 0xFFFEF71C;
    /**
     * An invalid login name was detected.
     */
    @Generated public static final int errSecInvalidLoginName = 0xFFFEF71B;
    /**
     * The user is already logged in.
     */
    @Generated public static final int errSecAlreadyLoggedIn = 0xFFFEF71A;
    /**
     * An invalid digest algorithm was detected.
     */
    @Generated public static final int errSecInvalidDigestAlgorithm = 0xFFFEF719;
    /**
     * An invalid CRL group was detected.
     */
    @Generated public static final int errSecInvalidCRLGroup = 0xFFFEF718;
    /**
     * The certificate cannot operate.
     */
    @Generated public static final int errSecCertificateCannotOperate = 0xFFFEF717;
    /**
     * An expired certificate was detected.
     */
    @Generated public static final int errSecCertificateExpired = 0xFFFEF716;
    /**
     * The certificate is not yet valid.
     */
    @Generated public static final int errSecCertificateNotValidYet = 0xFFFEF715;
    /**
     * The certificate was revoked.
     */
    @Generated public static final int errSecCertificateRevoked = 0xFFFEF714;
    /**
     * The certificate was suspended.
     */
    @Generated public static final int errSecCertificateSuspended = 0xFFFEF713;
    /**
     * Insufficient credentials were detected.
     */
    @Generated public static final int errSecInsufficientCredentials = 0xFFFEF712;
    /**
     * The action was not valid.
     */
    @Generated public static final int errSecInvalidAction = 0xFFFEF711;
    /**
     * The authority was not valid.
     */
    @Generated public static final int errSecInvalidAuthority = 0xFFFEF710;
    /**
     * A verify action has failed.
     */
    @Generated public static final int errSecVerifyActionFailed = 0xFFFEF70F;
    /**
     * The certificate authority was not valid.
     */
    @Generated public static final int errSecInvalidCertAuthority = 0xFFFEF70E;
    /**
     * API-Since: 4.0
     * Deprecated-Since: 15.0
     */
    @Deprecated @Generated public static final int errSecInvaldCRLAuthority = 0xFFFEF70D;
    /**
     * The CRL encoding was not valid.
     */
    @Generated public static final int errSecInvalidCRLEncoding = 0xFFFEF70C;
    /**
     * The CRL type was not valid.
     */
    @Generated public static final int errSecInvalidCRLType = 0xFFFEF70B;
    /**
     * The CRL was not valid.
     */
    @Generated public static final int errSecInvalidCRL = 0xFFFEF70A;
    /**
     * The form type was not valid.
     */
    @Generated public static final int errSecInvalidFormType = 0xFFFEF709;
    /**
     * The ID was not valid.
     */
    @Generated public static final int errSecInvalidID = 0xFFFEF708;
    /**
     * The identifier was not valid.
     */
    @Generated public static final int errSecInvalidIdentifier = 0xFFFEF707;
    /**
     * The index was not valid.
     */
    @Generated public static final int errSecInvalidIndex = 0xFFFEF706;
    /**
     * The policy identifiers are not valid.
     */
    @Generated public static final int errSecInvalidPolicyIdentifiers = 0xFFFEF705;
    /**
     * The time specified was not valid.
     */
    @Generated public static final int errSecInvalidTimeString = 0xFFFEF704;
    /**
     * The trust policy reason was not valid.
     */
    @Generated public static final int errSecInvalidReason = 0xFFFEF703;
    /**
     * The request inputs are not valid.
     */
    @Generated public static final int errSecInvalidRequestInputs = 0xFFFEF702;
    /**
     * The response vector was not valid.
     */
    @Generated public static final int errSecInvalidResponseVector = 0xFFFEF701;
    /**
     * The stop-on policy was not valid.
     */
    @Generated public static final int errSecInvalidStopOnPolicy = 0xFFFEF700;
    /**
     * The tuple was not valid.
     */
    @Generated public static final int errSecInvalidTuple = 0xFFFEF6FF;
    /**
     * Multiple values are not supported.
     */
    @Generated public static final int errSecMultipleValuesUnsupported = 0xFFFEF6FE;
    /**
     * The certificate was not trusted.
     */
    @Generated public static final int errSecNotTrusted = 0xFFFEF6FD;
    /**
     * No default authority was detected.
     */
    @Generated public static final int errSecNoDefaultAuthority = 0xFFFEF6FC;
    /**
     * The trust policy had a rejected form.
     */
    @Generated public static final int errSecRejectedForm = 0xFFFEF6FB;
    /**
     * The request was lost.
     */
    @Generated public static final int errSecRequestLost = 0xFFFEF6FA;
    /**
     * The request was rejected.
     */
    @Generated public static final int errSecRequestRejected = 0xFFFEF6F9;
    /**
     * The address type is not supported.
     */
    @Generated public static final int errSecUnsupportedAddressType = 0xFFFEF6F8;
    /**
     * The service is not supported.
     */
    @Generated public static final int errSecUnsupportedService = 0xFFFEF6F7;
    /**
     * The tuple group was not valid.
     */
    @Generated public static final int errSecInvalidTupleGroup = 0xFFFEF6F6;
    /**
     * The base ACLs are not valid.
     */
    @Generated public static final int errSecInvalidBaseACLs = 0xFFFEF6F5;
    /**
     * API-Since: 4.0
     * Deprecated-Since: 15.0
     */
    @Deprecated @Generated public static final int errSecInvalidTupleCredendtials = 0xFFFEF6F4;
    /**
     * The encoding was not valid.
     */
    @Generated public static final int errSecInvalidEncoding = 0xFFFEF6F3;
    /**
     * The validity period was not valid.
     */
    @Generated public static final int errSecInvalidValidityPeriod = 0xFFFEF6F2;
    /**
     * The requestor was not valid.
     */
    @Generated public static final int errSecInvalidRequestor = 0xFFFEF6F1;
    /**
     * The request descriptor was not valid.
     */
    @Generated public static final int errSecRequestDescriptor = 0xFFFEF6F0;
    /**
     * The bundle information was not valid.
     */
    @Generated public static final int errSecInvalidBundleInfo = 0xFFFEF6EF;
    /**
     * The CRL index was not valid.
     */
    @Generated public static final int errSecInvalidCRLIndex = 0xFFFEF6EE;
    /**
     * No field values were detected.
     */
    @Generated public static final int errSecNoFieldValues = 0xFFFEF6ED;
    /**
     * The field format is not supported.
     */
    @Generated public static final int errSecUnsupportedFieldFormat = 0xFFFEF6EC;
    /**
     * The index information is not supported.
     */
    @Generated public static final int errSecUnsupportedIndexInfo = 0xFFFEF6EB;
    /**
     * The locality is not supported.
     */
    @Generated public static final int errSecUnsupportedLocality = 0xFFFEF6EA;
    /**
     * The number of attributes is not supported.
     */
    @Generated public static final int errSecUnsupportedNumAttributes = 0xFFFEF6E9;
    /**
     * The number of indexes is not supported.
     */
    @Generated public static final int errSecUnsupportedNumIndexes = 0xFFFEF6E8;
    /**
     * The number of record types is not supported.
     */
    @Generated public static final int errSecUnsupportedNumRecordTypes = 0xFFFEF6E7;
    /**
     * Too many fields were specified.
     */
    @Generated public static final int errSecFieldSpecifiedMultiple = 0xFFFEF6E6;
    /**
     * The field format was incompatible.
     */
    @Generated public static final int errSecIncompatibleFieldFormat = 0xFFFEF6E5;
    /**
     * The parsing module was not valid.
     */
    @Generated public static final int errSecInvalidParsingModule = 0xFFFEF6E4;
    /**
     * The database is locked.
     */
    @Generated public static final int errSecDatabaseLocked = 0xFFFEF6E3;
    /**
     * The data store is open.
     */
    @Generated public static final int errSecDatastoreIsOpen = 0xFFFEF6E2;
    /**
     * A missing value was detected.
     */
    @Generated public static final int errSecMissingValue = 0xFFFEF6E1;
    /**
     * The query limits are not supported.
     */
    @Generated public static final int errSecUnsupportedQueryLimits = 0xFFFEF6E0;
    /**
     * The number of selection predicates is not supported.
     */
    @Generated public static final int errSecUnsupportedNumSelectionPreds = 0xFFFEF6DF;
    /**
     * The operator is not supported.
     */
    @Generated public static final int errSecUnsupportedOperator = 0xFFFEF6DE;
    /**
     * The database location is not valid.
     */
    @Generated public static final int errSecInvalidDBLocation = 0xFFFEF6DD;
    /**
     * The access request is not valid.
     */
    @Generated public static final int errSecInvalidAccessRequest = 0xFFFEF6DC;
    /**
     * The index information is not valid.
     */
    @Generated public static final int errSecInvalidIndexInfo = 0xFFFEF6DB;
    /**
     * The new owner is not valid.
     */
    @Generated public static final int errSecInvalidNewOwner = 0xFFFEF6DA;
    /**
     * The modify mode is not valid.
     */
    @Generated public static final int errSecInvalidModifyMode = 0xFFFEF6D9;
    /**
     * A required certificate extension is missing.
     */
    @Generated public static final int errSecMissingRequiredExtension = 0xFFFEF6D8;
    /**
     * The extended key usage extension was not marked critical.
     */
    @Generated public static final int errSecExtendedKeyUsageNotCritical = 0xFFFEF6D7;
    /**
     * A timestamp was expected but was not found.
     */
    @Generated public static final int errSecTimestampMissing = 0xFFFEF6D6;
    /**
     * The timestamp was not valid.
     */
    @Generated public static final int errSecTimestampInvalid = 0xFFFEF6D5;
    /**
     * The timestamp was not trusted.
     */
    @Generated public static final int errSecTimestampNotTrusted = 0xFFFEF6D4;
    /**
     * The timestamp service is not available.
     */
    @Generated public static final int errSecTimestampServiceNotAvailable = 0xFFFEF6D3;
    /**
     * An unrecognized or unsupported Algorithm Identifier in timestamp.
     */
    @Generated public static final int errSecTimestampBadAlg = 0xFFFEF6D2;
    /**
     * The timestamp transaction is not permitted or supported.
     */
    @Generated public static final int errSecTimestampBadRequest = 0xFFFEF6D1;
    /**
     * The timestamp data submitted has the wrong format.
     */
    @Generated public static final int errSecTimestampBadDataFormat = 0xFFFEF6D0;
    /**
     * The time source for the Timestamp Authority is not available.
     */
    @Generated public static final int errSecTimestampTimeNotAvailable = 0xFFFEF6CF;
    /**
     * The requested policy is not supported by the Timestamp Authority.
     */
    @Generated public static final int errSecTimestampUnacceptedPolicy = 0xFFFEF6CE;
    /**
     * The requested extension is not supported by the Timestamp Authority.
     */
    @Generated public static final int errSecTimestampUnacceptedExtension = 0xFFFEF6CD;
    /**
     * The additional information requested is not available.
     */
    @Generated public static final int errSecTimestampAddInfoNotAvailable = 0xFFFEF6CC;
    /**
     * The timestamp request cannot be handled due to system failure.
     */
    @Generated public static final int errSecTimestampSystemFailure = 0xFFFEF6CB;
    /**
     * A signing time was expected but was not found.
     */
    @Generated public static final int errSecSigningTimeMissing = 0xFFFEF6CA;
    /**
     * A timestamp transaction was rejected.
     */
    @Generated public static final int errSecTimestampRejection = 0xFFFEF6C9;
    /**
     * A timestamp transaction is waiting.
     */
    @Generated public static final int errSecTimestampWaiting = 0xFFFEF6C8;
    /**
     * A timestamp authority revocation warning was issued.
     */
    @Generated public static final int errSecTimestampRevocationWarning = 0xFFFEF6C7;
    /**
     * A timestamp authority revocation notification was issued.
     */
    @Generated public static final int errSecTimestampRevocationNotification = 0xFFFEF6C6;
    /**
     * TLS 1.3 standard cipher suites for ChaCha20+Poly1305.
     * Note: TLS 1.3 ciphersuites do not specify the key exchange
     * algorithm -- they only specify the symmetric ciphers.
     */
    @Generated public static final char TLS_AES_128_GCM_SHA256 = 0x1301;
    /**
     * TLS 1.3 standard cipher suites for ChaCha20+Poly1305.
     * Note: TLS 1.3 ciphersuites do not specify the key exchange
     * algorithm -- they only specify the symmetric ciphers.
     */
    @Generated public static final char TLS_AES_256_GCM_SHA384 = 0x1302;
    /**
     * TLS 1.3 standard cipher suites for ChaCha20+Poly1305.
     * Note: TLS 1.3 ciphersuites do not specify the key exchange
     * algorithm -- they only specify the symmetric ciphers.
     */
    @Generated public static final char TLS_CHACHA20_POLY1305_SHA256 = 0x1303;
    /**
     * TLS 1.3 standard cipher suites for ChaCha20+Poly1305.
     * Note: TLS 1.3 ciphersuites do not specify the key exchange
     * algorithm -- they only specify the symmetric ciphers.
     */
    @Generated public static final char TLS_AES_128_CCM_SHA256 = 0x1304;
    /**
     * TLS 1.3 standard cipher suites for ChaCha20+Poly1305.
     * Note: TLS 1.3 ciphersuites do not specify the key exchange
     * algorithm -- they only specify the symmetric ciphers.
     */
    @Generated public static final char TLS_AES_128_CCM_8_SHA256 = 0x1305;
    /**
     * Addenda from rfc 7905 ChaCha20-Poly1305 Cipher Suites for
     * Transport Layer Security (TLS).
     */
    @Generated public static final char TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256 = 0xCCA8;
    /**
     * Addenda from rfc 7905 ChaCha20-Poly1305 Cipher Suites for
     * Transport Layer Security (TLS).
     */
    @Generated public static final char TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256 = 0xCCA9;
    /**
     * ECDHE_PSK Cipher Suites for Transport Layer Security (TLS), RFC 5489
     */
    @Generated public static final char TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA = 0xC035;
    /**
     * ECDHE_PSK Cipher Suites for Transport Layer Security (TLS), RFC 5489
     */
    @Generated public static final char TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA = 0xC036;
    /**
     * ChaCha20-Poly1305 Cipher Suites for Transport Layer Security (TLS), RFC 7905
     */
    @Generated public static final char TLS_PSK_WITH_CHACHA20_POLY1305_SHA256 = 0xCCAB;
    /**
     * transport (socket) shutdown, e.g., TCP RST or FIN.
     */
    @Generated public static final int errSSLTransportReset = 0xFFFFD984;
    /**
     * network timeout triggered
     */
    @Generated public static final int errSSLNetworkTimeout = 0xFFFFD983;
    /**
     * TLS configuration failed
     */
    @Generated public static final int errSSLConfigurationFailed = 0xFFFFD982;
    /**
     * unsupported TLS extension
     */
    @Generated public static final int errSSLUnsupportedExtension = 0xFFFFD981;
    /**
     * peer rejected unexpected message
     */
    @Generated public static final int errSSLUnexpectedMessage = 0xFFFFD980;
    /**
     * decompression failed
     */
    @Generated public static final int errSSLDecompressFail = 0xFFFFD97F;
    /**
     * handshake failed
     */
    @Generated public static final int errSSLHandshakeFail = 0xFFFFD97E;
    /**
     * decode failed
     */
    @Generated public static final int errSSLDecodeError = 0xFFFFD97D;
    /**
     * inappropriate fallback
     */
    @Generated public static final int errSSLInappropriateFallback = 0xFFFFD97C;
    /**
     * missing extension
     */
    @Generated public static final int errSSLMissingExtension = 0xFFFFD97B;
    /**
     * bad OCSP response
     */
    @Generated public static final int errSSLBadCertificateStatusResponse = 0xFFFFD97A;
    /**
     * certificate required
     */
    @Generated public static final int errSSLCertificateRequired = 0xFFFFD979;
    /**
     * unknown PSK identity
     */
    @Generated public static final int errSSLUnknownPSKIdentity = 0xFFFFD978;
    /**
     * unknown or unrecognized name
     */
    @Generated public static final int errSSLUnrecognizedName = 0xFFFFD977;
    /**
     * ATS violation
     */
    @Generated public static final int errSSLATSViolation = 0xFFFFD968;
    /**
     * ATS violation: minimum protocol version is not ATS compliant
     */
    @Generated public static final int errSSLATSMinimumVersionViolation = 0xFFFFD967;
    /**
     * ATS violation: selected ciphersuite is not ATS compliant
     */
    @Generated public static final int errSSLATSCiphersuiteViolation = 0xFFFFD966;
    /**
     * ATS violation: peer key size is not ATS compliant
     */
    @Generated public static final int errSSLATSMinimumKeySizeViolation = 0xFFFFD965;
    /**
     * ATS violation: peer leaf certificate hash algorithm is not ATS compliant
     */
    @Generated public static final int errSSLATSLeafCertificateHashAlgorithmViolation = 0xFFFFD964;
    /**
     * ATS violation: peer certificate hash algorithm is not ATS compliant
     */
    @Generated public static final int errSSLATSCertificateHashAlgorithmViolation = 0xFFFFD963;
    /**
     * ATS violation: peer certificate is not issued by trusted peer
     */
    @Generated public static final int errSSLATSCertificateTrustViolation = 0xFFFFD962;
    /**
     * The requested policy is not allowed for this certificate.
     */
    @Generated public static final int errSecCertificatePolicyNotAllowed = 0xFFFEF6C5;
    /**
     * The requested name is not allowed for this certificate.
     */
    @Generated public static final int errSecCertificateNameNotAllowed = 0xFFFEF6C4;
    /**
     * The validity period in the certificate exceeds the maximum allowed.
     */
    @Generated public static final int errSecCertificateValidityPeriodTooLong = 0xFFFEF6C3;
    /**
     * Client is restricted and is not permitted to perform this operation.
     */
    @Generated public static final int errSecRestrictedAPI = 0xFFFF7B1C;
    /**
     * The verified certificate is a CA rather than an end-entity
     */
    @Generated public static final int errSecCertificateIsCA = 0xFFFEF6C2;
    /**
     * Early application data rejected by peer
     */
    @Generated public static final int errSSLEarlyDataRejected = 0xFFFFD95E;
    /**
     * The CRL authority was not valid.
     */
    @Generated public static final int errSecInvalidCRLAuthority = 0xFFFEF70D;
    /**
     * The tuple credentials are not valid.
     */
    @Generated public static final int errSecInvalidTupleCredentials = 0xFFFEF6F4;
    /**
     * The certificate contains multiple extensions with the same extension ID.
     */
    @Generated public static final int errSecCertificateDuplicateExtension = 0xFFFEF6C1;
}
