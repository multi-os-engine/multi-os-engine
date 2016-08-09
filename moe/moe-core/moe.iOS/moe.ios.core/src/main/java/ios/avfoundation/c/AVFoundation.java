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

package ios.avfoundation.c;


import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.c.ann.Inline;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;

import ios.avfoundation.struct.AVAudio3DAngularOrientation;
import ios.avfoundation.struct.AVAudio3DPoint;
import ios.avfoundation.struct.AVAudio3DVectorOrientation;
import ios.avfoundation.struct.AVBeatRange;
import ios.avfoundation.struct.AVCaptureWhiteBalanceGains;
import ios.coregraphics.struct.CGRect;
import ios.coregraphics.struct.CGSize;
import ios.coremedia.struct.CMTime;

@Generated
@Library("AVFoundation")
@Runtime(CRuntime.class)
public final class AVFoundation {
	static {
		NatJ.register();
	}

	@Generated
	private AVFoundation() {
	}

	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native AVAudio3DPoint AVAudioMake3DPoint(float x, float y,
			float z);

	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native AVAudio3DPoint AVAudioMake3DVector(float x, float y,
			float z);

	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native AVAudio3DVectorOrientation AVAudioMake3DVectorOrientation(
			@ByValue AVAudio3DPoint forward, @ByValue AVAudio3DPoint up);

	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native AVAudio3DAngularOrientation AVAudioMake3DAngularOrientation(
			float yaw, float pitch, float roll);

