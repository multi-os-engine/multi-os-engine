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

/**
 * [@protocol] AVCaptureFileOutputRecordingDelegate
 * <p>
 * Defines an interface for delegates of AVCaptureFileOutput to respond to events that occur in the process of recording
 * a single file.
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AVCaptureFileOutputRecordingDelegate")
public interface AVCaptureFileOutputRecordingDelegate {
    /**
     * captureOutput:didFinishRecordingToOutputFileAtURL:fromConnections:error:
     * <p>
     * Informs the delegate when all pending data has been written to an output file.
     * <p>
     * This method is called when the file output has finished writing all data to a file whose recording was stopped,
     * either because startRecordingToOutputFileURL:recordingDelegate: or stopRecording were called, or because an
     * error, described by the error parameter, occurred (if no error occurred, the error parameter will be nil). This
     * method will always be called for each recording request, even if no data is successfully written to the file.
     * <p>
     * Clients should not assume that this method will be called on a specific thread.
     * <p>
     * Delegates are required to implement this method.
     *
     * @param output        The capture file output that has finished writing the file.
     * @param outputFileURL The file URL of the file that has been written.
     * @param connections   An array of AVCaptureConnection objects attached to the file output that provided the data
     *                      that was written to the file.
     * @param error         An error describing what caused the file to stop recording, or nil if there was no error.
     */
    @Generated
    @Selector("captureOutput:didFinishRecordingToOutputFileAtURL:fromConnections:error:")
    void captureOutputDidFinishRecordingToOutputFileAtURLFromConnectionsError(AVCaptureFileOutput output,
            NSURL outputFileURL, NSArray<? extends AVCaptureConnection> connections, NSError error);

    /**
     * captureOutput:didStartRecordingToOutputFileAtURL:fromConnections:
     * <p>
     * Informs the delegate when the output has started writing to a file.
     * <p>
     * This method is called when the file output has started writing data to a file. If an error condition prevents any
     * data from being written, this method may not be called.
     * captureOutput:willFinishRecordingToOutputFileAtURL:fromConnections:error: and
     * captureOutput:didFinishRecordingToOutputFileAtURL:fromConnections:error: will always be called, even if no data
     * is written.
     * <p>
     * Clients should not assume that this method will be called on a specific thread, and should also try to make this
     * method as efficient as possible.
     *
     * @param output      The capture file output that started writing the file.
     * @param fileURL     The file URL of the file that is being written.
     * @param connections An array of AVCaptureConnection objects attached to the file output that provided the data
     *                    that is being written to the file.
     */
    @Generated
    @IsOptional
    @Selector("captureOutput:didStartRecordingToOutputFileAtURL:fromConnections:")
    default void captureOutputDidStartRecordingToOutputFileAtURLFromConnections(AVCaptureFileOutput output,
            NSURL fileURL, NSArray<? extends AVCaptureConnection> connections) {
        throw new java.lang.UnsupportedOperationException();
    }
}
