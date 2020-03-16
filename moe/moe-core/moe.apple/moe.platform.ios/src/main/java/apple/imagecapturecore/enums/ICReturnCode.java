package apple.imagecapturecore.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class ICReturnCode {
    @Generated
    private ICReturnCode() {
    }

    @Generated @NInt public static final long Success = 0x0000000000000000L;
    @Generated @NInt public static final long InvalidParam = 0xFFFFFFFFFFFFD93EL;
    @Generated @NInt public static final long CommunicationTimedOut = 0xFFFFFFFFFFFFD93DL;
    @Generated @NInt public static final long ScanOperationCanceled = 0xFFFFFFFFFFFFD93CL;
    @Generated @NInt public static final long ScannerInUseByLocalUser = 0xFFFFFFFFFFFFD93BL;
    @Generated @NInt public static final long ScannerInUseByRemoteUser = 0xFFFFFFFFFFFFD93AL;
    @Generated @NInt public static final long DeviceFailedToOpenSession = 0xFFFFFFFFFFFFD939L;
    @Generated @NInt public static final long DeviceFailedToCloseSession = 0xFFFFFFFFFFFFD938L;
    @Generated @NInt public static final long ScannerFailedToSelectFunctionalUnit = 0xFFFFFFFFFFFFD937L;
    @Generated @NInt public static final long ScannerFailedToCompleteOverviewScan = 0xFFFFFFFFFFFFD936L;
    @Generated @NInt public static final long ScannerFailedToCompleteScan = 0xFFFFFFFFFFFFD935L;
    @Generated @NInt public static final long ReceivedUnsolicitedScannerStatusInfo = 0xFFFFFFFFFFFFD934L;
    @Generated @NInt public static final long ReceivedUnsolicitedScannerErrorInfo = 0xFFFFFFFFFFFFD933L;
    @Generated @NInt public static final long DownloadFailed = 0xFFFFFFFFFFFFD932L;
    @Generated @NInt public static final long UploadFailed = 0xFFFFFFFFFFFFD931L;
    @Generated @NInt public static final long FailedToCompletePassThroughCommand = 0xFFFFFFFFFFFFD930L;
    @Generated @NInt public static final long DownloadCanceled = 0xFFFFFFFFFFFFD92FL;
    @Generated @NInt public static final long FailedToEnabeTethering = 0xFFFFFFFFFFFFD92EL;
    @Generated @NInt public static final long FailedToDisabeTethering = 0xFFFFFFFFFFFFD92DL;
    @Generated @NInt public static final long FailedToCompleteSendMessageRequest = 0xFFFFFFFFFFFFD92CL;
    @Generated @NInt public static final long DeleteFilesFailed = 0xFFFFFFFFFFFFD92BL;
    @Generated @NInt public static final long DeleteFilesCanceled = 0xFFFFFFFFFFFFD92AL;
    @Generated @NInt public static final long DeviceIsPasscodeLocked = 0xFFFFFFFFFFFFD929L;
    @Generated @NInt public static final long DeviceFailedToTakePicture = 0xFFFFFFFFFFFFD928L;
    @Generated @NInt public static final long DeviceSoftwareNotInstalled = 0xFFFFFFFFFFFFD927L;
    @Generated @NInt public static final long DeviceSoftwareIsBeingInstalled = 0xFFFFFFFFFFFFD926L;
    @Generated @NInt public static final long DeviceSoftwareInstallationCompleted = 0xFFFFFFFFFFFFD925L;
    @Generated @NInt public static final long DeviceSoftwareInstallationCanceled = 0xFFFFFFFFFFFFD924L;
    @Generated @NInt public static final long DeviceSoftwareInstallationFailed = 0xFFFFFFFFFFFFD923L;
    @Generated @NInt public static final long DeviceSoftwareNotAvailable = 0xFFFFFFFFFFFFD922L;
    @Generated @NInt public static final long DeviceCouldNotPair = 0xFFFFFFFFFFFFD921L;
    @Generated @NInt public static final long DeviceCouldNotUnpair = 0xFFFFFFFFFFFFD920L;
    @Generated @NInt public static final long DeviceNeedsCredentials = 0xFFFFFFFFFFFFD91FL;
    @Generated @NInt public static final long DeviceIsBusyEnumerating = 0xFFFFFFFFFFFFD91EL;
    @Generated @NInt public static final long DeviceCommandGeneralFailure = 0xFFFFFFFFFFFFD91DL;
    @Generated @NInt public static final long DeviceFailedToCompleteTransfer = 0xFFFFFFFFFFFFD91CL;
    @Generated @NInt public static final long DeviceFailedToSendData = 0xFFFFFFFFFFFFD91BL;
    @Generated @NInt public static final long SessionNotOpened = 0xFFFFFFFFFFFFD91AL;
    @Generated @NInt public static final long ExFATVolumeInvalid = 0xFFFFFFFFFFFFAD30L;
    @Generated @NInt public static final long MultiErrorDictionary = 0xFFFFFFFFFFFF8AD0L;
}