	/**
	 * AVMakeRectWithAspectRatioInsideRect</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVFoundation_Functions/index.html#//apple_ref/c/func/AVMakeRectWithAspectRatioInsideRect">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@ByValue
	public static native CGRect AVMakeRectWithAspectRatioInsideRect(
			@ByValue CGSize aspectRatio, @ByValue CGRect boundingRect);

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAudioEngineConfigurationChangeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVFormatIDKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVSampleRateKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVNumberOfChannelsKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVLinearPCMBitDepthKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVLinearPCMIsBigEndianKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVLinearPCMIsFloatKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVLinearPCMIsNonInterleaved();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVEncoderAudioQualityKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVEncoderAudioQualityForVBRKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVEncoderBitRateKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVEncoderBitRatePerChannelKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVEncoderBitRateStrategyKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVEncoderBitDepthHintKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVSampleRateConverterAlgorithmKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVSampleRateConverterAudioQualityKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVChannelLayoutKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAudioBitRateStrategy_Constant();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAudioBitRateStrategy_LongTermAverage();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAudioBitRateStrategy_VariableConstrained();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAudioBitRateStrategy_Variable();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVSampleRateConverterAlgorithm_Normal();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVSampleRateConverterAlgorithm_Mastering();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAudioSessionInterruptionNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAudioSessionRouteChangeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAudioSessionMediaServicesWereLostNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAudioSessionMediaServicesWereResetNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAudioSessionSilenceSecondaryAudioHintNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAudioSessionInterruptionTypeKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAudioSessionInterruptionOptionKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAudioSessionRouteChangeReasonKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAudioSessionRouteChangePreviousRouteKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAudioSessionSilenceSecondaryAudioHintTypeKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAudioSessionCategoryAmbient();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAudioSessionCategorySoloAmbient();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAudioSessionCategoryPlayback();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAudioSessionCategoryRecord();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAudioSessionCategoryPlayAndRecord();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAudioSessionCategoryAudioProcessing();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAudioSessionCategoryMultiRoute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAudioSessionModeDefault();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAudioSessionModeVoiceChat();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAudioSessionModeGameChat();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAudioSessionModeVideoRecording();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAudioSessionModeMeasurement();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAudioSessionModeMoviePlayback();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAudioSessionModeVideoChat();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAudioSessionPortLineIn();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAudioSessionPortBuiltInMic();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAudioSessionPortHeadsetMic();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAudioSessionPortLineOut();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAudioSessionPortHeadphones();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAudioSessionPortBluetoothA2DP();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAudioSessionPortBuiltInReceiver();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAudioSessionPortBuiltInSpeaker();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAudioSessionPortHDMI();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAudioSessionPortAirPlay();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAudioSessionPortBluetoothLE();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAudioSessionPortBluetoothHFP();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAudioSessionPortUSBAudio();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAudioSessionPortCarAudio();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAudioSessionLocationUpper();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAudioSessionLocationLower();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAudioSessionOrientationTop();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAudioSessionOrientationBottom();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAudioSessionOrientationFront();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAudioSessionOrientationBack();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAudioSessionOrientationLeft();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAudioSessionOrientationRight();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAudioSessionPolarPatternOmnidirectional();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAudioSessionPolarPatternCardioid();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAudioSessionPolarPatternSubcardioid();

	@Generated
	@CVariable()
	public static native double AVCoreAnimationBeginTimeAtZero();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVLayerVideoGravityResizeAspect();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVLayerVideoGravityResizeAspectFill();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVLayerVideoGravityResize();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVURLAssetPreferPreciseDurationAndTimingKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVURLAssetReferenceRestrictionsKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVURLAssetHTTPCookiesKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAssetExportPresetLowQuality();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAssetExportPresetMediumQuality();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAssetExportPresetHighestQuality();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAssetExportPreset640x480();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAssetExportPreset960x540();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAssetExportPreset1280x720();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAssetExportPreset1920x1080();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAssetExportPresetAppleM4A();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAssetExportPresetPassthrough();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAssetImageGeneratorApertureModeCleanAperture();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAssetImageGeneratorApertureModeProductionAperture();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAssetImageGeneratorApertureModeEncodedPixels();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVTrackAssociationTypeAudioFallback();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVTrackAssociationTypeChapterList();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVTrackAssociationTypeForcedSubtitlesOnly();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVTrackAssociationTypeSelectionFollower();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVTrackAssociationTypeTimecode();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVTrackAssociationTypeMetadataReferent();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAudioTimePitchAlgorithmLowQualityZeroLatency();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAudioTimePitchAlgorithmTimeDomain();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAudioTimePitchAlgorithmSpectral();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAudioTimePitchAlgorithmVarispeed();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVCaptureDeviceWasConnectedNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVCaptureDeviceWasDisconnectedNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVCaptureDeviceSubjectAreaDidChangeNotification();

	@Generated
	@CVariable()
	public static native float AVCaptureMaxAvailableTorchLevel();

	@Generated
	@CVariable()
	public static native float AVCaptureLensPositionCurrent();

	@Generated
	@CVariable()
	@ByValue
	public static native CMTime AVCaptureExposureDurationCurrent();

	@Generated
	@CVariable()
	public static native float AVCaptureISOCurrent();

	@Generated
	@CVariable()
	public static native float AVCaptureExposureTargetBiasCurrent();

	@Generated
	@CVariable()
	@ByValue
	public static native AVCaptureWhiteBalanceGains AVCaptureWhiteBalanceGainsCurrent();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVCaptureInputPortFormatDescriptionDidChangeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVCaptureSessionRuntimeErrorNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVCaptureSessionErrorKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVCaptureSessionDidStartRunningNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVCaptureSessionDidStopRunningNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVCaptureSessionWasInterruptedNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVCaptureSessionInterruptionEndedNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVCaptureSessionPresetPhoto();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVCaptureSessionPresetHigh();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVCaptureSessionPresetMedium();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVCaptureSessionPresetLow();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVCaptureSessionPreset352x288();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVCaptureSessionPreset640x480();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVCaptureSessionPreset1280x720();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVCaptureSessionPreset1920x1080();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVCaptureSessionPresetiFrame960x540();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVCaptureSessionPresetiFrame1280x720();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVCaptureSessionPresetInputPriority();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVFoundationErrorDomain();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVErrorDeviceKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVErrorTimeKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVErrorFileSizeKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVErrorPIDKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVErrorRecordingSuccessfullyFinishedKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVErrorMediaTypeKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVErrorMediaSubTypeKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVErrorPresentationTimeStampKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVErrorPersistentTrackIDKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVErrorFileTypeKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMediaTypeVideo();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMediaTypeAudio();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMediaTypeText();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMediaTypeClosedCaption();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMediaTypeSubtitle();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMediaTypeTimecode();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMediaTypeMetadata();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMediaTypeMuxed();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMediaCharacteristicVisual();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMediaCharacteristicAudible();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMediaCharacteristicLegible();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMediaCharacteristicFrameBased();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMediaCharacteristicIsMainProgramContent();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMediaCharacteristicIsAuxiliaryContent();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMediaCharacteristicContainsOnlyForcedSubtitles();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMediaCharacteristicTranscribesSpokenDialogForAccessibility();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMediaCharacteristicDescribesMusicAndSoundForAccessibility();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMediaCharacteristicEasyToRead();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMediaCharacteristicDescribesVideoForAccessibility();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVFileTypeQuickTimeMovie();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVFileTypeMPEG4();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVFileTypeAppleM4V();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVFileTypeAppleM4A();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVFileType3GPP();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVFileType3GPP2();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVFileTypeCoreAudioFormat();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVFileTypeWAVE();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVFileTypeAIFF();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVFileTypeAIFC();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVFileTypeAMR();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVFileTypeMPEGLayer3();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVFileTypeSunAU();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVFileTypeAC3();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataKeySpaceCommon();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataCommonKeyTitle();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataCommonKeyCreator();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataCommonKeySubject();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataCommonKeyDescription();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataCommonKeyPublisher();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataCommonKeyContributor();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataCommonKeyCreationDate();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataCommonKeyLastModifiedDate();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataCommonKeyType();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataCommonKeyFormat();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataCommonKeyIdentifier();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataCommonKeySource();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataCommonKeyLanguage();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataCommonKeyRelation();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataCommonKeyLocation();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataCommonKeyCopyrights();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataCommonKeyAlbumName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataCommonKeyAuthor();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataCommonKeyArtist();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataCommonKeyArtwork();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataCommonKeyMake();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataCommonKeyModel();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataCommonKeySoftware();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataFormatQuickTimeUserData();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataKeySpaceQuickTimeUserData();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeUserDataKeyAlbum();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeUserDataKeyArranger();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeUserDataKeyArtist();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeUserDataKeyAuthor();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeUserDataKeyChapter();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeUserDataKeyComment();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeUserDataKeyComposer();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeUserDataKeyCopyright();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeUserDataKeyCreationDate();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeUserDataKeyDescription();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeUserDataKeyDirector();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeUserDataKeyDisclaimer();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeUserDataKeyEncodedBy();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeUserDataKeyFullName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeUserDataKeyGenre();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeUserDataKeyHostComputer();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeUserDataKeyInformation();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeUserDataKeyKeywords();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeUserDataKeyMake();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeUserDataKeyModel();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeUserDataKeyOriginalArtist();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeUserDataKeyOriginalFormat();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeUserDataKeyOriginalSource();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeUserDataKeyPerformers();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeUserDataKeyProducer();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeUserDataKeyPublisher();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeUserDataKeyProduct();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeUserDataKeySoftware();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeUserDataKeySpecialPlaybackRequirements();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeUserDataKeyTrack();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeUserDataKeyWarning();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeUserDataKeyWriter();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeUserDataKeyURLLink();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeUserDataKeyLocationISO6709();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeUserDataKeyTrackName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeUserDataKeyCredits();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeUserDataKeyPhonogramRights();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeUserDataKeyTaggedCharacteristic();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataFormatISOUserData();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataKeySpaceISOUserData();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataISOUserDataKeyCopyright();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataISOUserDataKeyTaggedCharacteristic();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadata3GPUserDataKeyCopyright();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadata3GPUserDataKeyAuthor();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadata3GPUserDataKeyPerformer();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadata3GPUserDataKeyGenre();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadata3GPUserDataKeyRecordingYear();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadata3GPUserDataKeyLocation();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadata3GPUserDataKeyTitle();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadata3GPUserDataKeyDescription();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadata3GPUserDataKeyCollection();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadata3GPUserDataKeyUserRating();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadata3GPUserDataKeyThumbnail();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadata3GPUserDataKeyAlbumAndTrack();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadata3GPUserDataKeyKeywordList();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadata3GPUserDataKeyMediaClassification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadata3GPUserDataKeyMediaRating();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataFormatQuickTimeMetadata();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataKeySpaceQuickTimeMetadata();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeMetadataKeyAuthor();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeMetadataKeyComment();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeMetadataKeyCopyright();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeMetadataKeyCreationDate();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeMetadataKeyDirector();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeMetadataKeyDisplayName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeMetadataKeyInformation();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeMetadataKeyKeywords();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeMetadataKeyProducer();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeMetadataKeyPublisher();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeMetadataKeyAlbum();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeMetadataKeyArtist();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeMetadataKeyArtwork();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeMetadataKeyDescription();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeMetadataKeySoftware();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeMetadataKeyYear();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeMetadataKeyGenre();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeMetadataKeyiXML();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeMetadataKeyLocationISO6709();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeMetadataKeyMake();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeMetadataKeyModel();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeMetadataKeyArranger();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeMetadataKeyEncodedBy();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeMetadataKeyOriginalArtist();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeMetadataKeyPerformer();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeMetadataKeyComposer();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeMetadataKeyCredits();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeMetadataKeyPhonogramRights();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeMetadataKeyCameraIdentifier();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeMetadataKeyCameraFrameReadoutTime();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeMetadataKeyTitle();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeMetadataKeyCollectionUser();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeMetadataKeyRatingUser();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeMetadataKeyLocationName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeMetadataKeyLocationBody();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeMetadataKeyLocationNote();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeMetadataKeyLocationRole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeMetadataKeyLocationDate();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeMetadataKeyDirectionFacing();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeMetadataKeyDirectionMotion();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataFormatiTunesMetadata();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataKeySpaceiTunes();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataiTunesMetadataKeyAlbum();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataiTunesMetadataKeyArtist();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataiTunesMetadataKeyUserComment();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataiTunesMetadataKeyCoverArt();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataiTunesMetadataKeyCopyright();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataiTunesMetadataKeyReleaseDate();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataiTunesMetadataKeyEncodedBy();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataiTunesMetadataKeyPredefinedGenre();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataiTunesMetadataKeyUserGenre();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataiTunesMetadataKeySongName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataiTunesMetadataKeyTrackSubTitle();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataiTunesMetadataKeyEncodingTool();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataiTunesMetadataKeyComposer();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataiTunesMetadataKeyAlbumArtist();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataiTunesMetadataKeyAccountKind();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataiTunesMetadataKeyAppleID();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataiTunesMetadataKeyArtistID();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataiTunesMetadataKeySongID();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataiTunesMetadataKeyDiscCompilation();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataiTunesMetadataKeyDiscNumber();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataiTunesMetadataKeyGenreID();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataiTunesMetadataKeyGrouping();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataiTunesMetadataKeyPlaylistID();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataiTunesMetadataKeyContentRating();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataiTunesMetadataKeyBeatsPerMin();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataiTunesMetadataKeyTrackNumber();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataiTunesMetadataKeyArtDirector();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataiTunesMetadataKeyArranger();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataiTunesMetadataKeyAuthor();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataiTunesMetadataKeyLyrics();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataiTunesMetadataKeyAcknowledgement();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataiTunesMetadataKeyConductor();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataiTunesMetadataKeyDescription();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataiTunesMetadataKeyDirector();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataiTunesMetadataKeyEQ();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataiTunesMetadataKeyLinerNotes();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataiTunesMetadataKeyRecordCompany();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataiTunesMetadataKeyOriginalArtist();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataiTunesMetadataKeyPhonogramRights();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataiTunesMetadataKeyProducer();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataiTunesMetadataKeyPerformer();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataiTunesMetadataKeyPublisher();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataiTunesMetadataKeySoundEngineer();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataiTunesMetadataKeySoloist();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataiTunesMetadataKeyCredits();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataiTunesMetadataKeyThanks();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataiTunesMetadataKeyOnlineExtras();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataiTunesMetadataKeyExecProducer();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataFormatID3Metadata();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataKeySpaceID3();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyAudioEncryption();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyAttachedPicture();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyAudioSeekPointIndex();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyComments();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyCommerical();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyEncryption();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyEqualization();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyEqualization2();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyEventTimingCodes();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyGeneralEncapsulatedObject();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyGroupIdentifier();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyInvolvedPeopleList_v23();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyLink();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyMusicCDIdentifier();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyMPEGLocationLookupTable();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyOwnership();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyPrivate();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyPlayCounter();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyPopularimeter();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyPositionSynchronization();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyRecommendedBufferSize();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyRelativeVolumeAdjustment();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyRelativeVolumeAdjustment2();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyReverb();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeySeek();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeySignature();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeySynchronizedLyric();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeySynchronizedTempoCodes();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyAlbumTitle();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyBeatsPerMinute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyComposer();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyContentType();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyCopyright();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyDate();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyEncodingTime();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyPlaylistDelay();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyOriginalReleaseTime();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyRecordingTime();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyReleaseTime();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyTaggingTime();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyEncodedBy();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyLyricist();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyFileType();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyTime();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyInvolvedPeopleList_v24();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyContentGroupDescription();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyTitleDescription();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeySubTitle();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyInitialKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyLanguage();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyLength();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyMusicianCreditsList();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyMediaType();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyMood();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyOriginalAlbumTitle();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyOriginalFilename();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyOriginalLyricist();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyOriginalArtist();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyOriginalReleaseYear();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyFileOwner();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyLeadPerformer();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyBand();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyConductor();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyModifiedBy();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyPartOfASet();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyProducedNotice();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyPublisher();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyTrackNumber();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyRecordingDates();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyInternetRadioStationName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyInternetRadioStationOwner();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeySize();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyAlbumSortOrder();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyPerformerSortOrder();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyTitleSortOrder();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyInternationalStandardRecordingCode();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyEncodedWith();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeySetSubtitle();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyYear();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyUserText();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyUniqueFileIdentifier();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyTermsOfUse();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyUnsynchronizedLyric();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyCommercialInformation();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyCopyrightInformation();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyOfficialAudioFileWebpage();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyOfficialArtistWebpage();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyOfficialAudioSourceWebpage();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyOfficialInternetRadioStationHomepage();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyPayment();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyOfficialPublisherWebpage();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyUserURL();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataKeySpaceIcy();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIcyMetadataKeyStreamTitle();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIcyMetadataKeyStreamURL();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataFormatHLSMetadata();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataExtraAttributeValueURIKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataExtraAttributeBaseURIKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataCommonIdentifierTitle();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataCommonIdentifierCreator();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataCommonIdentifierSubject();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataCommonIdentifierDescription();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataCommonIdentifierPublisher();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataCommonIdentifierContributor();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataCommonIdentifierCreationDate();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataCommonIdentifierLastModifiedDate();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataCommonIdentifierType();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataCommonIdentifierFormat();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataCommonIdentifierAssetIdentifier();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataCommonIdentifierSource();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataCommonIdentifierLanguage();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataCommonIdentifierRelation();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataCommonIdentifierLocation();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataCommonIdentifierCopyrights();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataCommonIdentifierAlbumName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataCommonIdentifierAuthor();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataCommonIdentifierArtist();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataCommonIdentifierArtwork();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataCommonIdentifierMake();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataCommonIdentifierModel();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataCommonIdentifierSoftware();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeUserDataAlbum();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeUserDataArranger();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeUserDataArtist();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeUserDataAuthor();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeUserDataChapter();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeUserDataComment();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeUserDataComposer();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeUserDataCopyright();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeUserDataCreationDate();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeUserDataDescription();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeUserDataDirector();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeUserDataDisclaimer();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeUserDataEncodedBy();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeUserDataFullName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeUserDataGenre();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeUserDataHostComputer();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeUserDataInformation();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeUserDataKeywords();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeUserDataMake();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeUserDataModel();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeUserDataOriginalArtist();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeUserDataOriginalFormat();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeUserDataOriginalSource();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeUserDataPerformers();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeUserDataProducer();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeUserDataPublisher();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeUserDataProduct();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeUserDataSoftware();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeUserDataSpecialPlaybackRequirements();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeUserDataTrack();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeUserDataWarning();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeUserDataWriter();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeUserDataURLLink();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeUserDataLocationISO6709();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeUserDataTrackName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeUserDataCredits();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeUserDataPhonogramRights();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeUserDataTaggedCharacteristic();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierISOUserDataCopyright();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierISOUserDataTaggedCharacteristic();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifier3GPUserDataCopyright();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifier3GPUserDataAuthor();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifier3GPUserDataPerformer();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifier3GPUserDataGenre();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifier3GPUserDataRecordingYear();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifier3GPUserDataLocation();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifier3GPUserDataTitle();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifier3GPUserDataDescription();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifier3GPUserDataCollection();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifier3GPUserDataUserRating();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifier3GPUserDataThumbnail();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifier3GPUserDataAlbumAndTrack();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifier3GPUserDataKeywordList();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifier3GPUserDataMediaClassification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifier3GPUserDataMediaRating();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeMetadataAuthor();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeMetadataComment();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeMetadataCopyright();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeMetadataCreationDate();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeMetadataDirector();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeMetadataDisplayName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeMetadataInformation();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeMetadataKeywords();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeMetadataProducer();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeMetadataPublisher();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeMetadataAlbum();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeMetadataArtist();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeMetadataArtwork();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeMetadataDescription();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeMetadataSoftware();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeMetadataYear();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeMetadataGenre();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeMetadataiXML();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeMetadataLocationISO6709();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeMetadataMake();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeMetadataModel();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeMetadataArranger();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeMetadataEncodedBy();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeMetadataOriginalArtist();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeMetadataPerformer();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeMetadataComposer();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeMetadataCredits();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeMetadataPhonogramRights();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeMetadataCameraIdentifier();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeMetadataCameraFrameReadoutTime();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeMetadataTitle();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeMetadataCollectionUser();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeMetadataRatingUser();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeMetadataLocationName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeMetadataLocationBody();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeMetadataLocationNote();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeMetadataLocationRole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeMetadataLocationDate();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeMetadataDirectionFacing();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeMetadataDirectionMotion();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeMetadataPreferredAffineTransform();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifieriTunesMetadataAlbum();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifieriTunesMetadataArtist();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifieriTunesMetadataUserComment();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifieriTunesMetadataCoverArt();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifieriTunesMetadataCopyright();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifieriTunesMetadataReleaseDate();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifieriTunesMetadataEncodedBy();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifieriTunesMetadataPredefinedGenre();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifieriTunesMetadataUserGenre();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifieriTunesMetadataSongName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifieriTunesMetadataTrackSubTitle();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifieriTunesMetadataEncodingTool();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifieriTunesMetadataComposer();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifieriTunesMetadataAlbumArtist();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifieriTunesMetadataAccountKind();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifieriTunesMetadataAppleID();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifieriTunesMetadataArtistID();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifieriTunesMetadataSongID();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifieriTunesMetadataDiscCompilation();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifieriTunesMetadataDiscNumber();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifieriTunesMetadataGenreID();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifieriTunesMetadataGrouping();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifieriTunesMetadataPlaylistID();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifieriTunesMetadataContentRating();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifieriTunesMetadataBeatsPerMin();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifieriTunesMetadataTrackNumber();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifieriTunesMetadataArtDirector();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifieriTunesMetadataArranger();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifieriTunesMetadataAuthor();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifieriTunesMetadataLyrics();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifieriTunesMetadataAcknowledgement();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifieriTunesMetadataConductor();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifieriTunesMetadataDescription();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifieriTunesMetadataDirector();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifieriTunesMetadataEQ();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifieriTunesMetadataLinerNotes();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifieriTunesMetadataRecordCompany();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifieriTunesMetadataOriginalArtist();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifieriTunesMetadataPhonogramRights();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifieriTunesMetadataProducer();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifieriTunesMetadataPerformer();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifieriTunesMetadataPublisher();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifieriTunesMetadataSoundEngineer();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifieriTunesMetadataSoloist();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifieriTunesMetadataCredits();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifieriTunesMetadataThanks();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifieriTunesMetadataOnlineExtras();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifieriTunesMetadataExecProducer();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataAudioEncryption();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataAttachedPicture();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataAudioSeekPointIndex();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataComments();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataCommerical();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataEncryption();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataEqualization();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataEqualization2();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataEventTimingCodes();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataGeneralEncapsulatedObject();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataGroupIdentifier();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataInvolvedPeopleList_v23();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataLink();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataMusicCDIdentifier();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataMPEGLocationLookupTable();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataOwnership();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataPrivate();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataPlayCounter();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataPopularimeter();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataPositionSynchronization();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataRecommendedBufferSize();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataRelativeVolumeAdjustment();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataRelativeVolumeAdjustment2();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataReverb();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataSeek();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataSignature();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataSynchronizedLyric();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataSynchronizedTempoCodes();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataAlbumTitle();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataBeatsPerMinute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataComposer();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataContentType();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataCopyright();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataDate();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataEncodingTime();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataPlaylistDelay();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataOriginalReleaseTime();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataRecordingTime();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataReleaseTime();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataTaggingTime();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataEncodedBy();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataLyricist();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataFileType();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataTime();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataInvolvedPeopleList_v24();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataContentGroupDescription();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataTitleDescription();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataSubTitle();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataInitialKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataLanguage();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataLength();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataMusicianCreditsList();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataMediaType();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataMood();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataOriginalAlbumTitle();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataOriginalFilename();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataOriginalLyricist();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataOriginalArtist();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataOriginalReleaseYear();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataFileOwner();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataLeadPerformer();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataBand();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataConductor();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataModifiedBy();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataPartOfASet();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataProducedNotice();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataPublisher();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataTrackNumber();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataRecordingDates();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataInternetRadioStationName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataInternetRadioStationOwner();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataSize();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataAlbumSortOrder();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataPerformerSortOrder();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataTitleSortOrder();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataInternationalStandardRecordingCode();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataEncodedWith();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataSetSubtitle();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataYear();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataUserText();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataUniqueFileIdentifier();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataTermsOfUse();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataUnsynchronizedLyric();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataCommercialInformation();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataCopyrightInformation();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataOfficialAudioFileWebpage();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataOfficialArtistWebpage();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataOfficialAudioSourceWebpage();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataOfficialInternetRadioStationHomepage();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataPayment();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataOfficialPublisherWebpage();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataUserURL();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierIcyMetadataStreamTitle();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierIcyMetadataStreamURL();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataObjectTypeFace();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataObjectTypeUPCECode();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataObjectTypeCode39Code();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataObjectTypeCode39Mod43Code();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataObjectTypeEAN13Code();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataObjectTypeEAN8Code();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataObjectTypeCode93Code();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataObjectTypeCode128Code();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataObjectTypePDF417Code();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataObjectTypeQRCode();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataObjectTypeAztecCode();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataObjectTypeInterleaved2of5Code();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataObjectTypeITF14Code();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataObjectTypeDataMatrixCode();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVOutputSettingsPreset640x480();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVOutputSettingsPreset960x540();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVOutputSettingsPreset1280x720();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVOutputSettingsPreset1920x1080();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVPlayerItemTimeJumpedNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVPlayerItemDidPlayToEndTimeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVPlayerItemFailedToPlayToEndTimeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVPlayerItemPlaybackStalledNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVPlayerItemNewAccessLogEntryNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVPlayerItemNewErrorLogEntryNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVPlayerItemFailedToPlayToEndTimeErrorKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVPlayerItemLegibleOutputTextStylingResolutionDefault();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVPlayerItemLegibleOutputTextStylingResolutionSourceAndRulesOnly();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVSampleBufferDisplayLayerFailedToDecodeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVSampleBufferDisplayLayerFailedToDecodeNotificationErrorKey();

	@Generated
	@CVariable()
	public static native float AVSpeechUtteranceMinimumSpeechRate();

	@Generated
	@CVariable()
	public static native float AVSpeechUtteranceMaximumSpeechRate();

	@Generated
	@CVariable()
	public static native float AVSpeechUtteranceDefaultSpeechRate();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVVideoCodecKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVVideoCodecH264();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVVideoCodecJPEG();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVVideoWidthKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVVideoHeightKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVVideoPixelAspectRatioKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVVideoPixelAspectRatioHorizontalSpacingKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVVideoPixelAspectRatioVerticalSpacingKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVVideoCleanApertureKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVVideoCleanApertureWidthKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVVideoCleanApertureHeightKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVVideoCleanApertureHorizontalOffsetKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVVideoCleanApertureVerticalOffsetKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVVideoScalingModeKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVVideoScalingModeFit();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVVideoScalingModeResize();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVVideoScalingModeResizeAspect();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVVideoScalingModeResizeAspectFill();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVVideoCompressionPropertiesKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVVideoAverageBitRateKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVVideoQualityKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVVideoMaxKeyFrameIntervalKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVVideoMaxKeyFrameIntervalDurationKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVVideoAllowFrameReorderingKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVVideoProfileLevelKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVVideoProfileLevelH264Baseline30();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVVideoProfileLevelH264Baseline31();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVVideoProfileLevelH264Baseline41();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVVideoProfileLevelH264BaselineAutoLevel();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVVideoProfileLevelH264Main30();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVVideoProfileLevelH264Main31();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVVideoProfileLevelH264Main32();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVVideoProfileLevelH264Main41();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVVideoProfileLevelH264MainAutoLevel();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVVideoProfileLevelH264High40();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVVideoProfileLevelH264High41();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVVideoProfileLevelH264HighAutoLevel();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVVideoH264EntropyModeKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVVideoH264EntropyModeCAVLC();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVVideoH264EntropyModeCABAC();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVVideoExpectedSourceFrameRateKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVVideoAverageNonDroppableFrameRateKey();

	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native AVBeatRange AVMakeBeatRange(double startBeat, double lengthInBeats);

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAssetDurationDidChangeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAssetChapterMetadataGroupsDidChangeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAssetMediaSelectionGroupsDidChangeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAssetResourceLoadingRequestStreamingContentKeyRequestRequiresPersistentKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAssetTrackTimeRangeDidChangeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAssetTrackSegmentsDidChangeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAssetTrackTrackAssociationsDidChangeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAssetDownloadTaskMinimumRequiredMediaBitrateKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAssetDownloadTaskMediaSelectionKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVCaptureSessionInterruptionReasonKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAudioUnitTypeOutput();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAudioUnitTypeMusicDevice();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAudioUnitTypeMusicEffect();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAudioUnitTypeFormatConverter();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAudioUnitTypeEffect();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAudioUnitTypeMixer();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAudioUnitTypePanner();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAudioUnitTypeGenerator();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAudioUnitTypeOfflineEffect();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAudioUnitTypeMIDIProcessor();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAudioUnitManufacturerNameApple();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAudioUnitComponentTagsDidChangeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAudioSessionModeSpokenAudio();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVSpeechSynthesisVoiceIdentifierAlex();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMediaTypeMetadataObject();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMediaCharacteristicLanguageTranslation();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMediaCharacteristicDubbedTranslation();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMediaCharacteristicVoiceOverTranslation();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVFileTypeEnhancedAC3();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVStreamingKeyDeliveryContentKeyType();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVStreamingKeyDeliveryPersistentContentKeyType();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataQuickTimeMetadataKeyContentIdentifier();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataID3MetadataKeyCommercial();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataExtraAttributeInfoKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeMetadataDetectedFace();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeMetadataVideoOrientation();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierQuickTimeMetadataContentIdentifier();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataIdentifierID3MetadataCommercial();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVAssetExportPreset3840x2160();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVCaptureSessionPreset3840x2160();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVOutputSettingsPreset3840x2160();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String AVMetadataKeySpaceHLSDateRange();
}
