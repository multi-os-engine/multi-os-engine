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

package apple.audiotoolbox.c;

import apple.NSObject;
import apple.audiotoolbox.opaque.AUGraph;
import apple.audiotoolbox.opaque.AudioComponent;
import apple.audiotoolbox.opaque.AudioComponentInstance;
import apple.audiotoolbox.opaque.AudioConverterRef;
import apple.audiotoolbox.opaque.AudioFileID;
import apple.audiotoolbox.opaque.AudioFileStreamID;
import apple.audiotoolbox.opaque.AudioQueueProcessingTapRef;
import apple.audiotoolbox.opaque.AudioQueueRef;
import apple.audiotoolbox.opaque.AudioQueueTimelineRef;
import apple.audiotoolbox.opaque.ExtAudioFileRef;
import apple.audiotoolbox.opaque.MusicEventIterator;
import apple.audiotoolbox.opaque.MusicPlayer;
import apple.audiotoolbox.opaque.MusicSequence;
import apple.audiotoolbox.opaque.MusicTrack;
import apple.audiotoolbox.struct.AUPresetEvent;
import apple.audiotoolbox.struct.AURenderCallbackStruct;
import apple.audiotoolbox.struct.AudioComponentDescription;
import apple.audiotoolbox.struct.AudioFileRegion;
import apple.audiotoolbox.struct.AudioQueueBuffer;
import apple.audiotoolbox.struct.AudioQueueParameterEvent;
import apple.audiotoolbox.struct.CABarBeatTime;
import apple.audiotoolbox.struct.ExtendedNoteOnEvent;
import apple.audiotoolbox.struct.MIDIChannelMessage;
import apple.audiotoolbox.struct.MIDIMetaEvent;
import apple.audiotoolbox.struct.MIDINoteMessage;
import apple.audiotoolbox.struct.MIDIRawData;
import apple.audiotoolbox.struct.MusicDeviceNoteParams;
import apple.audiotoolbox.struct.MusicEventUserData;
import apple.audiotoolbox.struct.ParameterEvent;
import apple.coreaudio.struct.AudioBufferList;
import apple.coreaudio.struct.AudioChannelLayout;
import apple.coreaudio.struct.AudioClassDescription;
import apple.coreaudio.struct.AudioStreamBasicDescription;
import apple.coreaudio.struct.AudioStreamPacketDescription;
import apple.coreaudio.struct.AudioTimeStamp;
import apple.corefoundation.opaque.CFArrayRef;
import apple.corefoundation.opaque.CFDataRef;
import apple.corefoundation.opaque.CFDictionaryRef;
import apple.corefoundation.opaque.CFRunLoopRef;
import apple.corefoundation.opaque.CFStringRef;
import apple.corefoundation.opaque.CFURLRef;
import apple.struct.FILE;
import apple.uikit.UIImage;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Inline;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ann.UncertainReturn;
import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.general.ptr.ConstPtr;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.DoublePtr;
import org.moe.natj.general.ptr.FloatPtr;
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.LongPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ann.ObjCBlock;

@Generated
@Library("AudioToolbox")
@Runtime(CRuntime.class)
public final class AudioToolbox {
    static {
        NatJ.register();
    }

    @Generated
    private AudioToolbox() {
    }

    @Generated
    @CFunction
    public static native AudioComponent AudioComponentFindNext(AudioComponent inComponent,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioComponentDescription inDesc);

    @Generated
    @CFunction
    public static native int AudioComponentCount(
            @UncertainArgument("Options: reference, array Fallback: reference") AudioComponentDescription inDesc);

    @Generated
    @CFunction
    public static native int AudioComponentCopyName(AudioComponent inComponent, Ptr<CFStringRef> outName);

    @Generated
    @CFunction
    public static native int AudioComponentGetDescription(AudioComponent inComponent,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioComponentDescription outDesc);

    @Generated
    @CFunction
    public static native int AudioComponentGetVersion(AudioComponent inComponent, IntPtr outVersion);

    @Generated
    @CFunction
    public static native int AudioComponentInstanceNew(AudioComponent inComponent,
            Ptr<AudioComponentInstance> outInstance);

    @Generated
    @CFunction
    public static native void AudioComponentInstantiate(AudioComponent inComponent, int inOptions,
            @ObjCBlock(name = "call_AudioComponentInstantiate") Block_AudioComponentInstantiate inCompletionHandler);

    @Generated
    @CFunction
    public static native int AudioComponentInstanceDispose(AudioComponentInstance inInstance);

    @Generated
    @CFunction
    public static native AudioComponent AudioComponentInstanceGetComponent(AudioComponentInstance inInstance);

    @Generated
    @CFunction
    public static native byte AudioComponentInstanceCanDo(AudioComponentInstance inInstance, short inSelectorID);

    @Generated
    @CFunction
    public static native AudioComponent AudioComponentRegister(
            @UncertainArgument("Options: reference, array Fallback: reference") AudioComponentDescription inDesc,
            CFStringRef inName, int inVersion,
            @FunctionPtr(name = "call_AudioComponentRegister") Function_AudioComponentRegister inFactory);

    @Generated
    @CFunction
    public static native int AudioUnitInitialize(AudioComponentInstance inUnit);

    @Generated
    @CFunction
    public static native int AudioUnitUninitialize(AudioComponentInstance inUnit);

    @Generated
    @CFunction
    public static native int AudioUnitGetPropertyInfo(AudioComponentInstance inUnit, int inID, int inScope,
            int inElement, IntPtr outDataSize, BytePtr outWritable);

    @Generated
    @CFunction
    public static native int AudioUnitGetProperty(AudioComponentInstance inUnit, int inID, int inScope, int inElement,
            VoidPtr outData, IntPtr ioDataSize);

    @Generated
    @CFunction
    public static native int AudioUnitSetProperty(AudioComponentInstance inUnit, int inID, int inScope, int inElement,
            ConstVoidPtr inData, int inDataSize);

    @Generated
    @CFunction
    public static native int AudioUnitAddPropertyListener(AudioComponentInstance inUnit, int inID,
            @FunctionPtr(name = "call_AudioUnitAddPropertyListener") Function_AudioUnitAddPropertyListener inProc,
            VoidPtr inProcUserData);

    @Generated
    @CFunction
    public static native int AudioUnitRemovePropertyListenerWithUserData(AudioComponentInstance inUnit, int inID,
            @FunctionPtr(name = "call_AudioUnitRemovePropertyListenerWithUserData") Function_AudioUnitRemovePropertyListenerWithUserData inProc,
            VoidPtr inProcUserData);

    @Generated
    @CFunction
    public static native int AudioUnitAddRenderNotify(AudioComponentInstance inUnit,
            @FunctionPtr(name = "call_AudioUnitAddRenderNotify") Function_AudioUnitAddRenderNotify inProc,
            VoidPtr inProcUserData);

    @Generated
    @CFunction
    public static native int AudioUnitRemoveRenderNotify(AudioComponentInstance inUnit,
            @FunctionPtr(name = "call_AudioUnitRemoveRenderNotify") Function_AudioUnitRemoveRenderNotify inProc,
            VoidPtr inProcUserData);

    @Generated
    @CFunction
    public static native int AudioUnitGetParameter(AudioComponentInstance inUnit, int inID, int inScope, int inElement,
            FloatPtr outValue);

    @Generated
    @CFunction
    public static native int AudioUnitSetParameter(AudioComponentInstance inUnit, int inID, int inScope, int inElement,
            float inValue, int inBufferOffsetInFrames);

    @Generated
    @CFunction
    public static native int AudioUnitScheduleParameters(AudioComponentInstance inUnit, VoidPtr inParameterEvent,
            int inNumParamEvents);

    @Generated
    @CFunction
    public static native int AudioUnitRender(AudioComponentInstance inUnit, IntPtr ioActionFlags,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioTimeStamp inTimeStamp,
            int inOutputBusNumber, int inNumberFrames,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioBufferList ioData);

