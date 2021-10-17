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
import apple.avfoundation.AVCaptureOutput;
import apple.coremedia.opaque.CMSampleBufferRef;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * [@protocol] AVCaptureVideoDataOutputSampleBufferDelegate
 * <p>
 * Defines an interface for delegates of AVCaptureVideoDataOutput to receive captured video sample buffers and be notified of late sample buffers that were dropped.
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AVCaptureVideoDataOutputSampleBufferDelegate")
public interface AVCaptureVideoDataOutputSampleBufferDelegate {
    /**
     * captureOutput:didDropSampleBuffer:fromConnection:
     * <p>
     * Called once for each frame that is discarded.
     * <p>
     * Delegates receive this message whenever a video frame is dropped. This method is called once for each dropped frame. The CMSampleBuffer object passed to this delegate method will contain metadata about the dropped video frame, such as its duration and presentation time stamp, but will contain no actual video data. On iOS, Included in the sample buffer attachments is the kCMSampleBufferAttachmentKey_DroppedFrameReason, which indicates why the frame was dropped. This method will be called on the dispatch queue specified by the output's sampleBufferCallbackQueue property. Because this method will be called on the same dispatch queue that is responsible for outputting video frames, it must be efficient to prevent further capture performance problems, such as additional dropped video frames.
     *
     * @param output       The AVCaptureVideoDataOutput instance that dropped the frame.
     * @param sampleBuffer A CMSampleBuffer object containing information about the dropped frame, such as its format and presentation time. This sample buffer will contain none of the original video data.
     * @param connection   The AVCaptureConnection from which the dropped video frame was received.
     */
    @Generated
    @IsOptional
    @Selector("captureOutput:didDropSampleBuffer:fromConnection:")
    default void captureOutputDidDropSampleBufferFromConnection(AVCaptureOutput output, CMSampleBufferRef sampleBuffer,
            AVCaptureConnection connection) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * captureOutput:didOutputSampleBuffer:fromConnection:
     * <p>
     * Called whenever an AVCaptureVideoDataOutput instance outputs a new video frame.
     * <p>
     * Delegates receive this message whenever the output captures and outputs a new video frame, decoding or re-encoding it as specified by its videoSettings property. Delegates can use the provided video frame in conjunction with other APIs for further processing. This method will be called on the dispatch queue specified by the output's sampleBufferCallbackQueue property. This method is called periodically, so it must be efficient to prevent capture performance problems, including dropped frames.
     * <p>
     * Clients that need to reference the CMSampleBuffer object outside of the scope of this method must CFRetain it and then CFRelease it when they are finished with it.
     * <p>
     * Note that to maintain optimal performance, some sample buffers directly reference pools of memory that may need to be reused by the device system and other capture inputs. This is frequently the case for uncompressed device native capture where memory blocks are copied as little as possible. If multiple sample buffers reference such pools of memory for too long, inputs will no longer be able to copy new samples into memory and those samples will be dropped. If your application is causing samples to be dropped by retaining the provided CMSampleBuffer objects for too long, but it needs access to the sample data for a long period of time, consider copying the data into a new buffer and then calling CFRelease on the sample buffer if it was previously retained so that the memory it references can be reused.
     *
     * @param output       The AVCaptureVideoDataOutput instance that output the frame.
     * @param sampleBuffer A CMSampleBuffer object containing the video frame data and additional information about the frame, such as its format and presentation time.
     * @param connection   The AVCaptureConnection from which the video was received.
     */
    @Generated
    @IsOptional
    @Selector("captureOutput:didOutputSampleBuffer:fromConnection:")
    default void captureOutputDidOutputSampleBufferFromConnection(AVCaptureOutput output,
            CMSampleBufferRef sampleBuffer, AVCaptureConnection connection) {
        throw new java.lang.UnsupportedOperationException();
    }
}
