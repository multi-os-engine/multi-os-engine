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

package apple.avfoundation.protocol;

import apple.avfoundation.AVCaptureConnection;
import apple.avfoundation.AVCaptureFileOutput;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSURL;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import apple.coremedia.struct.CMTime;
import org.moe.natj.general.ann.ByValue;

/**
 * [@protocol] AVCaptureFileOutputRecordingDelegate
 * 
 * Defines an interface for delegates of AVCaptureFileOutput to respond to events that occur in the process of recording
 * a single file.
 * 
 * API-Since: 4.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AVCaptureFileOutputRecordingDelegate")
public interface AVCaptureFileOutputRecordingDelegate {
    /**
     * captureOutput:didFinishRecordingToOutputFileAtURL:fromConnections:error:
     * 
     * Informs the delegate when all pending data has been written to an output file.
     * 
     * This method is called when the file output has finished writing all data to a file whose recording was stopped,
     * either because startRecordingToOutputFileURL:recordingDelegate: or stopRecording were called, or because an
     * error, described by the error parameter, occurred (if no error occurred, the error parameter will be nil). This
     * method will always be called for each recording request, even if no data is successfully written to the file.
     * 
     * Clients should not assume that this method will be called on a specific thread.
     * 
     * Delegates are required to implement this method.
     * 
     * API-Since: 4.0
     * 
     * @param output
     *                      The capture file output that has finished writing the file.
     * @param outputFileURL
     *                      The file URL of the file that has been written.
     * @param connections
     *                      An array of AVCaptureConnection objects attached to the file output that provided the data
     *                      that was written to the file.
     * @param error
     *                      An error describing what caused the file to stop recording, or nil if there was no error.
     */
    @Generated
    @Selector("captureOutput:didFinishRecordingToOutputFileAtURL:fromConnections:error:")
    void captureOutputDidFinishRecordingToOutputFileAtURLFromConnectionsError(@NotNull AVCaptureFileOutput output,
            @NotNull NSURL outputFileURL, @NotNull NSArray<? extends AVCaptureConnection> connections,
            @Nullable NSError error);

    /**
     * captureOutput:didStartRecordingToOutputFileAtURL:fromConnections:
     * 
     * Informs the delegate when the output has started writing to a file.
     * 
     * This method is called when the file output has started writing data to a file. If an error condition prevents any
     * data from being written, this method may not be called.
     * captureOutput:willFinishRecordingToOutputFileAtURL:fromConnections:error: and
     * captureOutput:didFinishRecordingToOutputFileAtURL:fromConnections:error: will always be called, even if no data
     * is written.
     * 
     * Clients should not assume that this method will be called on a specific thread, and should also try to make this
     * method as efficient as possible.
     * 
     * API-Since: 4.0
     * 
     * @param output
     *                    The capture file output that started writing the file.
     * @param fileURL
     *                    The file URL of the file that is being written.
     * @param connections
     *                    An array of AVCaptureConnection objects attached to the file output that provided the data
     *                    that is being written to the file.
     */
    @Generated
    @IsOptional
    @Selector("captureOutput:didStartRecordingToOutputFileAtURL:fromConnections:")
    default void captureOutputDidStartRecordingToOutputFileAtURLFromConnections(@NotNull AVCaptureFileOutput output,
            @NotNull NSURL fileURL, @NotNull NSArray<? extends AVCaptureConnection> connections) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * captureOutput:didPauseRecordingToOutputFileAtURL:fromConnections:
     * 
     * Called whenever the output is recording to a file and successfully pauses the recording at the request of the
     * client.
     * 
     * Delegates can use this method to be informed when a request to pause recording is actually respected. It is safe
     * for delegates to change what the file output is currently doing (starting a new file, for example) from within
     * this method. If recording to a file is stopped, either manually or due to an error, this method is not guaranteed
     * to be called, even if a previous call to pauseRecording was made.
     * 
     * Clients should not assume that this method will be called on a specific thread, and should also try to make this
     * method as efficient as possible.
     * 
     * API-Since: 18.0
     * 
     * @param output
     *                    The capture file output that has paused its file recording.
     * @param fileURL
     *                    The file URL of the file that is being written.
     * @param connections
     *                    An array of AVCaptureConnection objects attached to the file output that provided the data
     *                    that is being written to the file.
     */
    @Generated
    @IsOptional
    @Selector("captureOutput:didPauseRecordingToOutputFileAtURL:fromConnections:")
    default void captureOutputDidPauseRecordingToOutputFileAtURLFromConnections(@NotNull AVCaptureFileOutput output,
            @NotNull NSURL fileURL, @NotNull NSArray<? extends AVCaptureConnection> connections) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * captureOutput:didResumeRecordingToOutputFileAtURL:fromConnections:
     * 
     * Called whenever the output, at the request of the client, successfully resumes a file recording that was paused.
     * 
     * Delegates can use this method to be informed when a request to resume recording is actually respected. It is safe
     * for delegates to change what the file output is currently doing (starting a new file, for example) from within
     * this method. If recording to a file is stopped, either manually or due to an error, this method is not guaranteed
     * to be called, even if a previous call to resumeRecording was made.
     * 
     * Clients should not assume that this method will be called on a specific thread, and should also try to make this
     * method as efficient as possible.
     * 
     * API-Since: 18.0
     * 
     * @param output
     *                    The capture file output that has resumed its paused file recording.
     * @param fileURL
     *                    The file URL of the file that is being written.
     * @param connections
     *                    An array of AVCaptureConnection objects attached to the file output that provided the data
     *                    that is being written to the file.
     */
    @Generated
    @IsOptional
    @Selector("captureOutput:didResumeRecordingToOutputFileAtURL:fromConnections:")
    default void captureOutputDidResumeRecordingToOutputFileAtURLFromConnections(@NotNull AVCaptureFileOutput output,
            @NotNull NSURL fileURL, @NotNull NSArray<? extends AVCaptureConnection> connections) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * captureOutput:didStartRecordingToOutputFileAtURL:startPTS:fromConnections:
     * 
     * Informs the delegate when the output has started writing to a file.
     * 
     * This method is called when the file output has started writing data to a file. If an error condition prevents any
     * data from being written, this method may not be called.
     * captureOutput:willFinishRecordingToOutputFileAtURL:fromConnections:error: and
     * captureOutput:didFinishRecordingToOutputFileAtURL:fromConnections:error: will always be called, even if no data
     * is written.
     * 
     * If this method is implemented, the alternative delegate callback
     * -captureOutput:didStartRecordingToOutputFileAtURL:fromConnections will not be called.
     * 
     * Clients should not assume that this method will be called on a specific thread, and should also try to make this
     * method as efficient as possible.
     * 
     * API-Since: 18.2
     * 
     * @param output
     *                    The capture file output that started writing the file.
     * @param fileURL
     *                    The file URL of the file that is being written.
     * @param startPTS
     *                    The timestamp of the first buffer written to the file, synced with
     *                    AVCaptureSession.synchronizationClock
     * @param connections
     *                    An array of AVCaptureConnection objects attached to the file output that provided the data
     *                    that is being written to the file.
     */
    @Generated
    @IsOptional
    @Selector("captureOutput:didStartRecordingToOutputFileAtURL:startPTS:fromConnections:")
    default void captureOutputDidStartRecordingToOutputFileAtURLStartPTSFromConnections(
            @NotNull AVCaptureFileOutput output, @NotNull NSURL fileURL, @ByValue CMTime startPTS,
            @NotNull NSArray<? extends AVCaptureConnection> connections) {
        throw new java.lang.UnsupportedOperationException();
    }
}