    @Generated
    @CFunction
    public static native int AudioUnitProcess(AudioComponentInstance inUnit, IntPtr ioActionFlags,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioTimeStamp inTimeStamp,
            int inNumberFrames,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioBufferList ioData);

    @Generated
    @CFunction
    public static native int AudioUnitProcessMultiple(AudioComponentInstance inUnit, IntPtr ioActionFlags,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioTimeStamp inTimeStamp,
            int inNumberFrames, int inNumberInputBufferLists, Ptr<ConstPtr<AudioBufferList>> inInputBufferLists,
            int inNumberOutputBufferLists, Ptr<Ptr<AudioBufferList>> ioOutputBufferLists);

    @Generated
    @CFunction
    public static native int AudioUnitReset(AudioComponentInstance inUnit, int inScope, int inElement);

    @Generated
    @CFunction
    public static native int AudioOutputUnitPublish(
            @UncertainArgument("Options: reference, array Fallback: reference") AudioComponentDescription inDesc,
            CFStringRef inName, int inVersion, AudioComponentInstance inOutputUnit);

    @Generated
    @CFunction
    public static native UIImage AudioOutputUnitGetHostIcon(AudioComponentInstance au, float desiredPointSize);

    @Generated
    @CFunction
    public static native UIImage AudioComponentGetIcon(AudioComponent comp, float desiredPointSize);

    @Generated
    @CFunction
    public static native double AudioComponentGetLastActiveTime(AudioComponent comp);

    @Generated
    @CFunction
    public static native int AudioOutputUnitStart(AudioComponentInstance ci);

    @Generated
    @CFunction
    public static native int AudioOutputUnitStop(AudioComponentInstance ci);

    @Generated
    @Inline
    @CFunction
    public static native int GetAudioUnitParameterDisplayType(int flags);

    @Generated
    @Inline
    @CFunction
    public static native int SetAudioUnitParameterDisplayType(int flags, int displayType);

    @Generated
    @CFunction
    public static native int MusicDeviceMIDIEvent(AudioComponentInstance inUnit, int inStatus, int inData1, int inData2,
            int inOffsetSampleFrame);

    @Generated
    @CFunction
    public static native int MusicDeviceSysEx(AudioComponentInstance inUnit,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String inData,
            int inLength);

    @Generated
    @CFunction
    public static native int MusicDeviceStartNote(AudioComponentInstance inUnit, int inInstrument, int inGroupID,
            IntPtr outNoteInstanceID, int inOffsetSampleFrame,
            @UncertainArgument("Options: reference, array Fallback: reference") MusicDeviceNoteParams inParams);

    @Generated
    @CFunction
    public static native int MusicDeviceStopNote(AudioComponentInstance inUnit, int inGroupID, int inNoteInstanceID,
            int inOffsetSampleFrame);

    @Generated
    @CFunction
    public static native int NewAUGraph(Ptr<AUGraph> outGraph);

    @Generated
    @CFunction
    public static native int DisposeAUGraph(AUGraph inGraph);

    @Generated
    @CFunction
    public static native int AUGraphAddNode(AUGraph inGraph,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioComponentDescription inDescription,
            IntPtr outNode);

    @Generated
    @CFunction
    public static native int AUGraphRemoveNode(AUGraph inGraph, int inNode);

    @Generated
    @CFunction
    public static native int AUGraphGetNodeCount(AUGraph inGraph, IntPtr outNumberOfNodes);

    @Generated
    @CFunction
    public static native int AUGraphGetIndNode(AUGraph inGraph, int inIndex, IntPtr outNode);

    @Generated
    @CFunction
    public static native int AUGraphNodeInfo(AUGraph inGraph, int inNode,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioComponentDescription outDescription,
            Ptr<AudioComponentInstance> outAudioUnit);

    @Generated
    @CFunction
    public static native int AUGraphConnectNodeInput(AUGraph inGraph, int inSourceNode, int inSourceOutputNumber,
            int inDestNode, int inDestInputNumber);

    @Generated
    @CFunction
    public static native int AUGraphSetNodeInputCallback(AUGraph inGraph, int inDestNode, int inDestInputNumber,
            @UncertainArgument("Options: reference, array Fallback: reference") AURenderCallbackStruct inInputCallback);

    @Generated
    @CFunction
    public static native int AUGraphDisconnectNodeInput(AUGraph inGraph, int inDestNode, int inDestInputNumber);

    @Generated
    @CFunction
    public static native int AUGraphClearConnections(AUGraph inGraph);

    @Generated
    @CFunction
    public static native int AUGraphGetNumberOfInteractions(AUGraph inGraph, IntPtr outNumInteractions);

    @Generated
    @CFunction
    public static native int AUGraphGetInteractionInfo(AUGraph inGraph, int inInteractionIndex, VoidPtr outInteraction);

    @Generated
    @CFunction
    public static native int AUGraphCountNodeInteractions(AUGraph inGraph, int inNode, IntPtr outNumInteractions);

    @Generated
    @CFunction
    public static native int AUGraphGetNodeInteractions(AUGraph inGraph, int inNode, IntPtr ioNumInteractions,
            VoidPtr outInteractions);

    @Generated
    @CFunction
    public static native int AUGraphUpdate(AUGraph inGraph, BytePtr outIsUpdated);

    @Generated
    @CFunction
    public static native int AUGraphOpen(AUGraph inGraph);

    @Generated
    @CFunction
    public static native int AUGraphClose(AUGraph inGraph);

    @Generated
    @CFunction
    public static native int AUGraphInitialize(AUGraph inGraph);

    @Generated
    @CFunction
    public static native int AUGraphUninitialize(AUGraph inGraph);

    @Generated
    @CFunction
    public static native int AUGraphStart(AUGraph inGraph);

    @Generated
    @CFunction
    public static native int AUGraphStop(AUGraph inGraph);

    @Generated
    @CFunction
    public static native int AUGraphIsOpen(AUGraph inGraph, BytePtr outIsOpen);

    @Generated
    @CFunction
    public static native int AUGraphIsInitialized(AUGraph inGraph, BytePtr outIsInitialized);

    @Generated
    @CFunction
    public static native int AUGraphIsRunning(AUGraph inGraph, BytePtr outIsRunning);

    @Generated
    @CFunction
    public static native int AUGraphGetCPULoad(AUGraph inGraph, FloatPtr outAverageCPULoad);

    @Generated
    @CFunction
    public static native int AUGraphGetMaxCPULoad(AUGraph inGraph, FloatPtr outMaxLoad);

    @Generated
    @CFunction
    public static native int AUGraphAddRenderNotify(AUGraph inGraph,
            @FunctionPtr(name = "call_AUGraphAddRenderNotify") Function_AUGraphAddRenderNotify inCallback,
            VoidPtr inRefCon);

    @Generated
    @CFunction
    public static native int AUGraphRemoveRenderNotify(AUGraph inGraph,
            @FunctionPtr(name = "call_AUGraphRemoveRenderNotify") Function_AUGraphRemoveRenderNotify inCallback,
            VoidPtr inRefCon);

    @Generated
    @CFunction
    public static native int AudioConverterNew(
            @UncertainArgument("Options: reference, array Fallback: reference") AudioStreamBasicDescription inSourceFormat,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioStreamBasicDescription inDestinationFormat,
            Ptr<AudioConverterRef> outAudioConverter);

    @Generated
    @CFunction
    public static native int AudioConverterNewSpecific(
            @UncertainArgument("Options: reference, array Fallback: reference") AudioStreamBasicDescription inSourceFormat,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioStreamBasicDescription inDestinationFormat,
            int inNumberClassDescriptions,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioClassDescription inClassDescriptions,
            Ptr<AudioConverterRef> outAudioConverter);

    @Generated
    @CFunction
    public static native int AudioConverterDispose(AudioConverterRef inAudioConverter);

    @Generated
    @CFunction
    public static native int AudioConverterReset(AudioConverterRef inAudioConverter);

