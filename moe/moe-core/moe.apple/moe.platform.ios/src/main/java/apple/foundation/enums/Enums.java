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
    @Generated @NInt public static final long NSUbiquitousKeyValueStoreServerChange = 0x0000000000000000L;
    @Generated @NInt public static final long NSUbiquitousKeyValueStoreInitialSyncChange = 0x0000000000000001L;
    @Generated @NInt public static final long NSUbiquitousKeyValueStoreQuotaViolationChange = 0x0000000000000002L;
    @Generated @NInt public static final long NSUbiquitousKeyValueStoreAccountChange = 0x0000000000000003L;
    @Generated public static final long NSTextCheckingAllSystemTypes = 0x00000000FFFFFFFFL;
    @Generated public static final long NSTextCheckingAllCustomTypes = 0xFFFFFFFF00000000L;
    @Generated public static final long NSTextCheckingAllTypes = 0xFFFFFFFFFFFFFFFFL;
    @Generated public static final int NSWindowsNTOperatingSystem = 0x00000001;
    @Generated public static final int NSWindows95OperatingSystem = 0x00000002;
    @Generated public static final int NSSolarisOperatingSystem = 0x00000003;
    @Generated public static final int NSHPUXOperatingSystem = 0x00000004;
    @Generated public static final int NSMACHOperatingSystem = 0x00000005;
    @Generated public static final int NSSunOSOperatingSystem = 0x00000006;
    @Generated public static final int NSOSF1OperatingSystem = 0x00000007;
    @Generated @NUInt public static final long NSASCIIStringEncoding = 0x0000000000000001L;
    @Generated @NUInt public static final long NSNEXTSTEPStringEncoding = 0x0000000000000002L;
    @Generated @NUInt public static final long NSJapaneseEUCStringEncoding = 0x0000000000000003L;
    @Generated @NUInt public static final long NSUTF8StringEncoding = 0x0000000000000004L;
    @Generated @NUInt public static final long NSISOLatin1StringEncoding = 0x0000000000000005L;
    @Generated @NUInt public static final long NSSymbolStringEncoding = 0x0000000000000006L;
    @Generated @NUInt public static final long NSNonLossyASCIIStringEncoding = 0x0000000000000007L;
    @Generated @NUInt public static final long NSShiftJISStringEncoding = 0x0000000000000008L;
    @Generated @NUInt public static final long NSISOLatin2StringEncoding = 0x0000000000000009L;
    @Generated @NUInt public static final long NSUnicodeStringEncoding = 0x000000000000000AL;
    @Generated @NUInt public static final long NSWindowsCP1251StringEncoding = 0x000000000000000BL;
    @Generated @NUInt public static final long NSWindowsCP1252StringEncoding = 0x000000000000000CL;
    @Generated @NUInt public static final long NSWindowsCP1253StringEncoding = 0x000000000000000DL;
    @Generated @NUInt public static final long NSWindowsCP1254StringEncoding = 0x000000000000000EL;
    @Generated @NUInt public static final long NSWindowsCP1250StringEncoding = 0x000000000000000FL;
    @Generated @NUInt public static final long NSISO2022JPStringEncoding = 0x0000000000000015L;
    @Generated @NUInt public static final long NSMacOSRomanStringEncoding = 0x000000000000001EL;
    @Generated @NUInt public static final long NSUTF16StringEncoding = 0x000000000000000AL;
    @Generated @NUInt public static final long NSUTF16BigEndianStringEncoding = 0x0000000090000100L;
    @Generated @NUInt public static final long NSUTF16LittleEndianStringEncoding = 0x0000000094000100L;
    @Generated @NUInt public static final long NSUTF32StringEncoding = 0x000000008C000100L;
    @Generated @NUInt public static final long NSUTF32BigEndianStringEncoding = 0x0000000098000100L;
    @Generated @NUInt public static final long NSUTF32LittleEndianStringEncoding = 0x000000009C000100L;
    @Generated @NUInt public static final long NSProprietaryStringEncoding = 0x0000000000010000L;
    @Generated public static final int NSBundleExecutableArchitectureI386 = 0x00000007;
    @Generated public static final int NSBundleExecutableArchitecturePPC = 0x00000012;
    @Generated public static final int NSBundleExecutableArchitectureX86_64 = 0x01000007;
    @Generated public static final int NSBundleExecutableArchitecturePPC64 = 0x01000012;
    @Generated public static final int NSOpenStepUnicodeReservedBase = 0x0000F400;
    @Generated public static final int NSWrapCalendarComponents = 0x00000001;
    @Generated public static final int NS_UnknownByteOrder = 0x00000000;
    @Generated public static final int NS_LittleEndian = 0x00000001;
    @Generated public static final int NS_BigEndian = 0x00000002;
    @Generated @NInt public static final long NSDateComponentUndefined = org.moe.natj.general.NatJ.is64Bit() ?
            0x7FFFFFFFFFFFFFFFL :
            0x000000007FFFFFFFL;
    @Generated @NInt public static final long NSUndefinedDateComponent = org.moe.natj.general.NatJ.is64Bit() ?
            0x7FFFFFFFFFFFFFFFL :
            0x000000007FFFFFFFL;
    @Generated @NInt public static final long NSURLErrorCancelledReasonUserForceQuitApplication = 0x0000000000000000L;
    @Generated @NInt public static final long NSURLErrorCancelledReasonBackgroundUpdatesDisabled = 0x0000000000000001L;
    @Generated @NInt public static final long NSURLErrorCancelledReasonInsufficientSystemResources = 0x0000000000000002L;
    @Generated @NInt public static final long NSFileNoSuchFileError = 0x0000000000000004L;
    @Generated @NInt public static final long NSFileLockingError = 0x00000000000000FFL;
    @Generated @NInt public static final long NSFileReadUnknownError = 0x0000000000000100L;
    @Generated @NInt public static final long NSFileReadNoPermissionError = 0x0000000000000101L;
    @Generated @NInt public static final long NSFileReadInvalidFileNameError = 0x0000000000000102L;
    @Generated @NInt public static final long NSFileReadCorruptFileError = 0x0000000000000103L;
    @Generated @NInt public static final long NSFileReadNoSuchFileError = 0x0000000000000104L;
    @Generated @NInt public static final long NSFileReadInapplicableStringEncodingError = 0x0000000000000105L;
    @Generated @NInt public static final long NSFileReadUnsupportedSchemeError = 0x0000000000000106L;
    @Generated @NInt public static final long NSFileReadTooLargeError = 0x0000000000000107L;
    @Generated @NInt public static final long NSFileReadUnknownStringEncodingError = 0x0000000000000108L;
    @Generated @NInt public static final long NSFileWriteUnknownError = 0x0000000000000200L;
    @Generated @NInt public static final long NSFileWriteNoPermissionError = 0x0000000000000201L;
    @Generated @NInt public static final long NSFileWriteInvalidFileNameError = 0x0000000000000202L;
    @Generated @NInt public static final long NSFileWriteFileExistsError = 0x0000000000000204L;
    @Generated @NInt public static final long NSFileWriteInapplicableStringEncodingError = 0x0000000000000205L;
    @Generated @NInt public static final long NSFileWriteUnsupportedSchemeError = 0x0000000000000206L;
    @Generated @NInt public static final long NSFileWriteOutOfSpaceError = 0x0000000000000280L;
    @Generated @NInt public static final long NSFileWriteVolumeReadOnlyError = 0x0000000000000282L;
    @Generated @NInt public static final long NSKeyValueValidationError = 0x0000000000000400L;
    @Generated @NInt public static final long NSFormattingError = 0x0000000000000800L;
    @Generated @NInt public static final long NSUserCancelledError = 0x0000000000000C00L;
    @Generated @NInt public static final long NSFeatureUnsupportedError = 0x0000000000000D00L;
    @Generated @NInt public static final long NSExecutableNotLoadableError = 0x0000000000000E00L;
    @Generated @NInt public static final long NSExecutableArchitectureMismatchError = 0x0000000000000E01L;
    @Generated @NInt public static final long NSExecutableRuntimeMismatchError = 0x0000000000000E02L;
    @Generated @NInt public static final long NSExecutableLoadError = 0x0000000000000E03L;
    @Generated @NInt public static final long NSExecutableLinkError = 0x0000000000000E04L;
    @Generated @NInt public static final long NSFileErrorMinimum = 0x0000000000000000L;
    @Generated @NInt public static final long NSFileErrorMaximum = 0x00000000000003FFL;
    @Generated @NInt public static final long NSValidationErrorMinimum = 0x0000000000000400L;
    @Generated @NInt public static final long NSValidationErrorMaximum = 0x00000000000007FFL;
    @Generated @NInt public static final long NSExecutableErrorMinimum = 0x0000000000000E00L;
    @Generated @NInt public static final long NSExecutableErrorMaximum = 0x0000000000000EFFL;
    @Generated @NInt public static final long NSFormattingErrorMinimum = 0x0000000000000800L;
    @Generated @NInt public static final long NSFormattingErrorMaximum = 0x00000000000009FFL;
    @Generated @NInt public static final long NSPropertyListReadCorruptError = 0x0000000000000F00L;
    @Generated @NInt public static final long NSPropertyListReadUnknownVersionError = 0x0000000000000F01L;
    @Generated @NInt public static final long NSPropertyListReadStreamError = 0x0000000000000F02L;
    @Generated @NInt public static final long NSPropertyListWriteStreamError = 0x0000000000000F0BL;
    @Generated @NInt public static final long NSPropertyListWriteInvalidError = 0x0000000000000F0CL;
    @Generated @NInt public static final long NSPropertyListErrorMinimum = 0x0000000000000F00L;
    @Generated @NInt public static final long NSPropertyListErrorMaximum = 0x0000000000000FFFL;
    @Generated @NInt public static final long NSXPCConnectionInterrupted = 0x0000000000001001L;
    @Generated @NInt public static final long NSXPCConnectionInvalid = 0x0000000000001003L;
    @Generated @NInt public static final long NSXPCConnectionReplyInvalid = 0x0000000000001005L;
    @Generated @NInt public static final long NSXPCConnectionErrorMinimum = 0x0000000000001000L;
    @Generated @NInt public static final long NSXPCConnectionErrorMaximum = 0x0000000000001080L;
    @Generated @NInt public static final long NSUbiquitousFileUnavailableError = 0x0000000000001101L;
    @Generated @NInt public static final long NSUbiquitousFileNotUploadedDueToQuotaError = 0x0000000000001102L;
    @Generated @NInt public static final long NSUbiquitousFileUbiquityServerNotAvailable = 0x0000000000001103L;
    @Generated @NInt public static final long NSUbiquitousFileErrorMinimum = 0x0000000000001100L;
    @Generated @NInt public static final long NSUbiquitousFileErrorMaximum = 0x00000000000011FFL;
    @Generated @NInt public static final long NSUserActivityHandoffFailedError = 0x0000000000001200L;
    @Generated @NInt public static final long NSUserActivityConnectionUnavailableError = 0x0000000000001201L;
    @Generated @NInt public static final long NSUserActivityRemoteApplicationTimedOutError = 0x0000000000001202L;
    @Generated @NInt public static final long NSUserActivityHandoffUserInfoTooLargeError = 0x0000000000001203L;
    @Generated @NInt public static final long NSUserActivityErrorMinimum = 0x0000000000001200L;
    @Generated @NInt public static final long NSUserActivityErrorMaximum = 0x00000000000012FFL;
    @Generated @NInt public static final long NSCoderReadCorruptError = 0x0000000000001300L;
    @Generated @NInt public static final long NSCoderValueNotFoundError = 0x0000000000001301L;
    @Generated @NInt public static final long NSCoderErrorMinimum = 0x0000000000001300L;
    @Generated @NInt public static final long NSCoderErrorMaximum = 0x000000000000137FL;
    @Generated @NInt public static final long NSBundleErrorMinimum = 0x0000000000001380L;
    @Generated @NInt public static final long NSBundleErrorMaximum = 0x00000000000013FFL;
    @Generated @NInt public static final long NSBundleOnDemandResourceOutOfSpaceError = 0x0000000000001380L;
    @Generated @NInt public static final long NSBundleOnDemandResourceExceededMaximumSizeError = 0x0000000000001381L;
    @Generated @NInt public static final long NSBundleOnDemandResourceInvalidTagError = 0x0000000000001382L;
    @Generated @NInt public static final long NSCloudSharingNetworkFailureError = 0x0000000000001400L;
    @Generated @NInt public static final long NSCloudSharingQuotaExceededError = 0x0000000000001401L;
    @Generated @NInt public static final long NSCloudSharingTooManyParticipantsError = 0x0000000000001402L;
    @Generated @NInt public static final long NSCloudSharingConflictError = 0x0000000000001403L;
    @Generated @NInt public static final long NSCloudSharingNoPermissionError = 0x0000000000001404L;
    @Generated @NInt public static final long NSCloudSharingOtherError = 0x00000000000014FFL;
    @Generated @NInt public static final long NSCloudSharingErrorMinimum = 0x0000000000001400L;
    @Generated @NInt public static final long NSCloudSharingErrorMaximum = 0x00000000000014FFL;
    @Generated @NInt public static final long NSURLErrorUnknown = 0xFFFFFFFFFFFFFFFFL;
    @Generated @NInt public static final long NSURLErrorCancelled = 0xFFFFFFFFFFFFFC19L;
    @Generated @NInt public static final long NSURLErrorBadURL = 0xFFFFFFFFFFFFFC18L;
    @Generated @NInt public static final long NSURLErrorTimedOut = 0xFFFFFFFFFFFFFC17L;
    @Generated @NInt public static final long NSURLErrorUnsupportedURL = 0xFFFFFFFFFFFFFC16L;
    @Generated @NInt public static final long NSURLErrorCannotFindHost = 0xFFFFFFFFFFFFFC15L;
    @Generated @NInt public static final long NSURLErrorCannotConnectToHost = 0xFFFFFFFFFFFFFC14L;
    @Generated @NInt public static final long NSURLErrorNetworkConnectionLost = 0xFFFFFFFFFFFFFC13L;
    @Generated @NInt public static final long NSURLErrorDNSLookupFailed = 0xFFFFFFFFFFFFFC12L;
    @Generated @NInt public static final long NSURLErrorHTTPTooManyRedirects = 0xFFFFFFFFFFFFFC11L;
    @Generated @NInt public static final long NSURLErrorResourceUnavailable = 0xFFFFFFFFFFFFFC10L;
    @Generated @NInt public static final long NSURLErrorNotConnectedToInternet = 0xFFFFFFFFFFFFFC0FL;
    @Generated @NInt public static final long NSURLErrorRedirectToNonExistentLocation = 0xFFFFFFFFFFFFFC0EL;
    @Generated @NInt public static final long NSURLErrorBadServerResponse = 0xFFFFFFFFFFFFFC0DL;
    @Generated @NInt public static final long NSURLErrorUserCancelledAuthentication = 0xFFFFFFFFFFFFFC0CL;
    @Generated @NInt public static final long NSURLErrorUserAuthenticationRequired = 0xFFFFFFFFFFFFFC0BL;
    @Generated @NInt public static final long NSURLErrorZeroByteResource = 0xFFFFFFFFFFFFFC0AL;
    @Generated @NInt public static final long NSURLErrorCannotDecodeRawData = 0xFFFFFFFFFFFFFC09L;
    @Generated @NInt public static final long NSURLErrorCannotDecodeContentData = 0xFFFFFFFFFFFFFC08L;
    @Generated @NInt public static final long NSURLErrorCannotParseResponse = 0xFFFFFFFFFFFFFC07L;
    @Generated @NInt public static final long NSURLErrorAppTransportSecurityRequiresSecureConnection = 0xFFFFFFFFFFFFFC02L;
    @Generated @NInt public static final long NSURLErrorFileDoesNotExist = 0xFFFFFFFFFFFFFBB4L;
    @Generated @NInt public static final long NSURLErrorFileIsDirectory = 0xFFFFFFFFFFFFFBB3L;
    @Generated @NInt public static final long NSURLErrorNoPermissionsToReadFile = 0xFFFFFFFFFFFFFBB2L;
    @Generated @NInt public static final long NSURLErrorDataLengthExceedsMaximum = 0xFFFFFFFFFFFFFBB1L;
    @Generated @NInt public static final long NSURLErrorSecureConnectionFailed = 0xFFFFFFFFFFFFFB50L;
    @Generated @NInt public static final long NSURLErrorServerCertificateHasBadDate = 0xFFFFFFFFFFFFFB4FL;
    @Generated @NInt public static final long NSURLErrorServerCertificateUntrusted = 0xFFFFFFFFFFFFFB4EL;
    @Generated @NInt public static final long NSURLErrorServerCertificateHasUnknownRoot = 0xFFFFFFFFFFFFFB4DL;
    @Generated @NInt public static final long NSURLErrorServerCertificateNotYetValid = 0xFFFFFFFFFFFFFB4CL;
    @Generated @NInt public static final long NSURLErrorClientCertificateRejected = 0xFFFFFFFFFFFFFB4BL;
    @Generated @NInt public static final long NSURLErrorClientCertificateRequired = 0xFFFFFFFFFFFFFB4AL;
    @Generated @NInt public static final long NSURLErrorCannotLoadFromNetwork = 0xFFFFFFFFFFFFF830L;
    @Generated @NInt public static final long NSURLErrorCannotCreateFile = 0xFFFFFFFFFFFFF448L;
    @Generated @NInt public static final long NSURLErrorCannotOpenFile = 0xFFFFFFFFFFFFF447L;
    @Generated @NInt public static final long NSURLErrorCannotCloseFile = 0xFFFFFFFFFFFFF446L;
    @Generated @NInt public static final long NSURLErrorCannotWriteToFile = 0xFFFFFFFFFFFFF445L;
    @Generated @NInt public static final long NSURLErrorCannotRemoveFile = 0xFFFFFFFFFFFFF444L;
    @Generated @NInt public static final long NSURLErrorCannotMoveFile = 0xFFFFFFFFFFFFF443L;
    @Generated @NInt public static final long NSURLErrorDownloadDecodingFailedMidStream = 0xFFFFFFFFFFFFF442L;
    @Generated @NInt public static final long NSURLErrorDownloadDecodingFailedToComplete = 0xFFFFFFFFFFFFF441L;
    @Generated @NInt public static final long NSURLErrorInternationalRoamingOff = 0xFFFFFFFFFFFFFC06L;
    @Generated @NInt public static final long NSURLErrorCallIsActive = 0xFFFFFFFFFFFFFC05L;
    @Generated @NInt public static final long NSURLErrorDataNotAllowed = 0xFFFFFFFFFFFFFC04L;
    @Generated @NInt public static final long NSURLErrorRequestBodyStreamExhausted = 0xFFFFFFFFFFFFFC03L;
    @Generated @NInt public static final long NSURLErrorBackgroundSessionRequiresSharedContainer = 0xFFFFFFFFFFFFFC1DL;
    @Generated @NInt public static final long NSURLErrorBackgroundSessionInUseByAnotherProcess = 0xFFFFFFFFFFFFFC1CL;
    @Generated @NInt public static final long NSURLErrorBackgroundSessionWasDisconnected = 0xFFFFFFFFFFFFFC1BL;

    @Generated
    private Enums() {
    }

    @Generated @NInt public static final long NSURLErrorFileOutsideSafeArea = 0xFFFFFFFFFFFFFBB0L;
    @Generated @NInt public static final long NSCoderInvalidValueError = 0x0000000000001302L;
    @Generated @NInt public static final long NSCompressionFailedError = 0x0000000000001500L;
    @Generated @NInt public static final long NSDecompressionFailedError = 0x0000000000001501L;
    @Generated @NInt public static final long NSCompressionErrorMinimum = 0x0000000000001500L;
    @Generated @NInt public static final long NSCompressionErrorMaximum = 0x000000000000157FL;
    @Generated public static final int NSBundleExecutableArchitectureARM64 = 0x0100000C;
}
