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
    @Generated @NInt public static final long UserDeclined = 0xFFFFFFFFFFFFE957L;
    @Generated @NInt public static final long Disabled = 0xFFFFFFFFFFFFE956L;
    @Generated @NInt public static final long FailedToStart = 0xFFFFFFFFFFFFE955L;
    @Generated @NInt public static final long Failed = 0xFFFFFFFFFFFFE954L;
    @Generated @NInt public static final long InsufficientStorage = 0xFFFFFFFFFFFFE953L;
    @Generated @NInt public static final long Interrupted = 0xFFFFFFFFFFFFE952L;
    @Generated @NInt public static final long ContentResize = 0xFFFFFFFFFFFFE951L;
    @Generated @NInt public static final long BroadcastInvalidSession = 0xFFFFFFFFFFFFE950L;
    @Generated @NInt public static final long SystemDormancy = 0xFFFFFFFFFFFFE94FL;

    @Generated
    private RPRecordingErrorCode() {
    }

    @Generated @NInt public static final long Entitlements = 0xFFFFFFFFFFFFE94EL;
    @Generated @NInt public static final long ActivePhoneCall = 0xFFFFFFFFFFFFE94DL;
    @Generated @NInt public static final long FailedToSave = 0xFFFFFFFFFFFFE94CL;
    @Generated @NInt public static final long CarPlay = 0xFFFFFFFFFFFFE94BL;
    @Generated @NInt public static final long FailedApplicationConnectionInvalid = 0xFFFFFFFFFFFFE94AL;
    @Generated @NInt public static final long FailedApplicationConnectionInterrupted = 0xFFFFFFFFFFFFE949L;
    @Generated @NInt public static final long FailedNoMatchingApplicationContext = 0xFFFFFFFFFFFFE948L;
    @Generated @NInt public static final long FailedMediaServicesFailure = 0xFFFFFFFFFFFFE947L;
    @Generated @NInt public static final long VideoMixingFailure = 0xFFFFFFFFFFFFE946L;
    @Generated @NInt public static final long BroadcastSetupFailed = 0xFFFFFFFFFFFFE945L;
    @Generated @NInt public static final long FailedToObtainURL = 0xFFFFFFFFFFFFE944L;
    @Generated @NInt public static final long FailedIncorrectTimeStamps = 0xFFFFFFFFFFFFE943L;
    @Generated @NInt public static final long FailedToProcessFirstSample = 0xFFFFFFFFFFFFE942L;
    @Generated @NInt public static final long FailedAssetWriterFailedToSave = 0xFFFFFFFFFFFFE941L;
    @Generated @NInt public static final long FailedNoAssetWriter = 0xFFFFFFFFFFFFE940L;
    @Generated @NInt public static final long FailedAssetWriterInWrongState = 0xFFFFFFFFFFFFE93FL;
    @Generated @NInt public static final long FailedAssetWriterExportFailed = 0xFFFFFFFFFFFFE93EL;
    @Generated @NInt public static final long FailedToRemoveFile = 0xFFFFFFFFFFFFE93DL;
    @Generated @NInt public static final long FailedAssetWriterExportCanceled = 0xFFFFFFFFFFFFE93CL;
    @Generated @NInt public static final long AttemptToStopNonRecording = 0xFFFFFFFFFFFFE93BL;
    @Generated @NInt public static final long AttemptToStartInRecordingState = 0xFFFFFFFFFFFFE93AL;
    @Generated @NInt public static final long PhotoFailure = 0xFFFFFFFFFFFFE939L;
    @Generated @NInt public static final long RecordingInvalidSession = 0xFFFFFFFFFFFFE938L;
    @Generated @NInt public static final long FailedToStartCaptureStack = 0xFFFFFFFFFFFFE937L;
    @Generated @NInt public static final long CodeSuccessful = 0x0000000000000000L;
}