    @Generated
    @CFunction
    public static native int AudioConverterGetPropertyInfo(AudioConverterRef inAudioConverter, int inPropertyID,
            IntPtr outSize, BytePtr outWritable);

    @Generated
    @CFunction
    public static native int AudioConverterGetProperty(AudioConverterRef inAudioConverter, int inPropertyID,
            IntPtr ioPropertyDataSize, VoidPtr outPropertyData);

    @Generated
    @CFunction
    public static native int AudioConverterSetProperty(AudioConverterRef inAudioConverter, int inPropertyID,
            int inPropertyDataSize, ConstVoidPtr inPropertyData);

    @Generated
    @CFunction
    public static native int AudioConverterConvertBuffer(AudioConverterRef inAudioConverter, int inInputDataSize,
            ConstVoidPtr inInputData, IntPtr ioOutputDataSize, VoidPtr outOutputData);

    @Generated
    @CFunction
    public static native int AudioConverterFillComplexBuffer(AudioConverterRef inAudioConverter,
            @FunctionPtr(name = "call_AudioConverterFillComplexBuffer") Function_AudioConverterFillComplexBuffer inInputDataProc,
            VoidPtr inInputDataProcUserData, IntPtr ioOutputDataPacketSize,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioBufferList outOutputData,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioStreamPacketDescription outPacketDescription);

    @Generated
    @CFunction
    public static native int AudioConverterConvertComplexBuffer(AudioConverterRef inAudioConverter,
            int inNumberPCMFrames,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioBufferList inInputData,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioBufferList outOutputData);

    @Generated
    @Inline
    @CFunction
    @NUInt
    public static native long NumBytesToNumAudioFileMarkers(@NUInt long inNumBytes);

    @Generated
    @Inline
    @CFunction
    @NUInt
    public static native long NumAudioFileMarkersToNumBytes(@NUInt long inNumMarkers);

    @Generated
    @Inline
    @CFunction
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native AudioFileRegion NextAudioFileRegion(
            @UncertainArgument("Options: reference, array Fallback: reference") AudioFileRegion inAFRegionPtr);

    @Generated
    @CFunction
    public static native int AudioFileCreateWithURL(CFURLRef inFileRef, int inFileType,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioStreamBasicDescription inFormat,
            int inFlags, Ptr<AudioFileID> outAudioFile);

    @Generated
    @CFunction
    public static native int AudioFileOpenURL(CFURLRef inFileRef, byte inPermissions, int inFileTypeHint,
            Ptr<AudioFileID> outAudioFile);

    @Generated
    @CFunction
    public static native int AudioFileInitializeWithCallbacks(VoidPtr inClientData,
            @FunctionPtr(name = "call_AudioFileInitializeWithCallbacks_1") Function_AudioFileInitializeWithCallbacks_1 inReadFunc,
            @FunctionPtr(name = "call_AudioFileInitializeWithCallbacks_2") Function_AudioFileInitializeWithCallbacks_2 inWriteFunc,
            @FunctionPtr(name = "call_AudioFileInitializeWithCallbacks_3") Function_AudioFileInitializeWithCallbacks_3 inGetSizeFunc,
            @FunctionPtr(name = "call_AudioFileInitializeWithCallbacks_4") Function_AudioFileInitializeWithCallbacks_4 inSetSizeFunc,
            int inFileType,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioStreamBasicDescription inFormat,
            int inFlags, Ptr<AudioFileID> outAudioFile);

    @Generated
    @CFunction
    public static native int AudioFileOpenWithCallbacks(VoidPtr inClientData,
            @FunctionPtr(name = "call_AudioFileOpenWithCallbacks_1") Function_AudioFileOpenWithCallbacks_1 inReadFunc,
            @FunctionPtr(name = "call_AudioFileOpenWithCallbacks_2") Function_AudioFileOpenWithCallbacks_2 inWriteFunc,
            @FunctionPtr(name = "call_AudioFileOpenWithCallbacks_3") Function_AudioFileOpenWithCallbacks_3 inGetSizeFunc,
            @FunctionPtr(name = "call_AudioFileOpenWithCallbacks_4") Function_AudioFileOpenWithCallbacks_4 inSetSizeFunc,
            int inFileTypeHint, Ptr<AudioFileID> outAudioFile);

    @Generated
    @CFunction
    public static native int AudioFileClose(AudioFileID inAudioFile);

    @Generated
    @CFunction
    public static native int AudioFileOptimize(AudioFileID inAudioFile);

    @Generated
    @CFunction
    public static native int AudioFileReadBytes(AudioFileID inAudioFile, byte inUseCache, long inStartingByte,
            IntPtr ioNumBytes, VoidPtr outBuffer);

    @Generated
    @CFunction
    public static native int AudioFileWriteBytes(AudioFileID inAudioFile, byte inUseCache, long inStartingByte,
            IntPtr ioNumBytes, ConstVoidPtr inBuffer);

    @Generated
    @CFunction
    public static native int AudioFileReadPacketData(AudioFileID inAudioFile, byte inUseCache, IntPtr ioNumBytes,
            Ptr<AudioStreamPacketDescription> outPacketDescriptions, long inStartingPacket, IntPtr ioNumPackets,
            VoidPtr outBuffer);

    @Generated
    @Deprecated
    @CFunction
    public static native int AudioFileReadPackets(AudioFileID inAudioFile, byte inUseCache, IntPtr outNumBytes,
            Ptr<AudioStreamPacketDescription> outPacketDescriptions, long inStartingPacket, IntPtr ioNumPackets,
            VoidPtr outBuffer);

    @Generated
    @CFunction
    public static native int AudioFileWritePackets(AudioFileID inAudioFile, byte inUseCache, int inNumBytes,
            ConstPtr<AudioStreamPacketDescription> inPacketDescriptions, long inStartingPacket, IntPtr ioNumPackets,
            ConstVoidPtr inBuffer);

    @Generated
    @CFunction
    public static native int AudioFileCountUserData(AudioFileID inAudioFile, int inUserDataID, IntPtr outNumberItems);

    @Generated
    @CFunction
    public static native int AudioFileGetUserDataSize(AudioFileID inAudioFile, int inUserDataID, int inIndex,
            IntPtr outUserDataSize);

    @Generated
    @CFunction
    public static native int AudioFileGetUserData(AudioFileID inAudioFile, int inUserDataID, int inIndex,
            IntPtr ioUserDataSize, VoidPtr outUserData);

    @Generated
    @CFunction
    public static native int AudioFileSetUserData(AudioFileID inAudioFile, int inUserDataID, int inIndex,
            int inUserDataSize, ConstVoidPtr inUserData);

    @Generated
    @CFunction
    public static native int AudioFileRemoveUserData(AudioFileID inAudioFile, int inUserDataID, int inIndex);

    @Generated
    @CFunction
    public static native int AudioFileGetPropertyInfo(AudioFileID inAudioFile, int inPropertyID, IntPtr outDataSize,
            IntPtr isWritable);

    @Generated
    @CFunction
    public static native int AudioFileGetProperty(AudioFileID inAudioFile, int inPropertyID, IntPtr ioDataSize,
            VoidPtr outPropertyData);

    @Generated
    @CFunction
    public static native int AudioFileSetProperty(AudioFileID inAudioFile, int inPropertyID, int inDataSize,
            ConstVoidPtr inPropertyData);

    @Generated
    @CFunction
    public static native int AudioFileGetGlobalInfoSize(int inPropertyID, int inSpecifierSize, VoidPtr inSpecifier,
            IntPtr outDataSize);

    @Generated
    @CFunction
    public static native int AudioFileGetGlobalInfo(int inPropertyID, int inSpecifierSize, VoidPtr inSpecifier,
            IntPtr ioDataSize, VoidPtr outPropertyData);

    @Generated
    @CFunction
    public static native int AudioFileStreamOpen(VoidPtr inClientData,
            @FunctionPtr(name = "call_AudioFileStreamOpen_1") Function_AudioFileStreamOpen_1 inPropertyListenerProc,
            @FunctionPtr(name = "call_AudioFileStreamOpen_2") Function_AudioFileStreamOpen_2 inPacketsProc,
            int inFileTypeHint, Ptr<AudioFileStreamID> outAudioFileStream);

