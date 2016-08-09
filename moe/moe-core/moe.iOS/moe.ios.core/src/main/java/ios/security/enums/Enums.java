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

package ios.security.enums;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class Enums {
	@Generated
	private Enums() {
	}

	@Generated
	public static final int errSSLProtocol = 0xFFFFD9B8;
	@Generated
	public static final int errSSLNegotiation = 0xFFFFD9B7;
	@Generated
	public static final int errSSLFatalAlert = 0xFFFFD9B6;
	@Generated
	public static final int errSSLWouldBlock = 0xFFFFD9B5;
	@Generated
	public static final int errSSLSessionNotFound = 0xFFFFD9B4;
	@Generated
	public static final int errSSLClosedGraceful = 0xFFFFD9B3;
	@Generated
	public static final int errSSLClosedAbort = 0xFFFFD9B2;
	@Generated
	public static final int errSSLXCertChainInvalid = 0xFFFFD9B1;
	@Generated
	public static final int errSSLBadCert = 0xFFFFD9B0;
	@Generated
	public static final int errSSLCrypto = 0xFFFFD9AF;
	@Generated
	public static final int errSSLInternal = 0xFFFFD9AE;
	@Generated
	public static final int errSSLModuleAttach = 0xFFFFD9AD;
	@Generated
	public static final int errSSLUnknownRootCert = 0xFFFFD9AC;
	@Generated
	public static final int errSSLNoRootCert = 0xFFFFD9AB;
	@Generated
	public static final int errSSLCertExpired = 0xFFFFD9AA;
	@Generated
	public static final int errSSLCertNotYetValid = 0xFFFFD9A9;
	@Generated
	public static final int errSSLClosedNoNotify = 0xFFFFD9A8;
	@Generated
	public static final int errSSLBufferOverflow = 0xFFFFD9A7;
	@Generated
	public static final int errSSLBadCipherSuite = 0xFFFFD9A6;
	@Generated
	public static final int errSSLPeerUnexpectedMsg = 0xFFFFD9A5;
	@Generated
	public static final int errSSLPeerBadRecordMac = 0xFFFFD9A4;
	@Generated
	public static final int errSSLPeerDecryptionFail = 0xFFFFD9A3;
	@Generated
	public static final int errSSLPeerRecordOverflow = 0xFFFFD9A2;
	@Generated
	public static final int errSSLPeerDecompressFail = 0xFFFFD9A1;
	@Generated
	public static final int errSSLPeerHandshakeFail = 0xFFFFD9A0;
	@Generated
	public static final int errSSLPeerBadCert = 0xFFFFD99F;
	@Generated
	public static final int errSSLPeerUnsupportedCert = 0xFFFFD99E;
	@Generated
	public static final int errSSLPeerCertRevoked = 0xFFFFD99D;
	@Generated
	public static final int errSSLPeerCertExpired = 0xFFFFD99C;
	@Generated
	public static final int errSSLPeerCertUnknown = 0xFFFFD99B;
	@Generated
	public static final int errSSLIllegalParam = 0xFFFFD99A;
	@Generated
	public static final int errSSLPeerUnknownCA = 0xFFFFD999;
	@Generated
	public static final int errSSLPeerAccessDenied = 0xFFFFD998;
	@Generated
	public static final int errSSLPeerDecodeError = 0xFFFFD997;
	@Generated
	public static final int errSSLPeerDecryptError = 0xFFFFD996;
	@Generated
	public static final int errSSLPeerExportRestriction = 0xFFFFD995;
	@Generated
	public static final int errSSLPeerProtocolVersion = 0xFFFFD994;
	@Generated
	public static final int errSSLPeerInsufficientSecurity = 0xFFFFD993;
	@Generated
	public static final int errSSLPeerInternalError = 0xFFFFD992;
	@Generated
	public static final int errSSLPeerUserCancelled = 0xFFFFD991;
	@Generated
	public static final int errSSLPeerNoRenegotiation = 0xFFFFD990;
	@Generated
	public static final int errSSLPeerAuthCompleted = 0xFFFFD98F;
	@Generated
	public static final int errSSLClientCertRequested = 0xFFFFD98E;
	@Generated
	public static final int errSSLHostNameMismatch = 0xFFFFD98D;
	@Generated
	public static final int errSSLConnectionRefused = 0xFFFFD98C;
	@Generated
	public static final int errSSLDecryptionFail = 0xFFFFD98B;
	@Generated
	public static final int errSSLBadRecordMac = 0xFFFFD98A;
	@Generated
	public static final int errSSLRecordOverflow = 0xFFFFD989;
	@Generated
	public static final int errSSLBadConfiguration = 0xFFFFD988;
	@Generated
	public static final int errSSLUnexpectedRecord = 0xFFFFD987;
	@Generated
	public static final int kSecTrustResultInvalid = 0x00000000;
	@Generated
	public static final int kSecTrustResultProceed = 0x00000001;
	@Generated
	public static final int kSecTrustResultConfirm = 0x00000002;
	@Generated
	public static final int kSecTrustResultDeny = 0x00000003;
	@Generated
	public static final int kSecTrustResultUnspecified = 0x00000004;
	@Generated
	public static final int kSecTrustResultRecoverableTrustFailure = 0x00000005;
	@Generated
	public static final int kSecTrustResultFatalTrustFailure = 0x00000006;
	@Generated
	public static final int kSecTrustResultOtherError = 0x00000007;
	@Generated
	public static final char SSL_NULL_WITH_NULL_NULL = 0x0000;
	@Generated
	public static final char SSL_RSA_WITH_NULL_MD5 = 0x0001;
	@Generated
	public static final char SSL_RSA_WITH_NULL_SHA = 0x0002;
	@Generated
	public static final char SSL_RSA_EXPORT_WITH_RC4_40_MD5 = 0x0003;
	@Generated
	public static final char SSL_RSA_WITH_RC4_128_MD5 = 0x0004;
	@Generated
	public static final char SSL_RSA_WITH_RC4_128_SHA = 0x0005;
	@Generated
	public static final char SSL_RSA_EXPORT_WITH_RC2_CBC_40_MD5 = 0x0006;
	@Generated
	public static final char SSL_RSA_WITH_IDEA_CBC_SHA = 0x0007;
	@Generated
	public static final char SSL_RSA_EXPORT_WITH_DES40_CBC_SHA = 0x0008;
	@Generated
	public static final char SSL_RSA_WITH_DES_CBC_SHA = 0x0009;
	@Generated
	public static final char SSL_RSA_WITH_3DES_EDE_CBC_SHA = 0x000A;
	@Generated
	public static final char SSL_DH_DSS_EXPORT_WITH_DES40_CBC_SHA = 0x000B;
	@Generated
	public static final char SSL_DH_DSS_WITH_DES_CBC_SHA = 0x000C;
	@Generated
	public static final char SSL_DH_DSS_WITH_3DES_EDE_CBC_SHA = 0x000D;
	@Generated
	public static final char SSL_DH_RSA_EXPORT_WITH_DES40_CBC_SHA = 0x000E;
	@Generated
	public static final char SSL_DH_RSA_WITH_DES_CBC_SHA = 0x000F;
	@Generated
	public static final char SSL_DH_RSA_WITH_3DES_EDE_CBC_SHA = 0x0010;
	@Generated
	public static final char SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA = 0x0011;
	@Generated
	public static final char SSL_DHE_DSS_WITH_DES_CBC_SHA = 0x0012;
	@Generated
	public static final char SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA = 0x0013;
	@Generated
	public static final char SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA = 0x0014;
	@Generated
	public static final char SSL_DHE_RSA_WITH_DES_CBC_SHA = 0x0015;
	@Generated
	public static final char SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA = 0x0016;
	@Generated
	public static final char SSL_DH_anon_EXPORT_WITH_RC4_40_MD5 = 0x0017;
	@Generated
	public static final char SSL_DH_anon_WITH_RC4_128_MD5 = 0x0018;
	@Generated
	public static final char SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA = 0x0019;
	@Generated
	public static final char SSL_DH_anon_WITH_DES_CBC_SHA = 0x001A;
	@Generated
	public static final char SSL_DH_anon_WITH_3DES_EDE_CBC_SHA = 0x001B;
	@Generated
	public static final char SSL_FORTEZZA_DMS_WITH_NULL_SHA = 0x001C;
	@Generated
	public static final char SSL_FORTEZZA_DMS_WITH_FORTEZZA_CBC_SHA = 0x001D;
	@Generated
	public static final char TLS_RSA_WITH_AES_128_CBC_SHA = 0x002F;
	@Generated
	public static final char TLS_DH_DSS_WITH_AES_128_CBC_SHA = 0x0030;
	@Generated
	public static final char TLS_DH_RSA_WITH_AES_128_CBC_SHA = 0x0031;
	@Generated
	public static final char TLS_DHE_DSS_WITH_AES_128_CBC_SHA = 0x0032;
	@Generated
	public static final char TLS_DHE_RSA_WITH_AES_128_CBC_SHA = 0x0033;
	@Generated
	public static final char TLS_DH_anon_WITH_AES_128_CBC_SHA = 0x0034;
	@Generated
	public static final char TLS_RSA_WITH_AES_256_CBC_SHA = 0x0035;
	@Generated
	public static final char TLS_DH_DSS_WITH_AES_256_CBC_SHA = 0x0036;
	@Generated
	public static final char TLS_DH_RSA_WITH_AES_256_CBC_SHA = 0x0037;
	@Generated
	public static final char TLS_DHE_DSS_WITH_AES_256_CBC_SHA = 0x0038;
	@Generated
	public static final char TLS_DHE_RSA_WITH_AES_256_CBC_SHA = 0x0039;
	@Generated
	public static final char TLS_DH_anon_WITH_AES_256_CBC_SHA = 0x003A;
	@Generated
	public static final char TLS_ECDH_ECDSA_WITH_NULL_SHA = 0xC001;
	@Generated
	public static final char TLS_ECDH_ECDSA_WITH_RC4_128_SHA = 0xC002;
	@Generated
	public static final char TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA = 0xC003;
	@Generated
	public static final char TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA = 0xC004;
	@Generated
	public static final char TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA = 0xC005;
	@Generated
	public static final char TLS_ECDHE_ECDSA_WITH_NULL_SHA = 0xC006;
	@Generated
	public static final char TLS_ECDHE_ECDSA_WITH_RC4_128_SHA = 0xC007;
	@Generated
	public static final char TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA = 0xC008;
	@Generated
	public static final char TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA = 0xC009;
	@Generated
	public static final char TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA = 0xC00A;
	@Generated
	public static final char TLS_ECDH_RSA_WITH_NULL_SHA = 0xC00B;
	@Generated
	public static final char TLS_ECDH_RSA_WITH_RC4_128_SHA = 0xC00C;
	@Generated
	public static final char TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA = 0xC00D;
	@Generated
	public static final char TLS_ECDH_RSA_WITH_AES_128_CBC_SHA = 0xC00E;
	@Generated
	public static final char TLS_ECDH_RSA_WITH_AES_256_CBC_SHA = 0xC00F;
	@Generated
	public static final char TLS_ECDHE_RSA_WITH_NULL_SHA = 0xC010;
	@Generated
	public static final char TLS_ECDHE_RSA_WITH_RC4_128_SHA = 0xC011;
	@Generated
	public static final char TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA = 0xC012;
	@Generated
	public static final char TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA = 0xC013;
	@Generated
	public static final char TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA = 0xC014;
	@Generated
	public static final char TLS_ECDH_anon_WITH_NULL_SHA = 0xC015;
	@Generated
	public static final char TLS_ECDH_anon_WITH_RC4_128_SHA = 0xC016;
	@Generated
	public static final char TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA = 0xC017;
	@Generated
	public static final char TLS_ECDH_anon_WITH_AES_128_CBC_SHA = 0xC018;
	@Generated
	public static final char TLS_ECDH_anon_WITH_AES_256_CBC_SHA = 0xC019;
	@Generated
	public static final char TLS_NULL_WITH_NULL_NULL = 0x0000;
	@Generated
	public static final char TLS_RSA_WITH_NULL_MD5 = 0x0001;
	@Generated
	public static final char TLS_RSA_WITH_NULL_SHA = 0x0002;
	@Generated
	public static final char TLS_RSA_WITH_RC4_128_MD5 = 0x0004;
	@Generated
	public static final char TLS_RSA_WITH_RC4_128_SHA = 0x0005;
	@Generated
	public static final char TLS_RSA_WITH_3DES_EDE_CBC_SHA = 0x000A;
	@Generated
	public static final char TLS_RSA_WITH_NULL_SHA256 = 0x003B;
	@Generated
	public static final char TLS_RSA_WITH_AES_128_CBC_SHA256 = 0x003C;
	@Generated
	public static final char TLS_RSA_WITH_AES_256_CBC_SHA256 = 0x003D;
	@Generated
	public static final char TLS_DH_DSS_WITH_3DES_EDE_CBC_SHA = 0x000D;
	@Generated
	public static final char TLS_DH_RSA_WITH_3DES_EDE_CBC_SHA = 0x0010;
	@Generated
	public static final char TLS_DHE_DSS_WITH_3DES_EDE_CBC_SHA = 0x0013;
	@Generated
	public static final char TLS_DHE_RSA_WITH_3DES_EDE_CBC_SHA = 0x0016;
	@Generated
	public static final char TLS_DH_DSS_WITH_AES_128_CBC_SHA256 = 0x003E;
	@Generated
	public static final char TLS_DH_RSA_WITH_AES_128_CBC_SHA256 = 0x003F;
	@Generated
	public static final char TLS_DHE_DSS_WITH_AES_128_CBC_SHA256 = 0x0040;
	@Generated
	public static final char TLS_DHE_RSA_WITH_AES_128_CBC_SHA256 = 0x0067;
	@Generated
	public static final char TLS_DH_DSS_WITH_AES_256_CBC_SHA256 = 0x0068;
	@Generated
	public static final char TLS_DH_RSA_WITH_AES_256_CBC_SHA256 = 0x0069;
	@Generated
	public static final char TLS_DHE_DSS_WITH_AES_256_CBC_SHA256 = 0x006A;
	@Generated
	public static final char TLS_DHE_RSA_WITH_AES_256_CBC_SHA256 = 0x006B;
	@Generated
	public static final char TLS_DH_anon_WITH_RC4_128_MD5 = 0x0018;
	@Generated
	public static final char TLS_DH_anon_WITH_3DES_EDE_CBC_SHA = 0x001B;
	@Generated
	public static final char TLS_DH_anon_WITH_AES_128_CBC_SHA256 = 0x006C;
	@Generated
	public static final char TLS_DH_anon_WITH_AES_256_CBC_SHA256 = 0x006D;
	@Generated
	public static final char TLS_PSK_WITH_RC4_128_SHA = 0x008A;
	@Generated
	public static final char TLS_PSK_WITH_3DES_EDE_CBC_SHA = 0x008B;
	@Generated
	public static final char TLS_PSK_WITH_AES_128_CBC_SHA = 0x008C;
	@Generated
	public static final char TLS_PSK_WITH_AES_256_CBC_SHA = 0x008D;
	@Generated
	public static final char TLS_DHE_PSK_WITH_RC4_128_SHA = 0x008E;
	@Generated
	public static final char TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA = 0x008F;
	@Generated
	public static final char TLS_DHE_PSK_WITH_AES_128_CBC_SHA = 0x0090;
	@Generated
	public static final char TLS_DHE_PSK_WITH_AES_256_CBC_SHA = 0x0091;
	@Generated
	public static final char TLS_RSA_PSK_WITH_RC4_128_SHA = 0x0092;
	@Generated
	public static final char TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA = 0x0093;
	@Generated
	public static final char TLS_RSA_PSK_WITH_AES_128_CBC_SHA = 0x0094;
	@Generated
	public static final char TLS_RSA_PSK_WITH_AES_256_CBC_SHA = 0x0095;
	@Generated
	public static final char TLS_PSK_WITH_NULL_SHA = 0x002C;
	@Generated
	public static final char TLS_DHE_PSK_WITH_NULL_SHA = 0x002D;
	@Generated
	public static final char TLS_RSA_PSK_WITH_NULL_SHA = 0x002E;
	@Generated
	public static final char TLS_RSA_WITH_AES_128_GCM_SHA256 = 0x009C;
	@Generated
	public static final char TLS_RSA_WITH_AES_256_GCM_SHA384 = 0x009D;
	@Generated
	public static final char TLS_DHE_RSA_WITH_AES_128_GCM_SHA256 = 0x009E;
	@Generated
	public static final char TLS_DHE_RSA_WITH_AES_256_GCM_SHA384 = 0x009F;
	@Generated
	public static final char TLS_DH_RSA_WITH_AES_128_GCM_SHA256 = 0x00A0;
	@Generated
	public static final char TLS_DH_RSA_WITH_AES_256_GCM_SHA384 = 0x00A1;
	@Generated
	public static final char TLS_DHE_DSS_WITH_AES_128_GCM_SHA256 = 0x00A2;
	@Generated
	public static final char TLS_DHE_DSS_WITH_AES_256_GCM_SHA384 = 0x00A3;
	@Generated
	public static final char TLS_DH_DSS_WITH_AES_128_GCM_SHA256 = 0x00A4;
	@Generated
	public static final char TLS_DH_DSS_WITH_AES_256_GCM_SHA384 = 0x00A5;
	@Generated
	public static final char TLS_DH_anon_WITH_AES_128_GCM_SHA256 = 0x00A6;
	@Generated
	public static final char TLS_DH_anon_WITH_AES_256_GCM_SHA384 = 0x00A7;
	@Generated
	public static final char TLS_PSK_WITH_AES_128_GCM_SHA256 = 0x00A8;
	@Generated
	public static final char TLS_PSK_WITH_AES_256_GCM_SHA384 = 0x00A9;
	@Generated
	public static final char TLS_DHE_PSK_WITH_AES_128_GCM_SHA256 = 0x00AA;
	@Generated
	public static final char TLS_DHE_PSK_WITH_AES_256_GCM_SHA384 = 0x00AB;
	@Generated
	public static final char TLS_RSA_PSK_WITH_AES_128_GCM_SHA256 = 0x00AC;
	@Generated
	public static final char TLS_RSA_PSK_WITH_AES_256_GCM_SHA384 = 0x00AD;
	@Generated
	public static final char TLS_PSK_WITH_AES_128_CBC_SHA256 = 0x00AE;
	@Generated
	public static final char TLS_PSK_WITH_AES_256_CBC_SHA384 = 0x00AF;
	@Generated
	public static final char TLS_PSK_WITH_NULL_SHA256 = 0x00B0;
	@Generated
	public static final char TLS_PSK_WITH_NULL_SHA384 = 0x00B1;
	@Generated
	public static final char TLS_DHE_PSK_WITH_AES_128_CBC_SHA256 = 0x00B2;
	@Generated
	public static final char TLS_DHE_PSK_WITH_AES_256_CBC_SHA384 = 0x00B3;
	@Generated
	public static final char TLS_DHE_PSK_WITH_NULL_SHA256 = 0x00B4;
	@Generated
	public static final char TLS_DHE_PSK_WITH_NULL_SHA384 = 0x00B5;
	@Generated
	public static final char TLS_RSA_PSK_WITH_AES_128_CBC_SHA256 = 0x00B6;
	@Generated
	public static final char TLS_RSA_PSK_WITH_AES_256_CBC_SHA384 = 0x00B7;
	@Generated
	public static final char TLS_RSA_PSK_WITH_NULL_SHA256 = 0x00B8;
	@Generated
	public static final char TLS_RSA_PSK_WITH_NULL_SHA384 = 0x00B9;
	@Generated
	public static final char TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256 = 0xC023;
	@Generated
	public static final char TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384 = 0xC024;
	@Generated
	public static final char TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256 = 0xC025;
	@Generated
	public static final char TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384 = 0xC026;
	@Generated
	public static final char TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256 = 0xC027;
	@Generated
	public static final char TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384 = 0xC028;
	@Generated
	public static final char TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256 = 0xC029;
	@Generated
	public static final char TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384 = 0xC02A;
	@Generated
	public static final char TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256 = 0xC02B;
	@Generated
	public static final char TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384 = 0xC02C;
	@Generated
	public static final char TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256 = 0xC02D;
	@Generated
	public static final char TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384 = 0xC02E;
	@Generated
	public static final char TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256 = 0xC02F;
	@Generated
	public static final char TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384 = 0xC030;
	@Generated
	public static final char TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256 = 0xC031;
	@Generated
	public static final char TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384 = 0xC032;
	@Generated
	public static final char TLS_EMPTY_RENEGOTIATION_INFO_SCSV = 0x00FF;
	@Generated
	public static final char SSL_RSA_WITH_RC2_CBC_MD5 = 0xFF80;
	@Generated
	public static final char SSL_RSA_WITH_IDEA_CBC_MD5 = 0xFF81;
	@Generated
	public static final char SSL_RSA_WITH_DES_CBC_MD5 = 0xFF82;
	@Generated
	public static final char SSL_RSA_WITH_3DES_EDE_CBC_MD5 = 0xFF83;
	@Generated
	public static final char SSL_NO_SUCH_CIPHERSUITE = 0xFFFF;
	@NUInt
	@Generated
	public static final long kSecRevocationOCSPMethod = 0x0000000000000001L;
	@NUInt
	@Generated
	public static final long kSecRevocationCRLMethod = 0x0000000000000002L;
	@NUInt
	@Generated
	public static final long kSecRevocationPreferCRL = 0x0000000000000004L;
	@NUInt
	@Generated
	public static final long kSecRevocationRequirePositiveResponse = 0x0000000000000008L;
	@NUInt
	@Generated
	public static final long kSecRevocationNetworkAccessDisabled = 0x0000000000000010L;
	@NUInt
	@Generated
	public static final long kSecRevocationUseAnyAvailableMethod = 0x0000000000000003L;
	@Generated
	public static final int errSecSuccess = 0x00000000;
	@Generated
	public static final int errSecUnimplemented = 0xFFFFFFFC;
	@Generated
	public static final int errSecIO = 0xFFFFFFDC;
	@Generated
	public static final int errSecOpWr = 0xFFFFFFCF;
	@Generated
	public static final int errSecParam = 0xFFFFFFCE;
	@Generated
	public static final int errSecAllocate = 0xFFFFFF94;
	@Generated
	public static final int errSecUserCanceled = 0xFFFFFF80;
	@Generated
	public static final int errSecBadReq = 0xFFFFFC73;
	@Generated
	public static final int errSecInternalComponent = 0xFFFFF7EA;
	@Generated
	public static final int errSecNotAvailable = 0xFFFF9D35;
	@Generated
	public static final int errSecDuplicateItem = 0xFFFF9D2D;
	@Generated
	public static final int errSecItemNotFound = 0xFFFF9D2C;
	@Generated
	public static final int errSecInteractionNotAllowed = 0xFFFF9D24;
	@Generated
	public static final int errSecDecode = 0xFFFF995D;
	@Generated
	public static final int errSecAuthFailed = 0xFFFF9D33;
	@Generated
	public static final int errSSLWeakPeerEphemeralDHKey = 0xFFFFD986;
	@Generated
	public static final int errSSLClientHelloReceived = 0xFFFFD985;
}
