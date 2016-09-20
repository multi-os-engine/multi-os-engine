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

import apple.audiotoolbox.opaque.AUGraph;
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
import apple.audiotoolbox.struct.AudioFileRegion;
import apple.audiotoolbox.struct.AudioQueueBuffer;
import apple.audiotoolbox.struct.AudioQueueParameterEvent;
import apple.audiotoolbox.struct.CABarBeatTime;
import apple.audiotoolbox.struct.ExtendedNoteOnEvent;
import apple.audiotoolbox.struct.MIDIChannelMessage;
import apple.audiotoolbox.struct.MIDIMetaEvent;
import apple.audiotoolbox.struct.MIDINoteMessage;
import apple.audiotoolbox.struct.MIDIRawData;
import apple.audiotoolbox.struct.MusicEventUserData;
import apple.audiotoolbox.struct.ParameterEvent;
import apple.audiounit.opaque.AudioComponentInstance;
import apple.audiounit.struct.AURenderCallbackStruct;
import apple.audiounit.struct.AudioComponentDescription;
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

    /**
     * AudioFileCreateWithURL</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/AudioFileConvertRef/index.html#//apple_ref/c/func/AudioFileCreateWithURL">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AudioFileCreateWithURL(CFURLRef inFileRef, int inFileType,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioStreamBasicDescription inFormat,
            int inFlags, Ptr<AudioFileID> outAudioFile);

    /**
     * AudioFileOpenURL</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/AudioFileConvertRef/index.html#//apple_ref/c/func/AudioFileOpenURL">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AudioFileOpenURL(CFURLRef inFileRef, byte inPermissions, int inFileTypeHint,
            Ptr<AudioFileID> outAudioFile);

    /**
     * AudioFileInitializeWithCallbacks</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/AudioFileConvertRef/index.html#//apple_ref/c/func/AudioFileInitializeWithCallbacks">iOS Dev Center</a>
     */
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

    /**
     * AudioFileOpenWithCallbacks</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/AudioFileConvertRef/index.html#//apple_ref/c/func/AudioFileOpenWithCallbacks">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AudioFileOpenWithCallbacks(VoidPtr inClientData,
            @FunctionPtr(name = "call_AudioFileOpenWithCallbacks_1") Function_AudioFileOpenWithCallbacks_1 inReadFunc,
            @FunctionPtr(name = "call_AudioFileOpenWithCallbacks_2") Function_AudioFileOpenWithCallbacks_2 inWriteFunc,
            @FunctionPtr(name = "call_AudioFileOpenWithCallbacks_3") Function_AudioFileOpenWithCallbacks_3 inGetSizeFunc,
            @FunctionPtr(name = "call_AudioFileOpenWithCallbacks_4") Function_AudioFileOpenWithCallbacks_4 inSetSizeFunc,
            int inFileTypeHint, Ptr<AudioFileID> outAudioFile);

    /**
     * AudioFileClose</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/AudioFileConvertRef/index.html#//apple_ref/c/func/AudioFileClose">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AudioFileClose(AudioFileID inAudioFile);

    /**
     * AudioFileOptimize</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/AudioFileConvertRef/index.html#//apple_ref/c/func/AudioFileOptimize">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AudioFileOptimize(AudioFileID inAudioFile);

    /**
     * AudioFileReadBytes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/AudioFileConvertRef/index.html#//apple_ref/c/func/AudioFileReadBytes">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AudioFileReadBytes(AudioFileID inAudioFile, byte inUseCache, long inStartingByte,
            IntPtr ioNumBytes, VoidPtr outBuffer);

    /**
     * AudioFileWriteBytes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/AudioFileConvertRef/index.html#//apple_ref/c/func/AudioFileWriteBytes">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AudioFileWriteBytes(AudioFileID inAudioFile, byte inUseCache, long inStartingByte,
            IntPtr ioNumBytes, ConstVoidPtr inBuffer);

    /**
     * AudioFileReadPacketData</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/AudioFileConvertRef/index.html#//apple_ref/c/func/AudioFileReadPacketData">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AudioFileReadPacketData(AudioFileID inAudioFile, byte inUseCache, IntPtr ioNumBytes,
            Ptr<AudioStreamPacketDescription> outPacketDescriptions, long inStartingPacket, IntPtr ioNumPackets,
            VoidPtr outBuffer);

    /**
     * AudioFileReadPackets</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/AudioFileConvertRef/index.html#//apple_ref/c/func/AudioFileReadPackets">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @CFunction
    public static native int AudioFileReadPackets(AudioFileID inAudioFile, byte inUseCache, IntPtr outNumBytes,
            Ptr<AudioStreamPacketDescription> outPacketDescriptions, long inStartingPacket, IntPtr ioNumPackets,
            VoidPtr outBuffer);

    /**
     * AudioFileWritePackets</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/AudioFileConvertRef/index.html#//apple_ref/c/func/AudioFileWritePackets">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AudioFileWritePackets(AudioFileID inAudioFile, byte inUseCache, int inNumBytes,
            ConstPtr<AudioStreamPacketDescription> inPacketDescriptions, long inStartingPacket, IntPtr ioNumPackets,
            ConstVoidPtr inBuffer);

    /**
     * AudioFileCountUserData</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/AudioFileConvertRef/index.html#//apple_ref/c/func/AudioFileCountUserData">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AudioFileCountUserData(AudioFileID inAudioFile, int inUserDataID, IntPtr outNumberItems);

    /**
     * AudioFileGetUserDataSize</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/AudioFileConvertRef/index.html#//apple_ref/c/func/AudioFileGetUserDataSize">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AudioFileGetUserDataSize(AudioFileID inAudioFile, int inUserDataID, int inIndex,
            IntPtr outUserDataSize);

    /**
     * AudioFileGetUserData</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/AudioFileConvertRef/index.html#//apple_ref/c/func/AudioFileGetUserData">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AudioFileGetUserData(AudioFileID inAudioFile, int inUserDataID, int inIndex,
            IntPtr ioUserDataSize, VoidPtr outUserData);

    /**
     * AudioFileSetUserData</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/AudioFileConvertRef/index.html#//apple_ref/c/func/AudioFileSetUserData">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AudioFileSetUserData(AudioFileID inAudioFile, int inUserDataID, int inIndex,
            int inUserDataSize, ConstVoidPtr inUserData);

    /**
     * AudioFileRemoveUserData</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/AudioFileConvertRef/index.html#//apple_ref/c/func/AudioFileRemoveUserData">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AudioFileRemoveUserData(AudioFileID inAudioFile, int inUserDataID, int inIndex);

    /**
     * AudioFileGetPropertyInfo</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/AudioFileConvertRef/index.html#//apple_ref/c/func/AudioFileGetPropertyInfo">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AudioFileGetPropertyInfo(AudioFileID inAudioFile, int inPropertyID, IntPtr outDataSize,
            IntPtr isWritable);

    /**
     * AudioFileGetProperty</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/AudioFileConvertRef/index.html#//apple_ref/c/func/AudioFileGetProperty">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AudioFileGetProperty(AudioFileID inAudioFile, int inPropertyID, IntPtr ioDataSize,
            VoidPtr outPropertyData);

    /**
     * AudioFileSetProperty</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/AudioFileConvertRef/index.html#//apple_ref/c/func/AudioFileSetProperty">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AudioFileSetProperty(AudioFileID inAudioFile, int inPropertyID, int inDataSize,
            ConstVoidPtr inPropertyData);

    /**
     * AudioFileGetGlobalInfoSize</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/AudioFileConvertRef/index.html#//apple_ref/c/func/AudioFileGetGlobalInfoSize">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AudioFileGetGlobalInfoSize(int inPropertyID, int inSpecifierSize, VoidPtr inSpecifier,
            IntPtr outDataSize);

    /**
     * AudioFileGetGlobalInfo</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/AudioFileConvertRef/index.html#//apple_ref/c/func/AudioFileGetGlobalInfo">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AudioFileGetGlobalInfo(int inPropertyID, int inSpecifierSize, VoidPtr inSpecifier,
            IntPtr ioDataSize, VoidPtr outPropertyData);

    /**
     * AudioFileStreamOpen</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/AudioStreamReference/index.html#//apple_ref/c/func/AudioFileStreamOpen">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AudioFileStreamOpen(VoidPtr inClientData,
            @FunctionPtr(name = "call_AudioFileStreamOpen_1") Function_AudioFileStreamOpen_1 inPropertyListenerProc,
            @FunctionPtr(name = "call_AudioFileStreamOpen_2") Function_AudioFileStreamOpen_2 inPacketsProc,
            int inFileTypeHint, Ptr<AudioFileStreamID> outAudioFileStream);

    /**
     * AudioFileStreamParseBytes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/AudioStreamReference/index.html#//apple_ref/c/func/AudioFileStreamParseBytes">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AudioFileStreamParseBytes(AudioFileStreamID inAudioFileStream, int inDataByteSize,
            ConstVoidPtr inData, int inFlags);

    /**
     * AudioFileStreamSeek</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/AudioStreamReference/index.html#//apple_ref/c/func/AudioFileStreamSeek">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AudioFileStreamSeek(AudioFileStreamID inAudioFileStream, long inPacketOffset,
            LongPtr outDataByteOffset, IntPtr ioFlags);

    /**
     * AudioFileStreamGetPropertyInfo</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/AudioStreamReference/index.html#//apple_ref/c/func/AudioFileStreamGetPropertyInfo">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AudioFileStreamGetPropertyInfo(AudioFileStreamID inAudioFileStream, int inPropertyID,
            IntPtr outPropertyDataSize, BytePtr outWritable);

    /**
     * AudioFileStreamGetProperty</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/AudioStreamReference/index.html#//apple_ref/c/func/AudioFileStreamGetProperty">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AudioFileStreamGetProperty(AudioFileStreamID inAudioFileStream, int inPropertyID,
            IntPtr ioPropertyDataSize, VoidPtr outPropertyData);

    /**
     * AudioFileStreamSetProperty</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/AudioStreamReference/index.html#//apple_ref/c/func/AudioFileStreamSetProperty">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AudioFileStreamSetProperty(AudioFileStreamID inAudioFileStream, int inPropertyID,
            int inPropertyDataSize, ConstVoidPtr inPropertyData);

    /**
     * AudioFileStreamClose</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/AudioStreamReference/index.html#//apple_ref/c/func/AudioFileStreamClose">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AudioFileStreamClose(AudioFileStreamID inAudioFileStream);

    /**
     * AudioFormatGetPropertyInfo</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/AudioFormatServicesReference/index.html#//apple_ref/c/func/AudioFormatGetPropertyInfo">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AudioFormatGetPropertyInfo(int inPropertyID, int inSpecifierSize, ConstVoidPtr inSpecifier,
            IntPtr outPropertyDataSize);

    /**
     * AudioFormatGetProperty</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/AudioFormatServicesReference/index.html#//apple_ref/c/func/AudioFormatGetProperty">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AudioFormatGetProperty(int inPropertyID, int inSpecifierSize, ConstVoidPtr inSpecifier,
            IntPtr ioPropertyDataSize, VoidPtr outPropertyData);

    /**
     * AudioQueueNewOutput</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/AudioQueueReference/index.html#//apple_ref/c/func/AudioQueueNewOutput">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AudioQueueNewOutput(
            @UncertainArgument("Options: reference, array Fallback: reference") AudioStreamBasicDescription inFormat,
            @FunctionPtr(name = "call_AudioQueueNewOutput") Function_AudioQueueNewOutput inCallbackProc,
            VoidPtr inUserData, CFRunLoopRef inCallbackRunLoop, CFStringRef inCallbackRunLoopMode, int inFlags,
            Ptr<AudioQueueRef> outAQ);

    /**
     * AudioQueueNewInput</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/AudioQueueReference/index.html#//apple_ref/c/func/AudioQueueNewInput">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AudioQueueNewInput(
            @UncertainArgument("Options: reference, array Fallback: reference") AudioStreamBasicDescription inFormat,
            @FunctionPtr(name = "call_AudioQueueNewInput") Function_AudioQueueNewInput inCallbackProc,
            VoidPtr inUserData, CFRunLoopRef inCallbackRunLoop, CFStringRef inCallbackRunLoopMode, int inFlags,
            Ptr<AudioQueueRef> outAQ);

    /**
     * AudioQueueDispose</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/AudioQueueReference/index.html#//apple_ref/c/func/AudioQueueDispose">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AudioQueueDispose(AudioQueueRef inAQ, byte inImmediate);

    /**
     * AudioQueueAllocateBuffer</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/AudioQueueReference/index.html#//apple_ref/c/func/AudioQueueAllocateBuffer">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AudioQueueAllocateBuffer(AudioQueueRef inAQ, int inBufferByteSize,
            Ptr<Ptr<AudioQueueBuffer>> outBuffer);

    /**
     * AudioQueueAllocateBufferWithPacketDescriptions</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/AudioQueueReference/index.html#//apple_ref/c/func/AudioQueueAllocateBufferWithPacketDescriptions">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AudioQueueAllocateBufferWithPacketDescriptions(AudioQueueRef inAQ, int inBufferByteSize,
            int inNumberPacketDescriptions, Ptr<Ptr<AudioQueueBuffer>> outBuffer);

    /**
     * AudioQueueFreeBuffer</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/AudioQueueReference/index.html#//apple_ref/c/func/AudioQueueFreeBuffer">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AudioQueueFreeBuffer(AudioQueueRef inAQ,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioQueueBuffer inBuffer);

    /**
     * AudioQueueEnqueueBuffer</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/AudioQueueReference/index.html#//apple_ref/c/func/AudioQueueEnqueueBuffer">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AudioQueueEnqueueBuffer(AudioQueueRef inAQ,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioQueueBuffer inBuffer,
            int inNumPacketDescs,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioStreamPacketDescription inPacketDescs);

    /**
     * AudioQueueEnqueueBufferWithParameters</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/AudioQueueReference/index.html#//apple_ref/c/func/AudioQueueEnqueueBufferWithParameters">iOS Dev Center</a>
     */
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

    /**
     * AudioQueueStart</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/AudioQueueReference/index.html#//apple_ref/c/func/AudioQueueStart">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AudioQueueStart(AudioQueueRef inAQ,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioTimeStamp inStartTime);

    /**
     * AudioQueuePrime</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/AudioQueueReference/index.html#//apple_ref/c/func/AudioQueuePrime">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AudioQueuePrime(AudioQueueRef inAQ, int inNumberOfFramesToPrepare,
            IntPtr outNumberOfFramesPrepared);

    /**
     * AudioQueueStop</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/AudioQueueReference/index.html#//apple_ref/c/func/AudioQueueStop">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AudioQueueStop(AudioQueueRef inAQ, byte inImmediate);

    /**
     * AudioQueuePause</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/AudioQueueReference/index.html#//apple_ref/c/func/AudioQueuePause">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AudioQueuePause(AudioQueueRef inAQ);

    /**
     * AudioQueueFlush</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/AudioQueueReference/index.html#//apple_ref/c/func/AudioQueueFlush">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AudioQueueFlush(AudioQueueRef inAQ);

    /**
     * AudioQueueReset</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/AudioQueueReference/index.html#//apple_ref/c/func/AudioQueueReset">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AudioQueueReset(AudioQueueRef inAQ);

    /**
     * AudioQueueGetParameter</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/AudioQueueReference/index.html#//apple_ref/c/func/AudioQueueGetParameter">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AudioQueueGetParameter(AudioQueueRef inAQ, int inParamID, FloatPtr outValue);

    /**
     * AudioQueueSetParameter</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/AudioQueueReference/index.html#//apple_ref/c/func/AudioQueueSetParameter">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AudioQueueSetParameter(AudioQueueRef inAQ, int inParamID, float inValue);

    /**
     * AudioQueueGetProperty</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/AudioQueueReference/index.html#//apple_ref/c/func/AudioQueueGetProperty">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AudioQueueGetProperty(AudioQueueRef inAQ, int inID, VoidPtr outData, IntPtr ioDataSize);

    /**
     * AudioQueueSetProperty</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/AudioQueueReference/index.html#//apple_ref/c/func/AudioQueueSetProperty">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AudioQueueSetProperty(AudioQueueRef inAQ, int inID, ConstVoidPtr inData, int inDataSize);

    /**
     * AudioQueueGetPropertySize</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/AudioQueueReference/index.html#//apple_ref/c/func/AudioQueueGetPropertySize">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AudioQueueGetPropertySize(AudioQueueRef inAQ, int inID, IntPtr outDataSize);

    /**
     * AudioQueueAddPropertyListener</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/AudioQueueReference/index.html#//apple_ref/c/func/AudioQueueAddPropertyListener">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AudioQueueAddPropertyListener(AudioQueueRef inAQ, int inID,
            @FunctionPtr(name = "call_AudioQueueAddPropertyListener") Function_AudioQueueAddPropertyListener inProc,
            VoidPtr inUserData);

    /**
     * AudioQueueRemovePropertyListener</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/AudioQueueReference/index.html#//apple_ref/c/func/AudioQueueRemovePropertyListener">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AudioQueueRemovePropertyListener(AudioQueueRef inAQ, int inID,
            @FunctionPtr(name = "call_AudioQueueRemovePropertyListener") Function_AudioQueueRemovePropertyListener inProc,
            VoidPtr inUserData);

    /**
     * AudioQueueCreateTimeline</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/AudioQueueReference/index.html#//apple_ref/c/func/AudioQueueCreateTimeline">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AudioQueueCreateTimeline(AudioQueueRef inAQ, Ptr<AudioQueueTimelineRef> outTimeline);

    /**
     * AudioQueueDisposeTimeline</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/AudioQueueReference/index.html#//apple_ref/c/func/AudioQueueDisposeTimeline">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AudioQueueDisposeTimeline(AudioQueueRef inAQ, AudioQueueTimelineRef inTimeline);

    /**
     * AudioQueueGetCurrentTime</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/AudioQueueReference/index.html#//apple_ref/c/func/AudioQueueGetCurrentTime">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AudioQueueGetCurrentTime(AudioQueueRef inAQ, AudioQueueTimelineRef inTimeline,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioTimeStamp outTimeStamp,
            BytePtr outTimelineDiscontinuity);

    /**
     * AudioQueueDeviceGetCurrentTime</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/AudioQueueReference/index.html#//apple_ref/c/func/AudioQueueDeviceGetCurrentTime">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AudioQueueDeviceGetCurrentTime(AudioQueueRef inAQ,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioTimeStamp outTimeStamp);

    /**
     * AudioQueueDeviceTranslateTime</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/AudioQueueReference/index.html#//apple_ref/c/func/AudioQueueDeviceTranslateTime">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AudioQueueDeviceTranslateTime(AudioQueueRef inAQ,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioTimeStamp inTime,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioTimeStamp outTime);

    /**
     * AudioQueueDeviceGetNearestStartTime</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/AudioQueueReference/index.html#//apple_ref/c/func/AudioQueueDeviceGetNearestStartTime">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AudioQueueDeviceGetNearestStartTime(AudioQueueRef inAQ,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioTimeStamp ioRequestedStartTime,
            int inFlags);

    /**
     * AudioQueueSetOfflineRenderFormat</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/AudioQueueReference/index.html#//apple_ref/c/func/AudioQueueSetOfflineRenderFormat">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AudioQueueSetOfflineRenderFormat(AudioQueueRef inAQ,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioStreamBasicDescription inFormat,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioChannelLayout inLayout);

    /**
     * AudioQueueOfflineRender</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/AudioQueueReference/index.html#//apple_ref/c/func/AudioQueueOfflineRender">iOS Dev Center</a>
     */
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

    /**
     * AudioSessionInitialize</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/AudioSessionServicesReference/index.html#//apple_ref/c/func/AudioSessionInitialize">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @CFunction
    public static native int AudioSessionInitialize(CFRunLoopRef inRunLoop, CFStringRef inRunLoopMode,
            @FunctionPtr(name = "call_AudioSessionInitialize") Function_AudioSessionInitialize inInterruptionListener,
            VoidPtr inClientData);

    /**
     * AudioSessionSetActive</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/AudioSessionServicesReference/index.html#//apple_ref/c/func/AudioSessionSetActive">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @CFunction
    public static native int AudioSessionSetActive(byte active);

    /**
     * AudioSessionSetActiveWithFlags</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/AudioSessionServicesReference/index.html#//apple_ref/c/func/AudioSessionSetActiveWithFlags">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @CFunction
    public static native int AudioSessionSetActiveWithFlags(byte active, int inFlags);

    /**
     * AudioSessionGetProperty</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/AudioSessionServicesReference/index.html#//apple_ref/c/func/AudioSessionGetProperty">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @CFunction
    public static native int AudioSessionGetProperty(int inID, IntPtr ioDataSize, VoidPtr outData);

    /**
     * AudioSessionSetProperty</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/AudioSessionServicesReference/index.html#//apple_ref/c/func/AudioSessionSetProperty">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @CFunction
    public static native int AudioSessionSetProperty(int inID, int inDataSize, ConstVoidPtr inData);

    /**
     * AudioSessionGetPropertySize</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/AudioSessionServicesReference/index.html#//apple_ref/c/func/AudioSessionGetPropertySize">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @CFunction
    public static native int AudioSessionGetPropertySize(int inID, IntPtr outDataSize);

    /**
     * AudioSessionAddPropertyListener</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/AudioSessionServicesReference/index.html#//apple_ref/c/func/AudioSessionAddPropertyListener">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @CFunction
    public static native int AudioSessionAddPropertyListener(int inID,
            @FunctionPtr(name = "call_AudioSessionAddPropertyListener") Function_AudioSessionAddPropertyListener inProc,
            VoidPtr inClientData);

    /**
     * AudioSessionRemovePropertyListener</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/AudioSessionServicesReference/index.html#//apple_ref/c/func/AudioSessionRemovePropertyListener">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @CFunction
    public static native int AudioSessionRemovePropertyListener(int inID);

    /**
     * AudioSessionRemovePropertyListenerWithUserData</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/AudioSessionServicesReference/index.html#//apple_ref/c/func/AudioSessionRemovePropertyListenerWithUserData">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @CFunction
    public static native int AudioSessionRemovePropertyListenerWithUserData(int inID,
            @FunctionPtr(name = "call_AudioSessionRemovePropertyListenerWithUserData") Function_AudioSessionRemovePropertyListenerWithUserData inProc,
            VoidPtr inClientData);

    /**
     * AudioServicesPlayAlertSound</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/SystemSoundServicesReference/index.html#//apple_ref/c/func/AudioServicesPlayAlertSound">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void AudioServicesPlayAlertSound(int inSystemSoundID);

    /**
     * AudioServicesPlaySystemSound</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/SystemSoundServicesReference/index.html#//apple_ref/c/func/AudioServicesPlaySystemSound">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void AudioServicesPlaySystemSound(int inSystemSoundID);

    /**
     * AudioServicesCreateSystemSoundID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/SystemSoundServicesReference/index.html#//apple_ref/c/func/AudioServicesCreateSystemSoundID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AudioServicesCreateSystemSoundID(CFURLRef inFileURL, IntPtr outSystemSoundID);

    /**
     * AudioServicesDisposeSystemSoundID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/SystemSoundServicesReference/index.html#//apple_ref/c/func/AudioServicesDisposeSystemSoundID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AudioServicesDisposeSystemSoundID(int inSystemSoundID);

    /**
     * AudioServicesAddSystemSoundCompletion</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/SystemSoundServicesReference/index.html#//apple_ref/c/func/AudioServicesAddSystemSoundCompletion">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AudioServicesAddSystemSoundCompletion(int inSystemSoundID, CFRunLoopRef inRunLoop,
            CFStringRef inRunLoopMode,
            @FunctionPtr(name = "call_AudioServicesAddSystemSoundCompletion") Function_AudioServicesAddSystemSoundCompletion inCompletionRoutine,
            VoidPtr inClientData);

    /**
     * AudioServicesRemoveSystemSoundCompletion</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/SystemSoundServicesReference/index.html#//apple_ref/c/func/AudioServicesRemoveSystemSoundCompletion">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void AudioServicesRemoveSystemSoundCompletion(int inSystemSoundID);

    /**
     * AudioServicesGetPropertyInfo</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/SystemSoundServicesReference/index.html#//apple_ref/c/func/AudioServicesGetPropertyInfo">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AudioServicesGetPropertyInfo(int inPropertyID, int inSpecifierSize,
            ConstVoidPtr inSpecifier, IntPtr outPropertyDataSize, BytePtr outWritable);

    /**
     * AudioServicesGetProperty</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/SystemSoundServicesReference/index.html#//apple_ref/c/func/AudioServicesGetProperty">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AudioServicesGetProperty(int inPropertyID, int inSpecifierSize, ConstVoidPtr inSpecifier,
            IntPtr ioPropertyDataSize, VoidPtr outPropertyData);

    /**
     * AudioServicesSetProperty</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/SystemSoundServicesReference/index.html#//apple_ref/c/func/AudioServicesSetProperty">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AudioServicesSetProperty(int inPropertyID, int inSpecifierSize, ConstVoidPtr inSpecifier,
            int inPropertyDataSize, ConstVoidPtr inPropertyData);

    /**
     * NewAUGraph</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/AUGraphServicesReference/index.html#//apple_ref/c/func/NewAUGraph">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int NewAUGraph(Ptr<AUGraph> outGraph);

    /**
     * DisposeAUGraph</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/AUGraphServicesReference/index.html#//apple_ref/c/func/DisposeAUGraph">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int DisposeAUGraph(AUGraph inGraph);

    /**
     * AUGraphAddNode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/AUGraphServicesReference/index.html#//apple_ref/c/func/AUGraphAddNode">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AUGraphAddNode(AUGraph inGraph,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioComponentDescription inDescription,
            IntPtr outNode);

    /**
     * AUGraphRemoveNode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/AUGraphServicesReference/index.html#//apple_ref/c/func/AUGraphRemoveNode">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AUGraphRemoveNode(AUGraph inGraph, int inNode);

    /**
     * AUGraphGetNodeCount</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/AUGraphServicesReference/index.html#//apple_ref/c/func/AUGraphGetNodeCount">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AUGraphGetNodeCount(AUGraph inGraph, IntPtr outNumberOfNodes);

    /**
     * AUGraphGetIndNode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/AUGraphServicesReference/index.html#//apple_ref/c/func/AUGraphGetIndNode">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AUGraphGetIndNode(AUGraph inGraph, int inIndex, IntPtr outNode);

    /**
     * AUGraphNodeInfo</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/AUGraphServicesReference/index.html#//apple_ref/c/func/AUGraphNodeInfo">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AUGraphNodeInfo(AUGraph inGraph, int inNode,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioComponentDescription outDescription,
            Ptr<AudioComponentInstance> outAudioUnit);

    /**
     * AUGraphConnectNodeInput</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/AUGraphServicesReference/index.html#//apple_ref/c/func/AUGraphConnectNodeInput">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AUGraphConnectNodeInput(AUGraph inGraph, int inSourceNode, int inSourceOutputNumber,
            int inDestNode, int inDestInputNumber);

    /**
     * AUGraphSetNodeInputCallback</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/AUGraphServicesReference/index.html#//apple_ref/c/func/AUGraphSetNodeInputCallback">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AUGraphSetNodeInputCallback(AUGraph inGraph, int inDestNode, int inDestInputNumber,
            @UncertainArgument("Options: reference, array Fallback: reference") AURenderCallbackStruct inInputCallback);

    /**
     * AUGraphDisconnectNodeInput</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/AUGraphServicesReference/index.html#//apple_ref/c/func/AUGraphDisconnectNodeInput">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AUGraphDisconnectNodeInput(AUGraph inGraph, int inDestNode, int inDestInputNumber);

    /**
     * AUGraphClearConnections</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/AUGraphServicesReference/index.html#//apple_ref/c/func/AUGraphClearConnections">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AUGraphClearConnections(AUGraph inGraph);

    /**
     * AUGraphGetNumberOfInteractions</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/AUGraphServicesReference/index.html#//apple_ref/c/func/AUGraphGetNumberOfInteractions">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AUGraphGetNumberOfInteractions(AUGraph inGraph, IntPtr outNumInteractions);

    /**
     * AUGraphGetInteractionInfo</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/AUGraphServicesReference/index.html#//apple_ref/c/func/AUGraphGetInteractionInfo">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AUGraphGetInteractionInfo(AUGraph inGraph, int inInteractionIndex, VoidPtr outInteraction);

    /**
     * AUGraphCountNodeInteractions</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/AUGraphServicesReference/index.html#//apple_ref/c/func/AUGraphCountNodeInteractions">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AUGraphCountNodeInteractions(AUGraph inGraph, int inNode, IntPtr outNumInteractions);

    /**
     * AUGraphGetNodeInteractions</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/AUGraphServicesReference/index.html#//apple_ref/c/func/AUGraphGetNodeInteractions">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AUGraphGetNodeInteractions(AUGraph inGraph, int inNode, IntPtr ioNumInteractions,
            VoidPtr outInteractions);

    /**
     * AUGraphUpdate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/AUGraphServicesReference/index.html#//apple_ref/c/func/AUGraphUpdate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AUGraphUpdate(AUGraph inGraph, BytePtr outIsUpdated);

    /**
     * AUGraphOpen</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/AUGraphServicesReference/index.html#//apple_ref/c/func/AUGraphOpen">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AUGraphOpen(AUGraph inGraph);

    /**
     * AUGraphClose</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/AUGraphServicesReference/index.html#//apple_ref/c/func/AUGraphClose">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AUGraphClose(AUGraph inGraph);

    /**
     * AUGraphInitialize</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/AUGraphServicesReference/index.html#//apple_ref/c/func/AUGraphInitialize">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AUGraphInitialize(AUGraph inGraph);

    /**
     * AUGraphUninitialize</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/AUGraphServicesReference/index.html#//apple_ref/c/func/AUGraphUninitialize">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AUGraphUninitialize(AUGraph inGraph);

    /**
     * AUGraphStart</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/AUGraphServicesReference/index.html#//apple_ref/c/func/AUGraphStart">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AUGraphStart(AUGraph inGraph);

    /**
     * AUGraphStop</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/AUGraphServicesReference/index.html#//apple_ref/c/func/AUGraphStop">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AUGraphStop(AUGraph inGraph);

    /**
     * AUGraphIsOpen</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/AUGraphServicesReference/index.html#//apple_ref/c/func/AUGraphIsOpen">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AUGraphIsOpen(AUGraph inGraph, BytePtr outIsOpen);

    /**
     * AUGraphIsInitialized</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/AUGraphServicesReference/index.html#//apple_ref/c/func/AUGraphIsInitialized">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AUGraphIsInitialized(AUGraph inGraph, BytePtr outIsInitialized);

    /**
     * AUGraphIsRunning</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/AUGraphServicesReference/index.html#//apple_ref/c/func/AUGraphIsRunning">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AUGraphIsRunning(AUGraph inGraph, BytePtr outIsRunning);

    /**
     * AUGraphGetCPULoad</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/AUGraphServicesReference/index.html#//apple_ref/c/func/AUGraphGetCPULoad">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AUGraphGetCPULoad(AUGraph inGraph, FloatPtr outAverageCPULoad);

    /**
     * AUGraphGetMaxCPULoad</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/AUGraphServicesReference/index.html#//apple_ref/c/func/AUGraphGetMaxCPULoad">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AUGraphGetMaxCPULoad(AUGraph inGraph, FloatPtr outMaxLoad);

    /**
     * AUGraphAddRenderNotify</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/AUGraphServicesReference/index.html#//apple_ref/c/func/AUGraphAddRenderNotify">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AUGraphAddRenderNotify(AUGraph inGraph,
            @FunctionPtr(name = "call_AUGraphAddRenderNotify") Function_AUGraphAddRenderNotify inCallback,
            VoidPtr inRefCon);

    /**
     * AUGraphRemoveRenderNotify</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/AUGraphServicesReference/index.html#//apple_ref/c/func/AUGraphRemoveRenderNotify">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AUGraphRemoveRenderNotify(AUGraph inGraph,
            @FunctionPtr(name = "call_AUGraphRemoveRenderNotify") Function_AUGraphRemoveRenderNotify inCallback,
            VoidPtr inRefCon);

    /**
     * AudioConverterNew</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/AudioConverterServicesReference/index.html#//apple_ref/c/func/AudioConverterNew">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AudioConverterNew(
            @UncertainArgument("Options: reference, array Fallback: reference") AudioStreamBasicDescription inSourceFormat,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioStreamBasicDescription inDestinationFormat,
            Ptr<AudioConverterRef> outAudioConverter);

    /**
     * AudioConverterNewSpecific</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/AudioConverterServicesReference/index.html#//apple_ref/c/func/AudioConverterNewSpecific">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AudioConverterNewSpecific(
            @UncertainArgument("Options: reference, array Fallback: reference") AudioStreamBasicDescription inSourceFormat,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioStreamBasicDescription inDestinationFormat,
            int inNumberClassDescriptions,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioClassDescription inClassDescriptions,
            Ptr<AudioConverterRef> outAudioConverter);

    /**
     * AudioConverterDispose</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/AudioConverterServicesReference/index.html#//apple_ref/c/func/AudioConverterDispose">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AudioConverterDispose(AudioConverterRef inAudioConverter);

    /**
     * AudioConverterReset</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/AudioConverterServicesReference/index.html#//apple_ref/c/func/AudioConverterReset">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AudioConverterReset(AudioConverterRef inAudioConverter);

    /**
     * AudioConverterGetPropertyInfo</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/AudioConverterServicesReference/index.html#//apple_ref/c/func/AudioConverterGetPropertyInfo">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AudioConverterGetPropertyInfo(AudioConverterRef inAudioConverter, int inPropertyID,
            IntPtr outSize, BytePtr outWritable);

    /**
     * AudioConverterGetProperty</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/AudioConverterServicesReference/index.html#//apple_ref/c/func/AudioConverterGetProperty">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AudioConverterGetProperty(AudioConverterRef inAudioConverter, int inPropertyID,
            IntPtr ioPropertyDataSize, VoidPtr outPropertyData);

    /**
     * AudioConverterSetProperty</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/AudioConverterServicesReference/index.html#//apple_ref/c/func/AudioConverterSetProperty">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AudioConverterSetProperty(AudioConverterRef inAudioConverter, int inPropertyID,
            int inPropertyDataSize, ConstVoidPtr inPropertyData);

    /**
     * AudioConverterConvertBuffer</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/AudioConverterServicesReference/index.html#//apple_ref/c/func/AudioConverterConvertBuffer">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AudioConverterConvertBuffer(AudioConverterRef inAudioConverter, int inInputDataSize,
            ConstVoidPtr inInputData, IntPtr ioOutputDataSize, VoidPtr outOutputData);

    /**
     * AudioConverterFillComplexBuffer</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/AudioConverterServicesReference/index.html#//apple_ref/c/func/AudioConverterFillComplexBuffer">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AudioConverterFillComplexBuffer(AudioConverterRef inAudioConverter,
            @FunctionPtr(name = "call_AudioConverterFillComplexBuffer") Function_AudioConverterFillComplexBuffer inInputDataProc,
            VoidPtr inInputDataProcUserData, IntPtr ioOutputDataPacketSize,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioBufferList outOutputData,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioStreamPacketDescription outPacketDescription);

    /**
     * AudioConverterConvertComplexBuffer</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/AudioConverterServicesReference/index.html#//apple_ref/c/func/AudioConverterConvertComplexBuffer">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int AudioConverterConvertComplexBuffer(AudioConverterRef inAudioConverter,
            int inNumberPCMFrames,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioBufferList inInputData,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioBufferList outOutputData);

    /**
     * ExtAudioFileOpenURL</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/ExtendedAudioFileServicesReference/index.html#//apple_ref/c/func/ExtAudioFileOpenURL">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int ExtAudioFileOpenURL(CFURLRef inURL, Ptr<ExtAudioFileRef> outExtAudioFile);

    /**
     * ExtAudioFileWrapAudioFileID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/ExtendedAudioFileServicesReference/index.html#//apple_ref/c/func/ExtAudioFileWrapAudioFileID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int ExtAudioFileWrapAudioFileID(AudioFileID inFileID, byte inForWriting,
            Ptr<ExtAudioFileRef> outExtAudioFile);

    /**
     * ExtAudioFileCreateWithURL</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/ExtendedAudioFileServicesReference/index.html#//apple_ref/c/func/ExtAudioFileCreateWithURL">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int ExtAudioFileCreateWithURL(CFURLRef inURL, int inFileType,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioStreamBasicDescription inStreamDesc,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioChannelLayout inChannelLayout,
            int inFlags, Ptr<ExtAudioFileRef> outExtAudioFile);

    /**
     * ExtAudioFileDispose</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/ExtendedAudioFileServicesReference/index.html#//apple_ref/c/func/ExtAudioFileDispose">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int ExtAudioFileDispose(ExtAudioFileRef inExtAudioFile);

    /**
     * ExtAudioFileRead</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/ExtendedAudioFileServicesReference/index.html#//apple_ref/c/func/ExtAudioFileRead">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int ExtAudioFileRead(ExtAudioFileRef inExtAudioFile, IntPtr ioNumberFrames,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioBufferList ioData);

    /**
     * ExtAudioFileWrite</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/ExtendedAudioFileServicesReference/index.html#//apple_ref/c/func/ExtAudioFileWrite">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int ExtAudioFileWrite(ExtAudioFileRef inExtAudioFile, int inNumberFrames,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioBufferList ioData);

    /**
     * ExtAudioFileWriteAsync</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/ExtendedAudioFileServicesReference/index.html#//apple_ref/c/func/ExtAudioFileWriteAsync">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int ExtAudioFileWriteAsync(ExtAudioFileRef inExtAudioFile, int inNumberFrames,
            @UncertainArgument("Options: reference, array Fallback: reference") AudioBufferList ioData);

    /**
     * ExtAudioFileSeek</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/ExtendedAudioFileServicesReference/index.html#//apple_ref/c/func/ExtAudioFileSeek">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int ExtAudioFileSeek(ExtAudioFileRef inExtAudioFile, long inFrameOffset);

    /**
     * ExtAudioFileTell</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/ExtendedAudioFileServicesReference/index.html#//apple_ref/c/func/ExtAudioFileTell">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int ExtAudioFileTell(ExtAudioFileRef inExtAudioFile, LongPtr outFrameOffset);

    /**
     * ExtAudioFileGetPropertyInfo</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/ExtendedAudioFileServicesReference/index.html#//apple_ref/c/func/ExtAudioFileGetPropertyInfo">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int ExtAudioFileGetPropertyInfo(ExtAudioFileRef inExtAudioFile, int inPropertyID,
            IntPtr outSize, BytePtr outWritable);

    /**
     * ExtAudioFileGetProperty</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/ExtendedAudioFileServicesReference/index.html#//apple_ref/c/func/ExtAudioFileGetProperty">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int ExtAudioFileGetProperty(ExtAudioFileRef inExtAudioFile, int inPropertyID,
            IntPtr ioPropertyDataSize, VoidPtr outPropertyData);

    /**
     * ExtAudioFileSetProperty</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MusicAudio/Reference/ExtendedAudioFileServicesReference/index.html#//apple_ref/c/func/ExtAudioFileSetProperty">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int ExtAudioFileSetProperty(ExtAudioFileRef inExtAudioFile, int inPropertyID,
            int inPropertyDataSize, ConstVoidPtr inPropertyData);

    /**
     * NewMusicPlayer</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/MusicPlayerServices_Reference/index.html#//apple_ref/c/func/NewMusicPlayer">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int NewMusicPlayer(Ptr<MusicPlayer> outPlayer);

    /**
     * DisposeMusicPlayer</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/MusicPlayerServices_Reference/index.html#//apple_ref/c/func/DisposeMusicPlayer">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int DisposeMusicPlayer(MusicPlayer inPlayer);

    /**
     * MusicPlayerSetSequence</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/MusicPlayerServices_Reference/index.html#//apple_ref/c/func/MusicPlayerSetSequence">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int MusicPlayerSetSequence(MusicPlayer inPlayer, MusicSequence inSequence);

    /**
     * MusicPlayerGetSequence</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/MusicPlayerServices_Reference/index.html#//apple_ref/c/func/MusicPlayerGetSequence">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int MusicPlayerGetSequence(MusicPlayer inPlayer, Ptr<MusicSequence> outSequence);

    /**
     * MusicPlayerSetTime</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/MusicPlayerServices_Reference/index.html#//apple_ref/c/func/MusicPlayerSetTime">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int MusicPlayerSetTime(MusicPlayer inPlayer, double inTime);

    /**
     * MusicPlayerGetTime</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/MusicPlayerServices_Reference/index.html#//apple_ref/c/func/MusicPlayerGetTime">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int MusicPlayerGetTime(MusicPlayer inPlayer, DoublePtr outTime);

    /**
     * MusicPlayerGetHostTimeForBeats</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/MusicPlayerServices_Reference/index.html#//apple_ref/c/func/MusicPlayerGetHostTimeForBeats">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int MusicPlayerGetHostTimeForBeats(MusicPlayer inPlayer, double inBeats, LongPtr outHostTime);

    /**
     * MusicPlayerGetBeatsForHostTime</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/MusicPlayerServices_Reference/index.html#//apple_ref/c/func/MusicPlayerGetBeatsForHostTime">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int MusicPlayerGetBeatsForHostTime(MusicPlayer inPlayer, long inHostTime, DoublePtr outBeats);

    /**
     * MusicPlayerPreroll</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/MusicPlayerServices_Reference/index.html#//apple_ref/c/func/MusicPlayerPreroll">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int MusicPlayerPreroll(MusicPlayer inPlayer);

    /**
     * MusicPlayerStart</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/MusicPlayerServices_Reference/index.html#//apple_ref/c/func/MusicPlayerStart">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int MusicPlayerStart(MusicPlayer inPlayer);

    /**
     * MusicPlayerStop</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/MusicPlayerServices_Reference/index.html#//apple_ref/c/func/MusicPlayerStop">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int MusicPlayerStop(MusicPlayer inPlayer);

    /**
     * MusicPlayerIsPlaying</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/MusicPlayerServices_Reference/index.html#//apple_ref/c/func/MusicPlayerIsPlaying">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int MusicPlayerIsPlaying(MusicPlayer inPlayer, BytePtr outIsPlaying);

    /**
     * MusicPlayerSetPlayRateScalar</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/MusicPlayerServices_Reference/index.html#//apple_ref/c/func/MusicPlayerSetPlayRateScalar">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int MusicPlayerSetPlayRateScalar(MusicPlayer inPlayer, double inScaleRate);

    /**
     * MusicPlayerGetPlayRateScalar</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/MusicPlayerServices_Reference/index.html#//apple_ref/c/func/MusicPlayerGetPlayRateScalar">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int MusicPlayerGetPlayRateScalar(MusicPlayer inPlayer, DoublePtr outScaleRate);

    /**
     * NewMusicSequence</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/MusicSequence_Reference/index.html#//apple_ref/c/func/NewMusicSequence">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int NewMusicSequence(Ptr<MusicSequence> outSequence);

    /**
     * DisposeMusicSequence</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/MusicSequence_Reference/index.html#//apple_ref/c/func/DisposeMusicSequence">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int DisposeMusicSequence(MusicSequence inSequence);

    /**
     * MusicSequenceNewTrack</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/MusicSequence_Reference/index.html#//apple_ref/c/func/MusicSequenceNewTrack">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int MusicSequenceNewTrack(MusicSequence inSequence, Ptr<MusicTrack> outTrack);

    /**
     * MusicSequenceDisposeTrack</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/MusicSequence_Reference/index.html#//apple_ref/c/func/MusicSequenceDisposeTrack">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int MusicSequenceDisposeTrack(MusicSequence inSequence, MusicTrack inTrack);

    /**
     * MusicSequenceGetTrackCount</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/MusicSequence_Reference/index.html#//apple_ref/c/func/MusicSequenceGetTrackCount">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int MusicSequenceGetTrackCount(MusicSequence inSequence, IntPtr outNumberOfTracks);

    /**
     * MusicSequenceGetIndTrack</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/MusicSequence_Reference/index.html#//apple_ref/c/func/MusicSequenceGetIndTrack">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int MusicSequenceGetIndTrack(MusicSequence inSequence, int inTrackIndex,
            Ptr<MusicTrack> outTrack);

    /**
     * MusicSequenceGetTrackIndex</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/MusicSequence_Reference/index.html#//apple_ref/c/func/MusicSequenceGetTrackIndex">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int MusicSequenceGetTrackIndex(MusicSequence inSequence, MusicTrack inTrack,
            IntPtr outTrackIndex);

    /**
     * MusicSequenceGetTempoTrack</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/MusicSequence_Reference/index.html#//apple_ref/c/func/MusicSequenceGetTempoTrack">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int MusicSequenceGetTempoTrack(MusicSequence inSequence, Ptr<MusicTrack> outTrack);

    /**
     * MusicSequenceSetAUGraph</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/MusicSequence_Reference/index.html#//apple_ref/c/func/MusicSequenceSetAUGraph">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int MusicSequenceSetAUGraph(MusicSequence inSequence, AUGraph inGraph);

    /**
     * MusicSequenceGetAUGraph</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/MusicSequence_Reference/index.html#//apple_ref/c/func/MusicSequenceGetAUGraph">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int MusicSequenceGetAUGraph(MusicSequence inSequence, Ptr<AUGraph> outGraph);

    /**
     * MusicSequenceSetMIDIEndpoint</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/MusicSequence_Reference/index.html#//apple_ref/c/func/MusicSequenceSetMIDIEndpoint">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int MusicSequenceSetMIDIEndpoint(MusicSequence inSequence, int inEndpoint);

    /**
     * MusicSequenceSetSequenceType</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/MusicSequence_Reference/index.html#//apple_ref/c/func/MusicSequenceSetSequenceType">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int MusicSequenceSetSequenceType(MusicSequence inSequence, int inType);

    /**
     * MusicSequenceGetSequenceType</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/MusicSequence_Reference/index.html#//apple_ref/c/func/MusicSequenceGetSequenceType">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int MusicSequenceGetSequenceType(MusicSequence inSequence, IntPtr outType);

    /**
     * MusicSequenceFileLoad</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/MusicSequence_Reference/index.html#//apple_ref/c/func/MusicSequenceFileLoad">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int MusicSequenceFileLoad(MusicSequence inSequence, CFURLRef inFileRef, int inFileTypeHint,
            int inFlags);

    /**
     * MusicSequenceFileLoadData</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/MusicSequence_Reference/index.html#//apple_ref/c/func/MusicSequenceFileLoadData">iOS Dev Center</a>
     */
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

    /**
     * MusicSequenceFileCreate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/MusicSequence_Reference/index.html#//apple_ref/c/func/MusicSequenceFileCreate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int MusicSequenceFileCreate(MusicSequence inSequence, CFURLRef inFileRef, int inFileType,
            int inFlags, short inResolution);

    /**
     * MusicSequenceFileCreateData</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/MusicSequence_Reference/index.html#//apple_ref/c/func/MusicSequenceFileCreateData">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int MusicSequenceFileCreateData(MusicSequence inSequence, int inFileType, int inFlags,
            short inResolution, Ptr<CFDataRef> outData);

    /**
     * MusicSequenceReverse</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/MusicSequence_Reference/index.html#//apple_ref/c/func/MusicSequenceReverse">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int MusicSequenceReverse(MusicSequence inSequence);

    /**
     * MusicSequenceGetSecondsForBeats</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/MusicSequence_Reference/index.html#//apple_ref/c/func/MusicSequenceGetSecondsForBeats">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int MusicSequenceGetSecondsForBeats(MusicSequence inSequence, double inBeats,
            DoublePtr outSeconds);

    /**
     * MusicSequenceGetBeatsForSeconds</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/MusicSequence_Reference/index.html#//apple_ref/c/func/MusicSequenceGetBeatsForSeconds">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int MusicSequenceGetBeatsForSeconds(MusicSequence inSequence, double inSeconds,
            DoublePtr outBeats);

    /**
     * MusicSequenceSetUserCallback</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/MusicSequence_Reference/index.html#//apple_ref/c/func/MusicSequenceSetUserCallback">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int MusicSequenceSetUserCallback(MusicSequence inSequence,
            @FunctionPtr(name = "call_MusicSequenceSetUserCallback") Function_MusicSequenceSetUserCallback inCallback,
            VoidPtr inClientData);

    /**
     * MusicSequenceBeatsToBarBeatTime</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/MusicSequence_Reference/index.html#//apple_ref/c/func/MusicSequenceBeatsToBarBeatTime">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int MusicSequenceBeatsToBarBeatTime(MusicSequence inSequence, double inBeats,
            int inSubbeatDivisor,
            @UncertainArgument("Options: reference, array Fallback: reference") CABarBeatTime outBarBeatTime);

    /**
     * MusicSequenceBarBeatTimeToBeats</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/MusicSequence_Reference/index.html#//apple_ref/c/func/MusicSequenceBarBeatTimeToBeats">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int MusicSequenceBarBeatTimeToBeats(MusicSequence inSequence,
            @UncertainArgument("Options: reference, array Fallback: reference") CABarBeatTime inBarBeatTime,
            DoublePtr outBeats);

    /**
     * MusicSequenceGetInfoDictionary</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/MusicSequence_Reference/index.html#//apple_ref/c/func/MusicSequenceGetInfoDictionary">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFDictionaryRef MusicSequenceGetInfoDictionary(MusicSequence inSequence);

    /**
     * MusicTrackGetSequence</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/MusicTrack_Reference/index.html#//apple_ref/c/func/MusicTrackGetSequence">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int MusicTrackGetSequence(MusicTrack inTrack, Ptr<MusicSequence> outSequence);

    /**
     * MusicTrackSetDestNode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/MusicTrack_Reference/index.html#//apple_ref/c/func/MusicTrackSetDestNode">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int MusicTrackSetDestNode(MusicTrack inTrack, int inNode);

    /**
     * MusicTrackSetDestMIDIEndpoint</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/MusicTrack_Reference/index.html#//apple_ref/c/func/MusicTrackSetDestMIDIEndpoint">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int MusicTrackSetDestMIDIEndpoint(MusicTrack inTrack, int inEndpoint);

    /**
     * MusicTrackGetDestNode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/MusicTrack_Reference/index.html#//apple_ref/c/func/MusicTrackGetDestNode">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int MusicTrackGetDestNode(MusicTrack inTrack, IntPtr outNode);

    /**
     * MusicTrackGetDestMIDIEndpoint</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/MusicTrack_Reference/index.html#//apple_ref/c/func/MusicTrackGetDestMIDIEndpoint">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int MusicTrackGetDestMIDIEndpoint(MusicTrack inTrack, IntPtr outEndpoint);

    /**
     * MusicTrackSetProperty</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/MusicTrack_Reference/index.html#//apple_ref/c/func/MusicTrackSetProperty">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int MusicTrackSetProperty(MusicTrack inTrack, int inPropertyID, VoidPtr inData, int inLength);

    /**
     * MusicTrackGetProperty</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/MusicTrack_Reference/index.html#//apple_ref/c/func/MusicTrackGetProperty">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int MusicTrackGetProperty(MusicTrack inTrack, int inPropertyID, VoidPtr outData,
            IntPtr ioLength);

    /**
     * MusicTrackMoveEvents</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/MusicTrack_Reference/index.html#//apple_ref/c/func/MusicTrackMoveEvents">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int MusicTrackMoveEvents(MusicTrack inTrack, double inStartTime, double inEndTime,
            double inMoveTime);

    /**
     * MusicTrackClear</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/MusicTrack_Reference/index.html#//apple_ref/c/func/MusicTrackClear">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int MusicTrackClear(MusicTrack inTrack, double inStartTime, double inEndTime);

    /**
     * MusicTrackCut</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/MusicTrack_Reference/index.html#//apple_ref/c/func/MusicTrackCut">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int MusicTrackCut(MusicTrack inTrack, double inStartTime, double inEndTime);

    /**
     * MusicTrackCopyInsert</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/MusicTrack_Reference/index.html#//apple_ref/c/func/MusicTrackCopyInsert">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int MusicTrackCopyInsert(MusicTrack inSourceTrack, double inSourceStartTime,
            double inSourceEndTime, MusicTrack inDestTrack, double inDestInsertTime);

    /**
     * MusicTrackMerge</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/MusicTrack_Reference/index.html#//apple_ref/c/func/MusicTrackMerge">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int MusicTrackMerge(MusicTrack inSourceTrack, double inSourceStartTime, double inSourceEndTime,
            MusicTrack inDestTrack, double inDestInsertTime);

    /**
     * MusicTrackNewMIDINoteEvent</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/MusicTrack_Reference/index.html#//apple_ref/c/func/MusicTrackNewMIDINoteEvent">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int MusicTrackNewMIDINoteEvent(MusicTrack inTrack, double inTimeStamp,
            @UncertainArgument("Options: reference, array Fallback: reference") MIDINoteMessage inMessage);

    /**
     * MusicTrackNewMIDIChannelEvent</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/MusicTrack_Reference/index.html#//apple_ref/c/func/MusicTrackNewMIDIChannelEvent">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int MusicTrackNewMIDIChannelEvent(MusicTrack inTrack, double inTimeStamp,
            @UncertainArgument("Options: reference, array Fallback: reference") MIDIChannelMessage inMessage);

    /**
     * MusicTrackNewMIDIRawDataEvent</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/MusicTrack_Reference/index.html#//apple_ref/c/func/MusicTrackNewMIDIRawDataEvent">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int MusicTrackNewMIDIRawDataEvent(MusicTrack inTrack, double inTimeStamp,
            @UncertainArgument("Options: reference, array Fallback: reference") MIDIRawData inRawData);

    /**
     * MusicTrackNewExtendedNoteEvent</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/MusicTrack_Reference/index.html#//apple_ref/c/func/MusicTrackNewExtendedNoteEvent">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int MusicTrackNewExtendedNoteEvent(MusicTrack inTrack, double inTimeStamp,
            @UncertainArgument("Options: reference, array Fallback: reference") ExtendedNoteOnEvent inInfo);

    /**
     * MusicTrackNewParameterEvent</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/MusicTrack_Reference/index.html#//apple_ref/c/func/MusicTrackNewParameterEvent">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int MusicTrackNewParameterEvent(MusicTrack inTrack, double inTimeStamp,
            @UncertainArgument("Options: reference, array Fallback: reference") ParameterEvent inInfo);

    /**
     * MusicTrackNewExtendedTempoEvent</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/MusicTrack_Reference/index.html#//apple_ref/c/func/MusicTrackNewExtendedTempoEvent">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int MusicTrackNewExtendedTempoEvent(MusicTrack inTrack, double inTimeStamp, double inBPM);

    /**
     * MusicTrackNewMetaEvent</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/MusicTrack_Reference/index.html#//apple_ref/c/func/MusicTrackNewMetaEvent">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int MusicTrackNewMetaEvent(MusicTrack inTrack, double inTimeStamp,
            @UncertainArgument("Options: reference, array Fallback: reference") MIDIMetaEvent inMetaEvent);

    /**
     * MusicTrackNewUserEvent</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/MusicTrack_Reference/index.html#//apple_ref/c/func/MusicTrackNewUserEvent">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int MusicTrackNewUserEvent(MusicTrack inTrack, double inTimeStamp,
            @UncertainArgument("Options: reference, array Fallback: reference") MusicEventUserData inUserData);

    /**
     * MusicTrackNewAUPresetEvent</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/MusicTrack_Reference/index.html#//apple_ref/c/func/MusicTrackNewAUPresetEvent">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int MusicTrackNewAUPresetEvent(MusicTrack inTrack, double inTimeStamp,
            @UncertainArgument("Options: reference, array Fallback: reference") AUPresetEvent inPresetEvent);

    /**
     * NewMusicEventIterator</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/MusicEventIterator_Reference/index.html#//apple_ref/c/func/NewMusicEventIterator">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int NewMusicEventIterator(MusicTrack inTrack, Ptr<MusicEventIterator> outIterator);

    /**
     * DisposeMusicEventIterator</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/MusicEventIterator_Reference/index.html#//apple_ref/c/func/DisposeMusicEventIterator">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int DisposeMusicEventIterator(MusicEventIterator inIterator);

    /**
     * MusicEventIteratorSeek</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/MusicEventIterator_Reference/index.html#//apple_ref/c/func/MusicEventIteratorSeek">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int MusicEventIteratorSeek(MusicEventIterator inIterator, double inTimeStamp);

    /**
     * MusicEventIteratorNextEvent</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/MusicEventIterator_Reference/index.html#//apple_ref/c/func/MusicEventIteratorNextEvent">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int MusicEventIteratorNextEvent(MusicEventIterator inIterator);

    /**
     * MusicEventIteratorPreviousEvent</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/MusicEventIterator_Reference/index.html#//apple_ref/c/func/MusicEventIteratorPreviousEvent">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int MusicEventIteratorPreviousEvent(MusicEventIterator inIterator);

    /**
     * MusicEventIteratorGetEventInfo</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/MusicEventIterator_Reference/index.html#//apple_ref/c/func/MusicEventIteratorGetEventInfo">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int MusicEventIteratorGetEventInfo(MusicEventIterator inIterator, DoublePtr outTimeStamp,
            IntPtr outEventType, Ptr<ConstVoidPtr> outEventData, IntPtr outEventDataSize);

    /**
     * MusicEventIteratorSetEventInfo</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/MusicEventIterator_Reference/index.html#//apple_ref/c/func/MusicEventIteratorSetEventInfo">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int MusicEventIteratorSetEventInfo(MusicEventIterator inIterator, int inEventType,
            ConstVoidPtr inEventData);

    /**
     * MusicEventIteratorSetEventTime</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/MusicEventIterator_Reference/index.html#//apple_ref/c/func/MusicEventIteratorSetEventTime">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int MusicEventIteratorSetEventTime(MusicEventIterator inIterator, double inTimeStamp);

    /**
     * MusicEventIteratorDeleteEvent</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/MusicEventIterator_Reference/index.html#//apple_ref/c/func/MusicEventIteratorDeleteEvent">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int MusicEventIteratorDeleteEvent(MusicEventIterator inIterator);

    /**
     * MusicEventIteratorHasPreviousEvent</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/MusicEventIterator_Reference/index.html#//apple_ref/c/func/MusicEventIteratorHasPreviousEvent">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int MusicEventIteratorHasPreviousEvent(MusicEventIterator inIterator, BytePtr outHasPrevEvent);

    /**
     * MusicEventIteratorHasNextEvent</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/MusicEventIterator_Reference/index.html#//apple_ref/c/func/MusicEventIteratorHasNextEvent">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int MusicEventIteratorHasNextEvent(MusicEventIterator inIterator, BytePtr outHasNextEvent);

    /**
     * MusicEventIteratorHasCurrentEvent</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/MusicEventIterator_Reference/index.html#//apple_ref/c/func/MusicEventIteratorHasCurrentEvent">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int MusicEventIteratorHasCurrentEvent(MusicEventIterator inIterator, BytePtr outHasCurEvent);

    /**
     * CAShow</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/AudioToolboxDebuggingReference/index.html#//apple_ref/c/func/CAShow">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CAShow(VoidPtr inObject);

    /**
     * CAShowFile</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/AudioToolboxDebuggingReference/index.html#//apple_ref/c/func/CAShowFile">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CAShowFile(VoidPtr inObject,
            @UncertainArgument("Options: reference, array Fallback: reference") FILE inFile);

    /**
     * CopyNameFromSoundBank</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioToolbox/Reference/AudioToolboxDebuggingReference/index.html#//apple_ref/c/func/CopyNameFromSoundBank">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CopyNameFromSoundBank(CFURLRef inURL, Ptr<CFStringRef> outName);

    @Generated
    @CFunction
    public static native int CopyInstrumentInfoFromSoundBank(CFURLRef inURL, Ptr<CFArrayRef> outInstrumentInfo);

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
    public static native void AudioServicesPlayAlertSoundWithCompletion(int inSystemSoundID,
            @ObjCBlock(name = "call_AudioServicesPlayAlertSoundWithCompletion") Block_AudioServicesPlayAlertSoundWithCompletion inCompletionBlock);

    @Generated
    @CFunction
    public static native void AudioServicesPlaySystemSoundWithCompletion(int inSystemSoundID,
            @ObjCBlock(name = "call_AudioServicesPlaySystemSoundWithCompletion") Block_AudioServicesPlaySystemSoundWithCompletion inCompletionBlock);

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
        void call_AudioFileStreamOpen_1(VoidPtr arg0, VoidPtr arg1, int arg2, IntPtr arg3);
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
        void call_AudioQueueNewOutput(VoidPtr arg0, VoidPtr arg1, AudioQueueBuffer arg2);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_AudioQueueNewInput {
        @Generated
        void call_AudioQueueNewInput(VoidPtr arg0, VoidPtr arg1, AudioQueueBuffer arg2, AudioTimeStamp arg3, int arg4,
                @ReferenceInfo(type = AudioStreamPacketDescription.class) ConstPtr<AudioStreamPacketDescription> arg5);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_AudioQueueAddPropertyListener {
        @Generated
        void call_AudioQueueAddPropertyListener(VoidPtr arg0, VoidPtr arg1, int arg2);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_AudioQueueRemovePropertyListener {
        @Generated
        void call_AudioQueueRemovePropertyListener(VoidPtr arg0, VoidPtr arg1, int arg2);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_AudioQueueProcessingTapNew {
        @Generated
        void call_AudioQueueProcessingTapNew(VoidPtr arg0, VoidPtr arg1, int arg2,
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
    public interface Function_AudioServicesAddSystemSoundCompletion {
        @Generated
        void call_AudioServicesAddSystemSoundCompletion(int arg0, VoidPtr arg1);
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
        int call_AudioConverterFillComplexBuffer(VoidPtr arg0, IntPtr arg1,
                @UncertainArgument("Options: reference, array Fallback: reference") AudioBufferList arg2,
                @ReferenceInfo(type = AudioStreamPacketDescription.class, depth = 2) Ptr<Ptr<AudioStreamPacketDescription>> arg3,
                VoidPtr arg4);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_MusicSequenceSetUserCallback {
        @Generated
        void call_MusicSequenceSetUserCallback(VoidPtr arg0, VoidPtr arg1, VoidPtr arg2, double arg3,
                @UncertainArgument("Options: reference, array Fallback: reference") MusicEventUserData arg4,
                double arg5, double arg6);
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
}