    @Generated
    @CFunction
    public static native int AudioFileStreamParseBytes(AudioFileStreamID inAudioFileStream, int inDataByteSize,
            ConstVoidPtr inData, int inFlags);

    @Generated
    @CFunction
    public static native int AudioFileStreamSeek(AudioFileStreamID inAudioFileStream, long inPacketOffset,
            LongPtr outDataByteOffset, IntPtr ioFlags);

    @Generated
    @CFunction
    public static native int AudioFileStreamGetPropertyInfo(AudioFileStreamID inAudioFileStream, int inPropertyID,
            IntPtr outPropertyDataSize, BytePtr outWritable);

    @Generated
    @CFunction
    public static native int AudioFileStreamGetProperty(AudioFileStreamID inAudioFileStream, int inPropertyID,
            IntPtr ioPropertyDataSize, VoidPtr outPropertyData);

    @Generated
    @CFunction
    public static native int AudioFileStreamSetProperty(AudioFileStreamID inAudioFileStream, int inPropertyID,
            int inPropertyDataSize, ConstVoidPtr inPropertyData);

    @Generated
    @CFunction
    public static native int AudioFileStreamClose(AudioFileStreamID inAudioFileStream);

    @Generated
    @CFunction
    public static native int AudioFormatGetPropertyInfo(int inPropertyID, int inSpecifierSize, ConstVoidPtr inSpecifier,
            IntPtr outPropertyDataSize);

    @Generated
    @CFunction
    public static native int AudioFormatGetProperty(int inPropertyID, int inSpecifierSize, ConstVoidPtr inSpecifier,
            IntPtr ioPropertyDataSize, VoidPtr outPropertyData);

    @Generated
    @CFunction
    public static native int AudioQueueNewOutput(
            @UncertainArgument("Options: reference, array Fallback: reference") AudioStreamBasicDescription inFormat,
            @FunctionPtr(name = "call_AudioQueueNewOutput") Function_AudioQueueNewOutput inCallbackProc,
            VoidPtr inUserData, CFRunLoopRef inCallbackRunLoop, CFStringRef inCallbackRunLoopMode, int inFlags,
            Ptr<AudioQueueRef> outAQ);

    @Generated
    @CFunction
    public static native int AudioQueueNewInput(
            @UncertainArgument("Options: reference, array Fallback: reference") AudioStreamBasicDescription inFormat,
            @FunctionPtr(name = "call_AudioQueueNewInput") Function_AudioQueueNewInput inCallbackProc,
            VoidPtr inUserData, CFRunLoopRef inCallbackRunLoop, CFStringRef inCallbackRunLoopMode, int inFlags,
            Ptr<AudioQueueRef> outAQ);

    @Generated
    @CFunction
    public static native int AudioQueueNewOutputWithDispatchQueue(Ptr<AudioQueueRef> outAQ,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioStreamBasicDescription inFormat,
            int inFlags, NSObject inCallbackDispatchQueue,
            @ObjCBlock(name = "call_AudioQueueNewOutputWithDispatchQueue") Block_AudioQueueNewOutputWithDispatchQueue inCallbackBlock);

    @Generated
    @CFunction
    public static native int AudioQueueNewInputWithDispatchQueue(Ptr<AudioQueueRef> outAQ,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioStreamBasicDescription inFormat,
            int inFlags, NSObject inCallbackDispatchQueue,
            @ObjCBlock(name = "call_AudioQueueNewInputWithDispatchQueue") Block_AudioQueueNewInputWithDispatchQueue inCallbackBlock);

    @Generated
    @CFunction
    public static native int AudioQueueDispose(AudioQueueRef inAQ, byte inImmediate);

    @Generated
    @CFunction
    public static native int AudioQueueAllocateBuffer(AudioQueueRef inAQ, int inBufferByteSize,
            Ptr<Ptr<AudioQueueBuffer>> outBuffer);

    @Generated
    @CFunction
    public static native int AudioQueueAllocateBufferWithPacketDescriptions(AudioQueueRef inAQ, int inBufferByteSize,
            int inNumberPacketDescriptions, Ptr<Ptr<AudioQueueBuffer>> outBuffer);

    @Generated
    @CFunction
    public static native int AudioQueueFreeBuffer(AudioQueueRef inAQ,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioQueueBuffer inBuffer);

    @Generated
    @CFunction
    public static native int AudioQueueEnqueueBuffer(AudioQueueRef inAQ,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioQueueBuffer inBuffer,
            int inNumPacketDescs,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioStreamPacketDescription inPacketDescs);

    @Generated
    @CFunction
    public static native int AudioQueueEnqueueBufferWithParameters(AudioQueueRef inAQ,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioQueueBuffer inBuffer,
            int inNumPacketDescs,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioStreamPacketDescription inPacketDescs,
            int inTrimFramesAtStart, int inTrimFramesAtEnd, int inNumParamValues,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioQueueParameterEvent inParamValues,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioTimeStamp inStartTime,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioTimeStamp outActualStartTime);

    @Generated
    @CFunction
    public static native int AudioQueueStart(AudioQueueRef inAQ,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioTimeStamp inStartTime);

    @Generated
    @CFunction
    public static native int AudioQueuePrime(AudioQueueRef inAQ, int inNumberOfFramesToPrepare,
            IntPtr outNumberOfFramesPrepared);

    @Generated
    @CFunction
    public static native int AudioQueueStop(AudioQueueRef inAQ, byte inImmediate);

    @Generated
    @CFunction
    public static native int AudioQueuePause(AudioQueueRef inAQ);

    @Generated
    @CFunction
    public static native int AudioQueueFlush(AudioQueueRef inAQ);

    @Generated
    @CFunction
    public static native int AudioQueueReset(AudioQueueRef inAQ);

    @Generated
    @CFunction
    public static native int AudioQueueGetParameter(AudioQueueRef inAQ, int inParamID, FloatPtr outValue);

    @Generated
    @CFunction
    public static native int AudioQueueSetParameter(AudioQueueRef inAQ, int inParamID, float inValue);

    @Generated
    @CFunction
    public static native int AudioQueueGetProperty(AudioQueueRef inAQ, int inID, VoidPtr outData, IntPtr ioDataSize);

    @Generated
    @CFunction
    public static native int AudioQueueSetProperty(AudioQueueRef inAQ, int inID, ConstVoidPtr inData, int inDataSize);

    @Generated
    @CFunction
    public static native int AudioQueueGetPropertySize(AudioQueueRef inAQ, int inID, IntPtr outDataSize);

    @Generated
    @CFunction
    public static native int AudioQueueAddPropertyListener(AudioQueueRef inAQ, int inID,
            @FunctionPtr(name = "call_AudioQueueAddPropertyListener") Function_AudioQueueAddPropertyListener inProc,
            VoidPtr inUserData);

    @Generated
    @CFunction
    public static native int AudioQueueRemovePropertyListener(AudioQueueRef inAQ, int inID,
            @FunctionPtr(name = "call_AudioQueueRemovePropertyListener") Function_AudioQueueRemovePropertyListener inProc,
            VoidPtr inUserData);

    @Generated
    @CFunction
    public static native int AudioQueueCreateTimeline(AudioQueueRef inAQ, Ptr<AudioQueueTimelineRef> outTimeline);

    @Generated
    @CFunction
    public static native int AudioQueueDisposeTimeline(AudioQueueRef inAQ, AudioQueueTimelineRef inTimeline);

    @Generated
    @CFunction
    public static native int AudioQueueGetCurrentTime(AudioQueueRef inAQ, AudioQueueTimelineRef inTimeline,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioTimeStamp outTimeStamp,
            BytePtr outTimelineDiscontinuity);

    @Generated
    @CFunction
    public static native int AudioQueueDeviceGetCurrentTime(AudioQueueRef inAQ,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioTimeStamp outTimeStamp);

