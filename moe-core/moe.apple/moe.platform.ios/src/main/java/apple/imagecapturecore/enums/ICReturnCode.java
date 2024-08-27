package apple.imagecapturecore.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class ICReturnCode {
    @Generated
    private ICReturnCode() {
    }

    /**
     * Operation successful.
     */
    @Generated @NInt public static final long Success = 0x0000000000000000L;
    /**
     * An invalid parameter was found.
     */
    @Generated @NInt public static final long InvalidParam = 0xFFFFFFFFFFFFD93EL;
    /**
     * Communication between different components of Image Capture timed out.
     */
    @Generated @NInt public static final long CommunicationTimedOut = 0xFFFFFFFFFFFFD93DL;
    /**
     * The scan operation is canceled.
     */
    @Generated @NInt public static final long ScanOperationCanceled = 0xFFFFFFFFFFFFD93CL;
    /**
     * Scanner is being used by a local user.
     */
    @Generated @NInt public static final long ScannerInUseByLocalUser = 0xFFFFFFFFFFFFD93BL;
    /**
     * Scanner is being used by a remote user.
     */
    @Generated @NInt public static final long ScannerInUseByRemoteUser = 0xFFFFFFFFFFFFD93AL;
    /**
     * Failed to open a session on a specified device.
     */
    @Generated @NInt public static final long DeviceFailedToOpenSession = 0xFFFFFFFFFFFFD939L;
    /**
     * Failed to close a session on a specified device.
     */
    @Generated @NInt public static final long DeviceFailedToCloseSession = 0xFFFFFFFFFFFFD938L;
    /**
     * Failed to select a functional unit on the specified scanner.
     */
    @Generated @NInt public static final long ScannerFailedToSelectFunctionalUnit = 0xFFFFFFFFFFFFD937L;
    /**
     * Overview scan operation failed to complete on the specified scanner.
     */
    @Generated @NInt public static final long ScannerFailedToCompleteOverviewScan = 0xFFFFFFFFFFFFD936L;
    /**
     * Scan operation failed to complete on the specified scanner.
     */
    @Generated @NInt public static final long ScannerFailedToCompleteScan = 0xFFFFFFFFFFFFD935L;
    /**
     * An unsolicited status information was received from a scanner.
     */
    @Generated @NInt public static final long ReceivedUnsolicitedScannerStatusInfo = 0xFFFFFFFFFFFFD934L;
    /**
     * An unsolicited error information was received from a scanner.
     */
    @Generated @NInt public static final long ReceivedUnsolicitedScannerErrorInfo = 0xFFFFFFFFFFFFD933L;
    /**
     * A non-specific error occurred while downloading a file.
     */
    @Generated @NInt public static final long DownloadFailed = 0xFFFFFFFFFFFFD932L;
    /**
     * A non-specific error occurred while updownloading a file.
     */
    @Generated @NInt public static final long UploadFailed = 0xFFFFFFFFFFFFD931L;
    /**
     * Failed to complete a pass-through (e.g., PTP pass-through) command.
     */
    @Generated @NInt public static final long FailedToCompletePassThroughCommand = 0xFFFFFFFFFFFFD930L;
    /**
     * A download operation was canceled.
     */
    @Generated @NInt public static final long DownloadCanceled = 0xFFFFFFFFFFFFD92FL;
    /**
     * Failed to enable tethered-capture on a camera device.
     */
    @Generated @NInt public static final long FailedToEnabeTethering = 0xFFFFFFFFFFFFD92EL;
    /**
     * Failed to disable tethered-capture on a camera device.
     */
    @Generated @NInt public static final long FailedToDisabeTethering = 0xFFFFFFFFFFFFD92DL;
    /**
     * A request to send a message to a device failed.
     */
    @Generated @NInt public static final long FailedToCompleteSendMessageRequest = 0xFFFFFFFFFFFFD92CL;
    /**
     * A request to delete files failed.
     */
    @Generated @NInt public static final long DeleteFilesFailed = 0xFFFFFFFFFFFFD92BL;
    /**
     * A request to delete files was canceled.
     */
    @Generated @NInt public static final long DeleteFilesCanceled = 0xFFFFFFFFFFFFD92AL;
    /**
     * The device is locked with a passcode. Its contents cannot be seen unless it is unlocked.
     */
    @Generated @NInt public static final long DeviceIsPasscodeLocked = 0xFFFFFFFFFFFFD929L;
    /**
     * Failed to take a tethered-capture picture on a camera device.
     */
    @Generated @NInt public static final long DeviceFailedToTakePicture = 0xFFFFFFFFFFFFD928L;
    /**
     * Failed to open session because software to communicate with the device is not installed.
     */
    @Generated @NInt public static final long DeviceSoftwareNotInstalled = 0xFFFFFFFFFFFFD927L;
    /**
     * Failed to open session because software to communicate with the device is being installed.
     */
    @Generated @NInt public static final long DeviceSoftwareIsBeingInstalled = 0xFFFFFFFFFFFFD926L;
    /**
     * Software installation for the device has completed successfully.
     */
    @Generated @NInt public static final long DeviceSoftwareInstallationCompleted = 0xFFFFFFFFFFFFD925L;
    /**
     * Software installation for the device has been canceled.
     */
    @Generated @NInt public static final long DeviceSoftwareInstallationCanceled = 0xFFFFFFFFFFFFD924L;
    /**
     * Software installation for the device failed.
     */
    @Generated @NInt public static final long DeviceSoftwareInstallationFailed = 0xFFFFFFFFFFFFD923L;
    /**
     * Software for the device is not available from Apple.
     */
    @Generated @NInt public static final long DeviceSoftwareNotAvailable = 0xFFFFFFFFFFFFD922L;
    /**
     * A pairing request for a Apple Device failed.
     */
    @Generated @NInt public static final long DeviceCouldNotPair = 0xFFFFFFFFFFFFD921L;
    /**
     * A unpairing request for a Apple Device failed.
     */
    @Generated @NInt public static final long DeviceCouldNotUnpair = 0xFFFFFFFFFFFFD920L;
    /**
     * The device reports credentials are required to open the device.
     */
    @Generated @NInt public static final long DeviceNeedsCredentials = 0xFFFFFFFFFFFFD91FL;
    /**
     * The device is currently enumerating assets.
     */
    @Generated @NInt public static final long DeviceIsBusyEnumerating = 0xFFFFFFFFFFFFD91EL;
    /**
     * The device has experienced a general failure.
     */
    @Generated @NInt public static final long DeviceCommandGeneralFailure = 0xFFFFFFFFFFFFD91DL;
    /**
     * Failed to complete a data transaction.
     */
    @Generated @NInt public static final long DeviceFailedToCompleteTransfer = 0xFFFFFFFFFFFFD91CL;
    /**
     * Failed to send data.
     */
    @Generated @NInt public static final long DeviceFailedToSendData = 0xFFFFFFFFFFFFD91BL;
    /**
     * Session is not open.
     */
    @Generated @NInt public static final long SessionNotOpened = 0xFFFFFFFFFFFFD91AL;
    /**
     * EXFAT volume is invalid, and cannot be enumerated.
     */
    @Generated @NInt public static final long ExFATVolumeInvalid = 0x00000000000052D0L;
    /**
     * Multierror
     */
    @Generated @NInt public static final long MultiErrorDictionary = 0xFFFFFFFFFFFF8AD0L;
}