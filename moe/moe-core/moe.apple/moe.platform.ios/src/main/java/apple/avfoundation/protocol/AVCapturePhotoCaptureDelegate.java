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

import apple.avfoundation.AVCaptureBracketedStillImageSettings;
import apple.avfoundation.AVCapturePhoto;
import apple.avfoundation.AVCapturePhotoOutput;
import apple.avfoundation.AVCaptureResolvedPhotoSettings;
import apple.coremedia.opaque.CMSampleBufferRef;
import apple.coremedia.struct.CMTime;
import apple.foundation.NSError;
import apple.foundation.NSURL;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * [@protocol] AVCapturePhotoCaptureDelegate
 * 
 * A set of delegate callbacks to be implemented by a client who calls AVCapturePhotoOutput's
 * -capturePhotoWithSettings:delegate.
 * 
 * AVCapturePhotoOutput invokes the AVCapturePhotoCaptureDelegate callbacks on a common dispatch queue — not necessarily
 * the main queue. While the -captureOutput:willBeginCaptureForResolvedSettings: callback always comes first and the
 * -captureOutput:didFinishCaptureForResolvedSettings: callback always comes last, none of the other callbacks can be
 * assumed to come in any particular order. The AVCaptureResolvedPhotoSettings instance passed to the client with each
 * callback has the same uniqueID as the AVCapturePhotoSettings instance passed in -capturePhotoWithSettings:delegate:.
 * All callbacks are marked optional, but depending on the features you've specified in your AVCapturePhotoSettings,
 * some callbacks become mandatory and are validated in -capturePhotoWithSettings:delegate:. If your delegate does not
 * implement the mandatory callbacks, an NSInvalidArgumentException is thrown.
 * 
 * - If you initialize your photo settings with a format dictionary, or use one of the default constructors (that is, if
 * you're not requesting a RAW-only capture), your delegate must respond to either -
 * captureOutput:didFinishProcessingPhoto:error: or the deprecated
 * -captureOutput:didFinishProcessingPhotoSampleBuffer:previewPhotoSampleBuffer:resolvedSettings:bracketSettings:error:.
 * If your delegate responds to both of these callbacks, only the undeprecated variant will be called.
 * - If you initialize your photo settings with a rawPhotoPixelFormatType, your delegate must respond to either
 * -captureOutput:didFinishProcessingPhoto:error: or the deprecated
 * -captureOutput:didFinishProcessingRawPhotoSampleBuffer:previewPhotoSampleBuffer:resolvedSettings:bracketSettings:error:.
 * If your delegate responds to both of these callbacks, only the undeprecated variant will be called.
 * - If you set livePhotoMovieFileURL to non-nil, your delegate must respond to
 * -captureOutput:didFinishProcessingLivePhotoToMovieFileAtURL:duration:photoDisplayTime:resolvedSettings:error:.
 * 
 * In the event of an error, all expected callbacks are fired with an appropriate error.
 * 
 * API-Since: 10.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AVCapturePhotoCaptureDelegate")
public interface AVCapturePhotoCaptureDelegate {
    /**
     * captureOutput:didCapturePhotoForResolvedSettings:
     * 
     * A callback fired just after the photo is taken.
     * 
     * The timing of this callback is analogous to AVCaptureStillImageOutput's capturingStillImage property changing
     * from YES to NO.
     * 
     * @param output
     *                         The calling instance of AVCapturePhotoOutput.
     * @param resolvedSettings
     *                         An instance of AVCaptureResolvedPhotoSettings indicating which capture features have been
     *                         selected.
     */
    @Generated
    @IsOptional
    @Selector("captureOutput:didCapturePhotoForResolvedSettings:")
    default void captureOutputDidCapturePhotoForResolvedSettings(AVCapturePhotoOutput output,
            AVCaptureResolvedPhotoSettings resolvedSettings) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * captureOutput:didFinishCaptureForResolvedSettings:error:
     * 
     * A callback fired when the photo capture is completed and no more callbacks will be fired.
     * 
     * This callback always fires last and when it does, you may clean up any state relating to this photo capture.
     * 
     * @param output
     *                         The calling instance of AVCapturePhotoOutput.
     * @param resolvedSettings
     *                         An instance of AVCaptureResolvedPhotoSettings indicating which capture features were
     *                         selected.
     * @param error
     *                         An error indicating whether the capture was unsuccessful. Nil if there were no problems.
     */
    @Generated
    @IsOptional
    @Selector("captureOutput:didFinishCaptureForResolvedSettings:error:")
    default void captureOutputDidFinishCaptureForResolvedSettingsError(AVCapturePhotoOutput output,
            AVCaptureResolvedPhotoSettings resolvedSettings, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * captureOutput:didFinishProcessingLivePhotoToMovieFileAtURL:duration:photoDisplayTime:resolvedSettings:error:
     * 
     * A callback fired when the Live Photo movie is finished being written to disk.
     * 
     * When this callback fires, the movie on disk is fully finished and ready for consumption.
     * 
     * @param output
     *                         The calling instance of AVCapturePhotoOutput.
     * @param outputFileURL
     *                         The URL where the movie file resides. This URL is equal to your
     *                         AVCapturePhotoSettings.livePhotoMovieURL.
     * @param duration
     *                         A CMTime indicating the duration of the movie file.
     * @param photoDisplayTime
     *                         A CMTime indicating the time in the movie at which the still photo should be displayed.
     * @param resolvedSettings
     *                         An instance of AVCaptureResolvedPhotoSettings indicating which capture features have been
     *                         selected.
     * @param error
     *                         An error indicating what went wrong if the outputFileURL is damaged.
     */
    @Generated
    @IsOptional
    @Selector("captureOutput:didFinishProcessingLivePhotoToMovieFileAtURL:duration:photoDisplayTime:resolvedSettings:error:")
    default void captureOutputDidFinishProcessingLivePhotoToMovieFileAtURLDurationPhotoDisplayTimeResolvedSettingsError(
            AVCapturePhotoOutput output, NSURL outputFileURL, @ByValue CMTime duration,
            @ByValue CMTime photoDisplayTime, AVCaptureResolvedPhotoSettings resolvedSettings, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * captureOutput:didFinishProcessingPhotoSampleBuffer:previewPhotoSampleBuffer:resolvedSettings:bracketSettings:error:
     * 
     * A callback fired when the primary processed photo or photos are done.
     * 
     * If you've requested a single processed image (uncompressed or compressed) capture, the photo is delivered here.
     * If you've requested a bracketed capture, this callback is fired bracketedSettings.count times (once for each
     * photo in the bracket).
     * 
     * API-Since: 10.0
     * Deprecated-Since: 11.0
     * 
     * @param output
     *                                 The calling instance of AVCapturePhotoOutput.
     * @param photoSampleBuffer
     *                                 A CMSampleBuffer containing an uncompressed pixel buffer or compressed data,
     *                                 along with timing information and metadata. May be nil if there was an error.
     * @param previewPhotoSampleBuffer
     *                                 An optional CMSampleBuffer containing an uncompressed, down-scaled preview pixel
     *                                 buffer. Note that the preview sample buffer contains no metadata. Refer to the
     *                                 photoSampleBuffer for metadata (e.g., the orientation). May be nil.
     * @param resolvedSettings
     *                                 An instance of AVCaptureResolvedPhotoSettings indicating which capture features
     *                                 have been selected.
     * @param bracketSettings
     *                                 If this image is being delivered as part of a bracketed capture, the
     *                                 bracketSettings corresponding to this image. Otherwise nil.
     * @param error
     *                                 An error indicating what went wrong if photoSampleBuffer is nil.
     */
    @Deprecated
    @Generated
    @IsOptional
    @Selector("captureOutput:didFinishProcessingPhotoSampleBuffer:previewPhotoSampleBuffer:resolvedSettings:bracketSettings:error:")
    default void captureOutputDidFinishProcessingPhotoSampleBufferPreviewPhotoSampleBufferResolvedSettingsBracketSettingsError(
            AVCapturePhotoOutput output, CMSampleBufferRef photoSampleBuffer,
            CMSampleBufferRef previewPhotoSampleBuffer, AVCaptureResolvedPhotoSettings resolvedSettings,
            AVCaptureBracketedStillImageSettings bracketSettings, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * captureOutput:didFinishProcessingRawPhotoSampleBuffer:previewPhotoSampleBuffer:resolvedSettings:bracketSettings:error:
     * 
     * A callback fired when the RAW photo or photos are done.
     * 
     * Single RAW image and bracketed RAW photos are delivered here. If you've requested a RAW bracketed capture, this
     * callback is fired bracketedSettings.count times (once for each photo in the bracket).
     * 
     * API-Since: 10.0
     * Deprecated-Since: 11.0
     * 
     * @param output
     *                                 The calling instance of AVCapturePhotoOutput.
     * @param rawSampleBuffer
     *                                 A CMSampleBuffer containing Bayer RAW pixel data, along with timing information
     *                                 and metadata. May be nil if there was an error.
     * @param previewPhotoSampleBuffer
     *                                 An optional CMSampleBuffer containing an uncompressed, down-scaled preview pixel
     *                                 buffer. Note that the preview sample buffer contains no metadata. Refer to the
     *                                 rawSampleBuffer for metadata (e.g., the orientation). May be nil.
     * @param resolvedSettings
     *                                 An instance of AVCaptureResolvedPhotoSettings indicating which capture features
     *                                 have been selected.
     * @param bracketSettings
     *                                 If this image is being delivered as part of a bracketed capture, the
     *                                 bracketSettings corresponding to this image. Otherwise nil.
     * @param error
     *                                 An error indicating what went wrong if rawSampleBuffer is nil.
     */
    @Deprecated
    @Generated
    @IsOptional
    @Selector("captureOutput:didFinishProcessingRawPhotoSampleBuffer:previewPhotoSampleBuffer:resolvedSettings:bracketSettings:error:")
    default void captureOutputDidFinishProcessingRawPhotoSampleBufferPreviewPhotoSampleBufferResolvedSettingsBracketSettingsError(
            AVCapturePhotoOutput output, CMSampleBufferRef rawSampleBuffer, CMSampleBufferRef previewPhotoSampleBuffer,
            AVCaptureResolvedPhotoSettings resolvedSettings, AVCaptureBracketedStillImageSettings bracketSettings,
            NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * captureOutput:didFinishRecordingLivePhotoMovieForEventualFileAtURL:resolvedSettings:
     * 
     * A callback fired when the Live Photo movie has captured all its media data, though all media has not yet been
     * written to file.
     * 
     * When this callback fires, no new media is being written to the file. If you are displaying a "Live" badge, this
     * is an appropriate time to dismiss it. The movie file itself is not done being written until the
     * -captureOutput:didFinishProcessingLivePhotoToMovieFileAtURL:duration:photoDisplayTime:resolvedSettings:error:
     * callback fires.
     * 
     * @param output
     *                         The calling instance of AVCapturePhotoOutput.
     * @param outputFileURL
     *                         The URL to which the movie file will be written. This URL is equal to your
     *                         AVCapturePhotoSettings.livePhotoMovieURL.
     * @param resolvedSettings
     *                         An instance of AVCaptureResolvedPhotoSettings indicating which capture features have been
     *                         selected.
     */
    @Generated
    @IsOptional
    @Selector("captureOutput:didFinishRecordingLivePhotoMovieForEventualFileAtURL:resolvedSettings:")
    default void captureOutputDidFinishRecordingLivePhotoMovieForEventualFileAtURLResolvedSettings(
            AVCapturePhotoOutput output, NSURL outputFileURL, AVCaptureResolvedPhotoSettings resolvedSettings) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * captureOutput:willBeginCaptureForResolvedSettings:
     * 
     * A callback fired as soon as the capture settings have been resolved.
     * 
     * This callback is always delivered first for a particular capture request. It is delivered as soon as possible
     * after you call -capturePhotoWithSettings:delegate:, so you can know what to expect in the remainder of your
     * callbacks.
     * 
     * @param output
     *                         The calling instance of AVCapturePhotoOutput.
     * @param resolvedSettings
     *                         An instance of AVCaptureResolvedPhotoSettings indicating which capture features have been
     *                         selected.
     */
    @Generated
    @IsOptional
    @Selector("captureOutput:willBeginCaptureForResolvedSettings:")
    default void captureOutputWillBeginCaptureForResolvedSettings(AVCapturePhotoOutput output,
            AVCaptureResolvedPhotoSettings resolvedSettings) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * captureOutput:willCapturePhotoForResolvedSettings:
     * 
     * A callback fired just as the photo is being taken.
     * 
     * The timing of this callback is analogous to AVCaptureStillImageOutput's capturingStillImage property changing
     * from NO to YES. The callback is delivered right after the shutter sound is heard (note that shutter sounds are
     * suppressed when Live Photos are being captured).
     * 
     * @param output
     *                         The calling instance of AVCapturePhotoOutput.
     * @param resolvedSettings
     *                         An instance of AVCaptureResolvedPhotoSettings indicating which capture features have been
     *                         selected.
     */
    @Generated
    @IsOptional
    @Selector("captureOutput:willCapturePhotoForResolvedSettings:")
    default void captureOutputWillCapturePhotoForResolvedSettings(AVCapturePhotoOutput output,
            AVCaptureResolvedPhotoSettings resolvedSettings) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * captureOutput:didFinishProcessingPhoto:error:
     * 
     * A callback fired when photos are ready to be delivered to you (RAW or processed).
     * 
     * This callback fires resolvedSettings.expectedPhotoCount number of times for a given capture request. Note that
     * the photo parameter is always non nil, even if an error is returned. The delivered AVCapturePhoto's rawPhoto
     * property can be queried to know if it's a RAW image or processed image.
     * 
     * API-Since: 11.0
     * 
     * @param output
     *               The calling instance of AVCapturePhotoOutput.
     * @param photo
     *               An instance of AVCapturePhoto.
     * @param error
     *               An error indicating what went wrong. If the photo was processed successfully, nil is returned.
     */
    @Generated
    @IsOptional
    @Selector("captureOutput:didFinishProcessingPhoto:error:")
    default void captureOutputDidFinishProcessingPhotoError(AVCapturePhotoOutput output, AVCapturePhoto photo,
            NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }
}