    @Generated
    @CFunction
    public static native int AudioQueueDeviceTranslateTime(AudioQueueRef inAQ,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioTimeStamp inTime,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioTimeStamp outTime);

    @Generated
    @CFunction
    public static native int AudioQueueDeviceGetNearestStartTime(AudioQueueRef inAQ,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioTimeStamp ioRequestedStartTime,
            int inFlags);

    @Generated
    @CFunction
    public static native int AudioQueueSetOfflineRenderFormat(AudioQueueRef inAQ,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioStreamBasicDescription inFormat,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioChannelLayout inLayout);

    @Generated
    @CFunction
    public static native int AudioQueueOfflineRender(AudioQueueRef inAQ,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioTimeStamp inTimestamp,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioQueueBuffer ioBuffer,
            int inNumberFrames);

    @Generated
    @CFunction
    public static native int AudioQueueProcessingTapNew(AudioQueueRef inAQ,
            @FunctionPtr(name = "call_AudioQueueProcessingTapNew") Function_AudioQueueProcessingTapNew inCallback,
            VoidPtr inClientData, int inFlags, IntPtr outMaxFrames,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioStreamBasicDescription outProcessingFormat,
            Ptr<AudioQueueProcessingTapRef> outAQTap);

    @Generated
    @CFunction
    public static native int AudioQueueProcessingTapDispose(AudioQueueProcessingTapRef inAQTap);

    @Generated
    @CFunction
    public static native int AudioQueueProcessingTapGetSourceAudio(AudioQueueProcessingTapRef inAQTap,
            int inNumberFrames,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioTimeStamp ioTimeStamp,
            IntPtr outFlags, IntPtr outNumberFrames,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioBufferList ioData);

    @Generated
    @CFunction
    public static native int AudioQueueProcessingTapGetQueueTime(AudioQueueProcessingTapRef inAQTap,
            DoublePtr outQueueSampleTime, IntPtr outQueueFrameCount);

    @Generated
    @Deprecated
    @CFunction
    public static native int AudioSessionInitialize(CFRunLoopRef inRunLoop, CFStringRef inRunLoopMode,
            @FunctionPtr(name = "call_AudioSessionInitialize") Function_AudioSessionInitialize inInterruptionListener,
            VoidPtr inClientData);

    @Generated
    @Deprecated
    @CFunction
    public static native int AudioSessionSetActive(byte active);

    @Generated
    @Deprecated
    @CFunction
    public static native int AudioSessionSetActiveWithFlags(byte active, int inFlags);

    @Generated
    @Deprecated
    @CFunction
    public static native int AudioSessionGetProperty(int inID, IntPtr ioDataSize, VoidPtr outData);

    @Generated
    @Deprecated
    @CFunction
    public static native int AudioSessionSetProperty(int inID, int inDataSize, ConstVoidPtr inData);

    @Generated
    @Deprecated
    @CFunction
    public static native int AudioSessionGetPropertySize(int inID, IntPtr outDataSize);

    @Generated
    @Deprecated
    @CFunction
    public static native int AudioSessionAddPropertyListener(int inID,
            @FunctionPtr(name = "call_AudioSessionAddPropertyListener") Function_AudioSessionAddPropertyListener inProc,
            VoidPtr inClientData);

    @Generated
    @Deprecated
    @CFunction
    public static native int AudioSessionRemovePropertyListener(int inID);

    @Generated
    @Deprecated
    @CFunction
    public static native int AudioSessionRemovePropertyListenerWithUserData(int inID,
            @FunctionPtr(name = "call_AudioSessionRemovePropertyListenerWithUserData") Function_AudioSessionRemovePropertyListenerWithUserData inProc,
            VoidPtr inClientData);

    @Generated
    @CFunction
    public static native int AudioServicesCreateSystemSoundID(CFURLRef inFileURL, IntPtr outSystemSoundID);

    @Generated
    @CFunction
    public static native int AudioServicesDisposeSystemSoundID(int inSystemSoundID);

    @Generated
    @CFunction
    public static native void AudioServicesPlayAlertSoundWithCompletion(int inSystemSoundID,
            @ObjCBlock(name = "call_AudioServicesPlayAlertSoundWithCompletion") Block_AudioServicesPlayAlertSoundWithCompletion inCompletionBlock);

    @Generated
    @CFunction
    public static native void AudioServicesPlaySystemSoundWithCompletion(int inSystemSoundID,
            @ObjCBlock(name = "call_AudioServicesPlaySystemSoundWithCompletion") Block_AudioServicesPlaySystemSoundWithCompletion inCompletionBlock);

    @Generated
    @CFunction
    public static native int AudioServicesGetPropertyInfo(int inPropertyID, int inSpecifierSize,
            ConstVoidPtr inSpecifier, IntPtr outPropertyDataSize, BytePtr outWritable);

    @Generated
    @CFunction
    public static native int AudioServicesGetProperty(int inPropertyID, int inSpecifierSize, ConstVoidPtr inSpecifier,
            IntPtr ioPropertyDataSize, VoidPtr outPropertyData);

    @Generated
    @CFunction
    public static native int AudioServicesSetProperty(int inPropertyID, int inSpecifierSize, ConstVoidPtr inSpecifier,
            int inPropertyDataSize, ConstVoidPtr inPropertyData);

    @Generated
    @CFunction
    public static native void AudioServicesPlayAlertSound(int inSystemSoundID);

    @Generated
    @CFunction
    public static native void AudioServicesPlaySystemSound(int inSystemSoundID);

    @Generated
    @CFunction
    public static native int AudioServicesAddSystemSoundCompletion(int inSystemSoundID, CFRunLoopRef inRunLoop,
            CFStringRef inRunLoopMode,
            @FunctionPtr(name = "call_AudioServicesAddSystemSoundCompletion") Function_AudioServicesAddSystemSoundCompletion inCompletionRoutine,
            VoidPtr inClientData);

    @Generated
    @CFunction
    public static native void AudioServicesRemoveSystemSoundCompletion(int inSystemSoundID);

    @Generated
    @CFunction
    public static native int ExtAudioFileOpenURL(CFURLRef inURL, Ptr<ExtAudioFileRef> outExtAudioFile);

    @Generated
    @CFunction
    public static native int ExtAudioFileWrapAudioFileID(AudioFileID inFileID, byte inForWriting,
            Ptr<ExtAudioFileRef> outExtAudioFile);

    @Generated
    @CFunction
    public static native int ExtAudioFileCreateWithURL(CFURLRef inURL, int inFileType,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioStreamBasicDescription inStreamDesc,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioChannelLayout inChannelLayout,
            int inFlags, Ptr<ExtAudioFileRef> outExtAudioFile);

    @Generated
    @CFunction
    public static native int ExtAudioFileDispose(ExtAudioFileRef inExtAudioFile);

    @Generated
    @CFunction
    public static native int ExtAudioFileRead(ExtAudioFileRef inExtAudioFile, IntPtr ioNumberFrames,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioBufferList ioData);

    @Generated
    @CFunction
    public static native int ExtAudioFileWrite(ExtAudioFileRef inExtAudioFile, int inNumberFrames,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioBufferList ioData);

    @Generated
    @CFunction
    public static native int ExtAudioFileWriteAsync(ExtAudioFileRef inExtAudioFile, int inNumberFrames,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioBufferList ioData);

    @Generated
    @CFunction
    public static native int ExtAudioFileSeek(ExtAudioFileRef inExtAudioFile, long inFrameOffset);

    @Generated
    @CFunction
    public static native int ExtAudioFileTell(ExtAudioFileRef inExtAudioFile, LongPtr outFrameOffset);

    @Generated
    @CFunction
    public static native int ExtAudioFileGetPropertyInfo(ExtAudioFileRef inExtAudioFile, int inPropertyID,
            IntPtr outSize, BytePtr outWritable);

