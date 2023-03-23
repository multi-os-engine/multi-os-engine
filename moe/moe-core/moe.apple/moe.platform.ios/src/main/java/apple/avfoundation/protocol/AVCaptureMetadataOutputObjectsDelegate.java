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
import apple.avfoundation.AVMetadataObject;
import apple.foundation.NSArray;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * [@protocol] AVCaptureMetadataOutputObjectsDelegate
 * 
 * Defines an interface for delegates of AVCaptureMetadataOutput to receive emitted objects.
 * 
 * API-Since: 6.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AVCaptureMetadataOutputObjectsDelegate")
public interface AVCaptureMetadataOutputObjectsDelegate {
    /**
     * captureOutput:didOutputMetadataObjects:fromConnection:
     * 
     * Called whenever an AVCaptureMetadataOutput instance emits new objects through a connection.
     * 
     * Delegates receive this message whenever the output captures and emits new objects, as specified by its
     * metadataObjectTypes property. Delegates can use the provided objects in conjunction with other APIs for further
     * processing. This method will be called on the dispatch queue specified by the output's
     * metadataObjectsCallbackQueue property. This method may be called frequently, so it must be efficient to prevent
     * capture performance problems, including dropped metadata objects.
     * 
     * Clients that need to reference metadata objects outside of the scope of this method must retain them and then
     * release them when they are finished with them.
     * 
     * @param output
     *                        The AVCaptureMetadataOutput instance that emitted the objects.
     * @param metadataObjects
     *                        An array of AVMetadataObject subclasses (see AVMetadataObject.h).
     * @param connection
     *                        The AVCaptureConnection through which the objects were emitted.
     */
    @Generated
    @IsOptional
    @Selector("captureOutput:didOutputMetadataObjects:fromConnection:")
    default void captureOutputDidOutputMetadataObjectsFromConnection(AVCaptureOutput output,
            NSArray<? extends AVMetadataObject> metadataObjects, AVCaptureConnection connection) {
        throw new java.lang.UnsupportedOperationException();
    }
}
