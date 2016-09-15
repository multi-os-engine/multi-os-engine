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

@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AVCaptureFileOutputRecordingDelegate")
public interface AVCaptureFileOutputRecordingDelegate {
    /**
     * captureOutput:didFinishRecordingToOutputFileAtURL:fromConnections:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureFileOutputRecordingDelegate_Protocol/index.html#//apple_ref/occ/intfm/AVCaptureFileOutputRecordingDelegate/captureOutput:didFinishRecordingToOutputFileAtURL:fromConnections:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("captureOutput:didFinishRecordingToOutputFileAtURL:fromConnections:error:")
    void captureOutputDidFinishRecordingToOutputFileAtURLFromConnectionsError(AVCaptureFileOutput captureOutput,
            NSURL outputFileURL, NSArray<?> connections, NSError error);

    /**
     * captureOutput:didStartRecordingToOutputFileAtURL:fromConnections:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureFileOutputRecordingDelegate_Protocol/index.html#//apple_ref/occ/intfm/AVCaptureFileOutputRecordingDelegate/captureOutput:didStartRecordingToOutputFileAtURL:fromConnections:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("captureOutput:didStartRecordingToOutputFileAtURL:fromConnections:")
    default void captureOutputDidStartRecordingToOutputFileAtURLFromConnections(AVCaptureFileOutput captureOutput,
            NSURL fileURL, NSArray<?> connections) {
        throw new java.lang.UnsupportedOperationException();
    }
}