    @Generated
    @CFunction
    public static native int ExtAudioFileGetProperty(ExtAudioFileRef inExtAudioFile, int inPropertyID,
            IntPtr ioPropertyDataSize, VoidPtr outPropertyData);

    @Generated
    @CFunction
    public static native int ExtAudioFileSetProperty(ExtAudioFileRef inExtAudioFile, int inPropertyID,
            int inPropertyDataSize, ConstVoidPtr inPropertyData);

    @Generated
    @CFunction
    public static native int NewMusicPlayer(Ptr<MusicPlayer> outPlayer);

    @Generated
    @CFunction
    public static native int DisposeMusicPlayer(MusicPlayer inPlayer);

    @Generated
    @CFunction
    public static native int MusicPlayerSetSequence(MusicPlayer inPlayer, MusicSequence inSequence);

    @Generated
    @CFunction
    public static native int MusicPlayerGetSequence(MusicPlayer inPlayer, Ptr<MusicSequence> outSequence);

    @Generated
    @CFunction
    public static native int MusicPlayerSetTime(MusicPlayer inPlayer, double inTime);

    @Generated
    @CFunction
    public static native int MusicPlayerGetTime(MusicPlayer inPlayer, DoublePtr outTime);

    @Generated
    @CFunction
    public static native int MusicPlayerGetHostTimeForBeats(MusicPlayer inPlayer, double inBeats, LongPtr outHostTime);

    @Generated
    @CFunction
    public static native int MusicPlayerGetBeatsForHostTime(MusicPlayer inPlayer, long inHostTime, DoublePtr outBeats);

    @Generated
    @CFunction
    public static native int MusicPlayerPreroll(MusicPlayer inPlayer);

    @Generated
    @CFunction
    public static native int MusicPlayerStart(MusicPlayer inPlayer);

    @Generated
    @CFunction
    public static native int MusicPlayerStop(MusicPlayer inPlayer);

    @Generated
    @CFunction
    public static native int MusicPlayerIsPlaying(MusicPlayer inPlayer, BytePtr outIsPlaying);

    @Generated
    @CFunction
    public static native int MusicPlayerSetPlayRateScalar(MusicPlayer inPlayer, double inScaleRate);

    @Generated
    @CFunction
    public static native int MusicPlayerGetPlayRateScalar(MusicPlayer inPlayer, DoublePtr outScaleRate);

    @Generated
    @CFunction
    public static native int NewMusicSequence(Ptr<MusicSequence> outSequence);

    @Generated
    @CFunction
    public static native int DisposeMusicSequence(MusicSequence inSequence);

    @Generated
    @CFunction
    public static native int MusicSequenceNewTrack(MusicSequence inSequence, Ptr<MusicTrack> outTrack);

    @Generated
    @CFunction
    public static native int MusicSequenceDisposeTrack(MusicSequence inSequence, MusicTrack inTrack);

    @Generated
    @CFunction
    public static native int MusicSequenceGetTrackCount(MusicSequence inSequence, IntPtr outNumberOfTracks);

    @Generated
    @CFunction
    public static native int MusicSequenceGetIndTrack(MusicSequence inSequence, int inTrackIndex,
            Ptr<MusicTrack> outTrack);

    @Generated
    @CFunction
    public static native int MusicSequenceGetTrackIndex(MusicSequence inSequence, MusicTrack inTrack,
            IntPtr outTrackIndex);

    @Generated
    @CFunction
    public static native int MusicSequenceGetTempoTrack(MusicSequence inSequence, Ptr<MusicTrack> outTrack);

    @Generated
    @CFunction
    public static native int MusicSequenceSetAUGraph(MusicSequence inSequence, AUGraph inGraph);

    @Generated
    @CFunction
    public static native int MusicSequenceGetAUGraph(MusicSequence inSequence, Ptr<AUGraph> outGraph);

    @Generated
    @CFunction
    public static native int MusicSequenceSetMIDIEndpoint(MusicSequence inSequence, int inEndpoint);

    @Generated
    @CFunction
    public static native int MusicSequenceSetSequenceType(MusicSequence inSequence, int inType);

    @Generated
    @CFunction
    public static native int MusicSequenceGetSequenceType(MusicSequence inSequence, IntPtr outType);

    @Generated
    @CFunction
    public static native int MusicSequenceFileLoad(MusicSequence inSequence, CFURLRef inFileRef, int inFileTypeHint,
            int inFlags);

    @Generated
    @CFunction
    public static native int MusicSequenceFileLoadData(MusicSequence inSequence, CFDataRef inData, int inFileTypeHint,
            int inFlags);

    @Generated
    @Inline
    @CFunction
    public static native short MusicSequenceSetSMPTEResolution(byte fps, byte ticks);

    @Generated
    @Inline
    @CFunction
    public static native void MusicSequenceGetSMPTEResolution(short inRes, BytePtr fps, BytePtr ticks);

    @Generated
    @CFunction
    public static native int MusicSequenceFileCreate(MusicSequence inSequence, CFURLRef inFileRef, int inFileType,
            int inFlags, short inResolution);

    @Generated
    @CFunction
    public static native int MusicSequenceFileCreateData(MusicSequence inSequence, int inFileType, int inFlags,
            short inResolution, Ptr<CFDataRef> outData);

    @Generated
    @CFunction
    public static native int MusicSequenceReverse(MusicSequence inSequence);

    @Generated
    @CFunction
    public static native int MusicSequenceGetSecondsForBeats(MusicSequence inSequence, double inBeats,
            DoublePtr outSeconds);

    @Generated
    @CFunction
    public static native int MusicSequenceGetBeatsForSeconds(MusicSequence inSequence, double inSeconds,
            DoublePtr outBeats);

    @Generated
    @CFunction
    public static native int MusicSequenceSetUserCallback(MusicSequence inSequence,
            @FunctionPtr(name = "call_MusicSequenceSetUserCallback") Function_MusicSequenceSetUserCallback inCallback,
            VoidPtr inClientData);

    @Generated
    @CFunction
    public static native int MusicSequenceBeatsToBarBeatTime(MusicSequence inSequence, double inBeats,
            int inSubbeatDivisor,
            @UncertainArgument("Options: reference, array Fallback: reference") CABarBeatTime outBarBeatTime);

    @Generated
    @CFunction
    public static native int MusicSequenceBarBeatTimeToBeats(MusicSequence inSequence,
            @UncertainArgument("Options: reference, array Fallback: reference") CABarBeatTime inBarBeatTime,
            DoublePtr outBeats);

    @Generated
    @CFunction
    public static native CFDictionaryRef MusicSequenceGetInfoDictionary(MusicSequence inSequence);

    @Generated
    @CFunction
    public static native int MusicTrackGetSequence(MusicTrack inTrack, Ptr<MusicSequence> outSequence);

    @Generated
    @CFunction
    public static native int MusicTrackSetDestNode(MusicTrack inTrack, int inNode);

    @Generated
    @CFunction
    public static native int MusicTrackSetDestMIDIEndpoint(MusicTrack inTrack, int inEndpoint);

    @Generated
    @CFunction
    public static native int MusicTrackGetDestNode(MusicTrack inTrack, IntPtr outNode);

    @Generated
    @CFunction
    public static native int MusicTrackGetDestMIDIEndpoint(MusicTrack inTrack, IntPtr outEndpoint);

    @Generated
    @CFunction
    public static native int MusicTrackSetProperty(MusicTrack inTrack, int inPropertyID, VoidPtr inData, int inLength);

    @Generated
    @CFunction
    public static native int MusicTrackGetProperty(MusicTrack inTrack, int inPropertyID, VoidPtr outData,
            IntPtr ioLength);

    @Generated
    @CFunction
    public static native int MusicTrackMoveEvents(MusicTrack inTrack, double inStartTime, double inEndTime,
            double inMoveTime);

    @Generated
    @CFunction
    public static native int MusicTrackClear(MusicTrack inTrack, double inStartTime, double inEndTime);

    @Generated
    @CFunction
    public static native int MusicTrackCut(MusicTrack inTrack, double inStartTime, double inEndTime);

