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

package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class AVError {
    @Generated @NInt public static final long Unknown = 0xFFFFFFFFFFFFD1E8L;
    @Generated @NInt public static final long OutOfMemory = 0xFFFFFFFFFFFFD1E7L;
    @Generated @NInt public static final long SessionNotRunning = 0xFFFFFFFFFFFFD1E5L;
    @Generated @NInt public static final long DeviceAlreadyUsedByAnotherSession = 0xFFFFFFFFFFFFD1E4L;
    @Generated @NInt public static final long NoDataCaptured = 0xFFFFFFFFFFFFD1E3L;
    @Generated @NInt public static final long SessionConfigurationChanged = 0xFFFFFFFFFFFFD1E2L;
    @Generated @NInt public static final long DiskFull = 0xFFFFFFFFFFFFD1E1L;
    @Generated @NInt public static final long DeviceWasDisconnected = 0xFFFFFFFFFFFFD1E0L;
    @Generated @NInt public static final long MediaChanged = 0xFFFFFFFFFFFFD1DFL;
    @Generated @NInt public static final long MaximumDurationReached = 0xFFFFFFFFFFFFD1DEL;
    @Generated @NInt public static final long MaximumFileSizeReached = 0xFFFFFFFFFFFFD1DDL;
    @Generated @NInt public static final long MediaDiscontinuity = 0xFFFFFFFFFFFFD1DCL;
    @Generated @NInt public static final long MaximumNumberOfSamplesForFileFormatReached = 0xFFFFFFFFFFFFD1DBL;
    @Generated @NInt public static final long DeviceNotConnected = 0xFFFFFFFFFFFFD1DAL;
    @Generated @NInt public static final long DeviceInUseByAnotherApplication = 0xFFFFFFFFFFFFD1D9L;
    @Generated @NInt public static final long DeviceLockedForConfigurationByAnotherProcess = 0xFFFFFFFFFFFFD1D7L;
    @Generated @NInt public static final long SessionWasInterrupted = 0xFFFFFFFFFFFFD1D6L;
    @Generated @NInt public static final long MediaServicesWereReset = 0xFFFFFFFFFFFFD1D5L;
    @Generated @NInt public static final long ExportFailed = 0xFFFFFFFFFFFFD1D4L;
    /**
     * userInfo may contain AVErrorMediaTypeKey, AVErrorMediaSubTypeKey & AVErrorPresentationTimeStampKey, if available
     */
    @Generated @NInt public static final long DecodeFailed = 0xFFFFFFFFFFFFD1D3L;
    @Generated @NInt public static final long InvalidSourceMedia = 0xFFFFFFFFFFFFD1D2L;
    @Generated @NInt public static final long FileAlreadyExists = 0xFFFFFFFFFFFFD1D1L;
    @Generated @NInt public static final long CompositionTrackSegmentsNotContiguous = 0xFFFFFFFFFFFFD1D0L;
    @Generated @NInt public static final long InvalidCompositionTrackSegmentDuration = 0xFFFFFFFFFFFFD1CFL;
    @Generated @NInt public static final long InvalidCompositionTrackSegmentSourceStartTime = 0xFFFFFFFFFFFFD1CEL;
    @Generated @NInt public static final long InvalidCompositionTrackSegmentSourceDuration = 0xFFFFFFFFFFFFD1CDL;
    @Generated @NInt public static final long FileFormatNotRecognized = 0xFFFFFFFFFFFFD1CCL;
    @Generated @NInt public static final long FileFailedToParse = 0xFFFFFFFFFFFFD1CBL;
    @Generated @NInt public static final long MaximumStillImageCaptureRequestsExceeded = 0xFFFFFFFFFFFFD1CAL;
    @Generated @NInt public static final long ContentIsProtected = 0xFFFFFFFFFFFFD1C9L;
    @Generated @NInt public static final long NoImageAtTime = 0xFFFFFFFFFFFFD1C8L;
    /**
     * userInfo may contain AVErrorMediaTypeKey & AVErrorMediaSubTypeKey, if available
     */
    @Generated @NInt public static final long DecoderNotFound = 0xFFFFFFFFFFFFD1C7L;
    /**
     * userInfo may contain AVErrorMediaTypeKey & AVErrorMediaSubTypeKey, if available
     */
    @Generated @NInt public static final long EncoderNotFound = 0xFFFFFFFFFFFFD1C6L;
    @Generated @NInt public static final long ContentIsNotAuthorized = 0xFFFFFFFFFFFFD1C5L;
    @Generated @NInt public static final long ApplicationIsNotAuthorized = 0xFFFFFFFFFFFFD1C4L;
    @Deprecated @Generated @NInt public static final long DeviceIsNotAvailableInBackground = 0xFFFFFFFFFFFFD1C3L;
    @Generated @NInt public static final long OperationNotSupportedForAsset = 0xFFFFFFFFFFFFD1C2L;
    /**
     * userInfo may contain AVErrorMediaTypeKey & AVErrorMediaSubTypeKey, if available
     */
    @Generated @NInt public static final long DecoderTemporarilyUnavailable = 0xFFFFFFFFFFFFD1C1L;
    /**
     * userInfo may contain AVErrorMediaTypeKey & AVErrorMediaSubTypeKey, if available
     */
    @Generated @NInt public static final long EncoderTemporarilyUnavailable = 0xFFFFFFFFFFFFD1C0L;
    @Generated @NInt public static final long InvalidVideoComposition = 0xFFFFFFFFFFFFD1BFL;
    @Generated @NInt public static final long ReferenceForbiddenByReferencePolicy = 0xFFFFFFFFFFFFD1BEL;
    @Generated @NInt public static final long InvalidOutputURLPathExtension = 0xFFFFFFFFFFFFD1BDL;
    @Generated @NInt public static final long ScreenCaptureFailed = 0xFFFFFFFFFFFFD1BCL;
    @Generated @NInt public static final long DisplayWasDisabled = 0xFFFFFFFFFFFFD1BBL;
    @Generated @NInt public static final long TorchLevelUnavailable = 0xFFFFFFFFFFFFD1BAL;
    @Generated @NInt public static final long OperationInterrupted = 0xFFFFFFFFFFFFD1B9L;
    @Generated @NInt public static final long IncompatibleAsset = 0xFFFFFFFFFFFFD1B8L;
    @Generated @NInt public static final long FailedToLoadMediaData = 0xFFFFFFFFFFFFD1B7L;
    @Generated @NInt public static final long ServerIncorrectlyConfigured = 0xFFFFFFFFFFFFD1B6L;
    @Generated @NInt public static final long ApplicationIsNotAuthorizedToUseDevice = 0xFFFFFFFFFFFFD1B4L;
    @Generated @NInt public static final long FailedToParse = 0xFFFFFFFFFFFFD1B3L;
    /**
     * userInfo contains AVErrorFileTypeKey
     */
    @Generated @NInt public static final long FileTypeDoesNotSupportSampleReferences = 0xFFFFFFFFFFFFD1B2L;
    @Generated @NInt public static final long UndecodableMediaData = 0xFFFFFFFFFFFFD1B1L;
    @Generated @NInt public static final long AirPlayControllerRequiresInternet = 0xFFFFFFFFFFFFD1B0L;
    @Generated @NInt public static final long AirPlayReceiverRequiresInternet = 0xFFFFFFFFFFFFD1AFL;
    @Generated @NInt public static final long VideoCompositorFailed = 0xFFFFFFFFFFFFD1AEL;
    /**
     * on iOS, AVCaptureMovieFileOutput only supports one recording at a time
     */
    @Generated @NInt public static final long RecordingAlreadyInProgress = 0xFFFFFFFFFFFFD1ADL;
    @Generated @NInt public static final long UnsupportedOutputSettings = 0xFFFFFFFFFFFFD1ABL;
    @Generated @NInt public static final long OperationNotAllowed = 0xFFFFFFFFFFFFD1AAL;

    @Generated
    private AVError() {
    }

    @Generated @NInt public static final long ContentIsUnavailable = 0xFFFFFFFFFFFFD1A9L;
    @Generated @NInt public static final long FormatUnsupported = 0xFFFFFFFFFFFFD1A8L;
    @Generated @NInt public static final long MalformedDepth = 0xFFFFFFFFFFFFD1A7L;
    @Generated @NInt public static final long ContentNotUpdated = 0xFFFFFFFFFFFFD1A6L;
    @Generated @NInt public static final long NoLongerPlayable = 0xFFFFFFFFFFFFD1A5L;
    @Generated @NInt public static final long NoCompatibleAlternatesForExternalDisplay = 0xFFFFFFFFFFFFD1A4L;
    @Generated @NInt public static final long NoSourceTrack = 0xFFFFFFFFFFFFD1A3L;
    @Generated @NInt public static final long ExternalPlaybackNotSupportedForAsset = 0xFFFFFFFFFFFFD1A2L;
    @Generated @NInt public static final long OperationNotSupportedForPreset = 0xFFFFFFFFFFFFD1A1L;
    @Generated @NInt public static final long SessionHardwareCostOverage = 0xFFFFFFFFFFFFD1A0L;
    @Generated @NInt public static final long UnsupportedDeviceActiveFormat = 0xFFFFFFFFFFFFD19FL;
    @Generated @NInt public static final long IncorrectlyConfigured = 0xFFFFFFFFFFFFD19DL;
    @Generated @NInt public static final long SegmentStartedWithNonSyncSample = 0xFFFFFFFFFFFFD19CL;
    @Generated @NInt public static final long RosettaNotInstalled = 0xFFFFFFFFFFFFD19BL;
    @Generated @NInt public static final long OperationCancelled = 0xFFFFFFFFFFFFD19AL;
    @Generated @NInt public static final long ContentKeyRequestCancelled = 0xFFFFFFFFFFFFD199L;
}
