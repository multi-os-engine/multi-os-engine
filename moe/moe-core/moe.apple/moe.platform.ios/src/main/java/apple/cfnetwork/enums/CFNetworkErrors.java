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

package apple.cfnetwork.enums;

import org.moe.natj.general.ann.Generated;

/**
 * CFNetworkErrors
 * <p>
 * Discussion:
 * The list of all public error codes returned under the error domain
 * kCFErrorDomainCFNetwork
 */
@Generated
public final class CFNetworkErrors {
    @Generated public static final int CFHostErrorHostNotFound = 0x00000001;
    /**
     * Query the kCFGetAddrInfoFailureKey to get the value returned from getaddrinfo; lookup in netdb.h
     */
    @Generated public static final int CFHostErrorUnknown = 0x00000002;
    /**
     * SOCKS errors; in all cases you may query kCFSOCKSStatusCodeKey to recover the status code returned by the server
     */
    @Generated public static final int CFSOCKSErrorUnknownClientVersion = 0x00000064;
    /**
     * Query the kCFSOCKSVersionKey to find the version requested by the server
     */
    @Generated public static final int CFSOCKSErrorUnsupportedServerVersion = 0x00000065;
    /**
     * request rejected or failed by the server
     */
    @Generated public static final int CFSOCKS4ErrorRequestFailed = 0x0000006E;
    /**
     * request rejected because SOCKS server cannot connect to identd on the client
     */
    @Generated public static final int CFSOCKS4ErrorIdentdFailed = 0x0000006F;
    /**
     * request rejected because the client program and identd report different user-ids
     */
    @Generated public static final int CFSOCKS4ErrorIdConflict = 0x00000070;
    @Generated public static final int CFSOCKS4ErrorUnknownStatusCode = 0x00000071;
    /**
     * SOCKS5-specific errors
     */
    @Generated public static final int CFSOCKS5ErrorBadState = 0x00000078;
    /**
     * SOCKS5-specific errors
     */
    @Generated public static final int CFSOCKS5ErrorBadResponseAddr = 0x00000079;
    /**
     * SOCKS5-specific errors
     */
    @Generated public static final int CFSOCKS5ErrorBadCredentials = 0x0000007A;
    /**
     * query kCFSOCKSNegotiationMethodKey to find the method requested
     */
    @Generated public static final int CFSOCKS5ErrorUnsupportedNegotiationMethod = 0x0000007B;
    @Generated public static final int CFSOCKS5ErrorNoAcceptableMethod = 0x0000007C;
    /**
     * FTP errors; query the kCFFTPStatusCodeKey to get the status code returned by the server
     */
    @Generated public static final int CFFTPErrorUnexpectedStatusCode = 0x000000C8;
    /**
     * HTTP errors
     */
    @Generated public static final int CFErrorHTTPAuthenticationTypeUnsupported = 0x0000012C;
    /**
     * HTTP errors
     */
    @Generated public static final int CFErrorHTTPBadCredentials = 0x0000012D;
    /**
     * HTTP errors
     */
    @Generated public static final int CFErrorHTTPConnectionLost = 0x0000012E;
    /**
     * HTTP errors
     */
    @Generated public static final int CFErrorHTTPParseFailure = 0x0000012F;
    /**
     * HTTP errors
     */
    @Generated public static final int CFErrorHTTPRedirectionLoopDetected = 0x00000130;
    /**
     * HTTP errors
     */
    @Generated public static final int CFErrorHTTPBadURL = 0x00000131;
    /**
     * HTTP errors
     */
    @Generated public static final int CFErrorHTTPProxyConnectionFailure = 0x00000132;
    /**
     * HTTP errors
     */
    @Generated public static final int CFErrorHTTPBadProxyCredentials = 0x00000133;
    /**
     * HTTP errors
     */
    @Generated public static final int CFErrorPACFileError = 0x00000134;
    /**
     * HTTP errors
     */
    @Generated public static final int CFErrorPACFileAuth = 0x00000135;
    /**
     * HTTP errors
     */
    @Generated public static final int CFErrorHTTPSProxyConnectionFailure = 0x00000136;
    /**
     * HTTP errors
     */
    @Generated public static final int CFStreamErrorHTTPSProxyFailureUnexpectedResponseToCONNECTMethod = 0x00000137;
    /**
     * Error codes for CFURLConnection and CFURLProtocol
     */
    @Generated public static final int CFURLErrorBackgroundSessionInUseByAnotherProcess = 0xFFFFFC1C;
    /**
     * Error codes for CFURLConnection and CFURLProtocol
     */
    @Generated public static final int CFURLErrorBackgroundSessionWasDisconnected = 0xFFFFFC1B;
    /**
     * Error codes for CFURLConnection and CFURLProtocol
     */
    @Generated public static final int CFURLErrorUnknown = 0xFFFFFC1A;
    /**
     * Error codes for CFURLConnection and CFURLProtocol
     */
    @Generated public static final int CFURLErrorCancelled = 0xFFFFFC19;
    /**
     * Error codes for CFURLConnection and CFURLProtocol
     */
    @Generated public static final int CFURLErrorBadURL = 0xFFFFFC18;
    /**
     * Error codes for CFURLConnection and CFURLProtocol
     */
    @Generated public static final int CFURLErrorTimedOut = 0xFFFFFC17;
    /**
     * Error codes for CFURLConnection and CFURLProtocol
     */
    @Generated public static final int CFURLErrorUnsupportedURL = 0xFFFFFC16;
    /**
     * Error codes for CFURLConnection and CFURLProtocol
     */
    @Generated public static final int CFURLErrorCannotFindHost = 0xFFFFFC15;
    /**
     * Error codes for CFURLConnection and CFURLProtocol
     */
    @Generated public static final int CFURLErrorCannotConnectToHost = 0xFFFFFC14;
    /**
     * Error codes for CFURLConnection and CFURLProtocol
     */
    @Generated public static final int CFURLErrorNetworkConnectionLost = 0xFFFFFC13;
    /**
     * Error codes for CFURLConnection and CFURLProtocol
     */
    @Generated public static final int CFURLErrorDNSLookupFailed = 0xFFFFFC12;
    /**
     * Error codes for CFURLConnection and CFURLProtocol
     */
    @Generated public static final int CFURLErrorHTTPTooManyRedirects = 0xFFFFFC11;
    /**
     * Error codes for CFURLConnection and CFURLProtocol
     */
    @Generated public static final int CFURLErrorResourceUnavailable = 0xFFFFFC10;
    /**
     * Error codes for CFURLConnection and CFURLProtocol
     */
    @Generated public static final int CFURLErrorNotConnectedToInternet = 0xFFFFFC0F;
    /**
     * Error codes for CFURLConnection and CFURLProtocol
     */
    @Generated public static final int CFURLErrorRedirectToNonExistentLocation = 0xFFFFFC0E;
    /**
     * Error codes for CFURLConnection and CFURLProtocol
     */
    @Generated public static final int CFURLErrorBadServerResponse = 0xFFFFFC0D;
    /**
     * Error codes for CFURLConnection and CFURLProtocol
     */
    @Generated public static final int CFURLErrorUserCancelledAuthentication = 0xFFFFFC0C;
    /**
     * Error codes for CFURLConnection and CFURLProtocol
     */
    @Generated public static final int CFURLErrorUserAuthenticationRequired = 0xFFFFFC0B;
    /**
     * Error codes for CFURLConnection and CFURLProtocol
     */
    @Generated public static final int CFURLErrorZeroByteResource = 0xFFFFFC0A;
    /**
     * Error codes for CFURLConnection and CFURLProtocol
     */
    @Generated public static final int CFURLErrorCannotDecodeRawData = 0xFFFFFC09;
    /**
     * Error codes for CFURLConnection and CFURLProtocol
     */
    @Generated public static final int CFURLErrorCannotDecodeContentData = 0xFFFFFC08;
    /**
     * Error codes for CFURLConnection and CFURLProtocol
     */
    @Generated public static final int CFURLErrorCannotParseResponse = 0xFFFFFC07;
    /**
     * Error codes for CFURLConnection and CFURLProtocol
     */
    @Generated public static final int CFURLErrorInternationalRoamingOff = 0xFFFFFC06;
    /**
     * Error codes for CFURLConnection and CFURLProtocol
     */
    @Generated public static final int CFURLErrorCallIsActive = 0xFFFFFC05;
    /**
     * Error codes for CFURLConnection and CFURLProtocol
     */
    @Generated public static final int CFURLErrorDataNotAllowed = 0xFFFFFC04;
    /**
     * Error codes for CFURLConnection and CFURLProtocol
     */
    @Generated public static final int CFURLErrorRequestBodyStreamExhausted = 0xFFFFFC03;
    /**
     * Error codes for CFURLConnection and CFURLProtocol
     */
    @Generated public static final int CFURLErrorAppTransportSecurityRequiresSecureConnection = 0xFFFFFC02;
    /**
     * Error codes for CFURLConnection and CFURLProtocol
     */
    @Generated public static final int CFURLErrorFileDoesNotExist = 0xFFFFFBB4;
    /**
     * Error codes for CFURLConnection and CFURLProtocol
     */
    @Generated public static final int CFURLErrorFileIsDirectory = 0xFFFFFBB3;
    /**
     * Error codes for CFURLConnection and CFURLProtocol
     */
    @Generated public static final int CFURLErrorNoPermissionsToReadFile = 0xFFFFFBB2;
    /**
     * Error codes for CFURLConnection and CFURLProtocol
     */
    @Generated public static final int CFURLErrorDataLengthExceedsMaximum = 0xFFFFFBB1;
    /**
     * SSL errors
     */
    @Generated public static final int CFURLErrorSecureConnectionFailed = 0xFFFFFB50;
    /**
     * SSL errors
     */
    @Generated public static final int CFURLErrorServerCertificateHasBadDate = 0xFFFFFB4F;
    /**
     * SSL errors
     */
    @Generated public static final int CFURLErrorServerCertificateUntrusted = 0xFFFFFB4E;
    /**
     * SSL errors
     */
    @Generated public static final int CFURLErrorServerCertificateHasUnknownRoot = 0xFFFFFB4D;
    /**
     * SSL errors
     */
    @Generated public static final int CFURLErrorServerCertificateNotYetValid = 0xFFFFFB4C;
    /**
     * SSL errors
     */
    @Generated public static final int CFURLErrorClientCertificateRejected = 0xFFFFFB4B;
    /**
     * SSL errors
     */
    @Generated public static final int CFURLErrorClientCertificateRequired = 0xFFFFFB4A;
    /**
     * SSL errors
     */
    @Generated public static final int CFURLErrorCannotLoadFromNetwork = 0xFFFFF830;
    /**
     * Download and file I/O errors
     */
    @Generated public static final int CFURLErrorCannotCreateFile = 0xFFFFF448;
    /**
     * Download and file I/O errors
     */
    @Generated public static final int CFURLErrorCannotOpenFile = 0xFFFFF447;
    /**
     * Download and file I/O errors
     */
    @Generated public static final int CFURLErrorCannotCloseFile = 0xFFFFF446;
    /**
     * Download and file I/O errors
     */
    @Generated public static final int CFURLErrorCannotWriteToFile = 0xFFFFF445;
    /**
     * Download and file I/O errors
     */
    @Generated public static final int CFURLErrorCannotRemoveFile = 0xFFFFF444;
    /**
     * Download and file I/O errors
     */
    @Generated public static final int CFURLErrorCannotMoveFile = 0xFFFFF443;
    /**
     * Download and file I/O errors
     */
    @Generated public static final int CFURLErrorDownloadDecodingFailedMidStream = 0xFFFFF442;
    /**
     * Download and file I/O errors
     */
    @Generated public static final int CFURLErrorDownloadDecodingFailedToComplete = 0xFFFFF441;
    /**
     * Cookie errors
     */
    @Generated public static final int CFHTTPCookieCannotParseCookieFile = 0xFFFFF060;
    /**
     * Errors originating from CFNetServices
     */
    @Generated public static final int CFNetServiceErrorUnknown = 0xFFFEE6C0;
    /**
     * Errors originating from CFNetServices
     */
    @Generated public static final int CFNetServiceErrorCollision = 0xFFFEE6BF;
    /**
     * Errors originating from CFNetServices
     */
    @Generated public static final int CFNetServiceErrorNotFound = 0xFFFEE6BE;
    /**
     * Errors originating from CFNetServices
     */
    @Generated public static final int CFNetServiceErrorInProgress = 0xFFFEE6BD;
    /**
     * Errors originating from CFNetServices
     */
    @Generated public static final int CFNetServiceErrorBadArgument = 0xFFFEE6BC;
    /**
     * Errors originating from CFNetServices
     */
    @Generated public static final int CFNetServiceErrorCancel = 0xFFFEE6BB;
    /**
     * Errors originating from CFNetServices
     */
    @Generated public static final int CFNetServiceErrorInvalid = 0xFFFEE6BA;
    /**
     * Errors originating from CFNetServices
     */
    @Generated public static final int CFNetServiceErrorTimeout = 0xFFFEE6B9;
    /**
     * An error from DNS discovery; look at kCFDNSServiceFailureKey to get the error number and interpret using dns_sd.h
     */
    @Generated public static final int CFNetServiceErrorDNSServiceFailure = 0xFFFEE2D8;

    @Generated
    private CFNetworkErrors() {
    }

    /**
     * Error codes for CFURLConnection and CFURLProtocol
     */
    @Generated public static final int CFURLErrorFileOutsideSafeArea = 0xFFFFFBB0;
}