    @Generated
    @CFunction
    public static native int MusicTrackCopyInsert(MusicTrack inSourceTrack, double inSourceStartTime,
            double inSourceEndTime, MusicTrack inDestTrack, double inDestInsertTime);

    @Generated
    @CFunction
    public static native int MusicTrackMerge(MusicTrack inSourceTrack, double inSourceStartTime, double inSourceEndTime,
            MusicTrack inDestTrack, double inDestInsertTime);

    @Generated
    @CFunction
    public static native int MusicTrackNewMIDINoteEvent(MusicTrack inTrack, double inTimeStamp,
            @UncertainArgument("Options: reference, array Fallback: reference") MIDINoteMessage inMessage);

    @Generated
    @CFunction
    public static native int MusicTrackNewMIDIChannelEvent(MusicTrack inTrack, double inTimeStamp,
            @UncertainArgument("Options: reference, array Fallback: reference") MIDIChannelMessage inMessage);

    @Generated
    @CFunction
    public static native int MusicTrackNewMIDIRawDataEvent(MusicTrack inTrack, double inTimeStamp,
            @UncertainArgument("Options: reference, array Fallback: reference") MIDIRawData inRawData);

    @Generated
    @CFunction
    public static native int MusicTrackNewExtendedNoteEvent(MusicTrack inTrack, double inTimeStamp,
            @UncertainArgument("Options: reference, array Fallback: reference") ExtendedNoteOnEvent inInfo);

    @Generated
    @CFunction
    public static native int MusicTrackNewParameterEvent(MusicTrack inTrack, double inTimeStamp,
            @UncertainArgument("Options: reference, array Fallback: reference") ParameterEvent inInfo);

    @Generated
    @CFunction
    public static native int MusicTrackNewExtendedTempoEvent(MusicTrack inTrack, double inTimeStamp, double inBPM);

    @Generated
    @CFunction
    public static native int MusicTrackNewMetaEvent(MusicTrack inTrack, double inTimeStamp,
            @UncertainArgument("Options: reference, array Fallback: reference") MIDIMetaEvent inMetaEvent);

    @Generated
    @CFunction
    public static native int MusicTrackNewUserEvent(MusicTrack inTrack, double inTimeStamp,
            @UncertainArgument("Options: reference, array Fallback: reference") MusicEventUserData inUserData);

    @Generated
    @CFunction
    public static native int MusicTrackNewAUPresetEvent(MusicTrack inTrack, double inTimeStamp,
            @UncertainArgument("Options: reference, array Fallback: reference") AUPresetEvent inPresetEvent);

    @Generated
    @CFunction
    public static native int NewMusicEventIterator(MusicTrack inTrack, Ptr<MusicEventIterator> outIterator);

    @Generated
    @CFunction
    public static native int DisposeMusicEventIterator(MusicEventIterator inIterator);

    @Generated
    @CFunction
    public static native int MusicEventIteratorSeek(MusicEventIterator inIterator, double inTimeStamp);

    @Generated
    @CFunction
    public static native int MusicEventIteratorNextEvent(MusicEventIterator inIterator);

    @Generated
    @CFunction
    public static native int MusicEventIteratorPreviousEvent(MusicEventIterator inIterator);

    @Generated
    @CFunction
    public static native int MusicEventIteratorGetEventInfo(MusicEventIterator inIterator, DoublePtr outTimeStamp,
            IntPtr outEventType, Ptr<ConstVoidPtr> outEventData, IntPtr outEventDataSize);

    @Generated
    @CFunction
    public static native int MusicEventIteratorSetEventInfo(MusicEventIterator inIterator, int inEventType,
            ConstVoidPtr inEventData);

    @Generated
    @CFunction
    public static native int MusicEventIteratorSetEventTime(MusicEventIterator inIterator, double inTimeStamp);

    @Generated
    @CFunction
    public static native int MusicEventIteratorDeleteEvent(MusicEventIterator inIterator);

    @Generated
    @CFunction
    public static native int MusicEventIteratorHasPreviousEvent(MusicEventIterator inIterator, BytePtr outHasPrevEvent);

    @Generated
    @CFunction
    public static native int MusicEventIteratorHasNextEvent(MusicEventIterator inIterator, BytePtr outHasNextEvent);

    @Generated
    @CFunction
    public static native int MusicEventIteratorHasCurrentEvent(MusicEventIterator inIterator, BytePtr outHasCurEvent);

    @Generated
    @CFunction
    public static native void CAShow(VoidPtr inObject);

    @Generated
    @CFunction
    public static native void CAShowFile(VoidPtr inObject,
            @UncertainArgument("Options: reference, array Fallback: reference") FILE inFile);

    @Generated
    @CFunction
    public static native int CopyNameFromSoundBank(CFURLRef inURL, Ptr<CFStringRef> outName);

    @Generated
    @CFunction
    public static native int CopyInstrumentInfoFromSoundBank(CFURLRef inURL, Ptr<CFArrayRef> outInstrumentInfo);

    @Generated
    @CVariable()
    public static native CFStringRef kAudioComponentRegistrationsChangedNotification();

    @Generated
    @CVariable()
    public static native CFStringRef kAudioComponentInstanceInvalidationNotification();

    @Generated
    @CVariable()
    public static native CFStringRef kAudioSession_RouteChangeKey_Reason();

    @Generated
    @CVariable()
    public static native CFStringRef kAudioSession_AudioRouteChangeKey_PreviousRouteDescription();

    @Generated
    @CVariable()
    public static native CFStringRef kAudioSession_AudioRouteChangeKey_CurrentRouteDescription();

    @Generated
    @CVariable()
    public static native CFStringRef kAudioSession_AudioRouteKey_Inputs();

    @Generated
    @CVariable()
    public static native CFStringRef kAudioSession_AudioRouteKey_Outputs();

    @Generated
    @CVariable()
    public static native CFStringRef kAudioSession_AudioRouteKey_Type();

    @Generated
    @CVariable()
    public static native CFStringRef kAudioSessionInputRoute_LineIn();

    @Generated
    @CVariable()
    public static native CFStringRef kAudioSessionInputRoute_BuiltInMic();

    @Generated
    @CVariable()
    public static native CFStringRef kAudioSessionInputRoute_HeadsetMic();

    @Generated
    @CVariable()
    public static native CFStringRef kAudioSessionInputRoute_BluetoothHFP();

    @Generated
    @CVariable()
    public static native CFStringRef kAudioSessionInputRoute_USBAudio();

    @Generated
    @CVariable()
    public static native CFStringRef kAudioSessionOutputRoute_LineOut();

    @Generated
    @CVariable()
    public static native CFStringRef kAudioSessionOutputRoute_Headphones();

    @Generated
    @CVariable()
    public static native CFStringRef kAudioSessionOutputRoute_BluetoothHFP();

    @Generated
    @CVariable()
    public static native CFStringRef kAudioSessionOutputRoute_BluetoothA2DP();

    @Generated
    @CVariable()
    public static native CFStringRef kAudioSessionOutputRoute_BuiltInReceiver();

    @Generated
    @CVariable()
    public static native CFStringRef kAudioSessionOutputRoute_BuiltInSpeaker();

    @Generated
    @CVariable()
    public static native CFStringRef kAudioSessionOutputRoute_USBAudio();

    @Generated
    @CVariable()
    public static native CFStringRef kAudioSessionOutputRoute_HDMI();

    @Generated
    @CVariable()
    public static native CFStringRef kAudioSessionOutputRoute_AirPlay();

    @Generated
    @CVariable()
    public static native CFStringRef kAudioSession_InputSourceKey_ID();

    @Generated
    @CVariable()
    public static native CFStringRef kAudioSession_InputSourceKey_Description();

    @Generated
    @CVariable()
    public static native CFStringRef kAudioSession_OutputDestinationKey_ID();

