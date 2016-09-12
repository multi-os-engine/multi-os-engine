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

package ios.audiotoolbox.enums;


import org.moe.natj.general.ann.Generated;

@Generated
public final class Enums {
	@Generated
	private Enums() {
	}

	@Generated
	public static final int kAUNodeInteraction_Connection = 0x00000001;
	@Generated
	public static final int kAUNodeInteraction_InputCallback = 0x00000002;
	@Generated
	public static final int kAudioFileUnspecifiedError = 0x7768743F;
	@Generated
	public static final int kAudioFileUnsupportedFileTypeError = 0x7479703F;
	@Generated
	public static final int kAudioFileUnsupportedDataFormatError = 0x666D743F;
	@Generated
	public static final int kAudioFileUnsupportedPropertyError = 0x7074793F;
	@Generated
	public static final int kAudioFileBadPropertySizeError = 0x2173697A;
	@Generated
	public static final int kAudioFilePermissionsError = 0x70726D3F;
	@Generated
	public static final int kAudioFileNotOptimizedError = 0x6F70746D;
	@Generated
	public static final int kAudioFileInvalidChunkError = 0x63686B3F;
	@Generated
	public static final int kAudioFileDoesNotAllow64BitDataSizeError = 0x6F66663F;
	@Generated
	public static final int kAudioFileInvalidPacketOffsetError = 0x70636B3F;
	@Generated
	public static final int kAudioFileInvalidFileError = 0x6474613F;
	@Generated
	public static final int kAudioFileOperationNotSupportedError = 0x6F703F3F;
	@Generated
	public static final int kAudioFileNotOpenError = 0xFFFFFFDA;
	@Generated
	public static final int kAudioFileEndOfFileError = 0xFFFFFFD9;
	@Generated
	public static final int kAudioFilePositionError = 0xFFFFFFD8;
	@Generated
	public static final int kAudioFileFileNotFoundError = 0xFFFFFFD5;
	@Generated
	public static final int kExtAudioFileProperty_FileDataFormat = 0x66666D74;
	@Generated
	public static final int kExtAudioFileProperty_FileChannelLayout = 0x66636C6F;
	@Generated
	public static final int kExtAudioFileProperty_ClientDataFormat = 0x63666D74;
	@Generated
	public static final int kExtAudioFileProperty_ClientChannelLayout = 0x63636C6F;
	@Generated
	public static final int kExtAudioFileProperty_CodecManufacturer = 0x636D616E;
	@Generated
	public static final int kExtAudioFileProperty_AudioConverter = 0x61636E76;
	@Generated
	public static final int kExtAudioFileProperty_AudioFile = 0x6166696C;
	@Generated
	public static final int kExtAudioFileProperty_FileMaxPacketSize = 0x666D7073;
	@Generated
	public static final int kExtAudioFileProperty_ClientMaxPacketSize = 0x636D7073;
	@Generated
	public static final int kExtAudioFileProperty_FileLengthFrames = 0x2366726D;
	@Generated
	public static final int kExtAudioFileProperty_ConverterConfig = 0x61636366;
	@Generated
	public static final int kExtAudioFileProperty_IOBufferSizeBytes = 0x696F6273;
	@Generated
	public static final int kExtAudioFileProperty_IOBuffer = 0x696F6266;
	@Generated
	public static final int kExtAudioFileProperty_PacketTable = 0x78707469;
	@Generated
	public static final int kAudioSessionOverrideAudioRoute_None = 0x00000000;
	@Generated
	public static final int kAudioSessionOverrideAudioRoute_Speaker = 0x73706B72;
	@Generated
	public static final int kAudioQueueProperty_ChannelAssignments = 0x61716361;
	@Generated
	public static final int kCAF_FileType = 0x63616666;
	@Generated
	public static final int kCAF_FileVersion_Initial = 0x00000001;
	@Generated
	public static final int kAudioServicesPropertyIsUISound = 0x69737569;
	@Generated
	public static final int kAudioServicesPropertyCompletePlaybackIfAppDies = 0x69666469;
	@Generated
	public static final int kAudioSessionNoError = 0x00000000;
	@Generated
	public static final int kAudioSessionNotInitialized = 0x21696E69;
	@Generated
	public static final int kAudioSessionAlreadyInitialized = 0x696E6974;
	@Generated
	public static final int kAudioSessionInitializationError = 0x696E693F;
	@Generated
	public static final int kAudioSessionUnsupportedPropertyError = 0x7074793F;
	@Generated
	public static final int kAudioSessionBadPropertySizeError = 0x2173697A;
	@Generated
	public static final int kAudioSessionNotActiveError = 0x21616374;
	@Generated
	public static final int kAudioServicesNoHardwareError = 0x6E6F6877;
	@Generated
	public static final int kAudioSessionNoCategorySet = 0x3F636174;
	@Generated
	public static final int kAudioSessionIncompatibleCategory = 0x21636174;
	@Generated
	public static final int kAudioSessionUnspecifiedError = 0x77686174;
	@Generated
	public static final int kAudioConverterQuality_Max = 0x0000007F;
	@Generated
	public static final int kAudioConverterQuality_High = 0x00000060;
	@Generated
	public static final int kAudioConverterQuality_Medium = 0x00000040;
	@Generated
	public static final int kAudioConverterQuality_Low = 0x00000020;
	@Generated
	public static final int kAudioConverterQuality_Min = 0x00000000;
	@Generated
	public static final int kAudioToolboxErr_InvalidSequenceType = 0xFFFFD5A2;
	@Generated
	public static final int kAudioToolboxErr_TrackIndexError = 0xFFFFD595;
	@Generated
	public static final int kAudioToolboxErr_TrackNotFound = 0xFFFFD596;
	@Generated
	public static final int kAudioToolboxErr_EndOfTrack = 0xFFFFD597;
	@Generated
	public static final int kAudioToolboxErr_StartOfTrack = 0xFFFFD598;
	@Generated
	public static final int kAudioToolboxErr_IllegalTrackDestination = 0xFFFFD599;
	@Generated
	public static final int kAudioToolboxErr_NoSequence = 0xFFFFD59A;
	@Generated
	public static final int kAudioToolboxErr_InvalidEventType = 0xFFFFD59B;
	@Generated
	public static final int kAudioToolboxErr_InvalidPlayerState = 0xFFFFD59C;
	@Generated
	public static final int kAudioToolboxErr_CannotDoInCurrentContext = 0xFFFFD591;
	@Generated
	public static final int kAudioFormatUnspecifiedError = 0x77686174;
	@Generated
	public static final int kAudioFormatUnsupportedPropertyError = 0x70726F70;
	@Generated
	public static final int kAudioFormatBadPropertySizeError = 0x2173697A;
	@Generated
	public static final int kAudioFormatBadSpecifierSizeError = 0x21737063;
	@Generated
	public static final int kAudioFormatUnsupportedDataFormatError = 0x666D743F;
	@Generated
	public static final int kAudioFormatUnknownFormatError = 0x21666D74;
	@Generated
	public static final int kAudioSessionMode_Default = 0x64666C74;
	@Generated
	public static final int kAudioSessionMode_VoiceChat = 0x76636374;
	@Generated
	public static final int kAudioSessionMode_VideoRecording = 0x76726364;
	@Generated
	public static final int kAudioSessionMode_Measurement = 0x6D736D74;
	@Generated
	public static final int kAudioSessionMode_GameChat = 0x676D6374;
	@Generated
	public static final int kAUGraphErr_NodeNotFound = 0xFFFFD594;
	@Generated
	public static final int kAUGraphErr_InvalidConnection = 0xFFFFD593;
	@Generated
	public static final int kAUGraphErr_OutputNodeErr = 0xFFFFD592;
	@Generated
	public static final int kAUGraphErr_CannotDoInCurrentContext = 0xFFFFD591;
	@Generated
	public static final int kAUGraphErr_InvalidAudioUnit = 0xFFFFD590;
	@Generated
	public static final int kAudioSessionCategory_AmbientSound = 0x616D6269;
	@Generated
	public static final int kAudioSessionCategory_SoloAmbientSound = 0x736F6C6F;
	@Generated
	public static final int kAudioSessionCategory_MediaPlayback = 0x6D656469;
	@Generated
	public static final int kAudioSessionCategory_RecordAudio = 0x72656361;
	@Generated
	public static final int kAudioSessionCategory_PlayAndRecord = 0x706C6172;
	@Generated
	public static final int kAudioSessionCategory_AudioProcessing = 0x70726F63;
	@Generated
	public static final int kAudioFileLoopDirection_NoLooping = 0x00000000;
	@Generated
	public static final int kAudioFileLoopDirection_Forward = 0x00000001;
	@Generated
	public static final int kAudioFileLoopDirection_ForwardAndBackward = 0x00000002;
	@Generated
	public static final int kAudioFileLoopDirection_Backward = 0x00000003;
	@Generated
	public static final int kCAF_StreamDescriptionChunkID = 0x64657363;
	@Generated
	public static final int kCAF_AudioDataChunkID = 0x64617461;
	@Generated
	public static final int kCAF_ChannelLayoutChunkID = 0x6368616E;
	@Generated
	public static final int kCAF_FillerChunkID = 0x66726565;
	@Generated
	public static final int kCAF_MarkerChunkID = 0x6D61726B;
	@Generated
	public static final int kCAF_RegionChunkID = 0x7265676E;
	@Generated
	public static final int kCAF_InstrumentChunkID = 0x696E7374;
	@Generated
	public static final int kCAF_MagicCookieID = 0x6B756B69;
	@Generated
	public static final int kCAF_InfoStringsChunkID = 0x696E666F;
	@Generated
	public static final int kCAF_EditCommentsChunkID = 0x65646374;
	@Generated
	public static final int kCAF_PacketTableChunkID = 0x70616B74;
	@Generated
	public static final int kCAF_StringsChunkID = 0x73747267;
	@Generated
	public static final int kCAF_UUIDChunkID = 0x75756964;
	@Generated
	public static final int kCAF_PeakChunkID = 0x7065616B;
	@Generated
	public static final int kCAF_OverviewChunkID = 0x6F767677;
	@Generated
	public static final int kCAF_MIDIChunkID = 0x6D696469;
	@Generated
	public static final int kCAF_UMIDChunkID = 0x756D6964;
	@Generated
	public static final int kCAF_FormatListID = 0x6C647363;
	@Generated
	public static final int kCAF_iXMLChunkID = 0x69584D4C;
	@Generated
	public static final int kAudioSessionInterruptionType_ShouldResume = 0x6972736D;
	@Generated
	public static final int kAudioSessionInterruptionType_ShouldNotResume = 0x2172736D;
	@Generated
	public static final int kSystemSoundID_Vibrate = 0x00000FFF;
	@Generated
	public static final int kAudioSessionSetActiveFlag_NotifyOthersOnDeactivation = 0x00000001;
	@Generated
	public static final int kAudioFileGlobalInfo_ReadableTypes = 0x61667266;
	@Generated
	public static final int kAudioFileGlobalInfo_WritableTypes = 0x61667766;
	@Generated
	public static final int kAudioFileGlobalInfo_FileTypeName = 0x66746E6D;
	@Generated
	public static final int kAudioFileGlobalInfo_AvailableStreamDescriptionsForFormat = 0x73646964;
	@Generated
	public static final int kAudioFileGlobalInfo_AvailableFormatIDs = 0x666D6964;
	@Generated
	public static final int kAudioFileGlobalInfo_AllExtensions = 0x616C7874;
	@Generated
	public static final int kAudioFileGlobalInfo_AllHFSTypeCodes = 0x61686673;
	@Generated
	public static final int kAudioFileGlobalInfo_AllUTIs = 0x61757469;
	@Generated
	public static final int kAudioFileGlobalInfo_AllMIMETypes = 0x616D696D;
	@Generated
	public static final int kAudioFileGlobalInfo_ExtensionsForType = 0x66657874;
	@Generated
	public static final int kAudioFileGlobalInfo_HFSTypeCodesForType = 0x66686673;
	@Generated
	public static final int kAudioFileGlobalInfo_UTIsForType = 0x66757469;
	@Generated
	public static final int kAudioFileGlobalInfo_MIMETypesForType = 0x666D696D;
	@Generated
	public static final int kAudioFileGlobalInfo_TypesForMIMEType = 0x746D696D;
	@Generated
	public static final int kAudioFileGlobalInfo_TypesForUTI = 0x74757469;
	@Generated
	public static final int kAudioFileGlobalInfo_TypesForHFSTypeCode = 0x74686673;
	@Generated
	public static final int kAudioFileGlobalInfo_TypesForExtension = 0x74657874;
	@Generated
	public static final int kConverterPrimeMethod_Pre = 0x00000000;
	@Generated
	public static final int kConverterPrimeMethod_Normal = 0x00000001;
	@Generated
	public static final int kConverterPrimeMethod_None = 0x00000002;
	@Generated
	public static final int kAudioFormatProperty_FormatInfo = 0x666D7469;
	@Generated
	public static final int kAudioFormatProperty_FormatName = 0x666E616D;
	@Generated
	public static final int kAudioFormatProperty_EncodeFormatIDs = 0x61636F66;
	@Generated
	public static final int kAudioFormatProperty_DecodeFormatIDs = 0x61636966;
	@Generated
	public static final int kAudioFormatProperty_FormatList = 0x666C7374;
	@Generated
	public static final int kAudioFormatProperty_ASBDFromESDS = 0x65737364;
	@Generated
	public static final int kAudioFormatProperty_ChannelLayoutFromESDS = 0x6573636C;
	@Generated
	public static final int kAudioFormatProperty_OutputFormatList = 0x6F666C73;
	@Generated
	public static final int kAudioFormatProperty_FirstPlayableFormatFromList = 0x6670666C;
	@Generated
	public static final int kAudioFormatProperty_FormatIsVBR = 0x66766272;
	@Generated
	public static final int kAudioFormatProperty_FormatIsExternallyFramed = 0x66657866;
	@Generated
	public static final int kAudioFormatProperty_FormatIsEncrypted = 0x63727970;
	@Generated
	public static final int kAudioFormatProperty_Encoders = 0x6176656E;
	@Generated
	public static final int kAudioFormatProperty_Decoders = 0x61766465;
	@Generated
	public static final int kAudioFormatProperty_AvailableEncodeBitRates = 0x61656272;
	@Generated
	public static final int kAudioFormatProperty_AvailableEncodeSampleRates = 0x61657372;
	@Generated
	public static final int kAudioFormatProperty_AvailableEncodeChannelLayoutTags = 0x6165636C;
	@Generated
	public static final int kAudioFormatProperty_AvailableEncodeNumberChannels = 0x61766E63;
	@Generated
	public static final int kAudioFormatProperty_ASBDFromMPEGPacket = 0x61646D70;
	@Generated
	public static final int kAudioFormatProperty_BitmapForLayoutTag = 0x626D7467;
	@Generated
	public static final int kAudioFormatProperty_MatrixMixMap = 0x6D6D6170;
	@Generated
	public static final int kAudioFormatProperty_ChannelMap = 0x63686D70;
	@Generated
	public static final int kAudioFormatProperty_NumberOfChannelsForLayout = 0x6E63686D;
	@Generated
	public static final int kAudioFormatProperty_AreChannelLayoutsEquivalent = 0x63686571;
	@Generated
	public static final int kAudioFormatProperty_ChannelLayoutHash = 0x63686861;
	@Generated
	public static final int kAudioFormatProperty_ValidateChannelLayout = 0x7661636C;
	@Generated
	public static final int kAudioFormatProperty_ChannelLayoutForTag = 0x636D706C;
	@Generated
	public static final int kAudioFormatProperty_TagForChannelLayout = 0x636D7074;
	@Generated
	public static final int kAudioFormatProperty_ChannelLayoutName = 0x6C6F6E6D;
	@Generated
	public static final int kAudioFormatProperty_ChannelLayoutSimpleName = 0x6C736E6D;
	@Generated
	public static final int kAudioFormatProperty_ChannelLayoutForBitmap = 0x636D7062;
	@Generated
	public static final int kAudioFormatProperty_ChannelName = 0x636E616D;
	@Generated
	public static final int kAudioFormatProperty_ChannelShortName = 0x63736E6D;
	@Generated
	public static final int kAudioFormatProperty_TagsForNumberOfChannels = 0x74616763;
	@Generated
	public static final int kAudioFormatProperty_PanningMatrix = 0x70616E6D;
	@Generated
	public static final int kAudioFormatProperty_BalanceFade = 0x62616C66;
	@Generated
	public static final int kAudioFormatProperty_ID3TagSize = 0x69643373;
	@Generated
	public static final int kAudioFormatProperty_ID3TagToDictionary = 0x69643364;
	@Generated
	public static final int kAudioQueueHardwareCodecPolicy_Default = 0x00000000;
	@Generated
	public static final int kAudioQueueHardwareCodecPolicy_UseSoftwareOnly = 0x00000001;
	@Generated
	public static final int kAudioQueueHardwareCodecPolicy_UseHardwareOnly = 0x00000002;
	@Generated
	public static final int kAudioQueueHardwareCodecPolicy_PreferSoftware = 0x00000003;
	@Generated
	public static final int kAudioQueueHardwareCodecPolicy_PreferHardware = 0x00000004;
	@Generated
	public static final int kAudioQueueProperty_HardwareCodecPolicy = 0x61716370;
	@Generated
	public static final int kAudioQueueTimePitchAlgorithm_Spectral = 0x73706563;
	@Generated
	public static final int kAudioQueueTimePitchAlgorithm_TimeDomain = 0x7469646F;
	@Generated
	public static final int kAudioQueueTimePitchAlgorithm_LowQualityZeroLatency = 0x6C717A6C;
	@Generated
	public static final int kAudioQueueTimePitchAlgorithm_Varispeed = 0x76737064;
	@Generated
	public static final int kMusicEventType_NULL = 0x00000000;
	@Generated
	public static final int kMusicEventType_ExtendedNote = 0x00000001;
	@Generated
	public static final int kMusicEventType_ExtendedTempo = 0x00000003;
	@Generated
	public static final int kMusicEventType_User = 0x00000004;
	@Generated
	public static final int kMusicEventType_Meta = 0x00000005;
	@Generated
	public static final int kMusicEventType_MIDINoteMessage = 0x00000006;
	@Generated
	public static final int kMusicEventType_MIDIChannelMessage = 0x00000007;
	@Generated
	public static final int kMusicEventType_MIDIRawData = 0x00000008;
	@Generated
	public static final int kMusicEventType_Parameter = 0x00000009;
	@Generated
	public static final int kMusicEventType_AUPreset = 0x0000000A;
	@Generated
	public static final int kAudioFileAIFFType = 0x41494646;
	@Generated
	public static final int kAudioFileAIFCType = 0x41494643;
	@Generated
	public static final int kAudioFileWAVEType = 0x57415645;
	@Generated
	public static final int kAudioFileSoundDesigner2Type = 0x53643266;
	@Generated
	public static final int kAudioFileNextType = 0x4E655854;
	@Generated
	public static final int kAudioFileMP3Type = 0x4D504733;
	@Generated
	public static final int kAudioFileMP2Type = 0x4D504732;
	@Generated
	public static final int kAudioFileMP1Type = 0x4D504731;
	@Generated
	public static final int kAudioFileAC3Type = 0x61632D33;
	@Generated
	public static final int kAudioFileAAC_ADTSType = 0x61647473;
	@Generated
	public static final int kAudioFileMPEG4Type = 0x6D703466;
	@Generated
	public static final int kAudioFileM4AType = 0x6D346166;
	@Generated
	public static final int kAudioFileM4BType = 0x6D346266;
	@Generated
	public static final int kAudioFileCAFType = 0x63616666;
	@Generated
	public static final int kAudioFile3GPType = 0x33677070;
	@Generated
	public static final int kAudioFile3GP2Type = 0x33677032;
	@Generated
	public static final int kAudioFileAMRType = 0x616D7266;
	@Generated
	public static final int kAudioSessionCategory_UserInterfaceSoundEffects = 0x75696678;
	@Generated
	public static final int kAudioSessionCategory_LiveAudio = 0x6C697665;
	@Generated
	public static final int kAudioFormatProperty_HardwareCodecCapabilities = 0x68776363;
	@Generated
	public static final int kAudioQueueParam_Volume = 0x00000001;
	@Generated
	public static final int kAudioQueueParam_PlayRate = 0x00000002;
	@Generated
	public static final int kAudioQueueParam_Pitch = 0x00000003;
	@Generated
	public static final int kAudioQueueParam_VolumeRampTime = 0x00000004;
	@Generated
	public static final int kAudioQueueParam_Pan = 0x0000000D;
	@Generated
	public static final int kAudioSessionBeginInterruption = 0x00000001;
	@Generated
	public static final int kAudioSessionEndInterruption = 0x00000000;
	@Generated
	public static final int kCAF_SMPTE_TimeTypeNone = 0x00000000;
	@Generated
	public static final int kCAF_SMPTE_TimeType24 = 0x00000001;
	@Generated
	public static final int kCAF_SMPTE_TimeType25 = 0x00000002;
	@Generated
	public static final int kCAF_SMPTE_TimeType30Drop = 0x00000003;
	@Generated
	public static final int kCAF_SMPTE_TimeType30 = 0x00000004;
	@Generated
	public static final int kCAF_SMPTE_TimeType2997 = 0x00000005;
	@Generated
	public static final int kCAF_SMPTE_TimeType2997Drop = 0x00000006;
	@Generated
	public static final int kCAF_SMPTE_TimeType60 = 0x00000007;
	@Generated
	public static final int kCAF_SMPTE_TimeType5994 = 0x00000008;
	@Generated
	public static final int kCAF_SMPTE_TimeType60Drop = 0x00000009;
	@Generated
	public static final int kCAF_SMPTE_TimeType5994Drop = 0x0000000A;
	@Generated
	public static final int kCAF_SMPTE_TimeType50 = 0x0000000B;
	@Generated
	public static final int kCAF_SMPTE_TimeType2398 = 0x0000000C;
	@Generated
	public static final int kAudioConverterSampleRateConverterComplexity_Linear = 0x6C696E65;
	@Generated
	public static final int kAudioConverterSampleRateConverterComplexity_Normal = 0x6E6F726D;
	@Generated
	public static final int kAudioConverterSampleRateConverterComplexity_Mastering = 0x62617473;
	@Generated
	public static final int kAudioConverterPropertyCanResumeFromInterruption = 0x63726669;
	@Generated
	public static final int kAudioServicesNoError = 0x00000000;
	@Generated
	public static final int kAudioServicesUnsupportedPropertyError = 0x7074793F;
	@Generated
	public static final int kAudioServicesBadPropertySizeError = 0x2173697A;
	@Generated
	public static final int kAudioServicesBadSpecifierSizeError = 0x21737063;
	@Generated
	public static final int kAudioServicesSystemSoundUnspecifiedError = 0xFFFFFA24;
	@Generated
	public static final int kAudioServicesSystemSoundClientTimedOutError = 0xFFFFFA23;
	@Generated
	public static final int kAudioConverterPropertyMinimumInputBufferSize = 0x6D696273;
	@Generated
	public static final int kAudioConverterPropertyMinimumOutputBufferSize = 0x6D6F6273;
	@Generated
	public static final int kAudioConverterPropertyMaximumInputBufferSize = 0x78696273;
	@Generated
	public static final int kAudioConverterPropertyMaximumInputPacketSize = 0x78697073;
	@Generated
	public static final int kAudioConverterPropertyMaximumOutputPacketSize = 0x786F7073;
	@Generated
	public static final int kAudioConverterPropertyCalculateInputBufferSize = 0x63696273;
	@Generated
	public static final int kAudioConverterPropertyCalculateOutputBufferSize = 0x636F6273;
	@Generated
	public static final int kAudioConverterPropertyInputCodecParameters = 0x69636470;
	@Generated
	public static final int kAudioConverterPropertyOutputCodecParameters = 0x6F636470;
	@Generated
	public static final int kAudioConverterSampleRateConverterAlgorithm = 0x73726369;
	@Generated
	public static final int kAudioConverterSampleRateConverterComplexity = 0x73726361;
	@Generated
	public static final int kAudioConverterSampleRateConverterQuality = 0x73726371;
	@Generated
	public static final int kAudioConverterSampleRateConverterInitialPhase = 0x73726370;
	@Generated
	public static final int kAudioConverterCodecQuality = 0x63647175;
	@Generated
	public static final int kAudioConverterPrimeMethod = 0x70726D6D;
	@Generated
	public static final int kAudioConverterPrimeInfo = 0x7072696D;
	@Generated
	public static final int kAudioConverterChannelMap = 0x63686D70;
	@Generated
	public static final int kAudioConverterDecompressionMagicCookie = 0x646D6763;
	@Generated
	public static final int kAudioConverterCompressionMagicCookie = 0x636D6763;
	@Generated
	public static final int kAudioConverterEncodeBitRate = 0x62726174;
	@Generated
	public static final int kAudioConverterEncodeAdjustableSampleRate = 0x616A7372;
	@Generated
	public static final int kAudioConverterInputChannelLayout = 0x69636C20;
	@Generated
	public static final int kAudioConverterOutputChannelLayout = 0x6F636C20;
	@Generated
	public static final int kAudioConverterApplicableEncodeBitRates = 0x61656272;
	@Generated
	public static final int kAudioConverterAvailableEncodeBitRates = 0x76656272;
	@Generated
	public static final int kAudioConverterApplicableEncodeSampleRates = 0x61657372;
	@Generated
	public static final int kAudioConverterAvailableEncodeSampleRates = 0x76657372;
	@Generated
	public static final int kAudioConverterAvailableEncodeChannelLayoutTags = 0x6165636C;
	@Generated
	public static final int kAudioConverterCurrentOutputStreamDescription = 0x61636F64;
	@Generated
	public static final int kAudioConverterCurrentInputStreamDescription = 0x61636964;
	@Generated
	public static final int kAudioConverterPropertySettings = 0x61637073;
	@Generated
	public static final int kAudioConverterPropertyBitDepthHint = 0x61636264;
	@Generated
	public static final int kAudioConverterPropertyFormatList = 0x666C7374;
	@Generated
	public static final int kAudioSessionProperty_AudioRoute = 0x726F7574;
	@Generated
	public static final int kAudioDecoderComponentType = 0x61646563;
	@Generated
	public static final int kAudioEncoderComponentType = 0x61656E63;
	@Generated
	public static final int kCAFMarkerType_Generic = 0x00000000;
	@Generated
	public static final int kCAFMarkerType_ProgramStart = 0x70626567;
	@Generated
	public static final int kCAFMarkerType_ProgramEnd = 0x70656E64;
	@Generated
	public static final int kCAFMarkerType_TrackStart = 0x74626567;
	@Generated
	public static final int kCAFMarkerType_TrackEnd = 0x74656E64;
	@Generated
	public static final int kCAFMarkerType_Index = 0x696E6478;
	@Generated
	public static final int kCAFMarkerType_RegionStart = 0x72626567;
	@Generated
	public static final int kCAFMarkerType_RegionEnd = 0x72656E64;
	@Generated
	public static final int kCAFMarkerType_RegionSyncPoint = 0x72737963;
	@Generated
	public static final int kCAFMarkerType_SelectionStart = 0x73626567;
	@Generated
	public static final int kCAFMarkerType_SelectionEnd = 0x73656E64;
	@Generated
	public static final int kCAFMarkerType_EditSourceBegin = 0x63626567;
	@Generated
	public static final int kCAFMarkerType_EditSourceEnd = 0x63656E64;
	@Generated
	public static final int kCAFMarkerType_EditDestinationBegin = 0x64626567;
	@Generated
	public static final int kCAFMarkerType_EditDestinationEnd = 0x64656E64;
	@Generated
	public static final int kCAFMarkerType_SustainLoopStart = 0x736C6267;
	@Generated
	public static final int kCAFMarkerType_SustainLoopEnd = 0x736C656E;
	@Generated
	public static final int kCAFMarkerType_ReleaseLoopStart = 0x726C6267;
	@Generated
	public static final int kCAFMarkerType_ReleaseLoopEnd = 0x726C656E;
	@Generated
	public static final int kCAFMarkerType_SavedPlayPosition = 0x73706C79;
	@Generated
	public static final int kCAFMarkerType_Tempo = 0x746D706F;
	@Generated
	public static final int kCAFMarkerType_TimeSignature = 0x74736967;
	@Generated
	public static final int kCAFMarkerType_KeySignature = 0x6B736967;
	@Generated
	public static final int kAudioSessionProperty_PreferredHardwareSampleRate = 0x68777372;
	@Generated
	public static final int kAudioSessionProperty_PreferredHardwareIOBufferDuration = 0x696F6264;
	@Generated
	public static final int kAudioSessionProperty_AudioCategory = 0x61636174;
	@Generated
	public static final int kAudioSessionProperty_AudioRouteChange = 0x726F6368;
	@Generated
	public static final int kAudioSessionProperty_CurrentHardwareSampleRate = 0x63687372;
	@Generated
	public static final int kAudioSessionProperty_CurrentHardwareInputNumberChannels = 0x63686963;
	@Generated
	public static final int kAudioSessionProperty_CurrentHardwareOutputNumberChannels = 0x63686F63;
	@Generated
	public static final int kAudioSessionProperty_CurrentHardwareOutputVolume = 0x63686F76;
	@Generated
	public static final int kAudioSessionProperty_CurrentHardwareInputLatency = 0x63696C74;
	@Generated
	public static final int kAudioSessionProperty_CurrentHardwareOutputLatency = 0x636F6C74;
	@Generated
	public static final int kAudioSessionProperty_CurrentHardwareIOBufferDuration = 0x63686264;
	@Generated
	public static final int kAudioSessionProperty_OtherAudioIsPlaying = 0x6F746872;
	@Generated
	public static final int kAudioSessionProperty_OverrideAudioRoute = 0x6F767264;
	@Generated
	public static final int kAudioSessionProperty_AudioInputAvailable = 0x61696176;
	@Generated
	public static final int kAudioSessionProperty_ServerDied = 0x64696564;
	@Generated
	public static final int kAudioSessionProperty_OtherMixableAudioShouldDuck = 0x6475636B;
	@Generated
	public static final int kAudioSessionProperty_OverrideCategoryMixWithOthers = 0x636D6978;
	@Generated
	public static final int kAudioSessionProperty_OverrideCategoryDefaultToSpeaker = 0x6373706B;
	@Generated
	public static final int kAudioSessionProperty_OverrideCategoryEnableBluetoothInput = 0x63626C75;
	@Generated
	public static final int kAudioSessionProperty_InterruptionType = 0x74797065;
	@Generated
	public static final int kAudioSessionProperty_Mode = 0x6D6F6465;
	@Generated
	public static final int kAudioSessionProperty_InputSources = 0x73726373;
	@Generated
	public static final int kAudioSessionProperty_OutputDestinations = 0x64737473;
	@Generated
	public static final int kAudioSessionProperty_InputSource = 0x69737263;
	@Generated
	public static final int kAudioSessionProperty_OutputDestination = 0x6F647374;
	@Generated
	public static final int kAudioSessionProperty_InputGainAvailable = 0x69676176;
	@Generated
	public static final int kAudioSessionProperty_InputGainScalar = 0x69677363;
	@Generated
	public static final int kAudioSessionProperty_AudioRouteDescription = 0x63726172;
	@Generated
	public static final int kAudioQueueProperty_IsRunning = 0x6171726E;
	@Generated
	public static final int kAudioQueueDeviceProperty_SampleRate = 0x61717372;
	@Generated
	public static final int kAudioQueueDeviceProperty_NumberChannels = 0x61716463;
	@Generated
	public static final int kAudioQueueProperty_CurrentDevice = 0x61716364;
	@Generated
	public static final int kAudioQueueProperty_MagicCookie = 0x61716D63;
	@Generated
	public static final int kAudioQueueProperty_MaximumOutputPacketSize = 0x786F7073;
	@Generated
	public static final int kAudioQueueProperty_StreamDescription = 0x61716674;
	@Generated
	public static final int kAudioQueueProperty_ChannelLayout = 0x6171636C;
	@Generated
	public static final int kAudioQueueProperty_EnableLevelMetering = 0x61716D65;
	@Generated
	public static final int kAudioQueueProperty_CurrentLevelMeter = 0x61716D76;
	@Generated
	public static final int kAudioQueueProperty_CurrentLevelMeterDB = 0x61716D64;
	@Generated
	public static final int kAudioQueueProperty_DecodeBufferSizeFrames = 0x64636266;
	@Generated
	public static final int kAudioQueueProperty_ConverterError = 0x71637665;
	@Generated
	public static final int kAudioQueueProperty_EnableTimePitch = 0x715F7470;
	@Generated
	public static final int kAudioQueueProperty_TimePitchAlgorithm = 0x71747061;
	@Generated
	public static final int kAudioQueueProperty_TimePitchBypass = 0x71747062;
	@Generated
	public static final int kAudioSessionRouteChangeReason_Unknown = 0x00000000;
	@Generated
	public static final int kAudioSessionRouteChangeReason_NewDeviceAvailable = 0x00000001;
	@Generated
	public static final int kAudioSessionRouteChangeReason_OldDeviceUnavailable = 0x00000002;
	@Generated
	public static final int kAudioSessionRouteChangeReason_CategoryChange = 0x00000003;
	@Generated
	public static final int kAudioSessionRouteChangeReason_Override = 0x00000004;
	@Generated
	public static final int kAudioSessionRouteChangeReason_WakeFromSleep = 0x00000006;
	@Generated
	public static final int kAudioSessionRouteChangeReason_NoSuitableRouteForCategory = 0x00000007;
	@Generated
	public static final int kAudioSessionRouteChangeReason_RouteConfigurationChange = 0x00000008;
	@Generated
	public static final int kAudioFileStreamProperty_ReadyToProducePackets = 0x72656479;
	@Generated
	public static final int kAudioFileStreamProperty_FileFormat = 0x66666D74;
	@Generated
	public static final int kAudioFileStreamProperty_DataFormat = 0x64666D74;
	@Generated
	public static final int kAudioFileStreamProperty_FormatList = 0x666C7374;
	@Generated
	public static final int kAudioFileStreamProperty_MagicCookieData = 0x6D676963;
	@Generated
	public static final int kAudioFileStreamProperty_AudioDataByteCount = 0x62636E74;
	@Generated
	public static final int kAudioFileStreamProperty_AudioDataPacketCount = 0x70636E74;
	@Generated
	public static final int kAudioFileStreamProperty_MaximumPacketSize = 0x70737A65;
	@Generated
	public static final int kAudioFileStreamProperty_DataOffset = 0x646F6666;
	@Generated
	public static final int kAudioFileStreamProperty_ChannelLayout = 0x636D6170;
	@Generated
	public static final int kAudioFileStreamProperty_PacketToFrame = 0x706B6672;
	@Generated
	public static final int kAudioFileStreamProperty_FrameToPacket = 0x6672706B;
	@Generated
	public static final int kAudioFileStreamProperty_PacketToByte = 0x706B6279;
	@Generated
	public static final int kAudioFileStreamProperty_ByteToPacket = 0x6279706B;
	@Generated
	public static final int kAudioFileStreamProperty_PacketTableInfo = 0x706E666F;
	@Generated
	public static final int kAudioFileStreamProperty_PacketSizeUpperBound = 0x706B7562;
	@Generated
	public static final int kAudioFileStreamProperty_AverageBytesPerPacket = 0x61627070;
	@Generated
	public static final int kAudioFileStreamProperty_BitRate = 0x62726174;
	@Generated
	public static final int kAudioFileStreamProperty_InfoDictionary = 0x696E666F;
	@Generated
	public static final int kAudioFileMarkerType_Generic = 0x00000000;
	@Generated
	public static final int kExtAudioFileError_CodecUnavailableInputConsumed = 0xFFFEFC01;
	@Generated
	public static final int kExtAudioFileError_CodecUnavailableInputNotConsumed = 0xFFFEFC00;
	@Generated
	public static final int kExtAudioFileError_InvalidProperty = 0xFFFEFBFF;
	@Generated
	public static final int kExtAudioFileError_InvalidPropertySize = 0xFFFEFBFE;
	@Generated
	public static final int kExtAudioFileError_NonPCMClientFormat = 0xFFFEFBFD;
	@Generated
	public static final int kExtAudioFileError_InvalidChannelMap = 0xFFFEFBFC;
	@Generated
	public static final int kExtAudioFileError_InvalidOperationOrder = 0xFFFEFBFB;
	@Generated
	public static final int kExtAudioFileError_InvalidDataFormat = 0xFFFEFBFA;
	@Generated
	public static final int kExtAudioFileError_MaxPacketSizeUnknown = 0xFFFEFBF9;
	@Generated
	public static final int kExtAudioFileError_InvalidSeek = 0xFFFEFBF8;
	@Generated
	public static final int kExtAudioFileError_AsyncWriteTooLarge = 0xFFFEFBF7;
	@Generated
	public static final int kExtAudioFileError_AsyncWriteBufferOverflow = 0xFFFEFBF6;
	@Generated
	public static final int kAudioConverterErr_FormatNotSupported = 0x666D743F;
	@Generated
	public static final int kAudioConverterErr_OperationNotSupported = 0x6F703F3F;
	@Generated
	public static final int kAudioConverterErr_PropertyNotSupported = 0x70726F70;
	@Generated
	public static final int kAudioConverterErr_InvalidInputSize = 0x696E737A;
	@Generated
	public static final int kAudioConverterErr_InvalidOutputSize = 0x6F74737A;
	@Generated
	public static final int kAudioConverterErr_UnspecifiedError = 0x77686174;
	@Generated
	public static final int kAudioConverterErr_BadPropertySizeError = 0x2173697A;
	@Generated
	public static final int kAudioConverterErr_RequiresPacketDescriptionsError = 0x21706B64;
	@Generated
	public static final int kAudioConverterErr_InputSampleRateOutOfRange = 0x21697372;
	@Generated
	public static final int kAudioConverterErr_OutputSampleRateOutOfRange = 0x216F7372;
	@Generated
	public static final int kAudioFileStreamError_UnsupportedFileType = 0x7479703F;
	@Generated
	public static final int kAudioFileStreamError_UnsupportedDataFormat = 0x666D743F;
	@Generated
	public static final int kAudioFileStreamError_UnsupportedProperty = 0x7074793F;
	@Generated
	public static final int kAudioFileStreamError_BadPropertySize = 0x2173697A;
	@Generated
	public static final int kAudioFileStreamError_NotOptimized = 0x6F70746D;
	@Generated
	public static final int kAudioFileStreamError_InvalidPacketOffset = 0x70636B3F;
	@Generated
	public static final int kAudioFileStreamError_InvalidFile = 0x6474613F;
	@Generated
	public static final int kAudioFileStreamError_ValueUnknown = 0x756E6B3F;
	@Generated
	public static final int kAudioFileStreamError_DataUnavailable = 0x6D6F7265;
	@Generated
	public static final int kAudioFileStreamError_IllegalOperation = 0x6E6F7065;
	@Generated
	public static final int kAudioFileStreamError_UnspecifiedError = 0x7768743F;
	@Generated
	public static final int kAudioFileStreamError_DiscontinuityCantRecover = 0x64736321;
	@Generated
	public static final int kAudioQueueErr_InvalidBuffer = 0xFFFEFB81;
	@Generated
	public static final int kAudioQueueErr_BufferEmpty = 0xFFFEFB82;
	@Generated
	public static final int kAudioQueueErr_DisposalPending = 0xFFFEFB83;
	@Generated
	public static final int kAudioQueueErr_InvalidProperty = 0xFFFEFB84;
	@Generated
	public static final int kAudioQueueErr_InvalidPropertySize = 0xFFFEFB85;
	@Generated
	public static final int kAudioQueueErr_InvalidParameter = 0xFFFEFB86;
	@Generated
	public static final int kAudioQueueErr_CannotStart = 0xFFFEFB87;
	@Generated
	public static final int kAudioQueueErr_InvalidDevice = 0xFFFEFB88;
	@Generated
	public static final int kAudioQueueErr_BufferInQueue = 0xFFFEFB89;
	@Generated
	public static final int kAudioQueueErr_InvalidRunState = 0xFFFEFB8A;
	@Generated
	public static final int kAudioQueueErr_InvalidQueueType = 0xFFFEFB8B;
	@Generated
	public static final int kAudioQueueErr_Permissions = 0xFFFEFB8C;
	@Generated
	public static final int kAudioQueueErr_InvalidPropertyValue = 0xFFFEFB8D;
	@Generated
	public static final int kAudioQueueErr_PrimeTimedOut = 0xFFFEFB8E;
	@Generated
	public static final int kAudioQueueErr_CodecNotFound = 0xFFFEFB8F;
	@Generated
	public static final int kAudioQueueErr_InvalidCodecAccess = 0xFFFEFB90;
	@Generated
	public static final int kAudioQueueErr_QueueInvalidated = 0xFFFEFB91;
	@Generated
	public static final int kAudioQueueErr_TooManyTaps = 0xFFFEFB92;
	@Generated
	public static final int kAudioQueueErr_InvalidTapContext = 0xFFFEFB93;
	@Generated
	public static final int kAudioQueueErr_RecordUnderrun = 0xFFFEFB94;
	@Generated
	public static final int kAudioQueueErr_InvalidTapType = 0xFFFEFB95;
	@Generated
	public static final int kAudioQueueErr_BufferEnqueuedTwice = 0xFFFEFB96;
	@Generated
	public static final int kAudioQueueErr_EnqueueDuringReset = 0xFFFEFBB8;
	@Generated
	public static final int kAudioQueueErr_InvalidOfflineMode = 0xFFFEFBBE;
	@Generated
	public static final int kAppleSoftwareAudioCodecManufacturer = 0x6170706C;
	@Generated
	public static final int kAppleHardwareAudioCodecManufacturer = 0x61706877;
	@Generated
	public static final int kAudioFilePropertyFileFormat = 0x66666D74;
	@Generated
	public static final int kAudioFilePropertyDataFormat = 0x64666D74;
	@Generated
	public static final int kAudioFilePropertyIsOptimized = 0x6F70746D;
	@Generated
	public static final int kAudioFilePropertyMagicCookieData = 0x6D676963;
	@Generated
	public static final int kAudioFilePropertyAudioDataByteCount = 0x62636E74;
	@Generated
	public static final int kAudioFilePropertyAudioDataPacketCount = 0x70636E74;
	@Generated
	public static final int kAudioFilePropertyMaximumPacketSize = 0x70737A65;
	@Generated
	public static final int kAudioFilePropertyDataOffset = 0x646F6666;
	@Generated
	public static final int kAudioFilePropertyChannelLayout = 0x636D6170;
	@Generated
	public static final int kAudioFilePropertyDeferSizeUpdates = 0x64737A75;
	@Generated
	public static final int kAudioFilePropertyDataFormatName = 0x666E6D65;
	@Generated
	public static final int kAudioFilePropertyMarkerList = 0x6D6B6C73;
	@Generated
	public static final int kAudioFilePropertyRegionList = 0x72676C73;
	@Generated
	public static final int kAudioFilePropertyPacketToFrame = 0x706B6672;
	@Generated
	public static final int kAudioFilePropertyFrameToPacket = 0x6672706B;
	@Generated
	public static final int kAudioFilePropertyPacketToByte = 0x706B6279;
	@Generated
	public static final int kAudioFilePropertyByteToPacket = 0x6279706B;
	@Generated
	public static final int kAudioFilePropertyChunkIDs = 0x63686964;
	@Generated
	public static final int kAudioFilePropertyInfoDictionary = 0x696E666F;
	@Generated
	public static final int kAudioFilePropertyPacketTableInfo = 0x706E666F;
	@Generated
	public static final int kAudioFilePropertyFormatList = 0x666C7374;
	@Generated
	public static final int kAudioFilePropertyPacketSizeUpperBound = 0x706B7562;
	@Generated
	public static final int kAudioFilePropertyReserveDuration = 0x72737276;
	@Generated
	public static final int kAudioFilePropertyEstimatedDuration = 0x65647572;
	@Generated
	public static final int kAudioFilePropertyBitRate = 0x62726174;
	@Generated
	public static final int kAudioFilePropertyID3Tag = 0x69643374;
	@Generated
	public static final int kAudioFilePropertySourceBitDepth = 0x73627464;
	@Generated
	public static final int kAudioFilePropertyAlbumArtwork = 0x61617274;
	@Generated
	public static final int kAudioFilePropertyAudioTrackCount = 0x61746374;
	@Generated
	public static final int kAudioFilePropertyUseAudioTrack = 0x7561746B;
	@Generated
	public static final int kAudioConverterErr_HardwareInUse = 0x68776975;
	@Generated
	public static final int kAudioConverterErr_NoHardwarePermission = 0x7065726D;
	@Generated
	public static final int kSequenceTrackProperty_LoopInfo = 0x00000000;
	@Generated
	public static final int kSequenceTrackProperty_OffsetTime = 0x00000001;
	@Generated
	public static final int kSequenceTrackProperty_MuteStatus = 0x00000002;
	@Generated
	public static final int kSequenceTrackProperty_SoloStatus = 0x00000003;
	@Generated
	public static final int kSequenceTrackProperty_AutomatedParameters = 0x00000004;
	@Generated
	public static final int kSequenceTrackProperty_TrackLength = 0x00000005;
	@Generated
	public static final int kSequenceTrackProperty_TimeResolution = 0x00000006;
	@Generated
	public static final int kAudioToolboxError_NoTrackDestination = 0xFFFEFB60;
}
