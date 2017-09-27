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

@Generated
public final class CFNetworkErrors {
    @Generated public static final int CFHostErrorHostNotFound = 0x00000001;
    @Generated public static final int CFHostErrorUnknown = 0x00000002;
    @Generated public static final int CFSOCKSErrorUnknownClientVersion = 0x00000064;
    @Generated public static final int CFSOCKSErrorUnsupportedServerVersion = 0x00000065;
    @Generated public static final int CFSOCKS4ErrorRequestFailed = 0x0000006E;
    @Generated public static final int CFSOCKS4ErrorIdentdFailed = 0x0000006F;
    @Generated public static final int CFSOCKS4ErrorIdConflict = 0x00000070;
    @Generated public static final int CFSOCKS4ErrorUnknownStatusCode = 0x00000071;
    @Generated public static final int CFSOCKS5ErrorBadState = 0x00000078;
    @Generated public static final int CFSOCKS5ErrorBadResponseAddr = 0x00000079;
    @Generated public static final int CFSOCKS5ErrorBadCredentials = 0x0000007A;
    @Generated public static final int CFSOCKS5ErrorUnsupportedNegotiationMethod = 0x0000007B;
    @Generated public static final int CFSOCKS5ErrorNoAcceptableMethod = 0x0000007C;
    @Generated public static final int CFFTPErrorUnexpectedStatusCode = 0x000000C8;
    @Generated public static final int CFErrorHTTPAuthenticationTypeUnsupported = 0x0000012C;
    @Generated public static final int CFErrorHTTPBadCredentials = 0x0000012D;
    @Generated public static final int CFErrorHTTPConnectionLost = 0x0000012E;
    @Generated public static final int CFErrorHTTPParseFailure = 0x0000012F;
    @Generated public static final int CFErrorHTTPRedirectionLoopDetected = 0x00000130;
    @Generated public static final int CFErrorHTTPBadURL = 0x00000131;
    @Generated public static final int CFErrorHTTPProxyConnectionFailure = 0x00000132;
    @Generated public static final int CFErrorHTTPBadProxyCredentials = 0x00000133;
    @Generated public static final int CFErrorPACFileError = 0x00000134;
    @Generated public static final int CFErrorPACFileAuth = 0x00000135;
    @Generated public static final int CFErrorHTTPSProxyConnectionFailure = 0x00000136;
    @Generated public static final int CFStreamErrorHTTPSProxyFailureUnexpectedResponseToCONNECTMethod = 0x00000137;
    @Generated public static final int CFURLErrorBackgroundSessionInUseByAnotherProcess = 0xFFFFFC1C;
    @Generated public static final int CFURLErrorBackgroundSessionWasDisconnected = 0xFFFFFC1B;
    @Generated public static final int CFURLErrorUnknown = 0xFFFFFC1A;
    @Generated public static final int CFURLErrorCancelled = 0xFFFFFC19;
    @Generated public static final int CFURLErrorBadURL = 0xFFFFFC18;
    @Generated public static final int CFURLErrorTimedOut = 0xFFFFFC17;
    @Generated public static final int CFURLErrorUnsupportedURL = 0xFFFFFC16;
    @Generated public static final int CFURLErrorCannotFindHost = 0xFFFFFC15;
    @Generated public static final int CFURLErrorCannotConnectToHost = 0xFFFFFC14;
    @Generated public static final int CFURLErrorNetworkConnectionLost = 0xFFFFFC13;
    @Generated public static final int CFURLErrorDNSLookupFailed = 0xFFFFFC12;
    @Generated public static final int CFURLErrorHTTPTooManyRedirects = 0xFFFFFC11;
    @Generated public static final int CFURLErrorResourceUnavailable = 0xFFFFFC10;
    @Generated public static final int CFURLErrorNotConnectedToInternet = 0xFFFFFC0F;
    @Generated public static final int CFURLErrorRedirectToNonExistentLocation = 0xFFFFFC0E;
    @Generated public static final int CFURLErrorBadServerResponse = 0xFFFFFC0D;
    @Generated public static final int CFURLErrorUserCancelledAuthentication = 0xFFFFFC0C;
    @Generated public static final int CFURLErrorUserAuthenticationRequired = 0xFFFFFC0B;
    @Generated public static final int CFURLErrorZeroByteResource = 0xFFFFFC0A;
    @Generated public static final int CFURLErrorCannotDecodeRawData = 0xFFFFFC09;
    @Generated public static final int CFURLErrorCannotDecodeContentData = 0xFFFFFC08;
    @Generated public static final int CFURLErrorCannotParseResponse = 0xFFFFFC07;
    @Generated public static final int CFURLErrorInternationalRoamingOff = 0xFFFFFC06;
    @Generated public static final int CFURLErrorCallIsActive = 0xFFFFFC05;
    @Generated public static final int CFURLErrorDataNotAllowed = 0xFFFFFC04;
    @Generated public static final int CFURLErrorRequestBodyStreamExhausted = 0xFFFFFC03;
    @Generated public static final int CFURLErrorAppTransportSecurityRequiresSecureConnection = 0xFFFFFC02;
    @Generated public static final int CFURLErrorFileDoesNotExist = 0xFFFFFBB4;
    @Generated public static final int CFURLErrorFileIsDirectory = 0xFFFFFBB3;
    @Generated public static final int CFURLErrorNoPermissionsToReadFile = 0xFFFFFBB2;
    @Generated public static final int CFURLErrorDataLengthExceedsMaximum = 0xFFFFFBB1;
    @Generated public static final int CFURLErrorSecureConnectionFailed = 0xFFFFFB50;
    @Generated public static final int CFURLErrorServerCertificateHasBadDate = 0xFFFFFB4F;
    @Generated public static final int CFURLErrorServerCertificateUntrusted = 0xFFFFFB4E;
    @Generated public static final int CFURLErrorServerCertificateHasUnknownRoot = 0xFFFFFB4D;
    @Generated public static final int CFURLErrorServerCertificateNotYetValid = 0xFFFFFB4C;
    @Generated public static final int CFURLErrorClientCertificateRejected = 0xFFFFFB4B;
    @Generated public static final int CFURLErrorClientCertificateRequired = 0xFFFFFB4A;
    @Generated public static final int CFURLErrorCannotLoadFromNetwork = 0xFFFFF830;
    @Generated public static final int CFURLErrorCannotCreateFile = 0xFFFFF448;
    @Generated public static final int CFURLErrorCannotOpenFile = 0xFFFFF447;
    @Generated public static final int CFURLErrorCannotCloseFile = 0xFFFFF446;
    @Generated public static final int CFURLErrorCannotWriteToFile = 0xFFFFF445;
    @Generated public static final int CFURLErrorCannotRemoveFile = 0xFFFFF444;
    @Generated public static final int CFURLErrorCannotMoveFile = 0xFFFFF443;
    @Generated public static final int CFURLErrorDownloadDecodingFailedMidStream = 0xFFFFF442;
    @Generated public static final int CFURLErrorDownloadDecodingFailedToComplete = 0xFFFFF441;
    @Generated public static final int CFHTTPCookieCannotParseCookieFile = 0xFFFFF060;
    @Generated public static final int CFNetServiceErrorUnknown = 0xFFFEE6C0;
    @Generated public static final int CFNetServiceErrorCollision = 0xFFFEE6BF;
    @Generated public static final int CFNetServiceErrorNotFound = 0xFFFEE6BE;
    @Generated public static final int CFNetServiceErrorInProgress = 0xFFFEE6BD;
    @Generated public static final int CFNetServiceErrorBadArgument = 0xFFFEE6BC;
    @Generated public static final int CFNetServiceErrorCancel = 0xFFFEE6BB;
    @Generated public static final int CFNetServiceErrorInvalid = 0xFFFEE6BA;
    @Generated public static final int CFNetServiceErrorTimeout = 0xFFFEE6B9;
    @Generated public static final int CFNetServiceErrorDNSServiceFailure = 0xFFFEE2D8;

    @Generated
    private CFNetworkErrors() {
    }

    @Generated public static final int CFURLErrorFileOutsideSafeArea = 0xFFFFFBB0;
}
