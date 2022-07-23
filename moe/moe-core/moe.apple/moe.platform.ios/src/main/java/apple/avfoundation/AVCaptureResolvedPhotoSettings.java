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

package apple.avfoundation;

import apple.NSObject;
import apple.coremedia.struct.CMTimeRange;
import apple.coremedia.struct.CMVideoDimensions;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * AVCaptureResolvedPhotoSettings
 * <p>
 * An immutable object produced by callbacks in each and every AVCapturePhotoCaptureDelegate protocol method.
 * <p>
 * When you initiate a photo capture request using -capturePhotoWithSettings:delegate:, some of your settings are not
 * yet certain. For instance, auto flash and auto still image stabilization allow the AVCapturePhotoOutput to decide
 * just in time whether to employ flash or still image stabilization, depending on the current scene. Once the request
 * is issued, AVCapturePhotoOutput begins the capture, resolves the uncertain settings, and in its first callback
 * informs you of its choices through an AVCaptureResolvedPhotoSettings object. This same object is presented to all the
 * callbacks fired for a particular photo capture request. Its uniqueID property matches that of the
 * AVCapturePhotoSettings instance you used to initiate the photo request.
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVCaptureResolvedPhotoSettings extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVCaptureResolvedPhotoSettings(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVCaptureResolvedPhotoSettings alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVCaptureResolvedPhotoSettings allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("instanceMethodForSelector:")
    @FunctionPtr(name = "call_instanceMethodForSelector_ret")
    public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

    @Generated
    @Selector("instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector(SEL aSelector);

    @Generated
    @Selector("instancesRespondToSelector:")
    public static native boolean instancesRespondToSelector(SEL aSelector);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native AVCaptureResolvedPhotoSettings new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("init")
    public native AVCaptureResolvedPhotoSettings init();

    /**
     * [@property] dualCameraFusionEnabled
     * <p>
     * Indicates whether DualCamera wide-angle and telephoto image fusion will be employed when capturing the photo. As
     * of iOS 13, this property is deprecated in favor of virtualDeviceFusionEnabled.
     */
    @Generated
    @Selector("isDualCameraFusionEnabled")
    public native boolean isDualCameraFusionEnabled();

    /**
     * [@property] flashEnabled
     * <p>
     * Indicates whether the flash will fire when capturing the photo.
     * <p>
     * When you specify AVCaptureFlashModeAuto as you AVCapturePhotoSettings.flashMode, you don't know if flash capture
     * will be chosen until you inspect the AVCaptureResolvedPhotoSettings flashEnabled property. If the device becomes
     * too hot, the flash becomes temporarily unavailable. You can key-value observe AVCaptureDevice's flashAvailable
     * property to know when this occurs. If the flash is unavailable due to thermal issues, and you specify a flashMode
     * of AVCaptureFlashModeOn, flashEnabled still resolves to NO until the device has sufficiently cooled off.
     */
    @Generated
    @Selector("isFlashEnabled")
    public native boolean isFlashEnabled();

    /**
     * [@property] stillImageStabilizationEnabled
     * <p>
     * Indicates whether still image stabilization will be employed when capturing the photo.
     * <p>
     * As of iOS 13 hardware, the AVCapturePhotoOutput is capable of applying a variety of multi-image fusion techniques
     * to improve photo quality (reduce noise, preserve detail in low light, freeze motion, etc), all of which have been
     * previously lumped under the stillImageStabilization moniker. This property should no longer be used as it no
     * longer provides meaningful information about the techniques used to improve quality in a photo capture. Instead,
     * you should use -photoQualityPrioritization to indicate your preferred quality vs speed when configuring your
     * AVCapturePhotoSettings. You may query -photoProcessingTimeRange to get an indication of how long the photo will
     * take to process before delivery to your delegate.
     */
    @Generated
    @Selector("isStillImageStabilizationEnabled")
    public native boolean isStillImageStabilizationEnabled();

    /**
     * [@property] livePhotoMovieDimensions
     * <p>
     * The resolved dimensions of the video track in the movie that will be delivered to the
     * -captureOutput:didFinishProcessingLivePhotoToMovieFileAtURL:duration:photoDisplayTime:resolvedSettings:error:
     * callback.
     * <p>
     * If you don't request Live Photo capture, livePhotoMovieDimensions resolve to { 0, 0 }.
     */
    @Generated
    @Selector("livePhotoMovieDimensions")
    @ByValue
    public native CMVideoDimensions livePhotoMovieDimensions();

    /**
     * [@property] photoDimensions
     * <p>
     * The resolved dimensions of the photo buffer that will be delivered to the
     * -captureOutput:didFinishProcessingPhotoSampleBuffer:previewPhotoSampleBuffer:resolvedSettings:bracketSettings:error:
     * callback.
     * <p>
     * If you request a RAW capture with no processed companion image, photoDimensions resolve to { 0, 0 }.
     */
    @Generated
    @Selector("photoDimensions")
    @ByValue
    public native CMVideoDimensions photoDimensions();

    /**
     * [@property] previewDimensions
     * <p>
     * The resolved dimensions of the preview photo buffer that will be delivered to the
     * -captureOutput:didFinishProcessing{Photo | RawPhoto}... AVCapturePhotoCaptureDelegate callbacks.
     * <p>
     * If you don't request a preview image, previewDimensions resolve to { 0, 0 }.
     */
    @Generated
    @Selector("previewDimensions")
    @ByValue
    public native CMVideoDimensions previewDimensions();

    /**
     * [@property] rawPhotoDimensions
     * <p>
     * The resolved dimensions of the RAW photo buffer that will be delivered to the
     * -captureOutput:didFinishProcessingRawPhotoSampleBuffer:previewPhotoSampleBuffer:resolvedSettings:bracketSettings:error:
     * callback.
     * <p>
     * If you request a non-RAW capture, rawPhotoDimensions resolve to { 0, 0 }.
     */
    @Generated
    @Selector("rawPhotoDimensions")
    @ByValue
    public native CMVideoDimensions rawPhotoDimensions();

    /**
     * [@property] uniqueID
     * <p>
     * uniqueID matches that of the AVCapturePhotoSettings instance you passed to -capturePhotoWithSettings:delegate:.
     */
    @Generated
    @Selector("uniqueID")
    public native long uniqueID();

    /**
     * [@property] embeddedThumbnailDimensions
     * <p>
     * The resolved dimensions of the embedded thumbnail that will be written to the processed photo delivered to the
     * -captureOutput:didFinishProcessingPhoto:error: AVCapturePhotoCaptureDelegate callback.
     * <p>
     * If you don't request an embedded thumbnail image, embeddedThumbnailDimensions resolve to { 0, 0 }.
     */
    @Generated
    @Selector("embeddedThumbnailDimensions")
    @ByValue
    public native CMVideoDimensions embeddedThumbnailDimensions();

    /**
     * [@property] expectedPhotoCount
     * <p>
     * Indicates the number of times your -captureOutput:didFinishProcessingPhoto:error: callback will be called. For
     * instance, if you've requested an auto exposure bracket of 3 with JPEG and RAW, the expectedPhotoCount is 6.
     */
    @Generated
    @Selector("expectedPhotoCount")
    @NUInt
    public native long expectedPhotoCount();

    /**
     * dimensionsForSemanticSegmentationMatteOfType:
     * <p>
     * Queries the resolved dimensions of semantic segmentation mattes that will be delivered to the AVCapturePhoto in
     * the -captureOutput:didFinishProcessingPhoto:error: AVCapturePhotoCaptureDelegate callback.
     * <p>
     * If you request semantic segmentation mattes by calling -[AVCapturePhotoSettings
     * setEnabledSemanticSegmentationMatteTypes:] with a non-empty array, the dimensions resolve to the expected
     * dimensions for each of the mattes, assuming they are generated (see -[AVCapturePhotoSettings
     * enabledSemanticSegmentationMatteTypes] for a discussion of why a particular matte might not be delivered). If you
     * don't request any semantic segmentation mattes, the result will always be { 0, 0 }.
     */
    @Generated
    @Selector("dimensionsForSemanticSegmentationMatteOfType:")
    @ByValue
    public native CMVideoDimensions dimensionsForSemanticSegmentationMatteOfType(String semanticSegmentationMatteType);

    /**
     * [@property] redEyeReductionEnabled
     * <p>
     * Indicates whether red-eye reduction will be applied as necessary when capturing the photo if flashEnabled is YES.
     */
    @Generated
    @Selector("isRedEyeReductionEnabled")
    public native boolean isRedEyeReductionEnabled();

    /**
     * [@property] virtualDeviceFusionEnabled
     * <p>
     * Indicates whether fusion of virtual device constituent camera images will be used when capturing the photo, such
     * as the wide-angle and telephoto images on a DualCamera.
     */
    @Generated
    @Selector("isVirtualDeviceFusionEnabled")
    public native boolean isVirtualDeviceFusionEnabled();

    /**
     * [@property] photoProcessingTimeRange
     * <p>
     * Indicates the processing time range you can expect for this photo to be delivered to your delegate. the .start
     * field of the CMTimeRange is zero-based. In other words, if photoProcessingTimeRange.start is equal to .5 seconds,
     * then the minimum processing time for this photo is .5 seconds. The .start field plus the .duration field of the
     * CMTimeRange indicate the max expected processing time for this photo. Consider implementing a UI affordance if
     * the max processing time is uncomfortably long.
     */
    @Generated
    @Selector("photoProcessingTimeRange")
    @ByValue
    public native CMTimeRange photoProcessingTimeRange();

    /**
     * [@property] portraitEffectsMatteDimensions
     * <p>
     * The resolved dimensions of the portrait effects matte that will be delivered to the AVCapturePhoto in the
     * -captureOutput:didFinishProcessingPhoto:error: AVCapturePhotoCaptureDelegate callback.
     * <p>
     * If you request a portrait effects matte by calling -[AVCapturePhotoSettings
     * setPortraitEffectsMatteDeliveryEnabled:YES], portraitEffectsMatteDimensions resolve to the expected dimensions of
     * the portrait effects matte, assuming one is generated (see -[AVCapturePhotoSettings
     * portraitEffectsMatteDeliveryEnabled] for a discussion of why a portrait effects matte might not be delivered). If
     * you don't request a portrait effects matte, portraitEffectsMatteDimensions always resolve to { 0, 0 }.
     */
    @Generated
    @Selector("portraitEffectsMatteDimensions")
    @ByValue
    public native CMVideoDimensions portraitEffectsMatteDimensions();

    /**
     * [@property] rawEmbeddedThumbnailDimensions
     * <p>
     * The resolved dimensions of the embedded thumbnail that will be written to the RAW photo delivered to the
     * -captureOutput:didFinishProcessingPhoto:error: AVCapturePhotoCaptureDelegate callback.
     * <p>
     * If you don't request a raw embedded thumbnail image, rawEmbeddedThumbnailDimensions resolve to { 0, 0 }.
     */
    @Generated
    @Selector("rawEmbeddedThumbnailDimensions")
    @ByValue
    public native CMVideoDimensions rawEmbeddedThumbnailDimensions();

    /**
     * [@property] contentAwareDistortionCorrectionEnabled
     * <p>
     * Indicates whether content aware distortion correction will be employed when capturing the photo.
     */
    @Generated
    @Selector("isContentAwareDistortionCorrectionEnabled")
    public native boolean isContentAwareDistortionCorrectionEnabled();
}
