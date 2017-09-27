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

@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AVCapturePhotoCaptureDelegate")
public interface AVCapturePhotoCaptureDelegate {
    @Generated
    @IsOptional
    @Selector("captureOutput:didCapturePhotoForResolvedSettings:")
    default void captureOutputDidCapturePhotoForResolvedSettings(AVCapturePhotoOutput output,
            AVCaptureResolvedPhotoSettings resolvedSettings) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("captureOutput:didFinishCaptureForResolvedSettings:error:")
    default void captureOutputDidFinishCaptureForResolvedSettingsError(AVCapturePhotoOutput output,
            AVCaptureResolvedPhotoSettings resolvedSettings, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("captureOutput:didFinishProcessingLivePhotoToMovieFileAtURL:duration:photoDisplayTime:resolvedSettings:error:")
    default void captureOutputDidFinishProcessingLivePhotoToMovieFileAtURLDurationPhotoDisplayTimeResolvedSettingsError(
            AVCapturePhotoOutput output, NSURL outputFileURL, @ByValue CMTime duration,
            @ByValue CMTime photoDisplayTime, AVCaptureResolvedPhotoSettings resolvedSettings, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("captureOutput:didFinishProcessingPhotoSampleBuffer:previewPhotoSampleBuffer:resolvedSettings:bracketSettings:error:")
    default void captureOutputDidFinishProcessingPhotoSampleBufferPreviewPhotoSampleBufferResolvedSettingsBracketSettingsError(
            AVCapturePhotoOutput output, CMSampleBufferRef photoSampleBuffer,
            CMSampleBufferRef previewPhotoSampleBuffer, AVCaptureResolvedPhotoSettings resolvedSettings,
            AVCaptureBracketedStillImageSettings bracketSettings, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("captureOutput:didFinishProcessingRawPhotoSampleBuffer:previewPhotoSampleBuffer:resolvedSettings:bracketSettings:error:")
    default void captureOutputDidFinishProcessingRawPhotoSampleBufferPreviewPhotoSampleBufferResolvedSettingsBracketSettingsError(
            AVCapturePhotoOutput output, CMSampleBufferRef rawSampleBuffer, CMSampleBufferRef previewPhotoSampleBuffer,
            AVCaptureResolvedPhotoSettings resolvedSettings, AVCaptureBracketedStillImageSettings bracketSettings,
            NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("captureOutput:didFinishRecordingLivePhotoMovieForEventualFileAtURL:resolvedSettings:")
    default void captureOutputDidFinishRecordingLivePhotoMovieForEventualFileAtURLResolvedSettings(
            AVCapturePhotoOutput output, NSURL outputFileURL, AVCaptureResolvedPhotoSettings resolvedSettings) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("captureOutput:willBeginCaptureForResolvedSettings:")
    default void captureOutputWillBeginCaptureForResolvedSettings(AVCapturePhotoOutput output,
            AVCaptureResolvedPhotoSettings resolvedSettings) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("captureOutput:willCapturePhotoForResolvedSettings:")
    default void captureOutputWillCapturePhotoForResolvedSettings(AVCapturePhotoOutput output,
            AVCaptureResolvedPhotoSettings resolvedSettings) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("captureOutput:didFinishProcessingPhoto:error:")
    default void captureOutputDidFinishProcessingPhotoError(AVCapturePhotoOutput output, AVCapturePhoto photo,
            NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }
}
