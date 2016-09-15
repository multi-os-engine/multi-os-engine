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

import apple.avfoundation.AVAsynchronousVideoCompositionRequest;
import apple.avfoundation.AVVideoCompositionRenderContext;
import apple.foundation.NSDictionary;
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
@ObjCProtocolName("AVVideoCompositing")
public interface AVVideoCompositing {
    /**
     * cancelAllPendingVideoCompositionRequests</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVVideoCompositing_Protocol/index.html#//apple_ref/occ/intfm/AVVideoCompositing/cancelAllPendingVideoCompositionRequests">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("cancelAllPendingVideoCompositionRequests")
    default void cancelAllPendingVideoCompositionRequests() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * renderContextChanged:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVVideoCompositing_Protocol/index.html#//apple_ref/occ/intfm/AVVideoCompositing/renderContextChanged:">iOS Dev Center</a>
     */
    @Generated
    @Selector("renderContextChanged:")
    void renderContextChanged(AVVideoCompositionRenderContext newRenderContext);

    /**
     * requiredPixelBufferAttributesForRenderContext</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVVideoCompositing_Protocol/index.html#//apple_ref/occ/intfp/AVVideoCompositing/requiredPixelBufferAttributesForRenderContext">iOS Dev Center</a>
     */
    @Generated
    @Selector("requiredPixelBufferAttributesForRenderContext")
    NSDictionary<String, ?> requiredPixelBufferAttributesForRenderContext();

    /**
     * sourcePixelBufferAttributes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVVideoCompositing_Protocol/index.html#//apple_ref/occ/intfp/AVVideoCompositing/sourcePixelBufferAttributes">iOS Dev Center</a>
     */
    @Generated
    @Selector("sourcePixelBufferAttributes")
    NSDictionary<String, ?> sourcePixelBufferAttributes();

    /**
     * startVideoCompositionRequest:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVVideoCompositing_Protocol/index.html#//apple_ref/occ/intfm/AVVideoCompositing/startVideoCompositionRequest:">iOS Dev Center</a>
     */
    @Generated
    @Selector("startVideoCompositionRequest:")
    void startVideoCompositionRequest(AVAsynchronousVideoCompositionRequest asyncVideoCompositionRequest);
}
