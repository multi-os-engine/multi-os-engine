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
    /**
     * the first 32 types are reserved
     */
    @Generated public static final long NSTextCheckingAllSystemTypes = 0x00000000FFFFFFFFL;
    /**
     * clients may use the remainder for their own purposes
     */
    @Generated public static final long NSTextCheckingAllCustomTypes = 0xFFFFFFFF00000000L;
    @Generated public static final long NSTextCheckingAllTypes = 0xFFFFFFFFFFFFFFFFL;
    @Deprecated @Generated public static final int NSWindowsNTOperatingSystem = 0x00000001;
    @Deprecated @Generated public static final int NSWindows95OperatingSystem = 0x00000002;
    @Deprecated @Generated public static final int NSSolarisOperatingSystem = 0x00000003;
    @Deprecated @Generated public static final int NSHPUXOperatingSystem = 0x00000004;
    @Deprecated @Generated public static final int NSMACHOperatingSystem = 0x00000005;
    @Deprecated @Generated public static final int NSSunOSOperatingSystem = 0x00000006;
    @Deprecated @Generated public static final int NSOSF1OperatingSystem = 0x00000007;
    /**
     * 0..127 only
     */
    @Generated @NUInt public static final long NSASCIIStringEncoding = 0x0000000000000001L;
    @Generated @NUInt public static final long NSNEXTSTEPStringEncoding = 0x0000000000000002L;
    @Generated @NUInt public static final long NSJapaneseEUCStringEncoding = 0x0000000000000003L;
    @Generated @NUInt public static final long NSUTF8StringEncoding = 0x0000000000000004L;
    @Generated @NUInt public static final long NSISOLatin1StringEncoding = 0x0000000000000005L;
    @Generated @NUInt public static final long NSSymbolStringEncoding = 0x0000000000000006L;
    @Generated @NUInt public static final long NSNonLossyASCIIStringEncoding = 0x0000000000000007L;
    /**
     * kCFStringEncodingDOSJapanese
     */
    @Generated @NUInt public static final long NSShiftJISStringEncoding = 0x0000000000000008L;
    @Generated @NUInt public static final long NSISOLatin2StringEncoding = 0x0000000000000009L;
    @Generated @NUInt public static final long NSUnicodeStringEncoding = 0x000000000000000AL;
    /**
     * Cyrillic; same as AdobeStandardCyrillic
     */
    @Generated @NUInt public static final long NSWindowsCP1251StringEncoding = 0x000000000000000BL;
    /**
     * WinLatin1
     */
    @Generated @NUInt public static final long NSWindowsCP1252StringEncoding = 0x000000000000000CL;
    /**
     * Greek
     */
    @Generated @NUInt public static final long NSWindowsCP1253StringEncoding = 0x000000000000000DL;
    /**
     * Turkish
     */
    @Generated @NUInt public static final long NSWindowsCP1254StringEncoding = 0x000000000000000EL;
    /**
     * WinLatin2
     */
    @Generated @NUInt public static final long NSWindowsCP1250StringEncoding = 0x000000000000000FL;
    /**
     * ISO 2022 Japanese encoding for e-mail
     */
    @Generated @NUInt public static final long NSISO2022JPStringEncoding = 0x0000000000000015L;
    @Generated @NUInt public static final long NSMacOSRomanStringEncoding = 0x000000000000001EL;
    /**
     * An alias for NSUnicodeStringEncoding
     */
    @Generated @NUInt public static final long NSUTF16StringEncoding = 0x000000000000000AL;
    /**
     * NSUTF16StringEncoding encoding with explicit endianness specified
     */
    @Generated @NUInt public static final long NSUTF16BigEndianStringEncoding = 0x0000000090000100L;
    /**
     * NSUTF16StringEncoding encoding with explicit endianness specified
     */
    @Generated @NUInt public static final long NSUTF16LittleEndianStringEncoding = 0x0000000094000100L;
    @Generated @NUInt public static final long NSUTF32StringEncoding = 0x000000008C000100L;
    /**
     * NSUTF32StringEncoding encoding with explicit endianness specified
     */
    @Generated @NUInt public static final long NSUTF32BigEndianStringEncoding = 0x0000000098000100L;
    /**
     * NSUTF32StringEncoding encoding with explicit endianness specified
     */
    @Generated @NUInt public static final long NSUTF32LittleEndianStringEncoding = 0x000000009C000100L;
    /**
     * Installation-specific encoding
     */
    @Generated @NUInt public static final long NSProprietaryStringEncoding = 0x0000000000010000L;
    @Generated public static final int NSBundleExecutableArchitectureI386 = 0x00000007;
    @Generated public static final int NSBundleExecutableArchitecturePPC = 0x00000012;
    @Generated public static final int NSBundleExecutableArchitectureX86_64 = 0x01000007;
    @Generated public static final int NSBundleExecutableArchitecturePPC64 = 0x01000012;
    @Generated public static final int NSOpenStepUnicodeReservedBase = 0x0000F400;
    @Deprecated @Generated public static final int NSWrapCalendarComponents = 0x00000001;
    @Generated public static final int NS_UnknownByteOrder = 0x00000000;
    @Generated public static final int NS_LittleEndian = 0x00000001;
    @Generated public static final int NS_BigEndian = 0x00000002;
    @Generated @NInt public static final long NSDateComponentUndefined = org.moe.natj.general.NatJ.is64Bit() ?
            0x7FFFFFFFFFFFFFFFL :
            0x000000007FFFFFFFL;
    @Deprecated @Generated @NInt public static final long NSUndefinedDateComponent = org.moe.natj.general.NatJ.is64Bit() ?
            0x7FFFFFFFFFFFFFFFL :
            0x000000007FFFFFFFL;
    @Generated @NInt public static final long NSURLErrorCancelledReasonUserForceQuitApplication = 0x0000000000000000L;
    @Generated @NInt public static final long NSURLErrorCancelledReasonBackgroundUpdatesDisabled = 0x0000000000000001L;
    @Generated @NInt public static final long NSURLErrorCancelledReasonInsufficientSystemResources = 0x0000000000000002L;
    /**
     * Attempt to do a file system operation on a non-existent file
     */
    @Generated @NInt public static final long NSFileNoSuchFileError = 0x0000000000000004L;
    /**
     * Couldn't get a lock on file
     */
    @Generated @NInt public static final long NSFileLockingError = 0x00000000000000FFL;
    /**
     * Read error (reason unknown)
     */
    @Generated @NInt public static final long NSFileReadUnknownError = 0x0000000000000100L;
    /**
     * Read error (permission problem)
     */
    @Generated @NInt public static final long NSFileReadNoPermissionError = 0x0000000000000101L;
    /**
     * Read error (invalid file name)
     */
    @Generated @NInt public static final long NSFileReadInvalidFileNameError = 0x0000000000000102L;
    /**
     * Read error (file corrupt, bad format, etc)
     */
    @Generated @NInt public static final long NSFileReadCorruptFileError = 0x0000000000000103L;
    /**
     * Read error (no such file)
     */
    @Generated @NInt public static final long NSFileReadNoSuchFileError = 0x0000000000000104L;
    /**
     * Read error (string encoding not applicable) also NSStringEncodingErrorKey
     */
    @Generated @NInt public static final long NSFileReadInapplicableStringEncodingError = 0x0000000000000105L;
    /**
     * Read error (unsupported URL scheme)
     */
    @Generated @NInt public static final long NSFileReadUnsupportedSchemeError = 0x0000000000000106L;
    /**
     * Read error (file too large)
     */
    @Generated @NInt public static final long NSFileReadTooLargeError = 0x0000000000000107L;
    /**
     * Read error (string encoding of file contents could not be determined)
     */
    @Generated @NInt public static final long NSFileReadUnknownStringEncodingError = 0x0000000000000108L;
    /**
     * Write error (reason unknown)
     */
    @Generated @NInt public static final long NSFileWriteUnknownError = 0x0000000000000200L;
    /**
     * Write error (permission problem)
     */
    @Generated @NInt public static final long NSFileWriteNoPermissionError = 0x0000000000000201L;
    /**
     * Write error (invalid file name)
     */
    @Generated @NInt public static final long NSFileWriteInvalidFileNameError = 0x0000000000000202L;
    /**
     * Write error (file exists)
     */
    @Generated @NInt public static final long NSFileWriteFileExistsError = 0x0000000000000204L;
    /**
     * Write error (string encoding not applicable) also NSStringEncodingErrorKey
     */
    @Generated @NInt public static final long NSFileWriteInapplicableStringEncodingError = 0x0000000000000205L;
    /**
     * Write error (unsupported URL scheme)
     */
    @Generated @NInt public static final long NSFileWriteUnsupportedSchemeError = 0x0000000000000206L;
    /**
     * Write error (out of disk space)
     */
    @Generated @NInt public static final long NSFileWriteOutOfSpaceError = 0x0000000000000280L;
    /**
     * Write error (readonly volume)
     */
    @Generated @NInt public static final long NSFileWriteVolumeReadOnlyError = 0x0000000000000282L;
    /**
     * KVC validation error
     */
    @Generated @NInt public static final long NSKeyValueValidationError = 0x0000000000000400L;
    /**
     * Formatting error
     */
    @Generated @NInt public static final long NSFormattingError = 0x0000000000000800L;
    /**
     * User cancelled operation (this one often doesn't deserve a panel and might be a good one to special case)
     */
    @Generated @NInt public static final long NSUserCancelledError = 0x0000000000000C00L;
    /**
     * Feature unsupported error
     */
    @Generated @NInt public static final long NSFeatureUnsupportedError = 0x0000000000000D00L;
    /**
     * Executable is of a type that is not loadable in the current process
     */
    @Generated @NInt public static final long NSExecutableNotLoadableError = 0x0000000000000E00L;
    /**
     * Executable does not provide an architecture compatible with the current process
     */
    @Generated @NInt public static final long NSExecutableArchitectureMismatchError = 0x0000000000000E01L;
    /**
     * Executable has Objective C runtime information incompatible with the current process
     */
    @Generated @NInt public static final long NSExecutableRuntimeMismatchError = 0x0000000000000E02L;
    /**
     * Executable cannot be loaded for some other reason, such as a problem with a library it depends on
     */
    @Generated @NInt public static final long NSExecutableLoadError = 0x0000000000000E03L;
    /**
     * Executable fails due to linking issues
     */
    @Generated @NInt public static final long NSExecutableLinkError = 0x0000000000000E04L;
    /**
     * Inclusive error range definitions, for checking future error codes
     */
    @Generated @NInt public static final long NSFileErrorMinimum = 0x0000000000000000L;
    /**
     * Inclusive error range definitions, for checking future error codes
     */
    @Generated @NInt public static final long NSFileErrorMaximum = 0x00000000000003FFL;
    /**
     * Inclusive error range definitions, for checking future error codes
     */
    @Generated @NInt public static final long NSValidationErrorMinimum = 0x0000000000000400L;
    /**
     * Inclusive error range definitions, for checking future error codes
     */
    @Generated @NInt public static final long NSValidationErrorMaximum = 0x00000000000007FFL;
    /**
     * Inclusive error range definitions, for checking future error codes
     */
    @Generated @NInt public static final long NSExecutableErrorMinimum = 0x0000000000000E00L;
    /**
     * Inclusive error range definitions, for checking future error codes
     */
    @Generated @NInt public static final long NSExecutableErrorMaximum = 0x0000000000000EFFL;
    /**
     * Inclusive error range definitions, for checking future error codes
     */
    @Generated @NInt public static final long NSFormattingErrorMinimum = 0x0000000000000800L;
    /**
     * Inclusive error range definitions, for checking future error codes
     */
    @Generated @NInt public static final long NSFormattingErrorMaximum = 0x00000000000009FFL;
    /**
     * Error parsing a property list
     */
    @Generated @NInt public static final long NSPropertyListReadCorruptError = 0x0000000000000F00L;
    /**
     * The version number in the property list is unknown
     */
    @Generated @NInt public static final long NSPropertyListReadUnknownVersionError = 0x0000000000000F01L;
    /**
     * Stream error reading a property list
     */
    @Generated @NInt public static final long NSPropertyListReadStreamError = 0x0000000000000F02L;
    /**
     * Stream error writing a property list
     */
    @Generated @NInt public static final long NSPropertyListWriteStreamError = 0x0000000000000F0BL;
    /**
     * Invalid property list object or invalid property list type specified when writing
     */
    @Generated @NInt public static final long NSPropertyListWriteInvalidError = 0x0000000000000F0CL;
    @Generated @NInt public static final long NSPropertyListErrorMinimum = 0x0000000000000F00L;
    @Generated @NInt public static final long NSPropertyListErrorMaximum = 0x0000000000000FFFL;
    @Generated @NInt public static final long NSXPCConnectionInterrupted = 0x0000000000001001L;
    @Generated @NInt public static final long NSXPCConnectionInvalid = 0x0000000000001003L;
    @Generated @NInt public static final long NSXPCConnectionReplyInvalid = 0x0000000000001005L;
    @Generated @NInt public static final long NSXPCConnectionErrorMinimum = 0x0000000000001000L;
    @Generated @NInt public static final long NSXPCConnectionErrorMaximum = 0x0000000000001080L;
    /**
     * NSURLUbiquitousItemDownloadingErrorKey contains an error with this code when the item has not been uploaded to iCloud by the other devices yet
     */
    @Generated @NInt public static final long NSUbiquitousFileUnavailableError = 0x0000000000001101L;
    /**
     * NSURLUbiquitousItemUploadingErrorKey contains an error with this code when the item has not been uploaded to iCloud because it would make the account go over-quota
     */
    @Generated @NInt public static final long NSUbiquitousFileNotUploadedDueToQuotaError = 0x0000000000001102L;
    /**
     * NSURLUbiquitousItemDownloadingErrorKey and NSURLUbiquitousItemUploadingErrorKey contain an error with this code when connecting to the iCloud servers failed
     */
    @Generated @NInt public static final long NSUbiquitousFileUbiquityServerNotAvailable = 0x0000000000001103L;
    @Generated @NInt public static final long NSUbiquitousFileErrorMinimum = 0x0000000000001100L;
    @Generated @NInt public static final long NSUbiquitousFileErrorMaximum = 0x00000000000011FFL;
    /**
     * The data for the user activity was not available (e.g. if the remote device became unavailable.)
     */
    @Generated @NInt public static final long NSUserActivityHandoffFailedError = 0x0000000000001200L;
    /**
     * The user activity could not be continued because a required connection was not available
     */
    @Generated @NInt public static final long NSUserActivityConnectionUnavailableError = 0x0000000000001201L;
    /**
     * The remote application failed to send data in time
     */
    @Generated @NInt public static final long NSUserActivityRemoteApplicationTimedOutError = 0x0000000000001202L;
    /**
     * The NSUserActivity userInfo dictionary was too large to receive
     */
    @Generated @NInt public static final long NSUserActivityHandoffUserInfoTooLargeError = 0x0000000000001203L;
    @Generated @NInt public static final long NSUserActivityErrorMinimum = 0x0000000000001200L;
    @Generated @NInt public static final long NSUserActivityErrorMaximum = 0x00000000000012FFL;
    /**
     * Error parsing data during decode
     */
    @Generated @NInt public static final long NSCoderReadCorruptError = 0x0000000000001300L;
    /**
     * Data requested was not found
     */
    @Generated @NInt public static final long NSCoderValueNotFoundError = 0x0000000000001301L;
    @Generated @NInt public static final long NSCoderErrorMinimum = 0x0000000000001300L;
    @Generated @NInt public static final long NSCoderErrorMaximum = 0x000000000000137FL;
    @Generated @NInt public static final long NSBundleErrorMinimum = 0x0000000000001380L;
    @Generated @NInt public static final long NSBundleErrorMaximum = 0x00000000000013FFL;
    /**
     * There was not enough space available to download the requested On Demand Resources.
     */
    @Generated @NInt public static final long NSBundleOnDemandResourceOutOfSpaceError = 0x0000000000001380L;
    /**
     * The application exceeded the amount of On Demand Resources content in use at one time
     */
    @Generated @NInt public static final long NSBundleOnDemandResourceExceededMaximumSizeError = 0x0000000000001381L;
    /**
     * The application specified a tag which the system could not find in the application tag manifest
     */
    @Generated @NInt public static final long NSBundleOnDemandResourceInvalidTagError = 0x0000000000001382L;
    /**
     * Sharing failed due to a network failure.
     */
    @Generated @NInt public static final long NSCloudSharingNetworkFailureError = 0x0000000000001400L;
    /**
     * The user doesn't have enough storage space available to share the requested items.
     */
    @Generated @NInt public static final long NSCloudSharingQuotaExceededError = 0x0000000000001401L;
    /**
     * Additional participants could not be added to the share, because the limit was reached.
     */
    @Generated @NInt public static final long NSCloudSharingTooManyParticipantsError = 0x0000000000001402L;
    /**
     * A conflict occurred while trying to save changes to the CKShare and/or root CKRecord. Respond to this error by first fetching the server's changes to the records, then either handle the conflict manually or present it, which will instruct the user to try the operation again.
     */
    @Generated @NInt public static final long NSCloudSharingConflictError = 0x0000000000001403L;
    /**
     * The current user doesn't have permission to perform the requested actions.
     */
    @Generated @NInt public static final long NSCloudSharingNoPermissionError = 0x0000000000001404L;
    /**
     * These errors may require application-specific responses. For CloudKit sharing, use the NSUnderlyingErrorKey, which is a CKErrorDomain error, to discover the specific error and refer to the CloudKit documentation for the proper response to these errors.
     */
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
    /**
     * SSL errors
     */
    @Generated @NInt public static final long NSURLErrorSecureConnectionFailed = 0xFFFFFFFFFFFFFB50L;
    /**
     * SSL errors
     */
    @Generated @NInt public static final long NSURLErrorServerCertificateHasBadDate = 0xFFFFFFFFFFFFFB4FL;
    /**
     * SSL errors
     */
    @Generated @NInt public static final long NSURLErrorServerCertificateUntrusted = 0xFFFFFFFFFFFFFB4EL;
    /**
     * SSL errors
     */
    @Generated @NInt public static final long NSURLErrorServerCertificateHasUnknownRoot = 0xFFFFFFFFFFFFFB4DL;
    /**
     * SSL errors
     */
    @Generated @NInt public static final long NSURLErrorServerCertificateNotYetValid = 0xFFFFFFFFFFFFFB4CL;
    /**
     * SSL errors
     */
    @Generated @NInt public static final long NSURLErrorClientCertificateRejected = 0xFFFFFFFFFFFFFB4BL;
    /**
     * SSL errors
     */
    @Generated @NInt public static final long NSURLErrorClientCertificateRequired = 0xFFFFFFFFFFFFFB4AL;
    /**
     * SSL errors
     */
    @Generated @NInt public static final long NSURLErrorCannotLoadFromNetwork = 0xFFFFFFFFFFFFF830L;
    /**
     * Download and file I/O errors
     */
    @Generated @NInt public static final long NSURLErrorCannotCreateFile = 0xFFFFFFFFFFFFF448L;
    /**
     * Download and file I/O errors
     */
    @Generated @NInt public static final long NSURLErrorCannotOpenFile = 0xFFFFFFFFFFFFF447L;
    /**
     * Download and file I/O errors
     */
    @Generated @NInt public static final long NSURLErrorCannotCloseFile = 0xFFFFFFFFFFFFF446L;
    /**
     * Download and file I/O errors
     */
    @Generated @NInt public static final long NSURLErrorCannotWriteToFile = 0xFFFFFFFFFFFFF445L;
    /**
     * Download and file I/O errors
     */
    @Generated @NInt public static final long NSURLErrorCannotRemoveFile = 0xFFFFFFFFFFFFF444L;
    /**
     * Download and file I/O errors
     */
    @Generated @NInt public static final long NSURLErrorCannotMoveFile = 0xFFFFFFFFFFFFF443L;
    /**
     * Download and file I/O errors
     */
    @Generated @NInt public static final long NSURLErrorDownloadDecodingFailedMidStream = 0xFFFFFFFFFFFFF442L;
    /**
     * Download and file I/O errors
     */
    @Generated @NInt public static final long NSURLErrorDownloadDecodingFailedToComplete = 0xFFFFFFFFFFFFF441L;
    /**
     * Download and file I/O errors
     */
    @Generated @NInt public static final long NSURLErrorInternationalRoamingOff = 0xFFFFFFFFFFFFFC06L;
    /**
     * Download and file I/O errors
     */
    @Generated @NInt public static final long NSURLErrorCallIsActive = 0xFFFFFFFFFFFFFC05L;
    /**
     * Download and file I/O errors
     */
    @Generated @NInt public static final long NSURLErrorDataNotAllowed = 0xFFFFFFFFFFFFFC04L;
    /**
     * Download and file I/O errors
     */
    @Generated @NInt public static final long NSURLErrorRequestBodyStreamExhausted = 0xFFFFFFFFFFFFFC03L;
    /**
     * Download and file I/O errors
     */
    @Generated @NInt public static final long NSURLErrorBackgroundSessionRequiresSharedContainer = 0xFFFFFFFFFFFFFC1DL;
    /**
     * Download and file I/O errors
     */
    @Generated @NInt public static final long NSURLErrorBackgroundSessionInUseByAnotherProcess = 0xFFFFFFFFFFFFFC1CL;
    /**
     * Download and file I/O errors
     */
    @Generated @NInt public static final long NSURLErrorBackgroundSessionWasDisconnected = 0xFFFFFFFFFFFFFC1BL;

    @Generated
    private Enums() {
    }

    @Generated @NInt public static final long NSURLErrorFileOutsideSafeArea = 0xFFFFFFFFFFFFFBB0L;
    /**
     * Data was not valid to encode
     */
    @Generated @NInt public static final long NSCoderInvalidValueError = 0x0000000000001302L;
    @Generated @NInt public static final long NSCompressionFailedError = 0x0000000000001500L;
    @Generated @NInt public static final long NSDecompressionFailedError = 0x0000000000001501L;
    @Generated @NInt public static final long NSCompressionErrorMinimum = 0x0000000000001500L;
    @Generated @NInt public static final long NSCompressionErrorMaximum = 0x000000000000157FL;
    @Generated public static final int NSBundleExecutableArchitectureARM64 = 0x0100000C;
}
