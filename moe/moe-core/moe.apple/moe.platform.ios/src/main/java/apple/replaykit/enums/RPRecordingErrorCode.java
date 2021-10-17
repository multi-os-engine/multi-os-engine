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

package apple.replaykit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class RPRecordingErrorCode {
    @Generated @NInt public static final long Unknown = 0xFFFFFFFFFFFFE958L;
    /**
     * The user declined app recording.
     */
    @Generated @NInt public static final long UserDeclined = 0xFFFFFFFFFFFFE957L;
    /**
     * App recording has been disabled via parental controls.
     */
    @Generated @NInt public static final long Disabled = 0xFFFFFFFFFFFFE956L;
    /**
     * Recording failed to start
     */
    @Generated @NInt public static final long FailedToStart = 0xFFFFFFFFFFFFE955L;
    /**
     * Failed during recording
     */
    @Generated @NInt public static final long Failed = 0xFFFFFFFFFFFFE954L;
    /**
     * Insufficient storage for recording.
     */
    @Generated @NInt public static final long InsufficientStorage = 0xFFFFFFFFFFFFE953L;
    /**
     * Recording interrupted by other app
     */
    @Generated @NInt public static final long Interrupted = 0xFFFFFFFFFFFFE952L;
    /**
     * Recording interrupted by multitasking and Content Resizing
     */
    @Generated @NInt public static final long ContentResize = 0xFFFFFFFFFFFFE951L;
    /**
     * Attempted to start a broadcast without a prior session
     */
    @Generated @NInt public static final long BroadcastInvalidSession = 0xFFFFFFFFFFFFE950L;
    /**
     * Recording was forced to end when user pressed the power button
     */
    @Generated @NInt public static final long SystemDormancy = 0xFFFFFFFFFFFFE94FL;

    @Generated
    private RPRecordingErrorCode() {
    }

    /**
     * Recording failed due to missing entitlements
     */
    @Generated @NInt public static final long Entitlements = 0xFFFFFFFFFFFFE94EL;
    /**
     * Recording unable to to record due to active phone call
     */
    @Generated @NInt public static final long ActivePhoneCall = 0xFFFFFFFFFFFFE94DL;
    /**
     * Failed to save recording to camera roll
     */
    @Generated @NInt public static final long FailedToSave = 0xFFFFFFFFFFFFE94CL;
    /**
     * Failed to start recording due to carplay being active
     */
    @Generated @NInt public static final long CarPlay = 0xFFFFFFFFFFFFE94BL;
    /**
     * Failed during recording application connection invalid
     */
    @Generated @NInt public static final long FailedApplicationConnectionInvalid = 0xFFFFFFFFFFFFE94AL;
    /**
     * Failed during recording appliation connection interrupted
     */
    @Generated @NInt public static final long FailedApplicationConnectionInterrupted = 0xFFFFFFFFFFFFE949L;
    /**
     * Failed during recording context id does not match application
     */
    @Generated @NInt public static final long FailedNoMatchingApplicationContext = 0xFFFFFFFFFFFFE948L;
    /**
     * Failed during recording due to mediaservices failure
     */
    @Generated @NInt public static final long FailedMediaServicesFailure = 0xFFFFFFFFFFFFE947L;
    /**
     * Failed during recording due to audio/video mixing failure
     */
    @Generated @NInt public static final long VideoMixingFailure = 0xFFFFFFFFFFFFE946L;
    /**
     * Failed during saving to camera roll
     */
    @Generated @NInt public static final long BroadcastSetupFailed = 0xFFFFFFFFFFFFE945L;
    /**
     * Failed to obtain video URL
     */
    @Generated @NInt public static final long FailedToObtainURL = 0xFFFFFFFFFFFFE944L;
    /**
     * Failed to due to malformed start and end time intervals
     */
    @Generated @NInt public static final long FailedIncorrectTimeStamps = 0xFFFFFFFFFFFFE943L;
    /**
     * Failed to failure to process first sample buffer for the asset writer
     */
    @Generated @NInt public static final long FailedToProcessFirstSample = 0xFFFFFFFFFFFFE942L;
    /**
     * Failed due to finishWritingWithCompletionHandler failed
     */
    @Generated @NInt public static final long FailedAssetWriterFailedToSave = 0xFFFFFFFFFFFFE941L;
    /**
     * Failed due to no asset writer
     */
    @Generated @NInt public static final long FailedNoAssetWriter = 0xFFFFFFFFFFFFE940L;
    /**
     * Failed due to no asset writer being in wrong state
     */
    @Generated @NInt public static final long FailedAssetWriterInWrongState = 0xFFFFFFFFFFFFE93FL;
    /**
     * Failed due to export session failing
     */
    @Generated @NInt public static final long FailedAssetWriterExportFailed = 0xFFFFFFFFFFFFE93EL;
    /**
     * Failed to properly remove temp file for recording
     */
    @Generated @NInt public static final long FailedToRemoveFile = 0xFFFFFFFFFFFFE93DL;
    /**
     * Failed due to export session being canceled
     */
    @Generated @NInt public static final long FailedAssetWriterExportCanceled = 0xFFFFFFFFFFFFE93CL;
    /**
     * Failed due to attempting to stop a recording that wasn't in recording state
     */
    @Generated @NInt public static final long AttemptToStopNonRecording = 0xFFFFFFFFFFFFE93BL;
    /**
     * Failed due to attempting to start a recording thats already in a recording state
     */
    @Generated @NInt public static final long AttemptToStartInRecordingState = 0xFFFFFFFFFFFFE93AL;
    /**
     * Failed during saving to camera roll
     */
    @Generated @NInt public static final long PhotoFailure = 0xFFFFFFFFFFFFE939L;
    /**
     * Attempted to start an invalid recording session
     */
    @Generated @NInt public static final long RecordingInvalidSession = 0xFFFFFFFFFFFFE938L;
    /**
     * Failed to start due to video/audio capture failure
     */
    @Generated @NInt public static final long FailedToStartCaptureStack = 0xFFFFFFFFFFFFE937L;
    /**
     * Successfully saved video to camera roll
     */
    @Generated @NInt public static final long CodeSuccessful = 0x0000000000000000L;
    /**
     * Failed due to invalid parameter
     */
    @Generated @NInt public static final long InvalidParameter = 0xFFFFFFFFFFFFE936L;
    /**
     * Failed due to file permissions error
     */
    @Generated @NInt public static final long FilePermissions = 0xFFFFFFFFFFFFE935L;
    /**
     * Failed due to clip export in progress
     */
    @Generated @NInt public static final long ExportClipToURLInProgress = 0xFFFFFFFFFFFFE934L;
}
