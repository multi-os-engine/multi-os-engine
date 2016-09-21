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
    default void captureOutputDidCapturePhotoForResolvedSettings(AVCapturePhotoOutput captureOutput,
            AVCaptureResolvedPhotoSettings resolvedSettings) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("captureOutput:didFinishCaptureForResolvedSettings:error:")
    default void captureOutputDidFinishCaptureForResolvedSettingsError(AVCapturePhotoOutput captureOutput,
            AVCaptureResolvedPhotoSettings resolvedSettings, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("captureOutput:didFinishProcessingLivePhotoToMovieFileAtURL:duration:photoDisplayTime:resolvedSettings:error:")
    default void captureOutputDidFinishProcessingLivePhotoToMovieFileAtURLDurationPhotoDisplayTimeResolvedSettingsError(
            AVCapturePhotoOutput captureOutput, NSURL outputFileURL, @ByValue CMTime duration,
            @ByValue CMTime photoDisplayTime, AVCaptureResolvedPhotoSettings resolvedSettings, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("captureOutput:didFinishProcessingPhotoSampleBuffer:previewPhotoSampleBuffer:resolvedSettings:bracketSettings:error:")
    default void captureOutputDidFinishProcessingPhotoSampleBufferPreviewPhotoSampleBufferResolvedSettingsBracketSettingsError(
            AVCapturePhotoOutput captureOutput, CMSampleBufferRef photoSampleBuffer,
            CMSampleBufferRef previewPhotoSampleBuffer, AVCaptureResolvedPhotoSettings resolvedSettings,
            AVCaptureBracketedStillImageSettings bracketSettings, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("captureOutput:didFinishProcessingRawPhotoSampleBuffer:previewPhotoSampleBuffer:resolvedSettings:bracketSettings:error:")
    default void captureOutputDidFinishProcessingRawPhotoSampleBufferPreviewPhotoSampleBufferResolvedSettingsBracketSettingsError(
            AVCapturePhotoOutput captureOutput, CMSampleBufferRef rawSampleBuffer,
            CMSampleBufferRef previewPhotoSampleBuffer, AVCaptureResolvedPhotoSettings resolvedSettings,
            AVCaptureBracketedStillImageSettings bracketSettings, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("captureOutput:didFinishRecordingLivePhotoMovieForEventualFileAtURL:resolvedSettings:")
    default void captureOutputDidFinishRecordingLivePhotoMovieForEventualFileAtURLResolvedSettings(
            AVCapturePhotoOutput captureOutput, NSURL outputFileURL, AVCaptureResolvedPhotoSettings resolvedSettings) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("captureOutput:willBeginCaptureForResolvedSettings:")
    default void captureOutputWillBeginCaptureForResolvedSettings(AVCapturePhotoOutput captureOutput,
            AVCaptureResolvedPhotoSettings resolvedSettings) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("captureOutput:willCapturePhotoForResolvedSettings:")
    default void captureOutputWillCapturePhotoForResolvedSettings(AVCapturePhotoOutput captureOutput,
            AVCaptureResolvedPhotoSettings resolvedSettings) {
        throw new java.lang.UnsupportedOperationException();
    }
}
