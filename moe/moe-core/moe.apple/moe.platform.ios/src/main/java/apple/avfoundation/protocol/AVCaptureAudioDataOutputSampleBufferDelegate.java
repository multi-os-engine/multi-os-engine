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
 * @protocol AVCaptureAudioDataOutputSampleBufferDelegate
 * @abstract
 *    Defines an interface for delegates of AVCaptureAudioDataOutput to receive captured audio sample buffers.
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AVCaptureAudioDataOutputSampleBufferDelegate")
public interface AVCaptureAudioDataOutputSampleBufferDelegate {
    /**
     * @method captureOutput:didOutputSampleBuffer:fromConnection:
     * @abstract
     *    Called whenever an AVCaptureAudioDataOutput instance outputs a new audio sample buffer.
     * 
     * @param output
     *    The AVCaptureAudioDataOutput instance that output the samples.
     * @param sampleBuffer
     *    A CMSampleBuffer object containing the audio samples and additional information about them, such as their format and presentation time.
     * @param connection
     *    The AVCaptureConnection from which the audio was received.
     * 
     * @discussion
     *    Delegates receive this message whenever the output captures and outputs new audio samples, decoding or re-encoding as specified by the audioSettings property. Delegates can use the provided sample buffer in conjunction with other APIs for further processing. This method will be called on the dispatch queue specified by the output's sampleBufferCallbackQueue property. This method is called periodically, so it must be efficient to prevent capture performance problems, including dropped audio samples.
     * 
     *    Clients that need to reference the CMSampleBuffer object outside of the scope of this method must CFRetain it and then CFRelease it when they are finished with it.
     */
    @Generated
    @IsOptional
    @Selector("captureOutput:didOutputSampleBuffer:fromConnection:")
    default void captureOutputDidOutputSampleBufferFromConnection(AVCaptureOutput output,
            CMSampleBufferRef sampleBuffer, AVCaptureConnection connection) {
        throw new java.lang.UnsupportedOperationException();
    }
}