    @Generated
    @CVariable()
    public static native CFStringRef kAudioSession_OutputDestinationKey_Description();

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_AudioComponentInstantiate {
        @Generated
        void call_AudioComponentInstantiate(AudioComponentInstance arg0, int arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_AudioComponentRegister {
        @Generated
        VoidPtr call_AudioComponentRegister(
                @UncertainArgument("Options: reference, array Fallback: reference") AudioComponentDescription arg0);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_AudioUnitAddPropertyListener {
        @Generated
        void call_AudioUnitAddPropertyListener(VoidPtr arg0, AudioComponentInstance arg1, int arg2, int arg3, int arg4);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_AudioUnitRemovePropertyListenerWithUserData {
        @Generated
        void call_AudioUnitRemovePropertyListenerWithUserData(VoidPtr arg0, AudioComponentInstance arg1, int arg2,
                int arg3, int arg4);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_AudioUnitAddRenderNotify {
        @Generated
        int call_AudioUnitAddRenderNotify(VoidPtr arg0, IntPtr arg1,
                @UncertainArgument("Options: reference, array Fallback: reference") AudioTimeStamp arg2, int arg3,
                int arg4, @UncertainArgument("Options: reference, array Fallback: reference") AudioBufferList arg5);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_AudioUnitRemoveRenderNotify {
        @Generated
        int call_AudioUnitRemoveRenderNotify(VoidPtr arg0, IntPtr arg1,
                @UncertainArgument("Options: reference, array Fallback: reference") AudioTimeStamp arg2, int arg3,
                int arg4, @UncertainArgument("Options: reference, array Fallback: reference") AudioBufferList arg5);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_AUGraphAddRenderNotify {
        @Generated
        int call_AUGraphAddRenderNotify(VoidPtr arg0, IntPtr arg1,
                @UncertainArgument("Options: reference, array Fallback: reference") AudioTimeStamp arg2, int arg3,
                int arg4, @UncertainArgument("Options: reference, array Fallback: reference") AudioBufferList arg5);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_AUGraphRemoveRenderNotify {
        @Generated
        int call_AUGraphRemoveRenderNotify(VoidPtr arg0, IntPtr arg1,
                @UncertainArgument("Options: reference, array Fallback: reference") AudioTimeStamp arg2, int arg3,
                int arg4, @UncertainArgument("Options: reference, array Fallback: reference") AudioBufferList arg5);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_AudioConverterFillComplexBuffer {
        @Generated
        int call_AudioConverterFillComplexBuffer(AudioConverterRef arg0, IntPtr arg1,
                @UncertainArgument("Options: reference, array Fallback: reference") AudioBufferList arg2,
                @ReferenceInfo(type = AudioStreamPacketDescription.class, depth = 2) Ptr<Ptr<AudioStreamPacketDescription>> arg3,
                VoidPtr arg4);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_AudioFileInitializeWithCallbacks_1 {
        @Generated
        int call_AudioFileInitializeWithCallbacks_1(VoidPtr arg0, long arg1, int arg2, VoidPtr arg3, IntPtr arg4);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_AudioFileInitializeWithCallbacks_2 {
        @Generated
        int call_AudioFileInitializeWithCallbacks_2(VoidPtr arg0, long arg1, int arg2, ConstVoidPtr arg3, IntPtr arg4);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_AudioFileInitializeWithCallbacks_3 {
        @Generated
        long call_AudioFileInitializeWithCallbacks_3(VoidPtr arg0);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_AudioFileInitializeWithCallbacks_4 {
        @Generated
        int call_AudioFileInitializeWithCallbacks_4(VoidPtr arg0, long arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_AudioFileOpenWithCallbacks_1 {
        @Generated
        int call_AudioFileOpenWithCallbacks_1(VoidPtr arg0, long arg1, int arg2, VoidPtr arg3, IntPtr arg4);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_AudioFileOpenWithCallbacks_2 {
        @Generated
        int call_AudioFileOpenWithCallbacks_2(VoidPtr arg0, long arg1, int arg2, ConstVoidPtr arg3, IntPtr arg4);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_AudioFileOpenWithCallbacks_3 {
        @Generated
        long call_AudioFileOpenWithCallbacks_3(VoidPtr arg0);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_AudioFileOpenWithCallbacks_4 {
        @Generated
        int call_AudioFileOpenWithCallbacks_4(VoidPtr arg0, long arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_AudioFileStreamOpen_1 {
        @Generated
        void call_AudioFileStreamOpen_1(VoidPtr arg0, AudioFileStreamID arg1, int arg2, IntPtr arg3);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_AudioFileStreamOpen_2 {
        @Generated
        void call_AudioFileStreamOpen_2(VoidPtr arg0, int arg1, int arg2, ConstVoidPtr arg3,
                @UncertainArgument("Options: reference, array Fallback: reference") AudioStreamPacketDescription arg4);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_AudioQueueNewOutput {
        @Generated
        void call_AudioQueueNewOutput(VoidPtr arg0, AudioQueueRef arg1, AudioQueueBuffer arg2);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_AudioQueueNewInput {
        @Generated
        void call_AudioQueueNewInput(VoidPtr arg0, AudioQueueRef arg1, AudioQueueBuffer arg2, AudioTimeStamp arg3,
                int arg4,
                @ReferenceInfo(type = AudioStreamPacketDescription.class) ConstPtr<AudioStreamPacketDescription> arg5);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_AudioQueueNewOutputWithDispatchQueue {
        @Generated
        void call_AudioQueueNewOutputWithDispatchQueue(AudioQueueRef arg0,
                @UncertainArgument("Options: reference, array Fallback: reference") AudioQueueBuffer arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_AudioQueueNewInputWithDispatchQueue {
        @Generated
        void call_AudioQueueNewInputWithDispatchQueue(AudioQueueRef arg0,
                @UncertainArgument("Options: reference, array Fallback: reference") AudioQueueBuffer arg1,
                @UncertainArgument("Options: reference, array Fallback: reference") AudioTimeStamp arg2, int arg3,
                @UncertainArgument("Options: reference, array Fallback: reference") AudioStreamPacketDescription arg4);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_AudioQueueAddPropertyListener {
        @Generated
        void call_AudioQueueAddPropertyListener(VoidPtr arg0, AudioQueueRef arg1, int arg2);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_AudioQueueRemovePropertyListener {
        @Generated
        void call_AudioQueueRemovePropertyListener(VoidPtr arg0, AudioQueueRef arg1, int arg2);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_AudioQueueProcessingTapNew {
        @Generated
        void call_AudioQueueProcessingTapNew(VoidPtr arg0, AudioQueueProcessingTapRef arg1, int arg2,
                @UncertainArgument("Options: reference, array Fallback: reference") AudioTimeStamp arg3, IntPtr arg4,
                IntPtr arg5, @UncertainArgument("Options: reference, array Fallback: reference") AudioBufferList arg6);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_AudioSessionInitialize {
        @Generated
        void call_AudioSessionInitialize(VoidPtr arg0, int arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_AudioSessionAddPropertyListener {
        @Generated
        void call_AudioSessionAddPropertyListener(VoidPtr arg0, int arg1, int arg2, ConstVoidPtr arg3);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_AudioSessionRemovePropertyListenerWithUserData {
        @Generated
        void call_AudioSessionRemovePropertyListenerWithUserData(VoidPtr arg0, int arg1, int arg2, ConstVoidPtr arg3);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_AudioServicesPlayAlertSoundWithCompletion {
        @Generated
        void call_AudioServicesPlayAlertSoundWithCompletion();
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_AudioServicesPlaySystemSoundWithCompletion {
        @Generated
        void call_AudioServicesPlaySystemSoundWithCompletion();
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_AudioServicesAddSystemSoundCompletion {
        @Generated
        void call_AudioServicesAddSystemSoundCompletion(int arg0, VoidPtr arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_MusicSequenceSetUserCallback {
        @Generated
        void call_MusicSequenceSetUserCallback(VoidPtr arg0, MusicSequence arg1, MusicTrack arg2, double arg3,
                @UncertainArgument("Options: reference, array Fallback: reference") MusicEventUserData arg4,
                double arg5, double arg6);
    }
}
