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
import apple.avfoundation.AVVideoCompositionRenderHint;
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
    @Generated
    @IsOptional
    @Selector("cancelAllPendingVideoCompositionRequests")
    default void cancelAllPendingVideoCompositionRequests() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("renderContextChanged:")
    void renderContextChanged(AVVideoCompositionRenderContext newRenderContext);

    @Generated
    @Selector("requiredPixelBufferAttributesForRenderContext")
    NSDictionary<String, ?> requiredPixelBufferAttributesForRenderContext();

    @Generated
    @Selector("sourcePixelBufferAttributes")
    NSDictionary<String, ?> sourcePixelBufferAttributes();

    @Generated
    @Selector("startVideoCompositionRequest:")
    void startVideoCompositionRequest(AVAsynchronousVideoCompositionRequest asyncVideoCompositionRequest);

    @Generated
    @IsOptional
    @Selector("supportsWideColorSourceFrames")
    default boolean supportsWideColorSourceFrames() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("anticipateRenderingUsingHint:")
    default void anticipateRenderingUsingHint(AVVideoCompositionRenderHint renderHint) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("prerollForRenderingUsingHint:")
    default void prerollForRenderingUsingHint(AVVideoCompositionRenderHint renderHint) {
        throw new java.lang.UnsupportedOperationException();
    }
}
