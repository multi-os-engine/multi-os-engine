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

/**
 * [@protocol] AVVideoCompositing
 * <p>
 * Defines properties and methods for custom video compositors
 * <p>
 * For each AVFoundation object of class AVPlayerItem, AVAssetExportSession, AVAssetImageGenerator, or
 * AVAssetReaderVideoCompositionOutput that has a non-nil value for its videoComposition property, when the value of the
 * customVideoCompositorClass property of the AVVideoComposition is not Nil, AVFoundation creates and uses an instance
 * of that custom video compositor class to process the instructions contained in the AVVideoComposition. The custom
 * video compositor instance will be created when you invoke -setVideoComposition: with an instance of
 * AVVideoComposition that's associated with a different custom video compositor class than the object was previously
 * using.
 * <p>
 * When creating instances of custom video compositors, AVFoundation initializes them by calling -init and then makes
 * them available to you for further set-up or communication, if any is needed, as the value of the
 * customVideoCompositor property of the object on which -setVideoComposition: was invoked.
 * <p>
 * Custom video compositor instances will then be retained by the AVFoundation object for as long as the value of its
 * videoComposition property indicates that an instance of the same custom video compositor class should be used, even
 * if the value is changed from one instance of AVVideoComposition to another instance that's associated with the same
 * custom video compositor class.
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AVVideoCompositing")
public interface AVVideoCompositing {
    /**
     * cancelAllPendingVideoCompositionRequests
     * <p>
     * Directs a custom video compositor object to cancel or finish all pending video composition requests
     * <p>
     * When receiving this message, a custom video compositor must block until it has either cancelled all pending frame
     * requests,
     * and called the finishCancelledRequest callback for each of them, or, if cancellation is not possible, finished
     * processing of all the frames
     * and called the finishWithComposedVideoFrame: callback for each of them.
     */
    @Generated
    @IsOptional
    @Selector("cancelAllPendingVideoCompositionRequests")
    default void cancelAllPendingVideoCompositionRequests() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * renderContextChanged:
     * <p>
     * Called to notify the custom compositor that a composition will switch to a different render context
     * <p>
     * Instances of classes implementing the AVVideoComposting protocol can implement this method to be notified when
     * the AVVideoCompositionRenderContext instance handing a video composition changes. AVVideoCompositionRenderContext
     * instances
     * being immutable, such a change will occur every time there is a change in the video composition parameters.
     *
     * @param newRenderContext The render context that will be handling the video composition from this point
     */
    @Generated
    @Selector("renderContextChanged:")
    void renderContextChanged(AVVideoCompositionRenderContext newRenderContext);

    /**
     * Indicates the pixel buffer attributes required by the video compositor for new buffers that it creates
     * for processing. The property is required to provide kCVPixelBufferPixelFormatTypeKey along with attributes for
     * which the compositor needs specific values to work properly. Omitted attributes will be supplied by the
     * composition engine to allow for the best performance. If the attribute kCVPixelBufferPixelFormatTypeKey is
     * missing an exception will be raised.
     * The getter for requiredPixelBufferAttributesForRenderContext is typically invoked prior to the creation of
     * a new render context; the combination of the attributes in the returned value and the additional attributes
     * supplied by the composition engine will be used in the creation of subsequent render context's pixelBuffers.
     * This property is queried once before any composition request is sent to the compositor. Changing
     * required buffer attributes afterwards is not supported.
     */
    @Generated
    @Selector("requiredPixelBufferAttributesForRenderContext")
    NSDictionary<String, ?> requiredPixelBufferAttributesForRenderContext();

    /**
     * Indicates the kinds of source frame pixel buffer attributes a video compositor can accept as input.
     * The property is required to provide kCVPixelBufferPixelFormatTypeKey along with the attributes
     * for which the compositor needs specific values to work properly. If the attribute
     * kCVPixelBufferPixelFormatTypeKey
     * is missing an exception will be raised. If the custom compositor is meant to be used with an
     * AVVideoCompositionCoreAnimationTool
     * created using the videoCompositionCoreAnimationToolWithAdditionalLayer constructor, kCVPixelFormatType_32BGRA
     * should be indicated as one of the supported pixel format types.
     * Missing attributes will be set by the composition engine to values allowing the best performance.
     * This property is queried once before any composition request is sent to the compositor. Changing
     * source buffer attributes afterwards is not supported.
     */
    @Generated
    @Selector("sourcePixelBufferAttributes")
    NSDictionary<String, ?> sourcePixelBufferAttributes();

    /**
     * startVideoCompositionRequest:
     * <p>
     * Directs a custom video compositor object to create a new pixel buffer composed asynchronously from a collection
     * of sources.
     * <p>
     * The custom compositor is expected to invoke, either subsequently or immediately, either:
     * -[AVAsynchronousVideoCompositionRequest finishWithComposedVideoFrame:] or
     * -[AVAsynchronousVideoCompositionRequest finishWithError:]. If you intend to finish rendering the frame after your
     * handling of this message returns, you must retain the instance of AVAsynchronousVideoCompositionRequest until
     * after composition is finished.
     * Note that if the custom compositor's implementation of -startVideoCompositionRequest: returns without finishing
     * the composition immediately,
     * it may be invoked again with another composition request before the prior request is finished; therefore in such
     * cases the custom compositor should
     * be prepared to manage multiple composition requests.
     * <p>
     * If the rendered frame is exactly the same as one of the source frames, with no letterboxing, pillboxing or
     * cropping needed,
     * then the appropriate source pixel buffer may be returned (after CFRetain has been called on it).
     *
     * @param asyncVideoCompositionRequest An instance of AVAsynchronousVideoCompositionRequest that provides context
     *                                     for the requested composition.
     */
    @Generated
    @Selector("startVideoCompositionRequest:")
    void startVideoCompositionRequest(AVAsynchronousVideoCompositionRequest asyncVideoCompositionRequest);

    /**
     * [@property] supportsWideColorSourceFrames
     * <p>
     * Indicates that clients can handle frames that contains wide color properties.
     * <p>
     * Controls whether the client will receive frames that contain wide color information. Care should be taken to
     * avoid clamping.
     */
    @Generated
    @IsOptional
    @Selector("supportsWideColorSourceFrames")
    default boolean supportsWideColorSourceFrames() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * anticipateRenderingUsingHint:
     * <p>
     * Informs a custom video compositor about upcoming rendering requests.
     * <p>
     * In the method the compositor can load composition resources such as overlay images which will be needed in the
     * anticipated rendering time range.
     * <p>
     * Unlike -startVideoCompositionRequest, which is invoked only when the frame compositing is necessary, the
     * framework typically calls this method every frame duration. It allows the custom compositor to load and unload a
     * composition resource such as overlay images at an appropriate timing.
     * <p>
     * In forward playback, renderHint's startCompositionTime is less than endCompositionTime. In reverse playback, its
     * endCompositionTime is less than startCompositionTime. For seeking, startCompositionTime == endCompositionTime,
     * which means the upcoming composition request time range is unknown and the compositor shouldn’t preload time
     * associated composition resources eagerly.
     * <p>
     * The method is guaranteed to be called before -startVideoCompositionRequest: for a given composition time.
     * <p>
     * The method is synchronous. The implementation should return quickly because otherwise the playback would stall
     * and cause frame drops.
     *
     * @param renderHint Information about the upcoming composition requests.
     */
    @Generated
    @IsOptional
    @Selector("anticipateRenderingUsingHint:")
    default void anticipateRenderingUsingHint(AVVideoCompositionRenderHint renderHint) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * prerollForRenderingUsingHint:
     * <p>
     * Tell a custom video compositor to perform any work in prerolling phase.
     * <p>
     * The framework may perform prerolling to load media data to prime the render pipelines for smoother playback. This
     * method is called in the prerolling phase so that the compositor can load composition resources such as overlay
     * images which will be needed as soon as the playback starts.
     * <p>
     * Not all rendering scenarios use prerolling. For example, the method won't be called while seeking.
     * <p>
     * If called, the method is guaranteed to be invoked before the first -startVideoCompositionRequest: call.
     * <p>
     * The method is synchronous. The prerolling won't finish until the method returns.
     *
     * @param renderHint Information about the upcoming composition requests.
     */
    @Generated
    @IsOptional
    @Selector("prerollForRenderingUsingHint:")
    default void prerollForRenderingUsingHint(AVVideoCompositionRenderHint renderHint) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * [@property] supportsHDRSourceFrames
     * <p>
     * Indicates that the client's video compositor can handle frames that contain high dynamic range (HDR) properties.
     * <p>
     * Controls whether the client will receive frames that contain HDR information.
     * If this field is omitted or set to NO, the framework will convert HDR frames to standard dynamic range (SDR) with
     * BT.709 transfer function before sending to the client.
     * If this field is set to YES, the value of supportsWideColorSourceFrames will be ignored and assumed to be YES.
     */
    @Generated
    @IsOptional
    @Selector("supportsHDRSourceFrames")
    default boolean supportsHDRSourceFrames() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("canConformColorOfSourceFrames")
    default boolean canConformColorOfSourceFrames() {
        throw new java.lang.UnsupportedOperationException();
    }
}
