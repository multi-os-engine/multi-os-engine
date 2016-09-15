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

package apple.foundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class Enums {
    @Generated
    private Enums() {
    }

    @NUInt @Generated public static final long NSASCIIStringEncoding = 0x0000000000000001L;
    @NUInt @Generated public static final long NSNEXTSTEPStringEncoding = 0x0000000000000002L;
    @NUInt @Generated public static final long NSJapaneseEUCStringEncoding = 0x0000000000000003L;
    @NUInt @Generated public static final long NSUTF8StringEncoding = 0x0000000000000004L;
    @NUInt @Generated public static final long NSISOLatin1StringEncoding = 0x0000000000000005L;
    @NUInt @Generated public static final long NSSymbolStringEncoding = 0x0000000000000006L;
    @NUInt @Generated public static final long NSNonLossyASCIIStringEncoding = 0x0000000000000007L;
    @NUInt @Generated public static final long NSShiftJISStringEncoding = 0x0000000000000008L;
    @NUInt @Generated public static final long NSISOLatin2StringEncoding = 0x0000000000000009L;
    @NUInt @Generated public static final long NSUnicodeStringEncoding = 0x000000000000000AL;
    @NUInt @Generated public static final long NSWindowsCP1251StringEncoding = 0x000000000000000BL;
    @NUInt @Generated public static final long NSWindowsCP1252StringEncoding = 0x000000000000000CL;
    @NUInt @Generated public static final long NSWindowsCP1253StringEncoding = 0x000000000000000DL;
    @NUInt @Generated public static final long NSWindowsCP1254StringEncoding = 0x000000000000000EL;
    @NUInt @Generated public static final long NSWindowsCP1250StringEncoding = 0x000000000000000FL;
    @NUInt @Generated public static final long NSISO2022JPStringEncoding = 0x0000000000000015L;
    @NUInt @Generated public static final long NSMacOSRomanStringEncoding = 0x000000000000001EL;
    @NUInt @Generated public static final long NSUTF16StringEncoding = 0x000000000000000AL;
    @NUInt @Generated public static final long NSUTF16BigEndianStringEncoding = 0x0000000090000100L;
    @NUInt @Generated public static final long NSUTF16LittleEndianStringEncoding = 0x0000000094000100L;
    @NUInt @Generated public static final long NSUTF32StringEncoding = 0x000000008C000100L;
    @NUInt @Generated public static final long NSUTF32BigEndianStringEncoding = 0x0000000098000100L;
    @NUInt @Generated public static final long NSUTF32LittleEndianStringEncoding = 0x000000009C000100L;
    @Generated public static final int NSBundleExecutableArchitectureI386 = 0x00000007;
    @Generated public static final int NSBundleExecutableArchitecturePPC = 0x00000012;
    @Generated public static final int NSBundleExecutableArchitectureX86_64 = 0x01000007;
    @Generated public static final int NSBundleExecutableArchitecturePPC64 = 0x01000012;
    @NInt @Generated public static final long NSUbiquitousKeyValueStoreServerChange = 0x0000000000000000L;
    @NInt @Generated public static final long NSUbiquitousKeyValueStoreInitialSyncChange = 0x0000000000000001L;
    @NInt @Generated public static final long NSUbiquitousKeyValueStoreQuotaViolationChange = 0x0000000000000002L;
    @NInt @Generated public static final long NSUbiquitousKeyValueStoreAccountChange = 0x0000000000000003L;
    @NInt @Generated public static final long NSURLErrorCancelledReasonUserForceQuitApplication = 0x0000000000000000L;
    @NInt @Generated public static final long NSURLErrorCancelledReasonBackgroundUpdatesDisabled = 0x0000000000000001L;
    @NInt @Generated public static final long NSURLErrorCancelledReasonInsufficientSystemResources = 0x0000000000000002L;
    @Generated public static final int NS_UnknownByteOrder = 0x00000000;
    @Generated public static final int NS_LittleEndian = 0x00000001;
    @Generated public static final int NS_BigEndian = 0x00000002;
    @NInt @Generated public static final long NSURLErrorUnknown = 0xFFFFFFFFFFFFFFFFL;
    @NInt @Generated public static final long NSURLErrorCancelled = 0xFFFFFFFFFFFFFC19L;
    @NInt @Generated public static final long NSURLErrorBadURL = 0xFFFFFFFFFFFFFC18L;
    @NInt @Generated public static final long NSURLErrorTimedOut = 0xFFFFFFFFFFFFFC17L;
    @NInt @Generated public static final long NSURLErrorUnsupportedURL = 0xFFFFFFFFFFFFFC16L;
    @NInt @Generated public static final long NSURLErrorCannotFindHost = 0xFFFFFFFFFFFFFC15L;
    @NInt @Generated public static final long NSURLErrorCannotConnectToHost = 0xFFFFFFFFFFFFFC14L;
    @NInt @Generated public static final long NSURLErrorNetworkConnectionLost = 0xFFFFFFFFFFFFFC13L;
    @NInt @Generated public static final long NSURLErrorDNSLookupFailed = 0xFFFFFFFFFFFFFC12L;
    @NInt @Generated public static final long NSURLErrorHTTPTooManyRedirects = 0xFFFFFFFFFFFFFC11L;
    @NInt @Generated public static final long NSURLErrorResourceUnavailable = 0xFFFFFFFFFFFFFC10L;
    @NInt @Generated public static final long NSURLErrorNotConnectedToInternet = 0xFFFFFFFFFFFFFC0FL;
    @NInt @Generated public static final long NSURLErrorRedirectToNonExistentLocation = 0xFFFFFFFFFFFFFC0EL;
    @NInt @Generated public static final long NSURLErrorBadServerResponse = 0xFFFFFFFFFFFFFC0DL;
    @NInt @Generated public static final long NSURLErrorUserCancelledAuthentication = 0xFFFFFFFFFFFFFC0CL;
    @NInt @Generated public static final long NSURLErrorUserAuthenticationRequired = 0xFFFFFFFFFFFFFC0BL;
    @NInt @Generated public static final long NSURLErrorZeroByteResource = 0xFFFFFFFFFFFFFC0AL;
    @NInt @Generated public static final long NSURLErrorCannotDecodeRawData = 0xFFFFFFFFFFFFFC09L;
    @NInt @Generated public static final long NSURLErrorCannotDecodeContentData = 0xFFFFFFFFFFFFFC08L;
    @NInt @Generated public static final long NSURLErrorCannotParseResponse = 0xFFFFFFFFFFFFFC07L;
    @NInt @Generated public static final long NSURLErrorFileDoesNotExist = 0xFFFFFFFFFFFFFBB4L;
    @NInt @Generated public static final long NSURLErrorFileIsDirectory = 0xFFFFFFFFFFFFFBB3L;
    @NInt @Generated public static final long NSURLErrorNoPermissionsToReadFile = 0xFFFFFFFFFFFFFBB2L;
    @NInt @Generated public static final long NSURLErrorDataLengthExceedsMaximum = 0xFFFFFFFFFFFFFBB1L;
    @NInt @Generated public static final long NSURLErrorSecureConnectionFailed = 0xFFFFFFFFFFFFFB50L;
    @NInt @Generated public static final long NSURLErrorServerCertificateHasBadDate = 0xFFFFFFFFFFFFFB4FL;
    @NInt @Generated public static final long NSURLErrorServerCertificateUntrusted = 0xFFFFFFFFFFFFFB4EL;
    @NInt @Generated public static final long NSURLErrorServerCertificateHasUnknownRoot = 0xFFFFFFFFFFFFFB4DL;
    @NInt @Generated public static final long NSURLErrorServerCertificateNotYetValid = 0xFFFFFFFFFFFFFB4CL;
    @NInt @Generated public static final long NSURLErrorClientCertificateRejected = 0xFFFFFFFFFFFFFB4BL;
    @NInt @Generated public static final long NSURLErrorClientCertificateRequired = 0xFFFFFFFFFFFFFB4AL;
    @NInt @Generated public static final long NSURLErrorCannotLoadFromNetwork = 0xFFFFFFFFFFFFF830L;
    @NInt @Generated public static final long NSURLErrorCannotCreateFile = 0xFFFFFFFFFFFFF448L;
    @NInt @Generated public static final long NSURLErrorCannotOpenFile = 0xFFFFFFFFFFFFF447L;
    @NInt @Generated public static final long NSURLErrorCannotCloseFile = 0xFFFFFFFFFFFFF446L;
    @NInt @Generated public static final long NSURLErrorCannotWriteToFile = 0xFFFFFFFFFFFFF445L;
    @NInt @Generated public static final long NSURLErrorCannotRemoveFile = 0xFFFFFFFFFFFFF444L;
    @NInt @Generated public static final long NSURLErrorCannotMoveFile = 0xFFFFFFFFFFFFF443L;
    @NInt @Generated public static final long NSURLErrorDownloadDecodingFailedMidStream = 0xFFFFFFFFFFFFF442L;
    @NInt @Generated public static final long NSURLErrorDownloadDecodingFailedToComplete = 0xFFFFFFFFFFFFF441L;
    @NInt @Generated public static final long NSURLErrorInternationalRoamingOff = 0xFFFFFFFFFFFFFC06L;
    @NInt @Generated public static final long NSURLErrorCallIsActive = 0xFFFFFFFFFFFFFC05L;
    @NInt @Generated public static final long NSURLErrorDataNotAllowed = 0xFFFFFFFFFFFFFC04L;
    @NInt @Generated public static final long NSURLErrorRequestBodyStreamExhausted = 0xFFFFFFFFFFFFFC03L;
    @NInt @Generated public static final long NSURLErrorBackgroundSessionRequiresSharedContainer = 0xFFFFFFFFFFFFFC1DL;
    @NInt @Generated public static final long NSURLErrorBackgroundSessionInUseByAnotherProcess = 0xFFFFFFFFFFFFFC1CL;
    @NInt @Generated public static final long NSURLErrorBackgroundSessionWasDisconnected = 0xFFFFFFFFFFFFFC1BL;
    @Generated public static final int NSWrapCalendarComponents = 0x00000001;
    @Generated public static final int NSOpenStepUnicodeReservedBase = 0x0000F400;
    @Generated public static final long NSTextCheckingAllSystemTypes = 0x00000000FFFFFFFFL;
    @Generated public static final long NSTextCheckingAllCustomTypes = 0xFFFFFFFF00000000L;
    @Generated public static final long NSTextCheckingAllTypes = 0xFFFFFFFFFFFFFFFFL;
    @NUInt @Generated public static final long NSProprietaryStringEncoding = 0x0000000000010000L;
    @Generated public static final int NSWindowsNTOperatingSystem = 0x00000001;
    @Generated public static final int NSWindows95OperatingSystem = 0x00000002;
    @Generated public static final int NSSolarisOperatingSystem = 0x00000003;
    @Generated public static final int NSHPUXOperatingSystem = 0x00000004;
    @Generated public static final int NSMACHOperatingSystem = 0x00000005;
    @Generated public static final int NSSunOSOperatingSystem = 0x00000006;
    @Generated public static final int NSOSF1OperatingSystem = 0x00000007;
    @NInt @Generated public static final long NSFileNoSuchFileError = 0x0000000000000004L;
    @NInt @Generated public static final long NSFileLockingError = 0x00000000000000FFL;
    @NInt @Generated public static final long NSFileReadUnknownError = 0x0000000000000100L;
    @NInt @Generated public static final long NSFileReadNoPermissionError = 0x0000000000000101L;
    @NInt @Generated public static final long NSFileReadInvalidFileNameError = 0x0000000000000102L;
    @NInt @Generated public static final long NSFileReadCorruptFileError = 0x0000000000000103L;
    @NInt @Generated public static final long NSFileReadNoSuchFileError = 0x0000000000000104L;
    @NInt @Generated public static final long NSFileReadInapplicableStringEncodingError = 0x0000000000000105L;
    @NInt @Generated public static final long NSFileReadUnsupportedSchemeError = 0x0000000000000106L;
    @NInt @Generated public static final long NSFileReadTooLargeError = 0x0000000000000107L;
    @NInt @Generated public static final long NSFileReadUnknownStringEncodingError = 0x0000000000000108L;
    @NInt @Generated public static final long NSFileWriteUnknownError = 0x0000000000000200L;
    @NInt @Generated public static final long NSFileWriteNoPermissionError = 0x0000000000000201L;
    @NInt @Generated public static final long NSFileWriteInvalidFileNameError = 0x0000000000000202L;
    @NInt @Generated public static final long NSFileWriteFileExistsError = 0x0000000000000204L;
    @NInt @Generated public static final long NSFileWriteInapplicableStringEncodingError = 0x0000000000000205L;
    @NInt @Generated public static final long NSFileWriteUnsupportedSchemeError = 0x0000000000000206L;
    @NInt @Generated public static final long NSFileWriteOutOfSpaceError = 0x0000000000000280L;
    @NInt @Generated public static final long NSFileWriteVolumeReadOnlyError = 0x0000000000000282L;
    @NInt @Generated public static final long NSKeyValueValidationError = 0x0000000000000400L;
    @NInt @Generated public static final long NSFormattingError = 0x0000000000000800L;
    @NInt @Generated public static final long NSUserCancelledError = 0x0000000000000C00L;
    @NInt @Generated public static final long NSFeatureUnsupportedError = 0x0000000000000D00L;
    @NInt @Generated public static final long NSExecutableNotLoadableError = 0x0000000000000E00L;
    @NInt @Generated public static final long NSExecutableArchitectureMismatchError = 0x0000000000000E01L;
    @NInt @Generated public static final long NSExecutableRuntimeMismatchError = 0x0000000000000E02L;
    @NInt @Generated public static final long NSExecutableLoadError = 0x0000000000000E03L;
    @NInt @Generated public static final long NSExecutableLinkError = 0x0000000000000E04L;
    @NInt @Generated public static final long NSFileErrorMinimum = 0x0000000000000000L;
    @NInt @Generated public static final long NSFileErrorMaximum = 0x00000000000003FFL;
    @NInt @Generated public static final long NSValidationErrorMinimum = 0x0000000000000400L;
    @NInt @Generated public static final long NSValidationErrorMaximum = 0x00000000000007FFL;
    @NInt @Generated public static final long NSExecutableErrorMinimum = 0x0000000000000E00L;
    @NInt @Generated public static final long NSExecutableErrorMaximum = 0x0000000000000EFFL;
    @NInt @Generated public static final long NSFormattingErrorMinimum = 0x0000000000000800L;
    @NInt @Generated public static final long NSFormattingErrorMaximum = 0x00000000000009FFL;
    @NInt @Generated public static final long NSPropertyListReadCorruptError = 0x0000000000000F00L;
    @NInt @Generated public static final long NSPropertyListReadUnknownVersionError = 0x0000000000000F01L;
    @NInt @Generated public static final long NSPropertyListReadStreamError = 0x0000000000000F02L;
    @NInt @Generated public static final long NSPropertyListWriteStreamError = 0x0000000000000F0BL;
    @NInt @Generated public static final long NSPropertyListWriteInvalidError = 0x0000000000000F0CL;
    @NInt @Generated public static final long NSPropertyListErrorMinimum = 0x0000000000000F00L;
    @NInt @Generated public static final long NSPropertyListErrorMaximum = 0x0000000000000FFFL;
    @NInt @Generated public static final long NSXPCConnectionInterrupted = 0x0000000000001001L;
    @NInt @Generated public static final long NSXPCConnectionInvalid = 0x0000000000001003L;
    @NInt @Generated public static final long NSXPCConnectionReplyInvalid = 0x0000000000001005L;
    @NInt @Generated public static final long NSXPCConnectionErrorMinimum = 0x0000000000001000L;
    @NInt @Generated public static final long NSXPCConnectionErrorMaximum = 0x0000000000001080L;
    @NInt @Generated public static final long NSUbiquitousFileUnavailableError = 0x0000000000001101L;
    @NInt @Generated public static final long NSUbiquitousFileNotUploadedDueToQuotaError = 0x0000000000001102L;
    @NInt @Generated public static final long NSUbiquitousFileUbiquityServerNotAvailable = 0x0000000000001103L;
    @NInt @Generated public static final long NSUbiquitousFileErrorMinimum = 0x0000000000001100L;
    @NInt @Generated public static final long NSUbiquitousFileErrorMaximum = 0x00000000000011FFL;
    @NInt @Generated public static final long NSUserActivityHandoffFailedError = 0x0000000000001200L;
    @NInt @Generated public static final long NSUserActivityConnectionUnavailableError = 0x0000000000001201L;
    @NInt @Generated public static final long NSUserActivityRemoteApplicationTimedOutError = 0x0000000000001202L;
    @NInt @Generated public static final long NSUserActivityHandoffUserInfoTooLargeError = 0x0000000000001203L;
    @NInt @Generated public static final long NSUserActivityErrorMinimum = 0x0000000000001200L;
    @NInt @Generated public static final long NSUserActivityErrorMaximum = 0x00000000000012FFL;
    @NInt @Generated public static final long NSDateComponentUndefined = org.moe.natj.general.NatJ.is64Bit() ?
            0x7FFFFFFFFFFFFFFFL :
            0x000000007FFFFFFFL;
    @NInt @Generated public static final long NSUndefinedDateComponent = org.moe.natj.general.NatJ.is64Bit() ?
            0x7FFFFFFFFFFFFFFFL :
            0x000000007FFFFFFFL;
    @Generated @NInt public static final long NSURLErrorAppTransportSecurityRequiresSecureConnection = 0xFFFFFFFFFFFFFC02L;
    @Generated @NInt public static final long NSCoderReadCorruptError = 0x0000000000001300L;
    @Generated @NInt public static final long NSCoderValueNotFoundError = 0x0000000000001301L;
    @Generated @NInt public static final long NSCoderErrorMinimum = 0x0000000000001300L;
    @Generated @NInt public static final long NSCoderErrorMaximum = 0x000000000000137FL;
    @Generated @NInt public static final long NSBundleErrorMinimum = 0x0000000000001380L;
    @Generated @NInt public static final long NSBundleErrorMaximum = 0x00000000000013FFL;
    @Generated @NInt public static final long NSBundleOnDemandResourceOutOfSpaceError = 0x0000000000001380L;
    @Generated @NInt public static final long NSBundleOnDemandResourceExceededMaximumSizeError = 0x0000000000001381L;
    @Generated @NInt public static final long NSBundleOnDemandResourceInvalidTagError = 0x0000000000001382L;
}
