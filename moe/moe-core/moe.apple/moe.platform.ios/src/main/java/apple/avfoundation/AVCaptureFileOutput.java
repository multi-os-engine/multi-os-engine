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

package apple.avfoundation;

import apple.NSObject;
import apple.avfoundation.protocol.AVCaptureFileOutputRecordingDelegate;
import apple.coremedia.struct.CMTime;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * AVCaptureFileOutput
 * 
 * AVCaptureFileOutput is an abstract subclass of AVCaptureOutput that provides an interface for writing captured media
 * to files.
 * 
 * This abstract superclass defines the interface for outputs that record media samples to files. File outputs can start
 * recording to a new file using the startRecordingToOutputFileURL:recordingDelegate: method. On successive invocations
 * of this method on macOS, the output file can by changed dynamically without losing media samples. A file output can
 * stop recording using the stopRecording method. Because files are recorded in the background, applications will need
 * to specify a delegate for each new file so that they can be notified when recorded files are finished.
 * 
 * On macOS, clients can also set a delegate on the file output itself that can be used to control recording along exact
 * media sample boundaries using the captureOutput:didOutputSampleBuffer:fromConnection: method.
 * 
 * The concrete subclasses of AVCaptureFileOutput are AVCaptureMovieFileOutput, which records media to a QuickTime movie
 * file, and AVCaptureAudioFileOutput, which writes audio media to a variety of audio file formats.
 * 
 * API-Since: 4.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVCaptureFileOutput extends AVCaptureOutput {
    static {
        NatJ.register();
    }

    @Generated
    protected AVCaptureFileOutput(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVCaptureFileOutput alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVCaptureFileOutput allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("instanceMethodForSelector:")
    @FunctionPtr(name = "call_instanceMethodForSelector_ret")
    public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

    @Generated
    @Selector("instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector(SEL aSelector);

    @Generated
    @Selector("instancesRespondToSelector:")
    public static native boolean instancesRespondToSelector(SEL aSelector);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native AVCaptureFileOutput new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("init")
    public native AVCaptureFileOutput init();

    /**
     * [@property] recording
     * 
     * Indicates whether the receiver is currently recording.
     * 
     * The value of this property is YES when the receiver currently has a file to which it is writing new samples, NO
     * otherwise.
     */
    @Generated
    @Selector("isRecording")
    public native boolean isRecording();

    /**
     * [@property] maxRecordedDuration
     * 
     * Specifies the maximum duration of the media that should be recorded by the receiver.
     * 
     * This property specifies a hard limit on the duration of recorded files. Recording is stopped when the limit is
     * reached and the captureOutput:didFinishRecordingToOutputFileAtURL:fromConnections:error: delegate method is
     * invoked with an appropriate error. The default value of this property is kCMTimeInvalid, which indicates no
     * limit.
     */
    @Generated
    @Selector("maxRecordedDuration")
    @ByValue
    public native CMTime maxRecordedDuration();

    /**
     * [@property] maxRecordedFileSize
     * 
     * Specifies the maximum size, in bytes, of the data that should be recorded by the receiver.
     * 
     * This property specifies a hard limit on the data size of recorded files. Recording is stopped when the limit is
     * reached and the captureOutput:didFinishRecordingToOutputFileAtURL:fromConnections:error: delegate method is
     * invoked with an appropriate error. The default value of this property is 0, which indicates no limit.
     */
    @Generated
    @Selector("maxRecordedFileSize")
    public native long maxRecordedFileSize();

    /**
     * [@property] minFreeDiskSpaceLimit
     * 
     * Specifies the minimum amount of free space, in bytes, required for recording to continue on a given volume.
     * 
     * This property specifies a hard lower limit on the amount of free space that must remain on a target volume for
     * recording to continue. Recording is stopped when the limit is reached and the
     * captureOutput:didFinishRecordingToOutputFileAtURL:fromConnections:error: delegate method is invoked with an
     * appropriate error.
     */
    @Generated
    @Selector("minFreeDiskSpaceLimit")
    public native long minFreeDiskSpaceLimit();

    /**
     * [@property] outputFileURL
     * 
     * The file URL of the file to which the receiver is currently recording incoming buffers.
     * 
     * The value of this property is an NSURL object containing the file URL of the file currently being written by the
     * receiver. Returns nil if the receiver is not recording to any file.
     */
    @Nullable
    @Generated
    @Selector("outputFileURL")
    public native NSURL outputFileURL();

    /**
     * [@property] recordedDuration
     * 
     * Indicates the duration of the media recorded to the current output file.
     * 
     * If recording is in progress, this property returns the total time recorded so far.
     */
    @Generated
    @Selector("recordedDuration")
    @ByValue
    public native CMTime recordedDuration();

    /**
     * [@property] recordedFileSize
     * 
     * Indicates the size, in bytes, of the data recorded to the current output file.
     * 
     * If a recording is in progress, this property returns the size in bytes of the data recorded so far.
     */
    @Generated
    @Selector("recordedFileSize")
    public native long recordedFileSize();

    /**
     * [@property] maxRecordedDuration
     * 
     * Specifies the maximum duration of the media that should be recorded by the receiver.
     * 
     * This property specifies a hard limit on the duration of recorded files. Recording is stopped when the limit is
     * reached and the captureOutput:didFinishRecordingToOutputFileAtURL:fromConnections:error: delegate method is
     * invoked with an appropriate error. The default value of this property is kCMTimeInvalid, which indicates no
     * limit.
     */
    @Generated
    @Selector("setMaxRecordedDuration:")
    public native void setMaxRecordedDuration(@ByValue CMTime value);

    /**
     * [@property] maxRecordedFileSize
     * 
     * Specifies the maximum size, in bytes, of the data that should be recorded by the receiver.
     * 
     * This property specifies a hard limit on the data size of recorded files. Recording is stopped when the limit is
     * reached and the captureOutput:didFinishRecordingToOutputFileAtURL:fromConnections:error: delegate method is
     * invoked with an appropriate error. The default value of this property is 0, which indicates no limit.
     */
    @Generated
    @Selector("setMaxRecordedFileSize:")
    public native void setMaxRecordedFileSize(long value);

    /**
     * [@property] minFreeDiskSpaceLimit
     * 
     * Specifies the minimum amount of free space, in bytes, required for recording to continue on a given volume.
     * 
     * This property specifies a hard lower limit on the amount of free space that must remain on a target volume for
     * recording to continue. Recording is stopped when the limit is reached and the
     * captureOutput:didFinishRecordingToOutputFileAtURL:fromConnections:error: delegate method is invoked with an
     * appropriate error.
     */
    @Generated
    @Selector("setMinFreeDiskSpaceLimit:")
    public native void setMinFreeDiskSpaceLimit(long value);

    /**
     * startRecordingToOutputFileURL:recordingDelegate:
     * 
     * Tells the receiver to start recording to a new file, and specifies a delegate that will be notified when
     * recording is finished.
     * 
     * The method sets the file URL to which the receiver is currently writing output media. If a file at the given URL
     * already exists when capturing starts, recording to the new file will fail.
     * 
     * Clients need not call stopRecording before calling this method while another recording is in progress. On macOS,
     * if this method is invoked while an existing output file was already being recorded, no media samples will be
     * discarded between the old file and the new file.
     * 
     * When recording is stopped either by calling stopRecording, by changing files using this method, or because of an
     * error, the remaining data that needs to be included to the file will be written in the background. Therefore,
     * clients must specify a delegate that will be notified when all data has been written to the file using the
     * captureOutput:didFinishRecordingToOutputFileAtURL:fromConnections:error: method. The recording delegate can also
     * optionally implement methods that inform it when data starts being written, when recording is paused and resumed,
     * and when recording is about to be finished.
     * 
     * On macOS, if this method is called within the captureOutput:didOutputSampleBuffer:fromConnection: delegate
     * method, the first samples written to the new file are guaranteed to be those contained in the sample buffer
     * passed to that method.
     * 
     * Note: AVCaptureAudioFileOutput does not support -startRecordingToOutputFileURL:recordingDelegate:. Use
     * -startRecordingToOutputFileURL:outputFileType:recordingDelegate: instead.
     * 
     * @param outputFileURL
     *                      An NSURL object containing the URL of the output file. This method throws an
     *                      NSInvalidArgumentException if the URL is not a valid file URL.
     * @param delegate
     *                      An object conforming to the AVCaptureFileOutputRecordingDelegate protocol. Clients must
     *                      specify a delegate so that they can be notified when recording to the given URL is finished.
     */
    @Generated
    @Selector("startRecordingToOutputFileURL:recordingDelegate:")
    public native void startRecordingToOutputFileURLRecordingDelegate(@NotNull NSURL outputFileURL,
            @NotNull @Mapped(ObjCObjectMapper.class) AVCaptureFileOutputRecordingDelegate delegate);

    /**
     * stopRecording
     * 
     * Tells the receiver to stop recording to the current file.
     * 
     * Clients can call this method when they want to stop recording new samples to the current file, and do not want to
     * continue recording to another file. Clients that want to switch from one file to another should not call this
     * method. Instead they should simply call startRecordingToOutputFileURL:recordingDelegate: with the new file URL.
     * 
     * When recording is stopped either by calling this method, by changing files using
     * startRecordingToOutputFileURL:recordingDelegate:, or because of an error, the remaining data that needs to be
     * included to the file will be written in the background. Therefore, before using the file, clients must wait until
     * the delegate that was specified in startRecordingToOutputFileURL:recordingDelegate: is notified when all data has
     * been written to the file using the captureOutput:didFinishRecordingToOutputFileAtURL:fromConnections:error:
     * method.
     * 
     * On macOS, if this method is called within the captureOutput:didOutputSampleBuffer:fromConnection: delegate
     * method, the last samples written to the current file are guaranteed to be those that were output immediately
     * before those in the sample buffer passed to that method.
     */
    @Generated
    @Selector("stopRecording")
    public native void stopRecording();
}
