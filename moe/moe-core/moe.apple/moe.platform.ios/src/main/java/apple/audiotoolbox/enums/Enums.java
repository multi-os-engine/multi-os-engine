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

package apple.audiotoolbox.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class Enums {
    /**
     * range  (2000 -> 2999)
     */
    @Generated public static final int kAudioOutputUnitProperty_CurrentDevice = 0x000007D0;
    /**
     * this will also work with AUConverter
     */
    @Generated public static final int kAudioOutputUnitProperty_ChannelMap = 0x000007D2;
    @Generated public static final int kAudioOutputUnitProperty_EnableIO = 0x000007D3;
    @Generated public static final int kAudioOutputUnitProperty_StartTime = 0x000007D4;
    @Generated public static final int kAudioOutputUnitProperty_SetInputCallback = 0x000007D5;
    @Generated public static final int kAudioOutputUnitProperty_HasIO = 0x000007D6;
    /**
     * this will also work with AUConverter
     */
    @Generated public static final int kAudioOutputUnitProperty_StartTimestampsAtZero = 0x000007D7;
    @Generated public static final int kAudioUnitSubType_GenericOutput = 0x67656E72;
    @Generated public static final int kAudioUnitSubType_VoiceProcessingIO = 0x7670696F;
    /**
     * 0x7768743F, 2003334207
     */
    @Generated public static final int kAudioFileUnspecifiedError = 0x7768743F;
    /**
     * 0x7479703F, 1954115647
     */
    @Generated public static final int kAudioFileUnsupportedFileTypeError = 0x7479703F;
    /**
     * 0x666D743F, 1718449215
     */
    @Generated public static final int kAudioFileUnsupportedDataFormatError = 0x666D743F;
    /**
     * 0x7074793F, 1886681407
     */
    @Generated public static final int kAudioFileUnsupportedPropertyError = 0x7074793F;
    /**
     * 0x2173697A,  561211770
     */
    @Generated public static final int kAudioFileBadPropertySizeError = 0x2173697A;
    /**
     * 0x70726D3F, 1886547263
     */
    @Generated public static final int kAudioFilePermissionsError = 0x70726D3F;
    /**
     * 0x6F70746D, 1869640813
     */
    @Generated public static final int kAudioFileNotOptimizedError = 0x6F70746D;
    /**
     * 0x63686B3F, 1667787583
     */
    @Generated public static final int kAudioFileInvalidChunkError = 0x63686B3F;
    /**
     * 0x6F66663F, 1868981823
     */
    @Generated public static final int kAudioFileDoesNotAllow64BitDataSizeError = 0x6F66663F;
    /**
     * 0x70636B3F, 1885563711
     */
    @Generated public static final int kAudioFileInvalidPacketOffsetError = 0x70636B3F;
    /**
     * 0x6474613F, 1685348671
     */
    @Generated public static final int kAudioFileInvalidFileError = 0x6474613F;
    /**
     * 'op??', integer used because of trigraph
     */
    @Generated public static final int kAudioFileOperationNotSupportedError = 0x6F703F3F;
    /**
     * general file error codes
     */
    @Generated public static final int kAudioFileNotOpenError = 0xFFFFFFDA;
    /**
     * general file error codes
     */
    @Generated public static final int kAudioFileEndOfFileError = 0xFFFFFFD9;
    /**
     * general file error codes
     */
    @Generated public static final int kAudioFilePositionError = 0xFFFFFFD8;
    /**
     * general file error codes
     */
    @Generated public static final int kAudioFileFileNotFoundError = 0xFFFFFFD5;
    /**
     * range (4100->4999)
     */
    @Generated public static final int kAUSamplerProperty_LoadInstrument = 0x00001006;
    /**
     * range (4100->4999)
     */
    @Generated public static final int kAUSamplerProperty_LoadAudioFiles = 0x00001005;
    /**
     * selector range
     */
    @Generated public static final int kAudioOutputUnitRange = 0x00000200;
    @Generated public static final int kAudioOutputUnitStartSelect = 0x00000201;
    @Generated public static final int kAudioOutputUnitStopSelect = 0x00000202;
    /**
     * Global, Hz, 10000->(SampleRate/2), 10000
     */
    @Generated public static final int kHighShelfParam_CutOffFrequency = 0x00000000;
    /**
     * Global, dB, -40->40, 0
     */
    @Generated public static final int kHighShelfParam_Gain = 0x00000001;
    @Generated public static final int kAUGraphErr_NodeNotFound = 0xFFFFD594;
    @Generated public static final int kAUGraphErr_InvalidConnection = 0xFFFFD593;
    @Generated public static final int kAUGraphErr_OutputNodeErr = 0xFFFFD592;
    @Generated public static final int kAUGraphErr_CannotDoInCurrentContext = 0xFFFFD591;
    @Generated public static final int kAUGraphErr_InvalidAudioUnit = 0xFFFFD590;
    @Generated public static final int kAudioFileStreamError_UnsupportedFileType = 0x7479703F;
    @Generated public static final int kAudioFileStreamError_UnsupportedDataFormat = 0x666D743F;
    @Generated public static final int kAudioFileStreamError_UnsupportedProperty = 0x7074793F;
    @Generated public static final int kAudioFileStreamError_BadPropertySize = 0x2173697A;
    @Generated public static final int kAudioFileStreamError_NotOptimized = 0x6F70746D;
    @Generated public static final int kAudioFileStreamError_InvalidPacketOffset = 0x70636B3F;
    @Generated public static final int kAudioFileStreamError_InvalidFile = 0x6474613F;
    @Generated public static final int kAudioFileStreamError_ValueUnknown = 0x756E6B3F;
    @Generated public static final int kAudioFileStreamError_DataUnavailable = 0x6D6F7265;
    @Generated public static final int kAudioFileStreamError_IllegalOperation = 0x6E6F7065;
    @Generated public static final int kAudioFileStreamError_UnspecifiedError = 0x7768743F;
    @Generated public static final int kAudioFileStreamError_DiscontinuityCantRecover = 0x64736321;
    /**
     * !< value is UInt32
     */
    @Generated public static final int kAudioQueueProperty_IsRunning = 0x6171726E;
    /**
     * value is Float64
     */
    @Generated public static final int kAudioQueueDeviceProperty_SampleRate = 0x61717372;
    /**
     * value is UInt32
     */
    @Generated public static final int kAudioQueueDeviceProperty_NumberChannels = 0x61716463;
    /**
     * value is CFStringRef
     */
    @Generated public static final int kAudioQueueProperty_CurrentDevice = 0x61716364;
    /**
     * value is void*
     */
    @Generated public static final int kAudioQueueProperty_MagicCookie = 0x61716D63;
    /**
     * value is UInt32
     */
    @Generated public static final int kAudioQueueProperty_MaximumOutputPacketSize = 0x786F7073;
    /**
     * value is AudioStreamBasicDescription
     */
    @Generated public static final int kAudioQueueProperty_StreamDescription = 0x61716674;
    /**
     * value is AudioChannelLayout
     */
    @Generated public static final int kAudioQueueProperty_ChannelLayout = 0x6171636C;
    /**
     * value is UInt32
     */
    @Generated public static final int kAudioQueueProperty_EnableLevelMetering = 0x61716D65;
    /**
     * value is array of AudioQueueLevelMeterState, 1 per channel
     */
    @Generated public static final int kAudioQueueProperty_CurrentLevelMeter = 0x61716D76;
    /**
     * value is array of AudioQueueLevelMeterState, 1 per channel
     */
    @Generated public static final int kAudioQueueProperty_CurrentLevelMeterDB = 0x61716D64;
    /**
     * value is UInt32
     */
    @Generated public static final int kAudioQueueProperty_DecodeBufferSizeFrames = 0x64636266;
    /**
     * value is UInt32
     */
    @Generated public static final int kAudioQueueProperty_ConverterError = 0x71637665;
    /**
     * value is UInt32, 0/1
     */
    @Generated public static final int kAudioQueueProperty_EnableTimePitch = 0x715F7470;
    /**
     * value is UInt32. See values below.
     */
    @Generated public static final int kAudioQueueProperty_TimePitchAlgorithm = 0x71747061;
    /**
     * value is UInt32, 1=bypassed
     */
    @Generated public static final int kAudioQueueProperty_TimePitchBypass = 0x71747062;
    @Generated public static final int kExtAudioFileError_InvalidProperty = 0xFFFEFBFF;
    @Generated public static final int kExtAudioFileError_InvalidPropertySize = 0xFFFEFBFE;
    @Generated public static final int kExtAudioFileError_NonPCMClientFormat = 0xFFFEFBFD;
    /**
     * number of channels doesn't match format
     */
    @Generated public static final int kExtAudioFileError_InvalidChannelMap = 0xFFFEFBFC;
    @Generated public static final int kExtAudioFileError_InvalidOperationOrder = 0xFFFEFBFB;
    @Generated public static final int kExtAudioFileError_InvalidDataFormat = 0xFFFEFBFA;
    @Generated public static final int kExtAudioFileError_MaxPacketSizeUnknown = 0xFFFEFBF9;
    /**
     * writing, or offset out of bounds
     */
    @Generated public static final int kExtAudioFileError_InvalidSeek = 0xFFFEFBF8;
    @Generated public static final int kExtAudioFileError_AsyncWriteTooLarge = 0xFFFEFBF7;
    /**
     * an async write could not be completed in time
     */
    @Generated public static final int kExtAudioFileError_AsyncWriteBufferOverflow = 0xFFFEFBF6;
    /**
     * Global, Secs, 0.001->0.03, 0.012
     */
    @Generated public static final int kLimiterParam_AttackTime = 0x00000000;
    /**
     * Global, Secs, 0.001->0.06, 0.024
     */
    @Generated public static final int kLimiterParam_DecayTime = 0x00000001;
    /**
     * Global, dB, -40->40, 0
     */
    @Generated public static final int kLimiterParam_PreGain = 0x00000002;
    @Generated public static final int kAudioSessionOverrideAudioRoute_None = 0x00000000;
    @Generated public static final int kAudioSessionOverrideAudioRoute_Speaker = 0x73706B72;
    @Generated public static final int kAudioUnitProperty_ReverbRoomType = 0x0000000A;
    @Generated public static final int kAudioUnitProperty_UsesInternalReverb = 0x000003ED;
    @Generated public static final int kAudioUnitProperty_SpatializationAlgorithm = 0x00000BB8;
    @Generated public static final int kAudioUnitProperty_SpatialMixerDistanceParams = 0x00000BC2;
    @Generated public static final int kAudioUnitProperty_SpatialMixerAttenuationCurve = 0x00000BC5;
    @Generated public static final int kAudioUnitProperty_SpatialMixerRenderingFlags = 0x00000BBB;
    /**
     * range (0 -> 999)
     */
    @Generated public static final int kAudioUnitProperty_ClassInfo = 0x00000000;
    /**
     * range (0 -> 999)
     */
    @Generated public static final int kAudioUnitProperty_MakeConnection = 0x00000001;
    /**
     * range (0 -> 999)
     */
    @Generated public static final int kAudioUnitProperty_SampleRate = 0x00000002;
    /**
     * range (0 -> 999)
     */
    @Generated public static final int kAudioUnitProperty_ParameterList = 0x00000003;
    /**
     * range (0 -> 999)
     */
    @Generated public static final int kAudioUnitProperty_ParameterInfo = 0x00000004;
    /**
     * range (0 -> 999)
     */
    @Generated public static final int kAudioUnitProperty_CPULoad = 0x00000006;
    /**
     * range (0 -> 999)
     */
    @Generated public static final int kAudioUnitProperty_StreamFormat = 0x00000008;
    /**
     * range (0 -> 999)
     */
    @Generated public static final int kAudioUnitProperty_ElementCount = 0x0000000B;
    /**
     * range (0 -> 999)
     */
    @Generated public static final int kAudioUnitProperty_Latency = 0x0000000C;
    /**
     * range (0 -> 999)
     */
    @Generated public static final int kAudioUnitProperty_SupportedNumChannels = 0x0000000D;
    /**
     * range (0 -> 999)
     */
    @Generated public static final int kAudioUnitProperty_MaximumFramesPerSlice = 0x0000000E;
    /**
     * range (0 -> 999)
     */
    @Generated public static final int kAudioUnitProperty_ParameterValueStrings = 0x00000010;
    /**
     * range (0 -> 999)
     */
    @Generated public static final int kAudioUnitProperty_AudioChannelLayout = 0x00000013;
    /**
     * range (0 -> 999)
     */
    @Generated public static final int kAudioUnitProperty_TailTime = 0x00000014;
    /**
     * range (0 -> 999)
     */
    @Generated public static final int kAudioUnitProperty_BypassEffect = 0x00000015;
    /**
     * range (0 -> 999)
     */
    @Generated public static final int kAudioUnitProperty_LastRenderError = 0x00000016;
    /**
     * range (0 -> 999)
     */
    @Generated public static final int kAudioUnitProperty_SetRenderCallback = 0x00000017;
    /**
     * range (0 -> 999)
     */
    @Generated public static final int kAudioUnitProperty_FactoryPresets = 0x00000018;
    /**
     * range (0 -> 999)
     */
    @Generated public static final int kAudioUnitProperty_RenderQuality = 0x0000001A;
    /**
     * range (0 -> 999)
     */
    @Generated public static final int kAudioUnitProperty_HostCallbacks = 0x0000001B;
    /**
     * range (0 -> 999)
     */
    @Generated public static final int kAudioUnitProperty_InPlaceProcessing = 0x0000001D;
    /**
     * range (0 -> 999)
     */
    @Generated public static final int kAudioUnitProperty_ElementName = 0x0000001E;
    /**
     * range (0 -> 999)
     */
    @Generated public static final int kAudioUnitProperty_SupportedChannelLayoutTags = 0x00000020;
    /**
     * range (0 -> 999)
     */
    @Generated public static final int kAudioUnitProperty_PresentPreset = 0x00000024;
    /**
     * range (0 -> 999)
     */
    @Generated public static final int kAudioUnitProperty_DependentParameters = 0x0000002D;
    /**
     * range (0 -> 999)
     */
    @Generated public static final int kAudioUnitProperty_InputSamplesInOutput = 0x00000031;
    /**
     * range (0 -> 999)
     */
    @Generated public static final int kAudioUnitProperty_ShouldAllocateBuffer = 0x00000033;
    /**
     * range (0 -> 999)
     */
    @Generated public static final int kAudioUnitProperty_FrequencyResponse = 0x00000034;
    /**
     * range (0 -> 999)
     */
    @Generated public static final int kAudioUnitProperty_ParameterHistoryInfo = 0x00000035;
    /**
     * range (0 -> 999)
     */
    @Generated public static final int kAudioUnitProperty_NickName = 0x00000036;
    /**
     * range (0 -> 999)
     */
    @Generated public static final int kAudioUnitProperty_OfflineRender = 0x00000025;
    /**
     * range (0 -> 999)
     */
    @Generated public static final int kAudioUnitProperty_ParameterIDName = 0x00000022;
    /**
     * range (0 -> 999)
     */
    @Generated public static final int kAudioUnitProperty_ParameterStringFromValue = 0x00000021;
    /**
     * range (0 -> 999)
     */
    @Generated public static final int kAudioUnitProperty_ParameterClumpName = 0x00000023;
    /**
     * range (0 -> 999)
     */
    @Generated public static final int kAudioUnitProperty_ParameterValueFromString = 0x00000026;
    /**
     * range (0 -> 999)
     */
    @Generated public static final int kAudioUnitProperty_ContextName = 0x00000019;
    /**
     * range (0 -> 999)
     */
    @Generated public static final int kAudioUnitProperty_PresentationLatency = 0x00000028;
    /**
     * range (0 -> 999)
     */
    @Generated public static final int kAudioUnitProperty_ClassInfoFromDocument = 0x00000032;
    /**
     * range (0 -> 999)
     */
    @Generated public static final int kAudioUnitProperty_RequestViewController = 0x00000038;
    /**
     * range (0 -> 999)
     */
    @Generated public static final int kAudioUnitProperty_ParametersForOverview = 0x00000039;
    /**
     * range (0 -> 999)
     */
    @Generated public static final int kAudioUnitProperty_SupportsMPE = 0x0000003A;
    @Generated public static final int kMusicEventType_NULL = 0x00000000;
    @Generated public static final int kMusicEventType_ExtendedNote = 0x00000001;
    @Generated public static final int kMusicEventType_ExtendedTempo = 0x00000003;
    @Generated public static final int kMusicEventType_User = 0x00000004;
    @Generated public static final int kMusicEventType_Meta = 0x00000005;
    @Generated public static final int kMusicEventType_MIDINoteMessage = 0x00000006;
    @Generated public static final int kMusicEventType_MIDIChannelMessage = 0x00000007;
    @Generated public static final int kMusicEventType_MIDIRawData = 0x00000008;
    @Generated public static final int kMusicEventType_Parameter = 0x00000009;
    @Generated public static final int kMusicEventType_AUPreset = 0x0000000A;
    @Generated public static final int kRandomParam_BoundA = 0x00000000;
    @Generated public static final int kRandomParam_BoundB = 0x00000001;
    @Generated public static final int kRandomParam_Curve = 0x00000002;
    @Generated public static final int kAudioQueueParam_Volume = 0x00000001;
    @Generated public static final int kAudioQueueParam_PlayRate = 0x00000002;
    @Generated public static final int kAudioQueueParam_Pitch = 0x00000003;
    @Generated public static final int kAudioQueueParam_VolumeRampTime = 0x00000004;
    @Generated public static final int kAudioQueueParam_Pan = 0x0000000D;
    @Generated public static final int kAudioDecoderComponentType = 0x61646563;
    @Generated public static final int kAudioEncoderComponentType = 0x61656E63;
    @Generated public static final int kAudioSessionNoError = 0x00000000;
    @Generated public static final int kAudioSessionNotInitialized = 0x21696E69;
    @Generated public static final int kAudioSessionAlreadyInitialized = 0x696E6974;
    @Generated public static final int kAudioSessionInitializationError = 0x696E693F;
    @Generated public static final int kAudioSessionUnsupportedPropertyError = 0x7074793F;
    @Generated public static final int kAudioSessionBadPropertySizeError = 0x2173697A;
    @Generated public static final int kAudioSessionNotActiveError = 0x21616374;
    @Generated public static final int kAudioServicesNoHardwareError = 0x6E6F6877;
    @Generated public static final int kAudioSessionNoCategorySet = 0x3F636174;
    @Generated public static final int kAudioSessionIncompatibleCategory = 0x21636174;
    @Generated public static final int kAudioSessionUnspecifiedError = 0x77686174;
    /**
     * 0x77686174, 2003329396
     */
    @Generated public static final int kAudioFormatUnspecifiedError = 0x77686174;
    /**
     * 0x70726F70, 1886547824
     */
    @Generated public static final int kAudioFormatUnsupportedPropertyError = 0x70726F70;
    /**
     * 0x2173697A, 561211770
     */
    @Generated public static final int kAudioFormatBadPropertySizeError = 0x2173697A;
    /**
     * 0x21737063, 561213539
     */
    @Generated public static final int kAudioFormatBadSpecifierSizeError = 0x21737063;
    /**
     * 0x666D743F, 1718449215
     */
    @Generated public static final int kAudioFormatUnsupportedDataFormatError = 0x666D743F;
    /**
     * 0x21666D74, 560360820
     */
    @Generated public static final int kAudioFormatUnknownFormatError = 0x21666D74;
    @Generated public static final int kConverterPrimeMethod_Pre = 0x00000000;
    @Generated public static final int kConverterPrimeMethod_Normal = 0x00000001;
    @Generated public static final int kConverterPrimeMethod_None = 0x00000002;
    @Deprecated @Generated public static final int kAudioUnitSubType_AU3DMixerEmbedded = 0x3364656D;
    @Generated public static final int kAudioFileLoopDirection_NoLooping = 0x00000000;
    @Generated public static final int kAudioFileLoopDirection_Forward = 0x00000001;
    @Generated public static final int kAudioFileLoopDirection_ForwardAndBackward = 0x00000002;
    @Generated public static final int kAudioFileLoopDirection_Backward = 0x00000003;
    @Generated public static final int kAudioSessionMode_Default = 0x64666C74;
    @Generated public static final int kAudioSessionMode_VoiceChat = 0x76636374;
    @Generated public static final int kAudioSessionMode_VideoRecording = 0x76726364;
    @Generated public static final int kAudioSessionMode_Measurement = 0x6D736D74;
    @Generated public static final int kAudioSessionMode_GameChat = 0x676D6374;
    @Generated public static final int kAUSamplerProperty_LoadPresetFromBank = 0x00001004;
    @Generated public static final int kAUSamplerProperty_BankAndPreset = 0x00001004;
    @Generated public static final int kMusicDeviceRange = 0x00000100;
    @Generated public static final int kMusicDeviceMIDIEventSelect = 0x00000101;
    @Generated public static final int kMusicDeviceSysExSelect = 0x00000102;
    @Generated public static final int kMusicDevicePrepareInstrumentSelect = 0x00000103;
    @Generated public static final int kMusicDeviceReleaseInstrumentSelect = 0x00000104;
    @Generated public static final int kMusicDeviceStartNoteSelect = 0x00000105;
    @Generated public static final int kMusicDeviceStopNoteSelect = 0x00000106;
    /**
     * =============================================================================
     * The following properties are concerned with the AudioStreamBasicDescription
     * =============================================================================
     */
    @Generated public static final int kAudioFormatProperty_FormatInfo = 0x666D7469;
    /**
     * =============================================================================
     * The following properties are concerned with the AudioStreamBasicDescription
     * =============================================================================
     */
    @Generated public static final int kAudioFormatProperty_FormatName = 0x666E616D;
    /**
     * =============================================================================
     * The following properties are concerned with the AudioStreamBasicDescription
     * =============================================================================
     */
    @Generated public static final int kAudioFormatProperty_EncodeFormatIDs = 0x61636F66;
    /**
     * =============================================================================
     * The following properties are concerned with the AudioStreamBasicDescription
     * =============================================================================
     */
    @Generated public static final int kAudioFormatProperty_DecodeFormatIDs = 0x61636966;
    /**
     * =============================================================================
     * The following properties are concerned with the AudioStreamBasicDescription
     * =============================================================================
     */
    @Generated public static final int kAudioFormatProperty_FormatList = 0x666C7374;
    /**
     * =============================================================================
     * The following properties are concerned with the AudioStreamBasicDescription
     * =============================================================================
     */
    @Generated public static final int kAudioFormatProperty_ASBDFromESDS = 0x65737364;
    /**
     * =============================================================================
     * The following properties are concerned with the AudioStreamBasicDescription
     * =============================================================================
     */
    @Generated public static final int kAudioFormatProperty_ChannelLayoutFromESDS = 0x6573636C;
    /**
     * =============================================================================
     * The following properties are concerned with the AudioStreamBasicDescription
     * =============================================================================
     */
    @Generated public static final int kAudioFormatProperty_OutputFormatList = 0x6F666C73;
    /**
     * =============================================================================
     * The following properties are concerned with the AudioStreamBasicDescription
     * =============================================================================
     */
    @Generated public static final int kAudioFormatProperty_FirstPlayableFormatFromList = 0x6670666C;
    /**
     * =============================================================================
     * The following properties are concerned with the AudioStreamBasicDescription
     * =============================================================================
     */
    @Generated public static final int kAudioFormatProperty_FormatIsVBR = 0x66766272;
    /**
     * =============================================================================
     * The following properties are concerned with the AudioStreamBasicDescription
     * =============================================================================
     */
    @Generated public static final int kAudioFormatProperty_FormatIsExternallyFramed = 0x66657866;
    /**
     * =============================================================================
     * The following properties are concerned with the AudioStreamBasicDescription
     * =============================================================================
     */
    @Generated public static final int kAudioFormatProperty_FormatIsEncrypted = 0x63727970;
    /**
     * =============================================================================
     * The following properties are concerned with the AudioStreamBasicDescription
     * =============================================================================
     */
    @Generated public static final int kAudioFormatProperty_Encoders = 0x6176656E;
    /**
     * =============================================================================
     * The following properties are concerned with the AudioStreamBasicDescription
     * =============================================================================
     */
    @Generated public static final int kAudioFormatProperty_Decoders = 0x61766465;
    /**
     * =============================================================================
     * The following properties are concerned with the AudioStreamBasicDescription
     * =============================================================================
     */
    @Generated public static final int kAudioFormatProperty_AvailableEncodeBitRates = 0x61656272;
    /**
     * =============================================================================
     * The following properties are concerned with the AudioStreamBasicDescription
     * =============================================================================
     */
    @Generated public static final int kAudioFormatProperty_AvailableEncodeSampleRates = 0x61657372;
    /**
     * =============================================================================
     * The following properties are concerned with the AudioStreamBasicDescription
     * =============================================================================
     */
    @Generated public static final int kAudioFormatProperty_AvailableEncodeChannelLayoutTags = 0x6165636C;
    /**
     * =============================================================================
     * The following properties are concerned with the AudioStreamBasicDescription
     * =============================================================================
     */
    @Generated public static final int kAudioFormatProperty_AvailableEncodeNumberChannels = 0x61766E63;
    /**
     * =============================================================================
     * The following properties are concerned with the AudioStreamBasicDescription
     * =============================================================================
     */
    @Generated public static final int kAudioFormatProperty_ASBDFromMPEGPacket = 0x61646D70;
    /**
     * =============================================================================
     * The following properties concern the AudioChannelLayout struct (speaker layouts)
     * =============================================================================
     */
    @Generated public static final int kAudioFormatProperty_BitmapForLayoutTag = 0x626D7467;
    /**
     * =============================================================================
     * The following properties concern the AudioChannelLayout struct (speaker layouts)
     * =============================================================================
     */
    @Generated public static final int kAudioFormatProperty_MatrixMixMap = 0x6D6D6170;
    /**
     * =============================================================================
     * The following properties concern the AudioChannelLayout struct (speaker layouts)
     * =============================================================================
     */
    @Generated public static final int kAudioFormatProperty_ChannelMap = 0x63686D70;
    /**
     * =============================================================================
     * The following properties concern the AudioChannelLayout struct (speaker layouts)
     * =============================================================================
     */
    @Generated public static final int kAudioFormatProperty_NumberOfChannelsForLayout = 0x6E63686D;
    /**
     * =============================================================================
     * The following properties concern the AudioChannelLayout struct (speaker layouts)
     * =============================================================================
     */
    @Generated public static final int kAudioFormatProperty_AreChannelLayoutsEquivalent = 0x63686571;
    /**
     * =============================================================================
     * The following properties concern the AudioChannelLayout struct (speaker layouts)
     * =============================================================================
     */
    @Generated public static final int kAudioFormatProperty_ChannelLayoutHash = 0x63686861;
    /**
     * =============================================================================
     * The following properties concern the AudioChannelLayout struct (speaker layouts)
     * =============================================================================
     */
    @Generated public static final int kAudioFormatProperty_ValidateChannelLayout = 0x7661636C;
    /**
     * =============================================================================
     * The following properties concern the AudioChannelLayout struct (speaker layouts)
     * =============================================================================
     */
    @Generated public static final int kAudioFormatProperty_ChannelLayoutForTag = 0x636D706C;
    /**
     * =============================================================================
     * The following properties concern the AudioChannelLayout struct (speaker layouts)
     * =============================================================================
     */
    @Generated public static final int kAudioFormatProperty_TagForChannelLayout = 0x636D7074;
    /**
     * =============================================================================
     * The following properties concern the AudioChannelLayout struct (speaker layouts)
     * =============================================================================
     */
    @Generated public static final int kAudioFormatProperty_ChannelLayoutName = 0x6C6F6E6D;
    /**
     * =============================================================================
     * The following properties concern the AudioChannelLayout struct (speaker layouts)
     * =============================================================================
     */
    @Generated public static final int kAudioFormatProperty_ChannelLayoutSimpleName = 0x6C736E6D;
    /**
     * =============================================================================
     * The following properties concern the AudioChannelLayout struct (speaker layouts)
     * =============================================================================
     */
    @Generated public static final int kAudioFormatProperty_ChannelLayoutForBitmap = 0x636D7062;
    /**
     * =============================================================================
     * The following properties concern the AudioChannelLayout struct (speaker layouts)
     * =============================================================================
     */
    @Generated public static final int kAudioFormatProperty_ChannelName = 0x636E616D;
    /**
     * =============================================================================
     * The following properties concern the AudioChannelLayout struct (speaker layouts)
     * =============================================================================
     */
    @Generated public static final int kAudioFormatProperty_ChannelShortName = 0x63736E6D;
    /**
     * =============================================================================
     * The following properties concern the AudioChannelLayout struct (speaker layouts)
     * =============================================================================
     */
    @Generated public static final int kAudioFormatProperty_TagsForNumberOfChannels = 0x74616763;
    /**
     * =============================================================================
     * The following properties concern the AudioChannelLayout struct (speaker layouts)
     * =============================================================================
     */
    @Generated public static final int kAudioFormatProperty_PanningMatrix = 0x70616E6D;
    /**
     * =============================================================================
     * The following properties concern the AudioChannelLayout struct (speaker layouts)
     * =============================================================================
     */
    @Generated public static final int kAudioFormatProperty_BalanceFade = 0x62616C66;
    /**
     * =============================================================================
     * The following properties concern the ID3 Tags
     * =============================================================================
     */
    @Generated public static final int kAudioFormatProperty_ID3TagSize = 0x69643373;
    /**
     * =============================================================================
     * The following properties concern the ID3 Tags
     * =============================================================================
     */
    @Generated public static final int kAudioFormatProperty_ID3TagToDictionary = 0x69643364;
    @Generated public static final int kAudioSessionCategory_AmbientSound = 0x616D6269;
    @Generated public static final int kAudioSessionCategory_SoloAmbientSound = 0x736F6C6F;
    @Generated public static final int kAudioSessionCategory_MediaPlayback = 0x6D656469;
    @Generated public static final int kAudioSessionCategory_RecordAudio = 0x72656361;
    @Generated public static final int kAudioSessionCategory_PlayAndRecord = 0x706C6172;
    @Generated public static final int kAudioSessionCategory_AudioProcessing = 0x70726F63;
    @Generated public static final int kAudioFileAIFFType = 0x41494646;
    @Generated public static final int kAudioFileAIFCType = 0x41494643;
    @Generated public static final int kAudioFileWAVEType = 0x57415645;
    @Generated public static final int kAudioFileSoundDesigner2Type = 0x53643266;
    @Generated public static final int kAudioFileNextType = 0x4E655854;
    /**
     * mpeg layer 3
     */
    @Generated public static final int kAudioFileMP3Type = 0x4D504733;
    /**
     * mpeg layer 2
     */
    @Generated public static final int kAudioFileMP2Type = 0x4D504732;
    /**
     * mpeg layer 1
     */
    @Generated public static final int kAudioFileMP1Type = 0x4D504731;
    @Generated public static final int kAudioFileAC3Type = 0x61632D33;
    @Generated public static final int kAudioFileAAC_ADTSType = 0x61647473;
    @Generated public static final int kAudioFileMPEG4Type = 0x6D703466;
    @Generated public static final int kAudioFileM4AType = 0x6D346166;
    @Generated public static final int kAudioFileM4BType = 0x6D346266;
    @Generated public static final int kAudioFileCAFType = 0x63616666;
    @Generated public static final int kAudioFile3GPType = 0x33677070;
    @Generated public static final int kAudioFile3GP2Type = 0x33677032;
    @Generated public static final int kAudioFileAMRType = 0x616D7266;
    @Generated public static final int kAudioConverterErr_FormatNotSupported = 0x666D743F;
    /**
     * 'op??', integer used because of trigraph
     */
    @Generated public static final int kAudioConverterErr_OperationNotSupported = 0x6F703F3F;
    @Generated public static final int kAudioConverterErr_PropertyNotSupported = 0x70726F70;
    @Generated public static final int kAudioConverterErr_InvalidInputSize = 0x696E737A;
    @Generated public static final int kAudioConverterErr_InvalidOutputSize = 0x6F74737A;
    /**
     * e.g. byte size is not a multiple of the frame size
     */
    @Generated public static final int kAudioConverterErr_UnspecifiedError = 0x77686174;
    /**
     * e.g. byte size is not a multiple of the frame size
     */
    @Generated public static final int kAudioConverterErr_BadPropertySizeError = 0x2173697A;
    /**
     * e.g. byte size is not a multiple of the frame size
     */
    @Generated public static final int kAudioConverterErr_RequiresPacketDescriptionsError = 0x21706B64;
    /**
     * e.g. byte size is not a multiple of the frame size
     */
    @Generated public static final int kAudioConverterErr_InputSampleRateOutOfRange = 0x21697372;
    /**
     * e.g. byte size is not a multiple of the frame size
     */
    @Generated public static final int kAudioConverterErr_OutputSampleRateOutOfRange = 0x216F7372;
    @Generated public static final int kAudioSessionInterruptionType_ShouldResume = 0x6972736D;
    @Generated public static final int kAudioSessionInterruptionType_ShouldNotResume = 0x2172736D;
    @Generated public static final int kAudioFileGlobalInfo_ReadableTypes = 0x61667266;
    @Generated public static final int kAudioFileGlobalInfo_WritableTypes = 0x61667766;
    @Generated public static final int kAudioFileGlobalInfo_FileTypeName = 0x66746E6D;
    @Generated public static final int kAudioFileGlobalInfo_AvailableStreamDescriptionsForFormat = 0x73646964;
    @Generated public static final int kAudioFileGlobalInfo_AvailableFormatIDs = 0x666D6964;
    @Generated public static final int kAudioFileGlobalInfo_AllExtensions = 0x616C7874;
    @Generated public static final int kAudioFileGlobalInfo_AllHFSTypeCodes = 0x61686673;
    @Generated public static final int kAudioFileGlobalInfo_AllUTIs = 0x61757469;
    @Generated public static final int kAudioFileGlobalInfo_AllMIMETypes = 0x616D696D;
    @Generated public static final int kAudioFileGlobalInfo_ExtensionsForType = 0x66657874;
    @Generated public static final int kAudioFileGlobalInfo_HFSTypeCodesForType = 0x66686673;
    @Generated public static final int kAudioFileGlobalInfo_UTIsForType = 0x66757469;
    @Generated public static final int kAudioFileGlobalInfo_MIMETypesForType = 0x666D696D;
    @Generated public static final int kAudioFileGlobalInfo_TypesForMIMEType = 0x746D696D;
    @Generated public static final int kAudioFileGlobalInfo_TypesForUTI = 0x74757469;
    @Generated public static final int kAudioFileGlobalInfo_TypesForHFSTypeCode = 0x74686673;
    @Generated public static final int kAudioFileGlobalInfo_TypesForExtension = 0x74657874;
    /**
     * Global, LinearGain, 0->1, 1
     */
    @Generated public static final int kHALOutputParam_Volume = 0x0000000E;
    @Generated public static final int kAUSampler_DefaultPercussionBankMSB = 0x00000078;
    @Generated public static final int kAUSampler_DefaultMelodicBankMSB = 0x00000079;
    @Generated public static final int kAUSampler_DefaultBankLSB = 0x00000000;
    /**
     * Global, dB, -40->20, -20
     */
    @Generated public static final int kDynamicsProcessorParam_Threshold = 0x00000000;
    /**
     * Global, dB, 0.1->40.0, 5
     */
    @Generated public static final int kDynamicsProcessorParam_HeadRoom = 0x00000001;
    /**
     * Global, rate, 1->50.0, 2
     */
    @Generated public static final int kDynamicsProcessorParam_ExpansionRatio = 0x00000002;
    /**
     * Global, dB
     */
    @Generated public static final int kDynamicsProcessorParam_ExpansionThreshold = 0x00000003;
    /**
     * Global, secs, 0.0001->0.2, 0.001
     */
    @Generated public static final int kDynamicsProcessorParam_AttackTime = 0x00000004;
    /**
     * Global, secs, 0.01->3, 0.05
     */
    @Generated public static final int kDynamicsProcessorParam_ReleaseTime = 0x00000005;
    /**
     * Global, dB, -40->40, 0
     */
    @Deprecated @Generated public static final int kDynamicsProcessorParam_MasterGain = 0x00000006;
    /**
     * Global, dB, read-only parameter
     */
    @Generated public static final int kDynamicsProcessorParam_CompressionAmount = 0x000003E8;
    /**
     * Global, dB, read-only parameter
     */
    @Generated public static final int kDynamicsProcessorParam_InputAmplitude = 0x000007D0;
    /**
     * Global, dB, read-only parameter
     */
    @Generated public static final int kDynamicsProcessorParam_OutputAmplitude = 0x00000BB8;
    @Generated public static final int kAudioUnitParameterName_Full = 0xFFFFFFFF;
    /**
     * Global, EqPow Crossfade, 0->100, 50
     */
    @Generated public static final int kDelayParam_WetDryMix = 0x00000000;
    /**
     * Global, Secs, 0->2, 1
     */
    @Generated public static final int kDelayParam_DelayTime = 0x00000001;
    /**
     * Global, Percent, -100->100, 50
     */
    @Generated public static final int kDelayParam_Feedback = 0x00000002;
    /**
     * Global, Hz, 10->(SampleRate/2), 15000
     */
    @Generated public static final int kDelayParam_LopassCutoff = 0x00000003;
    @Generated public static final int kAudioUnitSubType_ScheduledSoundPlayer = 0x7373706C;
    @Generated public static final int kAudioUnitSubType_AudioFilePlayer = 0x6166706C;
    /**
     * Global, Hz, 10->200, 80
     */
    @Generated public static final int kAULowShelfParam_CutoffFrequency = 0x00000000;
    /**
     * Global, dB, -40->40, 0
     */
    @Generated public static final int kAULowShelfParam_Gain = 0x00000001;
    @Generated public static final int kRenderQuality_Max = 0x0000007F;
    @Generated public static final int kRenderQuality_High = 0x00000060;
    @Generated public static final int kRenderQuality_Medium = 0x00000040;
    @Generated public static final int kRenderQuality_Low = 0x00000020;
    @Generated public static final int kRenderQuality_Min = 0x00000000;
    @Generated public static final int kMusicDeviceProperty_InstrumentCount = 0x000003E8;
    @Generated public static final int kMusicDeviceProperty_BankName = 0x000003EF;
    @Generated public static final int kMusicDeviceProperty_SoundBankURL = 0x0000044C;
    /**
     * Global, Rate, 0.25 -> 4.0, 1.0
     */
    @Generated public static final int kVarispeedParam_PlaybackRate = 0x00000000;
    /**
     * Global, Cents, -2400 -> 2400, 0.0
     */
    @Generated public static final int kVarispeedParam_PlaybackCents = 0x00000001;
    @Generated public static final int kAUNBandEQProperty_NumberOfBands = 0x00000898;
    @Generated public static final int kAUNBandEQProperty_MaxNumberOfBands = 0x00000899;
    @Generated public static final int kAUNBandEQProperty_BiquadCoefficients = 0x0000089B;
    @Generated public static final int kAudioUnitClumpID_System = 0x00000000;
    /**
     * 0x01
     */
    @Generated public static final int kAudioSessionSetActiveFlag_NotifyOthersOnDeactivation = 0x00000001;
    @Generated public static final int kAudioUnitSubType_Reverb2 = 0x72766232;
    @Generated public static final int kAudioUnitSubType_AUiPodEQ = 0x69706571;
    @Generated public static final int kAudioToolboxErr_InvalidSequenceType = 0xFFFFD5A2;
    @Generated public static final int kAudioToolboxErr_TrackIndexError = 0xFFFFD595;
    @Generated public static final int kAudioToolboxErr_TrackNotFound = 0xFFFFD596;
    @Generated public static final int kAudioToolboxErr_EndOfTrack = 0xFFFFD597;
    @Generated public static final int kAudioToolboxErr_StartOfTrack = 0xFFFFD598;
    @Generated public static final int kAudioToolboxErr_IllegalTrackDestination = 0xFFFFD599;
    @Generated public static final int kAudioToolboxErr_NoSequence = 0xFFFFD59A;
    @Generated public static final int kAudioToolboxErr_InvalidEventType = 0xFFFFD59B;
    @Generated public static final int kAudioToolboxErr_InvalidPlayerState = 0xFFFFD59C;
    @Generated public static final int kAudioToolboxErr_CannotDoInCurrentContext = 0xFFFFD591;
    @Generated public static final int kAudioToolboxError_NoTrackDestination = 0xFFFEFB60;
    @Deprecated @Generated public static final int kAUVoiceIOProperty_DuckNonVoiceAudio = 0x00000836;
    @Generated public static final int kAudioUnitType_Output = 0x61756F75;
    @Generated public static final int kAudioUnitType_MusicDevice = 0x61756D75;
    @Generated public static final int kAudioUnitType_MusicEffect = 0x61756D66;
    @Generated public static final int kAudioUnitType_FormatConverter = 0x61756663;
    @Generated public static final int kAudioUnitType_Effect = 0x61756678;
    @Generated public static final int kAudioUnitType_Mixer = 0x61756D78;
    @Generated public static final int kAudioUnitType_Panner = 0x6175706E;
    @Generated public static final int kAudioUnitType_Generator = 0x6175676E;
    @Generated public static final int kAudioUnitType_OfflineEffect = 0x61756F6C;
    @Generated public static final int kAudioUnitType_MIDIProcessor = 0x61756D69;
    @Generated public static final int kAudioComponentErr_DuplicateDescription = 0xFFFEFB40;
    @Generated public static final int kAudioComponentErr_UnsupportedType = 0xFFFEFB41;
    @Generated public static final int kAudioComponentErr_TooManyInstances = 0xFFFEFB42;
    @Generated public static final int kAudioComponentErr_NotPermitted = 0xFFFEFB44;
    @Generated public static final int kAudioComponentErr_InitializationTimedOut = 0xFFFEFB45;
    @Generated public static final int kAudioComponentErr_InvalidFormat = 0xFFFEFB46;
    @Generated public static final int kAudioConverterPropertyMinimumInputBufferSize = 0x6D696273;
    @Generated public static final int kAudioConverterPropertyMinimumOutputBufferSize = 0x6D6F6273;
    @Generated public static final int kAudioConverterPropertyMaximumInputBufferSize = 0x78696273;
    @Generated public static final int kAudioConverterPropertyMaximumInputPacketSize = 0x78697073;
    @Generated public static final int kAudioConverterPropertyMaximumOutputPacketSize = 0x786F7073;
    @Generated public static final int kAudioConverterPropertyCalculateInputBufferSize = 0x63696273;
    @Generated public static final int kAudioConverterPropertyCalculateOutputBufferSize = 0x636F6273;
    @Generated public static final int kAudioConverterPropertyInputCodecParameters = 0x69636470;
    @Generated public static final int kAudioConverterPropertyOutputCodecParameters = 0x6F636470;
    @Generated public static final int kAudioConverterSampleRateConverterAlgorithm = 0x73726369;
    @Generated public static final int kAudioConverterSampleRateConverterComplexity = 0x73726361;
    @Generated public static final int kAudioConverterSampleRateConverterQuality = 0x73726371;
    @Generated public static final int kAudioConverterSampleRateConverterInitialPhase = 0x73726370;
    @Generated public static final int kAudioConverterCodecQuality = 0x63647175;
    @Generated public static final int kAudioConverterPrimeMethod = 0x70726D6D;
    @Generated public static final int kAudioConverterPrimeInfo = 0x7072696D;
    @Generated public static final int kAudioConverterChannelMap = 0x63686D70;
    @Generated public static final int kAudioConverterDecompressionMagicCookie = 0x646D6763;
    @Generated public static final int kAudioConverterCompressionMagicCookie = 0x636D6763;
    @Generated public static final int kAudioConverterEncodeBitRate = 0x62726174;
    @Generated public static final int kAudioConverterEncodeAdjustableSampleRate = 0x616A7372;
    @Generated public static final int kAudioConverterInputChannelLayout = 0x69636C20;
    @Generated public static final int kAudioConverterOutputChannelLayout = 0x6F636C20;
    @Generated public static final int kAudioConverterApplicableEncodeBitRates = 0x61656272;
    @Generated public static final int kAudioConverterAvailableEncodeBitRates = 0x76656272;
    @Generated public static final int kAudioConverterApplicableEncodeSampleRates = 0x61657372;
    @Generated public static final int kAudioConverterAvailableEncodeSampleRates = 0x76657372;
    @Generated public static final int kAudioConverterAvailableEncodeChannelLayoutTags = 0x6165636C;
    @Generated public static final int kAudioConverterCurrentOutputStreamDescription = 0x61636F64;
    @Generated public static final int kAudioConverterCurrentInputStreamDescription = 0x61636964;
    @Generated public static final int kAudioConverterPropertySettings = 0x61637073;
    @Generated public static final int kAudioConverterPropertyBitDepthHint = 0x61636264;
    @Generated public static final int kAudioConverterPropertyFormatList = 0x666C7374;
    @Generated public static final int kAudioServicesPropertyIsUISound = 0x69737569;
    @Generated public static final int kAudioServicesPropertyCompletePlaybackIfAppDies = 0x69666469;
    @Generated @NInt public static final long kAUNBandEQFilterType_Parametric = 0x0000000000000000L;
    @Generated @NInt public static final long kAUNBandEQFilterType_2ndOrderButterworthLowPass = 0x0000000000000001L;
    @Generated @NInt public static final long kAUNBandEQFilterType_2ndOrderButterworthHighPass = 0x0000000000000002L;
    @Generated @NInt public static final long kAUNBandEQFilterType_ResonantLowPass = 0x0000000000000003L;
    @Generated @NInt public static final long kAUNBandEQFilterType_ResonantHighPass = 0x0000000000000004L;
    @Generated @NInt public static final long kAUNBandEQFilterType_BandPass = 0x0000000000000005L;
    @Generated @NInt public static final long kAUNBandEQFilterType_BandStop = 0x0000000000000006L;
    @Generated @NInt public static final long kAUNBandEQFilterType_LowShelf = 0x0000000000000007L;
    @Generated @NInt public static final long kAUNBandEQFilterType_HighShelf = 0x0000000000000008L;
    @Generated @NInt public static final long kAUNBandEQFilterType_ResonantLowShelf = 0x0000000000000009L;
    @Generated @NInt public static final long kAUNBandEQFilterType_ResonantHighShelf = 0x000000000000000AL;
    @Generated @NInt public static final long kNumAUNBandEQFilterTypes = 0x000000000000000BL;
    @Generated public static final int kAudioConverterPropertyCanResumeFromInterruption = 0x63726669;
    @Deprecated @Generated public static final int kAUVoiceIOProperty_VoiceProcessingQuality = 0x00000837;
    @Generated public static final int kAudioUnitProperty_ScheduledFileIDs = 0x00000CEE;
    @Generated public static final int kAudioUnitProperty_ScheduledFileRegion = 0x00000CEF;
    @Generated public static final int kAudioUnitProperty_ScheduledFilePrime = 0x00000CF0;
    @Generated public static final int kAudioUnitProperty_ScheduledFileBufferSizeFrames = 0x00000CF1;
    @Generated public static final int kAudioUnitProperty_ScheduledFileNumberBuffers = 0x00000CF2;
    @Generated public static final int kAudioUnitType_RemoteEffect = 0x61757278;
    @Generated public static final int kAudioUnitType_RemoteGenerator = 0x61757267;
    @Generated public static final int kAudioUnitType_RemoteInstrument = 0x61757269;
    @Generated public static final int kAudioUnitType_RemoteMusicEffect = 0x6175726D;
    @Generated public static final int kAudioQueueHardwareCodecPolicy_Default = 0x00000000;
    @Generated public static final int kAudioQueueHardwareCodecPolicy_UseSoftwareOnly = 0x00000001;
    @Generated public static final int kAudioQueueHardwareCodecPolicy_UseHardwareOnly = 0x00000002;
    @Generated public static final int kAudioQueueHardwareCodecPolicy_PreferSoftware = 0x00000003;
    @Generated public static final int kAudioQueueHardwareCodecPolicy_PreferHardware = 0x00000004;
    @Generated public static final int kAudioUnitProperty_RemoteControlEventListener = 0x00000064;
    @Generated public static final int kAudioUnitProperty_IsInterAppConnected = 0x00000065;
    @Generated public static final int kAudioUnitProperty_PeerURL = 0x00000066;
    /**
     * linear interpolation
     */
    @Generated public static final int kAudioUnitSampleRateConverterComplexity_Linear = 0x6C696E65;
    /**
     * the default
     */
    @Generated public static final int kAudioUnitSampleRateConverterComplexity_Normal = 0x6E6F726D;
    /**
     * higher quality, more expensive
     */
    @Generated public static final int kAudioUnitSampleRateConverterComplexity_Mastering = 0x62617473;
    @Generated public static final int kAUNodeInteraction_Connection = 0x00000001;
    @Generated public static final int kAUNodeInteraction_InputCallback = 0x00000002;
    /**
     * Global, dB, -96->24, 0
     */
    @Generated public static final int kAUNBandEQParam_GlobalGain = 0x00000000;
    /**
     * Global, Boolean, 0 or 1, 1
     */
    @Generated public static final int kAUNBandEQParam_BypassBand = 0x000003E8;
    /**
     * Global, Indexed, 0->kNumAUNBandEQFilterTypes-1, 0
     */
    @Generated public static final int kAUNBandEQParam_FilterType = 0x000007D0;
    /**
     * Global, Hz, 20->(SampleRate/2), 1000
     */
    @Generated public static final int kAUNBandEQParam_Frequency = 0x00000BB8;
    /**
     * Global, dB, -96->24, 0
     */
    @Generated public static final int kAUNBandEQParam_Gain = 0x00000FA0;
    /**
     * Global, octaves, 0.05->5.0, 0.5
     */
    @Generated public static final int kAUNBandEQParam_Bandwidth = 0x00001388;
    @Generated public static final int kAudioUnitScope_Global = 0x00000000;
    @Generated public static final int kAudioUnitScope_Input = 0x00000001;
    @Generated public static final int kAudioUnitScope_Output = 0x00000002;
    @Generated public static final int kAudioUnitScope_Group = 0x00000003;
    @Generated public static final int kAudioUnitScope_Part = 0x00000004;
    @Generated public static final int kAudioUnitScope_Note = 0x00000005;
    @Generated public static final int kAudioUnitScope_Layer = 0x00000006;
    @Generated public static final int kAudioUnitScope_LayerItem = 0x00000007;
    /**
     * range of selectors for audio units
     */
    @Generated public static final int kAudioUnitRange = 0x00000000;
    @Generated public static final int kAudioUnitInitializeSelect = 0x00000001;
    @Generated public static final int kAudioUnitUninitializeSelect = 0x00000002;
    @Generated public static final int kAudioUnitGetPropertyInfoSelect = 0x00000003;
    @Generated public static final int kAudioUnitGetPropertySelect = 0x00000004;
    @Generated public static final int kAudioUnitSetPropertySelect = 0x00000005;
    @Generated public static final int kAudioUnitAddPropertyListenerSelect = 0x0000000A;
    @Generated public static final int kAudioUnitRemovePropertyListenerSelect = 0x0000000B;
    @Generated public static final int kAudioUnitRemovePropertyListenerWithUserDataSelect = 0x00000012;
    @Generated public static final int kAudioUnitAddRenderNotifySelect = 0x0000000F;
    @Generated public static final int kAudioUnitRemoveRenderNotifySelect = 0x00000010;
    @Generated public static final int kAudioUnitGetParameterSelect = 0x00000006;
    @Generated public static final int kAudioUnitSetParameterSelect = 0x00000007;
    @Generated public static final int kAudioUnitScheduleParametersSelect = 0x00000011;
    @Generated public static final int kAudioUnitRenderSelect = 0x0000000E;
    @Generated public static final int kAudioUnitResetSelect = 0x00000009;
    @Generated public static final int kAudioUnitComplexRenderSelect = 0x00000013;
    @Generated public static final int kAudioUnitProcessSelect = 0x00000014;
    @Generated public static final int kAudioUnitProcessMultipleSelect = 0x00000015;
    /**
     * rate control.
     * Global, rate, 1/32 -> 32.0, 1.0
     */
    @Generated public static final int kNewTimePitchParam_Rate = 0x00000000;
    /**
     * pitch shift in cents.
     * Global, Cents, -2400 -> 2400, 1.0
     */
    @Generated public static final int kNewTimePitchParam_Pitch = 0x00000001;
    /**
     * Overlap is the number of overlapped spectral windows that are used to produce the output.
     * The value of overlap is directly proportional to CPU cost. More overlaps can make smooth
     * passages sound smoother. For percussive sound, a lower overlap may be better.
     * Global, generic, 3.0 -> 32.0, 8.0
     */
    @Generated public static final int kNewTimePitchParam_Overlap = 0x00000004;
    /**
     * Peak locking enforces phase coherence of spectral peaks.
     * Peak locking adds some expense but results in a less "phasey"
     * or reverberant sound, sometimes also called loss of presence.
     * However the flip side is that it can sound more stuttery for some content.
     * Global, Boolean, 0->1, 1
     */
    @Generated public static final int kNewTimePitchParam_EnablePeakLocking = 0x00000006;
    @Generated public static final int kAudioSessionCategory_UserInterfaceSoundEffects = 0x75696678;
    @Generated public static final int kAudioSessionCategory_LiveAudio = 0x6C697665;
    /**
     * Global, Hz, 20->(SampleRate/2), 2000
     */
    @Generated public static final int kParametricEQParam_CenterFreq = 0x00000000;
    /**
     * Global, Hz, 0.1->20, 1.0
     */
    @Generated public static final int kParametricEQParam_Q = 0x00000001;
    /**
     * Global, dB, -20->20, 0
     */
    @Generated public static final int kParametricEQParam_Gain = 0x00000002;
    @Generated public static final int kAudioUnitProperty_DeferredRendererPullSize = 0x00000CF8;
    @Generated public static final int kAudioUnitProperty_DeferredRendererExtraLatency = 0x00000CF9;
    @Generated public static final int kAudioUnitProperty_DeferredRendererWaitFrames = 0x00000CFA;
    @Generated public static final int kInstrumentType_DLSPreset = 0x00000001;
    @Generated public static final int kInstrumentType_SF2Preset = 0x00000001;
    @Generated public static final int kInstrumentType_AUPreset = 0x00000002;
    @Generated public static final int kInstrumentType_Audiofile = 0x00000003;
    @Generated public static final int kInstrumentType_EXS24 = 0x00000004;
    @Generated public static final int kMusicNoteEvent_UseGroupInstrument = 0xFFFFFFFF;
    @Generated public static final int kMusicNoteEvent_Unused = 0xFFFFFFFF;
    @Generated public static final int kAudioSessionBeginInterruption = 0x00000001;
    @Generated public static final int kAudioSessionEndInterruption = 0x00000000;
    @Generated public static final int kAudioServicesNoError = 0x00000000;
    @Generated public static final int kAudioServicesUnsupportedPropertyError = 0x7074793F;
    @Generated public static final int kAudioServicesBadPropertySizeError = 0x2173697A;
    @Generated public static final int kAudioServicesBadSpecifierSizeError = 0x21737063;
    @Generated public static final int kAudioServicesSystemSoundUnspecifiedError = 0xFFFFFA24;
    @Generated public static final int kAudioServicesSystemSoundClientTimedOutError = 0xFFFFFA23;
    @Generated public static final int kAudioServicesSystemSoundExceededMaximumDurationError = 0xFFFFFA22;
    @Generated public static final int kAudioUnitProperty_ScheduleAudioSlice = 0x00000CE4;
    @Generated public static final int kAudioUnitProperty_ScheduleStartTimeStamp = 0x00000CE5;
    @Generated public static final int kAudioUnitProperty_CurrentPlayTime = 0x00000CE6;
    @Generated public static final int kAudioFileMarkerType_Generic = 0x00000000;
    /**
     * General mixers
     */
    @Generated public static final int kAudioUnitProperty_MeteringMode = 0x00000BBF;
    /**
     * Matrix Mixer
     */
    @Generated public static final int kAudioUnitProperty_MatrixLevels = 0x00000BBE;
    /**
     * Matrix Mixer
     */
    @Generated public static final int kAudioUnitProperty_MatrixDimensions = 0x00000BC1;
    /**
     * Matrix Mixer
     */
    @Generated public static final int kAudioUnitProperty_MeterClipping = 0x00000BC3;
    /**
     * Multichannel Mixer
     */
    @Generated public static final int kAudioUnitProperty_InputAnchorTimeStamp = 0x00000BC8;
    @Generated public static final int kAudioQueueTimePitchAlgorithm_LowQualityZeroLatency = 0x6C717A6C;
    @Generated public static final int kAUVoiceIOProperty_BypassVoiceProcessing = 0x00000834;
    @Generated public static final int kAUVoiceIOProperty_VoiceProcessingEnableAGC = 0x00000835;
    @Generated public static final int kAUVoiceIOProperty_MuteOutput = 0x00000838;
    /**
     * Input, Degrees, -180->180, 0
     */
    @Generated public static final int k3DMixerParam_Azimuth = 0x00000000;
    /**
     * Input, Degrees, -90->90, 0
     */
    @Generated public static final int k3DMixerParam_Elevation = 0x00000001;
    /**
     * Input, Metres, 0->10000, 0
     */
    @Generated public static final int k3DMixerParam_Distance = 0x00000002;
    /**
     * Input/Output, dB, -120->20, 0
     */
    @Generated public static final int k3DMixerParam_Gain = 0x00000003;
    /**
     * Input, rate scaler	0.5 -> 2.0
     */
    @Generated public static final int k3DMixerParam_PlaybackRate = 0x00000004;
    /**
     * bus enable : 0.0 or 1.0
     */
    @Generated public static final int k3DMixerParam_Enable = 0x00000005;
    /**
     * Minimum input gain constraint : 0.0 -> 1.0 (available on iphone only)
     */
    @Generated public static final int k3DMixerParam_MinGain = 0x00000006;
    /**
     * Maximum input gain constraint : 0.0 -> 1.0 (available on iphone only)
     */
    @Generated public static final int k3DMixerParam_MaxGain = 0x00000007;
    /**
     * Input, Dry/Wet equal-power blend, %	  0.0 -> 100.0
     */
    @Generated public static final int k3DMixerParam_ReverbBlend = 0x00000008;
    /**
     * Global, dB,		-40.0 -> +40.0
     */
    @Generated public static final int k3DMixerParam_GlobalReverbGain = 0x00000009;
    /**
     * Input, Lowpass filter attenuation at 5KHz :		decibels -100.0dB -> 0.0dB
     * smaller values make both direct and reverb sound more muffled; a value of 0.0 indicates no filtering
     * Occlusion is a filter applied to the sound prior to the reverb send
     */
    @Generated public static final int k3DMixerParam_OcclusionAttenuation = 0x0000000A;
    /**
     * Input, Lowpass filter attenuation at 5KHz :		decibels -100.0dB -> 0.0dB
     * smaller values make direct sound more muffled; a value of 0.0 indicates no filtering
     * Obstruction is a filter applied to the "direct" part of the sound (so is post reverb send)
     */
    @Generated public static final int k3DMixerParam_ObstructionAttenuation = 0x0000000B;
    @Generated public static final int kAudioUnitSubType_RemoteIO = 0x72696F63;
    @Generated public static final int kCAF_FileType = 0x63616666;
    @Generated public static final int kCAF_FileVersion_Initial = 0x00000001;
    @Generated public static final int kAudioOutputUnitProperty_MIDICallbacks = 0x000007DA;
    @Generated public static final int kAudioOutputUnitProperty_HostReceivesRemoteControlEvents = 0x000007DB;
    @Generated public static final int kAudioOutputUnitProperty_RemoteControlToHost = 0x000007DC;
    @Generated public static final int kAudioOutputUnitProperty_HostTransportState = 0x000007DD;
    @Generated public static final int kAudioOutputUnitProperty_NodeComponentDescription = 0x000007DE;
    /**
     * range  (2000 -> 2999)
     */
    @Generated public static final int kAudioOutputUnitProperty_IsRunning = 0x000007D1;
    @Generated public static final int kAudioUnitErr_InvalidProperty = 0xFFFFD581;
    @Generated public static final int kAudioUnitErr_InvalidParameter = 0xFFFFD582;
    @Generated public static final int kAudioUnitErr_InvalidElement = 0xFFFFD583;
    @Generated public static final int kAudioUnitErr_NoConnection = 0xFFFFD584;
    @Generated public static final int kAudioUnitErr_FailedInitialization = 0xFFFFD585;
    @Generated public static final int kAudioUnitErr_TooManyFramesToProcess = 0xFFFFD586;
    @Generated public static final int kAudioUnitErr_InvalidFile = 0xFFFFD589;
    @Generated public static final int kAudioUnitErr_UnknownFileType = 0xFFFFD58A;
    @Generated public static final int kAudioUnitErr_FileNotSpecified = 0xFFFFD58B;
    @Generated public static final int kAudioUnitErr_FormatNotSupported = 0xFFFFD58C;
    @Generated public static final int kAudioUnitErr_Uninitialized = 0xFFFFD58D;
    @Generated public static final int kAudioUnitErr_InvalidScope = 0xFFFFD58E;
    @Generated public static final int kAudioUnitErr_PropertyNotWritable = 0xFFFFD58F;
    @Generated public static final int kAudioUnitErr_CannotDoInCurrentContext = 0xFFFFD591;
    @Generated public static final int kAudioUnitErr_InvalidPropertyValue = 0xFFFFD59D;
    @Generated public static final int kAudioUnitErr_PropertyNotInUse = 0xFFFFD59E;
    @Generated public static final int kAudioUnitErr_Initialized = 0xFFFFD59F;
    @Generated public static final int kAudioUnitErr_InvalidOfflineRender = 0xFFFFD5A0;
    @Generated public static final int kAudioUnitErr_Unauthorized = 0xFFFFD5A1;
    @Generated public static final int kAudioComponentErr_InstanceInvalidated = 0xFFFEFB43;
    @Generated public static final int kAudioUnitErr_RenderTimeout = 0xFFFEFB47;
    /**
     * Global, Hz, 20->(SampleRate/2), 5000
     */
    @Generated public static final int kBandpassParam_CenterFrequency = 0x00000000;
    /**
     * Global, Cents, 100->12000, 600
     */
    @Generated public static final int kBandpassParam_Bandwidth = 0x00000001;
    @Generated public static final int kAUMIDISynthProperty_EnablePreload = 0x00001017;
    /**
     * Global, dB, -90->12, 0
     */
    @Generated public static final int kAUSamplerParam_Gain = 0x00000384;
    /**
     * Global, Semitones, -24->24, 0
     */
    @Generated public static final int kAUSamplerParam_CoarseTuning = 0x00000385;
    /**
     * Global, Cents, -99->99, 0
     */
    @Generated public static final int kAUSamplerParam_FineTuning = 0x00000386;
    /**
     * Global, -1.0->1.0, 0
     */
    @Generated public static final int kAUSamplerParam_Pan = 0x00000387;
    @Generated public static final int kSequenceTrackProperty_LoopInfo = 0x00000000;
    @Generated public static final int kSequenceTrackProperty_OffsetTime = 0x00000001;
    @Generated public static final int kSequenceTrackProperty_MuteStatus = 0x00000002;
    @Generated public static final int kSequenceTrackProperty_SoloStatus = 0x00000003;
    /**
     * added in 10.2
     */
    @Generated public static final int kSequenceTrackProperty_AutomatedParameters = 0x00000004;
    /**
     * added in 10.3
     */
    @Generated public static final int kSequenceTrackProperty_TrackLength = 0x00000005;
    /**
     * added in 10.5
     */
    @Generated public static final int kSequenceTrackProperty_TimeResolution = 0x00000006;
    @Generated public static final int kAudioQueueTimePitchAlgorithm_Spectral = 0x73706563;
    @Generated public static final int kAudioQueueTimePitchAlgorithm_TimeDomain = 0x7469646F;
    @Generated public static final int kAudioQueueTimePitchAlgorithm_Varispeed = 0x76737064;
    /**
     * CFStringRef      (get only)
     */
    @Generated public static final int kAudioSessionProperty_AudioRoute = 0x726F7574;
    @Generated public static final int kCAF_StreamDescriptionChunkID = 0x64657363;
    @Generated public static final int kCAF_AudioDataChunkID = 0x64617461;
    @Generated public static final int kCAF_ChannelLayoutChunkID = 0x6368616E;
    @Generated public static final int kCAF_FillerChunkID = 0x66726565;
    @Generated public static final int kCAF_MarkerChunkID = 0x6D61726B;
    @Generated public static final int kCAF_RegionChunkID = 0x7265676E;
    @Generated public static final int kCAF_InstrumentChunkID = 0x696E7374;
    @Generated public static final int kCAF_MagicCookieID = 0x6B756B69;
    @Generated public static final int kCAF_InfoStringsChunkID = 0x696E666F;
    @Generated public static final int kCAF_EditCommentsChunkID = 0x65646374;
    @Generated public static final int kCAF_PacketTableChunkID = 0x70616B74;
    @Generated public static final int kCAF_StringsChunkID = 0x73747267;
    @Generated public static final int kCAF_UUIDChunkID = 0x75756964;
    @Generated public static final int kCAF_PeakChunkID = 0x7065616B;
    @Generated public static final int kCAF_OverviewChunkID = 0x6F767677;
    @Generated public static final int kCAF_MIDIChunkID = 0x6D696469;
    @Generated public static final int kCAF_UMIDChunkID = 0x756D6964;
    @Generated public static final int kCAF_FormatListID = 0x6C647363;
    @Generated public static final int kCAF_iXMLChunkID = 0x69584D4C;
    @Generated public static final int kAudioUnitSubType_AUConverter = 0x636F6E76;
    @Generated public static final int kAudioUnitSubType_Varispeed = 0x76617269;
    @Generated public static final int kAudioUnitSubType_DeferredRenderer = 0x64656672;
    @Generated public static final int kAudioUnitSubType_Splitter = 0x73706C74;
    @Generated public static final int kAudioUnitSubType_MultiSplitter = 0x6D73706C;
    @Generated public static final int kAudioUnitSubType_Merger = 0x6D657267;
    @Generated public static final int kAudioUnitSubType_NewTimePitch = 0x6E757470;
    @Generated public static final int kAudioUnitSubType_AUiPodTimeOther = 0x6970746F;
    @Generated public static final int kAudioUnitSubType_RoundTripAAC = 0x72616163;
    /**
     * Float64          (get/set)
     */
    @Generated public static final int kAudioSessionProperty_PreferredHardwareSampleRate = 0x68777372;
    /**
     * Float32          (get/set)
     */
    @Generated public static final int kAudioSessionProperty_PreferredHardwareIOBufferDuration = 0x696F6264;
    /**
     * UInt32           (get/set)
     */
    @Generated public static final int kAudioSessionProperty_AudioCategory = 0x61636174;
    /**
     * CFDictionaryRef  (property listener)
     */
    @Generated public static final int kAudioSessionProperty_AudioRouteChange = 0x726F6368;
    /**
     * Float64          (get only)
     */
    @Generated public static final int kAudioSessionProperty_CurrentHardwareSampleRate = 0x63687372;
    /**
     * UInt32           (get only/property listener)
     */
    @Generated public static final int kAudioSessionProperty_CurrentHardwareInputNumberChannels = 0x63686963;
    /**
     * UInt32           (get only/property listener)
     */
    @Generated public static final int kAudioSessionProperty_CurrentHardwareOutputNumberChannels = 0x63686F63;
    /**
     * Float32          (get only/property listener)
     */
    @Generated public static final int kAudioSessionProperty_CurrentHardwareOutputVolume = 0x63686F76;
    /**
     * Float32          (get only)
     */
    @Generated public static final int kAudioSessionProperty_CurrentHardwareInputLatency = 0x63696C74;
    /**
     * Float32          (get only)
     */
    @Generated public static final int kAudioSessionProperty_CurrentHardwareOutputLatency = 0x636F6C74;
    /**
     * Float32          (get only)
     */
    @Generated public static final int kAudioSessionProperty_CurrentHardwareIOBufferDuration = 0x63686264;
    /**
     * UInt32           (get only)
     */
    @Generated public static final int kAudioSessionProperty_OtherAudioIsPlaying = 0x6F746872;
    /**
     * UInt32           (set only)
     */
    @Generated public static final int kAudioSessionProperty_OverrideAudioRoute = 0x6F767264;
    /**
     * UInt32           (get only/property listener)
     */
    @Generated public static final int kAudioSessionProperty_AudioInputAvailable = 0x61696176;
    /**
     * UInt32           (property listener)
     */
    @Generated public static final int kAudioSessionProperty_ServerDied = 0x64696564;
    /**
     * UInt32           (get/set)
     */
    @Generated public static final int kAudioSessionProperty_OtherMixableAudioShouldDuck = 0x6475636B;
    /**
     * UInt32           (get, some set)
     */
    @Generated public static final int kAudioSessionProperty_OverrideCategoryMixWithOthers = 0x636D6978;
    /**
     * UInt32           (get, some set)
     */
    @Generated public static final int kAudioSessionProperty_OverrideCategoryDefaultToSpeaker = 0x6373706B;
    /**
     * UInt32           (get, some set)
     */
    @Generated public static final int kAudioSessionProperty_OverrideCategoryEnableBluetoothInput = 0x63626C75;
    /**
     * UInt32           (get only)
     */
    @Generated public static final int kAudioSessionProperty_InterruptionType = 0x74797065;
    /**
     * UInt32           (get/set)
     */
    @Generated public static final int kAudioSessionProperty_Mode = 0x6D6F6465;
    /**
     * CFArrayRef       (get only/property listener)
     */
    @Generated public static final int kAudioSessionProperty_InputSources = 0x73726373;
    /**
     * CFArrayRef       (get only/property listener)
     */
    @Generated public static final int kAudioSessionProperty_OutputDestinations = 0x64737473;
    /**
     * CFNumberRef      (get/set)
     */
    @Generated public static final int kAudioSessionProperty_InputSource = 0x69737263;
    /**
     * CFNumberRef      (get/set)
     */
    @Generated public static final int kAudioSessionProperty_OutputDestination = 0x6F647374;
    /**
     * UInt32           (get only/property listener)
     */
    @Generated public static final int kAudioSessionProperty_InputGainAvailable = 0x69676176;
    /**
     * Float32          (get/set/property listener)
     */
    @Generated public static final int kAudioSessionProperty_InputGainScalar = 0x69677363;
    /**
     * CFDictionaryRef  (get only)
     */
    @Generated public static final int kAudioSessionProperty_AudioRouteDescription = 0x63726172;
    @Generated public static final int kAudioSessionRouteChangeReason_Unknown = 0x00000000;
    @Generated public static final int kAudioSessionRouteChangeReason_NewDeviceAvailable = 0x00000001;
    @Generated public static final int kAudioSessionRouteChangeReason_OldDeviceUnavailable = 0x00000002;
    @Generated public static final int kAudioSessionRouteChangeReason_CategoryChange = 0x00000003;
    @Generated public static final int kAudioSessionRouteChangeReason_Override = 0x00000004;
    @Generated public static final int kAudioSessionRouteChangeReason_WakeFromSleep = 0x00000006;
    @Generated public static final int kAudioSessionRouteChangeReason_NoSuitableRouteForCategory = 0x00000007;
    @Generated public static final int kAudioSessionRouteChangeReason_RouteConfigurationChange = 0x00000008;
    @Generated public static final int kAudioConverterQuality_Max = 0x0000007F;
    @Generated public static final int kAudioConverterQuality_High = 0x00000060;
    @Generated public static final int kAudioConverterQuality_Medium = 0x00000040;
    @Generated public static final int kAudioConverterQuality_Low = 0x00000020;
    @Generated public static final int kAudioConverterQuality_Min = 0x00000000;
    /**
     * value is UInt32
     */
    @Generated public static final int kAudioQueueProperty_HardwareCodecPolicy = 0x61716370;
    @Generated public static final int kAudioFileStreamProperty_ReadyToProducePackets = 0x72656479;
    @Generated public static final int kAudioFileStreamProperty_FileFormat = 0x66666D74;
    @Generated public static final int kAudioFileStreamProperty_DataFormat = 0x64666D74;
    @Generated public static final int kAudioFileStreamProperty_FormatList = 0x666C7374;
    @Generated public static final int kAudioFileStreamProperty_MagicCookieData = 0x6D676963;
    @Generated public static final int kAudioFileStreamProperty_AudioDataByteCount = 0x62636E74;
    @Generated public static final int kAudioFileStreamProperty_AudioDataPacketCount = 0x70636E74;
    @Generated public static final int kAudioFileStreamProperty_MaximumPacketSize = 0x70737A65;
    @Generated public static final int kAudioFileStreamProperty_DataOffset = 0x646F6666;
    @Generated public static final int kAudioFileStreamProperty_ChannelLayout = 0x636D6170;
    @Generated public static final int kAudioFileStreamProperty_PacketToFrame = 0x706B6672;
    @Generated public static final int kAudioFileStreamProperty_FrameToPacket = 0x6672706B;
    @Generated public static final int kAudioFileStreamProperty_PacketToByte = 0x706B6279;
    @Generated public static final int kAudioFileStreamProperty_ByteToPacket = 0x6279706B;
    @Generated public static final int kAudioFileStreamProperty_PacketTableInfo = 0x706E666F;
    @Generated public static final int kAudioFileStreamProperty_PacketSizeUpperBound = 0x706B7562;
    @Generated public static final int kAudioFileStreamProperty_AverageBytesPerPacket = 0x61627070;
    @Generated public static final int kAudioFileStreamProperty_BitRate = 0x62726174;
    @Generated public static final int kAudioFileStreamProperty_InfoDictionary = 0x696E666F;
    /**
     * Global, Milliseconds, 0.1 -> 500, 0.1
     */
    @Generated public static final int kDistortionParam_Delay = 0x00000000;
    /**
     * Global, Rate, 0.1 -> 50, 1.0
     */
    @Generated public static final int kDistortionParam_Decay = 0x00000001;
    /**
     * Global, Percent, 0 -> 100, 50
     */
    @Generated public static final int kDistortionParam_DelayMix = 0x00000002;
    /**
     * Global, Percent, 0 -> 100
     */
    @Generated public static final int kDistortionParam_Decimation = 0x00000003;
    /**
     * Global, Percent, 0 -> 100, 0
     */
    @Generated public static final int kDistortionParam_Rounding = 0x00000004;
    /**
     * Global, Percent, 0 -> 100, 50
     */
    @Generated public static final int kDistortionParam_DecimationMix = 0x00000005;
    /**
     * Global, Linear Gain, 0 -> 1, 1
     */
    @Generated public static final int kDistortionParam_LinearTerm = 0x00000006;
    /**
     * Global, Linear Gain, 0 -> 20, 0
     */
    @Generated public static final int kDistortionParam_SquaredTerm = 0x00000007;
    /**
     * Global, Linear Gain, 0 -> 20, 0
     */
    @Generated public static final int kDistortionParam_CubicTerm = 0x00000008;
    /**
     * Global, Percent, 0 -> 100, 50
     */
    @Generated public static final int kDistortionParam_PolynomialMix = 0x00000009;
    /**
     * Global, Hertz, 0.5 -> 8000, 100
     */
    @Generated public static final int kDistortionParam_RingModFreq1 = 0x0000000A;
    /**
     * Global, Hertz, 0.5 -> 8000, 100
     */
    @Generated public static final int kDistortionParam_RingModFreq2 = 0x0000000B;
    /**
     * Global, Percent, 0 -> 100, 50
     */
    @Generated public static final int kDistortionParam_RingModBalance = 0x0000000C;
    /**
     * Global, Percent, 0 -> 100, 0
     */
    @Generated public static final int kDistortionParam_RingModMix = 0x0000000D;
    /**
     * Global, dB, -80 -> 20, -6
     */
    @Generated public static final int kDistortionParam_SoftClipGain = 0x0000000E;
    /**
     * Global, Percent, 0 -> 100, 50
     */
    @Generated public static final int kDistortionParam_FinalMix = 0x0000000F;
    @Generated public static final int kTimePitchParam_Rate = 0x00000000;
    @Generated public static final int kCAFMarkerType_Generic = 0x00000000;
    @Generated public static final int kCAFMarkerType_ProgramStart = 0x70626567;
    @Generated public static final int kCAFMarkerType_ProgramEnd = 0x70656E64;
    @Generated public static final int kCAFMarkerType_TrackStart = 0x74626567;
    @Generated public static final int kCAFMarkerType_TrackEnd = 0x74656E64;
    @Generated public static final int kCAFMarkerType_Index = 0x696E6478;
    @Generated public static final int kCAFMarkerType_RegionStart = 0x72626567;
    @Generated public static final int kCAFMarkerType_RegionEnd = 0x72656E64;
    @Generated public static final int kCAFMarkerType_RegionSyncPoint = 0x72737963;
    @Generated public static final int kCAFMarkerType_SelectionStart = 0x73626567;
    @Generated public static final int kCAFMarkerType_SelectionEnd = 0x73656E64;
    @Generated public static final int kCAFMarkerType_EditSourceBegin = 0x63626567;
    @Generated public static final int kCAFMarkerType_EditSourceEnd = 0x63656E64;
    @Generated public static final int kCAFMarkerType_EditDestinationBegin = 0x64626567;
    @Generated public static final int kCAFMarkerType_EditDestinationEnd = 0x64656E64;
    @Generated public static final int kCAFMarkerType_SustainLoopStart = 0x736C6267;
    @Generated public static final int kCAFMarkerType_SustainLoopEnd = 0x736C656E;
    @Generated public static final int kCAFMarkerType_ReleaseLoopStart = 0x726C6267;
    @Generated public static final int kCAFMarkerType_ReleaseLoopEnd = 0x726C656E;
    @Generated public static final int kCAFMarkerType_SavedPlayPosition = 0x73706C79;
    @Generated public static final int kCAFMarkerType_Tempo = 0x746D706F;
    @Generated public static final int kCAFMarkerType_TimeSignature = 0x74736967;
    @Generated public static final int kCAFMarkerType_KeySignature = 0x6B736967;
    @Generated public static final int kAudioUnitProperty_SampleRateConverterComplexity = 0x00000BC6;
    @Generated public static final int kNumberOfResponseFrequencies = 0x00000400;
    /**
     * Global, Linear Gain, 0->1, 1. (the volume value can actually be any finite number, including negative.)
     */
    @Generated public static final int kMultiChannelMixerParam_Volume = 0x00000000;
    /**
     * Global, Boolean, 0->1, 1
     */
    @Generated public static final int kMultiChannelMixerParam_Enable = 0x00000001;
    /**
     * -1 - 0 - 1, only valid when output is not mono
     */
    @Generated public static final int kMultiChannelMixerParam_Pan = 0x00000002;
    /**
     * read-only, Input or Output scope.
     * these report level in dB, as do the other mixers
     */
    @Generated public static final int kMultiChannelMixerParam_PreAveragePower = 0x000003E8;
    /**
     * read-only, Input or Output scope.
     * these report level in dB, as do the other mixers
     */
    @Generated public static final int kMultiChannelMixerParam_PrePeakHoldLevel = 0x000007D0;
    /**
     * read-only, Input or Output scope.
     * these report level in dB, as do the other mixers
     */
    @Generated public static final int kMultiChannelMixerParam_PostAveragePower = 0x00000BB8;
    /**
     * read-only, Input or Output scope.
     * these report level in dB, as do the other mixers
     */
    @Generated public static final int kMultiChannelMixerParam_PostPeakHoldLevel = 0x00000FA0;
    @Generated public static final int kAudioUnitSubType_AUiPodTime = 0x6970746D;
    @Generated public static final int kAppleSoftwareAudioCodecManufacturer = 0x6170706C;
    @Generated public static final int kAppleHardwareAudioCodecManufacturer = 0x61706877;
    /**
     * Global, Hz, 10->(SampleRate/2), 6900
     */
    @Generated public static final int kLowPassParam_CutoffFrequency = 0x00000000;
    /**
     * Global, dB, -20->40, 0
     */
    @Generated public static final int kLowPassParam_Resonance = 0x00000001;
    @Generated public static final int kSystemSoundID_Vibrate = 0x00000FFF;
    @Generated public static final int kAudioFilePropertyFileFormat = 0x66666D74;
    @Generated public static final int kAudioFilePropertyDataFormat = 0x64666D74;
    @Generated public static final int kAudioFilePropertyIsOptimized = 0x6F70746D;
    @Generated public static final int kAudioFilePropertyMagicCookieData = 0x6D676963;
    @Generated public static final int kAudioFilePropertyAudioDataByteCount = 0x62636E74;
    @Generated public static final int kAudioFilePropertyAudioDataPacketCount = 0x70636E74;
    @Generated public static final int kAudioFilePropertyMaximumPacketSize = 0x70737A65;
    @Generated public static final int kAudioFilePropertyDataOffset = 0x646F6666;
    @Generated public static final int kAudioFilePropertyChannelLayout = 0x636D6170;
    @Generated public static final int kAudioFilePropertyDeferSizeUpdates = 0x64737A75;
    @Generated public static final int kAudioFilePropertyDataFormatName = 0x666E6D65;
    @Generated public static final int kAudioFilePropertyMarkerList = 0x6D6B6C73;
    @Generated public static final int kAudioFilePropertyRegionList = 0x72676C73;
    @Generated public static final int kAudioFilePropertyPacketToFrame = 0x706B6672;
    @Generated public static final int kAudioFilePropertyFrameToPacket = 0x6672706B;
    @Generated public static final int kAudioFilePropertyPacketToByte = 0x706B6279;
    @Generated public static final int kAudioFilePropertyByteToPacket = 0x6279706B;
    @Generated public static final int kAudioFilePropertyChunkIDs = 0x63686964;
    @Generated public static final int kAudioFilePropertyInfoDictionary = 0x696E666F;
    @Generated public static final int kAudioFilePropertyPacketTableInfo = 0x706E666F;
    @Generated public static final int kAudioFilePropertyFormatList = 0x666C7374;
    @Generated public static final int kAudioFilePropertyPacketSizeUpperBound = 0x706B7562;
    @Generated public static final int kAudioFilePropertyReserveDuration = 0x72737276;
    @Generated public static final int kAudioFilePropertyEstimatedDuration = 0x65647572;
    @Generated public static final int kAudioFilePropertyBitRate = 0x62726174;
    @Generated public static final int kAudioFilePropertyID3Tag = 0x69643374;
    @Generated public static final int kAudioFilePropertySourceBitDepth = 0x73627464;
    @Generated public static final int kAudioFilePropertyAlbumArtwork = 0x61617274;
    @Generated public static final int kAudioFilePropertyAudioTrackCount = 0x61746374;
    @Generated public static final int kAudioFilePropertyUseAudioTrack = 0x7561746B;
    @Generated public static final int kMatrixMixerParam_Volume = 0x00000000;
    @Generated public static final int kMatrixMixerParam_Enable = 0x00000001;
    /**
     * read-only
     * these report level in dB, as do the other mixers
     */
    @Generated public static final int kMatrixMixerParam_PreAveragePower = 0x000003E8;
    /**
     * read-only
     * these report level in dB, as do the other mixers
     */
    @Generated public static final int kMatrixMixerParam_PrePeakHoldLevel = 0x000007D0;
    /**
     * read-only
     * these report level in dB, as do the other mixers
     */
    @Generated public static final int kMatrixMixerParam_PostAveragePower = 0x00000BB8;
    /**
     * read-only
     * these report level in dB, as do the other mixers
     */
    @Generated public static final int kMatrixMixerParam_PostPeakHoldLevel = 0x00000FA0;
    /**
     * these report linear levels - for "expert" use only.
     */
    @Generated public static final int kMatrixMixerParam_PreAveragePowerLinear = 0x00001388;
    /**
     * these report linear levels - for "expert" use only.
     */
    @Generated public static final int kMatrixMixerParam_PrePeakHoldLevelLinear = 0x00001770;
    /**
     * these report linear levels - for "expert" use only.
     */
    @Generated public static final int kMatrixMixerParam_PostAveragePowerLinear = 0x00001B58;
    /**
     * these report linear levels - for "expert" use only.
     */
    @Generated public static final int kMatrixMixerParam_PostPeakHoldLevelLinear = 0x00001F40;
    /**
     * Input, Degrees, -180->180, 0
     */
    @Generated public static final int kSpatialMixerParam_Azimuth = 0x00000000;
    /**
     * Input, Degrees, -90->90, 0
     */
    @Generated public static final int kSpatialMixerParam_Elevation = 0x00000001;
    /**
     * Input, Metres, 0->10000, 0
     */
    @Generated public static final int kSpatialMixerParam_Distance = 0x00000002;
    /**
     * Input/Output, dB, -120->20, 0
     */
    @Generated public static final int kSpatialMixerParam_Gain = 0x00000003;
    /**
     * Input, rate scaler	0.5 -> 2.0, 1.0
     */
    @Generated public static final int kSpatialMixerParam_PlaybackRate = 0x00000004;
    /**
     * bus enable : 0 or 1, 1
     */
    @Generated public static final int kSpatialMixerParam_Enable = 0x00000005;
    /**
     * Minimum input gain constraint : 0.0 -> 10.0, 0.0
     */
    @Generated public static final int kSpatialMixerParam_MinGain = 0x00000006;
    /**
     * Maximum input gain constraint : 0.0 -> 10.0, 10.0
     */
    @Generated public static final int kSpatialMixerParam_MaxGain = 0x00000007;
    /**
     * Input, Dry/Wet equal-power blend, %	  0.0 -> 100.0, 30.0
     */
    @Generated public static final int kSpatialMixerParam_ReverbBlend = 0x00000008;
    /**
     * Global, dB,		-40.0 -> +40.0, 0.0
     */
    @Generated public static final int kSpatialMixerParam_GlobalReverbGain = 0x00000009;
    /**
     * Input, Lowpass filter attenuation at 5KHz :		decibels -100.0dB -> 0.0dB, 0.0dB
     * smaller values make both direct and reverb sound more muffled; a value of 0.0 indicates no filtering
     * Occlusion is a filter applied to the sound prior to the reverb send
     */
    @Generated public static final int kSpatialMixerParam_OcclusionAttenuation = 0x0000000A;
    /**
     * Input, Lowpass filter attenuation at 5KHz :		decibels -100.0dB -> 0.0dB, 0.0dB
     * smaller values make direct sound more muffled; a value of 0.0 indicates no filtering
     * Obstruction is a filter applied to the "direct" part of the sound (so is post reverb send)
     */
    @Generated public static final int kSpatialMixerParam_ObstructionAttenuation = 0x0000000B;
    @Generated public static final long AUEventSampleTimeImmediate = 0xFFFFFFFF00000000L;
    @Generated public static final int kAudioQueueProperty_ChannelAssignments = 0x61716361;
    /**
     * Global, CrossFade, 0->100, 100
     */
    @Generated public static final int kReverb2Param_DryWetMix = 0x00000000;
    /**
     * Global, Decibels, -20->20, 0
     */
    @Generated public static final int kReverb2Param_Gain = 0x00000001;
    /**
     * Global, Secs, 0.0001->1.0, 0.008
     */
    @Generated public static final int kReverb2Param_MinDelayTime = 0x00000002;
    /**
     * Global, Secs, 0.0001->1.0, 0.050
     */
    @Generated public static final int kReverb2Param_MaxDelayTime = 0x00000003;
    /**
     * Global, Secs, 0.001->20.0, 1.0
     */
    @Generated public static final int kReverb2Param_DecayTimeAt0Hz = 0x00000004;
    /**
     * Global, Secs, 0.001->20.0, 0.5
     */
    @Generated public static final int kReverb2Param_DecayTimeAtNyquist = 0x00000005;
    /**
     * Global, Integer, 1->1000
     */
    @Generated public static final int kReverb2Param_RandomizeReflections = 0x00000006;
    /**
     * Global, Hertz, 10.0 -> 20000.0, 800.0
     */
    @Generated public static final int kReverbParam_FilterFrequency = 0x0000000E;
    /**
     * Global, Octaves, 0.05 -> 4.0, 3.0
     */
    @Generated public static final int kReverbParam_FilterBandwidth = 0x0000000F;
    /**
     * Global, Decibels, -18.0 -> +18.0, 0.0
     */
    @Generated public static final int kReverbParam_FilterGain = 0x00000010;
    /**
     * only available for AUSpatialMixer
     */
    @Generated public static final int kReverbParam_FilterType = 0x00000011;
    /**
     * only available for AUSpatialMixer
     */
    @Generated public static final int kReverbParam_FilterEnable = 0x00000012;
    @Generated public static final int kAudioUnitManufacturer_Apple = 0x6170706C;
    /**
     * Global, Hz, 10->(SampleRate/2), 6900
     */
    @Generated public static final int kHipassParam_CutoffFrequency = 0x00000000;
    /**
     * Global, dB, -20->40, 0
     */
    @Generated public static final int kHipassParam_Resonance = 0x00000001;
    @Deprecated @Generated public static final int kAudioUnitProperty_3DMixerDistanceParams = 0x00000BC2;
    @Deprecated @Generated public static final int kAudioUnitProperty_3DMixerAttenuationCurve = 0x00000BC5;
    @Deprecated @Generated public static final int kAudioUnitProperty_DopplerShift = 0x00000BBA;
    @Deprecated @Generated public static final int kAudioUnitProperty_3DMixerRenderingFlags = 0x00000BBB;
    @Deprecated @Generated public static final int kAudioUnitProperty_3DMixerDistanceAtten = 0x00000BBC;
    @Deprecated @Generated public static final int kAudioUnitProperty_ReverbPreset = 0x00000BC4;
    @Generated public static final int kMusicDeviceProperty_InstrumentName = 0x000003E9;
    @Generated public static final int kMusicDeviceProperty_InstrumentNumber = 0x000003EC;
    @Generated public static final int kExtAudioFileError_CodecUnavailableInputConsumed = 0xFFFEFC01;
    @Generated public static final int kExtAudioFileError_CodecUnavailableInputNotConsumed = 0xFFFEFC00;
    @Deprecated @Generated public static final int kAudioUnitErr_IllegalInstrument = 0xFFFFD587;
    @Deprecated @Generated public static final int kAudioUnitErr_InstrumentTypeNotFound = 0xFFFFD588;
    @Generated public static final int kAudioQueueErr_InvalidBuffer = 0xFFFEFB81;
    @Generated public static final int kAudioQueueErr_BufferEmpty = 0xFFFEFB82;
    @Generated public static final int kAudioQueueErr_DisposalPending = 0xFFFEFB83;
    @Generated public static final int kAudioQueueErr_InvalidProperty = 0xFFFEFB84;
    @Generated public static final int kAudioQueueErr_InvalidPropertySize = 0xFFFEFB85;
    @Generated public static final int kAudioQueueErr_InvalidParameter = 0xFFFEFB86;
    @Generated public static final int kAudioQueueErr_CannotStart = 0xFFFEFB87;
    @Generated public static final int kAudioQueueErr_InvalidDevice = 0xFFFEFB88;
    @Generated public static final int kAudioQueueErr_BufferInQueue = 0xFFFEFB89;
    @Generated public static final int kAudioQueueErr_InvalidRunState = 0xFFFEFB8A;
    @Generated public static final int kAudioQueueErr_InvalidQueueType = 0xFFFEFB8B;
    @Generated public static final int kAudioQueueErr_Permissions = 0xFFFEFB8C;
    @Generated public static final int kAudioQueueErr_InvalidPropertyValue = 0xFFFEFB8D;
    @Generated public static final int kAudioQueueErr_PrimeTimedOut = 0xFFFEFB8E;
    @Generated public static final int kAudioQueueErr_CodecNotFound = 0xFFFEFB8F;
    @Generated public static final int kAudioQueueErr_InvalidCodecAccess = 0xFFFEFB90;
    @Generated public static final int kAudioQueueErr_QueueInvalidated = 0xFFFEFB91;
    @Generated public static final int kAudioQueueErr_TooManyTaps = 0xFFFEFB92;
    @Generated public static final int kAudioQueueErr_InvalidTapContext = 0xFFFEFB93;
    @Generated public static final int kAudioQueueErr_RecordUnderrun = 0xFFFEFB94;
    @Generated public static final int kAudioQueueErr_InvalidTapType = 0xFFFEFB95;
    @Generated public static final int kAudioQueueErr_BufferEnqueuedTwice = 0xFFFEFB96;
    @Generated public static final int kAudioQueueErr_CannotStartYet = 0xFFFEFB97;
    @Generated public static final int kAudioQueueErr_EnqueueDuringReset = 0xFFFEFBB8;
    @Generated public static final int kAudioQueueErr_InvalidOfflineMode = 0xFFFEFBBE;
    @Generated public static final int kAudioUnitSubType_PeakLimiter = 0x6C6D7472;
    @Generated public static final int kAudioUnitSubType_DynamicsProcessor = 0x64636D70;
    @Generated public static final int kAudioUnitSubType_LowPassFilter = 0x6C706173;
    @Generated public static final int kAudioUnitSubType_HighPassFilter = 0x68706173;
    @Generated public static final int kAudioUnitSubType_BandPassFilter = 0x62706173;
    @Generated public static final int kAudioUnitSubType_HighShelfFilter = 0x68736866;
    @Generated public static final int kAudioUnitSubType_LowShelfFilter = 0x6C736866;
    @Generated public static final int kAudioUnitSubType_ParametricEQ = 0x706D6571;
    @Generated public static final int kAudioUnitSubType_Distortion = 0x64697374;
    @Generated public static final int kAudioUnitSubType_Delay = 0x64656C79;
    @Generated public static final int kAudioUnitSubType_SampleDelay = 0x73646C79;
    @Generated public static final int kAudioUnitSubType_NBandEQ = 0x6E626571;
    /**
     * value 0 < 128
     */
    @Generated public static final int kAUGroupParameterID_Volume = 0x00000007;
    /**
     * value 0-63 (off), 64-127 (on)
     */
    @Generated public static final int kAUGroupParameterID_Sustain = 0x00000040;
    /**
     * value 0-63 (off), 64-127 (on)
     */
    @Generated public static final int kAUGroupParameterID_Sostenuto = 0x00000042;
    /**
     * value ignored
     */
    @Generated public static final int kAUGroupParameterID_AllNotesOff = 0x0000007B;
    /**
     * value 0 < 128
     */
    @Generated public static final int kAUGroupParameterID_ModWheel = 0x00000001;
    /**
     * value -8192 - 8191
     */
    @Generated public static final int kAUGroupParameterID_PitchBend = 0x000000E0;
    /**
     * value ignored
     */
    @Generated public static final int kAUGroupParameterID_AllSoundOff = 0x00000078;
    /**
     * value ignored
     */
    @Generated public static final int kAUGroupParameterID_ResetAllControllers = 0x00000079;
    /**
     * value 0 < 128
     */
    @Generated public static final int kAUGroupParameterID_Pan = 0x0000000A;
    /**
     * value 0 < 128
     */
    @Generated public static final int kAUGroupParameterID_Foot = 0x00000004;
    /**
     * value 0 < 128
     */
    @Generated public static final int kAUGroupParameterID_ChannelPressure = 0x000000D0;
    /**
     * values 0 < 128
     */
    @Generated public static final int kAUGroupParameterID_KeyPressure = 0x000000A0;
    /**
     * value 0 < 128
     */
    @Generated public static final int kAUGroupParameterID_Expression = 0x0000000B;
    /**
     * value 0 < 128
     */
    @Generated public static final int kAUGroupParameterID_DataEntry = 0x00000006;
    /**
     * value 0 < 128
     */
    @Generated public static final int kAUGroupParameterID_Volume_LSB = 0x00000027;
    /**
     * value 0 < 128
     */
    @Generated public static final int kAUGroupParameterID_ModWheel_LSB = 0x00000021;
    /**
     * value 0 < 128
     */
    @Generated public static final int kAUGroupParameterID_Pan_LSB = 0x0000002A;
    /**
     * value 0 < 128
     */
    @Generated public static final int kAUGroupParameterID_Foot_LSB = 0x00000024;
    /**
     * value 0 < 128
     */
    @Generated public static final int kAUGroupParameterID_Expression_LSB = 0x0000002B;
    /**
     * value 0 < 128
     */
    @Generated public static final int kAUGroupParameterID_DataEntry_LSB = 0x00000026;
    /**
     * value 0 < 128
     */
    @Generated public static final int kAUGroupParameterID_KeyPressure_FirstKey = 0x00000100;
    /**
     * value 0 < 128
     */
    @Generated public static final int kAUGroupParameterID_KeyPressure_LastKey = 0x0000017F;
    @Generated public static final int kAudioUnitSubType_MultiChannelMixer = 0x6D636D78;
    @Generated public static final int kAudioUnitSubType_MatrixMixer = 0x6D786D78;
    @Generated public static final int kAudioUnitSubType_SpatialMixer = 0x3364656D;
    @Deprecated @Generated public static final int kAudioFormatProperty_HardwareCodecCapabilities = 0x68776363;
    /**
     * AudioStreamBasicDescription
     */
    @Generated public static final int kExtAudioFileProperty_FileDataFormat = 0x66666D74;
    /**
     * AudioChannelLayout
     */
    @Generated public static final int kExtAudioFileProperty_FileChannelLayout = 0x66636C6F;
    /**
     * AudioStreamBasicDescription
     */
    @Generated public static final int kExtAudioFileProperty_ClientDataFormat = 0x63666D74;
    /**
     * AudioChannelLayout
     */
    @Generated public static final int kExtAudioFileProperty_ClientChannelLayout = 0x63636C6F;
    /**
     * UInt32
     */
    @Generated public static final int kExtAudioFileProperty_CodecManufacturer = 0x636D616E;
    /**
     * AudioConverterRef
     */
    @Generated public static final int kExtAudioFileProperty_AudioConverter = 0x61636E76;
    /**
     * AudioFileID
     */
    @Generated public static final int kExtAudioFileProperty_AudioFile = 0x6166696C;
    /**
     * UInt32
     */
    @Generated public static final int kExtAudioFileProperty_FileMaxPacketSize = 0x666D7073;
    /**
     * UInt32
     */
    @Generated public static final int kExtAudioFileProperty_ClientMaxPacketSize = 0x636D7073;
    /**
     * SInt64
     */
    @Generated public static final int kExtAudioFileProperty_FileLengthFrames = 0x2366726D;
    /**
     * CFPropertyListRef
     */
    @Generated public static final int kExtAudioFileProperty_ConverterConfig = 0x61636366;
    /**
     * UInt32
     */
    @Generated public static final int kExtAudioFileProperty_IOBufferSizeBytes = 0x696F6273;
    /**
     * void *
     */
    @Generated public static final int kExtAudioFileProperty_IOBuffer = 0x696F6266;
    /**
     * AudioFilePacketTableInfo
     */
    @Generated public static final int kExtAudioFileProperty_PacketTable = 0x78707469;
    @Generated public static final int kAudioConverterErr_HardwareInUse = 0x68776975;
    @Generated public static final int kAudioConverterErr_NoHardwarePermission = 0x7065726D;
    /**
     * Global, indexed : AAC, HE-AAC, HE-AACv2
     */
    @Generated public static final int kRoundTripAACParam_Format = 0x00000000;
    /**
     * Global, indexed
     */
    @Generated public static final int kRoundTripAACParam_EncodingStrategy = 0x00000001;
    /**
     * Global, indexed
     */
    @Generated public static final int kRoundTripAACParam_RateOrQuality = 0x00000002;
    @Generated public static final int kAudioUnitSubType_Sampler = 0x73616D70;
    @Generated public static final int kAudioUnitSubType_MIDISynth = 0x6D73796E;
    /**
     * linear interpolation
     */
    @Generated public static final int kAudioConverterSampleRateConverterComplexity_Linear = 0x6C696E65;
    /**
     * normal quality range, the default
     */
    @Generated public static final int kAudioConverterSampleRateConverterComplexity_Normal = 0x6E6F726D;
    /**
     * higher quality range, more expensive
     */
    @Generated public static final int kAudioConverterSampleRateConverterComplexity_Mastering = 0x62617473;
    /**
     * minimum phase impulse response.
     */
    @Generated public static final int kAudioConverterSampleRateConverterComplexity_MinimumPhase = 0x6D696E70;
    @Generated public static final int kCAF_SMPTE_TimeTypeNone = 0x00000000;
    @Generated public static final int kCAF_SMPTE_TimeType24 = 0x00000001;
    @Generated public static final int kCAF_SMPTE_TimeType25 = 0x00000002;
    @Generated public static final int kCAF_SMPTE_TimeType30Drop = 0x00000003;
    @Generated public static final int kCAF_SMPTE_TimeType30 = 0x00000004;
    @Generated public static final int kCAF_SMPTE_TimeType2997 = 0x00000005;
    @Generated public static final int kCAF_SMPTE_TimeType2997Drop = 0x00000006;
    @Generated public static final int kCAF_SMPTE_TimeType60 = 0x00000007;
    @Generated public static final int kCAF_SMPTE_TimeType5994 = 0x00000008;
    @Generated public static final int kCAF_SMPTE_TimeType60Drop = 0x00000009;
    @Generated public static final int kCAF_SMPTE_TimeType5994Drop = 0x0000000A;
    @Generated public static final int kCAF_SMPTE_TimeType50 = 0x0000000B;
    @Generated public static final int kCAF_SMPTE_TimeType2398 = 0x0000000C;

    @Generated
    private Enums() {
    }

    @Generated public static final int kAudioUnitProperty_MIDIOutputCallbackInfo = 0x0000002F;
    @Generated public static final int kAudioUnitProperty_MIDIOutputCallback = 0x00000030;
    @Generated public static final int kAudioUnitErr_MIDIOutputBufferFull = 0xFFFEFB3F;
    @Generated public static final int kAudioUnitErr_ExtensionNotFound = 0xFFFEFB48;
    @Generated public static final int kAudioFileRF64Type = 0x52463634;
    @Generated public static final int kAudioFileFLACType = 0x666C6163;
    @Generated public static final int kAudioCodecPrimeMethod_Pre = 0x00000000;
    @Generated public static final int kAudioCodecPrimeMethod_Normal = 0x00000001;
    @Generated public static final int kAudioCodecPrimeMethod_None = 0x00000002;
    @Generated public static final int kAudioCodecQuality_Max = 0x0000007F;
    @Generated public static final int kAudioCodecQuality_High = 0x00000060;
    @Generated public static final int kAudioCodecQuality_Medium = 0x00000040;
    @Generated public static final int kAudioCodecQuality_Low = 0x00000020;
    @Generated public static final int kAudioCodecQuality_Min = 0x00000000;
    @Generated public static final int kAudioComponentErr_InstanceTimedOut = 0xFFFEFB3E;
    @Generated public static final int kAudioUnitErr_InvalidParameterValue = 0xFFFEFB49;
    @Generated public static final int kAudioUnitErr_InvalidFilePath = 0xFFFEFB4A;
    @Generated public static final int kAudioUnitErr_MissingKey = 0xFFFEFB4B;
    @Generated public static final int kHintBasic = 0x00000000;
    @Generated public static final int kHintAdvanced = 0x00000001;
    @Generated public static final int kHintHidden = 0x00000002;
    @Generated public static final int kAudioCodecPropertyRequiresPacketDescription = 0x70616B64;
    @Generated public static final int kAudioCodecPropertyAvailableBitRates = 0x62727423;
    @Generated public static final int kAudioCodecExtendFrequencies = 0x61636566;
    @Generated public static final int kAudioCodecUseRecommendedSampleRate = 0x75727372;
    @Generated public static final int kAudioCodecOutputPrecedence = 0x6F707072;
    @Generated public static final int kAudioCodecBitRateFormat = 0x61636266;
    @Generated public static final int kAudioCodecDoesSampleRateConversion = 0x6C6D7263;
    @Generated public static final int kAudioCodecInputFormatsForOutputFormat = 0x6966346F;
    @Generated public static final int kAudioCodecOutputFormatsForInputFormat = 0x6F663469;
    @Generated public static final int kAudioCodecPropertyInputChannelLayout = 0x69636C20;
    @Generated public static final int kAudioCodecPropertyOutputChannelLayout = 0x6F636C20;
    @Generated public static final int kAudioCodecPropertyAvailableInputChannelLayouts = 0x6169636C;
    @Generated public static final int kAudioCodecPropertyAvailableOutputChannelLayouts = 0x616F636C;
    @Generated public static final int kAudioCodecPropertyZeroFramesPadded = 0x70616430;
    @Generated public static final int kAudioCodecPropertySupportedInputFormats = 0x69666D23;
    @Generated public static final int kAudioCodecPropertySupportedOutputFormats = 0x6F666D23;
    @Generated public static final int kAudioCodecPropertyAvailableInputSampleRates = 0x61697372;
    @Generated public static final int kAudioCodecPropertyAvailableOutputSampleRates = 0x616F7372;
    @Generated public static final int kAudioCodecPropertyAvailableBitRateRange = 0x61627274;
    @Generated public static final int kAudioCodecPropertyMinimumNumberInputPackets = 0x6D6E6970;
    @Generated public static final int kAudioCodecPropertyMinimumNumberOutputPackets = 0x6D6E6F70;
    @Generated public static final int kAudioCodecPropertyAvailableNumberChannels = 0x636D6E63;
    @Generated public static final int kAudioCodecPropertyDoesSampleRateConversion = 0x6C6D7263;
    @Generated public static final int kAudioCodecPropertyAvailableInputChannelLayoutTags = 0x6169636C;
    @Generated public static final int kAudioCodecPropertyAvailableOutputChannelLayoutTags = 0x616F636C;
    @Generated public static final int kAudioCodecPropertyInputFormatsForOutputFormat = 0x6966346F;
    @Generated public static final int kAudioCodecPropertyOutputFormatsForInputFormat = 0x6F663469;
    @Generated public static final int kAudioCodecPropertyFormatInfo = 0x61636669;
    @Generated public static final int kAudioCodecPropertyNameCFString = 0x6C6E616D;
    @Generated public static final int kAudioCodecPropertyManufacturerCFString = 0x6C6D616B;
    @Generated public static final int kAudioCodecPropertyFormatCFString = 0x6C666F72;
    @Generated public static final int kProgramTargetLevel_None = 0x00000000;
    @Generated public static final int kProgramTargetLevel_Minus31dB = 0x00000001;
    @Generated public static final int kProgramTargetLevel_Minus23dB = 0x00000002;
    @Generated public static final int kProgramTargetLevel_Minus20dB = 0x00000003;
    @Generated public static final int kAudioCodecProduceOutputPacketFailure = 0x00000001;
    @Generated public static final int kAudioCodecProduceOutputPacketSuccess = 0x00000002;
    @Generated public static final int kAudioCodecProduceOutputPacketSuccessHasMore = 0x00000003;
    @Generated public static final int kAudioCodecProduceOutputPacketNeedsMoreInputData = 0x00000004;
    @Generated public static final int kAudioCodecProduceOutputPacketAtEOF = 0x00000005;
    @Generated public static final int kDynamicRangeControlMode_None = 0x00000000;
    @Generated public static final int kDynamicRangeControlMode_Light = 0x00000001;
    @Generated public static final int kDynamicRangeControlMode_Heavy = 0x00000002;
    @Generated public static final int kAudioCodecPropertyInputBufferSize = 0x74627566;
    @Generated public static final int kAudioCodecPropertyPacketFrameSize = 0x70616B66;
    @Generated public static final int kAudioCodecPropertyHasVariablePacketByteSizes = 0x76706B3F;
    @Generated public static final int kAudioCodecPropertyEmploysDependentPackets = 0x64706B3F;
    @Generated public static final int kAudioCodecPropertyMaximumPacketByteSize = 0x70616B62;
    @Generated public static final int kAudioCodecPropertyPacketSizeLimitForVBR = 0x70616B6C;
    @Generated public static final int kAudioCodecPropertyCurrentInputFormat = 0x69666D74;
    @Generated public static final int kAudioCodecPropertyCurrentOutputFormat = 0x6F666D74;
    @Generated public static final int kAudioCodecPropertyMagicCookie = 0x6B756B69;
    @Generated public static final int kAudioCodecPropertyUsedInputBufferSize = 0x75627566;
    @Generated public static final int kAudioCodecPropertyIsInitialized = 0x696E6974;
    @Generated public static final int kAudioCodecPropertyCurrentTargetBitRate = 0x62726174;
    @Generated public static final int kAudioCodecPropertyCurrentInputSampleRate = 0x63697372;
    @Generated public static final int kAudioCodecPropertyCurrentOutputSampleRate = 0x636F7372;
    @Generated public static final int kAudioCodecPropertyQualitySetting = 0x73726371;
    @Generated public static final int kAudioCodecPropertyApplicableBitRateRange = 0x62727461;
    @Generated public static final int kAudioCodecPropertyRecommendedBitRateRange = 0x62727472;
    @Generated public static final int kAudioCodecPropertyApplicableInputSampleRates = 0x69737261;
    @Generated public static final int kAudioCodecPropertyApplicableOutputSampleRates = 0x6F737261;
    @Generated public static final int kAudioCodecPropertyPaddedZeros = 0x70616430;
    @Generated public static final int kAudioCodecPropertyPrimeMethod = 0x70726D6D;
    @Generated public static final int kAudioCodecPropertyPrimeInfo = 0x7072696D;
    @Generated public static final int kAudioCodecPropertyCurrentInputChannelLayout = 0x69636C20;
    @Generated public static final int kAudioCodecPropertyCurrentOutputChannelLayout = 0x6F636C20;
    @Generated public static final int kAudioCodecPropertySettings = 0x61637320;
    @Generated public static final int kAudioCodecPropertyFormatList = 0x6163666C;
    @Generated public static final int kAudioCodecPropertyBitRateControlMode = 0x61636266;
    @Generated public static final int kAudioCodecPropertySoundQualityForVBR = 0x76627271;
    @Generated public static final int kAudioCodecPropertyBitRateForVBR = 0x76627262;
    @Generated public static final int kAudioCodecPropertyDelayMode = 0x646D6F64;
    @Generated public static final int kAudioCodecPropertyAdjustLocalQuality = 0x5E71616C;
    @Generated public static final int kAudioCodecPropertyProgramTargetLevel = 0x7070746C;
    @Generated public static final int kAudioCodecPropertyDynamicRangeControlMode = 0x6D647263;
    @Generated public static final int kAudioCodecPropertyProgramTargetLevelConstant = 0x70746C63;
    @Generated public static final int kAudioFileLATMInLOASType = 0x6C6F6173;
    @Generated public static final int kAudioCodecPropertyMinimumDelayMode = 0x6D64656C;
    @Generated public static final int kAudioFilePropertyRestrictsRandomAccess = 0x72726170;
    @Generated public static final int kAudioFilePropertyPacketToRollDistance = 0x706B726C;
    @Generated public static final int kAudioFilePropertyPreviousIndependentPacket = 0x70696E64;
    @Generated public static final int kAudioFilePropertyNextIndependentPacket = 0x6E696E64;
    @Generated public static final int kAudioFilePropertyPacketToDependencyInfo = 0x706B6470;
    @Generated public static final int kAudioFilePropertyPacketRangeByteCountUpperBound = 0x70727562;
    @Generated public static final int kAudioCodecBitRateFormat_CBR = 0x00000000;
    @Generated public static final int kAudioCodecBitRateFormat_ABR = 0x00000001;
    @Generated public static final int kAudioCodecBitRateFormat_VBR = 0x00000002;
    @Generated public static final int kAudioCodecDelayMode_Compatibility = 0x00000000;
    @Generated public static final int kAudioCodecDelayMode_Minimum = 0x00000001;
    @Generated public static final int kAudioCodecDelayMode_Optimal = 0x00000002;
    /**
     * bus enable : 0.0 or 1.0
     */
    @Generated public static final int k3DMixerParam_BusEnable = 0x00000014;
    /**
     * Input/Output, dB, -120->20, 0
     */
    @Generated public static final int k3DMixerParam_MinGainInDecibels = 0x00000015;
    /**
     * Input/Output, dB, -120->20, 0
     */
    @Generated public static final int k3DMixerParam_MaxGainInDecibels = 0x00000016;
    /**
     * Input, Dry/Wet equal-power blend, %      0.0 -> 100.0
     */
    @Generated public static final int k3DMixerParam_DryWetReverbBlend = 0x00000017;
    /**
     * Global, dB,        -40.0 -> +40.0
     */
    @Generated public static final int k3DMixerParam_GlobalReverbGainInDecibels = 0x00000018;
    /**
     * Input, Lowpass filter attenuation at 5KHz :        decibels -100.0dB -> 0.0dB
     * smaller values make both direct and reverb sound more muffled; a value of 0.0 indicates no filtering
     * Occlusion is a filter applied to the sound prior to the reverb send
     */
    @Generated public static final int k3DMixerParam_OcclusionAttenuationInDecibels = 0x00000019;
    /**
     * Input, Lowpass filter attenuation at 5KHz :        decibels -100.0dB -> 0.0dB
     * smaller values make direct sound more muffled; a value of 0.0 indicates no filtering
     * Obstruction is a filter applied to the "direct" part of the sound (so is post reverb send)
     */
    @Generated public static final int k3DMixerParam_ObstructionAttenuationInDecibels = 0x0000001A;
    /**
     * read-only
     * <p>
     * For each of the following, use the parameter ID plus the channel number
     * to get the specific parameter ID for a given channel.
     * For example, k3DMixerParam_PostAveragePower indicates the left channel
     * while k3DMixerParam_PostAveragePower + 1 indicates the right channel.
     */
    @Generated public static final int k3DMixerParam_PreAveragePower = 0x000003E8;
    /**
     * read-only
     * <p>
     * For each of the following, use the parameter ID plus the channel number
     * to get the specific parameter ID for a given channel.
     * For example, k3DMixerParam_PostAveragePower indicates the left channel
     * while k3DMixerParam_PostAveragePower + 1 indicates the right channel.
     */
    @Generated public static final int k3DMixerParam_PrePeakHoldLevel = 0x000007D0;
    /**
     * read-only
     * <p>
     * For each of the following, use the parameter ID plus the channel number
     * to get the specific parameter ID for a given channel.
     * For example, k3DMixerParam_PostAveragePower indicates the left channel
     * while k3DMixerParam_PostAveragePower + 1 indicates the right channel.
     */
    @Generated public static final int k3DMixerParam_PostAveragePower = 0x00000BB8;
    /**
     * read-only
     * <p>
     * For each of the following, use the parameter ID plus the channel number
     * to get the specific parameter ID for a given channel.
     * For example, k3DMixerParam_PostAveragePower indicates the left channel
     * while k3DMixerParam_PostAveragePower + 1 indicates the right channel.
     */
    @Generated public static final int k3DMixerParam_PostPeakHoldLevel = 0x00000FA0;
    @Generated public static final int kAudioCodecNoError = 0x00000000;
    @Generated public static final int kAudioCodecUnspecifiedError = 0x77686174;
    @Generated public static final int kAudioCodecUnknownPropertyError = 0x77686F3F;
    @Generated public static final int kAudioCodecBadPropertySizeError = 0x2173697A;
    @Generated public static final int kAudioCodecIllegalOperationError = 0x6E6F7065;
    @Generated public static final int kAudioCodecUnsupportedFormatError = 0x21646174;
    @Generated public static final int kAudioCodecStateError = 0x21737474;
    @Generated public static final int kAudioCodecNotEnoughBufferSpaceError = 0x21627566;
    @Generated public static final int kAudioCodecBadDataError = 0x62616461;
    @Generated public static final int kAudioFileStreamProperty_RestrictsRandomAccess = 0x72726170;
    @Generated public static final int kAudioFileStreamProperty_PacketToRollDistance = 0x706B726C;
    @Generated public static final int kAudioFileStreamProperty_PreviousIndependentPacket = 0x70696E64;
    @Generated public static final int kAudioFileStreamProperty_NextIndependentPacket = 0x6E696E64;
    @Generated public static final int kAudioFileStreamProperty_PacketToDependencyInfo = 0x706B6470;
    @Generated public static final int kAudioCodecBitRateControlMode_Constant = 0x00000000;
    @Generated public static final int kAudioCodecBitRateControlMode_LongTermAverage = 0x00000001;
    @Generated public static final int kAudioCodecBitRateControlMode_VariableConstrained = 0x00000002;
    @Generated public static final int kAudioCodecBitRateControlMode_Variable = 0x00000003;
    /**
     * =============================================================================
     * The following properties are concerned with the AudioStreamBasicDescription
     * =============================================================================
     */
    @Generated public static final int kAudioFormatProperty_FormatEmploysDependentPackets = 0x66646570;
    @Generated public static final int kAudioCodecOutputPrecedenceNone = 0x00000000;
    @Generated public static final int kAudioCodecOutputPrecedenceBitRate = 0x00000001;
    @Generated public static final int kAudioCodecOutputPrecedenceSampleRate = 0x00000002;
    @Generated public static final int kAudioCodecGetPropertyInfoSelect = 0x00000001;
    @Generated public static final int kAudioCodecGetPropertySelect = 0x00000002;
    @Generated public static final int kAudioCodecSetPropertySelect = 0x00000003;
    @Generated public static final int kAudioCodecInitializeSelect = 0x00000004;
    @Generated public static final int kAudioCodecUninitializeSelect = 0x00000005;
    @Generated public static final int kAudioCodecAppendInputDataSelect = 0x00000006;
    @Generated public static final int kAudioCodecProduceOutputDataSelect = 0x00000007;
    @Generated public static final int kAudioCodecResetSelect = 0x00000008;
    @Generated public static final int kAudioCodecAppendInputBufferListSelect = 0x00000009;
    @Generated public static final int kAudioCodecProduceOutputBufferListSelect = 0x0000000A;
    /**
     * 0x6465703F, 1684369471
     */
    @Generated public static final int kAudioFileInvalidPacketDependencyError = 0x6465703F;
    @Generated public static final int kAudioFileBW64Type = 0x42573634;
    @Generated public static final int kAudioFileWave64Type = 0x57363466;
    @Generated public static final int kAudioUnitProperty_SpatialMixerSourceMode = 0x00000BBD;
    @Generated public static final int kAudioUnitProperty_SpatialMixerOutputType = 0x00000C1C;
    @Generated public static final int kAudioUnitProperty_SpatialMixerPointSourceInHeadMode = 0x00000C1F;
    /**
     * Global, Degrees, -180->180, 0
     */
    @Generated public static final int kSpatialMixerParam_HeadYaw = 0x00000013;
    /**
     * Global, Degrees, -90->90, 0
     */
    @Generated public static final int kSpatialMixerParam_HeadPitch = 0x00000014;
    /**
     * Global, Degrees, -180->180, 0
     */
    @Generated public static final int kSpatialMixerParam_HeadRoll = 0x00000015;
    @Generated public static final int kAudioFilePropertyID3TagOffset = 0x6964336F;
    /**
     * Global, Samples, 0->(SampleRate), 0
     */
    @Generated public static final int kSampleDelayParam_DelayFrames = 0x00000000;
    /**
     * range (0 -> 999)
     */
    @Generated public static final int kAudioUnitProperty_RenderContextObserver = 0x0000003C;
    @Generated public static final int kExtAudioFilePacketTableInfoOverride_UseFileValue = 0xFFFFFFFF;
    @Generated public static final int kExtAudioFilePacketTableInfoOverride_UseFileValueIfValid = 0xFFFFFFFE;
    /**
     * =============================================================================
     * The following properties are concerned with the AudioStreamBasicDescription
     * =============================================================================
     */
    @Generated public static final int kAudioFormatProperty_AvailableDecodeNumberChannels = 0x61646E63;
    @Generated public static final int kAudioOutputUnitProperty_OSWorkgroup = 0x000007DF;
    /**
     * range (0 -> 999)
     */
    @Generated public static final int kAudioUnitProperty_LastRenderSampleTime = 0x0000003D;
    /**
     * range (0 -> 999)
     */
    @Generated public static final int kAudioUnitProperty_LoadedOutOfProcess = 0x0000003E;
    @Generated public static final int kAudioUnitProperty_MIDIOutputEventListCallback = 0x0000003F;
    @Generated public static final int kAudioUnitProperty_AudioUnitMIDIProtocol = 0x00000040;
    @Generated public static final int kAudioUnitProperty_HostMIDIProtocol = 0x00000041;
    /**
     * Global, dB, -40->40, 0
     */
    @Generated public static final int kDynamicsProcessorParam_OverallGain = 0x00000006;
    @Generated public static final int kMusicDeviceMIDIEventListSelect = 0x00000107;
    @Generated public static final int kAUVoiceIOProperty_MutedSpeechActivityEventListener = 0x0000083A;
    @Generated public static final int kAudioUnitSubType_TimePitch = 0x746D7074;
    @Generated public static final int kTimePitchParam_Pitch = 0x00000001;
    /**
     * only for the AUPitch unit
     */
    @Generated public static final int kTimePitchParam_EffectBlend = 0x00000002;
}
